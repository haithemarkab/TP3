package org.example;

public class OrderService {
    private OrderDao orderDao;
    public boolean createOrder(Order order) {
        return orderDao.saveOrder(order);
    }
    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

}