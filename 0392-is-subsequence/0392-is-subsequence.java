class Solution {
    public boolean isSubsequence(String s, String t) {
        //understand
        //character limit for s & t?
        //space/time constraints

        //match-- char arrays, 2 for loops

        //plan
        //outer loop goes thru s and checks every char of t
        //inner loop every character of t for match before outer loop increments

        //implement

        //edge case
        if(s.length() == 0) {
            return true;
        }

        //s substring
        char[] sArray = s.toCharArray();
        //t main string
        char[] tArray = t.toCharArray();
        int sCounter = 0;

        // System.out.println("tArray.length: " + tArray.length);
        // System.out.println("tArray[0]: " + tArray[0]);
        // System.out.println("sArray[sCounter]: " + sArray[sCounter]);

            for(int i = 0; i < tArray.length; i++) {
                if(sCounter < sArray.length) {
                    if(sArray[sCounter] == tArray[i]) {
                        System.out.println("sArray[sCounter]: " + sArray[sCounter]);
                        System.out.println("tArray[i]: " + tArray[i]);
                    
                        sCounter++;
                    }
                }
                else {
                    break;
                }
            }

        if(sCounter == sArray.length) {
            return true;
        }
        return false;
    }
}