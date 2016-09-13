package com.gamp.transport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;

/**
 * Response for GA tracking request.
 *
 * @author Punith
 */
public class GoogleAnalyticsResponse {
    private int statusCode = 200;
    private List<NameValuePair> postedParms = null;

    public Map<String, String> getPostedParmsAsMap() {
        if (postedParms == null) {
            return null;
        }

        Map<String, String> paramsMap = new HashMap<String, String>();
        for (NameValuePair pair : postedParms) {
            paramsMap.put(pair.getName(), pair.getValue());
        }

        return paramsMap;
    }

    public List<NameValuePair> getPostedParms() {
        return postedParms;
    }

    public void setPostedParms(List<NameValuePair> postedParms) {
        this.postedParms = postedParms;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Response [statusCode=");
        builder.append(statusCode);
        builder.append("]");
        return builder.toString();
    }
}
