package transport;

public final class SecurityRules {
    private SecurityRules() { }
    //Checks place is Restricted or Allowed
    public static boolean canFly (String place ) {
        if("ExamCell".equals(place)){
            return false;
        }else{
            return true;
        }
    }
}