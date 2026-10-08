package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class j6 extends az implements i00 {
    private static final j6 zzf;
    private static volatile p00 zzg;
    private int zzb = 0;
    private Object zze;

    static {
        j6 j6Var = new j6();
        zzf = j6Var;
        az.r(j6.class, j6Var);
    }

    private j6() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzf, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zze", "zzb", n6.class, h6.class, l6.class});
        }
        if (i16 == 3) {
            return new j6();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new i6(bArr);
        }
        if (i16 == 5) {
            return zzf;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzg;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (j6.class) {
            try {
                vyVar = zzg;
                if (vyVar == null) {
                    vyVar = new vy(zzf);
                    zzg = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
