package me.hanseung.controller;

import me.hanseung.service.SampleService;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.system.OutputCaptureRule;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class) // web 과 관련된 annotation들만 등록 가능
class WebMvcControllerTest {

//    @Rule
//    public OutputCaptureRule outputCapture = new OutputCaptureRule();

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private SampleService sampleService;

    @Test
    public void hello() throws Exception {
        when(sampleService.getName()).thenReturn("hanseung");

        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello hanseung"))
                .andDo(print());

//        assertThat(outputCapture.toString())
//                .contains("system log");
    }

}