package com.it355.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it355.dao.SobaDao;
import com.it355.model.Soba;
import com.it355.service.SobaService;

@Service
public class SobaServiceImpl implements SobaService {

	@Autowired
	private SobaDao sobaDao;

	@Override
	public List<Soba> getSveSobe() {
		return sobaDao.getSveSobe();
	}

	@Override
	public Soba getSobaById(int id) {
		return sobaDao.getSobaById(id);
	}

	@Override
	public void addSoba(Soba soba) {
		sobaDao.addSoba(soba);
	}

	@Override
	public void editSoba(Soba soba) {
		sobaDao.editSoba(soba);
	}

	@Override
	public void deleteSoba(Soba soba) {
		sobaDao.deleteSoba(soba);
	}

}
