package com.ellen.core.index;

import com.ellen.core.DAO.DataSourceFactory;
import com.ellen.core.DAO.impl.FileIndexDaoImpl;
import com.ellen.core.index.impl.FileScanImpl;
import com.ellen.core.interceptor.FileInterceptor;
import com.ellen.core.interceptor.impl.FileIndexInterceptor;
import com.ellen.core.interceptor.impl.FilePrintInterceptor;
import com.ellen.core.model.Thing;

/**
 * 对文件的扫描工作
 */
public interface FileScan {
    //业务 对应数据库的CRUD操作，它是将文件信息建立索引
    //给一个路径进行遍历

    /**
     * 第一步：遍历文件
     * @param path
     */
    void index(String path);

    /**
     * 遍历的拦截器
     * @param fileInterceptor
     */
    void interceptor (FileInterceptor fileInterceptor);

    //测试
//        public static void main(String[] args) {
//            FileScan scan= new FileScanImpl();
//            FileInterceptor printInterceptor=new FilePrintInterceptor();
//
//            scan.interceptor(printInterceptor);
//            FileInterceptor fileIndexInterceptor=new FileIndexInterceptor
//                    (new FileIndexDaoImpl(DataSourceFactory.dataSource()));
//            scan.interceptor(fileIndexInterceptor);
//            scan.index("G:\\38班资料");
//        }

}
