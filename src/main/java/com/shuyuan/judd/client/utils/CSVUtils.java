package com.shuyuan.judd.client.utils;


import com.shuyuan.judd.client.model.trade.CSVModel;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.*;


/**
 * <br>
 *
 * @author Jessci
 * create by 2019/3/29
 */
public class CSVUtils {
    /**
     * 生成为CVS文件
     *
     * @param exportData 源数据List
     */

    @SuppressWarnings("rawtypes")
    public static File createCSVFile(List exportData) {
        LinkedHashMap map = new LinkedHashMap();
        map.put("date", "交易日期");
        map.put("time", "交易时间");
        map.put("tradeVoucherNo","商户订单号");
        map.put("tradeNo", "交易流水号");
        map.put("merchantName", "商户名称");
        map.put("businessType", "业务类型");
        map.put("routing", "需要分账");
        map.put("payWay", "支付方式");
        map.put("amount", "交易金额");
        map.put("feeAmount", "手续费");
        map.put("settlementAmount", "结算金额");
        File csvFile = null;
        BufferedWriter csvFileOutputStream = null;
        try {
            //定义文件名格式并创建
            csvFile = File.createTempFile("对账单", ".csv");
            System.out.println("csvFile：" + csvFile);
            // UTF-8使正确读取分隔符","
            //如果生产文件乱码，windows下用gbk，linux用UTF-8
            csvFileOutputStream = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(
                    csvFile), "UTF-8"), 1024);
            System.out.println("csvFileOutputStream：" + csvFileOutputStream);
            // 写入文件头部
            csvFileOutputStream.write(new String(new byte[] { (byte) 0xEF, (byte) 0xBB,(byte) 0xBF }));
            for (Iterator propertyIterator = map.entrySet().iterator(); propertyIterator.hasNext(); ) {
                java.util.Map.Entry propertyEntry = (java.util.Map.Entry) propertyIterator.next();
                csvFileOutputStream.write((String) propertyEntry.getValue() != null ? (String) propertyEntry.getValue() : "");
                if (propertyIterator.hasNext()) {
                    csvFileOutputStream.write(",");
                }
            }
            csvFileOutputStream.newLine();
            // 写入文件内容
            for (Iterator iterator = exportData.iterator(); iterator.hasNext(); ) {
                CSVModel row = (CSVModel) iterator.next();
                row.setDate("\t"+row.getDate()+"\t");
                row.setTime("\t"+row.getTime()+"\t");
                for (Iterator propertyIterator = map.entrySet().iterator(); propertyIterator
                        .hasNext(); ) {
                    java.util.Map.Entry propertyEntry = (java.util.Map.Entry) propertyIterator
                            .next();
                    csvFileOutputStream.write((String) BeanUtils.getProperty(row,
                            (String) propertyEntry.getKey()));
                    if (propertyIterator.hasNext()) {
                        csvFileOutputStream.write(",");
                    }
                }
                if (iterator.hasNext()) {
                    csvFileOutputStream.newLine();
                }
            }
            csvFileOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                csvFileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return csvFile;
    }

    /**
     * 下载文件
     *
     * @param response
     * @throws IOException
     */


    public static void exportFile(HttpServletResponse response, List<CSVModel> exportData)
            throws IOException

    {
        response.setContentType("application/csv;charset=UTF-8");
        response.setHeader("Content-Disposition",
                "attachment; filename=" + URLEncoder.encode("对账单.csv", "UTF-8"));

        InputStream in = null;
        try {
            in = new FileInputStream(createCSVFile(exportData));
            int len = 0;
            byte[] buffer = new byte[1024];
            //todo uncomment response.setCharacterEncoding("UTF-8");
            OutputStream out = response.getOutputStream();
            while ((len = in.read(buffer)) > 0) {
//                out.write(new byte[] { (byte) 0xEF, (byte) 0xBB,(byte) 0xBF  });
                out.write(buffer, 0, len);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /**
     * 删除该目录filePath下的所有文件
     *
     * @param filePath 文件目录路径
     */


    public static void deleteFiles(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    files[i].delete();
                }
            }
        }
    }

    /**
     * 删除单个文件
     *
     * @param filePath 文件目录路径
     * @param fileName 文件名称
     */


    public static void deleteFile(String filePath, String fileName) {
        File file = new File(filePath);
        if (file.exists()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    if (files[i].getName().equals(fileName)) {
                        files[i].delete();
                        return;
                    }
                }
            }
        }
    }

    /**
     * 测试数据
     *
     * @param args
     */

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        List exportData = new ArrayList<Map>();
        Map row1 = new LinkedHashMap<String, String>();
        row1.put("1", "11");
        row1.put("2", "12");
        row1.put("3", "13");
        row1.put("4", "14");
        exportData.add(row1);
        row1 = new LinkedHashMap<String, String>();
        row1.put("1", "21");
        row1.put("2", "22");
        row1.put("3", "23");
        row1.put("4", "24");
        exportData.add(row1);
        LinkedHashMap map = new LinkedHashMap();

        //设置列名
        map.put("1", "第一列名称");
        map.put("2", "第二列名称");
        map.put("3", "第三列名称");
        map.put("4", "第四列名称");
        //这个文件上传到路径，可以配置在数据库从数据库读取，这样方便一些！
        String path = "D:/reateCSVFile/";

        //文件名=生产的文件名称+时间戳
        String fileName = "文件导出";
//        File file = CSVUtils.createCSVFile(exportData, path, fileName);
//        String fileName2 = file.getName();
//        System.out.println("文件名称：" + fileName2);
    }
} 