package riccardogulin.u5d1;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Slf4j
@Component // Oggetti di questa classe verranno gestiti da Spring
public class FullstackStudent implements IStudent {
	private String name;

	@Override
	public void answersQuestion() {
		log.info("I'm the Fullstack Student..This is the answer bla bla bla...");
	}

}
