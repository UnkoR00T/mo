package fk;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import sk.c0;
import sk.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f64352a = new byte[0];

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64353a;

        static {
            int[] iArr = new int[i0.values().length];
            f64353a = iArr;
            try {
                iArr[i0.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64353a[i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64353a[i0.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64353a[i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(c0.c cVar) throws GeneralSecurityException {
        int i15 = a.f64353a[cVar.c0().ordinal()];
        if (i15 == 1 || i15 == 2) {
            return ByteBuffer.allocate(5).put((byte) 0).putInt(cVar.b0()).array();
        }
        if (i15 == 3) {
            return ByteBuffer.allocate(5).put((byte) 1).putInt(cVar.b0()).array();
        }
        if (i15 == 4) {
            return f64352a;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
