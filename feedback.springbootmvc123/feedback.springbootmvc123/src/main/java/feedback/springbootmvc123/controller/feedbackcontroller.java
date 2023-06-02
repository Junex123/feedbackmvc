package feedback.springbootmvc123.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import feedback.springbootmvc123.model.feedback;
import feedback.springbootmvc123.service.feedbackservice;

@RestController
public class feedbackcontroller {
	@Autowired
         feedbackservice service;
	
	
		@GetMapping("/feedback")
		private List<feedback> getAllfeedback(){
			return service.getAllfeedback();
		}
		
		
		@GetMapping("/feedback/{id}")
		private feedback getBooks(@PathVariable("id") int id) {
			return service.getfeedbackById(id);
		}
		
		
		@PostMapping("/feedback")
		private int savefeedback(@RequestBody feedback feedback) {
			service.saveORUpdate(feedback);
			return feedback.getId();
		}

		
		@PutMapping("/feedback")
		private feedback update(@RequestBody feedback feedback) {
			service.saveORUpdate(feedback);
			return feedback;
		}
		
		
		@DeleteMapping("/feedback/{id}")  
		private void deleteBook(@PathVariable("id") int id)   
		{  
		service.delete(id);  
		}  
}
