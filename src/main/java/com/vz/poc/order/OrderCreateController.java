package com.vz.poc.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderCreateController {
	
	@Autowired
	private OrderCreateRepository orderRepository; 
	
	@RequestMapping(method=RequestMethod.GET)
	  public List<OrderCreate> getAll() {
	    return orderRepository.findAll();
	 }

	@RequestMapping(method=RequestMethod.POST)
	  public OrderCreate saveOrder() {
	    return orderRepository.save(new OrderCreate("Test is only test.. reffer event code"));
	 }
	
	@RequestMapping(method=RequestMethod.GET, value="/msg")
	  public String getMsg() {
	    return "Test Msg";
	 }
	
}
