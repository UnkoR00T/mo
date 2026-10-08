package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class x4 extends az implements i00 {
    private static final x4 zzk;
    private static volatile p00 zzl;
    private int zzb;
    private long zze;
    private tx zzf;
    private double zzg;
    private tx zzh;
    private double zzi;
    private tx zzj;

    static {
        x4 x4Var = new x4();
        zzk = x4Var;
        az.r(x4.class, x4Var);
    }

    private x4() {
        tx txVar = tx.f33820b;
        this.zzf = txVar;
        this.zzh = txVar;
        this.zzj = txVar;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001\u0003က\u0002\u0004ည\u0003\u0005က\u0004\u0006ည\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i16 == 3) {
            return new x4();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new w4(bArr);
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
        synchronized (x4.class) {
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
