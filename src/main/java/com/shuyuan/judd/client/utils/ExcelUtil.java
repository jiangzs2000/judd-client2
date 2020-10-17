package com.shuyuan.judd.client.utils;

import com.shuyuan.judd.client.model.trade.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.util.Region;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Boris
 * create 2018/10/13
 * 
 **/
@Slf4j
public class ExcelUtil {

    @Autowired
    private HSSFWorkbook workbook = null;
    @SuppressWarnings("unused")
    private HSSFSheet sheet = null;


// public HSSFSheet getSheet() {
//  return sheet;
// }

// public void setSheet(HSSFSheet sheet) {
//  this.sheet = sheet;
// }

    public ExcelUtil(HSSFWorkbook workbook) {
        this.workbook = workbook;
    }

    public ExcelUtil(HSSFWorkbook workbook, HSSFSheet sheet) {
        super();
        this.workbook = workbook;
        this.sheet = sheet;
    }

    /**
     * 创建通用的Excel空白行信息
     *
     * @param workbook  如果为空 则没有样式
     * @param sheet     (创建sheet)
     * @param rowNO     报表的单行行号(创建第几行)
     * @param rowHeight 报表的单行行高
     * @param colNum    报表的总列数 (合并)
     */
    public void createExcelRow(HSSFWorkbook workbook, HSSFSheet sheet, int rowNO, int rowHeight, int colNum) {
        createExcelRow(workbook, sheet, rowNO, -1, colNum, null, -1, null, null, null);
    }

    /**
     * 创建通用的Excel带标题行信息
     *
     * @param workbook    如果为空 则没有样式
     * @param sheet       (创建sheet)
     * @param rowNO       报表的单行行号(创建第几行)
     * @param rowHeight   报表的单行行高
     * @param colNum      报表的总列数 (合并)
     * @param fontCaption 报表行中显示的字符
     */
    public void createExcelRow(HSSFWorkbook workbook, HSSFSheet sheet, int rowNO, int rowHeight, int colNum, String fontCaption) {
        createExcelRow(workbook, sheet, rowNO, 800, colNum, fontCaption, 360, null, null, null);
    }

    /**
     * 创建通用的Excel行信息
     *
     * @param workbook    如果为空 则没有样式
     * @param sheet       (创建sheet)
     * @param rowNO       报表的单行行号(创建第几行)
     * @param rowHeight   报表的单行行高
     * @param colNum      报表的总列数 (合并)
     * @param fontCaption 报表行中显示的字符
     * @param fontSize    字体的大小 (字体大小 默认 200)
     * @param fontWeight  报表表头显示的字符
     * @param align       字体水平位置 (center中间  right右  left左)
     * @param colNum      报表的列数
     */
    @SuppressWarnings("deprecation")
    public void createExcelRow(HSSFWorkbook workbook, HSSFSheet sheet, int rowNO, int rowHeight, int colNum, String fontCaption, int fontSize, String fontWeight, String align, String colour) {
        if (colNum < 0) {
            log.debug(this.getClass().getName() + " --> Excel column number is null");
            colNum = 100;
        }
//        sheet.setColumnWidth(rowNO,120);
        HSSFRow row = sheet.createRow(rowNO);  //创建第一行
        row.setHeight((short) (rowHeight < 1 ? 600 : rowHeight));  //设置行高
        HSSFCell cell = row.createCell(0);//设置第一行
        cell.setCellType(HSSFCell.ENCODING_UTF_16); //定义单元格为字符串类型
        cell.setCellValue(fontCaption);
        sheet.addMergedRegion(new Region(rowNO, (short) 0, rowNO, (short) (colNum - 1)));   //指定合并区域
        HSSFCellStyle cellStyle = createCellFontStyle(workbook, fontSize, fontWeight, align);  //设定样式
        if (cellStyle != null) {
            if (colour != null) {
                // 设置单元格背景色
                cellStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
                cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
            }
            cell.setCellStyle(cellStyle);
        }
    }

    public void createSubtotal(HSSFWorkbook workbook, HSSFSheet sheet, int rowNO, int rowHeight, int colNum, List<String> fontCaption, int fontSize, String fontWeight, String align, String colour) {
        if (colNum < 0) {
            log.debug(this.getClass().getName() + " --> Excel column number is null");
            colNum = 100;
        }
        HSSFRow row = sheet.createRow(rowNO);  //创建第一行
        row.setHeight((short) (rowHeight < 1 ? 600 : rowHeight));
        HSSFCell hssfCell = row.createCell(0);//设置行高
        hssfCell.setCellType(HSSFCell.ENCODING_UTF_16);
        hssfCell.setCellValue(fontCaption.get(0));
        HSSFCell cell = row.createCell(1);//设置第一行
        cell.setCellType(HSSFCell.ENCODING_UTF_16); //定义单元格为字符串类型
        cell.setCellValue(fontCaption.get(1));
        sheet.addMergedRegion(new Region(rowNO, (short) 1, rowNO, (short) (colNum - 1)));   //指定合并区域
        HSSFCellStyle cellStyle = createCellFontStyle(workbook, fontSize, fontWeight, align);  //设定样式
        if (cellStyle != null) {
            if (colour != null) {
                // 设置单元格背景色
                cellStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
                cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
            }
            cell.setCellStyle(cellStyle);
        }
    }

