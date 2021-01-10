import java.util.*;

class pair
{
    int first;
    int second;
    pair(int first, int second)
    {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString(){
        return this.first + " ," + this.second;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
        if (!(o instanceof pair)) return false;
        pair pair = (pair) o;
        return first == pair.first &&
                second == pair.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
class learn {
    public static void overlappedInterval(ArrayList<pair> vec, int n) {
        Set<pair> set = new HashSet<pair>();

        for (int i = 0; i < n; i++) {
            int small = vec.get(i).first;
            int large = vec.get(i).second;
            pair temp = new pair(0,0);
            for(int j = i+1; j < n; j++){
                if(vec.get(j).first < large && vec.get(j).second < large){
                    small = vec.get(i).first;
                    large = vec.get(i).second;
                }
                else if(vec.get(j).first < large && vec.get(j).second > large){
                    small = vec.get(i).first;
                    large = vec.get(j).second;
                }
                temp.first = small;
                temp.second = large;
                set.add(temp);

            }

        }
        for(int i = 0; i < set.size(); i++){
//            set.equals()
            System.out.println(set.toString());
        }
        // code here
    }

    public static void main(String[] args) {
        ArrayList<pair> list = new ArrayList<>();
        pair obj = new pair(6,8);
        pair obj1 = new pair(1,9);
        pair obj2 = new pair(2,4);
        pair obj3 = new pair(4,7);
        pair obj4 = new pair(3,9);
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        overlappedInterval(list,list.size());
        System.out.println("added somehting new from new branch prashant");
    }
}