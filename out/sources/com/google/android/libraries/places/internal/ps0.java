package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ps0 extends az implements i00 {
    private static final ps0 zzl;
    private static volatile p00 zzm;
    private int zzb;
    private iz zze = az.z();
    private iz zzf = az.z();
    private iz zzg = az.z();
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;

    static {
        ps0 ps0Var = new ps0();
        zzl = ps0Var;
        az.r(ps0.class, ps0Var);
    }

    private ps0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzl, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0003\u0000\u0002\u001b\u0003\u001b\u0004င\u0000\u0005င\u0001\u0006င\u0002\u0007ဂ\u0003\b\u001b", new Object[]{"zzb", "zzf", os0.class, "zzg", ms0.class, "zzh", "zzi", "zzj", "zzk", "zze", wh0.class});
        }
        if (i16 == 3) {
            return new ps0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new zr0(bArr);
        }
        if (i16 == 5) {
            return zzl;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzm;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (ps0.class) {
            try {
                vyVar = zzm;
                if (vyVar == null) {
                    vyVar = new vy(zzl);
                    zzm = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
