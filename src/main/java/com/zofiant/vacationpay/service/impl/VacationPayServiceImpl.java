package com.zofiant.vacationpay.service.impl;

import com.zofiant.vacationpay.dto.PayInfoDto;
import com.zofiant.vacationpay.service.VacationPayService;
import org.springframework.stereotype.Component;

@Component
public class VacationPayServiceImpl implements VacationPayService {
    @Override
    public double calculateVacationPay(PayInfoDto payInfoDto) {
        //Отпускные = Среднедневной заработок × Количество дней отпуска
        double vacationPay;
        double vacationDays = payInfoDto.getVacationDays();
        double salary = payInfoDto.getSalary();
        double daysInMonth = 29.3;
        return vacationPay = (salary/daysInMonth) * vacationDays;

    }
}
