package com.dubbo.service;


import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author ASUS
 */
@Component
@Service
public class TicketServiceImpl implements TicketService{

    @Override
    public String buyTicket() {
        return "but a ticket";
    }
}
