package com.app.store.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class PriceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void endPoint_get_prices_return_OK() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/prices")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void endPoint_get_prices_search_return_OK() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/prices/search")
                        .param("product","35455")
                        .param("brand", "1")
                        .param("date", "2020-12-31-23:59:59"))
                .andExpect(status().isOk());
    }

    @Test
    void endPoint_return_correct_data() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/prices/search")
                        .param("product","35455")
                        .param("brand", "1")
                        .param("date", "2020-12-31-23:59:59"))
                .andExpect(jsonPath("$.data.product.code").value(35455))
                .andExpect(jsonPath("$.data.brand.id").value(1))
                .andExpect(jsonPath("$.data.priceList").value(4))
                .andExpect(jsonPath("$.data.priority").value(1))
                .andExpect(jsonPath("$.data.startDate").value("2020-06-15-16:00:00"))
                .andExpect(jsonPath("$.data.endDate").value("2020-12-31-23:59:59"))
                .andExpect(jsonPath("$.data.price").value(38.95));
    }

    @Test
    void endPoint_return_without_data() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/prices/search")
                        .param("product","35455")
                        .param("brand", "1")
                        .param("date", "2021-12-31-23:59:59"))
                .andExpect(jsonPath("$.message").value("ELEMENT NOT FOUND"));
    }

    // ----------------------------------------------------------------------------------------------------------------------------
    //Test required

    @Test
    void test_1_return_register_No_1() throws Exception {
        String product = "35455";
        String brand = "1";
        String date = "2020-06-14-10:00:00";
        mockMvc.perform(MockMvcRequestBuilders.get("/prices/search")
                        .param("product",product)
                        .param("brand", brand)
                        .param("date", date))
                .andExpect(jsonPath("$.data.product.code").value(35455))
                .andExpect(jsonPath("$.data.brand.id").value(1))
                .andExpect(jsonPath("$.data.priceList").value(1))
                .andExpect(jsonPath("$.data.priority").value(0))
                .andExpect(jsonPath("$.data.startDate").value("2020-06-14-00:00:00"))
                .andExpect(jsonPath("$.data.endDate").value("2020-12-31-23:59:59"))
                .andExpect(jsonPath("$.data.price").value(35.50));
    }

    @Test
    void test_2_return_register_No_2() throws Exception {
        String product = "35455";
        String brand = "1";
        String date = "2020-06-14-16:00:00";
        mockMvc.perform(MockMvcRequestBuilders.get("/prices/search")
                        .param("product",product)
                        .param("brand", brand)
                        .param("date", date))
                .andExpect(jsonPath("$.data.product.code").value(35455))
                .andExpect(jsonPath("$.data.brand.id").value(1))
                .andExpect(jsonPath("$.data.priceList").value(2))
                .andExpect(jsonPath("$.data.priority").value(1))
                .andExpect(jsonPath("$.data.startDate").value("2020-06-14-15:00:00"))
                .andExpect(jsonPath("$.data.endDate").value("2020-06-14-18:30:00"))
                .andExpect(jsonPath("$.data.price").value(25.45));
    }

    @Test
    void test_3_return_register_No_1() throws Exception {
        String product = "35455";
        String brand = "1";
        String date = "2020-06-14-21:00:00";
        mockMvc.perform(MockMvcRequestBuilders.get("/prices/search")
                        .param("product",product)
                        .param("brand", brand)
                        .param("date", date))
                .andExpect(jsonPath("$.data.product.code").value(35455))
                .andExpect(jsonPath("$.data.brand.id").value(1))
                .andExpect(jsonPath("$.data.priceList").value(1))
                .andExpect(jsonPath("$.data.priority").value(0))
                .andExpect(jsonPath("$.data.startDate").value("2020-06-14-00:00:00"))
                .andExpect(jsonPath("$.data.endDate").value("2020-12-31-23:59:59"))
                .andExpect(jsonPath("$.data.price").value(35.50));
    }

    @Test
    void test_4_return_register_No_3() throws Exception {
        String product = "35455";
        String brand = "1";
        String date = "2020-06-15-10:00:00";
        mockMvc.perform(MockMvcRequestBuilders.get("/prices/search")
                        .param("product",product)
                        .param("brand", brand)
                        .param("date", date))
                .andExpect(jsonPath("$.data.product.code").value(35455))
                .andExpect(jsonPath("$.data.brand.id").value(1))
                .andExpect(jsonPath("$.data.priceList").value(3))
                .andExpect(jsonPath("$.data.priority").value(1))
                .andExpect(jsonPath("$.data.startDate").value("2020-06-15-00:00:00"))
                .andExpect(jsonPath("$.data.endDate").value("2020-06-15-11:00:00"))
                .andExpect(jsonPath("$.data.price").value(30.50));
    }

    @Test
    void test_5_return_register_No_4() throws Exception {
        String product = "35455";
        String brand = "1";
        String date = "2020-06-16-21:00:00";
        mockMvc.perform(MockMvcRequestBuilders.get("/prices/search")
                        .param("product",product)
                        .param("brand", brand)
                        .param("date", date))
                .andExpect(jsonPath("$.data.product.code").value(35455))
                .andExpect(jsonPath("$.data.brand.id").value(1))
                .andExpect(jsonPath("$.data.priceList").value(4))
                .andExpect(jsonPath("$.data.priority").value(1))
                .andExpect(jsonPath("$.data.startDate").value("2020-06-15-16:00:00"))
                .andExpect(jsonPath("$.data.endDate").value("2020-12-31-23:59:59"))
                .andExpect(jsonPath("$.data.price").value(38.95));
    }
}