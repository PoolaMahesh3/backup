package com.ibm.test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.ibm.dao.CustomerDao;
import com.ibm.entity.Customer;
public class TestCustomer {
	private static CustomerDao dao;
	@BeforeAll
	public static void setup() {
		dao = new CustomerDao();
	}
	
	@Test
	public void testsave() {
		Customer c = new Customer(10, "Avanthika", 7000);
		dao.save(c);
	}
	
	@Test
	public void testfetch() {
		Customer c = dao.fetch(7);
		assertNotNull(c);
		System.out.println(c);
	}
	
	@Test
	public void testList() {
		List<Customer>customers=dao.list();
		assertFalse(customers.isEmpty());
		customers.forEach(System.out::println);
	}
	
	@Test
	public void testUpdate() {
		Customer c=new Customer(8,"ho-ho-haa",80000);
		assertTrue(dao.update(c));
	}
	
	@Test
	public void testDelete() {
		assertTrue(dao.delete(8));
	}
}