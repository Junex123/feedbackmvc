package feedback.springbootmvc123.repositery;

import org.springframework.data.repository.CrudRepository;

import feedback.springbootmvc123.model.feedback;

public interface feedbackrepos extends CrudRepository<feedback, Integer>{

}