    /**
     * 设置报表列头
     *
     * @param sheet        (创建sheet)
     * @param rowNO        报表的单行行号(创建第几行)
     * @param rowHeight    报表的单行行高
     * @param columnHeader 报表行中显示的字符
     */
    public void createColumnHeader(HSSFSheet sheet, int rowNO, int rowHeight, String[] columnHeader) {
        createColumnHeader(sheet, rowNO, rowHeight, columnHeader, -1, null, null);
    }

    /**
     * 设置报表列头
     *
     * @param sheet        (创建sheet)
     * @param rowNO        报表的单行行号(创建第几行)
     * @param rowHeight    报表的单行行高
     * @param columnHeader 报表行中显示的字符
     * @param fontSize     字体的大小 (字体大小 默认 200)
     */
    public void createColumnHeader(HSSFSheet sheet, int rowNO, int rowHeight, String[] columnHeader, int fontSize) {
        createColumnHeader(sheet, rowNO, rowHeight, columnHeader, fontSize, null, null);
    }

    /**
     * 设置报表列头
     *
     * @param sheet        (创建sheet)
     * @param rowNO        报表的单行行号(创建第几行)
     * @param rowHeight    报表的单行行高
     * @param columnHeader 报表行中显示的字符
     * @param fontSize     字体的大小 (字体大小 默认 200)
     * @param fontWeight   报表表头显示的字符
     * @param align        字体水平位置 (center中间  right右  left左)
     */
    public void createColumnHeader(HSSFSheet sheet, int rowNO, int rowHeight, String[] columnHeader, int fontSize, String fontWeight,
                                   String align) {
        if (columnHeader == null || columnHeader.length < 1) {
            log.debug(this.getClass().getName() + " --> Excel columnHeader is null");
            return;
        }
        HSSFRow row = sheet.createRow(rowNO);
        row.setHeight((short) rowHeight);

        HSSFCellStyle cellStyle = createCellFontStyle(workbook, fontSize, fontWeight, align);
//        if (cellStyle != null) {
//            // 设置单元格背景色
//            cellStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
//            cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
//        }

        HSSFCell cell = null;
        CellRangeAddress region = new CellRangeAddress(2, 2, 1, 3);
        CellRangeAddress region1 = new CellRangeAddress(2, 2, 6, 8);
        CellRangeAddress region2 = new CellRangeAddress(2, 2, 4, 5);
        sheet.addMergedRegion(region2);
        sheet.addMergedRegion(region);
        sheet.addMergedRegion(region1);
//        sheet.setColumnWidth(rowNO, 120);
        cell = row.createCell(0);
        cell.setCellValue(columnHeader[0]);
        cell = row.createCell(1);
        cell.setCellType(HSSFCell.ENCODING_UTF_16);
        if (cellStyle != null) {
            cell.setCellStyle(cellStyle);
        }
        cell.setCellValue(columnHeader[1]);
        cell = row.createCell(4);
        cell.setCellValue(columnHeader[2]);
        cell = row.createCell(6);
        cell.setCellValue(columnHeader[3]);
    }

