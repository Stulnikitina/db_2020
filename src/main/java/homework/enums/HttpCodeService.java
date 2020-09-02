package homework.enums;

public class HttpCodeService {

    private final String tmp = "httpcode:";

    public void processHttp(String request) {
        int code = getCode(request);
        launchProcess(code);
    }

    private int getCode(String request) {
        int index = request.indexOf(tmp);
        int pr = 0;
        if(request.charAt(index + tmp.length()) == ' ') pr = 1;
        int code = Integer.parseInt(request.substring(index + tmp.length() + pr, index + tmp.length() + pr + 3));
        return code;
    }

    private void launchProcess(int code) {
       Codes.getEnumByValue(code/100).launch();
    }
}
