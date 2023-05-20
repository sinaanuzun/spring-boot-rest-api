package com.example.springbootrestapi.service;

import com.example.springbootrestapi.dto.UserDto;
import com.example.springbootrestapi.entity.User;
import com.example.springbootrestapi.util.CustomPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.List;

public interface UserService {

    UserDto createUser (UserDto user);
    List<UserDto> getUsers();
    UserDto getUser(Long id);
    UserDto updateUser(Long id,UserDto user);
    Boolean deleteUser(Long id);
    Page<User> pagination(int currentPage, int pageSize);
    Page<User> pagination(Pageable pageable);
    Slice<User> slice(Pageable pageable);

    CustomPage<UserDto> customPagination(Pageable pageable);


}