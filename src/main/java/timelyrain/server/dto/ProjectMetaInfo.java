package timelyrain.server.dto;

import lombok.Data;

@Data
public class ProjectMetaInfo {

    private String projectName;//项目名称

    private String projectId;//项目id

    private String startPerson;//发起人

    private String startTime;//发起时间

    private String endFlag;//项目结束标识

    private String remark;//项目备注

    private String introduce;//项目介绍

    private ProjectFieldInfo fieldInfo;//字段信息

}
