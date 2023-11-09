/**
 * DO NOT EDIT THIS FILE 
 * author: Ronny Hartanto (2022)
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestExercise04a {

   @Test
   public void test01()
   {
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));
      double[] value = {1.0,2.0,3.0,4.0,5.0};
      MyArray arr0 = new MyArray();
      MyArray arr1 = new MyArray(value);
      MyArray arr2 = new MyArray(arr1);
      assertEquals(0, arr0.getSize());
      assertEquals(5, arr1.getSize());
      assertEquals(5, arr2.getSize());
      arr1.addValue(6.0);
      assertEquals(6, arr1.getSize());
      assertEquals(5, arr2.getSize());
      assertEquals(3.0, arr1.getValueAt(2));
      assertEquals(3.0, arr2.getValueAt(2));
      value[2] = 10.0;
      assertEquals(3.0, arr1.getValueAt(2));
      assertEquals(3.0, arr2.getValueAt(2));
      arr1.setValueAt(2,5.0);
      assertEquals(5.0, arr1.getValueAt(2));
      assertEquals(3.0, arr2.getValueAt(2));
      assertEquals(6.0, arr1.getValueAt(5));
      System.setOut(originalOut);
   }   
   @Test
   public void test02()
   {
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));
      double[] value = {1.0,2.0,3.0,4.0,5.0};
      MyArray arr0 = new MyArray();
      MyArray arr1 = new MyArray(value);
      MyArray arr2 = new MyArray(arr1);
      assertEquals(0, arr0.getSize());
      assertEquals(5, arr1.getSize());
      assertEquals(5, arr2.getSize());
      assertEquals(-1, arr0.getValueAt(2));
      assertEquals(-1, arr1.getValueAt(6));
      arr1.addValue(6.0);
      assertEquals(6, arr1.getSize());
      assertEquals(5, arr2.getSize());
      assertEquals(3.0, arr1.getValueAt(2));
      assertEquals(3.0, arr2.getValueAt(2));
      value[2] = 10.0;
      assertEquals(3.0, arr1.getValueAt(2));
      assertEquals(3.0, arr2.getValueAt(2));
      arr1.setValueAt(2,5.0);
      assertEquals(5.0, arr1.getValueAt(2));
      assertEquals(3.0, arr2.getValueAt(2));
      assertEquals(6.0, arr1.getValueAt(5));      
      arr0.setValueAt(0,20.0);
      for (int i=1; i<=5; i++) {
         arr0.addValue((double) i);
      } 
      assertEquals(5, arr0.getSize());
      assertEquals(3.0, arr0.getValueAt(2));
      assertEquals(5.0, arr0.getValueAt(4));
      System.setOut(originalOut);
   }
   @Test
   public void test03()
   {
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));
      double[] value = {1.0,2.0,3.0,4.0,5.0};
      MyArray arr0 = new MyArray();
      MyArray arr1 = new MyArray(value);
      MyArray arr2 = new MyArray(arr1);
      assertEquals(0, arr0.getSize());
      assertEquals(5, arr1.getSize());
      assertEquals(5, arr2.getSize());
      assertEquals(-1, arr0.getValueAt(2));
      assertEquals(-1, arr1.getValueAt(6));
      arr1.addValue(6.0);
      assertEquals(6, arr1.getSize());
      assertEquals(5, arr2.getSize());
      assertEquals(3.0, arr1.getValueAt(2));
      assertEquals(3.0, arr2.getValueAt(2));
      value[2] = 10.0;
      assertEquals(3.0, arr1.getValueAt(2));
      assertEquals(3.0, arr2.getValueAt(2));
      arr1.setValueAt(2,5.0);
      assertEquals(5.0, arr1.getValueAt(2));
      assertEquals(3.0, arr2.getValueAt(2));
      assertEquals(6.0, arr1.getValueAt(5));      
      arr0.setValueAt(0,20.0);
      for (int i=1; i<=5; i++) {
         arr0.addValue((double) i);
      } 
      assertEquals(5, arr0.getSize());
      assertEquals(3.0, arr0.getValueAt(2));
      assertEquals(5.0, arr0.getValueAt(4));
      assertTrue(arr0.equals(arr2));
      double[] value2 = arr0.getValues();
      MyArray arr3 = new MyArray(value2);
      assertTrue(arr2.equals(arr3));
      System.setOut(originalOut);
   }    
   @Test
   public void test04()
   {
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));
      double[] value = {1.0,2.0,3.0,4.0,5.0};
      MyArray arr0 = new MyArray();
      MyArray arr1 = new MyArray(value);
      MyArray arr2 = new MyArray(arr1);
      assertEquals(0, arr0.getSize());
      assertEquals(5, arr1.getSize());
      assertEquals(5, arr2.getSize());
      assertEquals(-1, arr0.getValueAt(2));
      assertEquals(-1, arr1.getValueAt(6));
      arr1.addValue(6.0);
      assertEquals(6, arr1.getSize());
      assertEquals(5, arr2.getSize());
      assertEquals(3.0, arr1.getValueAt(2));
      assertEquals(3.0, arr2.getValueAt(2));
      value[2] = 10.0;
      assertEquals(3.0, arr1.getValueAt(2));
      assertEquals(3.0, arr2.getValueAt(2));
      arr1.setValueAt(2,5.0);
      assertEquals(5.0, arr1.getValueAt(2));
      assertEquals(3.0, arr2.getValueAt(2));
      assertEquals(6.0, arr1.getValueAt(5));      
      arr0.setValueAt(0,20.0);
      for (int i=1; i<=100; i++) {
         arr0.addValue((double) i);
      } 
      assertEquals(100, arr0.getSize());
      assertEquals(3.0, arr0.getValueAt(2));
      assertEquals(5.0, arr0.getValueAt(4));
      assertFalse(arr0.equals(arr2));
      double[] value2 = arr0.getPartialArray(0,4);
      MyArray arr3 = new MyArray(value2);
      assertTrue(arr2.equals(arr3));
      System.setOut(originalOut);
   }  
   @Test
   public void test05()
   {
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));
      double[] value = {2.0,5.0,1.0,3.0,4.0};
      MyArray arr0 = new MyArray();
      MyArray arr1 = new MyArray(value);
      MyArray arr2 = new MyArray(arr1);
      assertEquals(0, arr0.getSize());
      assertEquals(5, arr1.getSize());
      assertEquals(5, arr2.getSize());
      assertEquals(-1, arr0.getValueAt(2));
      assertEquals(-1, arr1.getValueAt(6));
      arr0.setValueAt(0,20.0);
      for (int i=1; i<=5; i++) {
         arr0.addValue((double) i);
      } 
      assertEquals(5, arr0.getSize());
      assertEquals(3.0, arr0.getValueAt(2));
      assertEquals(5.0, arr0.getValueAt(4));
      assertFalse(arr0.equals(arr2));
      double[] value2 = arr2.getSortedArray();
      MyArray arr3 = new MyArray(value2);
      assertTrue(arr0.equals(arr3));
      System.setOut(originalOut);
   }   
   @Test
   public void test06()
   {
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));
      double[] value = {2.0,5.0,1.0,3.0,4.0};
      MyArray arr0 = new MyArray();
      MyArray arr1 = new MyArray(value);
      MyArray arr2 = new MyArray(arr1);
      assertEquals(0, arr0.getSize());
      assertEquals(5, arr1.getSize());
      assertEquals(5, arr2.getSize());
      assertEquals(3.0, arr1.getMean());
      assertEquals(3.0, arr1.getMedian());
      assertEquals(1.0, arr1.getMin());
      assertEquals(5.0, arr1.getMax());
      assertEquals(-1, arr0.getValueAt(2));
      assertEquals(-1, arr1.getValueAt(6));
      arr0.setValueAt(0,20.0);
      for (int i=1; i<=200; i++) {
         arr0.addValue((double) i);
      } 
      assertEquals(100.50, arr0.getMean());
      assertEquals(100.50, arr0.getMedian());
      assertEquals(1.0, arr0.getMin());
      assertEquals(200.0, arr0.getMax());
      arr0.setValueAt(0,200);
      arr0.setValueAt(99,-100);
      assertEquals(100.495, arr0.getMean());
      assertEquals(101.50, arr0.getMedian());
      assertEquals(-100.0, arr0.getMin());
      assertEquals(200.0, arr0.getMax());      
      System.setOut(originalOut);
   }  
}
