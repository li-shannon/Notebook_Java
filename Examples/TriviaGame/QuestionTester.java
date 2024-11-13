package question;

/**
 * This program provides a tester class for the class Question.
 */
public class QuestionTester {
	public static void main(String[] args) {
		Question q1 = new Question();
		q1.setText("What is the largest animal on the planet?");
		q1.setAnswer("Antarctic Blue Whale");
		q1.present();
		
		ChoiceQuestion q2 = new ChoiceQuestion();
		q2.setText("Which animal on Earth has the male carries the unborn spring?");
		q2.addChoice("Dolphin", false);
		q2.addChoice("Emperor Penguin", false);
		q2.addChoice("Seahorse", true);
		q2.addChoice("Kangroo", false);
		q2.present();
		
		MultiChoiceQuestion q3 = new  MultiChoiceQuestion();
		q3.setText("Which of the following animals are no longer found on Earth? (Select All That Apply)");
		q3.addChoice("Dinosaur", true);
		q3.addChoice("Giant Panda", false);
		q3.addChoice("Trilobite", true);
		q3.addChoice("Mammoth", true);
		q3.addChoice("Northern White Rhino", false);
		q3.present();
	}
}
