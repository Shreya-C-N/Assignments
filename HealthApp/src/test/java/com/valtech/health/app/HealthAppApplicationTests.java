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
import org.springframework.test.web.servlet.ResultHandler;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;





import java.util.stream.Collectors;
import java.util.stream.Stream;



import org.junit.jupiter.api.Test;



import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.boot.autoconfigure.EnableAutoConfiguration;



import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;



import com.valtech.health.app.entity.Doctor;
import com.valtech.health.app.entity.DoctorUser;
import com.valtech.health.app.entity.PatientDetails;
import com.valtech.health.app.entity.User;
import com.valtech.health.app.repostitory.DoctorRepository;
import com.valtech.health.app.repostitory.DoctorUserRepository;
import com.valtech.health.app.repostitory.PatientDetailsRepository;
import com.valtech.health.app.repostitory.UserRepository;
import com.valtech.health.app.service.DoctorServiceImpl;
import com.valtech.health.app.service.DoctorUserServiceImpl;
import com.valtech.health.app.service.PatientDetailsServiceImpl;
import com.valtech.health.app.service.UserServiceImpl;



import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

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

	

//	@Test
//	@WithAnonymousUser
//	void testNewWithAnonymous() throws Exception {
//		String id="5";
//		mvc.perform(get("/dashboard/{id}",id)).andDo(print()).andExpect(content().string("")).andExpect(status().isOk());
//	}
//


	@Test
	@WithAnonymousUser
	void testCommentList() throws Exception {
		mvc.perform(get("/commentlist")).andExpect(status().isOk());
	}
	
	
	@MockBean
    private DoctorRepository doctorRepository;
    
    @Autowired
    private DoctorServiceImpl doctorServiceImpl;
    
    
    @Test
    public void getComments() {    
        
        when(doctorRepository.findAll()).thenReturn(Stream.of(new Doctor("heena","ameena","sick")).collect(Collectors.toList()));
        assertEquals(1, doctorServiceImpl.getAllDoctorComments().size());
    }   



       @Test
        public void savedoctorsComments() {    
            Doctor d = new Doctor("heena","ameena","sick");
            when(doctorRepository.save(d)).thenReturn(d);
            assertEquals(d, doctorServiceImpl.createDoctor(d));
            
        }
       
       
       
       
       //test cases for DoctorUserServiceImpl
    @Autowired
      DoctorUserServiceImpl doctorUserServiceImpl;
       
    @MockBean
       DoctorUserRepository doctorUserRepository;
       



      @Test
       public void savedoctorUser() {    
           DoctorUser d1 = new DoctorUser("heena","123","heena@gmail.com","hina","abc","abc");
           when(doctorUserRepository.save(d1)).thenReturn(d1);
           assertEquals(d1, doctorUserServiceImpl.createDoctorUser(d1));
           
       }
       
       @Test
       public void deleteDoctorUser(){
           DoctorUser d1 = new DoctorUser("heena","123","heena@gmail.com","hina","abc","abc");
           doctorUserServiceImpl.deleteDoctorUser(d1);
           verify(doctorUserRepository,times(1)).delete(d1);
       }
        
        
       // test cases for patientDetaiilsServiceImpl
       
       @Autowired
       PatientDetailsServiceImpl  patientDetailsServiceImpl;
       @MockBean
       private PatientDetailsRepository patientDetailsRepository;
       
       @Test
       public void createPatient(){
           
           PatientDetails p1= new PatientDetails("priya",23,"aaa","o positive","fever","null",95,89,88);
           when(patientDetailsRepository.save(p1)).thenReturn(p1);
           assertEquals(p1, patientDetailsServiceImpl.createPatientDetails(p1));
         
       }
       
       @Test
       public void AllPatientDeatils(){
           when(patientDetailsRepository.findAll()).thenReturn(Stream.of(new PatientDetails("priya",23,"aaa","o positive","fever","null",95,89,88))
                   .collect(Collectors.toList()));
       
       }
       
       // test cases for userServiceImpl
       
       @Autowired
       UserServiceImpl userServiceImpl;
       @MockBean
       UserRepository userRepository;
       
       @Test
       public void createUser(){
           User u= new User("heena","123","heena@gmail.com","hina","abc","abc");
           when(userRepository.save(u)).thenReturn(u);
           assertEquals(u,userServiceImpl.createUser(u));
       }
       
       @Test
       public void deleteUsers(){
           User us = new User("heena","123","heena@gmail.com","hina","abc","abc");
           userServiceImpl.deleteUser(us);
           verify(userRepository,times(1)).delete(us);
           
       }
       
   /*    @Test
       public void findByEmailDoctor() {
       DoctorUser d1 = new DoctorUser("heena", "123", "heena@gmail.com", "hina", "abc", "abc");
       when(doctorUserRepository.save(d1)).thenReturn(d1);    
       
       assertEquals(d1, doctorUserRepository.findByEmail("heena@gmail.com"));
       }*/
//       @Test
//       public void findByEmail(){
//           when(userRepository.findByEmail()).thenReturn(Stream.of(new User("heena","123","heena@gmail.com","hina","abc","abc"))
//                   .collect(Collectors.toList()));    
//       }    
       
       
      
	
}
