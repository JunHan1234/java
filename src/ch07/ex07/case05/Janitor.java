package ch07.ex07.case05;

@FunctionalInterface
public interface Janitor<T> { //Janitor의 generic type 선언.
	void clean(T t);
}
