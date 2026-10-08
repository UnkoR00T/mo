package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.android.core.c2;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public class f0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f36531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Future<?> f36532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private vh.l<Bitmap> f36533c;

    private f0(URL url) {
        this.f36531a = url;
    }

    public static /* synthetic */ void b(f0 f0Var, vh.m mVar) {
        f0Var.getClass();
        try {
            mVar.c(f0Var.h());
        } catch (Exception e15) {
            mVar.b(e15);
        }
    }

    private byte[] m() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f36531a.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrD = b.d(b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                int length = bArrD.length;
                Objects.toString(this.f36531a);
            }
            if (bArrD.length <= 1048576) {
                return bArrD;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th4) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    public static f0 p(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new f0(new URL(str));
        } catch (MalformedURLException unused) {
            c2.g("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36532b.cancel(true);
    }

    public Bitmap h() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Objects.toString(this.f36531a);
        }
        byte[] bArrM = m();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM, 0, bArrM.length);
        if (bitmapDecodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(this.f36531a);
            }
            return bitmapDecodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f36531a);
    }

    public vh.l<Bitmap> r() {
        return (vh.l) jg.s.l(this.f36533c);
    }

    public void u(ExecutorService executorService) {
        final vh.m mVar = new vh.m();
        this.f36532b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.e0
            @Override // java.lang.Runnable
            public final void run() {
                f0.b(this.f36526a, mVar);
            }
        });
        this.f36533c = mVar.a();
    }
}
