package com.project.inventaris.service;

import com.project.inventaris.dto.UserDto;
import com.project.inventaris.entity.User;
import java.util.List;

public interface UserService{
    public UserDto createUser(UserDto user);
    public UserDto myProfile();
    public void updateUser(Long id, UserDto userDto, String emailValidation, String passwordValidation) ;
    public void deleteUser(Long userId);
    List<User> findAllUsers();
    public List<UserDto> searchUsers(String keyword);
}
