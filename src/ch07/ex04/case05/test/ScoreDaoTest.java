package ch07.ex04.case05.test;

import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.dao.ScoreDaoImpl;
import ch07.ex04.case05.domain.Score;

public class ScoreDaoTest {
	public static void main(String[] args) {
		// fixture -> 미리 준비한 단위 test용 하드코딩 데이터.
		Score score1 = new Score(100, 100, 100);
		Score score2 = new Score(10, 10, 10);
		
		Score[] scores = new Score[2];
		ScoreDao scoreDao = new ScoreDaoImpl(scores);
		
		scoreDao.insertScore(score1);
		scoreDao.insertScore(score2);
		
		scores = scoreDao.selectScores();
		for(Score score: scores) System.out.println(score);
	}
}
