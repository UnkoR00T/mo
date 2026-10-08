package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class lh extends az implements i00 {
    private static final lh zzg;
    private static volatile p00 zzh;
    private int zzb;
    private boolean zze;
    private boolean zzf;

    static {
        lh lhVar = new lh();
        zzg = lhVar;
        az.r(lh.class, lhVar);
    }

    private lh() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new lh();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new kh(bArr);
        }
        if (i16 == 5) {
            return zzg;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzh;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (lh.class) {
            try {
                vyVar = zzh;
                if (vyVar == null) {
                    vyVar = new vy(zzg);
                    zzh = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
