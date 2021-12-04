package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

//    @Autowired
//    OSSClient ossClient;

    @Test
    public void testUpload() throws FileNotFoundException {

//// yourEndpoint填写Bucket所在地域对应的Endpoint。以华东1（杭州）为例，Endpoint填写为https://oss-cn-hangzhou.aliyuncs.com。
//        String endpoint = "oss-us-west-1.aliyuncs.com";
//// 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
//        String accessKeyId = "LTAI5t9tum4cB3gWiPh9xjhT";
//        String accessKeySecret = "XItM4jA4kljf9SXhzwES1I9TQQYUDb";
//// 填写Bucket名称，例如examplebucket。
        String bucketName = "gulimall-jclin";
//// 填写文件名。文件名包含路径，不包含Bucket名称。例如exampledir/exampleobject.txt。
        InputStream inputStream = new FileInputStream("C:\\Users\\66983\\Documents\\shangguigu\\资料\\gulimall\\分布式基础（全栈开发篇）\\docs\\pics\\0d40c24b264aa511.jpg");
        String objectName = "bug2.jpg";
//
//// 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//        String content = "Hello OSS";
//        ossClient.putObject(bucketName, objectName, inputStream);
//
//// 关闭OSSClient。
//        ossClient.shutdown();
        System.out.println("上传完成");
    }

}
