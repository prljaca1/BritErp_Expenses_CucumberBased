package com.cybertek.step_definitions;


import com.cybertek.utilities.DataBaseUtility;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import java.util.Map;


public class testDATAbase {
  @BeforeClass
  public static void setup(){
    DataBaseUtility.createConnection();
  }
//    @Test
//    public void test1(){
//    List<Map<String,Object>>columnNames;
//      String sql="select * from employees;";
//       columnNames=DataBaseUtility.getQueryResultMap(sql);
//      System.out.println(columnNames);
//  }
  @Test
  public void test2(){
    List<Map<String,Object>>columnNames;
    String sql="Select name from hr_expense;";
    List<Object> List=DataBaseUtility.getColumnData(sql, "name");
    System.out.println(List);
  }
    @AfterClass
  public static void setdown(){
      DataBaseUtility.closeConnection();
    }
    }





