package com.rui.jenkins.api.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(User.class)
class UserNameTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void showUserDefault() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/user");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("This is a default name", result.getResponse().getContentAsString());
    }

    @Test
    void showUserNotDefault() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/user?name=rui");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("Hello, rui", result.getResponse().getContentAsString());
    }
}