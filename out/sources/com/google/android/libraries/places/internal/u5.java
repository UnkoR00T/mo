package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class u5 extends az implements i00 {
    private static final u5 zzg;
    private static volatile p00 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        u5 u5Var = new u5();
        zzg = u5Var;
        az.r(u5.class, u5Var);
    }

    private u5() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", s5.f33650a, "zzf", t5.f33751a});
        }
        if (i16 == 3) {
            return new u5();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new r5(bArr);
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
        synchronized (u5.class) {
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
