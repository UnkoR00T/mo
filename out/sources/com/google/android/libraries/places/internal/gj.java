package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class gj extends az implements i00 {
    private static final gj zzi;
    private static volatile p00 zzj;
    private int zzb;
    private iz zze = az.z();
    private int zzf;
    private int zzg;
    private hk zzh;

    static {
        gj gjVar = new gj();
        zzi = gjVar;
        az.r(gj.class, gjVar);
    }

    private gj() {
    }

    public static fj I() {
        return (fj) zzi.o();
    }

    final /* synthetic */ void J(int i15) {
        this.zzb |= 2;
        this.zzg = 1;
    }

    final /* synthetic */ void K(hk hkVar) {
        hkVar.getClass();
        this.zzh = hkVar;
        this.zzb |= 4;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002᠌\u0000\u0003ဋ\u0001\u0004ဉ\u0002", new Object[]{"zzb", "zze", "zzf", ef.f32198a, "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new gj();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new fj(bArr);
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
        synchronized (gj.class) {
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
