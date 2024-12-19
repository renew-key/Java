# 目錄

- [函數 (Functions, Methods)](#函數-functions-methods)
- [Class 規則](#Class-規則)
- [變數與賦值](#變數與賦值)
- [常量(constants)](#常量-constants)
- [Java 常見資料類型](#Java-常見資料類型)
- [Primitive-Non-primitive-的資料類型](#Primitive-Non-primitive-的資料類型)
- [Relational and Conditional 運算子](#Relational-and-Conditional-運算子)
- [Arithmetic 運算子](#Arithmetic-運算子)
- [Java if statement](#Java-if-statement)
- [Java Switch Statement](#Java-Switch-Statement)
- [陣列(Array)以及動態陣列(Arraylist)](#陣列Array以及動態陣列Arraylist)
- [迴圈(Loop)](#迴圈Loop)
- [Java 使用者圖形介面](#Java-使用者圖形介面)
- [Java Method](#Java-Method)
- [Return Value 返回值](#Return-Value-返回值)
- [方法多載 (Method Overloading)](#方法多載-Method-Overloading)

## 函數 (Functions, Methods)

如果你是編程新手，我們可以先談談函數。
什麼是函數？ Java 中的函數類似於數學中的函數。

從你的數學課中回憶，一個函數是這樣的：

```math
𝑓(𝑥)=3𝑥+6
```

你有函數的名稱，一個輸入(input)，然後你得到一個輸出(output)。 此外，一個函數應該只返回一個值（如果一個 input 導致兩個不同的 output ，那麼 f(x)就不是一個函數。）

同樣的概念也適用於 Java 函數。 在 Java 函數中，我們可以提供或不提供任何 input ； 然後，我們從該函數獲得一個 output 。

## Class 規則

1. Class 名稱一定要跟文件名稱相同。
2. Class 名稱一定要大寫英文字母當開頭。
3. public static void main(String[] args) 會被執行。這是 Java 的規定，每個字都不能少。

## 變數與賦值

變數(variable)和賦值(assignment)是任何程式語言中的一些基本概念。變數就像我們存儲值的容器。由於變數內部的值可以不斷改變，它被稱之為『變數』。

Java 當中的等號 與數學中使用的等號概念不同！！！ 在 Java 中，等號是“賦值”，意思是要把等號右邊的數據放到等號左邊； 因此，我們可以這樣做：

```math
x = 5, x = x + 1
```

經過執行之後，x 的值會變成 6。

- 語法糖是將 x = x + 1 更改為 x += 1。這在 Java 中極為常見。
- 變數名稱可以由英文、數字、底線以及$構成，但不能由數字當開頭。但變數名稱不能為 Java 關鍵字(reserved words)。

## 常量(constants)

我們可以定義不能改變的量，稱為常量(constants)。
在 Java 的 variable declaration 當中加入 final keyword，就可以把設定 constant varaible。
另外，寫程式者習慣(非強迫性)的會把 constants 全部用大寫英文字母表示。

```java
public class Example {
    public static void main(String[] args) {
           final double PI =3.14 ;
      }
}
```

其他命名規範或是習慣包含：

1. ClassName 使用駝峰命名法(camelCase)，開頭第一個字的第一個字母和後面的第一個字的字母要大小
   例: FirstName
2. variables 使用駝峰命名法(camelCase) if needed and start with a lowercase letter.
   例: firstName
3. CONSTANTS 通常會用全大小，單字和單字之間用`-`來連接。
   例: MAX_VALUE.

## Java 常見資料類型

| 資料類型    | 描述                                                              | 範例                                 |
| ----------- | ----------------------------------------------------------------- | ------------------------------------ |
| **var**     | 可用於任何資料類型。                                              | `var x = 5;`（編譯器會自動推斷類型） |
| **int**     | Integer 整數。使用 32bits 儲存數據。                              | `int age = 25;`                      |
| **long**    | 整數，但使用 64bits 儲存數據。                                    | `long population = 7800000000L;`     |
| **double**  | 帶有小數點的數。使用 64bits 儲存數據，因此，精確度較 float 更高。 | `double pi = 3.141592653589793;`     |
| **float**   | 帶有小數點的數。使用 32bits 儲存數據。                            | `float height = 5.9f;`               |
| **char**    | Character 單一字母。需使用單引號。                                | `char grade = 'A';`                  |
| **String**  | a sequence of characters. 字串。需使用雙引號。                    | `String greeting = "Hello, world!";` |
| **boolean** | true 或是 false.                                                  | `boolean isActive = true;`           |

**使用 var 有兩個限制：**

1. 不能用在 fields（類別成員變數）。
2. 不能在沒有初始值的變數上使用。

> 類別成員變數，也就是定義在類別中的變數，但不屬於任何方法或區域範圍。它們通常用來儲存對象的屬性或狀態。

```java
public class Example {
    // 這是一個 field（類別成員變數）
    private int age;

    public Example(int age) {
        this.age = age; // 設定 field 的值
    }

    public int getAge() {
        return age; // 讀取 field 的值
    }
}
```

## Primitive 和 Non-primitive 的資料類型

Primitive : byte, short, int, long, float, double, boolean, char

除了以上八種是 Primitive 其餘的都是 Non-primitive

Non-primitive : String, Array, Arraylist, Class

| 資料類型    | 類型          | 範例                                          |
| ----------- | ------------- | --------------------------------------------- |
| `byte`      | Primitive     | `byte b = 127;`                               |
| `short`     | Primitive     | `short s = 32000;`                            |
| `int`       | Primitive     | `int num = 42;`                               |
| `long`      | Primitive     | `long bigNum = 123L;`                         |
| `float`     | Primitive     | `float pi = 3.14f;`                           |
| `double`    | Primitive     | `double d = 3.1415;`                          |
| `boolean`   | Primitive     | `boolean isTrue = true;`                      |
| `char`      | Primitive     | `char symbol = 'A';`                          |
| `String`    | Non-primitive | `String str = "Hello";`                       |
| `Array`     | Non-primitive | `String[] arr = {"one", "two"};`              |
| `ArrayList` | Non-primitive | `ArrayList<String> list = new ArrayList<>();` |
| `Class`     | Non-primitive | `Class<?> clazz = String.class;`              |

**注意！！在 Java 當中的 Non-primitive 資料類型都是大寫開頭， Primitive 類型都是由小寫開頭。因此，我們可以透過第一個字母的大小寫來判斷資料的性質！**

## Relational and Conditional 運算子

Java 當中的 Relational and Condition 運算子(operator)會根據 operands 的值，return 給我們一個 boolean 的值。

常見的 Relational Operator 包含： ==, !=, >, <, >=, <=.

常見的 Conditional Operator 則包含&&, || 等等。

1. ==用於 primitive data type 間的比較。
2. .equals()則用於 non-primitive data type 間的比較。

## Arithmetic 運算子

Java 當中的 Arithmetic Operator 最主要用來做數字運算。常見的運算有：

1. number + number ⇒ addition

- **Java 範例：**
  ```java
  public class Main {
      public static void main(String[] args) {
          int result = 5 + 3;
          System.out.println(result);  // 輸出: 8
      }
  }
  ```

2. string + string ⇒ concatenation

```java
public class Main {
    public static void main(String[] args) {
        String result = "Hello " + "World";
        System.out.println(result);  // 輸出: Hello World
    }
}
```

3. number + string ⇒ concatenation (it's not valid in python.)

```java
public class Main {
    public static void main(String[] args) {
        String result = 5 + "Hello";
        System.out.println(result);  // 輸出: 5Hello
    }
}
```

4. number \* number ⇒ multiplication

```java
public class Main {
    public static void main(String[] args) {
        int result = 4 * 3;
        System.out.println(result);  // 輸出: 12
    }
}
```

5. number \* string ⇒ not valid (it's valid in python)

```java
public class Main {
    public static void main(String[] args) {
        // Java 中不支援這樣的操作
        String result = "Hello" * 3;  // 編譯錯誤: cannot find symbol
    }
}
```

6. int / int ⇒ gives you only integer result (ex. 10/3 = 3. 6/7 = 0)

```java
public class Main {
    public static void main(String[] args) {
        int result = 10 / 3;
        System.out.println(result);  // 輸出: 3
    }
}
```

7. float / int ⇒ gives you a floating result

```java
public class Main {
    public static void main(String[] args) {
        double result = 10.0 / 3;
        System.out.println(result);  // 輸出: 3.3333333333333335
    }
}
```

## Java if statement

Java if 語句是最簡單的決策語句。 它用於決定是否執行某個語句或語句塊，即如果某個條件為真，則執行一個語句塊，否則不執行。

## Java Switch Statement

我們可以把 long if-else if-else statement 使用 switch statement 來做替換。以下為使用 Switch Statement 的幾個限制：

1. 只能用來比較一個 variable
2. 只能用於==, 其餘的 <, >, >=, <= 皆不支援
3. 只能用在 int, chars, Strings, or enums
4. && is not allowed, but || is okay
5. It has a feature called “fall through”, which can be prevented by using “break”.

## 陣列(Array)以及動態陣列(Arraylist)

Array 用於在單個變量中存儲多個值，而不是為每個值 declare 單獨的變量。 要 declare 一個 Array ，請用方括號[] 定義變量類型。
ArrayList 是一個可調整大小的 Array ，可以在 java.util.ArrayList 中找到。 Java 的 Array 和 ArrayList 的區別在於， Array 的大小不能修改（如果要向 Array 中添加或刪減總元素數量，則必須創建一個新數組）。

## 迴圈(Loop)

Java for 迴圈是一個控制語句，它多次重複執行 Java 程式當中的某一部分。 Java while 迴圈也是一個控制流語句，它根據給定的 boolean 條件重複執行 Java 程式當中的某一部分。
當我們在一個迴圈內部放置另一個迴圈的情況，就被稱之為巢狀迴圈(Nested Loop)。

## Java 使用者圖形介面

Swing 是一個用於 Java 的 GUI 小部件工具包；用於為 Java 程序提供圖形用戶界面 (GUI) 的 API。

## Java Method

Method 是一段代碼，只有在被調用時才會運行。 您可以將數據（稱為參數 parameter）傳遞給方法。 method 用於執行某些操作，它們也稱為函數。

- 一個 method 的組成分成:
  - 修飾符 (modifier)
  - 返回類型 (return type)
  - 名稱 (name)
  - 參數列表 (formal parameter or parameter list)

**定義 methods 時使用 formal parameter，而執行 methods 時使用 actual parameter.**

## Return Value 返回值

Java return 關鍵字退出 method 並指示 Java 繼續執行主程序。 return 關鍵字可以將 method 所指定的值發送回主程序； 返回值可以是 void, 字符串、整數、浮點數或 reference data type。

幾個注意事項：

1. 如果 return 關鍵字放在迴圈中，它將終止所有迴圈的進行。
2. 在 return 之下的 method 內部的程式碼全部都不會被執行。
3. 一個 method 只能夠一次 return 一個值。

## 方法多載 (Method Overloading)

一個 method 的簽名(signature)是 指 method 的 name + parameter type and order 用以決定 method 的唯一性。

方法多載 ：當我們有多個具有相同名稱但參數類型不同的 method 時（換句話說，不同的簽名），我們就是在使用 method overloading。

```java
public class Main {
      public Main() {}
        public void add(int a, int b) {
            System.out.println(a+b);
        }
        public void add(String a, String b) {
            System.out.println(a+' '+b);
        }}
    }
    public static void main(String[] args) {
        Main m = new Main();
        //JAVA會自行去判斷
        m.add(1,2);
        m.add("Hello","world");
    }
}
```
