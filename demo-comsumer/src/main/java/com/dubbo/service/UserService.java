package com.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author ASUS
 */
@Service
public class UserService {

    @Reference
    private TicketService ticketService;

    public void test(){
        String s = ticketService.buyTicket();
        System.out.println(s);
    }
}
