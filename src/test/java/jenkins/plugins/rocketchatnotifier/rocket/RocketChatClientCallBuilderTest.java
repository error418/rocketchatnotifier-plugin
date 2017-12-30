package jenkins.plugins.rocketchatnotifier.rocket;

import org.junit.Test;

import java.io.IOException;

public class RocketChatClientCallBuilderTest {

  @Test(expected = IOException.class)
  public void shouldEscapeSpecialCharacters() throws Exception {
    // given
    RocketChatClientCallBuilder rocketCallBuilder = new RocketChatClientCallBuilder("http://localhost", false, "]\",", "]\",");
    // when
    rocketCallBuilder.buildCall(RocketChatRestApiV1.ChannelsList);
    // then error
  }

}
