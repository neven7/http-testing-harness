/*
 * Copyright (c) 2010-2013 Sonatype, Inc. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */

package org.sonatype.tests.http.runner.junit;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import javax.servlet.Filter;
import javax.servlet.Servlet;

import org.sonatype.tests.http.api.Behaviour;
import org.sonatype.tests.http.api.ServerProvider;

/**
 * @author Benjamin Hanzelmann
 */
class DummyProvider
    implements ServerProvider
{
  private boolean started;

  public URL getUrl()
      throws MalformedURLException
  {
    return URI.create("dummy://url").toURL();
  }

  public void stop()
      throws Exception
  {
    started = false;
  }

  public void addBehaviour(String pathspec, Behaviour... behaviour) {
  }

  @Override
  public void addServlet(final String pathSpec, final Servlet servlet) {

  }

  @Override
  public void addFilter(final String pathSpec, final Filter filter) {

  }

  public void start()
      throws Exception
  {
    started = true;
  }

  public void initServer()
      throws Exception
  {
  }

  public void setPort(int port) {
  }

  public int getPort() {
    return -1;
  }

  public void setSSL(String keystore, String password) {
  }

  public void addAuthentication(String pathSpec, String authName) {

  }

  public void addUser(String user, Object password) {

  }

  public boolean isStarted() {
    return started;
  }

  /**
   * @since 0.8
   */
  public void setSSLTruststore(final String truststore, final String password) {

  }

  /**
   * @since 0.8
   */
  public void setSSLNeedClientAuth(final boolean needClientAuth) {

  }

}
