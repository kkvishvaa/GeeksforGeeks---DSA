import java.util.ArrayList;

class Quadratic {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> list=new ArrayList<>();
        double D=(b*b)-(4*a*c);
        if(D<0){
            list.add(-1);
            return list;
        }
        
        double sqrtD=Math.sqrt(D);
        int root1=(int)Math.floor((-b+sqrtD)/(2.0*a));
        int root2=(int)Math.floor((-b-sqrtD)/(2.0*a));
        
        if(root1>=root2){
            list.add(root1);
            list.add(root2);
        }
        else{
           list.add(root2);
            list.add(root1);
        }
        return list;
    }

    public static void main(String[] args) {
        Quadratic q = new Quadratic();
        ArrayList<Integer> roots = q.quadraticRoots(1, -3, 2);
        System.out.println(roots);
    }
}

