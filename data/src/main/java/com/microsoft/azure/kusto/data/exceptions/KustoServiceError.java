package com.microsoft.azure.kusto.data.exceptions;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

public class KustoServiceError extends Exception {
    private ArrayList<Exception> exceptions = null;

    public KustoServiceError(JSONArray exceptions) throws JSONException {
        this.exceptions = new ArrayList<>();
        for (int j = 0; j < exceptions.length(); j++) {
            this.exceptions.add(new Exception(exceptions.getString(j)));
        }

    }
    public KustoServiceError(String message) {
        super(message);
    }

    public List<Exception> getExceptions() {
        return exceptions;
    }
}
