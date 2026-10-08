package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class hv extends az implements i00 {
    private static final hv zzi;
    private static volatile p00 zzj;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        hv hvVar = new hv();
        zzi = hvVar;
        az.r(hv.class, hvVar);
    }

    private hv() {
    }

    public static hv Q() {
        return zzi;
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

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new hv();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new gv(bArr);
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
        synchronized (hv.class) {
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
