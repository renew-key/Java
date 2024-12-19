# 目錄

- [Java Class](#Java-Class)
- [Class Constructor](#Class-Constructor)
- [變數有效範圍 (Scope)](#變數有效範圍-Scope)
- [靜態屬性以及方法 (Static)](#靜態屬性以及方法-Static)
- [Java 修飾符](#Java-修飾符)
- [Method and Variable Modifier](#Method-and-Variable-Modifier)
- [Java 修飾符](#Java-修飾符)
- [封裝(Encapsulation)](#封裝Encapsulation)
- [Java 繼承](#Java-繼承)
- [多型 Polymorphism](#多型-Polymorphism)
- [抽象類 (Abstract Class)](#抽象類-Abstract-Class)
- [接口 (Interface)](#接口-Interface)
- [其他規則補充](#其他規則補充)
- [Common Exceptions](#Common-Exceptions)
- [Memory Leak](#Memory-Leak)
- [Garbage Collection in JVM](#Garbage-Collection-in-JVM)

## Java Class

現實世界中的物件(object, instance)有自己獨特的狀態(attribute)以及行為(behavior)。例如：車子有廠牌、價格、年份等等 attribute。另外，車子有夠向前走、左轉、右轉及鳴喇叭等等 behavior。

Java Class 是創建單個物件(object, instance)的藍圖(blueprint)。

創建物件的過程稱為實例化(instantiation)。

自製的 Class 都是 reference data type(或被稱為 Non-primitive data type)。

## Class Constructor

Java 中的 Constructor 是一種用於初始化對象的特殊方法。 創建類的對象時調用構造函數。 它可用於設置對象屬性的初始值。

1. Constructor 必須與 Class 名相同。
2. Constructor 用於製作新的物件。
3. Constructor 沒有任何返回類型。 （ 無論是 void、int、double、boolean 都不對）
4. 所有 Class 默認都有 Constructor ：如果我們不寫 Constructor ，Java 會為我們創建一個。 但是，您無法為 object 的屬性設置初始值。

## 變數有效範圍 (Scope)

在 Java 當中，變數的有效範圍被稱為 scope。

A Java field 是 a variable inside a class.

在 method 內 declare 的 variable 只能由大括號之間的代碼內部進行訪問。這些 variables 僅在本地可被辨識，因此稱為局部變量(local variable)。

在 for loop 內部寫的 for (int i = 0 …) 中的 i 也是一個 local variable。

## 靜態屬性以及方法 (Static)

在 Java 中，static 關鍵字主要用於內存管理。

Static 關鍵字用於共享給定 class 的所有物件一個共享的相同 variable 或 method。另外，我們可以透過 class 本身來訪問 static variable 或是執行 static method。

這個關鍵字被稱為“Static”，因為它不是動態的，這意味著它會於 Class 的所有 objects 總是相同的。因此，任何 static variable 和 method 都屬於 Class 本身。當我們使用 static variable 和 method 時，我們不需要先從 Class 中 instantiate 任何 object（例如: Java 內建的 Math 類有很多靜態變量和方法）

## Java 修飾符

修飾符(modifier)用於提供有關 Class 或 variable 的額外信息。Modifiers 被分成兩類：

1. 訪問修飾符 (access modifier)- 控制訪問級別。

2. 非訪問修飾符 (Non-Access Modifiers) – 不控制訪問級別，但提供其他功能。

Class 的 modifier 有以下兩個：

1. public – 屬於 access modifier。代表這個 Class 可以被任何其他 Class 訪問。

2. abstract – 屬於 Non-Access Modifiers。代表這個 class 是一個受限的 class ，不能用來創建 objects。 Abstract class 的目的是其他 class 可以繼承這個 class 。 例如，我有 animal class 是一個 abstract class ，則 dog class、cat class 和 elephant class 類都是繼承 animal class。

## Method and Variable Modifier

|                                | default | private | protected | public |
| ------------------------------ | ------- | ------- | --------- | ------ |
| Same Class                     | Yes     | Yes     | Yes       | Yes    |
| Same Package subclass          | Yes     | No      | Yes       | Yes    |
| Same Package non-subclass      | Yes     | No      | Yes       | Yes    |
| Different Package subclass     | No      | No      | Yes       | Yes    |
| Different Package non-subclass | No      | No      | Yes       | Yes    |

## Java 修飾符

以下修飾符可用於所有 methods 和 variables。

1. public (access modifier) – code 隨處可以 access。
2. private (access modifier) – code 只能在自己的 class 中 access。
3. protected (access modifier) – code 可以在同一個 package 和 subclass 訪問。
4. final (Non-Access Modifiers) – attributes 和 methods 不能被覆蓋/修改。
5. static (Non-Access Modifiers) – attributes 和 methods 屬於 class，而不是從這個 class 做 instantiation 的 objects。
6. abstract (Non-Access Modifiers) – 只能用在 abstract class 中，並且只能用在 methods 上。

## 封裝(Encapsulation)

封裝(Encapsulation)被定義為將數據包在一體。它是將代碼和它操作的數據綁定在一起的機制。考慮封裝的另一種方式是，它是一個保護屏障，可防止數據被該屏蔽之外的代碼訪問或是隨意更改。

我們通常會將 attributes 盡可能的設定成 private。若是要從外部更改獲釋存取，則使用 setter 和 getter methods。

## Java 繼承

在 Java 中，可以將 attributes 和 methods 從一個 class 繼承到另一個 class。這個過程稱過 inheritance。例如：我們可以製作一個 People class 當作父類，而 Student class 以及 Teacher class 都可以繼承自 People class。Inheritance 可以避免寫過多重複的程式碼！

1. subclass (子類) - 從另一個 class 繼承的 class。也被稱作 child class。

2. superclass (父類) - 繼承自的 class。也被稱作 parent class。

Child class 會比 parent class 有更多信息。通常，我們如果發現 … is a … 關係的話，就可以做 inheritance，例如：square is a rectangle。要從 Class 繼承，需要使用 extends 關鍵字。

另外，Java 只能做單一繼承(single inheritance)，代表一個 class 只能繼承最多一個 parent class。

Java 的 super 關鍵字是指 superclass object。Super 的用途在於：

1. 執行 superclass 的 constructor。
2. 執行 superclass 的 method。

Method Override 是指，我們可以在 child class 覆寫從 parent class 繼承過來的 method。使用時，需要用@Override。(請注意，這個不是 Method Overloading!)

另外，所有的 Java Class 都 inherit from java.lang.Object 這個 Class，只是在語法上面沒有任何標註。

## 多型 Polymorphism

在物件導向(Object-Oriented Programming)的程式語言當中，三個主要特性使其不同於非 OOP 語言為：

1. 封裝 (Encapsulation)
2. 繼承 (Inheritance)
3. 多態 (Polymorphism)
   Polymorphism means that a variable of supertype can refer to a subtype object!! 簡單來說，如果 x is a y，那麼我們就可以用 y 來 declare x 的 type。

   Polymorphism 的好處在於，如果我們 declare 一個 parent class variable，那麼這個 variable 可以用來裝任何的 subclass objects。

   Polymorphism 當中的一個概念叫做 動態綁定 (Dynamic Binding)。意思是指，object 執行 methods 時，所指向的 method 是由 Java Virtual Machine 在程式執行時所決定的，而不是在 compile 時決定的。

| 靜態綁定 Static Binding  | 動態綁定 Dynamic Binding |
| ------------------------ | ------------------------ |
| 發生在 compile time.     | 發生在 run time.         |
| 也稱為 early binding.    | 也稱為 late binding.     |
| 速度較快                 | 速度較慢                 |
| 例如：method overloading | 例如：method overriding  |

Polymorphism 是個生物學名詞， 指一個物種的同一種群中存在兩種或多種明顯不同的表型。例如： 黑色美洲豹，黃色美洲豹。

Polymorphism 本質上是 Inheritance 概念的延伸。在物件導向程式語言當中，Class B, C 分別繼承自 Class A，並且 B, C 都能夠去做 Method Overriding。假定 Class B, C 都 override 一個叫做 hello() 的 method，並且 instantiate 變數 b, c。兩個物件都可以使用 Class A 來宣告變數，但兩個物件在執行 hello()的結果上，卻會有很大的差別。

物件 b, c 可被視為是同個物種，但在行為上卻不同，這個概念就如同生物學上的 Polymorphism 一樣。

## 抽象類 (Abstract Class)

Abstract Class 不允許 instantiate objects。

Java 中的 abstract method 是一種只有 method 定義但不包含 implementation 的 method。 沒有 method 主體的 method 稱為 abstract method 。 abstract method 只能存在於 Abstract Class 當中。

Abstract Class 可以混合使用 abstract 和 non-abstract methods。 所有 Abstract Class 的 subclass 必須要 override 其 abstract super class 的所有 abstract method。

** Abstract Class 無法做 instantiation，不過還是可以作為一種 data type，用來做 Polymorphism。**

** 如果 Abstract Class 永遠無法做 instantiation，那麼 Abstract Class 中的 constructor 的目的是什麼？ 這是因為 constructor 可以通過透過 super() 被 subclass 使用。**

## 接口 (Interface)

在 Java 中做 Abstract Class 的另一種方法是使用 Interface。 Interface 是一個 complete abstract class，代表所有內部的 method 都是 abstract methods。
重點特性包含：

1. Interface 內部的所有 method 默認都是 abstract method，所以我們不需要寫”abstract”。
2. 與 abstract class 一樣， Interface 不能用於創建 objects。
3. 在 implement Interface 時，我們必須 Override 所有的 methods。
4. Interface 的所有 properties 預設為 public、static 和 final。
5. 一個 class 可以 implement 超過一個 Interface 。
6. 如果有個 class implement 了一個 Interface ，那麼該 class 的所有 object 都是該 Interface 的一個 object。
7. Interface 不能包含 constructor。
8. Java 不支持 multiple inheritance。 但是，一個 class 可以 implement 多個 Interface 。
9. Interface 無法做 instantiation，不過還是可以作為一種 data type，用來做 Polymorphism。

|              | Regular Class                                               | Abstract Class                                                        | Interface                                            |
| ------------ | ----------------------------------------------------------- | --------------------------------------------------------------------- | ---------------------------------------------------- |
| Method Types | 只能是 regular methods                                      | 可以有 abstract methods 或是 regular methods                          | 只能是 abstract methods                              |
| Inheritance  | Extends 最多一個 parent class                               | Can be superclass of many subclass                                    | 一個 class 可以 implement 許多 interface             |
| Override     | Child class 可以選擇要不要 Override parent class 的 methods | Subclass 一定要 override 所有 abstract superclass 的 abstract methods | Subclass 一定要 override 所有 interface 中的 methods |

## 其他規則補充

1. 在 Polymorphism 當中，一個變數宣告為 superclass 物件的話，則此物件就只能呼叫 superclass 中定義的 methods，不能呼叫 subclass 當中特有的 methods，除非透過轉型（Type Casting）。
2. A subclass does not inherit the private methods of its parent class.
3. When overriding a method, we can increase access but cannot decrease it.
4. An overriding method can also return a subtype of the type returned by the overridden method. This subtype is called a covariant return type.

當一個 Class 繼承另一個 Class 時，我們說這兩個 Class 之間存在 "is-a" 關係。這表示 subclass 是 parent class 的一種特殊型態，具有 parent class 的特性和行為。例如，當 Dog Class 使用 extends 來繼承 Animal Class 時，代表 Dog 是一種 Animal，我們可以說 "a Dog is an Animal"，這就是 "is-a" 關係的展現。

當我們 Override methods 時，access modifier 的可訪問性只能更大，不能更小。為何？To use the common description: B extends A if B is-a A. So if A can do action(), and B is-a A, then B should be able to do action() as well.

## Common Exceptions

NullPointerException 是指，當我們嘗試訪問尚未 instantiation 的 object 上的 fileds 或 invoke method 時，會發生的錯誤情況。

ConcurrentModification Error 是指，當一個 object 在不允許的情況下嘗試被同時修改時，會發生的錯誤情況。

## Memory Leak

內存洩漏(Memory Leak)是指，當一個 program 導致內存變得不可訪問時，該內存“洩漏”出我們可控制的池(範圍)。

於小程式，不處理 Memory Leak 不會有差別。 對於大型程式而言，會有非常大的影響。例如 Web 服務器，每天有數萬或數十萬個請求來。 幾週後，可能有數千萬個 objects 存儲在 RAM 中，但沒有任何用處，只會佔用記憶體。

Java 如何處理 Memory Leak？ JVM 中預裝了一個名為“Garbage Collector”的程式，用於檢查 objects 是否沒有指向它的 reference。

## Garbage Collection in JVM

概念整理：

1. Memory leaks are when our program no longer needs objects that it previously instantiated.
2. In C++, this can cause problems for long-running programs.
3. Java gc automatically cleans up unused objects and recycles the memory for other programs to use.
