package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class i61 extends az implements i00 {
    private static final i61 zzg;
    private static volatile p00 zzh;
    private int zzb;
    private gt0 zze;
    private int zzf;

    static {
        i61 i61Var = new i61();
        zzg = i61Var;
        az.r(i61.class, i61Var);
    }

    private i61() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", "zzf", o51.f33153a});
        }
        if (i16 == 3) {
            return new i61();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new s41(bArr);
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
        synchronized (i61.class) {
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
