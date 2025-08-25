package ru.practicum.users.service;

import ru.practicum.users.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser();
    List<UserDto> findAllUsers();
}
