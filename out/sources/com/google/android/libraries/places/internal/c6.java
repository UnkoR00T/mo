package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class c6 extends az implements i00 {
    private static final c6 zzj;
    private static volatile p00 zzk;
    private int zzb;
    private pt0 zze;
    private y5 zzf;
    private iz zzg = az.z();
    private int zzh;
    private int zzi;

    static {
        c6 c6Var = new c6();
        zzj = c6Var;
        az.r(c6.class, c6Var);
    }

    private c6() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0001\u0002\u001b\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0000", new Object[]{"zzb", "zzf", "zzg", i5.class, "zzh", b6.f31745a, "zzi", a6.f31567a, "zze"});
        }
        if (i16 == 3) {
            return new c6();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new z5(bArr);
        }
        if (i16 == 5) {
            return zzj;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzk;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (c6.class) {
            try {
                vyVar = zzk;
                if (vyVar == null) {
                    vyVar = new vy(zzj);
                    zzk = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
