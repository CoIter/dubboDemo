package com.maxsc.dubbo.demo;

import java.util.List;

/**
 * Created by maxsc on 2017/9/4.
 */
public interface DemoService {
    List<String> getPermission(Long id);
}
