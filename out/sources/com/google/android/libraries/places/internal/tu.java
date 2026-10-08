package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class tu extends az implements i00 {
    private static final tu zzi;
    private static volatile p00 zzj;
    private int zzb;
    private cs zze;
    private cs zzf;
    private String zzg = "";
    private h30 zzh;

    static {
        tu tuVar = new tu();
        zzi = tuVar;
        az.r(tu.class, tuVar);
    }

    private tu() {
    }

    public static tu O() {
        return zzi;
    }

    public final boolean I() {
        return (this.zzb & 1) != 0;
    }

    public final cs J() {
        cs csVar = this.zze;
        return csVar == null ? cs.K() : csVar;
    }

    public final boolean K() {
        return (this.zzb & 2) != 0;
    }

    public final cs L() {
        cs csVar = this.zzf;
        return csVar == null ? cs.K() : csVar;
    }

    public final String M() {
        return this.zzg;
    }

    public final h30 N() {
        h30 h30Var = this.zzh;
        return h30Var == null ? h30.K() : h30Var;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new tu();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new su(bArr);
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
        synchronized (tu.class) {
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
