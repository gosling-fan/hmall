package com.jndx.trade.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.jndx.trade.domain.dto.OrderFormDTO;
import com.jndx.trade.domain.po.Order;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 虎哥
 * @since 2023-05-05
 */
public interface IOrderService extends IService<Order> {

    Long createOrder(OrderFormDTO orderFormDTO);

    void markOrderPaySuccess(Long orderId);
}
