package com.luma.testsuite;

import com.luma.pages.HomePage;
import com.luma.pages.Womens_Jackets_Page;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Womens_Jackets_Test extends BaseTest {
    HomePage homepage = new HomePage();
    Womens_Jackets_Page womenpage = new Womens_Jackets_Page();


    @Test
    public void verifyTheSortByProductNameFilter()
    {
        homepage.mouseHoverOnWomenMenu();
        homepage.mouseHoverOnTops();
        homepage.clickOnJackets();
        womenpage.selectProductNameFilter("Product Name");
        Assert.assertEquals(womenpage.getProductList1(),womenpage.getProductList2());
    }
    @Test
    public void verifyTheSortByPriceFilter()
    {
        homepage.mouseHoverOnWomenMenu();
        homepage.mouseHoverOnTops();
        homepage.clickOnJackets();
        womenpage.selectProductNameFilter("Price");
        Assert.assertEquals(womenpage.getProductPriceList1(),womenpage.getProductPriceList2());

    }
}
