package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String answer_text;
    private boolean is_correct;
	
    public Answer() {}
	
    int getId() {
		return id;
	}
	public String getAnswer_text() {
		return answer_text;
	}
	public boolean is_correct() {
		return is_correct;
	}
	public void setAnswer_text(String answer_text) {
		this.answer_text = answer_text;
	}
	public void setIs_correct(boolean is_correct) {
		this.is_correct = is_correct;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer_text=" + answer_text + ", is_correct=" + is_correct + "]";
	}
    
    
}