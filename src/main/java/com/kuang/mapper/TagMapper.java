package com.kuang.mapper;

import com.kuang.pojo.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TagMapper {

    //查询所有标签
    public List<Tag> queryTags();

    //增加一个标签

    //删除一个标签

}
