package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.pojo.Cart;
import com.ecommerce.pojo.Order;
import com.ecommerce.pojo.User;

public interface OrderDao
{
	public boolean addOrder(Order order);
    public List<Order> getOrderByUserId(int userId);
    public List<Order> getAllOrder();
    public int totalOrderPrice(int userId);
    boolean addDeliveryDate(int orderId,int userId,int productId,String deliveyrDate);
    int totalOrdersCount();
}
