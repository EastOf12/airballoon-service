package ru.practicum.users.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.practicum.users.User;
import ru.practicum.users.UserDto;
import ru.practicum.users.UserMapper;
import ru.practicum.users.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Override
    @Transactional
    public UserDto createUser() {
        log.info("Создаем нового пользователя");
        User user = userRepository.save(UserMapper.mapToUser());
        return UserMapper.mapToUserDto(user);
    }

    @Override
    public List<UserDto> findAllUsers() {
        log.info("Получили запрос на возврат всех пользователей");

        ArrayList<UserDto> userDtos = new ArrayList<>();
        List<User> users = userRepository.findAll();

        for (User user: users) {
            userDtos.add(UserMapper.mapToUserDto(user));
        }

        return userDtos;
    }
}
