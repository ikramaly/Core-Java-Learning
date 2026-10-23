public class StringDemo1 {
    public static void main(String[] args) {
        String name1= "Ikram";

        String name2 = name1.concat("ali");
        System.out.println(name2);

        String name3 = new String("Manish");
        name3 = name3.concat(" kumar");
        System.out.println(name3);

        StringBuilder sb = new StringBuilder("Ali");
//        System.out.println(sb);
        sb.append(" Khamnei");
//        sb.replace(0,);

        StringBuffer sb1 = new StringBuffer("Mera Bharat");
        sb1.append(" Mahan....");

        System.out.println("sb : "+sb);
        System.out.println("sb1 : "+sb1);
    }

}
