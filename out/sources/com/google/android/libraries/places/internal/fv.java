package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class fv extends az implements i00 {
    private static final fv zzl;
    private static volatile p00 zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        fv fvVar = new fv();
        zzl = fvVar;
        az.r(fv.class, fvVar);
    }

    private fv() {
    }

    public static fv W() {
        return zzl;
    }

    public final boolean I() {
        return (this.zzb & 1) != 0;
    }

    public final boolean J() {
        return this.zze;
    }

    public final boolean K() {
        return (this.zzb & 2) != 0;
    }

    public final boolean L() {
        return this.zzf;
    }

    public final boolean M() {
        return (this.zzb & 4) != 0;
    }

    public final boolean N() {
        return this.zzg;
    }

    public final boolean O() {
        return (this.zzb & 8) != 0;
    }

    public final boolean P() {
        return this.zzh;
    }

    public final boolean Q() {
        return (this.zzb & 16) != 0;
    }

    public final boolean R() {
        return this.zzi;
    }

    public final boolean S() {
        return (this.zzb & 32) != 0;
    }

    public final boolean T() {
        return this.zzj;
    }

    public final boolean U() {
        return (this.zzb & 64) != 0;
    }

    public final boolean V() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzl, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i16 == 3) {
            return new fv();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new dv(bArr);
        }
        if (i16 == 5) {
            return zzl;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzm;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (fv.class) {
            try {
                vyVar = zzm;
                if (vyVar == null) {
                    vyVar = new vy(zzl);
                    zzm = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
