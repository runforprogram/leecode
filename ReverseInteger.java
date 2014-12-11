import java.awt.List;
import java.util.ArrayList;



/*
溢出：int 最大能够表示2147483648，假如输入的int为  1147483648 它的reverse 就溢出了。
//当int不断变大的时候，溢出会发生什么情况？

*/
public class ReverseInteger { 
	public static void main(String[] args) {
		
		int   inter=-143487509;
		int result=reverse(inter);
		System.out.println("result="+result);
		
	}
	public static int reverse(int inter){
		int interTmp=Math.abs(inter);
		long result=0;		
	    while(interTmp>0){
	    	int  diggit=interTmp%10;
	    	result=result*10+diggit;
	    /*	if (result==0) {
				return 0;
			}*/
	    	interTmp=interTmp/10;
	    }  
	    if (result>Integer.MAX_VALUE){
			return 0;
		}
	    if (inter<0) {
			result=-1*result;
		}
	    return (int)result;
	}
}
