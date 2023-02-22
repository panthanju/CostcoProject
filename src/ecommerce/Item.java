package ecommerce;
public class Item {
    String[] images;
    double price;
    double discount;
    String description;
    String url;
    ItemCategory category;
    boolean isQuickShippingEligible;
    boolean isOfferSpecial;

    // constructor
    public Item(){

    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ItemCategory getCategory() {
        return category;
    }

    public void setCategory(ItemCategory category) {
        this.category = category;
    }

    public boolean isQuickShippingEligible() {
        return isQuickShippingEligible;
    }

    public void setQuickShippingEligible(boolean quickShippingEligible) {
        isQuickShippingEligible = quickShippingEligible;
    }

    public boolean isOfferSpecial() {
        return isOfferSpecial;
    }

    public void setOfferSpecial(boolean offerSpecial) {
        isOfferSpecial = offerSpecial;
    }

    public double getFinalPrice() {
        if (this.isOfferSpecial()) {
            return getPrice() * getDiscount();
        }
        else { // no special price
            return getPrice();
        }
    }
}