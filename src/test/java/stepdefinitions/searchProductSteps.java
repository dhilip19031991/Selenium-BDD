package stepdefinitions;

import common.BaseClass;
import io.cucumber.java.en.Then;
import pages.SearchProduct;

public class searchProductSteps extends BaseClass {
SearchProduct searchproduct;

@Then("Enter product name in search input {string}")
public void enter_product_name_in_search_input(String product) {
    searchproduct = new SearchProduct(driver);
    searchproduct.enterProductInSearch(product);
}
@Then("click searchoption button")
public void click_searchoption_button() {
    searchproduct.searchProductClick();
}
@Then("verify searched product is visible")
public void verify_searched_product_is_visible() {
   searchproduct.searchedProductVisible();
}
@Then("verify searched product {string} are visible")
public void verify_searched_product_are_visible(String searchedproductname) {
   searchproduct.verifyAllProductsMatchSearch(searchedproductname);
}
}
