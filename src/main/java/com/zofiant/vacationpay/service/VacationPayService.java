package com.zofiant.vacationpay.service;

import com.zofiant.vacationpay.dto.PayInfoDto;

public interface VacationPayService {
    double calculateVacationPay(PayInfoDto payInfoDto);
}
