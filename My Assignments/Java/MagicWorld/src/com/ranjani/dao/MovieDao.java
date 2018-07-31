package com.ranjani.dao;

import java.util.List;

import com.ranjani.bean.Show;
import com.ranjani.exception.MovieException;

public interface MovieDao {

	List<Show> getShowDetails() throws MovieException;

	Show getShowObject(String showId) throws MovieException;

}
