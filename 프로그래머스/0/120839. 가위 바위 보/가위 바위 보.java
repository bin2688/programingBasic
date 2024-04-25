class Solution {
	    public String solution(String rsp) {
	        String answer = "";
	        String[] arrRsp = rsp.split("");
	        
	        for (int i = 0; i < arrRsp.length; i++) {
				if (arrRsp[i].equals("0")) {
					answer += "5";
				}else if(arrRsp[i].equals("2")) {
					answer += "0";
				}else {
					answer += "2";
				}
			}	       	        
	        return answer;
	    }
	}