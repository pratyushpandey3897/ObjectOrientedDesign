package designPatterns.builder;
/*
Builder patter is used in :
1. class with many attributes
2. Need to validate params before creating an object
3. Immutable class: all params need to be passed during creation

Student ---> getbuilder() --> Builder -->> setXYZ() --> Builder --------> build() --> Student

 */

public class Student {
    String name;
    String universityName;
    String batch;
    long id;
    int gradYear;
    String phoneNumber;

    static Builder getBuilder () {
        return new Builder ();
    }
    private Student( Builder builder){
        if (builder.gradYear > 2022)
            throw new IllegalArgumentException ("Grad year can not be greater than 2022");

        // validation completed
        this.gradYear = builder.gradYear;
        this.name = builder.name;
    }


    //Builder class is here which is static
    static class Builder {
        String name;
        String universityName;
        String batch;
        long id;
        int gradYear;
        String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return  this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build () {
            if (getGradYear () > 2022){
                throw new IllegalArgumentException ("Grad year can not be greater than 2022");
            }
            System.out.println ("Student created");
            return new Student (this); // only this builder class can call the private constructor
        }
    }

}
