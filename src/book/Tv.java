package book;

public class Tv{
        int channel;
        void setChannel(int m ){
            if(m>=1){
                channel=m;
            }
        }
        int getChannel(){
            return channel;
        }
        void showProgram(){
            switch(channel){
                case 1 :System.out.println("综合频道");break;
                case 2 :System.out.println("经济频道");break;
                case 3 :System.out.println("文艺频道");break;
                case 4 :System.out.println("国际频道");break;
                case 5 :System.out.println("体育频道");break;
                default : System.out.println("不能收看"+channel+"频道");
            }
        }
    }
    class Family {
    Tv homeTV;
    void buyTV(Tv tv) {
        homeTV=tv;
    }
    void remoteControl(int m) {
        homeTV.setChannel(m);
    }
    void seeTV() {
        homeTV.showProgram();
    }

}
class MainClass {
    public static void main(String args[]) {
        Tv haierTV = new Tv();

        System.out.println("haierTV的频道是"+haierTV.getChannel());
        Family zhangsanFamily = new Family();
        zhangsanFamily.buyTV(haierTV);
        System.out.println("zhangsanFamily开始看电视节目");
        zhangsanFamily.seeTV();
        int m=2;
        System.out.println("zhangsanFamily将电视更换到"+m+"频道");
        zhangsanFamily.remoteControl(m);
        System.out.println("haierTV的频道是"+haierTV.getChannel());
        System.out.println("zhangsanFamily再看电视节目");
        zhangsanFamily.seeTV();

    }
}

