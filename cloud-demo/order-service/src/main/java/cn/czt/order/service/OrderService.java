package cn.czt.order.service;

import cn.czt.order.mapper.OrderMapper;
import cn.czt.order.pojo.Order;
import cn.czt.order.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;


    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);

        // 4.返回
        return order;
    }
}
