package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f12227a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f12228b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f12229c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f12230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f12231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f12232f;

    public interface a {
        int h();
    }

    public interface b<T extends a> {
        T a(int i15);
    }

    public interface c {
        boolean a(int i15);
    }

    public interface d extends f<Integer> {
    }

    public interface e extends f<Long> {
    }

    public interface f<E> extends List<E>, RandomAccess {
        void O();

        boolean c0();

        f<E> d0(int i15);
    }

    static {
        byte[] bArr = new byte[0];
        f12230d = bArr;
        f12231e = ByteBuffer.wrap(bArr);
        f12232f = h.i(bArr);
    }

    static <T> T a(T t15) {
        t15.getClass();
        return t15;
    }

    static <T> T b(T t15, String str) {
        if (t15 != null) {
            return t15;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z15) {
        return z15 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i15, int i16) {
        int iH = h(i16, bArr, i15, i16);
        if (iH == 0) {
            return 1;
        }
        return iH;
    }

    public static int f(long j15) {
        return (int) (j15 ^ (j15 >>> 32));
    }

    static Object g(Object obj, Object obj2) {
        return ((r0) obj).b().V((r0) obj2).E();
    }

    static int h(int i15, byte[] bArr, int i16, int i17) {
        for (int i18 = i16; i18 < i16 + i17; i18++) {
            i15 = (i15 * 31) + bArr[i18];
        }
        return i15;
    }
}
