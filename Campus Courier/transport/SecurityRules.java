package transport;

public final class SecurityRules {
    private SecurityRules() { }
    //Checks place is Restricted or Allowed
    public static boolean canFly (String place ) {
        if(place == "ExamCell" ){
            return false;
        }else{
            return true;
        }
    }
}