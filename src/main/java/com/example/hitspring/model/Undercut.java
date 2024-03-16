package com.example.hitspring.model;
/*
 * @author HongAnh
 * @created 16 / 03 / 2024 - 10:30 PM
 * @project HITSpring
 * @social Github: https://github.com/lehonganh0201
 * @social Facebook: https://www.facebook.com/profile.php?id=100047152174225
 */

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Undercut implements HairStyle{
    @PostConstruct
    public void init(){
        System.out.println(getClass().getName());
    }
}
