package aulateste.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = IndexController.class)
public class IndexTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void deveRetornarIndexAoAcessoRoot() throws Exception {
		MvcResult retorno = mockMvc.perform(get("/"))
				.andExpect(status().isOk()).andReturn();
		assertEquals("index",retorno.getResponse().getContentAsString());
	}
	
	@Test
	public void deveRetornarNumeroInteiro() throws Exception {
		MvcResult retorno = mockMvc.perform(post("/converteRomano")
				.param("numeroRomano", "XX"))
				.andExpect(status().isOk()).andReturn();
		assertEquals("20",retorno.getResponse().getContentAsString());
	}
}
