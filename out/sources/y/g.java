package y;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Charset f222456e = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String[] f222457f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[] f222458g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final byte[] f222459h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f222460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f222461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f222462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f222463d;

    g(int i15, int i16, byte[] bArr) {
        this(i15, i16, -1L, bArr);
    }

    public static g a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new g(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f222456e);
        return new g(1, bytes.length, bytes);
    }

    public static g b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f222458g[12] * dArr.length]);
        byteBufferWrap.order(byteOrder);
        for (double d15 : dArr) {
            byteBufferWrap.putDouble(d15);
        }
        return new g(12, dArr.length, byteBufferWrap.array());
    }

    public static g c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f222458g[9] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i15 : iArr) {
            byteBufferWrap.putInt(i15);
        }
        return new g(9, iArr.length, byteBufferWrap.array());
    }

    public static g d(m[] mVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f222458g[10] * mVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (m mVar : mVarArr) {
            byteBufferWrap.putInt((int) mVar.b());
            byteBufferWrap.putInt((int) mVar.a());
        }
        return new g(10, mVarArr.length, byteBufferWrap.array());
    }

    public static g e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f222456e);
        return new g(2, bytes.length, bytes);
    }

    public static g f(long j15, ByteOrder byteOrder) {
        return g(new long[]{j15}, byteOrder);
    }

    public static g g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f222458g[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j15 : jArr) {
            byteBufferWrap.putInt((int) j15);
        }
        return new g(4, jArr.length, byteBufferWrap.array());
    }

    public static g h(m[] mVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f222458g[5] * mVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (m mVar : mVarArr) {
            byteBufferWrap.putInt((int) mVar.b());
            byteBufferWrap.putInt((int) mVar.a());
        }
        return new g(5, mVarArr.length, byteBufferWrap.array());
    }

    public static g i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f222458g[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i15 : iArr) {
            byteBufferWrap.putShort((short) i15);
        }
        return new g(3, iArr.length, byteBufferWrap.array());
    }

    public int j() {
        return f222458g[this.f222460a] * this.f222461b;
    }

    public String toString() {
        return "(" + f222457f[this.f222460a] + ", data length:" + this.f222463d.length + ")";
    }

    g(int i15, int i16, long j15, byte[] bArr) {
        this.f222460a = i15;
        this.f222461b = i16;
        this.f222462c = j15;
        this.f222463d = bArr;
    }
}
