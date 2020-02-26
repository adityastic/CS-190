package q4;

public class TestMemberQ {
    public static void main(String args[]) {
        Member<Integer> m = new Member<Integer>(234512);
        System.out.println("Member ID=" + m.readID());
        boolean result = m.checkID(234234);
        if (result == true) {
            System.out.println("ID OK");
        } else {
            System.out.println("ID Not OK");
        }
        m.setID(234234);
        result = m.checkID(234234);
        if (result == true) {
            System.out.println("ID OK");
        } else {
            System.out.println("ID Not OK");
        }
    }
}
