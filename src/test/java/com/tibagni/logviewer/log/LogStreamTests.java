package com.tibagni.logviewer.log;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LogStreamTests {

  @Test
  public void testMainLogs() {
    LogStream actual = LogStream.inferLogStreamFromName("main.txt");
    assertEquals(LogStream.MAIN, actual);

    actual = LogStream.inferLogStreamFromName("MAIN.txt");
    assertEquals(LogStream.MAIN, actual);

    actual = LogStream.inferLogStreamFromName("MaIn.txt");
    assertEquals(LogStream.MAIN, actual);

    actual = LogStream.inferLogStreamFromName("aplogd-m.txt");
    assertEquals(LogStream.MAIN, actual);

    actual = LogStream.inferLogStreamFromName("log-main.txt");
    assertEquals(LogStream.MAIN, actual);
  }

  @Test
  public void testSystemLogs() {
    LogStream actual = LogStream.inferLogStreamFromName("system.txt");
    assertEquals(LogStream.SYSTEM, actual);

    actual = LogStream.inferLogStreamFromName("SYSTEM.txt");
    assertEquals(LogStream.SYSTEM, actual);

    actual = LogStream.inferLogStreamFromName("SYStem.txt");
    assertEquals(LogStream.SYSTEM, actual);

    actual = LogStream.inferLogStreamFromName("aplogd-s.txt");
    assertEquals(LogStream.SYSTEM, actual);

    actual = LogStream.inferLogStreamFromName("log-system.txt");
    assertEquals(LogStream.SYSTEM, actual);
  }

  @Test
  public void testRadioLogs() {
    LogStream actual = LogStream.inferLogStreamFromName("radio.txt");
    assertEquals(LogStream.RADIO, actual);

    actual = LogStream.inferLogStreamFromName("RADIO.txt");
    assertEquals(LogStream.RADIO, actual);

    actual = LogStream.inferLogStreamFromName("RaDiO.txt");
    assertEquals(LogStream.RADIO, actual);

    actual = LogStream.inferLogStreamFromName("aplogd-r.txt");
    assertEquals(LogStream.RADIO, actual);

    actual = LogStream.inferLogStreamFromName("log-radio.txt");
    assertEquals(LogStream.RADIO, actual);
  }

  @Test
  public void testEventsLogs() {
    LogStream actual = LogStream.inferLogStreamFromName("events.txt");
    assertEquals(LogStream.EVENTS, actual);

    actual = LogStream.inferLogStreamFromName("EVENTS.txt");
    assertEquals(LogStream.EVENTS, actual);

    actual = LogStream.inferLogStreamFromName("EVents.txt");
    assertEquals(LogStream.EVENTS, actual);

    actual = LogStream.inferLogStreamFromName("aplogd-e.txt");
    assertEquals(LogStream.EVENTS, actual);

    actual = LogStream.inferLogStreamFromName("log-events.txt");
    assertEquals(LogStream.EVENTS, actual);
  }

  @Test
  public void testUnknownLogs() {
    LogStream actual = LogStream.inferLogStreamFromName("bla.txt");
    assertEquals(LogStream.UNKNOWN, actual);

    actual = LogStream.inferLogStreamFromName("logcat.txt");
    assertEquals(LogStream.UNKNOWN, actual);

    actual = LogStream.inferLogStreamFromName("bugreport.txt");
    assertEquals(LogStream.UNKNOWN, actual);

    actual = LogStream.inferLogStreamFromName("aplogd-w.txt");
    assertEquals(LogStream.UNKNOWN, actual);

    actual = LogStream.inferLogStreamFromName("log-file.txt");
    assertEquals(LogStream.UNKNOWN, actual);
  }
}