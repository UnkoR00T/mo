package fd;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, j0<f>> f61312a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<k0> f61313b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f61314c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f61315d = {31, -117, 8};

    public static j0<f> A(final String str, final String str2) {
        return l(str2, new Callable() { // from class: fd.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.B(str, str2);
            }
        }, null);
    }

    public static h0<f> B(String str, String str2) {
        return y(vv.v.j(new ByteArrayInputStream(str.getBytes())), str2);
    }

    public static j0<f> C(Context context, int i15) {
        return D(context, i15, R(context, i15));
    }

    public static j0<f> D(Context context, final int i15, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return l(str, new Callable() { // from class: fd.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.d(weakReference, applicationContext, i15, str);
            }
        }, null);
    }

    public static h0<f> E(Context context, int i15, String str) {
        f fVarA = str == null ? null : md.g.b().a(str);
        if (fVarA != null) {
            return new h0<>(fVarA);
        }
        try {
            vv.g gVarC = vv.v.c(vv.v.j(context.getResources().openRawResource(i15)));
            if (O(gVarC).booleanValue()) {
                return J(context, new ZipInputStream(gVarC.f4()), str);
            }
            if (!M(gVarC).booleanValue()) {
                return v(sd.c.u(gVarC), str);
            }
            try {
                return t(new GZIPInputStream(gVarC.f4()), str);
            } catch (IOException e15) {
                return new h0<>((Throwable) e15);
            }
        } catch (Resources.NotFoundException e16) {
            return new h0<>((Throwable) e16);
        }
    }

    public static j0<f> F(Context context, String str) {
        return G(context, str, "url_" + str);
    }

    public static j0<f> G(final Context context, final String str, final String str2) {
        return l(str2, new Callable() { // from class: fd.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.c(context, str, str2);
            }
        }, null);
    }

    public static j0<f> H(final Context context, final ZipInputStream zipInputStream, final String str) {
        return l(str, new Callable() { // from class: fd.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.J(context, zipInputStream, str);
            }
        }, new Runnable() { // from class: fd.o
            @Override // java.lang.Runnable
            public final void run() {
                td.m.c(zipInputStream);
            }
        });
    }

    public static j0<f> I(ZipInputStream zipInputStream, String str) {
        return H(null, zipInputStream, str);
    }

    public static h0<f> J(Context context, ZipInputStream zipInputStream, String str) {
        return K(context, zipInputStream, str, true);
    }

    public static h0<f> K(Context context, ZipInputStream zipInputStream, String str, boolean z15) {
        try {
            return L(context, zipInputStream, str);
        } finally {
            if (z15) {
                td.m.c(zipInputStream);
            }
        }
    }

    private static h0<f> L(Context context, ZipInputStream zipInputStream, String str) {
        f fVarA;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            fVarA = null;
        } else {
            try {
                fVarA = md.g.b().a(str);
            } catch (IOException e15) {
                return new h0<>((Throwable) e15);
            }
        }
        if (fVarA != null) {
            return new h0<>(fVarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        f fVarB = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                fVarB = x(sd.c.u(vv.v.c(vv.v.j(zipInputStream))), null, false).b();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new h0<>((Throwable) new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStreamA = io.sentry.instrumentation.file.l.b.a(new FileOutputStream(file), file);
                    try {
                        FileOutputStream fileOutputStreamA2 = io.sentry.instrumentation.file.l.b.a(new FileOutputStream(file), file);
                        try {
                            byte[] bArr = new byte[PKIFailureInfo.certConfirmed];
                            while (true) {
                                int i15 = zipInputStream.read(bArr);
                                if (i15 == -1) {
                                    break;
                                }
                                fileOutputStreamA2.write(bArr, 0, i15);
                            }
                            fileOutputStreamA2.flush();
                            fileOutputStreamA2.close();
                            fileOutputStreamA.close();
                        } catch (Throwable th4) {
                            try {
                                fileOutputStreamA2.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        try {
                            fileOutputStreamA.close();
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                } catch (Throwable th8) {
                    td.e.d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th8);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    td.e.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (fVarB == null) {
            return new h0<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            d0 d0VarM = m(fVarB, (String) entry.getKey());
            if (d0VarM != null) {
                d0VarM.g(td.m.l((Bitmap) entry.getValue(), d0VarM.f(), d0VarM.d()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z15 = false;
            for (md.c cVar : fVarB.g().values()) {
                if (cVar.a().equals(entry2.getKey())) {
                    cVar.e((Typeface) entry2.getValue());
                    z15 = true;
                }
            }
            if (!z15) {
                td.e.c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator<Map.Entry<String, d0>> it = fVarB.j().entrySet().iterator();
            while (it.hasNext()) {
                d0 value = it.next().getValue();
                if (value == null) {
                    return null;
                }
                String strC = value.c();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strC.startsWith("data:") && strC.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strC.substring(strC.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            value.g(td.m.l(bitmapDecodeByteArray, value.f(), value.d()));
                        }
                    } catch (IllegalArgumentException e16) {
                        td.e.d("data URL did not have correct base64 format.", e16);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            md.g.b().c(str, fVarB);
        }
        return new h0<>(fVarB);
    }

    private static Boolean M(vv.g gVar) {
        return P(gVar, f61315d);
    }

    private static boolean N(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean O(vv.g gVar) {
        return P(gVar, f61314c);
    }

    private static Boolean P(vv.g gVar, byte[] bArr) {
        try {
            vv.g gVarPeek = gVar.peek();
            for (byte b15 : bArr) {
                if (gVarPeek.readByte() != b15) {
                    return Boolean.FALSE;
                }
            }
            gVarPeek.close();
            return Boolean.TRUE;
        } catch (Exception e15) {
            td.e.b("Failed to check zip file header", e15);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    private static void Q(boolean z15) {
        ArrayList arrayList = new ArrayList(f61313b);
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            ((k0) arrayList.get(i15)).a(z15);
        }
    }

    private static String R(Context context, int i15) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("rawRes");
        sb5.append(N(context) ? "_night_" : "_day_");
        sb5.append(i15);
        return sb5.toString();
    }

    public static /* synthetic */ void b(String str, AtomicBoolean atomicBoolean, Throwable th4) {
        Map<String, j0<f>> map = f61312a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            Q(true);
        }
    }

    public static /* synthetic */ h0 c(Context context, String str, String str2) {
        h0<f> h0VarC = e.j(context).c(context, str, str2);
        if (str2 != null && h0VarC.b() != null) {
            md.g.b().c(str2, h0VarC.b());
        }
        return h0VarC;
    }

    public static /* synthetic */ h0 d(WeakReference weakReference, Context context, int i15, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return E(context, i15, str);
    }

    public static /* synthetic */ void k(String str, AtomicBoolean atomicBoolean, f fVar) {
        Map<String, j0<f>> map = f61312a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            Q(true);
        }
    }

    private static j0<f> l(final String str, Callable<h0<f>> callable, Runnable runnable) {
        f fVarA = str == null ? null : md.g.b().a(str);
        j0<f> j0Var = fVarA != null ? new j0<>(fVarA) : null;
        if (str != null) {
            Map<String, j0<f>> map = f61312a;
            if (map.containsKey(str)) {
                j0Var = map.get(str);
            }
        }
        if (j0Var != null) {
            if (runnable != null) {
                runnable.run();
            }
            return j0Var;
        }
        j0<f> j0Var2 = new j0<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            j0Var2.d(new e0() { // from class: fd.q
                @Override // fd.e0
                public final void onResult(Object obj) {
                    r.k(str, atomicBoolean, (f) obj);
                }
            });
            j0Var2.c(new e0() { // from class: fd.h
                @Override // fd.e0
                public final void onResult(Object obj) {
                    r.b(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, j0<f>> map2 = f61312a;
                map2.put(str, j0Var2);
                if (map2.size() == 1) {
                    Q(false);
                }
            }
        }
        return j0Var2;
    }

    private static d0 m(f fVar, String str) {
        for (d0 d0Var : fVar.j().values()) {
            if (d0Var.c().equals(str)) {
                return d0Var;
            }
        }
        return null;
    }

    public static j0<f> n(Context context, String str) {
        return o(context, str, "asset_" + str);
    }

    public static j0<f> o(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return l(str2, new Callable() { // from class: fd.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.p(applicationContext, str, str2);
            }
        }, null);
    }

    public static h0<f> p(Context context, String str, String str2) {
        f fVarA = str2 == null ? null : md.g.b().a(str2);
        if (fVarA != null) {
            return new h0<>(fVarA);
        }
        try {
            return r(context, context.getAssets().open(str), str2);
        } catch (IOException e15) {
            return new h0<>((Throwable) e15);
        }
    }

    public static j0<f> q(Context context, final InputStream inputStream, final String str) {
        final Context applicationContext = context == null ? null : context.getApplicationContext();
        return l(str, new Callable() { // from class: fd.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.r(applicationContext, inputStream, str);
            }
        }, null);
    }

    public static h0<f> r(Context context, InputStream inputStream, String str) {
        f fVarA = str == null ? null : md.g.b().a(str);
        if (fVarA != null) {
            return new h0<>(fVarA);
        }
        try {
            vv.g gVarC = vv.v.c(vv.v.j(inputStream));
            if (O(gVarC).booleanValue()) {
                return J(context, new ZipInputStream(gVarC.f4()), str);
            }
            return M(gVarC).booleanValue() ? t(new GZIPInputStream(gVarC.f4()), str) : v(sd.c.u(gVarC), str);
        } catch (IOException e15) {
            return new h0<>((Throwable) e15);
        }
    }

    public static j0<f> s(final InputStream inputStream, final String str) {
        return l(str, new Callable() { // from class: fd.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.t(inputStream, str);
            }
        }, new Runnable() { // from class: fd.k
            @Override // java.lang.Runnable
            public final void run() {
                td.m.c(inputStream);
            }
        });
    }

    public static h0<f> t(InputStream inputStream, String str) {
        return u(inputStream, str, true);
    }

    public static h0<f> u(InputStream inputStream, String str, boolean z15) {
        return z(vv.v.j(inputStream), str, z15);
    }

    public static h0<f> v(sd.c cVar, String str) {
        return w(cVar, str, true);
    }

    public static h0<f> w(sd.c cVar, String str, boolean z15) {
        return x(cVar, str, z15);
    }

    private static h0<f> x(sd.c cVar, String str, boolean z15) {
        try {
            f fVarA = str == null ? null : md.g.b().a(str);
            if (fVarA != null) {
                return new h0<>(fVarA);
            }
            f fVarA2 = rd.w.a(cVar);
            if (str != null) {
                md.g.b().c(str, fVarA2);
            }
            return new h0<>(fVarA2);
        } catch (Exception e15) {
            return new h0<>((Throwable) e15);
        } finally {
            if (z15) {
                td.m.c(cVar);
            }
        }
    }

    public static h0<f> y(vv.k0 k0Var, String str) {
        return z(k0Var, str, true);
    }

    public static h0<f> z(vv.k0 k0Var, String str, boolean z15) {
        return x(sd.c.u(vv.v.c(k0Var)), str, z15);
    }
}
