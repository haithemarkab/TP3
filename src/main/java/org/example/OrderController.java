package org.example;

public class OrderController {
    private OrderService orderService;
    // Constructeur
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Méthode pour créer une commande à partir du contrôleur
    public boolean createOrder(Order order) {
        return orderService.createOrder(order);
    }
}