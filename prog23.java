import java.net.URL;
import java.net.URLConnection;
import java.net.*;
import java.util.*;
import java.io.*;

public class prog23{
  public static void main(String[] args) throws Exception {
    URL url = new URL("http://www.google.com/");
    URLConnection urlconn=url.openConnection();
   //InputStream in = urlconn.getInputStream();
	
    System.out.println("protocol:" + url.getProtocol());
    System.out.println("prot:" + url.getPort());
    System.out.println("host:" + url.getHost());
    System.out.println("path:" + url.getPath());
    System.out.println("file:" + url.getFile());
    System.out.println("query:" + url.getQuery());
    System.out.println("ref:" + url.getRef());
    System.out.println("length" + urlconn.getContentLength());
    System.out.println("Content type:" + urlconn.getContentType());
    System.out.println("encoding:" + urlconn.getContentEncoding());
    System.out.println("last modified:" + new Date(urlconn.getLastModified()));
    System.out.println("date:" + (new Date(urlconn.getDate())));
    System.out.println("expiration :" + new Date(urlconn.getExpiration()));
  }
}