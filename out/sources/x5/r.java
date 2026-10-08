package x5;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class r extends q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final Class<?> f216831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Constructor<?> f216832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final Method f216833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final Method f216834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final Method f216835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final Method f216836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final Method f216837m;

    public r() {
        Class<?> clsU;
        Constructor<?> constructorV;
        Method methodR;
        Method methodS;
        Method methodW;
        Method methodQ;
        Method methodT;
        try {
            clsU = u();
            constructorV = v(clsU);
            methodR = r(clsU);
            methodS = s(clsU);
            methodW = w(clsU);
            methodQ = q(clsU);
            methodT = t(clsU);
        } catch (ClassNotFoundException | NoSuchMethodException e15) {
            c2.f("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e15.getClass().getName(), e15);
            clsU = null;
            constructorV = null;
            methodR = null;
            methodS = null;
            methodW = null;
            methodQ = null;
            methodT = null;
        }
        this.f216831g = clsU;
        this.f216832h = constructorV;
        this.f216833i = methodR;
        this.f216834j = methodS;
        this.f216835k = methodW;
        this.f216836l = methodQ;
        this.f216837m = methodT;
    }

    private Object k() {
        try {
            return this.f216832h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void l(Object obj) {
        try {
            this.f216836l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean m(Context context, Object obj, String str, int i15, int i16, int i17, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f216833i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean n(Object obj, ByteBuffer byteBuffer, int i15, int i16, int i17) {
        try {
            return ((Boolean) this.f216834j.invoke(obj, byteBuffer, Integer.valueOf(i15), null, Integer.valueOf(i16), Integer.valueOf(i17))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj) {
        try {
            return ((Boolean) this.f216835k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p() {
        if (this.f216833i == null) {
            c2.g("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f216833i != null;
    }

    @Override // x5.q, x5.v
    public Typeface a(Context context, w5.e.c cVar, Resources resources, int i15) {
        if (!p()) {
            return super.a(context, cVar, resources, i15);
        }
        Object objK = k();
        if (objK == null) {
            return null;
        }
        w5.e.d[] dVarArrA = cVar.a();
        int length = dVarArrA.length;
        int i16 = 0;
        while (i16 < length) {
            w5.e.d dVar = dVarArrA[i16];
            Context context2 = context;
            if (!m(context2, objK, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                l(objK);
                return null;
            }
            i16++;
            context = context2;
        }
        if (o(objK)) {
            return i(objK);
        }
        return null;
    }

    @Override // x5.v
    public Typeface b(Context context, CancellationSignal cancellationSignal, f6.g.b[] bVarArr, int i15) {
        Typeface typefaceI;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!p()) {
            f6.g.b bVarG = g(bVarArr, i15);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarG.e(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarG.g()).setItalic(bVarG.h()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th4) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapF = w.f(context, bVarArr, cancellationSignal);
        Object objK = k();
        if (objK == null) {
            return null;
        }
        int length = bVarArr.length;
        int i16 = 0;
        boolean z15 = false;
        while (i16 < length) {
            f6.g.b bVar = bVarArr[i16];
            ByteBuffer byteBuffer = mapF.get(bVar.e());
            if (byteBuffer == null) {
                obj = objK;
            } else {
                boolean zN = n(objK, byteBuffer, bVar.d(), bVar.g(), bVar.h() ? 1 : 0);
                obj = objK;
                if (!zN) {
                    l(obj);
                    return null;
                }
                z15 = true;
            }
            i16++;
            objK = obj;
            z15 = z15;
        }
        Object obj2 = objK;
        if (!z15) {
            l(obj2);
            return null;
        }
        if (o(obj2) && (typefaceI = i(obj2)) != null) {
            return Typeface.create(typefaceI, i15);
        }
        return null;
    }

    @Override // x5.v
    public /* bridge */ /* synthetic */ Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i15) {
        return super.c(context, cancellationSignal, list, i15);
    }

    @Override // x5.v
    public Typeface d(Context context, Resources resources, int i15, String str, int i16) {
        if (!p()) {
            return super.d(context, resources, i15, str, i16);
        }
        Object objK = k();
        if (objK == null) {
            return null;
        }
        if (!m(context, objK, str, 0, -1, -1, null)) {
            l(objK);
            return null;
        }
        if (o(objK)) {
            return i(objK);
        }
        return null;
    }

    protected Typeface i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f216831g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f216837m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method q(Class<?> cls) {
        return cls.getMethod("abortCreation", null);
    }

    protected Method r(Class<?> cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    protected Method s(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method t(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> u() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> v(Class<?> cls) {
        return cls.getConstructor(null);
    }

    protected Method w(Class<?> cls) {
        return cls.getMethod("freeze", null);
    }
}
