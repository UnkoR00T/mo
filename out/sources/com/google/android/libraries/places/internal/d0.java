package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends az implements i00 {
    private static final d0 zzm;
    private static volatile p00 zzn;
    private int zzb;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private int zzl;
    private fz zze = az.w();
    private String zzf = "";
    private tx zzk = tx.f33820b;

    static {
        d0 d0Var = new d0();
        zzm = d0Var;
        az.r(d0.class, d0Var);
    }

    private d0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ࠬ\u0002ဈ\u0000\u0003ဇ\u0001\u0004ဇ\u0002\u0005ဂ\u0003\u0006ခ\u0004\u0007ည\u0005\bင\u0006", new Object[]{"zzb", "zze", c0.f31832a, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i16 == 3) {
            return new d0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new b0(bArr);
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
        synchronized (d0.class) {
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
