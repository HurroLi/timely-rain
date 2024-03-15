package timelyrain.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import timelyrain.server.dto.ProjectMetaInfo;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @GetMapping("/list")
    public Object projectTest(){
        List<ProjectMetaInfo> list = new ArrayList<>();
        ProjectMetaInfo projectMetaInfo = new ProjectMetaInfo();
        list.add(projectMetaInfo);
        projectMetaInfo.setProjectName("甘肃地震捐助");
        projectMetaInfo.setProjectId("202401");
        projectMetaInfo.setStartTime("2024-01-22");
        projectMetaInfo.setStartPerson("Jack Moss");
        projectMetaInfo.setRemark("测试前端列表");
        projectMetaInfo.setEndFlag("0");
        return list;
    }


}
