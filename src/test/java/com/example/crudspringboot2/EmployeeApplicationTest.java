package com.example.crudspringboot2;

import com.example.crudspringboot2.Employee.Employee;
import com.example.crudspringboot2.Employee.EmployeeRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.sql.Timestamp;
import java.text.DateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmployeeApplicationTest {
    @Autowired
    EmployeeRepository employeeRepository;
    @Test
    @Order(1)
    public void testCreate () {
        Employee e = new Employee();
        e.setId(1L);
        e.setName("name");
        e.setCity("city");
        e.setEmail("test@test.com");
        employeeRepository.save(e);
        assertNotNull(employeeRepository.findById(1L).get());
    }
    @Test
    @Order(2)
    public void testReadAll () {
        List list = employeeRepository.findAll();
        assertThat(list).size().isGreaterThan(0);
    }

    @Test
    public void checkTimeZone() {
 //       Timestamp timestamp = new Timestamp(new Date().getTime());
//        Timestamp timestamp1 = new Timestamp(Instant.now().toEpochMilli());
//        Instant now = Instant.now();
//        Timestamp current = Timestamp.from(now);
//        System.out.println("timestamp..." + timestamp);
//        System.out.println("timestamp2..." + timestamp1);
//        System.out.println("timestamp3..." + getTimeStamp());
//
//        DateFormat df = DateFormat.getDateTimeInstance();
//        df.setTimeZone(TimeZone.getTimeZone("UTC"));
//        System.out.println("Timestamp in UTC: " + df.format(current));
//        System.out.println("timestamp..." + timestamp);
        ZonedDateTime ztd =ZonedDateTime.now(ZoneId.of("Etc/UTC"));
        Timestamp timestamp2 = Timestamp.valueOf(ztd.toLocalDateTime());
        System.out.println("timestamp4..." + timestamp2);
        ZonedDateTime ztd1 =ZonedDateTime.now(ZoneId.of("UTC"));
        Timestamp timestamp3 = Timestamp.valueOf(ztd1.toLocalDateTime());
        System.out.println("timestamp4..." + timestamp3);

    }
//    public static java.sql.Date getCurruntDate()
//    {
//        return new java.sql.Date(new Date().getTime());
//    }
//
//
//    ZoneId zoneId = ZoneId.of( "Etc/UTC" );
//    ZonedDateTime zdt = ZonedDateTime.from(ZonedDateTime.ofInstant( Instant.now() , zoneId ).toLocalDate());
//

  //Instant.now()

    public static Timestamp getTimeStamp() {
        Calendar calendar = Calendar.getInstance();
        java.util.Date now = calendar.getTime();
        Timestamp dbStamp = new Timestamp(now.getTime());
        return dbStamp;
    }
}
