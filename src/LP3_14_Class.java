public class LP3_14_Class {
    public int totalVotes;
    public int AwbreyTotal;
    public int MartinezTotal;

    public LP3_14_Class(int AwbreyNewyork,int AwbreyConnecticut,int AwbreyNewJersey,int MartinezNewyork,int MartinezConneticut,int MartinezNewJersey) {
        AwbreyTotal = AwbreyNewyork + AwbreyConnecticut + AwbreyNewyork;
        MartinezTotal = MartinezNewyork + MartinezConneticut + MartinezNewJersey;
        totalVotes = AwbreyTotal + MartinezTotal;

    }
}
