package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class y9 extends az implements i00 {
    private static final y9 zzf;
    private static volatile p00 zzg;
    private int zzb;
    private int zze;

    static {
        y9 y9Var = new y9();
        zzf = y9Var;
        az.r(y9.class, y9Var);
    }

    private y9() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zze", fb.f32270a});
        }
        if (i16 == 3) {
            return new y9();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new x9(bArr);
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
        synchronized (y9.class) {
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
