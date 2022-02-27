public class Main {
    public static void main(String[] args) {
  
      Cow freshian = new Cow();

      freshian.setHeartRate(72);
      freshian.setRespirationRate(100);
      freshian.setBloodGroup("A");
  
      //freshian.heartrate = 72; 
      //freshian.respiration_rate = 100; 
      //freshian.blood_group = "A";


      System.out.println("Heart Rate " + freshian.getHeartRate());
      System.out.println("Heart Rate " + freshian.getRespirationRate());
      System.out.println("Heart Rate " + freshian.getBloodGroup());
  
      //System.out.println("Heart Rate " + freshian.heartrate);
      //System.out.println("Heart Rate " + freshian.respiration_rate);
      // System.out.println("Heart Rate " + freshian.blood_group);
    }
}