package question;

/**
 * This program models a question with multiple correct answer choices.
 */
public class MultiChoiceQuestion extends ChoiceQuestion {
	private String choiceString;
	
	/**
	 * Constructs a question with empty choice and answer
	 */
	public MultiChoiceQuestion() {
		choiceString  = "";
	}
	
	/**
	 * Adds an answer choice to a question and updates the correct answer
	 * @param choice the choice to be added
	 * @param correct true if the added choice is a correct answer, false otherwise
	 */
	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		if(correct) {
			choiceString += choices.size();
		}
		setAnswer(choiceString);
	}
}
