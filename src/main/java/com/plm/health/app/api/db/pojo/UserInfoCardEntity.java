package com.plm.health.app.api.db.pojo;

import lombok.Data;

@Data
public class UserInfoCardEntity {
    private Integer id;
    private Integer userId;
    private String uuid;
    private String name;
    private String sex;
    private String pid;
    private String tel;
    private String birthday;
    private String medicalHistory;
    private String insuranceType;
    private Boolean existFaceModel;
}
