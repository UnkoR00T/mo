package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class nm extends az implements i00 {
    private static final nm zzh;
    private static volatile p00 zzi;
    private int zzb;
    private tx zze;
    private tx zzf;
    private tx zzg;

    static {
        nm nmVar = new nm();
        zzh = nmVar;
        az.r(nm.class, nmVar);
    }

    private nm() {
        tx txVar = tx.f33820b;
        this.zze = txVar;
        this.zzf = txVar;
        this.zzg = txVar;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i16 == 3) {
            return new nm();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new mm(bArr);
        }
        if (i16 == 5) {
            return zzh;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzi;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (nm.class) {
            try {
                vyVar = zzi;
                if (vyVar == null) {
                    vyVar = new vy(zzh);
                    zzi = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
