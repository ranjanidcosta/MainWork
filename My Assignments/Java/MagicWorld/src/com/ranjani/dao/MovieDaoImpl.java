package com.ranjani.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.ranjani.bean.Show;
import com.ranjani.exception.MovieException;
import com.ranjani.util.DBUtil;

public class MovieDaoImpl implements MovieDao {

	private String selectAllQuery = "select SHOWID,SHOWNAME,LOCATION,SHOWDATE,AVSEATS,PRICETICKET from showdetails";
	private String selectMovieQuery = "select SHOWNAME,AVSEATS,PRICETICKET from showdetails where SHOWID=?";

	@Override
	public List<Show> getShowDetails() throws MovieException {
		List<Show> showList = null;
		System.out.println("get movie list");
		Connection con = DBUtil.getConnection();
		PreparedStatement pstmt;
		showList = new ArrayList<>();
		try {
			pstmt = con.prepareStatement(selectAllQuery);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Date dob = rs.getDate(4);
				LocalDate ldob = dob.toLocalDate();
				Show show1 = new Show(rs.getString(1), rs.getString(2), rs.getString(3), ldob, rs.getInt(5),
						rs.getDouble(6));
				showList.add(show1);
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return showList;
	}

	@Override
	public Show getShowObject(String showId) throws MovieException {
		Show showOb = null;
		System.out.println("get movie list");
		Connection con = DBUtil.getConnection();
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(selectMovieQuery);
			pstmt.setString(1, showId);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				showOb=new Show();
				showOb.setShowId(showId);
				showOb.setShowName(rs.getString(1));
				showOb.setAvailableSeats(rs.getInt(2));
				showOb.setPriceTicket(rs.getDouble(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return showOb;
	}
}
