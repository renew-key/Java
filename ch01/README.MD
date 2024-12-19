# 撰寫第一支 Java 程式

1. 先新增一個檔案，名為"Main.java"

> 注意:檔案名稱的第一個字一定要為大寫，並且要和class的名稱相同

2. 用記事本打開"Main.java"，在裡面輸入

```java
public class Main{
	public static void main(String[] args){
		System.out.println("Hello World");
	}
}
```

3. 開啟命令提示字元(cmd/ternminal)，把目錄導向存放'Main.java'檔案裡

> 可用`dir`或`ls`指令來尋找目錄

4. 在此目錄底下打 complier 指令

```shell
javac Main.java
```

> 此時就會 complier 出一個.class 的檔案，這個檔案才能讓電腦看得動

5. 打下列指令執行'Main.class'

```java
java Main
```

6. 會在剛剛這行指令下面出現`Hello World`，代表執行成功
