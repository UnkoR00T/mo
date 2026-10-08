package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class xj extends az implements i00 {
    private static final xj zzm;
    private static volatile p00 zzn;
    private int zzb;
    private nf zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        xj xjVar = new xj();
        zzm = xjVar;
        az.r(xj.class, xjVar);
    }

    private xj() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006᠌\u0005\u0007င\u0006\b᠌\u0007", new Object[]{"zzb", "zze", "zzf", of.f33176a, "zzg", wj.f34166a, "zzh", "zzi", "zzj", vj.f34066a, "zzk", "zzl", me.f32939a});
        }
        if (i16 == 3) {
            return new xj();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new uj(bArr);
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
        synchronized (xj.class) {
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
