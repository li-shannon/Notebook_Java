package question;
import java.util.ArrayList;

/**
 * This program models a question with multiple choices. 
 */
public class ChoiceQuestion extends Question {
	protected ArrayList<String> choices;
	
	/**
	 * Constructs a question with no choice
	 */
	public ChoiceQuestion() {
		choices = new ArrayList<String>();
	}
	
	/**
	 * Adds an answer choice to a question and sets the correct answer accordingly
	 * @param choice the choice to be added
	 * @param correct true if the choice to be added is the correct answer, false otherwise
	 */
	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		if(correct) {
			String choiceString = "" + choices.size();
			setAnswer(choiceString);
		}
	}
	
	/**
	 * Displays a question and its answer choices
	 */
	public void display() {
		super.display();
		for(int i = 0; i < choices.size(); i++) {
			int choiceNumber = i + 1;
			System.out.println(choiceNumber + ". " + choices.get(i));
		}
	}
}
