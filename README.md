计182 2018310769 刘孟琛
实验分析：
一、要求：
1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.允许提供输入参数，统计古诗中某个字或词出现的次数
3.考虑操作中可能出现的异常，在程序中设计异常处理程序
二、分步分析：
1.格式改变：
（1）获取用户输入：
System.out.println("请输入古诗");
String line = sc.nextLine();
（2）定义：
String result = "";
char[] chs = line.toCharArray();
（3)判断用户的输入是否符合格式如不符合则提示用户重新输入：
		int o=0;
		while(o<1) {
			if(chs.length%7==0) {
				o=1;
			}
			else {
				System.out.println("对不起，您输入的信息不符合格式");
				sc = new Scanner(System.in);
				System.out.println("请重新输入古诗");
				line = sc.nextLine();
				result = "";
				chs = line.toCharArray();
				o=0;
			}
			for (int x = 0; x<= chs.length - 1; x++) {
				result += chs[x];
			}
		}
（4）改变格式，插入，和。：
for (int i = 0; i<= chs.length - 1; i++) {
			int j=(i+1)/7;
			System.out.print(chs[i]);
			if((i+1)%7==0) {
				if(j % 2==1)
					System.out.print("，");
				if(j % 2==0)
					System.out.println("。");
			}
		}
2.查找字词：
（1）获取用户输入：
System.out.println("请输入要查找的字或词");;
line = sc.nextLine();
（2）定义：
String Result = "";
char[] cha = line.toCharArray();
（3）遍历全文，寻找与用户的输入一样的信息：
for (int x = 0; x<= cha.length - 1; x++) {
			Result += cha[x];
		}
		int sum=0;
		for (int i = 0; i<= chs.length - 1; i++) {
			if (cha[0]==chs[i])
				for (int j = 0; j<= cha.length - 1; j++) {
					if (cha[j]==chs[i+j])
						sum=sum+1;
					else
						sum=sum;
				}
			else
				sum=sum;
		}
		sum=sum/cha.length;
（4）输出结果：
		System.out.println("所查找的字或词在诗中的数目是："+sum);
		System.out.println("再见！");

三、程序运行截图：
![截图](https://github.com/hbtqllmc/lmcsy4/blob/master/690052555994b1955bcc8ac036523e6.png)










