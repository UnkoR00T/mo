package x5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, w5.e.c> f216838a = new ConcurrentHashMap<>();

    class a implements b<f6.g.b> {
        a() {
        }

        @Override // x5.v.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(f6.g.b bVar) {
            return bVar.g();
        }

        @Override // x5.v.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(f6.g.b bVar) {
            return bVar.h();
        }
    }

    private interface b<T> {
        boolean a(T t15);

        int b(T t15);
    }

    v() {
    }

    private static <T> T e(T[] tArr, int i15, b<T> bVar) {
        return (T) f(tArr, (i15 & 1) == 0 ? 400 : 700, (i15 & 2) != 0, bVar);
    }

    private static <T> T f(T[] tArr, int i15, boolean z15, b<T> bVar) {
        T t15 = null;
        int i16 = Integer.MAX_VALUE;
        for (T t16 : tArr) {
            int iAbs = (Math.abs(bVar.b(t16) - i15) * 2) + (bVar.a(t16) == z15 ? 0 : 1);
            if (t15 == null || i16 > iAbs) {
                t15 = t16;
                i16 = iAbs;
            }
        }
        return t15;
    }

    public Typeface a(Context context, w5.e.c cVar, Resources resources, int i15) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, f6.g.b[] bVarArr, int i15) {
        throw null;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, List<f6.g.b[]> list, int i15) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i15, String str, int i16) {
        File fileD = w.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (w.b(fileD, resources, i15)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    protected f6.g.b g(f6.g.b[] bVarArr, int i15) {
        return (f6.g.b) e(bVarArr, i15, new a());
    }
}
