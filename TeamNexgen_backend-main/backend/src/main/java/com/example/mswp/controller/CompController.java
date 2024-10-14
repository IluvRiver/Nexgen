package com.example.mswp.controller;

import com.example.mswp.dto.CompDto;
import com.example.mswp.entity.Comp;
import com.example.mswp.service.CompService;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CompController {

    @Autowired
    private CompService compService;

    private Logger logger = LoggerFactory.getLogger(UserController.class);


    @PostMapping("/login")
    public Optional<Comp> login(@RequestBody CompDto compDto) { return compService.login(userDto); }

    @PostMapping("/register/validation")
    public Map<String, Integer> idValidation(@RequestBody CompDto compDto) {
        return compService.idValidation(userDto);
    }

    @PostMapping("/my-page")
    public Optional<Comp> myPage(@RequestBody CompDto compDto) {
        return compService.myPage(userDto);
    }

    @PostMapping("/around")
    public Map<Object, Object> aroundUser(@RequestBody CompDto compDto) {
        return compService.around(userDto);
    }

    @PostMapping ("/register")
    public Map register(HttpServletRequest request, @RequestBody CompDto compDto) {
        Map<String, Object> map = new HashMap<>();

        String result = compService.register(compDto);
        map.put("sc",result);

        return map;
    }

    @PostMapping("/upload")
    public Map uploadImage(@RequestParam("id") String id, @RequestParam(value = "file", required = false) MultipartFile file) throws IOException {
        return userService.uploadImage(id, file);
    }

}


