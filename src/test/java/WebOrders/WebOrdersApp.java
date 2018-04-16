package WebOrders;

import com.smartbear.testleft.HttpException;
import com.smartbear.testleft.InvocationException;
import com.smartbear.testleft.ObjectTreeNodeNotFoundException;
import com.smartbear.testleft.testobjects.*;
import com.smartbear.testleft.testobjects.web.*;

/**
 * The page 'Web Orders Login' with the address http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
 */
class LoginPageModel {
    private WebPage page;

    public LoginPageModel(WebPage page) {
        this.page = page;
    }

    /**
     * A text box with the label 'Username:'.
     */
    public TextEdit getUserNameEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectIdentifier = "username";
        }}, 3);
    }

    /**
     * A password box with the label 'Password:'.
     */
    public TextEdit getPasswordEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectIdentifier = "password";
        }}, 3);
    }

    /**
     * The 'Login' button.
     */
    public Button getLoginButton() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(Button.class, new WebElementPattern(){{
            ObjectIdentifier = "button";
        }}, 3);
    }

    /**
     * Pauses the test execution until the web page is downloaded. The page loading timeout is specified by the TestLeft.Options.WebTesting.PageLoadTimeout value (the default value is 1 minute).
     *
     * @return The URL of the page or resource that was loaded last on the page. If the web page does not contain frames and the page was loaded successfully, the wait method returns the page's URL. If the page contains frames, the method returns the URL of the page that was last loaded in a frame. If the loading was not successful or the page had not finished loading before the timeout elapsed, the method returns an empty String.
     * @throws InvocationException Will be thrown if invocation fails.
     * @throws HttpException       Will be thrown if there are network problems.
     */
    String waitForLoadComplete() throws InvocationException, HttpException
    {
        return page.waitForLoadComplete();
    }

    Boolean getVisible() throws InvocationException, HttpException
    {
        return page.getVisible();
    }
}

/**
 * The page 'Web Orders' with the address http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Process.aspx
 */
class NewOrderPageModel {
    private WebPage page;

    public NewOrderPageModel(WebPage page) {
        this.page = page;
    }

    /**
     * A combo box with the following items: 'MyMoney', 'FamilyAlbum', 'ScreenSaver'.
     */
    public ComboBox getProductCombo() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(ComboBox.class, new WebElementPattern(){{
            ObjectType = "Select";
            ObjectIdentifier = "ddlProduct";
        }}, 7);
    }

    /**
     * A text box with the label 'Quantity:*'.
     */
    public TextEdit getQuantityEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectIdentifier = "txtQuantity";
        }}, 7);
    }

    /**
     * A text box with the label 'Customer name:*'.
     */
    public TextEdit getCustomerNameEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectIdentifier = "txtName";
        }}, 7);
    }

    /**
     * A text box with the label 'Street:*'.
     */
    public TextEdit getAddressEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectLabel = "Street:*";
        }}, 7);
    }

    /**
     * A text box with the label 'City:*'.
     */
    public TextEdit getCityEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectLabel = "City:*";
        }}, 7);
    }

    /**
     * A text box with the label 'State:'.
     */
    public TextEdit getCountryEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectLabel = "State:";
        }}, 7);
    }

    /**
     * A text box with the label 'Zip:*'.
     */
    public TextEdit getZipEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectLabel = "Zip:*";
        }}, 7);
    }

    /**
     * The 'Visa' radio button.
     */
    public RadioButton getVisaCardButton() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(RadioButton.class, new WebElementPattern(){{
            ObjectType = "RadioButton";
            ObjectLabel = "Visa";
        }}, 9);
    }

    /**
     * The 'MasterCard' radio button.
     */
    public RadioButton getMasterCardRadio() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(RadioButton.class, new WebElementPattern(){{
            ObjectType = "RadioButton";
            ObjectLabel = "MasterCard";
        }}, 9);
    }

    /**
     * The 'American Express' radio button.
     */
    public RadioButton getAmericanExpressCardRadio() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(RadioButton.class, new WebElementPattern(){{
            ObjectType = "RadioButton";
            ObjectLabel = "American Express";
        }}, 9);
    }

    /**
     * A text box with the label 'Card Nr:*'.
     */
    public TextEdit getCardNumber() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectLabel = "Card Nr:*";
        }}, 7);
    }

    /**
     * A text box with the label 'Expire date (mm/yy):*'.
     */
    public TextEdit getDateEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectLabel = "Expire date (mm/yy):*";
        }}, 7);
    }

    /**
     * The link 'Process'.
     */
    public WebElement getInsertLink() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Link";
            ObjectIdentifier = "InsertButton";
        }}, 8);
    }

    /**
     * The 'Reset' button.
     */
    public Button getResetbuttonReset() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(Button.class, new WebElementPattern(){{
            ObjectType = "ResetButton";
        }}, 8);
    }

    /**
     * Pauses the test execution until the web page is downloaded. The page loading timeout is specified by the TestLeft.Options.WebTesting.PageLoadTimeout value (the default value is 1 minute).
     *
     * @return The URL of the page or resource that was loaded last on the page. If the web page does not contain frames and the page was loaded successfully, the wait method returns the page's URL. If the page contains frames, the method returns the URL of the page that was last loaded in a frame. If the loading was not successful or the page had not finished loading before the timeout elapsed, the method returns an empty String.
     * @throws InvocationException Will be thrown if invocation fails.
     * @throws HttpException       Will be thrown if there are network problems.
     */
    String waitForLoadComplete() throws InvocationException, HttpException
    {
        return page.waitForLoadComplete();
    }
}

