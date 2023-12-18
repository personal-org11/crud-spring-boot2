package com.example.crudspringboot2;

import com.example.crudspringboot2.Employee.Employee;
import com.example.crudspringboot2.Employee.EmployeeRepository;
import com.example.crudspringboot2.Employee.EmployeeServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
public class EmployeeServiceTest {
    @InjectMocks
    EmployeeServiceImpl employeeService;
    @Mock
    EmployeeRepository employeeRepository;

    @Before
    public void setUp() {
        Employee e = new Employee();
        e.setName("test");
        e.setCity("test");
        e.setId(1L);
        e.setEmail("test@test.com");
        Mockito.when(employeeRepository.findAll()).thenReturn(Collections.singletonList(e));
    }

    @Test
    public void getDataTest() {
        assertNotNull(employeeService.getEmployees());
        assertEquals(employeeService.getEmployees().get(0).getName(),"test");
    }

    @Test
    public void codeSnippet()
    {
        String s1="yash";
        String s2="yash";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String s3= new String("yash");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        String s4= new String("yash");
        System.out.println(s4==s3);
        System.out.println(s4.equals(s3));
    }

    @Test
    public void codeSnippet2()
    {
        List<Employee> employeeList = new ArrayList<>();
        List<Employee> employeeList2 = new ArrayList<>();
        Employee e1= new Employee();
        e1.setId(1L);
        Employee e2= new Employee();
        e2.setId(2L);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList2= employeeList.stream().filter(e->e.getId().equals(1L)).collect(Collectors.toList());
        employeeList.stream().forEach(employee -> System.out.println(employee));
       // System.out.println("..."+employeeList2);
    }

    @Test
    public void codeSnippet3() {
        Stream<Integer> numberStream = Stream.of(10,20,30,40,1);
       // numberStream.filter(number -> number>5).forEach(System.out::println);

//        numberStream.filter(number -> number>5)
//                .skip(1)
//                .limit(2)
//                .forEach(System.out::println);

//        Integer n1= numberStream.filter(number -> number>5)
//                .skip(1)
//                .limit(2)
//                .findFirst()
//                .orElse(1);

 //       String str = null;
   //     System.out.println("ABC".equals(str));
//        System.out.println(str.equals("ABC"));
//
        String str = "yash";
        String str1= new String("yash");
        String str2= new String("yash");
        System.out.println(str.equals(str1));
        System.out.println(str1==str2);
        //System.out.println(str1.equals(str2));

        String st = "YASH";
        st = "INDIA";
        System.out.println("Test String " + st);

  //      Optional o;


    }


}
