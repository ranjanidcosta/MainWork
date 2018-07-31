package com.ranjani.service;

import java.util.List;

import com.ranjani.bean.Show;
import com.ranjani.dao.MovieDao;
import com.ranjani.dao.MovieDaoImpl;
import com.ranjani.exception.MovieException;

public class MovieServiceImpl implements MovieService {
	MovieDao mDao;

	public MovieServiceImpl() {
		mDao = new MovieDaoImpl();
	}

	@Override
	public List<Show> getShowDetails() throws MovieException {
		return mDao.getShowDetails();
	}

	@Override
	public Show getShowObject(String showId) throws MovieException {
		// TODO Auto-generated method stub
		return mDao.getShowObject(showId);
	}
}
