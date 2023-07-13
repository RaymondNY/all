package com.zqx.all.tools;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.indices.CreateIndexResponse;
import com.alibaba.fastjson2.JSONObject;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;


@Component
public class ElasticTools {

    @Resource
    private ElasticsearchClient elasticsearchClient;

    public void createIndex(JSONObject jsonObject) throws IOException {
        String index = jsonObject.getString("index");
        CreateIndexResponse response = elasticsearchClient.indices().create(i -> i
                .index(index));
        jsonObject.getString("");
    }
}
