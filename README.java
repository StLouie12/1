1
=
package javaapplication1; /*это класс,
в котором есть методы для получения переменных и суммирования*/
public class JavaApplication1 { /*объявление класса (общий доступ) */
private static float sum=0; /*инициализация переменной для подсчета суммы*/
private static float last_result=0; /*инициализация временной переменной */
private static mainframe mainframe = new mainframe(); /*объявление класса mainframe, доступного только в пределах данного класса */
public static void main(String[] args) { /*входная точка */
mainframe.setVisible(true); /*условие открытия майнфрейма */
} /*окончание задавания входной точки */
public static void add(float param){ /*метод суммирования */
sum += param; /*нажатие на плюс */    
} /*закрытие метода */
public static void setSum(float sum) { /*создание сеттера */
JavaApplication1.sum = sum; /*делает доступным только внутри объекта */
} /*закрытие сеттера */
public static float getSum() { /*Получение суммы для вывода */
return sum; /*возвращение суммы */
} /*окончание метода */
public static float getLast_result() { /*объявление временной переменной */
return last_result; /*получение временной переменной для подсчета */
} /*окончание объявления */
public static void setLast_result(float last_result) { /*объявление временной переменной */
JavaApplication1.last_result = last_result; /*установка временной переменной */
} /*закрытие установки временной переменной */
} /*окончание класса */
Курсовая работа
