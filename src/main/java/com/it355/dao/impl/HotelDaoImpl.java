package com.it355.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.it355.dao.HotelDao;
import com.it355.model.Hotel;
import com.it355.model.Soba;

@Repository
@Transactional
public class HotelDaoImpl implements HotelDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Hotel> getSveHotele() {
		return sessionFactory.getCurrentSession().createCriteria(Hotel.class).list();
	}

	@Override
	public Hotel getHotelById(int id) {
		return (Hotel) sessionFactory.getCurrentSession().createCriteria(Hotel.class)
				.add(Restrictions.eq("hotelId", id)).uniqueResult();
	}

	@Override
	public Hotel addHotel(Hotel hotel) {
		return (Hotel)sessionFactory.getCurrentSession().save(hotel);
	}

	@Override
	public void editHotel(Hotel hotel) {
		sessionFactory.getCurrentSession().saveOrUpdate(hotel);
	}

	@Override
	public void deleteHotel(Hotel hotel) {
		sessionFactory.getCurrentSession().delete(hotel);
	}

	@Override
	public List<Soba> getListaSobaPoHotelu(Hotel hotel) {
		return sessionFactory.getCurrentSession().createCriteria(Soba.class).add(Restrictions.eq("hotel", hotel)).list();
	}

}
