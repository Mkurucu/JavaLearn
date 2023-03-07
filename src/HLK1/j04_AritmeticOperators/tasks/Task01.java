package HLK1.j04_AritmeticOperators.tasks;

public class Task01 {
	public static void main(String[] args) {
		int x = 1;
        x++;
            System.out.println(" x = " + x );
        x += x;
            System.out.println(" x = " + x );
        --x;
            System.out.println(" x = " + x );
        x = 7 + x;
        x *= x;
        x -= 3;

        System.out.println(" x = " + x );
        
        int a = 3;
        double d = 4.5;

        d+=a;

            System.out.println(" 1d = " + d );
            System.out.println(" 1a = " + a );
        a+=d;

            System.out.println(" 2d = " + d );
            System.out.println(" 2a = " + a );
        d-=a;

            System.out.println(" 3d = " + d );
            System.out.println(" 3a = " + a );
        a-=d;

            System.out.println(" 4d = " + d );
            System.out.println(" 4a = " + a );

        System.out.println(" d = " + ++d );
        System.out.println(" a = " + a-- );
        
        

	}

}
