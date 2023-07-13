package com.zqx.all.api;

import com.zqx.all.tools.ElasticTools;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Test {
    @Resource
    private ElasticTools elasticTools;
}
