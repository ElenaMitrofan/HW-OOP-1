public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String productionCountry;

    Car (String brand, String model, double engineVolume, String color, int year, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.productionCountry = productionCountry;

        if (brand == null || model == null || color == null || productionCountry == null ||brand == "" || model == "" || color == "" || productionCountry == "") {
            this.brand = "default";
            this.model = "default";
            this.color = "белый";
            this.productionCountry = "default";
        }
        if (year <= 0) {
            this.year = 2000;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
    }
    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " год выпуска, страна сборки - " + productionCountry + ", цвет кузова — " + color + ", объем двигателя — " + engineVolume + "л.";
    }

}
