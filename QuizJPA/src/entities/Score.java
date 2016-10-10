package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Score {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private float value;

	@ManyToOne
	@JoinColumn(name="user_id")
	@JsonBackReference(value="users")
	private Users users;
	
	
	@ManyToOne
	@JoinColumn(name="quiz_id")
	@JsonBackReference
	private Quiz quiz;


	public int getId() {
		return id;
	}


	public float getValue() {
		return value;
	}


	public Users getUsers() {
		return users;
	}


	public Quiz getQuiz() {
		return quiz;
	}


	public void setValue(float value) {
		this.value = value;
	}


	public void setUsers(Users users) {
		this.users = users;
	}


	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}


	@Override
	public String toString() {
		return "Score [id=" + id + ", value=" + value + "]";
	}
	
	
}
