package homework.enums;

public class HttpService {

    private static String request = "kjdhsjdhf httpcode: 404   sjdghfkjdshgafsdah";

    public static void main(String[] args) {

        HttpCodeService service = new HttpCodeService();
        service.processHttp(request);

        service.processHttp("kjdhsjdhf httpcode:404   sjdghfkjdshgafsdah");
    }
}
