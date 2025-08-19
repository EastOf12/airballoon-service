package ru.practicum.users;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
@RequiredArgsConstructor
public class UserController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public int create() {
        System.out.println("Получили запрос на создание пользователя");
        return 0;
    } //Создает нового пользователя в БД
}
