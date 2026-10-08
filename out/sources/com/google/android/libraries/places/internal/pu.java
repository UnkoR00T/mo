package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class pu extends az implements i00 {
    private static final pu zzk;
    private static volatile p00 zzl;
    private int zzb;
    private h30 zze;
    private h30 zzg;
    private yv zzi;
    private h30 zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        pu puVar = new pu();
        zzk = puVar;
        az.r(pu.class, puVar);
    }

    private pu() {
    }

    public static pu N() {
        return zzk;
    }

    public final boolean I() {
        return (this.zzb & 1) != 0;
    }

    public final h30 J() {
        h30 h30Var = this.zze;
        return h30Var == null ? h30.K() : h30Var;
    }

    public final String K() {
        return this.zzf;
    }

    public final boolean L() {
        return (this.zzb & 8) != 0;
    }

    public final h30 M() {
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
            return az.s(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ\u0005Ȉ\u0006ဉ\u0003", new Object[]{"zzb", "zze", "zzg", "zzi", "zzf", "zzh", "zzj"});
        }
        if (i16 == 3) {
            return new pu();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ou(bArr);
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
        synchronized (pu.class) {
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
