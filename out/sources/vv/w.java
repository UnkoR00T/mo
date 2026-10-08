package vv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\u0005*\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u0001*\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0005*\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljava/io/OutputStream;", "Lvv/j0;", "b", "(Ljava/io/OutputStream;)Lvv/j0;", "Ljava/io/InputStream;", "Lvv/k0;", "f", "(Ljava/io/InputStream;)Lvv/k0;", "Ljava/net/Socket;", "c", "(Ljava/net/Socket;)Lvv/j0;", "g", "(Ljava/net/Socket;)Lvv/k0;", "Ljava/io/File;", "", "append", "a", "(Ljava/io/File;Z)Lvv/j0;", "e", "(Ljava/io/File;)Lvv/k0;", "okio"}, k = 5, mv = {2, 2, 0}, xi = 48, xs = "okio/Okio")
final /* synthetic */ class w {
    public static final j0 a(File file, boolean z15) {
        return v.f(io.sentry.instrumentation.file.l.b.b(new FileOutputStream(file, z15), file, z15));
    }

    public static final j0 b(OutputStream outputStream) {
        return new sink(outputStream, new l0());
    }

    public static final j0 c(Socket socket) {
        wv.m mVar = new wv.m(socket);
        return mVar.z(new sink(socket.getOutputStream(), mVar));
    }

    public static /* synthetic */ j0 d(File file, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        return v.e(file, z15);
    }

    public static final k0 e(File file) {
        return new source(io.sentry.instrumentation.file.h.b.a(new FileInputStream(file), file), l0.f208410e);
    }

    public static final k0 f(InputStream inputStream) {
        return new source(inputStream, new l0());
    }

    public static final k0 g(Socket socket) {
        wv.m mVar = new wv.m(socket);
        return mVar.A(new source(socket.getInputStream(), mVar));
    }
}
