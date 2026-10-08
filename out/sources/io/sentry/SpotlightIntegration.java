package io.sentry;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.concurrent.RejectedExecutionException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class SpotlightIntegration implements r1, q7.b, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q7 f93609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v0 f93610b = p2.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f1 f93611c = b3.f();

    private void p(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    private HttpURLConnection r(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(p5 p5Var) {
        try {
            if (this.f93609a == null) {
                throw new IllegalArgumentException("SentryOptions are required to send envelopes.");
            }
            HttpURLConnection httpURLConnectionR = r(u());
            try {
                OutputStream outputStream = httpURLConnectionR.getOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                    try {
                        this.f93609a.getSerializer().b(p5Var, gZIPOutputStream);
                        gZIPOutputStream.close();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        this.f93610b.c(b7.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionR.getResponseCode()));
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
                    this.f93610b.b(b7.ERROR, "An exception occurred while submitting the envelope to the Sentry server.", th8);
                    this.f93610b.c(b7.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionR.getResponseCode()));
                } finally {
                    this.f93610b.c(b7.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionR.getResponseCode()));
                    p(httpURLConnectionR);
                }
            }
        } catch (Exception e15) {
            this.f93610b.b(b7.ERROR, "An exception occurred while creating the connection to spotlight.", e15);
        }
    }

    @Override // io.sentry.q7.b
    public void b(final p5 p5Var, j0 j0Var) {
        try {
            this.f93611c.submit(new Runnable() { // from class: io.sentry.v8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f95859a.y(p5Var);
                }
            });
        } catch (RejectedExecutionException e15) {
            this.f93610b.b(b7.WARNING, "Spotlight envelope submission rejected.", e15);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f93611c.a(0L);
        q7 q7Var = this.f93609a;
        if (q7Var == null || q7Var.getBeforeEnvelopeCallback() != this) {
            return;
        }
        this.f93609a.setBeforeEnvelopeCallback(null);
    }

    @Override // io.sentry.r1
    public void m(c1 c1Var, q7 q7Var) {
        this.f93609a = q7Var;
        this.f93610b = q7Var.getLogger();
        if (q7Var.getBeforeEnvelopeCallback() != null || !q7Var.isEnableSpotlight()) {
            this.f93610b.c(b7.DEBUG, "SpotlightIntegration is not enabled. BeforeEnvelopeCallback is already set or spotlight is not enabled.", new Object[0]);
            return;
        }
        this.f93611c = new v6(q7Var);
        q7Var.setBeforeEnvelopeCallback(this);
        this.f93610b.c(b7.DEBUG, "SpotlightIntegration enabled.", new Object[0]);
        io.sentry.util.p.a("Spotlight");
    }

    public String u() {
        q7 q7Var = this.f93609a;
        if (q7Var == null || q7Var.getSpotlightConnectionUrl() == null) {
            return io.sentry.util.x.a() ? "http://10.0.2.2:8969/stream" : "http://localhost:8969/stream";
        }
        return this.f93609a.getSpotlightConnectionUrl();
    }
}
