package com.app.group15.QuestionManager;

import com.app.group15.persistence.IDao;
import com.app.group15.persistence.Persistence;

import java.util.List;

public abstract class QuestionChoiceMapperAbstractDao implements IDao {

	@Override
	public Persistence get(int id) {
		return null;
	}

	@Override
	public List getAll() {
		return null;
	}

	@Override
	public int save(Persistence persistence) {
		return 0;
	}

	@Override
	public void update(Persistence persistence, int id) {

	}

	@Override
	public void delete(int id) {

	}

	public abstract void deleteByQuestionId(int questionId);
}
