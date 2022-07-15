package br.com.saks.categoriaservice;

import br.com.saks.categoriaservice.controller.CategoriaController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class CategoriaControllerTest extends CategoriaServiceApplicationTests {
    private MockMvc mockMvc;
	
    @Autowired
    private CategoriaController categoriaController;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(categoriaController).build();
    }
    
    @Test
    public void testPOSTSaveCategoriaController() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.post("/categorias")
            .param("nome", "Livros")
            ).andExpect(MockMvcResultMatchers.redirectedUrl("/categorias"));
    }
    
}
