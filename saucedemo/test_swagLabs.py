from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC, wait
from selenium import webdriver


#function designed to test the functionality of the saucedemo website using a web driver.

def test_saucedemo(driver):

    wait = WebDriverWait(driver, 20)

    # perform login functionality:
    user_name = wait.until(EC.visibility_of_element_located((By.XPATH, "//*[@id='user-name']")))
    user_name.send_keys("standard_user")

    password_field = wait.until(EC.visibility_of_element_located((By.XPATH, "//*[@id='password']")))
    password_field.send_keys("secret_sauce")
    # click on login button:
    login_button = wait.until(EC.element_to_be_clickable((By.XPATH, "//*[@id='login-button']")))
    login_button.click()

    # Verify SWAG LABS is present on the Web Page:
    assert "Swag Labs" in driver.title
    # Get the page title
    actual_title = driver.title
    print(driver.title)

    # Locate the specific item, for example, "Sauce Labs Bolt T-Shirt"
    item_text = wait.until(EC.visibility_of_element_located((By.CSS_SELECTOR, "#item_1_title_link > div"))).text
    print(item_text)

    # Verify Add any one of the Item to cart (Click on ADD TO CART button)
    add_to_cart = wait.until(EC.element_to_be_clickable((By.ID, "add-to-cart-sauce-labs-bolt-t-shirt")))
    add_to_cart.click()

    # Verify Click on right corner of the button
    right_corner_button = wait.until(EC.element_to_be_clickable((By.XPATH, "//*[@id='shopping_cart_container']/a")))
    right_corner_button.click()

    # Verify the item is in the cart
    cart_item_text = wait.until(EC.visibility_of_element_located((By.CSS_SELECTOR, "#item_1_title_link > div"))).text
    print(cart_item_text)
    if item_text == cart_item_text:
        print("Text is matched")
    else:
        print("Text is not matched")


    # Verify Click on left corner of the button
    left_corner_button = wait.until(EC.element_to_be_clickable((By.XPATH, "//button[@id='react-burger-menu-btn']")))
    left_corner_button.click()

    # Verify click on LOGOUT button
    logout_button = wait.until(EC.element_to_be_clickable((By.XPATH, "(//a[@class='bm-item menu-item'])[3]")))
    logout_button.click()
    print("logged out Successfully")


























