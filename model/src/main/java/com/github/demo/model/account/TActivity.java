package com.github.demo.model.account;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import org.msgpack.annotation.MessagePackMessage;

@Table(name = "t_activity")
@MessagePackMessage
public class TActivity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    /**
     * chs_code comment
     */
    private String chs_code;

    /**
     * bar_id comment
     */
    private Integer bar_id;

    private Integer province_id;

    private Integer city_id;

    private Integer district_id;

    private String address;

    private Date start_time;

    private Date end_time;

    private Integer create_user_id;

    private Date create_time;

    private Date update_time;

    private Short status_id;

    private Integer cover_image_id;

    private Integer category_id;

    private Date sign_end_time;

    private String contact_phone;

    private String contact_name;

    private Boolean if_recommend;

    private Boolean if_top;

    private Boolean if_new;

    private Integer total_sign;

    private Integer total_want;

    private Integer total_view;

    private Integer total_share;

    private Integer total_attended;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private Short create_from;

    private String detail;

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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取chs_code comment
     *
     * @return chs_code - chs_code comment
     */
    public String getChs_code() {
        return chs_code;
    }

    /**
     * 设置chs_code comment
     *
     * @param chs_code chs_code comment
     */
    public void setChs_code(String chs_code) {
        this.chs_code = chs_code == null ? null : chs_code.trim();
    }

    /**
     * 获取bar_id comment
     *
     * @return bar_id - bar_id comment
     */
    public Integer getBar_id() {
        return bar_id;
    }

    /**
     * 设置bar_id comment
     *
     * @param bar_id bar_id comment
     */
    public void setBar_id(Integer bar_id) {
        this.bar_id = bar_id;
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
     * @return start_time
     */
    public Date getStart_time() {
        return start_time;
    }

    /**
     * @param start_time
     */
    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    /**
     * @return end_time
     */
    public Date getEnd_time() {
        return end_time;
    }

    /**
     * @param end_time
     */
    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    /**
     * @return create_user_id
     */
    public Integer getCreate_user_id() {
        return create_user_id;
    }

    /**
     * @param create_user_id
     */
    public void setCreate_user_id(Integer create_user_id) {
        this.create_user_id = create_user_id;
    }

    /**
     * @return create_time
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * @param create_time
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
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
     * @return cover_image_id
     */
    public Integer getCover_image_id() {
        return cover_image_id;
    }

    /**
     * @param cover_image_id
     */
    public void setCover_image_id(Integer cover_image_id) {
        this.cover_image_id = cover_image_id;
    }

    /**
     * @return category_id
     */
    public Integer getCategory_id() {
        return category_id;
    }

    /**
     * @param category_id
     */
    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    /**
     * @return sign_end_time
     */
    public Date getSign_end_time() {
        return sign_end_time;
    }

    /**
     * @param sign_end_time
     */
    public void setSign_end_time(Date sign_end_time) {
        this.sign_end_time = sign_end_time;
    }

    /**
     * @return contact_phone
     */
    public String getContact_phone() {
        return contact_phone;
    }

    /**
     * @param contact_phone
     */
    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone == null ? null : contact_phone.trim();
    }

    /**
     * @return contact_name
     */
    public String getContact_name() {
        return contact_name;
    }

    /**
     * @param contact_name
     */
    public void setContact_name(String contact_name) {
        this.contact_name = contact_name == null ? null : contact_name.trim();
    }

    /**
     * @return if_recommend
     */
    public Boolean getIf_recommend() {
        return if_recommend;
    }

    /**
     * @param if_recommend
     */
    public void setIf_recommend(Boolean if_recommend) {
        this.if_recommend = if_recommend;
    }

    /**
     * @return if_top
     */
    public Boolean getIf_top() {
        return if_top;
    }

    /**
     * @param if_top
     */
    public void setIf_top(Boolean if_top) {
        this.if_top = if_top;
    }

    /**
     * @return if_new
     */
    public Boolean getIf_new() {
        return if_new;
    }

    /**
     * @param if_new
     */
    public void setIf_new(Boolean if_new) {
        this.if_new = if_new;
    }

    /**
     * @return total_sign
     */
    public Integer getTotal_sign() {
        return total_sign;
    }

    /**
     * @param total_sign
     */
    public void setTotal_sign(Integer total_sign) {
        this.total_sign = total_sign;
    }

    /**
     * @return total_want
     */
    public Integer getTotal_want() {
        return total_want;
    }

    /**
     * @param total_want
     */
    public void setTotal_want(Integer total_want) {
        this.total_want = total_want;
    }

    /**
     * @return total_view
     */
    public Integer getTotal_view() {
        return total_view;
    }

    /**
     * @param total_view
     */
    public void setTotal_view(Integer total_view) {
        this.total_view = total_view;
    }

    /**
     * @return total_share
     */
    public Integer getTotal_share() {
        return total_share;
    }

    /**
     * @param total_share
     */
    public void setTotal_share(Integer total_share) {
        this.total_share = total_share;
    }

    /**
     * @return total_attended
     */
    public Integer getTotal_attended() {
        return total_attended;
    }

    /**
     * @param total_attended
     */
    public void setTotal_attended(Integer total_attended) {
        this.total_attended = total_attended;
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
     * @return create_from
     */
    public Short getCreate_from() {
        return create_from;
    }

    /**
     * @param create_from
     */
    public void setCreate_from(Short create_from) {
        this.create_from = create_from;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
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
        TActivity other = (TActivity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getChs_code() == null ? other.getChs_code() == null : this.getChs_code().equals(other.getChs_code()))
            && (this.getBar_id() == null ? other.getBar_id() == null : this.getBar_id().equals(other.getBar_id()))
            && (this.getProvince_id() == null ? other.getProvince_id() == null : this.getProvince_id().equals(other.getProvince_id()))
            && (this.getCity_id() == null ? other.getCity_id() == null : this.getCity_id().equals(other.getCity_id()))
            && (this.getDistrict_id() == null ? other.getDistrict_id() == null : this.getDistrict_id().equals(other.getDistrict_id()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getStart_time() == null ? other.getStart_time() == null : this.getStart_time().equals(other.getStart_time()))
            && (this.getEnd_time() == null ? other.getEnd_time() == null : this.getEnd_time().equals(other.getEnd_time()))
            && (this.getCreate_user_id() == null ? other.getCreate_user_id() == null : this.getCreate_user_id().equals(other.getCreate_user_id()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getStatus_id() == null ? other.getStatus_id() == null : this.getStatus_id().equals(other.getStatus_id()))
            && (this.getCover_image_id() == null ? other.getCover_image_id() == null : this.getCover_image_id().equals(other.getCover_image_id()))
            && (this.getCategory_id() == null ? other.getCategory_id() == null : this.getCategory_id().equals(other.getCategory_id()))
            && (this.getSign_end_time() == null ? other.getSign_end_time() == null : this.getSign_end_time().equals(other.getSign_end_time()))
            && (this.getContact_phone() == null ? other.getContact_phone() == null : this.getContact_phone().equals(other.getContact_phone()))
            && (this.getContact_name() == null ? other.getContact_name() == null : this.getContact_name().equals(other.getContact_name()))
            && (this.getIf_recommend() == null ? other.getIf_recommend() == null : this.getIf_recommend().equals(other.getIf_recommend()))
            && (this.getIf_top() == null ? other.getIf_top() == null : this.getIf_top().equals(other.getIf_top()))
            && (this.getIf_new() == null ? other.getIf_new() == null : this.getIf_new().equals(other.getIf_new()))
            && (this.getTotal_sign() == null ? other.getTotal_sign() == null : this.getTotal_sign().equals(other.getTotal_sign()))
            && (this.getTotal_want() == null ? other.getTotal_want() == null : this.getTotal_want().equals(other.getTotal_want()))
            && (this.getTotal_view() == null ? other.getTotal_view() == null : this.getTotal_view().equals(other.getTotal_view()))
            && (this.getTotal_share() == null ? other.getTotal_share() == null : this.getTotal_share().equals(other.getTotal_share()))
            && (this.getTotal_attended() == null ? other.getTotal_attended() == null : this.getTotal_attended().equals(other.getTotal_attended()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getCreate_from() == null ? other.getCreate_from() == null : this.getCreate_from().equals(other.getCreate_from()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getChs_code() == null) ? 0 : getChs_code().hashCode());
        result = prime * result + ((getBar_id() == null) ? 0 : getBar_id().hashCode());
        result = prime * result + ((getProvince_id() == null) ? 0 : getProvince_id().hashCode());
        result = prime * result + ((getCity_id() == null) ? 0 : getCity_id().hashCode());
        result = prime * result + ((getDistrict_id() == null) ? 0 : getDistrict_id().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getStart_time() == null) ? 0 : getStart_time().hashCode());
        result = prime * result + ((getEnd_time() == null) ? 0 : getEnd_time().hashCode());
        result = prime * result + ((getCreate_user_id() == null) ? 0 : getCreate_user_id().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getStatus_id() == null) ? 0 : getStatus_id().hashCode());
        result = prime * result + ((getCover_image_id() == null) ? 0 : getCover_image_id().hashCode());
        result = prime * result + ((getCategory_id() == null) ? 0 : getCategory_id().hashCode());
        result = prime * result + ((getSign_end_time() == null) ? 0 : getSign_end_time().hashCode());
        result = prime * result + ((getContact_phone() == null) ? 0 : getContact_phone().hashCode());
        result = prime * result + ((getContact_name() == null) ? 0 : getContact_name().hashCode());
        result = prime * result + ((getIf_recommend() == null) ? 0 : getIf_recommend().hashCode());
        result = prime * result + ((getIf_top() == null) ? 0 : getIf_top().hashCode());
        result = prime * result + ((getIf_new() == null) ? 0 : getIf_new().hashCode());
        result = prime * result + ((getTotal_sign() == null) ? 0 : getTotal_sign().hashCode());
        result = prime * result + ((getTotal_want() == null) ? 0 : getTotal_want().hashCode());
        result = prime * result + ((getTotal_view() == null) ? 0 : getTotal_view().hashCode());
        result = prime * result + ((getTotal_share() == null) ? 0 : getTotal_share().hashCode());
        result = prime * result + ((getTotal_attended() == null) ? 0 : getTotal_attended().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getCreate_from() == null) ? 0 : getCreate_from().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", chs_code=").append(chs_code);
        sb.append(", bar_id=").append(bar_id);
        sb.append(", province_id=").append(province_id);
        sb.append(", city_id=").append(city_id);
        sb.append(", district_id=").append(district_id);
        sb.append(", address=").append(address);
        sb.append(", start_time=").append(start_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", create_user_id=").append(create_user_id);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", status_id=").append(status_id);
        sb.append(", cover_image_id=").append(cover_image_id);
        sb.append(", category_id=").append(category_id);
        sb.append(", sign_end_time=").append(sign_end_time);
        sb.append(", contact_phone=").append(contact_phone);
        sb.append(", contact_name=").append(contact_name);
        sb.append(", if_recommend=").append(if_recommend);
        sb.append(", if_top=").append(if_top);
        sb.append(", if_new=").append(if_new);
        sb.append(", total_sign=").append(total_sign);
        sb.append(", total_want=").append(total_want);
        sb.append(", total_view=").append(total_view);
        sb.append(", total_share=").append(total_share);
        sb.append(", total_attended=").append(total_attended);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", create_from=").append(create_from);
        sb.append(", detail=").append(detail);
        sb.append("]");
        return sb.toString();
    }
}