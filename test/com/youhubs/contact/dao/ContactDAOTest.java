package com.youhubs.contact.dao;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.youhubs.contact.model.Contact;

class ContactDAOTest {

	private DriverManagerDataSource dataSource;

	@Test
	void testSave() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
		dataSource.setUsername("root");
		dataSource.setPassword("Tigerhu123");

		ContactDAO dao = new ContactDAOImpl(dataSource);
		Contact contact = new Contact("Bill Gates", "bill@microsoft.com", "Redmon, WA", "1-800-123-4567");
		int result = dao.save(contact);
		assertTrue(result > 0);
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testGet() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testList() {
		fail("Not yet implemented");
	}

}
