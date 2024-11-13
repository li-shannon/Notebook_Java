package question;
import java.util.Scanner;

/**
 * This program models a question with a text and an answer.
 */
public class Question {
	private String text;
	private String answer;
	
	/**
	 * Constructs a question with empty question and answers
	 */
	public Question() {
		text = "";
		answer = "";
	}
	
	/**
	 * Sets the text of a question
	 * @param text the text of the question
	 */
	public void setText(String questionText) {
		this.text = questionText;
	}
	
	/**
	 * Sets the correct answer of a question
	 * @param correctAnswer the correct answer of the question
	 */
	public void setAnswer(String correctAnswer) {
		this.answer = correctAnswer;
	}
	
	/**
	 * Checks whether a given answer is correct
	 * @param answer the answer being checked
	 * @return true if the given answer matches the correct answer, false otherwise
	 */
	public boolean checkAnswer(String answer) {
		return this.answer.equals(answer);
	}
	
	/**
	 * Display a question
	 */
	public void display() {
		System.out.println(this.text);
	}
	
	public void present() {
		display();
		System.out.print("Your answer: ");
		
		Scanner scan = new Scanner(System.in);
		String userAnswer = scan.nextLine();
		if(checkAnswer(userAnswer)) {
			System.out.println("Congratulations! You got it!\n");
		} else {
			System.out.println("Incorrect! Better luck next time.\n");
		}
	}
}
