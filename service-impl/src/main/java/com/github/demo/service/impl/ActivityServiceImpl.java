package com.github.demo.service.impl;

import com.github.demo.mapper.account.TActivityMapper;
import com.github.demo.model.account.TActivity;
import com.github.demo.service.ActivityService;
import com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by dengyaming on 16/4/27.
 */
@Service
public class ActivityServiceImpl extends BaseServiceImpl implements ActivityService {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TActivityMapper activityMapper;

    @Override
    public TActivity find(Integer activityId) {
        //activityMapper.selectByExample();
        return activityMapper.selectByPrimaryKey(activityId);
    }

    @Override
    public List<TActivity> findAll() {
//        List<TActivity> list = new ArrayList<>();
//        Random random = new Random();
//        int max = random.nextInt(100);
//        for (int i=0; i<max; i++) {
//            TActivity activity = new TActivity();
//            activity.setId(i);
//            list.add(activity);
//        }
//        return list;

        List<TActivity> activityList = activityMapper.selectAll();
        return activityList;
    }

    @Override
    public TActivity add(TActivity activity) {
        long start = System.currentTimeMillis();
        logger.info("create 0: {}", activity);
        activity = new TActivity();
        activity.setTitle("Title");
        activity.setChs_code("ChsCode");
        activity.setProvince_id(1);
        activity.setCity_id(1);
        activity.setStatus_id((short)1);
        activity.setAddress("Address");
        activity.setCreate_time(new Date()); //((int)(System.currentTimeMillis()/1000));
        activity.setContact_name("Contact Name");
        activity.setContact_phone("Contact Phone");
        activity.setIf_new(false);
        activity.setIf_recommend(false);
        activity.setIf_top(false);
        activity.setDetail("详细内容");
        activity.setCover_image_id(1);
        activity.setStart_time(new Date());
        activity.setEnd_time(new Date());
        activity.setCreate_user_id(1);
        activity.setTotal_attended(0);
        activity.setTotal_share(0);
        activity.setTotal_sign(0);
        activity.setTotal_view(0);
        activity.setTotal_want(0);

        //activityMapper.insertSelective();

        int id = activityMapper.insert(activity);
        activity.setId(id);
        long end = System.currentTimeMillis() - start;
        logger.info("create 1: {}, {}ms", activity, end);
        return activity;
    }

    @Override
    public TActivity save(TActivity activity) {
        Preconditions.checkNotNull(activity, "activity is NULL");
        activityMapper.updateByPrimaryKey(activity);
        return activity;
    }

    @Override
    public TActivity saveNotNull(TActivity activity) {
        activityMapper.updateByPrimaryKeySelective(activity);
        return activity;
    }

    @Override
    public TActivity remove(Integer activityId) {
        activityMapper.deleteByPrimaryKey(activityId);
        return null;
    }

    @Override
    public TActivity remove(TActivity activity) {
        if (null == activity){
            return activity;
        }
        activityMapper.delete(activity);
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.debug("activityMapper: {}", activityMapper);
    }
}
