package javaapplication1;
public class JavaApplication1
{
private static float sum=0;
private static float last_result=0;
private static mainframe mainframe = new mainframe();
public static void main(String[] args)
{ 
mainframe.setVisible(true);
}
public static void add(float param){
sum += param;
}
public static void setSum(float sum)
{
JavaApplication1.sum = sum;
}
public static float getSum()
{
return sum;
}
public static float getLast_result()
{
return last_result;
}
public static void setLast_result(float last_result)
{
JavaApplication1.last_result = last_result;
}
}
