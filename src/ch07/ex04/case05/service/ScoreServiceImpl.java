package ch07.ex04.case05.service;

import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.domain.Score;

public class ScoreServiceImpl implements ScoreService {
	private ScoreDao scoreDao;
	
	public ScoreServiceImpl(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
	
	@Override
	public void addScore(Score score) {
		scoreDao.insertScore(score);
	}
	
	@Override
	public Score[] getScores() {
		//return scoreDao.selectScores();
		Score[] scores = scoreDao.selectScores();
		this.calcScore(scores);
		return scores;
	}
	// 과제: 학생별 합계, 평균 필드를 채워라.
	//실제 업무에서는 아래 또한 Dao에서 한다.
	private void calcScore(Score[] scores) {
		//getter 이용 값을 읽고 setter이용해 합계 평균 구한다.
	}
}
