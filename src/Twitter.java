 class Twitter implements SocialShare {
    private String message;

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public void share(){
        System.out.println("Sharing message on Twitter: " + this.message);
    }
}

 class Facebook implements SocialShare {
    private String message;

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to Facebook: " + this.message);
    }
}

 class LinkedIn implements SocialShare {
    private String message;

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to LinkedIn: " + this.message);
    }
}

class SocialFacade{
    private Twitter twitter;
    private Facebook facebook;
    private LinkedIn linkedIn;

    public SocialFacade(){
        this.twitter = new Twitter();
        this.facebook = new Facebook();
        this.linkedIn = new LinkedIn();
    }



    public void share(String message){
        this.twitter.setMessage(message);
        this.facebook.setMessage(message);
        this.linkedIn.setMessage(message);

        this.twitter.share();
        this.facebook.share();
        this.linkedIn.share();
    }
}

 class Client{
    public void share(String message){
        SocialFacade socialFacade = new SocialFacade();
        socialFacade.share(message);
    }
     public static void main(String[] args) {
         Client client = new Client();
         client.share("This is a post");
     }
}


