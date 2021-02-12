package hsnc.future.blog.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(controllers=IndexController.class)
public class IndexControllerTest0 {

    @Autowired
    private MockMvc mvc;

    @DisplayName("Call Index Page")
    @Test
    void call_indexPage() throws Exception{
        mvc.perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(content().string("index"));
    }
}
