package com.example.hitspring.model;
/*
 * @author HongAnh
 * @created 16 / 03 / 2024 - 10:31 PM
 * @project HITSpring
 * @social Github: https://github.com/lehonganh0201
 * @social Facebook: https://www.facebook.com/profile.php?id=100047152174225
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person{
    private Outfit outfit;
    private HairStyle hairStyle;

    @Autowired
    public Person(@Qualifier("vest") Outfit outfit,@Qualifier("mohican") HairStyle hairStyle) {
        this.outfit = outfit;
        this.hairStyle = hairStyle;
    }
}
