package feedback.springbootmvc123.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import feedback.springbootmvc123.model.feedback;
import feedback.springbootmvc123.repositery.feedbackrepos;

@Service
public class feedbackservice {
	@Autowired
	feedbackrepos repos;

	public List<feedback> getAllfeedback() {

		List<feedback> feedbacklist = new ArrayList<>();

		repos.findAll().forEach(feedbacks -> feedbacklist.add(feedbacks));

		return feedbacklist;
	}

	public feedback getfeedbackById(int id) {
		return repos.findById(id).get();
	}

	public void saveORUpdate(feedback feedback) {
		repos.save(feedback);
	}

	public void delete(int id) {
		repos.deleteById(id);
	}

	public void update(feedback feedback, int id) {
		repos.save(feedback);
	}
}
