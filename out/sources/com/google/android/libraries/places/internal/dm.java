package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class dm extends az implements i00 {
    private static final dm zzg;
    private static volatile p00 zzh;
    private int zzb;
    private int zze;
    private jl zzf;

    static {
        dm dmVar = new dm();
        zzg = dmVar;
        az.r(dm.class, dmVar);
    }

    private dm() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", cm.f31911a, "zzf"});
        }
        if (i16 == 3) {
            return new dm();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new bm(bArr);
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
        synchronized (dm.class) {
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
