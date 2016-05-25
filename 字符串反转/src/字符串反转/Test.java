package 字符串反转;

public class Test {

	public static void main(String[] args) {
		String a = "a,b,c,d,e,f,g,h,i,g,k,l,m,n,o,p,q,r,s,t,u,v,x,y,z";
		StringBuffer b = new StringBuffer();
		for (int i = 0; i < a.length(); i++) {
			b = b.append(a.charAt((a.length()-1) - i));
		}
		System.out.println(b);
	}
}
