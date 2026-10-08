package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f35999a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f36000b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f36001c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f36002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f36003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.crypto.tink.shaded.protobuf.i f36004f;

    public interface a extends i<Boolean> {
    }

    public interface b extends i<Double> {
    }

    public interface c {
        int h();
    }

    public interface d<T extends c> {
        T a(int i15);
    }

    public interface e {
        boolean a(int i15);
    }

    public interface f extends i<Float> {
    }

    public interface g extends i<Integer> {
    }

    public interface h extends i<Long> {
    }

    public interface i<E> extends List<E>, RandomAccess {
        void O();

        boolean c0();

        i<E> d0(int i15);
    }

    static {
        byte[] bArr = new byte[0];
        f36002d = bArr;
        f36003e = ByteBuffer.wrap(bArr);
        f36004f = com.google.crypto.tink.shaded.protobuf.i.h(bArr);
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
        int i17 = i(i16, bArr, i15, i16);
        if (i17 == 0) {
            return 1;
        }
        return i17;
    }

    public static int f(long j15) {
        return (int) (j15 ^ (j15 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return s1.m(bArr);
    }

    static Object h(Object obj, Object obj2) {
        return ((r0) obj).b().D1((r0) obj2).E();
    }

    static int i(int i15, byte[] bArr, int i16, int i17) {
        for (int i18 = i16; i18 < i16 + i17; i18++) {
            i15 = (i15 * 31) + bArr[i18];
        }
        return i15;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f36000b);
    }
}
