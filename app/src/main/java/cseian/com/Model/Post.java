package cseian.com.Model;

public class Post {
    private String askedby,uiuid,date,postid,publisher,question,questionimage,destination,location,gender,shareableseat,
    totalseat,vehicle,totalcost,shareableamount,departuretime,ampm;

    public Post() {

    }

    public Post(String askedby, String uiuid, String date, String postid, String publisher, String question, String questionimage, String destination, String location, String gender, String shareableseat, String totalseat, String vehicle, String totalcost, String shareableamount, String departuretime, String ampm) {
        this.askedby = askedby;
        this.uiuid = uiuid;
        this.date = date;
        this.postid = postid;
        this.publisher = publisher;
        this.question = question;
        this.questionimage = questionimage;
        this.destination = destination;
        this.location = location;
        this.gender = gender;
        this.shareableseat = shareableseat;
        this.totalseat = totalseat;
        this.vehicle = vehicle;
        this.totalcost = totalcost;
        this.shareableamount = shareableamount;
        this.departuretime = departuretime;
        this.ampm = ampm;
    }

    public String getAskedby() {
        return askedby;
    }

    public void setAskedby(String askedby) {
        this.askedby = askedby;
    }

    public String getUiuid() {
        return uiuid;
    }

    public void setUiuid(String uiuid) {
        this.uiuid = uiuid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestionimage() {
        return questionimage;
    }

    public void setQuestionimage(String questionimage) {
        this.questionimage = questionimage;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getShareableseat() {
        return shareableseat;
    }

    public void setShareableseat(String shareableseat) {
        this.shareableseat = shareableseat;
    }

    public String getTotalseat() {
        return totalseat;
    }

    public void setTotalseat(String totalseat) {
        this.totalseat = totalseat;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(String totalcost) {
        this.totalcost = totalcost;
    }

    public String getShareableamount() {
        return shareableamount;
    }

    public void setShareableamount(String shareableamount) {
        this.shareableamount = shareableamount;
    }

    public String getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(String departuretime) {
        this.departuretime = departuretime;
    }

    public String getAmpm() {
        return ampm;
    }

    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }
}
