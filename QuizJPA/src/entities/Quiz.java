package entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@OneToMany(mappedBy="quiz", fetch=FetchType.EAGER)
	@JsonManagedReference
	private Set<Score> scores;
	
	@OneToMany(mappedBy="quiz", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private Set<Question> questions;

	public Quiz() {}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Set<Score> getScores() {
		return scores;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScores(Set<Score> scores) {
		this.scores = scores;
	}

	public Set<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	
}
