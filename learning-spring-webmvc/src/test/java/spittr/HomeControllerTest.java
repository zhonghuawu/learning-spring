package spittr;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import spittr.web.HomeController;

import static junit.framework.TestCase.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/10/13 23:52
 */
public class HomeControllerTest {
    @Test
    public void testHomePage() {
        HomeController controller = new HomeController();
        assertEquals("home", controller.home());
    }

    @Test
    public void testHomePage2() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/"))
                .andExpect(MockMvcResultMatchers.view().name("home"));
    }

}
