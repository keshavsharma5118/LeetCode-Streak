class Solution {
    public String capitalizeTitle(String title) {
        String [] words = title.toLowerCase().split(" ");
        StringBuilder str = new StringBuilder();

        for(String word: words){
            if(word.length()<=2){
                str.append(word+" ");
                continue;
            }
            else{
            str.append(Character.toUpperCase(word.charAt(0))+word.substring(1));
        }
        str.append(" ");
        }
        return str.toString().trim();
    }
}