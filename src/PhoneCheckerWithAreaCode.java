public class PhoneCheckerWithAreaCode {
    private String phone;

    public PhoneCheckerWithAreaCode(String phone){
        this.phone = phone;
    }
    public boolean checkValidNumber(){
        int validNum;
        boolean allNumPhone = true;
        boolean validAreaCode = true;
        boolean validExchangeCode = true;
        validNum = checkPhoneLength(phone);
        if (validNum == 2) {
            return false;
        } else if (validNum == 0){
           String dashlessPhone = phone.replace("-", "");
           phone = dashlessPhone;
        }
        allNumPhone = checkStringNumbers(phone);
        if (allNumPhone == false){
            return false;
        }
        validAreaCode = checkValidAreaCode(phone);
        if (validAreaCode == false){
            return false;
        }
        validExchangeCode = checkValidExchangeCode(phone);
        if (validExchangeCode == false){
            return false;
        }
        return true;
    }
    public boolean checkValidExchangeCode(String phone){
        String validEC = phone;
        if (validEC.charAt(3) == '0' || validEC.charAt(3) == '1'){
            return false;
        }
        return true;
    }
    public boolean checkValidAreaCode (String phone){
        String goodAreaCode = phone;
        for ( int i=0; i<3; i++ ){
            if (goodAreaCode.charAt(i) < '2'
                    || goodAreaCode.charAt(i) > '9') {
                return false;
            }
        }
        if (goodAreaCode.charAt(1) == '9') {
            return false;
        }
        return true;
    }
    public boolean checkStringNumbers(String phone) {
        for ( int i=0; i<phone.length(); i++ ){
            if (phone.charAt(i) < '0'
                    || phone.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
    public int checkPhoneLength(String phone){
        if (phone.length() == 12){
            return 0;
        }
        if (phone.length() == 10){
            return 1;
        }
        return 2;
    }
}
