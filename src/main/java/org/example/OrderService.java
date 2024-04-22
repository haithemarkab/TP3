package org.example;

public class OrderService {
    private OrderDao orderDao;

    // Constructeur
    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    // Méthode pour créer une commande
    public boolean createOrder(Order order) {

        // Enregistrer la commande en utilisant OrderDao
        return orderDao.saveOrder(order);
    }
}