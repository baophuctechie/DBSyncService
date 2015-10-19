package com.waverley.byrsp.dashboard.utils;

import com.waverley.byrsp.dashboard.model.Order;
import org.springframework.batch.item.ItemProcessor;

import java.text.ParseException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * Created by linhnguyen on 10/14/15.
 */
public class OrderItemProcessor implements ItemProcessor<Order, Order> {

    private String margin;

    public Order process(Order order) throws Exception {
/*
        ZonedDateTime createdTime = convertUnixToDate(order.getCreateTime());
        ZonedDateTime startTimeToImport = Instant.now().atZone(
                ZoneId.systemDefault()).minusSeconds(Long.parseLong(margin));

        if (createdTime.isAfter(startTimeToImport)) {
            return order;
        }*/

        return order;
    }

    /**
     * Convert the unix timestamp value to readable date format
     * @param unixTimestamp the unix timestamp
     * @return the date format
     * @throws ParseException the exception
     */
    protected ZonedDateTime convertUnixToDate(int unixTimestamp) throws ParseException {
        Long timestamp = Long.parseLong(String.valueOf(unixTimestamp));
        ZonedDateTime ret = (Date.from(Instant.ofEpochSecond(timestamp)))
                .toInstant().atZone(ZoneId.systemDefault());

        return ret;
    }

    public String getMargin() {
        return margin;
    }

    public void setMargin(String margin) {
        this.margin = margin;
    }
}
