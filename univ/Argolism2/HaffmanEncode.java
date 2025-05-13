import java.util.ArrayList;
import java.util.Arrays;

class Node{
    int key, freq, left, right;
    Node(){
        freq=0;
    };
    Node(int key,int freq,int left,int right){
        this.key=key;
        this.freq=freq;
        this.left=left;
        this.right=right;
    }
}

class S{
    char c;
    int freq;
    public S(char c,int freq){
        this.c = c;
        this.freq = freq;
    }
    @Override
    public String toString() {
        return c + " " + freq;
    }
}
class HaffmanEncode{
    public static void main(String[] args){
        char letter[]={'S','H','U','N','S','U','K','E','O','N','U','K','I'};
        ArrayList<S> str = new ArrayList<>();

        Arrays.sort(letter);

        for(char l : letter){
            boolean frag = false;
            if(str.isEmpty()){
                str.add(new S(l,1));
                continue;
            }
            for(S s:str){
                if(s.c == l){
                    s.freq++;
                    frag = true;
                }
            }
            if(!frag)str.add(new S(l,1));
        }



        System.out.println(str);
        
    }
}