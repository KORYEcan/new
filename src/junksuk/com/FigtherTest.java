package junksuk.com;

abstract class Unit {

    int x, y;

    abstract void move(int x, int y);

    void stop() {
        System.out.println("멈춥니다.");
    }
}

    interface Fightable {
        void move(int x, int y); //public abstract가 생략됨

        void attack(Fightable f);//public abstract가 생략됨
    }

    class Fighter extends Unit implements Fightable {

        public void move(int x, int y) {
            System.out.println("[" + x + "," + y + "로 이동");
        }

       public void attack(Fightable f) {
            System.out.println(f + "를 공격");
        }



    }



public class FigtherTest {
    public static void main(String[] args) {
        Fighter f=  new Fighter();
        f.move(100,200);
        f.attack(new Fighter());
    }
}
