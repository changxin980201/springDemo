package com.baomidou.ant.sys.config;



import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClientConfig {

    public static String PostUrl(String getUrl, String body) throws IOException {
        StringBuffer sbf = new StringBuffer();
        String strRead = null;
        URL url = new URL(getUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        try {
            connection.setRequestMethod("POST");//请求post方式
            connection.setDoInput(true);
            connection.setDoOutput(true);
            //header内的的参数在这里set    connection.setRequestProperty("健, "值");
            connection.setRequestProperty("Content-Type", "application/json");
            //connection.setRequestProperty("Info_Token", idcard.getInfoToken());

            connection.connect();
            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
            //region
            writer.write(body);
            writer.flush();
            InputStream is = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            while ((strRead = reader.readLine()) != null) {
                sbf.append(strRead);
                sbf.append("\r\n");
            }
            reader.close();

        } catch (Exception e) {
        } finally {
            connection.disconnect();
        }
        return sbf.toString();
    }
}
