package ru.netology.data;

import lombok.var;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static ru.netology.data.DataGenerator.Registration.getRegisteredUser;

public class UserTest {
    @BeforeEach
    void setup() {
        open("http://lhost:9999");
    }

    @Test
    @DisplayName ("Should successfully login with active registered user")
    void shouldSuccessfullLoginIfRegisteredActiveUser() {
        var registeredUser = getRegisteredUser("active");
        $("[data-test-id='login'] input").setValue(registeredUser.getLogin());
        $("[data-test-id='password'] input").setValue(registeredUser.getPassword());
        $("data-test-id=action-login").click();
        $()

    }

}
