package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class g8 extends az implements i00 {
    private static final g8 zzm;
    private static volatile p00 zzn;
    private int zzb;
    private int zze;
    private long zzf;
    private s7 zzg;
    private long zzh;
    private int zzi;
    private fz zzj = az.w();
    private fz zzk = az.w();
    private int zzl;

    static {
        g8 g8Var = new g8();
        zzm = g8Var;
        az.r(g8.class, g8Var);
    }

    private g8() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001᠌\u0000\u0002စ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006\u0016\u0007\u0016\bင\u0005", new Object[]{"zzb", "zze", f8.f32258a, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i16 == 3) {
            return new g8();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new e8(bArr);
        }
        if (i16 == 5) {
            return zzm;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzn;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (g8.class) {
            try {
                vyVar = zzn;
                if (vyVar == null) {
                    vyVar = new vy(zzm);
                    zzn = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
