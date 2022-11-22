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

        if (brand == null || brand == "") {
            this.brand = "default";
        }else{
            this.brand = brand;
        }

        if (color == null || color == "") {
            this.color = "белый";
        }else{
            this.color = color;
        }

        if (model == null || model == "") {
            this.model = "default";
        }else{
            this.model = model;
        }

        if (productionCountry == null || productionCountry == "") {
            this.productionCountry = "default";
        }else{
            this.productionCountry = productionCountry;
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
