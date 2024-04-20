public class RewardValue {
    double cash;
    int mile;
    RewardValue(double cash)  //accept cash value
    {
        this.cash = cash;
    }
    RewardValue(int mile) // accept value in miles
    {
        this.mile = mile;
    }
    double getCashValue(){
        return cash;
    }
    int getMilesValue(){
        return mile;
    }
}
