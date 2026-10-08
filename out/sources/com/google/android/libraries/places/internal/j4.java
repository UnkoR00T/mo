package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class j4 extends az implements i00 {
    private static final j4 zzk;
    private static volatile p00 zzl;
    private int zzb;
    private double zze;
    private long zzf;
    private tx zzg;
    private tx zzh;
    private int zzi;
    private long zzj;

    static {
        j4 j4Var = new j4();
        zzk = j4Var;
        az.r(j4.class, j4Var);
    }

    private j4() {
        tx txVar = tx.f33820b;
        this.zzg = txVar;
        this.zzh = txVar;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001က\u0000\u0002ဂ\u0001\u0003ည\u0002\u0004ည\u0003\u0005᠌\u0004\u0006ဂ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", h4.f32436a, "zzj"});
        }
        if (i16 == 3) {
            return new j4();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new i4(bArr);
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
        synchronized (j4.class) {
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
