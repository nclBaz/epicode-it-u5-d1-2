package riccardogulin.u5d1;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
//@AllArgsConstructor
@ToString
public class Interviewer {
	private IStudent student; // Questa è una DEPENDENCY


	public void askQuestion() {
		log.warn("Hey " + student.getName() + " please solve this challenge!");
		student.answersQuestion();
	}

	public Interviewer(IStudent s) {
		this.student = s;
	}
}
