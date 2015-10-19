package com.waverley.byrsp.dashboard.model;

import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;

import java.math.BigInteger;

/**
 * Created by linhnguyen on 10/12/15.
 */
public class Order extends BeanPropertyItemSqlParameterSourceProvider {

    BigInteger tradeId;
    BigInteger orderId;
    BigInteger retailerId;
    String retailer;
    String url;
    BigInteger buyer;
    int price;
    int tax;
    int shippingFee;
    String shippingAddress;
    String coupon;
    int status;
    int createTime;
    int lastUpdateTime;
    int doneTime;
    String memo;
    String logs;
    String screenshot;
    String partnerId;
    String email;
    int  testStatus;
    String errorMessage;

    public BigInteger getTradeId() {
        return tradeId;
    }

    public void setTradeId(BigInteger tradeId) {
        this.tradeId = tradeId;
    }

    public BigInteger getOrderId() {
        return orderId;
    }

    public void setOrderId(BigInteger orderId) {
        this.orderId = orderId;
    }

    public BigInteger getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(BigInteger retailerId) {
        this.retailerId = retailerId;
    }

    public String getRetailer() {
        return retailer;
    }

    public void setRetailer(String retailer) {
        this.retailer = retailer;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BigInteger getBuyer() {
        return buyer;
    }

    public void setBuyer(BigInteger buyer) {
        this.buyer = buyer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(int shippingFee) {
        this.shippingFee = shippingFee;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public int getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(int lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public int getDoneTime() {
        return doneTime;
    }

    public void setDoneTime(int doneTime) {
        this.doneTime = doneTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getLogs() {
        return logs;
    }

    public void setLogs(String logs) {
        this.logs = logs;
    }

    public String getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(int testStatus) {
        this.testStatus = testStatus;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
