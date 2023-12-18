package com.example.crudspringboot2;

import com.example.crudspringboot2.Employee.EmployeeController;
import com.example.crudspringboot2.Employee.EmployeeService;
import com.example.crudspringboot2.Employee.EmployeeServiceImpl;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.UnsupportedEncodingException;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(SpringExtension.class)
@WebMvcTest(value = EmployeeController.class)
public class EmployeeControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private EmployeeServiceImpl employeeService;

//    @Test
//    public void getApiTest throws Exception {
//        Mockito.when(employeeService.getEmployeeById(any())).thenReturn();
//        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
//                "/api/v1/employees/2").accept(MediaType.APPLICATION_JSON);
//        MvcResult result = null;
//        result = mockMvc.perform(requestBuilder).andReturn();
//        System.out.println(result.getResponse());
//        String expected = "{\"id\":1,\"name\":\"test\",\"email\":\"test@yash.com\",\"city\":\"pune\"}";
//        JSONAssert.assertEquals(expected, result.getResponse()
//                .getContentAsString(), false);
//    }
}
