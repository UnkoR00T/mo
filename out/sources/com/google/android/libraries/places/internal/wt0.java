package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class wt0 extends az implements i00 {
    private static final wt0 zzm;
    private static volatile p00 zzn;
    private int zzb;
    private int zze;
    private iz zzf = az.z();
    private iz zzg = az.z();
    private iz zzh = az.z();
    private iz zzi = az.z();
    private iz zzj = az.z();
    private iz zzk = az.z();
    private iz zzl = az.z();

    static {
        wt0 wt0Var = new wt0();
        zzm = wt0Var;
        az.r(wt0.class, wt0Var);
    }

    private wt0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzm, "\u0001\b\u0000\u0001\u0001✐\b\u0000\u0007\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b✐᠌\u0000", new Object[]{"zzb", "zzf", bu0.class, "zzg", du0.class, "zzh", uu0.class, "zzi", lu0.class, "zzj", wu0.class, "zzk", ju0.class, "zzl", hu0.class, "zze", vt0.f34087a});
        }
        if (i16 == 3) {
            return new wt0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ut0(bArr);
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
        synchronized (wt0.class) {
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
