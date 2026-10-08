package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class iw extends az implements i00 {
    private static final iw zzg;
    private static volatile p00 zzh;
    private int zzb;
    private hy zze;
    private int zzf;

    static {
        iw iwVar = new iw();
        zzg = iwVar;
        az.r(iw.class, iwVar);
    }

    private iw() {
    }

    public final hy I() {
        hy hyVar = this.zze;
        return hyVar == null ? hy.K() : hyVar;
    }

    public final int J() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new iw();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new hw(bArr);
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
        synchronized (iw.class) {
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
