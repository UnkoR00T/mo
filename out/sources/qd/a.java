package qd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes3.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f166064a;

    public a(HttpURLConnection httpURLConnection) {
        this.f166064a = httpURLConnection;
    }

    private String b(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb5 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb5.append(line);
                    sb5.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th4) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th4;
            }
        }
        bufferedReader.close();
        return sb5.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f166064a.disconnect();
    }

    @Override // qd.d
    public String h3() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f166064a.getURL() + ". Failed with " + this.f166064a.getResponseCode() + "\n" + b(this.f166064a);
        } catch (IOException | NullPointerException e15) {
            td.e.d("get error failed ", e15);
            return e15.getMessage();
        }
    }

    @Override // qd.d
    public boolean isSuccessful() {
        try {
            return this.f166064a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // qd.d
    public String j1() {
        return this.f166064a.getContentType();
    }

    @Override // qd.d
    public InputStream t1() {
        return this.f166064a.getInputStream();
    }
}
