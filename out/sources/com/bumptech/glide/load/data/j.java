package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class j implements d<InputStream> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final b f28837g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe.h f28838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f28840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HttpURLConnection f28841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InputStream f28842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f28843f;

    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    interface b {
        HttpURLConnection a(URL url);
    }

    public j(fe.h hVar, int i15) {
        this(hVar, i15, f28837g);
    }

    private HttpURLConnection c(URL url, Map<String, String> map) throws zd.e {
        try {
            HttpURLConnection httpURLConnectionA = this.f28840c.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionA.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionA.setConnectTimeout(this.f28839b);
            httpURLConnectionA.setReadTimeout(this.f28839b);
            httpURLConnectionA.setUseCaches(false);
            httpURLConnectionA.setDoInput(true);
            httpURLConnectionA.setInstanceFollowRedirects(false);
            return httpURLConnectionA;
        } catch (IOException e15) {
            throw new zd.e("URL.openConnection threw", 0, e15);
        }
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) throws zd.e {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f28842e = ve.c.h(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.f28842e = httpURLConnection.getInputStream();
            }
            return this.f28842e;
        } catch (IOException e15) {
            throw new zd.e("Failed to obtain InputStream", f(httpURLConnection), e15);
        }
    }

    private static boolean h(int i15) {
        return i15 / 100 == 2;
    }

    private static boolean i(int i15) {
        return i15 / 100 == 3;
    }

    private InputStream j(URL url, int i15, URL url2, Map<String, String> map) throws zd.e {
        if (i15 >= 5) {
            throw new zd.e("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new zd.e("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionC = c(url, map);
        this.f28841d = httpURLConnectionC;
        try {
            httpURLConnectionC.connect();
            this.f28842e = this.f28841d.getInputStream();
            if (this.f28843f) {
                return null;
            }
            int iF = f(this.f28841d);
            if (h(iF)) {
                return g(this.f28841d);
            }
            if (!i(iF)) {
                if (iF == -1) {
                    throw new zd.e(iF);
                }
                try {
                    throw new zd.e(this.f28841d.getResponseMessage(), iF);
                } catch (IOException e15) {
                    throw new zd.e("Failed to get a response message", iF, e15);
                }
            }
            String headerField = this.f28841d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new zd.e("Received empty or null redirect url", iF);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i15 + 1, url, map);
            } catch (MalformedURLException e16) {
                throw new zd.e("Bad redirect url: " + headerField, iF, e16);
            }
        } catch (IOException e17) {
            throw new zd.e("Failed to connect or obtain data", f(this.f28841d), e17);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f28842e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f28841d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f28841d = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f28843f = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public zd.a d() {
        return zd.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) {
        long jB = ve.g.b();
        try {
            aVar.f(j(this.f28838a.h(), 0, null, this.f28838a.e()));
        } catch (IOException e15) {
            aVar.c(e15);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                ve.g.a(jB);
            }
        }
    }

    j(fe.h hVar, int i15, b bVar) {
        this.f28838a = hVar;
        this.f28839b = i15;
        this.f28840c = bVar;
    }
}
