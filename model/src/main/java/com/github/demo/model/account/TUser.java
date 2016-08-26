package com.github.demo.model.account;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import org.msgpack.annotation.MessagePackMessage;

@Table(name = "t_user")
@MessagePackMessage
public class TUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String real_name;

    private String nick_name;

    private String mobile;

    private String hash_passwd;

    private String wx_id;

    private String wx_token;

    private String qq_id;

    private String qq_token;

    private String weibo_id;

    private String weibo_token;

    private Integer icon_id;

    private String icon_path;

    private Short gender_id;

    private Date birthdate;

    private Integer province_id;

    private Integer city_id;

    private Integer district_id;

    private Date create_date;

    private Date update_time;

    private Integer total_login;

    private Short vip_level;

    private Integer total_credit;

    private Short status_id;

    private Integer total_unread_msg;

    private String idcard_no;

    private Integer idcard_type_id;

    private Integer idcard_image_id1;

    private Integer idcard_image_id2;

    private Date approve_time;

    private String approve_mark;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private String address;

    private Short sign_from;

    private Integer device_id;

    private Integer last_device_id;

    private Short last_from;

    private Integer total_score;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return real_name
     */
    public String getReal_name() {
        return real_name;
    }

    /**
     * @param real_name
     */
    public void setReal_name(String real_name) {
        this.real_name = real_name == null ? null : real_name.trim();
    }

    /**
     * @return nick_name
     */
    public String getNick_name() {
        return nick_name;
    }

    /**
     * @param nick_name
     */
    public void setNick_name(String nick_name) {
        this.nick_name = nick_name == null ? null : nick_name.trim();
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * @return hash_passwd
     */
    public String getHash_passwd() {
        return hash_passwd;
    }

    /**
     * @param hash_passwd
     */
    public void setHash_passwd(String hash_passwd) {
        this.hash_passwd = hash_passwd == null ? null : hash_passwd.trim();
    }

    /**
     * @return wx_id
     */
    public String getWx_id() {
        return wx_id;
    }

    /**
     * @param wx_id
     */
    public void setWx_id(String wx_id) {
        this.wx_id = wx_id == null ? null : wx_id.trim();
    }

    /**
     * @return wx_token
     */
    public String getWx_token() {
        return wx_token;
    }

    /**
     * @param wx_token
     */
    public void setWx_token(String wx_token) {
        this.wx_token = wx_token == null ? null : wx_token.trim();
    }

    /**
     * @return qq_id
     */
    public String getQq_id() {
        return qq_id;
    }

    /**
     * @param qq_id
     */
    public void setQq_id(String qq_id) {
        this.qq_id = qq_id == null ? null : qq_id.trim();
    }

    /**
     * @return qq_token
     */
    public String getQq_token() {
        return qq_token;
    }

    /**
     * @param qq_token
     */
    public void setQq_token(String qq_token) {
        this.qq_token = qq_token == null ? null : qq_token.trim();
    }

    /**
     * @return weibo_id
     */
    public String getWeibo_id() {
        return weibo_id;
    }

    /**
     * @param weibo_id
     */
    public void setWeibo_id(String weibo_id) {
        this.weibo_id = weibo_id == null ? null : weibo_id.trim();
    }

    /**
     * @return weibo_token
     */
    public String getWeibo_token() {
        return weibo_token;
    }

    /**
     * @param weibo_token
     */
    public void setWeibo_token(String weibo_token) {
        this.weibo_token = weibo_token == null ? null : weibo_token.trim();
    }

    /**
     * @return icon_id
     */
    public Integer getIcon_id() {
        return icon_id;
    }

    /**
     * @param icon_id
     */
    public void setIcon_id(Integer icon_id) {
        this.icon_id = icon_id;
    }

    /**
     * @return icon_path
     */
    public String getIcon_path() {
        return icon_path;
    }

    /**
     * @param icon_path
     */
    public void setIcon_path(String icon_path) {
        this.icon_path = icon_path == null ? null : icon_path.trim();
    }

    /**
     * @return gender_id
     */
    public Short getGender_id() {
        return gender_id;
    }

    /**
     * @param gender_id
     */
    public void setGender_id(Short gender_id) {
        this.gender_id = gender_id;
    }

    /**
     * @return birthdate
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return province_id
     */
    public Integer getProvince_id() {
        return province_id;
    }

    /**
     * @param province_id
     */
    public void setProvince_id(Integer province_id) {
        this.province_id = province_id;
    }

    /**
     * @return city_id
     */
    public Integer getCity_id() {
        return city_id;
    }

    /**
     * @param city_id
     */
    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    /**
     * @return district_id
     */
    public Integer getDistrict_id() {
        return district_id;
    }

    /**
     * @param district_id
     */
    public void setDistrict_id(Integer district_id) {
        this.district_id = district_id;
    }

    /**
     * @return create_date
     */
    public Date getCreate_date() {
        return create_date;
    }

    /**
     * @param create_date
     */
    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    /**
     * @return update_time
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     * @param update_time
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * @return total_login
     */
    public Integer getTotal_login() {
        return total_login;
    }

    /**
     * @param total_login
     */
    public void setTotal_login(Integer total_login) {
        this.total_login = total_login;
    }

    /**
     * @return vip_level
     */
    public Short getVip_level() {
        return vip_level;
    }

    /**
     * @param vip_level
     */
    public void setVip_level(Short vip_level) {
        this.vip_level = vip_level;
    }

    /**
     * @return total_credit
     */
    public Integer getTotal_credit() {
        return total_credit;
    }

    /**
     * @param total_credit
     */
    public void setTotal_credit(Integer total_credit) {
        this.total_credit = total_credit;
    }

    /**
     * @return status_id
     */
    public Short getStatus_id() {
        return status_id;
    }

    /**
     * @param status_id
     */
    public void setStatus_id(Short status_id) {
        this.status_id = status_id;
    }

    /**
     * @return total_unread_msg
     */
    public Integer getTotal_unread_msg() {
        return total_unread_msg;
    }

    /**
     * @param total_unread_msg
     */
    public void setTotal_unread_msg(Integer total_unread_msg) {
        this.total_unread_msg = total_unread_msg;
    }

    /**
     * @return idcard_no
     */
    public String getIdcard_no() {
        return idcard_no;
    }

    /**
     * @param idcard_no
     */
    public void setIdcard_no(String idcard_no) {
        this.idcard_no = idcard_no == null ? null : idcard_no.trim();
    }

    /**
     * @return idcard_type_id
     */
    public Integer getIdcard_type_id() {
        return idcard_type_id;
    }

    /**
     * @param idcard_type_id
     */
    public void setIdcard_type_id(Integer idcard_type_id) {
        this.idcard_type_id = idcard_type_id;
    }

    /**
     * @return idcard_image_id1
     */
    public Integer getIdcard_image_id1() {
        return idcard_image_id1;
    }

    /**
     * @param idcard_image_id1
     */
    public void setIdcard_image_id1(Integer idcard_image_id1) {
        this.idcard_image_id1 = idcard_image_id1;
    }

    /**
     * @return idcard_image_id2
     */
    public Integer getIdcard_image_id2() {
        return idcard_image_id2;
    }

    /**
     * @param idcard_image_id2
     */
    public void setIdcard_image_id2(Integer idcard_image_id2) {
        this.idcard_image_id2 = idcard_image_id2;
    }

    /**
     * @return approve_time
     */
    public Date getApprove_time() {
        return approve_time;
    }

    /**
     * @param approve_time
     */
    public void setApprove_time(Date approve_time) {
        this.approve_time = approve_time;
    }

    /**
     * @return approve_mark
     */
    public String getApprove_mark() {
        return approve_mark;
    }

    /**
     * @param approve_mark
     */
    public void setApprove_mark(String approve_mark) {
        this.approve_mark = approve_mark == null ? null : approve_mark.trim();
    }

    /**
     * @return latitude
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * @param latitude
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * @return longitude
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * @param longitude
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * @return sign_from
     */
    public Short getSign_from() {
        return sign_from;
    }

    /**
     * @param sign_from
     */
    public void setSign_from(Short sign_from) {
        this.sign_from = sign_from;
    }

    /**
     * @return device_id
     */
    public Integer getDevice_id() {
        return device_id;
    }

    /**
     * @param device_id
     */
    public void setDevice_id(Integer device_id) {
        this.device_id = device_id;
    }

    /**
     * @return last_device_id
     */
    public Integer getLast_device_id() {
        return last_device_id;
    }

    /**
     * @param last_device_id
     */
    public void setLast_device_id(Integer last_device_id) {
        this.last_device_id = last_device_id;
    }

    /**
     * @return last_from
     */
    public Short getLast_from() {
        return last_from;
    }

    /**
     * @param last_from
     */
    public void setLast_from(Short last_from) {
        this.last_from = last_from;
    }

    /**
     * @return total_score
     */
    public Integer getTotal_score() {
        return total_score;
    }

    /**
     * @param total_score
     */
    public void setTotal_score(Integer total_score) {
        this.total_score = total_score;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TUser other = (TUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReal_name() == null ? other.getReal_name() == null : this.getReal_name().equals(other.getReal_name()))
            && (this.getNick_name() == null ? other.getNick_name() == null : this.getNick_name().equals(other.getNick_name()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getHash_passwd() == null ? other.getHash_passwd() == null : this.getHash_passwd().equals(other.getHash_passwd()))
            && (this.getWx_id() == null ? other.getWx_id() == null : this.getWx_id().equals(other.getWx_id()))
            && (this.getWx_token() == null ? other.getWx_token() == null : this.getWx_token().equals(other.getWx_token()))
            && (this.getQq_id() == null ? other.getQq_id() == null : this.getQq_id().equals(other.getQq_id()))
            && (this.getQq_token() == null ? other.getQq_token() == null : this.getQq_token().equals(other.getQq_token()))
            && (this.getWeibo_id() == null ? other.getWeibo_id() == null : this.getWeibo_id().equals(other.getWeibo_id()))
            && (this.getWeibo_token() == null ? other.getWeibo_token() == null : this.getWeibo_token().equals(other.getWeibo_token()))
            && (this.getIcon_id() == null ? other.getIcon_id() == null : this.getIcon_id().equals(other.getIcon_id()))
            && (this.getIcon_path() == null ? other.getIcon_path() == null : this.getIcon_path().equals(other.getIcon_path()))
            && (this.getGender_id() == null ? other.getGender_id() == null : this.getGender_id().equals(other.getGender_id()))
            && (this.getBirthdate() == null ? other.getBirthdate() == null : this.getBirthdate().equals(other.getBirthdate()))
            && (this.getProvince_id() == null ? other.getProvince_id() == null : this.getProvince_id().equals(other.getProvince_id()))
            && (this.getCity_id() == null ? other.getCity_id() == null : this.getCity_id().equals(other.getCity_id()))
            && (this.getDistrict_id() == null ? other.getDistrict_id() == null : this.getDistrict_id().equals(other.getDistrict_id()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getTotal_login() == null ? other.getTotal_login() == null : this.getTotal_login().equals(other.getTotal_login()))
            && (this.getVip_level() == null ? other.getVip_level() == null : this.getVip_level().equals(other.getVip_level()))
            && (this.getTotal_credit() == null ? other.getTotal_credit() == null : this.getTotal_credit().equals(other.getTotal_credit()))
            && (this.getStatus_id() == null ? other.getStatus_id() == null : this.getStatus_id().equals(other.getStatus_id()))
            && (this.getTotal_unread_msg() == null ? other.getTotal_unread_msg() == null : this.getTotal_unread_msg().equals(other.getTotal_unread_msg()))
            && (this.getIdcard_no() == null ? other.getIdcard_no() == null : this.getIdcard_no().equals(other.getIdcard_no()))
            && (this.getIdcard_type_id() == null ? other.getIdcard_type_id() == null : this.getIdcard_type_id().equals(other.getIdcard_type_id()))
            && (this.getIdcard_image_id1() == null ? other.getIdcard_image_id1() == null : this.getIdcard_image_id1().equals(other.getIdcard_image_id1()))
            && (this.getIdcard_image_id2() == null ? other.getIdcard_image_id2() == null : this.getIdcard_image_id2().equals(other.getIdcard_image_id2()))
            && (this.getApprove_time() == null ? other.getApprove_time() == null : this.getApprove_time().equals(other.getApprove_time()))
            && (this.getApprove_mark() == null ? other.getApprove_mark() == null : this.getApprove_mark().equals(other.getApprove_mark()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getSign_from() == null ? other.getSign_from() == null : this.getSign_from().equals(other.getSign_from()))
            && (this.getDevice_id() == null ? other.getDevice_id() == null : this.getDevice_id().equals(other.getDevice_id()))
            && (this.getLast_device_id() == null ? other.getLast_device_id() == null : this.getLast_device_id().equals(other.getLast_device_id()))
            && (this.getLast_from() == null ? other.getLast_from() == null : this.getLast_from().equals(other.getLast_from()))
            && (this.getTotal_score() == null ? other.getTotal_score() == null : this.getTotal_score().equals(other.getTotal_score()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReal_name() == null) ? 0 : getReal_name().hashCode());
        result = prime * result + ((getNick_name() == null) ? 0 : getNick_name().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getHash_passwd() == null) ? 0 : getHash_passwd().hashCode());
        result = prime * result + ((getWx_id() == null) ? 0 : getWx_id().hashCode());
        result = prime * result + ((getWx_token() == null) ? 0 : getWx_token().hashCode());
        result = prime * result + ((getQq_id() == null) ? 0 : getQq_id().hashCode());
        result = prime * result + ((getQq_token() == null) ? 0 : getQq_token().hashCode());
        result = prime * result + ((getWeibo_id() == null) ? 0 : getWeibo_id().hashCode());
        result = prime * result + ((getWeibo_token() == null) ? 0 : getWeibo_token().hashCode());
        result = prime * result + ((getIcon_id() == null) ? 0 : getIcon_id().hashCode());
        result = prime * result + ((getIcon_path() == null) ? 0 : getIcon_path().hashCode());
        result = prime * result + ((getGender_id() == null) ? 0 : getGender_id().hashCode());
        result = prime * result + ((getBirthdate() == null) ? 0 : getBirthdate().hashCode());
        result = prime * result + ((getProvince_id() == null) ? 0 : getProvince_id().hashCode());
        result = prime * result + ((getCity_id() == null) ? 0 : getCity_id().hashCode());
        result = prime * result + ((getDistrict_id() == null) ? 0 : getDistrict_id().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getTotal_login() == null) ? 0 : getTotal_login().hashCode());
        result = prime * result + ((getVip_level() == null) ? 0 : getVip_level().hashCode());
        result = prime * result + ((getTotal_credit() == null) ? 0 : getTotal_credit().hashCode());
        result = prime * result + ((getStatus_id() == null) ? 0 : getStatus_id().hashCode());
        result = prime * result + ((getTotal_unread_msg() == null) ? 0 : getTotal_unread_msg().hashCode());
        result = prime * result + ((getIdcard_no() == null) ? 0 : getIdcard_no().hashCode());
        result = prime * result + ((getIdcard_type_id() == null) ? 0 : getIdcard_type_id().hashCode());
        result = prime * result + ((getIdcard_image_id1() == null) ? 0 : getIdcard_image_id1().hashCode());
        result = prime * result + ((getIdcard_image_id2() == null) ? 0 : getIdcard_image_id2().hashCode());
        result = prime * result + ((getApprove_time() == null) ? 0 : getApprove_time().hashCode());
        result = prime * result + ((getApprove_mark() == null) ? 0 : getApprove_mark().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getSign_from() == null) ? 0 : getSign_from().hashCode());
        result = prime * result + ((getDevice_id() == null) ? 0 : getDevice_id().hashCode());
        result = prime * result + ((getLast_device_id() == null) ? 0 : getLast_device_id().hashCode());
        result = prime * result + ((getLast_from() == null) ? 0 : getLast_from().hashCode());
        result = prime * result + ((getTotal_score() == null) ? 0 : getTotal_score().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", real_name=").append(real_name);
        sb.append(", nick_name=").append(nick_name);
        sb.append(", mobile=").append(mobile);
        sb.append(", hash_passwd=").append(hash_passwd);
        sb.append(", wx_id=").append(wx_id);
        sb.append(", wx_token=").append(wx_token);
        sb.append(", qq_id=").append(qq_id);
        sb.append(", qq_token=").append(qq_token);
        sb.append(", weibo_id=").append(weibo_id);
        sb.append(", weibo_token=").append(weibo_token);
        sb.append(", icon_id=").append(icon_id);
        sb.append(", icon_path=").append(icon_path);
        sb.append(", gender_id=").append(gender_id);
        sb.append(", birthdate=").append(birthdate);
        sb.append(", province_id=").append(province_id);
        sb.append(", city_id=").append(city_id);
        sb.append(", district_id=").append(district_id);
        sb.append(", create_date=").append(create_date);
        sb.append(", update_time=").append(update_time);
        sb.append(", total_login=").append(total_login);
        sb.append(", vip_level=").append(vip_level);
        sb.append(", total_credit=").append(total_credit);
        sb.append(", status_id=").append(status_id);
        sb.append(", total_unread_msg=").append(total_unread_msg);
        sb.append(", idcard_no=").append(idcard_no);
        sb.append(", idcard_type_id=").append(idcard_type_id);
        sb.append(", idcard_image_id1=").append(idcard_image_id1);
        sb.append(", idcard_image_id2=").append(idcard_image_id2);
        sb.append(", approve_time=").append(approve_time);
        sb.append(", approve_mark=").append(approve_mark);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", address=").append(address);
        sb.append(", sign_from=").append(sign_from);
        sb.append(", device_id=").append(device_id);
        sb.append(", last_device_id=").append(last_device_id);
        sb.append(", last_from=").append(last_from);
        sb.append(", total_score=").append(total_score);
        sb.append("]");
        return sb.toString();
    }
}