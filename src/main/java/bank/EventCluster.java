package bank;

public class EventCluster {
    //Her lægges de forskellige klasser er skal bruges

    private static EventCluster instance;

    private EventCluster(){

    }

    public static EventCluster getInstance() {
        if(instance == null)
            instance = new EventCluster();
        return instance;
    }

    public void transferApproved(String sender, String receiver, int ammount){

    }

    public int getBalance(String customer){
        return 0;
    }

}
