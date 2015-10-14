package com.waverley.byrsp.dashboard.mapper;

import com.waverley.byrsp.dashboard.model.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by linhnguyen on 10/12/15.
 */
public class PersonMapper implements RowMapper<Person> {

    public Person mapRow(ResultSet rs, int i) throws SQLException {
        Person person = new Person();
        person.setId(rs.getInt("id"));
        person.setFirstName(rs.getString("firstName"));
        person.setLastName(rs.getString("lastName"));
        person.setSchool(rs.getString("school"));
        person.setRollNumber(rs.getInt("rollNumber"));
        person.setCreatedTime(rs.getInt("create_time"));

        return person;
    }
}
