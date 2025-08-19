package ru.practicum.stats;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/statics")
@RequiredArgsConstructor
public class StaticController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create() {
        System.out.println("Получили запрос на создание события");
    } //Создает событие статистики
}

