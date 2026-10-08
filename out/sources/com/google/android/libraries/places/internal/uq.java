package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class uq extends az implements i00 {
    private static final uq zzi;
    private static volatile p00 zzj;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private h30 zzg;
    private int zzh;

    static {
        uq uqVar = new uq();
        zzi = uqVar;
        az.r(uq.class, uqVar);
    }

    private uq() {
    }

    public final String I() {
        return this.zze;
    }

    public final String J() {
        return this.zzf;
    }

    public final h30 K() {
        h30 h30Var = this.zzg;
        return h30Var == null ? h30.K() : h30Var;
    }

    public final int M() {
        int i15 = this.zzh;
        int i16 = 2;
        if (i15 != 0) {
            if (i15 == 1) {
                i16 = 3;
            } else if (i15 != 2) {
                i16 = i15 != 3 ? 0 : 5;
            } else {
                i16 = 4;
            }
        }
        if (i16 == 0) {
            return 1;
        }
        return i16;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new uq();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new tq(bArr);
        }
        if (i16 == 5) {
            return zzi;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzj;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (uq.class) {
            try {
                vyVar = zzj;
                if (vyVar == null) {
                    vyVar = new vy(zzi);
                    zzj = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
