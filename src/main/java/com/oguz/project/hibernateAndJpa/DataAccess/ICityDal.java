package com.oguz.project.hibernateAndJpa.DataAccess;

import java.util.List;

import com.oguz.project.hibernateAndJpa.Entities.*;

public interface ICityDal {

	List<City> getAll();

	void add(City city);

	void update(City city);

	void delete(City city);

	City getById(int id);
}
