package com.zofiant.vacationpay.contoller;

import com.zofiant.vacationpay.dto.PayInfoDto;
import com.zofiant.vacationpay.service.VacationPayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VacationPayController {

    VacationPayService vacationPayService;
    public VacationPayController(VacationPayService vacationPayService){
        this.vacationPayService = vacationPayService;
    }


    @GetMapping(path = "/calculate")
    private double sumVacationPay( PayInfoDto payInfoDto){
        return vacationPayService.calculateVacationPay(payInfoDto);
    }
}
