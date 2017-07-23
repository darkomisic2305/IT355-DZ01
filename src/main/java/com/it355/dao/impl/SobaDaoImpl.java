package com.it355.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.it355.dao.SobaDao;
import com.it355.model.Soba;

@Repository
@Transactional
public class SobaDaoImpl implements SobaDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Soba> getSveSobe() {
		List<Soba> sveSobe = sessionFactory.getCurrentSession().createCriteria(Soba.class).list();

		return sveSobe;
	}

	@Override
	public Soba getSobaById(int id) {
		Soba soba = (Soba) sessionFactory.getCurrentSession().createCriteria(Soba.class)
				.add(Restrictions.eq("sobaId", id)).uniqueResult();

		return soba;
	}

	@Override
	public void addSoba(Soba soba) {
		sessionFactory.getCurrentSession().save(soba);
	}

	@Override
	public void editSoba(Soba soba) {
		sessionFactory.getCurrentSession().saveOrUpdate(soba);
	}

	@Override
	public void deleteSoba(Soba soba) {
		sessionFactory.getCurrentSession().delete(soba);
	}

}
