package com.ellen.core.search.impl;

import com.ellen.core.DAO.FileIndexDao;
import com.ellen.core.model.Condition;
import com.ellen.core.model.Thing;
import com.ellen.core.search.FileSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * 业务层
 */
public class FileSearchImpl implements FileSearch {
    private final FileIndexDao fileIndexDao;

    public FileSearchImpl(FileIndexDao fileIndexDao) {
        this.fileIndexDao = fileIndexDao;
    }


    @Override
    public List<Thing> search(Condition condition) {
        /**
         * 数据库的处理逻辑
         * 当DAO传过来就进行检索
         */

        //如果传过来的condition为空直接返回
        if(condition==null){
            return new ArrayList<>();
        }
        return  this.fileIndexDao.search(condition);
    }
}