    /**
     * 设置报表列头
     *
     * @param sheet        (创建sheet)
     * @param rowNO        报表的单行行号(创建第几行)
     * @param rowHeight    报表的单行行高
     * @param columnHeader 报表行中显示的字符
     * @param fontSize     字体的大小 (字体大小 默认 200)
     * @param fontWeight   报表表头显示的字符
     * @param align        字体水平位置 (center中间  right右  left左)
     */
    public Integer createTransactiontype(HSSFSheet sheet, int rowNO, int rowHeight, List<Map<String, String>> columnHeader, int fontSize, String fontWeight,
                                         String align) {
        if (columnHeader == null || columnHeader.size() < 1) {
            log.debug(this.getClass().getName() + " --> Excel columnHeader is null");
            return rowNO;
        }
        for (Map<String, String> map : columnHeader) {
            HSSFRow row = sheet.createRow(rowNO);
            row.setHeight((short) rowHeight);
            HSSFCellStyle cellStyle = createCellFontStyle(workbook, fontSize, "normal", align);
            HSSFCell cell = null;
            CellRangeAddress region = new CellRangeAddress(rowNO, rowNO, 0, 2);
            CellRangeAddress region2 = new CellRangeAddress(rowNO, rowNO, 3, 4);
            CellRangeAddress region1 = new CellRangeAddress(rowNO, rowNO, 7, 8);
            sheet.addMergedRegion(region);
            sheet.addMergedRegion(region1);
            sheet.addMergedRegion(region2);
//            sheet.setColumnWidth(rowNO, 120);  //设置列宽，20个字符宽度。宽度参数为1/256，故乘以256
            cell = row.createCell(0);
            cell.setCellValue(map.get("type"));
            cell.setCellStyle(cellStyle);
            cell = row.createCell(3);
            cell.setCellType(HSSFCell.ENCODING_UTF_16);
            cell.setCellStyle(cellStyle);
//        }加粗
            cell.setCellValue(map.get("amount"));
            cell.setCellStyle(cellStyle);
            cell = row.createCell(5);
            cell.setCellValue(map.get("count"));
            cell.setCellStyle(cellStyle);
            cell = row.createCell(6);
            cell.setCellValue(map.get("fee"));
            cell.setCellStyle(cellStyle);
            cell = row.createCell(7);
            cell.setCellValue(map.get("money"));
            cell.setCellStyle(cellStyle);
            rowNO++;
        }
        return rowNO;
    }


    /**
     * 创建数据行
     *
     * @param sheet      (创建sheet)
     * @param rowNO      报表的单行行号(创建第几行)
     * @param
     * @param columnData 报表行中显示的数据
     * @param maxValue   Excel显示的最大上限
     */
    public HSSFSheet createColumnData(HSSFSheet sheet, int rowNO, String[][] columnData, int maxValue) {
        maxValue = (maxValue < 1 || maxValue > 65535) ? 65535 : maxValue;
        int currRowNO = rowNO;
        for (int numNO = currRowNO; numNO < columnData.length + currRowNO; numNO++) {
            if (numNO % maxValue == 0) {
                sheet = workbook.createSheet();
                rowNO = 0;
            }
            createColumnDataDesc(sheet, numNO, rowNO, currRowNO, -1, columnData);
            rowNO++;
        }
        return sheet;
    }

    /**
     * 创建数据行
     *
     * @param sheet      (创建sheet)
     * @param numNO      序列号
     * @param rowNO      报表的单行行号(创建第几行)
     * @param currRowNO  初始行号
     * @param rowHeight  报表的单行行高
     * @param columnData 报表行中显示的数据
     */
    private void createColumnDataDesc(HSSFSheet sheet, int numNO, int rowNO, int currRowNO, int rowHeight, String[][] columnData) {
        createColumnDataDesc(sheet, numNO, rowNO, currRowNO, rowHeight, columnData, -1, null, null);
    }

    /**
     * 创建数据行
     *
     * @param sheet      (创建sheet)
     * @param rowNO      报表的单行行号(创建第几行)
     * @param rowHeight  报表的单行行高
     * @param columnData 报表行中显示的数据
     * @param fontSize   字体大小 默认 200
     * @param fontWeight 字体粗细 ( 值为bold 为加粗)
     * @param align      字体水平位置 (center中间  right右  left左)
     * @param maxValue   Excel显示的最大上限
     */
    public HSSFSheet createColumnData(HSSFSheet sheet, int rowNO, int rowHeight, String[][] columnData, int fontSize, String fontWeight, String align, int maxValue) {
        maxValue = (maxValue < 1 || maxValue > 65535) ? 65535 : maxValue;
        int currRowNO = rowNO;
        for (int numNO = currRowNO; numNO < columnData.length + currRowNO; numNO++) {
            if (numNO % maxValue == 0) {
                sheet = workbook.createSheet();
                rowNO = 0;
            }
            createColumnDataDesc(sheet, numNO, rowNO, currRowNO, rowHeight, columnData, fontSize, fontWeight, align);
            rowNO++;
        }
        return sheet;
    }