/**
 * The page 'List of All Orders' with the address http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx
 */
class OrdersPageModel {
	private WebPage page;
	
	public OrdersPageModel(WebPage page) {
		this.page = page;
	}

	/**
	 * List of All Orders grid
	 */
	public WebTable getOrdersTable() throws ObjectTreeNodeNotFoundException, HttpException {
            return page.find(WebTable.class, new WebElementPattern(){{
	        ObjectType = "Table"; 
	        ObjectIdentifier = "orderGrid"; 
            }}, 7);
	}

    /**
     * The link 'Check All'.
     */
    public WebElement getCheckAllButton() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Link";
            ObjectIdentifier = "btnCheckAll";
        }}, 5);
    }

    /**
     * The link 'Uncheck All'.
     */
    public WebElement getUncheckAllButton() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Link";
            ObjectIdentifier = "btnUncheckAll";
        }}, 5);
    }

    /**
     * The 'Delete Selected' button.
     */
    public Button getDeleteSelectedButton() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(Button.class, new WebElementPattern(){{
            ObjectIdentifier = "btnDelete";
        }}, 5);
    }

    public WebElement getOrderMessage() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern() {{
            ObjectType = "Panel";
            ObjectIdentifier = "orderMessage";
        }}, 5);
    }

    /**
     * Pauses the test execution until the web page is downloaded. The page loading timeout is specified by the TestLeft.Options.WebTesting.PageLoadTimeout value (the default value is 1 minute).
     *
     * @return The URL of the page or resource that was loaded last on the page. If the web page does not contain frames and the page was loaded successfully, the wait method returns the page's URL. If the page contains frames, the method returns the URL of the page that was last loaded in a frame. If the loading was not successful or the page had not finished loading before the timeout elapsed, the method returns an empty String.
     * @throws InvocationException Will be thrown if invocation fails.
     * @throws HttpException       Will be thrown if there are network problems.
     */
    String waitForLoadComplete() throws InvocationException, HttpException
    {
        return page.waitForLoadComplete();
    }
}

/**
 * Application 'Web Orders'.
 */
class WebOrdersAppModel {
    private WebBrowser browser;

    public WebOrdersAppModel(WebBrowser browser) {
        this.browser = browser;
    }

	/**
	 * The page 'Web Orders Login' with the address http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
	 */
	public LoginPageModel getLoginPage() throws ObjectTreeNodeNotFoundException, HttpException {
		return new LoginPageModel(browser.find(WebPage.class, new WebPagePattern(){{
			URL = "*/WebOrders/login.aspx*";
		}}));
	}

    /**
     * The page 'New Order' with the address http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Process.aspx
     */
    public NewOrderPageModel getNewOrderPage() throws ObjectTreeNodeNotFoundException, HttpException {
        return new NewOrderPageModel(browser.find(WebPage.class, new WebPagePattern() {{
            URL = "*/WebOrders/Process.aspx";
            Visible = true;
        }}));
    }

    /**
     * The page 'List of All Orders' with the address http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx
     */
    public OrdersPageModel getOrdersPage() throws ObjectTreeNodeNotFoundException, HttpException {
        return new OrdersPageModel(browser.find(WebPage.class, new WebPagePattern(){{
            URL = "*/WebOrders/Default.aspx";
            Visible = true;
        }}));
    }

    /**
     * The link 'View all orders' refers to http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx
     */
    public WebElement getViewAllOrdersLink() throws ObjectTreeNodeNotFoundException, HttpException {
        return browser.find(WebPage.class, new WebPagePattern(){{
            URL = "*/WebOrders/*.aspx";
            Visible = true;
        }}).find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Link";
            contentText = "View all orders";
        }}, 4);
    }

    /**
     * The link 'View all products' refers to http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Products.aspx
     */
    public WebElement getViewAllProductsLink() throws ObjectTreeNodeNotFoundException, HttpException {
        return browser.find(WebPage.class, new WebPagePattern(){{
            URL = "*/WebOrders/*.aspx";
            Visible = true;
        }}).find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Link";
            contentText = "View all products";
        }}, 4);
    }

    /**
     * The link 'Order' refers to http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Process.aspx
     */
    public WebElement getAddNewOrderLink() throws ObjectTreeNodeNotFoundException, HttpException {
        return browser.find(WebPage.class, new WebPagePattern(){{
            URL = "*/WebOrders/*.aspx";
            Visible = true;
        }}).find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Link";
            contentText = "Order";
        }}, 4);
    }

    /**
     * The link 'Logout'.
     */
    public WebElement getLogoutLink() throws ObjectTreeNodeNotFoundException, HttpException {
        return browser.find(WebPage.class, new WebPagePattern(){{
            URL = "*/WebOrders/*.aspx";
            Visible = true;
        }}).find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Link";
            ObjectIdentifier = "logout";
        }}, 6);
    }

    /**
     * Closes the process by sending the WM_CLOSE message to its main window and waits until the process is closed or the specified time limit is reached.
     *
     * @throws InvocationException Will be thrown if invocation fails.
     * @throws HttpException       Will be thrown if there are network problems.
     */
    public void close() throws InvocationException, HttpException
    {
        browser.close();
    }
}

