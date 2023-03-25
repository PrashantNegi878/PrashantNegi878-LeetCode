class Solution {
    public int romanToInt(String s) {
    int answer = 0, number = 0, prev = 0;
    int[] map = new int[26];
    
        map['M'-'A'] = 1000;
        map['D'-'A'] = 500;
        map['C'-'A'] = 100;
        map['L'-'A'] = 50;
        map['X'-'A'] = 10;
        map['V'-'A'] = 5;
        map['I'-'A'] = 1;

    for (int j = s.length() - 1; j >= 0; j--) {

        number=map[s.charAt(j)-'A'];
        
        if (number < prev) {
            answer -= number;
        }
        else {
            answer += number;
        }
        prev = number;
    }
    return answer;
    }
}