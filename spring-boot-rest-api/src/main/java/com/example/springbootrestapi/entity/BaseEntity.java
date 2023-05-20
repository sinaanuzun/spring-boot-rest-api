package com.example.springbootrestapi.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@MappedSuperclass
@Data
public class BaseEntity implements Serializable {
    private Date createDate;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
}
