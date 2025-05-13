import java.io.*;
public class ReverseString{
    public static void main(String[] args) throws IOException{       
        FileInputStream in=null;
        FileOutputStream out=null;
        int[] a = new int[1000000];
        int i=0;
        int c;
        String s="";
        
        try{
            in=new FileInputStream("input.txt");
            while((c=in.read())!=-1){
                a[i]=c;
                i++;
            }
        }finally{
            if(in!=null){
                in.close();
            }  
        }

        try{
            out=new FileOutputStream("output_q1.txt");
            for(int j=i-2;j>=0;j--){
                s+=(char)a[j];
        
            }
                byte b[]=s.getBytes();
                out.write(b);
        }finally{
            if(out!=null){
                out.close();
            }
        }
    }
}
