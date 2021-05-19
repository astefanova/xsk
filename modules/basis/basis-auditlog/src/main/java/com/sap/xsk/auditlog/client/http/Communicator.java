package com.sap.xsk.auditlog.client.http;

import com.sap.xsk.auditlog.client.exceptions.ServiceException;

public interface Communicator {

  void send(String apiUrl, String payload, String oauthToken) throws ServiceException;

  String get(String apiUrl, String oauthToken) throws ServiceException;

  String retrieveOAuthToken() throws ServiceException;

  String retrieveOAuthToken(String oauthUrl) throws ServiceException;
}