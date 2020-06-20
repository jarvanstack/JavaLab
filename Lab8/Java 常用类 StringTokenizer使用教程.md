
### StringTokenizer 字符串分词器，用于将字符串进行分割和遍历，非常地方便
### 一、学习一个类先学习它的构造方法.此处3个构造方法。
看文档。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200507082925912.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2phcnZhbjU=,size_16,color_FFFFFF,t_70)
3个构造方法
#### 1. StringTokenizer stringTokenizer = new StringTokenizer(String str);
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200507083208385.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2phcnZhbjU=,size_16,color_FFFFFF,t_70)

**最常用的构造方法，默认分割符为." \t\n\r\f" ：空格字符，制表符，换行字符，回车字符和换页符 **


#### 2.public StringTokenizer(String str, String delim)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200507083519106.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2phcnZhbjU=,size_16,color_FFFFFF,t_70)
**delim 为自所有权限public --private分割符 比如 ，**
```java
String string  = "半，亩，方，糖";
StringTokenizer stringTokenizer = new StringTokenizer(string,"，");
while(stringTokenizer.hasMoreElements()){
    System.out.println(stringTokenizer.nextToken());
}
```
输出：
半
亩
方
糖
#### 3.public StringTokenizer(String str, String delim,boolean returnDelims)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200507090155666.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2phcnZhbjU=,size_16,color_FFFFFF,t_70)
**returnDelims 参数表示是否返回分割符号,比如**
```java
String string  = "半，亩，方，糖";
StringTokenizer stringTokenizer = new StringTokenizer(string,"，",true);
while(stringTokenizer.hasMoreElements()){
    System.out.println(stringTokenizer.nextToken());
}
```
output:
半
，
亩
，
方
，
糖

Process finished with exit code 0

### 二、其次学习它的字段Field,(StringTokenizer没有字段Field略过)
### 三、学习常用方法,3个类型的方法.，计数，测试是否还有元素，指针指向下一个元素、

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200507090751410.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2phcnZhbjU=,size_16,color_FFFFFF,t_70)
#### 1. 计数：int contToken() ：计算nextToken 的次数,
#### 2.是否还有元素可用：boolean hasMoreElement() ：是否还有元素可用，
源码解释： hasMoreElements()就返回 hasMoreTokens() 2者一致。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200507091141252.png)

#### boolean hasMoreToken() 和2用法一样。

#### 3.下一个元素：String nextElements(): 返回下一个元素
#### String nextTokens(): 和3 一致
#### String nextTokens(String demils); 把demils 变为分割符号，返回下一个.
#### 代码实例：
```java
 String string  = "半，亩，方，糖";
 StringTokenizer stringTokenizer = new StringTokenizer(string,"，",true);
 int times = stringTokenizer.countTokens();
 System.out.println("可遍历的次数为：times = "+times);
 while (stringTokenizer.hasMoreElements()){
     System.out.println(stringTokenizer.nextToken());
 }

```
output:

可遍历的次数为：times = 7
半
，
亩
，
方
，
糖
