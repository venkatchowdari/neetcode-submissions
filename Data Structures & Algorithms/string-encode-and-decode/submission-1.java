class Solution {

    public String encode(List<String> strs) {

        StringBuilder res = new StringBuilder();

        for(String st: strs){
            int len = st.length();
            res.append(st.length()).append("#").append(st);
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        for(int i=0;i<str.length();){
            int delimiter = str.indexOf("#", i);

            int len = Integer.parseInt(str.substring(i, delimiter));
            i = delimiter + 1;

            String word = str.substring(i, i+len);

            res.add(word);
            i += len;
        }

        return res;
    }
}
