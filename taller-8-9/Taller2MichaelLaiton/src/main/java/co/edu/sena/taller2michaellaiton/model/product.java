package co.edu.sena.taller2michaellaiton.model;

public class product {
    private Integer product_id;

    private String product_name;
    private String product_value;

    public product(){}

    public product(Integer product_id, String product_name, String product_value) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_value = product_value;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_value() {
        return product_value;
    }

    public void setProduct_value(String product_value) {
        this.product_value = product_value;
    }

    @Override
    public String toString() {
        return "product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_value='" + product_value + '\'' +
                '}';
    }
}
