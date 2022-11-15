package com.valtech.health.app;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithAnonymousUser;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@EnableAutoConfiguration(exclude = SecurityAutoConfiguration.class)
@AutoConfigureMockMvc
class HealthAppApplicationTests {
	@Autowired
	private MockMvc mvc;

	@Test
	@WithAnonymousUser
	void testIndexWithAnonymous() throws Exception {
		mvc.perform(get("/index")).andExpect(status().isOk());
	}

	@Test
	@WithAnonymousUser
	void testAboutUsWithAnonymous() throws Exception {
		mvc.perform(get("/aboutus")).andExpect(status().isOk());
	}

	@Test
	@WithAnonymousUser
	void testHomeWithAnonymous() throws Exception {
		mvc.perform(get("/home")).andExpect(status().isOk());
	}

	@Test
	@WithAnonymousUser
	void testDoctorHomeWithAnonymous() throws Exception {
		mvc.perform(get("/doctorhome")).andExpect(status().isOk());
	}

	@Test
	@WithAnonymousUser
	void testLoginWithAnonymous() throws Exception {
		mvc.perform(get("/login")).andExpect(status().isOk());
	}

	@Test
	@WithAnonymousUser
	void testDoctorLoginHomeWithAnonymous() throws Exception {
		mvc.perform(get("/doctorlogin")).andExpect(status().isOk());
	}

	@Test
	@WithAnonymousUser
	void testRegisterWithAnonymous() throws Exception {
		mvc.perform(get("/register")).andExpect(status().isOk());
	}

	@Test
	@WithAnonymousUser
	void testDoctorRegisterWithAnonymous() throws Exception {
		mvc.perform(get("/doctorregister")).andExpect(status().isOk());
	}

	@Test
	@WithAnonymousUser
	void testPatientDetailsWithAnonymous() throws Exception {
		mvc.perform(get("/patientdetails")).andExpect(status().isOk());
	}

	@Test
	@WithAnonymousUser
	void testDoctorsWithAnonymous() throws Exception {
		mvc.perform(get("/doctor")).andExpect(status().isOk());
	}

	@Test
	@WithAnonymousUser
	void testListWithAnonymous() throws Exception {
		mvc.perform(get("/list")).andExpect(status().isOk());
	}

	@Test
	@WithAnonymousUser
	void testDoctorListWithAnonymous() throws Exception {
		mvc.perform(get("/doctorlist")).andExpect(status().isOk());
	}

	@Test
	@WithAnonymousUser
	void testDemoWithAnonymous() throws Exception {
		mvc.perform(get("/demo")).andExpect(status().isOk());
	}

	@Test
	@WithAnonymousUser
	void testNewWithAnonymous() throws Exception {
		mvc.perform(get("/new")).andExpect(status().isOk());
	}

	@Test
	@WithAnonymousUser
	void testNewOneWithAnonymous() throws Exception {
		mvc.perform(get("/new1")).andExpect(status().isOk());
	}
}
