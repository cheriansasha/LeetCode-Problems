class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<Character, Integer>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int n = s.length();
        char[] sArr = s.toCharArray();

        //store return value -> result
        int result = romanMap.get(sArr[n - 1]);

        //iterates from second-to-last char to first char
        for (int i = n - 2; i >= 0; i--) {
            //check if char at right of curr char is bigger or smaller
            if(romanMap.get(sArr[i]) >= romanMap.get(sArr[i + 1])) {
                result += romanMap.get(sArr[i]);
            }
            else {
                result -= romanMap.get(sArr[i]);
            }
        }

        return result;
    }
}