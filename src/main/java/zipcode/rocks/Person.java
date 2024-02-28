package zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;
    private String favoriteColor;
    private String birthMonth;
    private String githubHandle;
    private boolean havePet;

  public Person(String fname, String lname) {
      this.firstname = fname;
      this.lastname = lname;
  }
  
  // public Person(String fname, String lname, String favColor, String birthMonth, String githubHandel, boolean havePet) {
  //       this.firstname = fname;
  //       this.lastname = lname;
  //       this.favoriteColor = favColor;
  //       this.birthMonth = birthMonth;
  //       this.githubHandel = githubHandel;
  //       this.havePet = havePet;
  //   }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
  public String getFavoriteColor() {
      return lastname;
  }

  public void setFavoriteColor(String favoriteColor) {
      this.favoriteColor = favoriteColor;
  }

  public String getBirthMonth() {
      return birthMonth;
  }

  public void setBirthMonth(String birthMonth) {
      this.birthMonth = birthMonth;
  }

  public String getGithubHandle() {
      return githubHandle;
  }

  public void setGithubHandle(String githubHandle) {
      this.githubHandle = githubHandle;
  }

  public boolean getHavePet() {
      return havePet;
  }

  public void setHavePet(boolean havePet) {
      this.havePet = havePet;
  }
  

    public String toString() {
        return this.lastname + ", " + this.firstname + ", " + this.favoriteColor + ", " + this.birthMonth + ", " + this.githubHandle + ", " + this.havePet;
    }
    //public String colortoString() {
        //return this.favoriteColor;
    //}
}
