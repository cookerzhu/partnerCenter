package com.ssmdemo.service;

import com.ssmdemo.common.Page;

import java.util.List;
import java.util.Map;

/**
 * Created by zhuguangchuan on 2018/5/30.
 */
public interface UserService {
    List<Map<String,Object>> queryList(Page page, Map<String,Object> params);
}
