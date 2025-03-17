package com.ohgiraffers.section03;

import jakarta.persistence.*;

import java.util.List;

@Entity(name="category_and_menu")
@Table(name="tbe_category")
public class Category {

    @Id
    @Column(name="category_code")
    private int categoryCode;

    @Column(name="category_name")
    private String categoryName;

    @Column(name="ref_category_code")
    private Integer refCategoryCode;

    @OneToMany
    @JoinColumn(name="category_code")
    private List<Menu> menuList;

}
