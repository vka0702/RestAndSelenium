package com.sidenis.qaacademy.restassured.vo.petstore;

import java.util.List;

/**
 * Started by ML on 9/10/2018.
 */
public class Pet {
    private Long id;
    private IdNameEntity category;
    private String name;
    private List<String> photoUrls;
    private List<IdNameEntity> tags;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IdNameEntity getCategory() {
        return category;
    }

    public void setCategory(IdNameEntity category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public List<IdNameEntity> getTags() {
        return tags;
    }

    public void setTags(List<IdNameEntity> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

