public class LP3_14_Main {
    public static void main(String[] args) {
        int AwbreyNewyork = 314159;
        int AwbreyNewJersey = 89008;
        int AwbreyConnecticut = 213451;

        int MartinezNewyork = 271860;
        int MartinezNewJersey = 121032;
        int MartinezConneticut = 231034;

        LP3_14_Class voteData = new LP3_14_Class(AwbreyNewyork,AwbreyConnecticut,AwbreyNewJersey,MartinezNewyork,MartinezConneticut,MartinezNewJersey);


        System.out.printf("Awbrey Newyork : %s \nMartinez Newyork : %s\nAwbrey New Jersey : %s\nMartinez New Jersey : %s\nAwbrey Connectituct : %s\n Martinez Conneticut : %s\nVote Results : \nAwbrey Percentage %s\nMartinez Percentage %s\nTotal Votes : %s",AwbreyNewyork,MartinezNewyork,AwbreyNewJersey,MartinezNewJersey,AwbreyConnecticut,MartinezConneticut,(voteData.AwbreyTotal / voteData.totalVotes) * 100,voteData.MartinezTotal / voteData.totalVotes * 100,voteData.totalVotes);
    }
}
