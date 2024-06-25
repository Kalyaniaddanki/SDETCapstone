import time
import pytest
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager


#The fixture is set up once for the entire test module and is shared among all test functions and methods in that module.
@pytest.fixture()
def driver():
    # Set up the ChromeDriver service
    service = Service(ChromeDriverManager().install())

    # Create a new instance of the Chrome driver
    driver = webdriver.Chrome(service=service)
    driver.maximize_window()
    driver.get("https://www.saucedemo.com/")

    # after method
    yield driver
    # Teardown: quit the WebDriver
    time.sleep(1000)
    driver.close()
