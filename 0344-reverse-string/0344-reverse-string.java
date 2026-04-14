class Solution {
    public void reverseString(char[] s) {
        //take two pointer variables, start and end and point them with the two ends of the array.
        int start = 0;
        int end = s.length - 1;

        while(start < end) {
            //As we move the start pointer right and end pointer left, we swap the characters.
            char startChar = s[start];
            char endChar = s[end];

            s[start] = endChar;
            s[end] = startChar;

            start += 1;
            end -= 1;
        }

    }
}