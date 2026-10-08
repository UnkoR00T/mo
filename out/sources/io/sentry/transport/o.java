package io.sentry.transport;

import io.sentry.b7;
import io.sentry.c4;
import io.sentry.p5;
import io.sentry.q7;
import io.sentry.v0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f95768e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Proxy f95769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c4 f95770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q7 f95771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f95772d;

    public o(q7 q7Var, c4 c4Var, a0 a0Var) {
        this(q7Var, c4Var, m.a(), a0Var);
    }

    private void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    private HttpURLConnection b() throws IOException {
        HttpURLConnection httpURLConnectionE = e();
        for (Map.Entry<String, String> entry : this.f95770b.a().entrySet()) {
            httpURLConnectionE.setRequestProperty(entry.getKey(), entry.getValue());
        }
        httpURLConnectionE.setRequestMethod("POST");
        httpURLConnectionE.setDoOutput(true);
        httpURLConnectionE.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnectionE.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnectionE.setRequestProperty("Accept", "application/json");
        httpURLConnectionE.setRequestProperty("Connection", "close");
        httpURLConnectionE.setConnectTimeout(this.f95771c.getConnectionTimeoutMillis());
        httpURLConnectionE.setReadTimeout(this.f95771c.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = this.f95771c.getSslSocketFactory();
        if ((httpURLConnectionE instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnectionE).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnectionE.connect();
        return httpURLConnectionE;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private String c(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f95768e));
                try {
                    StringBuilder sb5 = new StringBuilder();
                    boolean z15 = true;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!z15) {
                            sb5.append("\n");
                        }
                        sb5.append(line);
                        z15 = false;
                        if (errorStream != null) {
                            try {
                                errorStream.close();
                            } catch (Throwable th4) {
                                th.addSuppressed(th4);
                            }
                        }
                        throw th;
                    }
                    String string = sb5.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return string;
                } catch (Throwable th5) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                if (errorStream != null) {
                    errorStream.close();
                }
                throw th7;
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    private boolean d(int i15) {
        return i15 == 200;
    }

    private c0 f(HttpURLConnection httpURLConnection) {
        try {
            int responseCode = httpURLConnection.getResponseCode();
            i(httpURLConnection, responseCode);
            if (d(responseCode)) {
                this.f95771c.getLogger().c(b7.DEBUG, "Envelope sent successfully.", new Object[0]);
                return c0.e();
            }
            v0 logger = this.f95771c.getLogger();
            b7 b7Var = b7.ERROR;
            logger.c(b7Var, "Request failed, API returned %s", Integer.valueOf(responseCode));
            if (this.f95771c.isDebug()) {
                this.f95771c.getLogger().c(b7Var, "%s", c(httpURLConnection));
            }
            return c0.b(responseCode);
        } catch (IOException e15) {
            this.f95771c.getLogger().a(b7.ERROR, e15, "Error reading and logging the response stream", new Object[0]);
            return c0.a();
        } finally {
            a(httpURLConnection);
        }
    }

    private Proxy g(q7.k kVar) {
        if (kVar == null) {
            return null;
        }
        String strC = kVar.c();
        String strA = kVar.a();
        if (strC == null || strA == null) {
            return null;
        }
        try {
            return new Proxy(kVar.d() != null ? kVar.d() : Proxy.Type.HTTP, new InetSocketAddress(strA, Integer.parseInt(strC)));
        } catch (NumberFormatException e15) {
            this.f95771c.getLogger().a(b7.ERROR, e15, "Failed to parse Sentry Proxy port: " + kVar.c() + ". Proxy is ignored", new Object[0]);
            return null;
        }
    }

    HttpURLConnection e() {
        return (HttpURLConnection) (this.f95769a == null ? this.f95770b.b().openConnection() : this.f95770b.b().openConnection(this.f95769a));
    }

    public c0 h(p5 p5Var) throws IOException {
        c0 c0VarF;
        this.f95771c.getSocketTagger().b();
        HttpURLConnection httpURLConnectionB = b();
        try {
            OutputStream outputStream = httpURLConnectionB.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f95771c.getSerializer().b(p5Var, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (Throwable th4) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        } catch (Throwable th8) {
            try {
                this.f95771c.getLogger().a(b7.ERROR, th8, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
            } finally {
                f(httpURLConnectionB);
                this.f95771c.getSocketTagger().a();
            }
        }
        return c0VarF;
    }

    public void i(HttpURLConnection httpURLConnection, int i15) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        this.f95772d.N(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i15);
    }

    o(q7 q7Var, c4 c4Var, m mVar, a0 a0Var) {
        this.f95770b = c4Var;
        this.f95771c = q7Var;
        this.f95772d = a0Var;
        Proxy proxyG = g(q7Var.getProxy());
        this.f95769a = proxyG;
        if (proxyG == null || q7Var.getProxy() == null) {
            return;
        }
        String strE = q7Var.getProxy().e();
        String strB = q7Var.getProxy().b();
        if (strE == null || strB == null) {
            return;
        }
        mVar.b(new v(strE, strB));
    }
}
