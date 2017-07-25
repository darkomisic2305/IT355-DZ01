package com.it355.dao;

import java.util.List;

import com.it355.model.Soba;

public interface SobaDao {

	public List<Soba> getSveSobe();
	public Soba getSobaById(int id);
	public Soba addSoba(Soba soba);
	public void editSoba(Soba soba);
	public void deleteSoba(Soba soba);
}
