package qd;

import android.content.Context;
import android.util.Pair;
import fd.h0;
import fd.r;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f166071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f166072b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f166073a;

        static {
            int[] iArr = new int[c.values().length];
            f166073a = iArr;
            try {
                iArr[c.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f166073a[c.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(g gVar, f fVar) {
        this.f166071a = gVar;
        this.f166072b = fVar;
    }

    private fd.f a(Context context, String str, String str2) {
        g gVar;
        Pair<c, InputStream> pairA;
        h0<fd.f> h0VarJ;
        if (str2 == null || (gVar = this.f166071a) == null || (pairA = gVar.a(str)) == null) {
            return null;
        }
        c cVar = (c) pairA.first;
        InputStream inputStream = (InputStream) pairA.second;
        int i15 = a.f166073a[cVar.ordinal()];
        if (i15 == 1) {
            h0VarJ = r.J(context, new ZipInputStream(inputStream), str2);
        } else if (i15 != 2) {
            h0VarJ = r.t(inputStream, str2);
        } else {
            try {
                h0VarJ = r.t(new GZIPInputStream(inputStream), str2);
            } catch (IOException e15) {
                h0VarJ = new h0<>(e15);
            }
        }
        if (h0VarJ.b() != null) {
            return h0VarJ.b();
        }
        return null;
    }

    private h0<fd.f> b(Context context, String str, String str2) {
        h0<fd.f> h0Var;
        td.e.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                d dVarA = this.f166072b.a(str);
                if (dVarA.isSuccessful()) {
                    h0Var = e(context, str, dVarA.t1(), dVarA.j1(), str2);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Completed fetch from network. Success: ");
                    sb5.append(h0Var.b() != null);
                    td.e.a(sb5.toString());
                } else {
                    h0Var = new h0<>(new IllegalArgumentException(dVarA.h3()));
                }
                try {
                    dVarA.close();
                    return h0Var;
                } catch (IOException e15) {
                    td.e.d("LottieFetchResult close failed ", e15);
                    return h0Var;
                }
            } catch (Exception e16) {
                h0<fd.f> h0Var2 = new h0<>(e16);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e17) {
                        td.e.d("LottieFetchResult close failed ", e17);
                    }
                }
                return h0Var2;
            }
        } catch (Throwable th4) {
            if (0 == 0) {
                throw th4;
            }
            try {
                closeable.close();
                throw th4;
            } catch (IOException e18) {
                td.e.d("LottieFetchResult close failed ", e18);
                throw th4;
            }
        }
    }

    private h0<fd.f> d(String str, InputStream inputStream, String str2) throws IOException {
        g gVar;
        if (str2 == null || (gVar = this.f166071a) == null) {
            return r.t(new GZIPInputStream(inputStream), null);
        }
        File fileG = gVar.g(str, inputStream, c.GZIP);
        return r.t(new GZIPInputStream(io.sentry.instrumentation.file.h.b.a(new FileInputStream(fileG), fileG)), str);
    }

    private h0<fd.f> e(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        h0<fd.f> h0VarG;
        c cVar;
        g gVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            td.e.a("Handling zip response.");
            c cVar2 = c.ZIP;
            h0VarG = g(context, str, inputStream, str3);
            cVar = cVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            td.e.a("Handling gzip response.");
            cVar = c.GZIP;
            h0VarG = d(str, inputStream, str3);
        } else {
            td.e.a("Received json response.");
            cVar = c.JSON;
            h0VarG = f(str, inputStream, str3);
        }
        if (str3 != null && h0VarG.b() != null && (gVar = this.f166071a) != null) {
            gVar.f(str, cVar);
        }
        return h0VarG;
    }

    private h0<fd.f> f(String str, InputStream inputStream, String str2) {
        g gVar;
        if (str2 == null || (gVar = this.f166071a) == null) {
            return r.t(inputStream, null);
        }
        String absolutePath = gVar.g(str, inputStream, c.JSON).getAbsolutePath();
        return r.t(io.sentry.instrumentation.file.h.b.c(new FileInputStream(absolutePath), absolutePath), str);
    }

    private h0<fd.f> g(Context context, String str, InputStream inputStream, String str2) throws IOException {
        g gVar;
        if (str2 == null || (gVar = this.f166071a) == null) {
            return r.J(context, new ZipInputStream(inputStream), null);
        }
        File fileG = gVar.g(str, inputStream, c.ZIP);
        return r.J(context, new ZipInputStream(io.sentry.instrumentation.file.h.b.a(new FileInputStream(fileG), fileG)), str);
    }

    public h0<fd.f> c(Context context, String str, String str2) {
        fd.f fVarA = a(context, str, str2);
        if (fVarA != null) {
            return new h0<>(fVarA);
        }
        td.e.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }
}
