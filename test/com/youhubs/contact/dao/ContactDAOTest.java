package com.youhubs.contact.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.youhubs.contact.model.Contact;

class ContactDAOTest {
	private DriverManagerDataSource dataSource;
	private ContactDAO dao;

	@BeforeEach
	void setupBeforeEach() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
		dataSource.setUsername("root");
		dataSource.setPassword("Tigerhu123");

		dao = new ContactDAOImpl(dataSource);
	}

	@Test
	void testSave() {
		Contact contact = new Contact("Bill Gates", "bill@microsoft.com", "Redmon, WA", "1-800-123-4567");
		int result = dao.save(contact);
		assertTrue(result > 0);
	}

	@Test
	void testUpdate() {
		Contact contact = new Contact(2, "Bill Gates", "bill.gates@microsoft.com", "Redmon, WA", "1-800-123-4567");
		int result = dao.update(contact);
		assertTrue(result > 0);
	}

	@Test
	void testGet() {
		Integer id = 1;
		Contact contact = dao.get(id);
		if (contact != null) {
			System.out.println(contact);
		}
		assertNotNull(contact);
	}

	@Test
	void testDelete() {
		Integer id = 3;
		int result = dao.delete(id);

		assertTrue(result > 0);
	}

	@Test
	void testList() {
		List<Contact> contacts = dao.list();
		for (Contact c : contacts) {
			System.out.println(c);
		}

		assertTrue(!contacts.isEmpty());
	}

}
