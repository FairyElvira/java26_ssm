package com.zhiyou100.util;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

import java.util.Arrays;

/**
 * @program: java26_ssm
 * @description: 创建fdfs的工具类
 * @author: 作者
 * @create: 2020-10-16 21:28
 */
public class FdfsUtil {

    public static void main(String[] args)throws Exception{
        //upload("d:/0.jpg");
        download("group1","M00/00/00/wKgCgF-JA5uAGSfAAAA9JxdpQHI55..jpg","d:/test");
    }
    //文件删除：返回0成功  返回其他失败
    public static  int delete(String groupName,String fileName)throws Exception{
        //读取配置文件获取tracker的主机位置
        ClientGlobal.init("fdfs.conf");
        //获取tracker的客户端
        TrackerClient tc=new TrackerClient();
        //获取tracker的服务器端
        TrackerServer ts=tc.getTrackerServer();
        //获取storage的客户端
        StorageClient sc=new StorageClient(ts);
        //调用stroage客户端的方法 进行文件操作
        //参数1：组名
        //参数2：文件名：  如M00/00/00/wKgCgF-JA5uAGSfAAAA9JxdpQHI55..jpg
        int result=sc.delete_file(groupName,fileName);
        System.out.println(result);
        //关闭连接
        sc.close();
        return result;
    }
    //文件下载：返回0成功  返回其他失败 使用于java项目
    public static  int download(String groupName,String fileName,String muDiPath)throws Exception{
        ClientGlobal.init("fdfs.conf");
        TrackerClient tc=new TrackerClient();
        TrackerServer ts=tc.getTrackerServer();
        StorageClient sc=new StorageClient(ts);
        //参数1：组名
        //参数2：文件名：  如M00/00/00/wKgCgF-JA5uAGSfAAAA9JxdpQHI55..jpg
        //参数3： 目的文件的名字  后缀名需要和源文件一致
        int result=sc.download_file(groupName,fileName,muDiPath+"/"+(fileName.substring(fileName.lastIndexOf("/"))));
        System.out.println(result);
        sc.close();
        return result;
    }
    //文件下载：返回字节数组 适用于web项目
    public static  byte[] download(String groupName,String fileName)throws Exception{
        ClientGlobal.init("fdfs.conf");
        TrackerClient tc=new TrackerClient();
        TrackerServer ts=tc.getTrackerServer();
        StorageClient sc=new StorageClient(ts);
        //参数1：组名
        //参数2：文件名：  如M00/00/00/wKgCgF-JA5uAGSfAAAA9JxdpQHI55..jpg
        byte[] arr=sc.download_file(groupName,fileName);
        System.out.println(arr.length+":::;");
        sc.close();
        return arr;
    }
    //文件上传 适用于java项目
    public static  String[] upload(String fileName)throws Exception{
        ClientGlobal.init("fdfs.conf");
        TrackerClient tc=new TrackerClient();
        TrackerServer ts=tc.getTrackerServer();
        StorageClient sc=new StorageClient(ts);
        //获取文件后缀名
        String hzm=fileName.substring(fileName.lastIndexOf('.'));
        //第一个参数 文件对应的字节数组
        //第二个参数 文件的后缀名
        //第三个参数  文件的属性信息  可以不用设置
        String[] arr=sc.upload_file(fileName,hzm,null);
        System.out.println(Arrays.toString(arr));
        sc.close();
        return arr;
    }
    //文件上传 适用于web项目
    public static  String[] upload(byte[] bytes,String fileName)throws Exception{
        ClientGlobal.init("fdfs.conf");
        TrackerClient tc=new TrackerClient();
        TrackerServer ts=tc.getTrackerServer();
        StorageClient sc=new StorageClient(ts);
        //获取文件后缀名
        String hzm=fileName.substring(fileName.lastIndexOf('.'));
        //第一个参数 文件对应的字节数组
        //第二个参数 文件的后缀名
        //第三个参数  文件的属性信息  可以不用设置
        String[] arr=sc.upload_file(bytes,hzm,null);
        System.out.println(Arrays.toString(arr));
        sc.close();
        return arr;
    }
}
