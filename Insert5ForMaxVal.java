
public class Insert5ForMaxVal {
	public static int solution(int N) {
		boolean isNeg = (N<0);
        N=Math.abs(N);
        String input = String.valueOf(N);
        int len = input.length();
        char[] chArr = input.toCharArray();
        char[] res = new char[len+1];

        int i=0;
        while(i<len){
            if(Integer.parseInt(chArr[i]+"")<5 ){
                res[i]='5';
                break;
            }
            res[i]=chArr[i];
            i++;
        }
        if(i==len) {
        	if(isNeg) {
        		
        	}else {
        		res[len]='5';
        	}
        }
        while(i<len){
            res[i+1]=chArr[i];
            i++;
        }
    
        int op = Integer.valueOf(new String(res));
        if(isNeg) {
        	op = Math.negateExact(op);
        }

    return Integer.valueOf(new String(res));
    }
	
	void insert5AtBeg(char[] res) {
		for(int i=0;i<res.length;i++) {
//			char[i+1] = char[i];
		}
	}
	
	public static void main(String[] args) {
		System.out.println(solution(-999));
	}

}
