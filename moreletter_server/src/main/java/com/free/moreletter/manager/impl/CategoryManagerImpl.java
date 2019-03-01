package com.free.moreletter.manager.impl;

import com.free.moreletter.dao.mapper.CategoryDoMapper;
import com.free.moreletter.dao.mapper.TagDoMapper;
import com.free.moreletter.dao.model.CategoryDo;
import com.free.moreletter.dao.model.CategoryDoExample;
import com.free.moreletter.domain.CategoryVo;
import com.free.moreletter.exception.exception.BusinessException;
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

    @Override
    public Long add(String name) {

        CategoryDo categoryDo = new CategoryDo();
        categoryDo.setName(name);
        try {
            categoryDoMapper.insert(categoryDo);
        }catch (Exception e){
            throw new BusinessException("该类目已经存在");
        }


        return categoryDo.getId();
    }
}
