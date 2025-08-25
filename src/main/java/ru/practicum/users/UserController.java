package ru.practicum.users;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.practicum.users.service.UserService;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto create() {
        return userService.createUser();
    } //Создает нового пользователя в БД

    @GetMapping
    public List<UserDto> findAll() {
        return userService.findAllUsers();
    }
}
