package com.ajwalker.controller;

import com.ajwalker.dto.response.BaseResponse;
import com.ajwalker.entity.Seat;
import com.ajwalker.service.SeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.ajwalker.constants.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(SEAT)
@CrossOrigin("*")
public class SeatController {

    private final SeatService seatService;





}
