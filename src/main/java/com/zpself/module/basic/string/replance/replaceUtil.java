package com.zpself.module.basic.string.replance;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author zengpeng
 * @date 2019/6/10
 */
public class replaceUtil {
    public static void main(String[] args) {
        //String s = changeExpression("get(部门,`审查阶段:年初预算`,`数据类型:支出`,年份)", new HashMap<>(2));
        //replaceTwo();
        replaceThree();

        //sliptString("一般公共预算(审查阶段()：年初预算，功能科目名称：税收收入)");
    }

    private static void sliptString(String s) {
        String name = s.substring(s.indexOf("(")+1,s.lastIndexOf(")"));
        System.out.println(name);
    }
    /**
     *     @ 税收收入
     * #支付金额函数(月份:Between(1,{月份}))
     */
    private static void replaceThree() {
        StringBuilder sb = new StringBuilder("function(year=2019)+((1/12)-1)+3+4a+5a+6a+7a+8+9a+10a+11+12a ");
        String regex = "(\\d+?)[+\\-*/]";
        List<Integer> list = new ArrayList<>(16);
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(sb);
        while (m.find()) {
            String group = m.group(1);
            System.out.println(group);
            String regexNumber = "\\d+?";
            if(group.matches(regexNumber)){
                int end = m.end();
                list.add(end-1);
            }

        }
        for (int i=list.size()-1;i>=0; i--) {
            Integer integer = list.get(i);
            System.out.println(sb.charAt(list.get(i)));
            sb.insert(integer,"M");
        }
        System.out.println("转换结果为："+sb.toString());
    }

    /**
     *     @ 税收收入
     * #支付金额函数(月份:Between(1,{月份}))
     */
    private static void replaceTwo() {
        String target = "支付金额函数(月份:BETWEEN(1,{月份}),年份：五123)";
        String regex = "BETWEEN\\((.+?)\\)";
        Set<String> set = new HashSet<>(1);
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(target);
        while (m.find()) {
            set.add(m.group());
        }
        for (String s : set) {
            if(s.contains("(")&& s.contains(")")){
                String newString= s.substring(s.indexOf("("),s.indexOf(")"));
                String[] split = newString.split(",");

            }
        }
        System.out.println(set);
        System.out.println("转换结果为："+target);
    }


    /**
     * 将：get(部门，'审查阶段:年初预算'，`数据类型:支出`，年份) 解析
     * 为：get(部门，审查阶段，数据类型，年份)
     * @param expression 原始表达式
     * @param expressionParams 原始表达式 的参数集合
     * @return 转换后的表达式
     */
    private static String changeExpression(String expression, Map<String, Object> expressionParams) {
        String[] strArr = expression.split(",");
        for (String str : strArr) {
            if(str.contains("`")){
                String strDelete=  str.replace("`","");
                String[] strArr2 = strDelete.split(":");
                if(strArr2.length==2){
                    expressionParams.put(strArr2[0],strArr2[1]);
                    expression = expression.replace(str,strArr2[0]);
                }
            }
        }
        return expression;
    }


    private static Integer change(Integer a){
        a =a+1;
        return a;
    }
    /**
     * 1.写死的{* }的替换：如  getvalue(人大{year},财政收入{shouRu})
     * 2.获取string[] { "{year}","{shouRu}"}
     * 3.从map中得到需要替换为  “年”，"收入"
     */
    private static void replace(){
        //step1 准备参数
        String target = "getValue({year}人大{year},财政收入{income},{income123},{income678})";
        // String target = "getValue(2019,123,1000000)";

        Map<String,String> map = new HashMap<>(2);
        map.put("{year}","2019");
        map.put("{income}","100万元");
        //step2 替换
        String rgex = "\\{(.*?)}";

        Set<String> set = new HashSet<>(1);
        Pattern pattern = Pattern.compile(rgex);
        Matcher m = pattern.matcher(target);
        while (m.find()) {
            set.add(m.group());
        }
        System.out.println(set);

        for (String s : set) {
            if(map.containsKey(s)){
                target = target.replace(s, map.get(s));
            }
        }
        System.out.println("转换结果为："+target);
    }



}
