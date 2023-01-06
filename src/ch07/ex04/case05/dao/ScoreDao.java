package ch07.ex04.case05.dao;

import ch07.ex04.case05.domain.Score;

public interface ScoreDao {
	void insertScore(Score score); //row 하나를 읽는 method()
	Score[] selectScores(); //n개를 읽는 경우 복수형
}
