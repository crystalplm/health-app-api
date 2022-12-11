package com.plm.health.app.api.db.pojo;

import lombok.Data;

@Data
public class FaceAuthEntity {
    private Integer id;
    private Integer patientCardId;
    private String date;
}