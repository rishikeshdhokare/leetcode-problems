class ChangingBase {
    public String solution(String numAsString, int b1, int b2) {
        if (b1 == b2) return numAsString;
            // base 10 to base x - divide
            // base x to base 10 - multiply
        else if (b1 == 10) {
            // divide by the b2 base number
            return convertB10ToB2(Integer.parseInt(numAsString), b2);
        } else if (b2 == 10) {
            // multiple
            return convertB1ToB10(numAsString, b1) + "";
        } else {
            // convert b1 to base 10
            return convertB10ToB2(convertB1ToB10(numAsString, b1), b2);
            // convert base 10 to b2
        }
    }

    private int convertB1ToB10(String numAsString, int b1) {
        int output = 0;
        int length = numAsString.length() - 1;
        for (char c : numAsString.toCharArray()) {
            if (c > 64)
                output += Integer.parseInt((c - 55) + "") * Math.pow(b1, length--);
            else
                output += Integer.parseInt(c + "") * Math.pow(b1, length--);
        }
        return output;
    }

    private String convertB10ToB2(int num, int b2) {
        StringBuilder output = new StringBuilder();
        int remainder = 0;
        while (num != 0) {
            remainder = num % b2;
            if (remainder > 9)
                output.append((char) (55 + remainder));
            else
                output.append(remainder);
            num /= b2;
        }
        return output.reverse().toString();
    }
}