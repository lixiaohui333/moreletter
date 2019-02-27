package com.free.moreletter.manager.impl;

import com.free.moreletter.dao.mapper.CategoryDoMapper;
import com.free.moreletter.dao.model.CategoryDo;
import com.free.moreletter.dao.model.CategoryDoExample;
import com.free.moreletter.domain.CategoryVo;
import com.free.moreletter.manager.CategoryManager;
import com.free.moreletter.util.CommonConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class CategoryManagerImpl implements CategoryManager {

    @Autowired
    CategoryDoMapper categoryDoMapper;

    @Override
    public List<CategoryVo> listCategory() {

        List<CategoryDo> categoryDos = categoryDoMapper.selectByExample(new CategoryDoExample());

        List<CategoryVo> result = new ArrayList<>();

        categoryDos.forEach((categoryDo -> {
            CategoryVo categoryVo = new CategoryVo();
            CommonConvertor.convert(categoryDo,categoryVo);
            result.add(categoryVo);
        }));

        return result;
    }
}
