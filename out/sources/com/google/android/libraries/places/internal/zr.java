package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zr extends az implements i00 {
    private static final zr zzg;
    private static volatile p00 zzh;
    private int zzb;
    private f30 zze;
    private double zzf;

    static {
        zr zrVar = new zr();
        zzg = zrVar;
        az.r(zr.class, zrVar);
    }

    private zr() {
    }

    public static yr I() {
        return (yr) zzg.o();
    }

    final /* synthetic */ void J(f30 f30Var) {
        f30Var.getClass();
        this.zze = f30Var;
        this.zzb |= 1;
    }

    final /* synthetic */ void K(double d15) {
        this.zzf = d15;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new zr();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new yr(bArr);
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
        synchronized (zr.class) {
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
