package com.iag;

import java.io.*;

/**
 * Created by xueshan.wei on 5/19/2017.
 */
public class ReadText {
    public static String readTextToString(String filePath) throws Exception{
        try{
            File file = new File(filePath);
            if(file.isFile() && file.exists()){
                InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
                BufferedReader br = new BufferedReader(reader);
                String line = null;
                StringBuffer sb = new StringBuffer();
                while ((line = br.readLine()) != null){
                    sb.append(line);
                }
                System.out.println(sb.toString());
                return sb.toString();
            }else {
                throw new Exception("文件不存在");
            }
        }catch (Exception e){
            throw e;
        }
    }
}
