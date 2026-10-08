package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class k40 extends az implements i00 {
    private static final k40 zzn;
    private static volatile p00 zzo;
    private int zzb;
    private fz zze = az.w();
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzi;
    private float zzj;
    private float zzk;
    private int zzl;
    private h00 zzm;

    static {
        k40 k40Var = new k40();
        zzn = k40Var;
        az.r(k40.class, k40Var);
    }

    private k40() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            ez ezVar = jo.f32668a;
            ez ezVar2 = iy.f32619a;
            return az.s(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ࠬ\u0002᠌\u0000\u0003᠌\u0001\u0004င\u0002\u0005ဂ\u0003\u0006ခ\u0004\u0007ခ\u0005\b᠌\u0006\tဉ\u0007", new Object[]{"zzb", "zze", ezVar, "zzf", ezVar2, "zzg", ezVar2, "zzh", "zzi", "zzj", "zzk", "zzl", ezVar, "zzm"});
        }
        if (i16 == 3) {
            return new k40();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new j30(bArr);
        }
        if (i16 == 5) {
            return zzn;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzo;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (k40.class) {
            try {
                vyVar = zzo;
                if (vyVar == null) {
                    vyVar = new vy(zzn);
                    zzo = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
