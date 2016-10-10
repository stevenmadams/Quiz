package entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Question {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @ManyToOne
	    @JoinColumn(name="quiz_id", referencedColumnName="id")
	    @JsonBackReference
	    private Quiz quiz;

	    private String question_text;

	    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	    @JoinColumn(name="question_id", referencedColumnName="id",  nullable =false)
	    private Set<Answer> answer;

	    public Question() {}
	    
		public int getId() {
			return id;
		}

		public Quiz getQuiz() {
			return quiz;
		}

		public String getQuestion_text() {
			return question_text;
		}

		public Set<Answer> getAnswer() {
			return answer;
		}

		public void setQuiz(Quiz quiz) {
			this.quiz = quiz;
		}

		public void setQuestion_text(String question_text) {
			this.question_text = question_text;
		}

		public void setAnswer(Set<Answer> answer) {
			this.answer = answer;
		}

		@Override
		public String toString() {
			return "Question [id=" + id + ", quiz=" + quiz + ", question_text=" + question_text + "]";
		}
	
		
}
