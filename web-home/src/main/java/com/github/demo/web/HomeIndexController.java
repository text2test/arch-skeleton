package com.github.demo.web;

import com.github.demo.model.account.TActivity;
import com.github.demo.service.ActivityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by dengyaming on 4/4/16.
 */
@Controller
@RequestMapping("/")
public class HomeIndexController extends HomeBaseController {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    // 本地调用
    @Autowired
    @Qualifier("activityServiceImpl")
    ActivityService activityService;

    @RequestMapping
    public String get(){

        List<TActivity> result;

        // 本地调用
        result = activityService.findAll();
        logger.info("local activityServiceImpl result count=" + result.size());

        // mapper xml 自定义 sql 语句查询
        TActivity queryActivity = new TActivity();
        result = activityService.testGetList(queryActivity);
        logger.info("local activityServiceImpl testGetList result count=" + result.size());

        return "/home/index";
    }

}
