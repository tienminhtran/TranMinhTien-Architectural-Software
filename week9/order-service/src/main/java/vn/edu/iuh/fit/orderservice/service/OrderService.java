package vn.edu.iuh.fit.orderservice.service;


/*
 * @description:
 * @author: Tien Minh Tran
 * @date: 4/21/2025
 */
import vn.edu.iuh.fit.orderservice.model.Order;



public interface OrderService {
  public Order createOrder(Order order);
  public Order getOrderById(Long id);
}