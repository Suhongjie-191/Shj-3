package shj;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
        int flag = 1;
        Courses s = null;
        while (flag == 1) {
            Scanner in = new Scanner(System.in);
            Courses a = s;      //��a���г�ʼ����ֵ
            Student w = new Student(2019310200, "����", 'M',a);
            System.out.println("ѧ����Ϣ");
            System.out.println(w);
            Teacher b = new Teacher(1, "��", 'M', "��ѧ");
            Teacher c = new Teacher(2, "��", 'M', "��ѧ");
            Teacher d = new Teacher(3, "��", 'W', "Ӣ��");
            System.out.println("��ʦ��Ϣ");
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            Courses e = new Courses("��ѧ", 7, "101", 2, 2);
            Courses f = new Courses("Ӣ��", 8, "102", 2, 3);
            Courses g = new Courses("��ѧ", 9, "103", 2, 4);
            System.out.println("�γ���Ϣ");
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);
            System.out.println("������1,2,3����ѡ��: ");
            int x = in.nextInt();// Scanner ������ȡ�û�������
            if (x == 1) {
                a = e;
                System.out.println("��ѡ��: " + e);
                System.out.println(b);
            } else if (x == 2) {
                a = f;
                System.out.println("��ѡ��: " + f);
                System.out.println(c);
            } else if (x == 3) {
                a = g;
                System.out.println("��ѡ��: " + g);
                System.out.println(d);
            } else {
                System.out.println("δ�鵽�γ�");
            }
            Student n = new Student(2019310200, "����", 'M',a);
            System.out.println(n);

            System.out.println("������1,2,3�����˿�: ");
            int y = in.nextInt();
            while (x == 1)      //ȷ��ֻ������ѡ�γ�
                if (y == 1) {
                    a = null;
                    System.out.println("���˿�: " + e);
                    System.out.println(b);
                    break;
                } else {
                    System.out.println("δ�鵽��ѡ�ÿγ̣��޷��˿�");
                    s = e;
                    break;
                }

            while (x == 2)
                if (y == 2) {
                    a = null;
                    System.out.println("���˿�: " + f);
                    System.out.println(c);
                    break;
                } else {
                    System.out.println("δ�鵽��ѡ�ÿγ̣��޷��˿�");
                    s = f;
                    break;
                }

            while (x == 3)
                if (y == 3) {
                    a = null;
                    System.out.println("���˿�: " + g);
                    System.out.println(d);
                    break;
                } else {
                    System.out.println("δ�鵽��ѡ�ÿγ̣��޷��˿�");
                    s = g;
                    break;
                }
            Student o = new Student(2019310200, "����", 'M',a);
            System.out.println(o);

            System.out.println("����1����2ѡ�����ѡ�˿λ����˳�");
            int z = in.nextInt();
            while (z == 1) {
                System.out.println("����ѡ��");
                break;

            }
            while (z == 2) {
                flag = 0;
                System.out.println("�˳�");
                break;
            }
        }
    }
}

}
