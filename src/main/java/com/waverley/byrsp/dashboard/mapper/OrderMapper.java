package com.waverley.byrsp.dashboard.mapper;

import com.waverley.byrsp.dashboard.model.Order;
import com.waverley.byrsp.dashboard.utils.Constant;
import org.springframework.jdbc.core.RowMapper;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by linhnguyen on 10/14/15.
 */
public class OrderMapper implements RowMapper<Order> {

    public Order mapRow(ResultSet rs, int i) throws SQLException {

        Order order = new Order();
        order.setTradeId(new BigInteger(rs.getString(Constant.ORDER_TRADE_ID)));
        order.setOrderId(new BigInteger(rs.getString(Constant.ORDER_ORDER_ID)));
        order.setRetailerId(new BigInteger(rs.getString(Constant.ORDER_RETAILER_ID)));
        order.setRetailer(rs.getString(Constant.ORDER_RETAILER));
        order.setUrl(rs.getString(Constant.ORDER_URL));
        order.setBuyer(new BigInteger(rs.getString(Constant.ORDER_BUYER)));
        order.setPrice(rs.getInt(Constant.ORDER_PRICE));
        order.setTax(rs.getInt(Constant.ORDER_TAX));
        order.setShippingFee(rs.getInt(Constant.ORDER_SHIPPING_FEE));
        order.setShippingAddress(rs.getString(Constant.ORDER_SHIPPING_ADDRESS));
        order.setCoupon(rs.getString(Constant.ORDER_COUPON));
        order.setStatus(rs.getInt(Constant.ORDER_STATUS));
        order.setCreateTime(rs.getInt(Constant.ORDER_CREATE_TIME));
        order.setLastUpdateTime(rs.getInt(Constant.ORDER_LAST_UPDATE_TIME));
        order.setDoneTime(rs.getInt(Constant.ORDER_DONE_TIME));
        order.setMemo(rs.getString(Constant.ORDER_MEMO));
        order.setLogs(rs.getString(Constant.ORDER_LOGS));
        order.setScreenshot(rs.getString(Constant.ORDER_SCREENSHOT));
        order.setPartnerId(rs.getString(Constant.ORDER_PARTNER_ID));
        order.setEmail(rs.getString(Constant.ORDER_EMAIL));
        order.setTestStatus(rs.getInt(Constant.ORDER_TEST_STATUS));
        order.setErrorMessage(rs.getString(Constant.ORDER_ERROR_MESSAGE));

        return order;
    }
}
