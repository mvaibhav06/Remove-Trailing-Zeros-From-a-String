class TrailingZeroes {
    public String removeTrailingZeros(String num) {
        int j = num.length()-1;

        while(num.charAt(j) == '0'){
            j--;
        }
        return num.substring(0,j+1);
    }
}