    /**
     * 创建数据行
     *
     * @param sheet      (创建sheet)
     * @param numNO      序列号
     * @param rowNO      报表的单行行号(创建第几行)
     * @param currRowNO  初始行号
     * @param rowHeight  报表的单行行高
     * @param columnData 报表行中显示的数据
     * @param fontSize   字体的大小 (字体大小 默认 200)
     * @param fontWeight 报表表头显示的字符
     * @param align      字体水平位置 (center中间  right右  left左)
     */
    private void createColumnDataDesc(HSSFSheet sheet, int numNO, int rowNO, int currRowNO, int rowHeight, String[][] columnData, int fontSize, String fontWeight,
                                      String align) {
        if (columnData == null || columnData.length < 1) {
            log.debug(this.getClass().getName() + " --> Excel columnData is null");
//   return ;
        }
        HSSFRow row = sheet.createRow(rowNO);
        row.setHeight((short) rowHeight);

        HSSFCellStyle cellStyle = null;// createCellFontStyle(workbook, fontSize, fontWeight, align);
        if (cellStyle != null) {
            cellStyle.setAlignment(HSSFCellStyle.ALIGN_LEFT); // 指定单元格居中对齐
        } else {
            cellStyle = workbook.createCellStyle();
            cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER_SELECTION); // 指定单元格居中对齐
        }
        HSSFCell cell = null;
        for (int i = 0; i < columnData[numNO - currRowNO].length; i++) {
//            sheet.setColumnWidth(i, 120);  //设置列宽，20个字符宽度。宽度参数为1/256，故乘以256
            cell = row.createCell(i);
            cell.setCellType(HSSFCell.ENCODING_UTF_16);
            if (cellStyle != null) {
                cell.setCellStyle(cellStyle);
            }
            cell.setCellValue(new HSSFRichTextString(columnData[numNO - currRowNO][i]));
        }
    }


    /**
     * 创建数据行
     *
     * @param sheet      (创建sheet)
     * @param numNO      序列号
     * @param rowNO      报表的单行行号(创建第几行)
     * @param currRowNO  初始行号
     * @param rowHeight  报表的单行行高
     * @param columnData 报表行中显示的数据
     * @param fontSize   字体的大小 (字体大小 默认 200)
     * @param fontWeight 报表表头显示的字符
     * @param align      字体水平位置 (center中间  right右  left左)
     */
    public void createTitle(HSSFSheet sheet, int numNO, int rowNO, int currRowNO, int rowHeight, List<String> columnData, int fontSize, String fontWeight,
                            String align) {
        if (columnData == null || columnData.size() < 1) {
            log.debug(this.getClass().getName() + " --> Excel columnData is null");
//   return ;
        }
        HSSFRow row = sheet.createRow(rowNO);
        row.setHeight((short) rowHeight);

        HSSFCellStyle cellStyle = null;// createCellFontStyle(workbook, fontSize, fontWeight, align);
        if (cellStyle != null) {
            cellStyle.setAlignment(HSSFCellStyle.ALIGN_LEFT); // 指定单元格居中对齐
        } else {
            cellStyle = workbook.createCellStyle();
            cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER_SELECTION); // 指定单元格居中对齐
        }
        HSSFCell cell = null;

        for (int i = 0; i < columnData.size() + 1; i++) {
            sheet.addMergedRegion(new Region(rowNO, (short) 2, rowNO, (short) 3));
//            sheet.setColumnWidth(i, 120);  //设置列宽，20个字符宽度。宽度参数为1/256，故乘以256
            cell = row.createCell(i);
            cell.setCellType(HSSFCell.ENCODING_UTF_16);
            if (cellStyle != null) {
                cell.setCellStyle(cellStyle);
            }
            if (i > 3) {
                cell.setCellValue(new HSSFRichTextString(columnData.get(i - 1)));
            } else {
                cell.setCellValue(new HSSFRichTextString(columnData.get(i)));
            }
        }
    }


    public void createTitleTixian(HSSFSheet sheet, int numNO, int rowNO, int currRowNO, int rowHeight, List<String> columnData, int fontSize, String fontWeight,
                            String align) {
        if (columnData == null || columnData.size() < 1) {
            log.debug(this.getClass().getName() + " --> Excel columnData is null");
//   return ;
        }
        HSSFRow row = sheet.createRow(rowNO);
        row.setHeight((short) rowHeight);

        HSSFCellStyle cellStyle = null;// createCellFontStyle(workbook, fontSize, fontWeight, align);
        if (cellStyle != null) {
            cellStyle.setAlignment(HSSFCellStyle.ALIGN_LEFT); // 指定单元格居中对齐
        } else {
            cellStyle = workbook.createCellStyle();
            cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER_SELECTION); // 指定单元格居中对齐
        }
        HSSFCell cell = null;

        for (int i = 0; i < columnData.size() + 2; i++) {
            sheet.addMergedRegion(new Region(rowNO, (short) 2, rowNO, (short) 3));
            sheet.addMergedRegion(new Region(rowNO, (short) 4, rowNO, (short) 5));
//            sheet.setColumnWidth(i, 120);  //设置列宽，20个字符宽度。宽度参数为1/256，故乘以256
            cell = row.createCell(i);
            cell.setCellType(HSSFCell.ENCODING_UTF_16);
            if (cellStyle != null) {
                cell.setCellStyle(cellStyle);
            }
            if (i > 3 ||i > 4) {
                cell.setCellValue(new HSSFRichTextString(columnData.get(i - 2)));
            } else  {
                cell.setCellValue(new HSSFRichTextString(columnData.get(i)));
            }
        }
    }
    /**a
     * 创建数据行
     *
     * @param sheet      (创建sheet)
     * @param numNO      序列号
     * @param rowNO      报表的单行行号(创建第几行)
     * @param currRowNO  初始行号
     * @param rowHeight  报表的单行行高
     * @param columnData 报表行中显示的数据
     * @param fontSize   字体的大小 (字体大小 默认 200)
     * @param fontWeight 报表表头显示的字符
     * @param align      字体水平位置 (center中间  right右  left左)
     */
    public void createCash(HSSFSheet sheet, int numNO, int rowNO, int currRowNO, int rowHeight, List<String> columnData, int fontSize, String fontWeight,
                           String align) {
        if (columnData == null || columnData.size() < 1) {
            log.debug(this.getClass().getName() + " --> Excel columnData is null");
//   return ;
        }
        HSSFRow row = sheet.createRow(rowNO);
        row.setHeight((short) rowHeight);

        HSSFCellStyle cellStyle = null;// createCellFontStyle(workbook, fontSize, fontWeight, align);
        if (cellStyle != null) {
            cellStyle.setAlignment(HSSFCellStyle.ALIGN_LEFT); // 指定单元格居中对齐
        } else {
            cellStyle = workbook.createCellStyle();
            cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER_SELECTION); // 指定单元格居中对齐
        }
        HSSFCell cell = null;

        for (int i = 0; i < columnData.size(); i++) {
            if (i == 3) {
                sheet.addMergedRegion(new Region(rowNO, (short) 2, rowNO, (short) 3));
            }
//            sheet.setColumnWidth(i, 120);  //设置列宽，20个字符宽度。宽度参数为1/256，故乘以256
            cell = row.createCell(i);
            cell.setCellType(HSSFCell.ENCODING_UTF_16);
            if (cellStyle != null) {
                cell.setCellStyle(cellStyle);
            }

            cell.setCellValue(new HSSFRichTextString(columnData.get(i)));
        }
    }

    /**
     * 创建内容单元格
     *
     * @param workbook     HSSFWorkbook
     * @param row          HSSFRow
     * @param columnNumber short型的列索引
     * @param alignType    对齐方式  (默认居中对齐,如果 alignType=true 则左对齐)
     * @param value        列值
     */
    @SuppressWarnings("deprecation")
    public void cteateDataCell(HSSFWorkbook workbook, HSSFRow row, int columnNumber, boolean alignType, String value) {
        HSSFCell cell = row.createCell(((short) columnNumber));
        cell.setCellType(HSSFCell.ENCODING_UTF_16);
        cell.setCellValue(new HSSFRichTextString(value));

        HSSFCellStyle cellstyle = workbook.createCellStyle();
        short align = HSSFCellStyle.ALIGN_CENTER_SELECTION;
        if (alignType) {
            align = HSSFCellStyle.ALIGN_LEFT;
        }
        cellstyle.setAlignment(align); // 指定单元格居中对齐
        cell.setCellStyle(cellstyle);
    }

    /**
     * 创建通用的Excel最后一行的信息 (创建合计行 (最后一行))
     *
     * @param workbook    如果为空 则没有样式
     * @param sheet
     * @param colNum      报表的总列数 (合并)
     * @param fontCaption 报表行中显示的字符
     * @param fontSize    字体的大小 (字体大小 默认 200)
     * @param fontWeight  报表表头显示的字符
     * @param align       字体水平位置 (center中间  right右  left左)
     * @param colNum      报表的列数 (需要合并到的列索引)
     */
    @SuppressWarnings("deprecation")
    public void createSummaryRow(HSSFWorkbook workbook, HSSFSheet sheet,
                                 int colNum, String fontCaption, int fontSize, String fontWeight,
                                 String align) {

        HSSFCellStyle cellStyle = createCellFontStyle(workbook, fontSize, fontWeight, align);

        HSSFRow lastRow = sheet.createRow((short) (sheet.getLastRowNum() + 1));
        HSSFCell sumCell = lastRow.createCell(0);

        sumCell.setCellValue(new HSSFRichTextString(fontCaption));
        if (cellStyle != null) {
            sumCell.setCellStyle(cellStyle);
        }
        sheet.addMergedRegion(new Region(sheet.getLastRowNum(), (short) 0, sheet.getLastRowNum(), (short) (colNum - 1)));// 指定合并区域
    }

    /**
     * 设置字体样式   (字体为宋体 ，上下居中对齐，可设置左右对齐，字体粗细，字体大小 )
     *
     * @param workbook   如果为空 则没有样式
     * @param fontSize   字体大小 默认 200
     * @param fontWeight 字体粗细 ( 值为bold 为加粗)
     * @param align      字体水平位置 (center中间  right右  left左)
     */
    public HSSFCellStyle createCellFontStyle(HSSFWorkbook workbook, int fontSize, String fontWeight, String align) {
        if (workbook == null) {
            log.debug(this.getClass().getName() + " --> Excel HSSFWorkbook FontStyle is not set");
            return null;
        }

        HSSFCellStyle cellStyle = workbook.createCellStyle();

        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 指定单元格居中对齐
        if (align != null && align.equalsIgnoreCase("left")) {
            cellStyle.setAlignment(HSSFCellStyle.ALIGN_LEFT); // 指定单元格居中对齐
        }
        if (align != null && align.equalsIgnoreCase("right")) {
            cellStyle.setAlignment(HSSFCellStyle.ALIGN_RIGHT); // 指定单元格居中对齐
        }

        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 指定单元格垂直居中对齐
        cellStyle.setWrapText(true);// 指定单元格自动换行

        // 单元格字体
        HSSFFont font = workbook.createFont();
        if (fontWeight != null && fontWeight.equalsIgnoreCase("normal")) {
            font.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL);
        } else {
            font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        }

        font.setFontName("宋体");
        font.setFontHeight((short) (fontSize < 1 ? 200 : fontSize));
        cellStyle.setFont(font);

        // 设置字体
