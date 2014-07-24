package SortMountains;


import java.util.*;


public class SortMountain {

    LinkedList<Mountain> mtn = new LinkedList<Mountain>();

    class NameCompare implements Comparator<Mountain> {
        @Override
        public int compare(Mountain o1, Mountain o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    class HeightCompare implements Comparator<Mountain>{
        @Override
        public int compare(Mountain o1, Mountain o2) {
//            if (o1.getHeight() < o2.getHeight()) {
//                return -1;
//            }else if (o1.getHeight() == o2.getHeight()) {
//                return 0;
//            }else if (o1.getHeight() > o2.getHeight()){
//                return +1;
//            }
            return (o2.getHeight() - o1.getHeight());
        }
    }

    public static void main(String[] args) {
        new SortMountain().go();
    }

    public void go(){
        mtn.add(new Mountain("Лонг-Рейндж", 14255));
        mtn.add(new Mountain("Эльберт", 14433));
        mtn.add(new Mountain("Марун", 14156));
        mtn.add(new Mountain("Касл", 14265));

        System.out.println("В порядке добавления:\n" + mtn);

        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);
        System.out.println("По названию:\n" + mtn);

        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, hc);
        System.out.println("По высоте:\n" + mtn);
    }
}
