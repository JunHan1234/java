package ch08.ex03.case01;

import java.time.LocalDate;
import java.util.Objects;

public record Book(String title, int price, LocalDate printedDate) {
	public Book {
		Objects.requireNonNull(title); //null값 안받으려면 기술.
		Objects.requireNonNull(printedDate);
	}
}
