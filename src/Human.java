public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Human (int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        }else{
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (name == null || name == "") {
            this.name = "Информация не указана";
        }
        if (town == null ||town == "") {
            this.town = "Информация не указана";
        }
        if (jobTitle == null || jobTitle == "") {
            this.jobTitle = "Информация не указана";
        }


    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
}
