package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ms0 extends az implements i00 {
    private static final ms0 zzg;
    private static volatile p00 zzh;
    private int zzb;
    private float zze;
    private float zzf;

    static {
        ms0 ms0Var = new ms0();
        zzg = ms0Var;
        az.r(ms0.class, ms0Var);
    }

    private ms0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new ms0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ls0(bArr);
        }
        if (i16 == 5) {
            return zzg;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzh;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (ms0.class) {
            try {
                vyVar = zzh;
                if (vyVar == null) {
                    vyVar = new vy(zzg);
                    zzh = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