//        HSSFFont font = workbook.createFont();
//        font.setFontHeightInPoints((short) 20); //字体高度
//        font.setColor(HSSFFont.COLOR_RED); //字体颜色
//        font.setFontName("黑体"); //字体
//        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); //宽度
//        font.setItalic(true); //是否使用斜体
//        font.setStrikeout(true); //是否使用划线
//  // 添加单元格注释
//        // 创建HSSFPatriarch对象,HSSFPatriarch是所有注释的容器.
//         HSSFPatriarch patr = sheet.createDrawingPatriarch();
//        // 定义注释的大小和位置,详见文档
//         HSSFComment comment = patr.createComment(new HSSFClientAnchor(0, 0, 0, 0, (short)4, 2, (short) 6, 5));
//        // 设置注释内容
//         comment.setString(new HSSFRichTextString("可以在POI中添加注释！"));
//        // 设置注释作者. 当鼠标移动到单元格上是可以在状态栏中看到该内容.
//         comment.setAuthor("Xuys.");

        return cellStyle;
    }


    public void exportExcel(OutputStream out) {
//        OutputStream os = null;

//            os = new FileOutputStream(new File(fileName));
        try {
            workbook.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
//            os.close();

    }

    /**
     * 利用模板导出Excel
     *
     * @param inputFileName  输入模板文件路径
     * @param outputFileName 输入文件存放于服务器路径
     * @param dataList       待导出数据
     * @throws Exception
     * @roseuid:
     */
    @SuppressWarnings("deprecation")
    public void exportExcelFile(String inputFileName, String outputFileName,
                                List<?> dataList) throws Exception {
        // 用模板文件构造poi
        POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(inputFileName));
        // 创建模板工作表
        HSSFWorkbook templatewb = new HSSFWorkbook(fs);
        // 直接取模板第一个sheet对象
        HSSFSheet templateSheet = templatewb.getSheetAt(1);
        if (dataList.size() % 65535 == 0) {
            templateSheet = templatewb.createSheet();
        }
        // 得到模板的第一个sheet的第一行对象 为了得到模板样式
        HSSFRow templateRow = templateSheet.getRow(0);

        // HSSFSheet timplateSheet = templatewb.getSheetAt(1);
        // 取得Excel文件的总列数
        int columns = templateSheet.getRow((short) 0)
                .getPhysicalNumberOfCells();
        System.out.println("columns   is   :   " + columns);
        // 创建样式数组
        HSSFCellStyle styleArray[] = new HSSFCellStyle[columns];

        // 一次性创建所有列的样式放在数组里
        for (int s = 0; s < columns; s++) {
            // 得到数组实例
            styleArray[s] = templatewb.createCellStyle();
        }
        // 循环对每一个单元格进行赋值
        // 定位行
        for (int rowId = 1; rowId < dataList.size(); rowId++) {
            // 依次取第rowId行数据 每一个数据是valueList
            List<?> valueList = (List<?>) dataList.get(rowId - 1);
            // 定位列
            for (int columnId = 0; columnId < columns; columnId++) {
                // 依次取出对应与colunmId列的值
                // 每一个单元格的值
                String dataValue = (String) valueList.get(columnId);
                // 取出colunmId列的的style
                // 模板每一列的样式
                HSSFCellStyle style = styleArray[columnId];
                // 取模板第colunmId列的单元格对象
                // 模板单元格对象
                HSSFCell templateCell = templateRow.getCell((short) columnId);
                // 创建一个新的rowId行 行对象
                // 新建的行对象
                HSSFRow hssfRow = templateSheet.createRow(rowId);
                // 创建新的rowId行 columnId列 单元格对象
                // 新建的单元格对象
                HSSFCell cell = hssfRow.createCell((short) columnId);
                // 如果对应的模板单元格 样式为非锁定
                if (templateCell.getCellStyle().getLocked() == false) {
                    // 设置此列style为非锁定
                    style.setLocked(false);
                    // 设置到新的单元格上
                    cell.setCellStyle(style);
                }
                // 否则样式为锁定
                else {
                    // 设置此列style为锁定
                    style.setLocked(true);
                    // 设置到新单元格上
                    cell.setCellStyle(style);
                }
                // 设置编码
                // cell.setEncoding(HSSFCell.ENCODING_UTF_16);
                // Debug.println( "dataValue   :   " + dataValue);
                // 设置值 统一为String
                cell.setCellValue(dataValue);
            }
        }
        // 设置输入流
        FileOutputStream fOut = new FileOutputStream(outputFileName);
        // 将模板的内容写到输出文件上
        templatewb.write(fOut);
        fOut.flush();

        // 操作结束，关闭文件
        fOut.close();

    }

    public static HSSFWorkbook mainecxel(ExcelDataModel excelDataModel) {
//  private static HSSFWorkbook workbook = new HSSFWorkbook();
//      private static HSSFSheet sheet = workbook.createSheet();
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
//        sheet.setDefaultColumnWidth(120);
        sheet.setColumnWidth(0, 256 * 11);
        sheet.setColumnWidth(1, 256 * 11);
        sheet.setColumnWidth(2, 256 * 11);
        sheet.setColumnWidth(3, 256 * 11);
        sheet.setColumnWidth(4, 256 * 11);
        sheet.setColumnWidth(5, 256 * 11);
        sheet.setColumnWidth(6, 256 * 11);
        sheet.setColumnWidth(7, 256 * 11);
        sheet.setColumnWidth(8, 256 * 11);
//        sheet.setDefaultColumnWidth(256*17);
//        sheet.autoSizeColumn((short)120); //调整第一列宽度
        ExcelUtil eeu = new ExcelUtil(workbook, sheet);
        String[] strArr = new String[]{"商户名", excelDataModel.getMerchantName(), "交易时间", excelDataModel.getTransactionTime()};
        int rowNO = 0;
        eeu.createExcelRow(workbook, sheet, rowNO, -1, 9, "商户对账单"); // , 250, "bold", "center"
        rowNO++;
        eeu.createExcelRow(workbook, sheet, rowNO, 300, 9,
                "商户基本信息", -1, "normal", "center", "1");
        rowNO++;
        eeu.createColumnHeader(sheet, rowNO, 300, strArr);
        rowNO++;
        eeu.createExcelRow(workbook, sheet, rowNO, 300, 9,
                "交易汇总清单", -1, "normal", "left", "1");
        rowNO++;
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("type", "交易类型");
        map.put("count", "交易笔数");
        map.put("amount", "交易金额");
        map.put("fee", "手续费");
        map.put("money", "入账金额");
        list.add(map);
        for (TransactionSummaryModel transactionSummaryModel : excelDataModel.getTransactionSummaryModels()) {
            map = new HashMap<>();
            map.put("count", transactionSummaryModel.getTransactionCount());
            map.put("amount", transactionSummaryModel.getTransactionAmount());
            map.put("fee", transactionSummaryModel.getServiceCharge());
            map.put("money", transactionSummaryModel.getSettlementAmount());
            map.put("type", transactionSummaryModel.getTransactionType());
            list.add(map);
        }
        rowNO = eeu.createTransactiontype(sheet, rowNO, 300, list, -1, null, "center");
        eeu.createExcelRow(workbook, sheet, rowNO, 300, 9,
                "交易对账明细", -1, "normal", "left", "1");
        rowNO++;
        eeu.createExcelRow(workbook, sheet, rowNO, 300, 9,
                "微信公众号收款", -1, "normal", "center", null);
        rowNO++;
        List<String> list1 = new ArrayList<>();
        list1.add("交易日期");
        list1.add("交易时间");
        list1.add("交易流水号");
        list1.add("支付方式");
        list1.add("交易类型");
        list1.add("交易金额");
        list1.add("手续费");
        list1.add("入账金额");
        eeu.createTitle(sheet, -1, rowNO, -1, 300, list1, -1, "normal", null);
        rowNO++;
        for (ReconciliationDetailsModel reconciliationDetailsModel : excelDataModel.getReconciliationDetailsModels()) {
            List<String> reconciliationDetailsModels = new ArrayList<>();
            reconciliationDetailsModels.add(reconciliationDetailsModel.getTransactionDate());
            reconciliationDetailsModels.add(reconciliationDetailsModel.getTransactionTime());
            reconciliationDetailsModels.add(reconciliationDetailsModel.getTreadNo());
            reconciliationDetailsModels.add(reconciliationDetailsModel.getPaymentType());
            reconciliationDetailsModels.add(reconciliationDetailsModel.getBizType());
            reconciliationDetailsModels.add(reconciliationDetailsModel.getTransactionAmount());
            reconciliationDetailsModels.add(reconciliationDetailsModel.getServiceCharge());
            reconciliationDetailsModels.add(reconciliationDetailsModel.getSettlementAmount());
            eeu.createTitle(sheet, -1, rowNO, -1, 300, reconciliationDetailsModels, -1, "normal", null);
            rowNO++;
        }
        List<String> list2 = new ArrayList<>();
        list2.add("小计");
        list2.add(excelDataModel.getSubtotal());
        eeu.createSubtotal(workbook, sheet, rowNO, 300, 9,
                list2, -1, "normal", "left", null);
        rowNO++;
       /* eeu.createExcelRow(workbook, sheet, rowNO, 300, 8,
                excelDataModel.getSummary(), -1, "normal", "left", null);
        rowNO++;*/
        eeu.createExcelRow(workbook, sheet, rowNO, 300, 9,
                "提现汇总清单", -1, "normal", "left", "1");
        rowNO++;
        List<Map<String, String>> list3 = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        map1.put("type", "提现类型");
        map1.put("count", "提现笔数");
        map1.put("amount", "提现金额");
        map1.put("fee", "手续费");
        map1.put("money", "到账金额");
        list3.add(map1);
        for (CashSummaryModel cashSummaryModel : excelDataModel.getCashSummaryModels()) {
            map1 = new HashMap<>();
            map1.put("count", cashSummaryModel.getCashCount());
            map1.put("amount", cashSummaryModel.getCashAmount());
            map1.put("fee", cashSummaryModel.getServiceCharge());
            map1.put("money", cashSummaryModel.getArrivalAccount());
            map1.put("type", cashSummaryModel.getCashType());
            list3.add(map1);
        }

        rowNO = eeu.createTransactiontype(sheet, rowNO, 300, list3, -1, null, "center");
        eeu.createExcelRow(workbook, sheet, rowNO, 300, 9,
                "提现对账明细", -1, "normal", "left", "1");
        rowNO++;
        List<String> list4 = new ArrayList<>();
        list4.add("提现日期");
        list4.add("提现时间");
        list4.add("提现流水号");
        list4.add("提现类型");
        list4.add("提现金额");
        list4.add("手续费");
        list4.add("到账金额");
        eeu.createTitleTixian(sheet, -1, rowNO, -1, 300, list4, -1, null, null);
        rowNO++;
        for (CashReconciliationDetailsModel cashReconciliationDetailsModel : excelDataModel.getCashReconciliationDetailsModels()) {
            List<String> cashReconciliationDetailsModels = new ArrayList<>();
            cashReconciliationDetailsModels.add(cashReconciliationDetailsModel.getCashDate());
            cashReconciliationDetailsModels.add(cashReconciliationDetailsModel.getCashTime());
            cashReconciliationDetailsModels.add(cashReconciliationDetailsModel.getCashNo());
            cashReconciliationDetailsModels.add(cashReconciliationDetailsModel.getCashType());
            cashReconciliationDetailsModels.add(cashReconciliationDetailsModel.getCashAmount());
            cashReconciliationDetailsModels.add(cashReconciliationDetailsModel.getServiceCharge());
            cashReconciliationDetailsModels.add(cashReconciliationDetailsModel.getArrivalAccount());
            eeu.createTitleTixian(sheet, -1, rowNO, -1, 300, cashReconciliationDetailsModels, -1, null, null);
            rowNO++;
        }

        eeu.createExcelRow(workbook, sheet, rowNO, 300, 9,
                excelDataModel.getSummary(), -1, "normal", "left", "1");
//        eeu.exportExcel(out);
        return workbook;
//  /*
//  在用java 编写生成报表时发现了个问题，将行，列隐藏，将列隐藏很简单用
//    this.sheet.setColumnHidden((short)12, true);将第13列隐藏注意excel的第一列用0表示
//
//  隐藏行：
//
//  HSSFRow row     = sheet.getRow(8);
//      row.setZeroHeight(true);
//
//  将第8行隐藏就是将他的高度设为0也等同为隐藏
//*/
    }

}
