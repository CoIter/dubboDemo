package com.maxsc.dubbo.demo.impl;

import com.maxsc.dubbo.demo.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maxsc on 2017/9/4.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> getPermission(Long id) {
        List<String> demo = new ArrayList<> (  );
        demo.add ( String.format ( "Permission_%d", id - 1 ) );
        demo.add ( String.format ( "Permission_%d", id ) );
        demo.add ( String.format ( "Permission_%d", id + 1 ) );
        return demo;
    }
}
