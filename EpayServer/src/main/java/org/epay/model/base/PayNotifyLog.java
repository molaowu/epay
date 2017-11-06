package org.epay.model.base;

import java.io.Serializable;
import java.util.Date;

public class PayNotifyLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_notify_log.pay_notifty_log_id
     *
     * @mbg.generated
     */
    private String payNotiftyLogId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_notify_log.order_record_id
     *
     * @mbg.generated
     */
    private String orderRecordId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_notify_log.pay_notify_create_time
     *
     * @mbg.generated
     */
    private Date payNotifyCreateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_notify_log.pay_notify_log_body
     *
     * @mbg.generated
     */
    private String payNotifyLogBody;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay_notify_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_notify_log.pay_notifty_log_id
     *
     * @return the value of pay_notify_log.pay_notifty_log_id
     *
     * @mbg.generated
     */
    public String getPayNotiftyLogId() {
        return payNotiftyLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_notify_log.pay_notifty_log_id
     *
     * @param payNotiftyLogId the value for pay_notify_log.pay_notifty_log_id
     *
     * @mbg.generated
     */
    public void setPayNotiftyLogId(String payNotiftyLogId) {
        this.payNotiftyLogId = payNotiftyLogId == null ? null : payNotiftyLogId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_notify_log.order_record_id
     *
     * @return the value of pay_notify_log.order_record_id
     *
     * @mbg.generated
     */
    public String getOrderRecordId() {
        return orderRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_notify_log.order_record_id
     *
     * @param orderRecordId the value for pay_notify_log.order_record_id
     *
     * @mbg.generated
     */
    public void setOrderRecordId(String orderRecordId) {
        this.orderRecordId = orderRecordId == null ? null : orderRecordId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_notify_log.pay_notify_create_time
     *
     * @return the value of pay_notify_log.pay_notify_create_time
     *
     * @mbg.generated
     */
    public Date getPayNotifyCreateTime() {
        return payNotifyCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_notify_log.pay_notify_create_time
     *
     * @param payNotifyCreateTime the value for pay_notify_log.pay_notify_create_time
     *
     * @mbg.generated
     */
    public void setPayNotifyCreateTime(Date payNotifyCreateTime) {
        this.payNotifyCreateTime = payNotifyCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_notify_log.pay_notify_log_body
     *
     * @return the value of pay_notify_log.pay_notify_log_body
     *
     * @mbg.generated
     */
    public String getPayNotifyLogBody() {
        return payNotifyLogBody;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_notify_log.pay_notify_log_body
     *
     * @param payNotifyLogBody the value for pay_notify_log.pay_notify_log_body
     *
     * @mbg.generated
     */
    public void setPayNotifyLogBody(String payNotifyLogBody) {
        this.payNotifyLogBody = payNotifyLogBody == null ? null : payNotifyLogBody.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_notify_log
     *
     * @mbg.generated
     */
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
        PayNotifyLog other = (PayNotifyLog) that;
        return (this.getPayNotiftyLogId() == null ? other.getPayNotiftyLogId() == null : this.getPayNotiftyLogId().equals(other.getPayNotiftyLogId()))
            && (this.getOrderRecordId() == null ? other.getOrderRecordId() == null : this.getOrderRecordId().equals(other.getOrderRecordId()))
            && (this.getPayNotifyCreateTime() == null ? other.getPayNotifyCreateTime() == null : this.getPayNotifyCreateTime().equals(other.getPayNotifyCreateTime()))
            && (this.getPayNotifyLogBody() == null ? other.getPayNotifyLogBody() == null : this.getPayNotifyLogBody().equals(other.getPayNotifyLogBody()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_notify_log
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPayNotiftyLogId() == null) ? 0 : getPayNotiftyLogId().hashCode());
        result = prime * result + ((getOrderRecordId() == null) ? 0 : getOrderRecordId().hashCode());
        result = prime * result + ((getPayNotifyCreateTime() == null) ? 0 : getPayNotifyCreateTime().hashCode());
        result = prime * result + ((getPayNotifyLogBody() == null) ? 0 : getPayNotifyLogBody().hashCode());
        return result;
    }
}