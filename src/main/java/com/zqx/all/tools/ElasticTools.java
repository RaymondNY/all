package com.zqx.all.tools;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class ElasticTools {

    @Resource
    private ElasticsearchClient elasticsearchClient;


}
