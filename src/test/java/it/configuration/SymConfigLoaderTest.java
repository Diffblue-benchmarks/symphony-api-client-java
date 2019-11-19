package it.configuration;

import configuration.SymConfig;
import configuration.SymConfigLoader;
import it.commons.BaseTest;
import java.io.InputStream;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SymConfigLoaderTest {
  @Test
  public void loadConfig() {
    InputStream configFileStream = BaseTest.class.getResourceAsStream("/bot-config.json");
    SymConfig config = SymConfigLoader.load(configFileStream);

    assertNotNull(config);
    assertEquals("localhost", config.getSessionAuthHost());
  }

  @Test
  public void loadConfig2() {
    InputStream configFileStream = BaseTest.class.getResourceAsStream("/bot-config2.json");
    SymConfig config = SymConfigLoader.load(configFileStream);

    assertEquals("src/test/resources/testkeystore.jks", (config).getTruststorePath());
    assertEquals("127.0.0.1", (config).getKeyAuthHost());
    assertEquals("testprivatekey2.pkcs8", (config).getAppPrivateKeyName());
    assertEquals(8443, (config).getKeyAuthPort());
    assertEquals("127.0.0.1", (config).getPodHost());
    assertEquals("https://127.0.0.1:8443", (config).getPodUrl());
    assertEquals("", (config).getProxyURL());
    assertEquals("testbot2", (config).getBotUsername());
    assertEquals("https://127.0.0.1:8443", (config).getKeyAuthUrl());
    assertEquals(null, (config).getKeyManagerProxyUsername());
    assertEquals(8443, (config).getPodPort());
    assertEquals("", (config).getPodProxyUsername());
    assertEquals(null, (config).getKeyManagerProxyPassword());
    assertEquals("127.0.0.1", (config).getSessionAuthHost());
    assertEquals(60, (config).getAuthTokenRefreshPeriod());
    assertFalse((config).getShowFirehoseErrors());
    assertEquals(8443, (config).getAgentPort());
    assertEquals(null, (config).getAppCertPath());
    assertEquals("127.0.0.1", (config).getAgentHost());
    assertEquals("", (config).getKeyManagerProxyURL());
    assertEquals("", (config).getPodProxyURL());
    assertEquals(null, (config).getAuthenticationFilterUrlPattern());
    assertEquals("", (config).getProxyPassword());
    assertEquals(0, (config).getDatafeedEventsErrorTimeout());
    assertEquals("7890", (config).getTruststorePassword());
    assertEquals(null, (config).getBotCertName());
    assertEquals("", (config).getProxyUsername());
    assertEquals("testapp2", (config).getAppId());
    assertEquals(500, (config).getConnectionTimeout());
    assertEquals(null, (config).getAppCertPassword());
    assertEquals("", (config).getPodProxyPassword());
    assertEquals(null, (config).getBotEmailAddress());
    assertEquals(0, (config).getDatafeedEventsThreadpoolSize());
    assertEquals(8443, (config).getSessionAuthPort());
    assertEquals(null, (config).getBotCertPath());
    assertEquals("https://127.0.0.1:8443", (config).getSessionAuthUrl());
    assertEquals("src/test/resources/", (config).getAppPrivateKeyPath());
    assertEquals("https://127.0.0.1:8443", (config).getAgentUrl());
    assertEquals(null, (config).getBotCertPassword());
    assertEquals("testprivatekey2.pkcs8", (config).getBotPrivateKeyName());
    assertEquals("src/test/resources/", (config).getBotPrivateKeyPath());
    assertEquals(null, (config).getAppCertName());
    assertTrue(configFileStream instanceof java.io.BufferedInputStream);
  }
}
