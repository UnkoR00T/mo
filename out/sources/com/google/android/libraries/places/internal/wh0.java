package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class wh0 extends az implements i00 {
    private static final wh0 zzk;
    private static volatile p00 zzl;
    private int zzb;
    private float zze;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        wh0 wh0Var = new wh0();
        zzk = wh0Var;
        az.r(wh0.class, wh0Var);
    }

    private wh0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzk, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0000\u0002ခ\u0000\u0003င\u0001\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\bင\u0002", new Object[]{"zzb", "zze", "zzf", "zzh", "zzi", "zzj", "zzg"});
        }
        if (i16 == 3) {
            return new wh0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new vg0(bArr);
        }
        if (i16 == 5) {
            return zzk;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzl;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (wh0.class) {
            try {
                vyVar = zzl;
                if (vyVar == null) {
                    vyVar = new vy(zzk);
                    zzl = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
