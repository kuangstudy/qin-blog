package com.kuang.service.impl;

import com.kuang.mapper.TagMapper;
import com.kuang.pojo.Tag;
import com.kuang.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper mapper;

    @Override
    public List<Tag> queryTags() {
        return mapper.queryTags();
    }

}
