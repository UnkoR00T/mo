package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class nu extends az implements i00 {
    private static final nu zzk;
    private static volatile p00 zzl;
    private int zzb;
    private cs zze;
    private cs zzf;
    private cs zzg;
    private cs zzh;
    private String zzi = "";
    private h30 zzj;

    static {
        nu nuVar = new nu();
        zzk = nuVar;
        az.r(nu.class, nuVar);
    }

    private nu() {
    }

    public static nu R() {
        return zzk;
    }

    public final cs I() {
        cs csVar = this.zze;
        return csVar == null ? cs.K() : csVar;
    }

    public final boolean J() {
        return (this.zzb & 2) != 0;
    }

    public final cs K() {
        cs csVar = this.zzf;
        return csVar == null ? cs.K() : csVar;
    }

    public final boolean L() {
        return (this.zzb & 4) != 0;
    }

    public final cs M() {
        cs csVar = this.zzg;
        return csVar == null ? cs.K() : csVar;
    }

    public final boolean N() {
        return (this.zzb & 8) != 0;
    }

    public final cs O() {
        cs csVar = this.zzh;
        return csVar == null ? cs.K() : csVar;
    }

    public final String P() {
        return this.zzi;
    }

    public final h30 Q() {
        h30 h30Var = this.zzj;
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
            return az.s(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005Ȉ\u0006ဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i16 == 3) {
            return new nu();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new mu(bArr);
        }
        if (i16 == 5) {
            return zzk;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzl;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (nu.class) {
            try {
                vyVar = zzl;
                if (vyVar == null) {
                    vyVar = new vy(zzk);
                    zzl = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
