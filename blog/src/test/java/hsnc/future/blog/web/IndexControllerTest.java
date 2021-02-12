package hsnc.future.blog.web;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IndexControllerTest {

    @Autowired 
    private TestRestTemplate restTemplate; 
    
    @DisplayName("Get Index Element")
    @Test
    void get_indexElement(){
        //when
        String body = this.restTemplate.getForObject("/", String.class);
        //then
        assertThat(body).contains("ICT");
    }
    
}
