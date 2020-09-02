package homework.enums;

public enum Codes {
    INFORMATIONAL(1){
        @Override
        void launch(){
            System.out.println("Informational");
        }
    },

    SUCCESS(2){
        @Override
        void launch() {
            System.out.println("Success");
        }
    },

    REDIRECTION(3){
        @Override
        void launch() {
            System.out.println("Redirection");
        }
    },

    CLIENT_ERROR(4){
        @Override
        void launch() {
            System.out.println("Client Error");
        }
    },

    SERVER_ERROR(5) {
        @Override
        void launch() {
            System.out.println("Server Error");
        }
    },

    WRONG_CODE() {
        @Override
        void launch() {
            System.out.println("Wrong Code");
        }
    };

    private int code;

    Codes(int code) {
        this.code = code; 
    }

    Codes() {

    }

    public static Codes getEnumByValue(int code){
        for(Codes e : Codes.values()){
            if(code == e.code) return e;
        }
        return WRONG_CODE;
    }

    abstract void launch();
}
