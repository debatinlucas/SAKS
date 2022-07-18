package br.com.saks.biblioteca;

import br.com.saks.biblioteca.controller.CategoriaController;
import br.com.saks.biblioteca.model.Categoria;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(locations="classpath:application.yml")
class BibliotecaApplicationTests {

        @Autowired
        private MockMvc mockMvc;

        @Autowired
        private ObjectMapper objectMapper;
        
        @Test
        void contextLoads() {
        }
        
	@Test
        void createCategoria() throws Exception {
            Categoria cat = new Categoria();
            cat.setNome("Teste");
            mockMvc.perform(MockMvcRequestBuilders.post("/categorias")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(cat)))
                .andExpect(status().isOk());
        }
        
	@Test
        void updateCategoria() throws Exception {
            Categoria cat = new Categoria();
            cat.setNome("Teste 1");
            mockMvc.perform(MockMvcRequestBuilders.put("/categorias/{id}", 2)
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(cat)))
                .andExpect(status().isOk());
        }
        
	@Test
        void deleteCategoria() throws Exception {
            mockMvc.perform(MockMvcRequestBuilders.delete("/categorias/{id}", 3))
                .andExpect(status().isOk());
        }
        
	@Test
        void getAllCategoria() throws Exception {
            mockMvc.perform(MockMvcRequestBuilders.get("/categorias")
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
        }
        
        @Test
        void getByIdCategoria() throws Exception {
            mockMvc.perform(MockMvcRequestBuilders.get("/categorias/{id}", 2)
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
        }
}
