package com.plm.health.app.api.db.pojo;

import lombok.Data;

@Data
public class DoctorWorkPlanScheduleEntity{
    private Integer id;
    private Integer workPlanId;
    private Byte slot;
    private Short maximum;
    private Short num;

}