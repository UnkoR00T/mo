package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class nj extends az implements i00 {
    private static final nj zzi;
    private static volatile p00 zzj;
    private int zzb;
    private kg zze;
    private int zzf;
    private int zzg;
    private hk zzh;

    static {
        nj njVar = new nj();
        zzi = njVar;
        az.r(nj.class, njVar);
    }

    private nj() {
    }

    public static lj I() {
        return (lj) zzi.o();
    }

    final /* synthetic */ void J(int i15) {
        this.zzb |= 4;
        this.zzg = i15;
    }

    final /* synthetic */ void K(hk hkVar) {
        hkVar.getClass();
        this.zzh = hkVar;
        this.zzb |= 8;
    }

    final /* synthetic */ void M(int i15) {
        this.zzf = i15 - 1;
        this.zzb |= 2;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zze", "zzf", mj.f32949a, "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new nj();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new lj(bArr);
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
        synchronized (nj.class) {
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
