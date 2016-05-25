package 两日期相差小时;

import java.text.SimpleDateFormat;

public class Test2 {
	public static void main(String[] args) {
		SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		long between = 0;
		long nowBetween = 0;
		try {
			java.util.Date begin = dfs.parse("2009-07-10 10:22:21.214");
			java.util.Date end = dfs.parse("2009-07-20 11:24:49.145");
			between = (end.getTime() - begin.getTime());// 得到两者的毫秒数

			java.util.Date begin2 = dfs.parse("2009-07-10 10:22:21.214");
			java.util.Date end2 = dfs.parse("2009-07-19 11:24:49.145");
			nowBetween = (end2.getTime() - begin2.getTime());// 得到两者的毫秒数
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// 比值
		Double percent = (double) nowBetween / between;
		System.out.println(percent);
	}
}
