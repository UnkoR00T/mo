package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class gd extends az implements i00 {
    private static final gd zzm;
    private static volatile p00 zzn;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;

    static {
        gd gdVar = new gd();
        zzm = gdVar;
        az.r(gd.class, gdVar);
    }

    private gd() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဇ\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", fd.f32290a, "zzl", ed.f32191a});
        }
        if (i16 == 3) {
            return new gd();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new dd(bArr);
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
        synchronized (gd.class) {
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
