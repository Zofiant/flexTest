package com.zofiant.vacationpay.contoller;

import com.zofiant.vacationpay.dto.PayInfoDto;
import com.zofiant.vacationpay.service.VacationPayService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VacationPayController {

    VacationPayService vacationPayService;
    public VacationPayController(VacationPayService vacationPayService){
        this.vacationPayService = vacationPayService;
    }


    @GetMapping(path = "/sumVacationPay")
    private double sumVacationPay( PayInfoDto payInfoDto){
        double vacationPay = vacationPayService.calculateVacationPay(payInfoDto);
        return vacationPay;
    }
}
