package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class os0 extends az implements i00 {
    private static final os0 zzg;
    private static volatile p00 zzh;
    private int zzb;
    private long zze;
    private float zzf;

    static {
        os0 os0Var = new os0();
        zzg = os0Var;
        az.r(os0.class, os0Var);
    }

    private os0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new os0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ns0(bArr);
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
        synchronized (os0.class) {
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
