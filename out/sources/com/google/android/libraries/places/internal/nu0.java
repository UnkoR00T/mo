package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class nu0 extends az implements i00 {
    private static final nu0 zzi;
    private static volatile p00 zzj;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        nu0 nu0Var = new nu0();
        zzi = nu0Var;
        az.r(nu0.class, nu0Var);
    }

    private nu0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003", new Object[]{"zzb", "zze", qu0.f33449a, "zzf", pu0.f33352a, "zzg", ou0.f33235a, "zzh"});
        }
        if (i16 == 3) {
            return new nu0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new mu0(bArr);
        }
        if (i16 == 5) {
            return zzi;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzj;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (nu0.class) {
            try {
                vyVar = zzj;
                if (vyVar == null) {
                    vyVar = new vy(zzi);
                    zzj = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
