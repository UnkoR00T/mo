package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class uw extends az implements i00 {
    private static final uw zzg;
    private static volatile p00 zzh;
    private double zzb;
    private fz zze = az.w();
    private iz zzf = az.z();

    static {
        uw uwVar = new uw();
        zzg = uwVar;
        az.r(uw.class, uwVar);
    }

    private uw() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0000\u0002,\u0003Ț", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new uw();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new tw(bArr);
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
        synchronized (uw.class) {
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
