class Solution {
    public String solution(String code) {
        int idx = 0, mode = 0;
        String ret = "";

        for(int i = 0; i < code.length(); i++) {
            if(code.charAt(i) == '1') {
                mode = Math.abs(mode - 1);
                continue;
            }
            if(mode == 0)
                if(i % 2 == 0)
                    ret += code.charAt(i);
            if(mode == 1)
                if(i % 2 == 1)
                    ret += code.charAt(i);
        }
        if(ret.isEmpty())
            ret = "EMPTY";
        return ret;
    }
}