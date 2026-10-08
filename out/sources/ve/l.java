package ve;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import fe.m;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f206296a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f206297b = new char[64];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile Handler f206298c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f206299a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f206299a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f206299a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f206299a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f206299a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f206299a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private l() {
    }

    public static void a() {
        if (!r()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(re.a<?> aVar, re.a<?> aVar2) {
        if (aVar == null) {
            return aVar2 == null;
        }
        return aVar.O(aVar2);
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj instanceof m ? ((m) obj).a(obj2) : obj.equals(obj2);
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static String e(byte[] bArr, char[] cArr) {
        for (int i15 = 0; i15 < bArr.length; i15++) {
            byte b15 = bArr[i15];
            int i16 = i15 * 2;
            char[] cArr2 = f206296a;
            cArr[i16] = cArr2[(b15 & 255) >>> 4];
            cArr[i16 + 1] = cArr2[b15 & 15];
        }
        return new String(cArr);
    }

    public static <T> Queue<T> f(int i15) {
        return new ArrayDeque(i15);
    }

    public static int g(int i15, int i16, Bitmap.Config config) {
        return i15 * i16 * i(config);
    }

    @TargetApi(19)
    public static int h(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i15 = a.f206299a[config.ordinal()];
        int i16 = 1;
        if (i15 != 1) {
            i16 = 2;
            if (i15 != 2 && i15 != 3) {
                return i15 != 4 ? 4 : 8;
            }
        }
        return i16;
    }

    public static <T> List<T> j(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t15 : collection) {
            if (t15 != null) {
                arrayList.add(t15);
            }
        }
        return arrayList;
    }

    private static Handler k() {
        if (f206298c == null) {
            synchronized (l.class) {
                try {
                    if (f206298c == null) {
                        f206298c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return f206298c;
    }

    public static int l(float f15) {
        return m(f15, 17);
    }

    public static int m(float f15, int i15) {
        return n(Float.floatToIntBits(f15), i15);
    }

    public static int n(int i15, int i16) {
        return (i16 * 31) + i15;
    }

    public static int o(Object obj, int i15) {
        return n(obj == null ? 0 : obj.hashCode(), i15);
    }

    public static int p(boolean z15, int i15) {
        return n(z15 ? 1 : 0, i15);
    }

    public static boolean q() {
        return !r();
    }

    public static boolean r() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean s(int i15) {
        return i15 > 0 || i15 == Integer.MIN_VALUE;
    }

    public static boolean t(int i15, int i16) {
        return s(i15) && s(i16);
    }

    public static void u(Runnable runnable) {
        k().post(runnable);
    }

    public static void v(Runnable runnable) {
        k().removeCallbacks(runnable);
    }

    public static String w(byte[] bArr) {
        String strE;
        char[] cArr = f206297b;
        synchronized (cArr) {
            strE = e(bArr, cArr);
        }
        return strE;
    }
}
