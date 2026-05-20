package utilities;

import io.cucumber.java.Before;

public class Hooks {

    TestContext context;

    public Hooks(TestContext context) {
        this.context = context;
    }

    @Before
    public void setup() {
        BaseURI.setupBaseURI();
        context.accessToken = AuthUtil.generateToken();
    }
}