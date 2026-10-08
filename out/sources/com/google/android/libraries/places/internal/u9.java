package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class u9 extends az implements i00 {
    private static final u9 zzg;
    private static volatile p00 zzh;
    private int zzb;
    private int zze;
    private float zzf;

    static {
        u9 u9Var = new u9();
        zzg = u9Var;
        az.r(u9.class, u9Var);
    }

    private u9() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0001\u0002\u0000\u0001\u0010\u0011\u0002\u0000\u0000\u0000\u0010᠌\u0000\u0011ခ\u0001", new Object[]{"zzb", "zze", t2.f33746a, "zzf"});
        }
        if (i16 == 3) {
            return new u9();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new s9(bArr);
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
        synchronized (u9.class) {
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
