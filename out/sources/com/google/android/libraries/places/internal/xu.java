package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class xu extends az implements i00 {
    private static final xu zzj;
    private static volatile p00 zzk;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private d30 zzh;
    private boolean zzi;

    static {
        xu xuVar = new xu();
        zzj = xuVar;
        az.r(xu.class, xuVar);
    }

    private xu() {
    }

    public static xu O() {
        return zzj;
    }

    public final int I() {
        return this.zze;
    }

    public final int J() {
        return this.zzf;
    }

    public final int K() {
        return this.zzg;
    }

    public final boolean L() {
        return (this.zzb & 8) != 0;
    }

    public final d30 M() {
        d30 d30Var = this.zzh;
        return d30Var == null ? d30.L() : d30Var;
    }

    public final boolean N() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzj, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0005\u0007\u0006ဉ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzi", "zzh"});
        }
        if (i16 == 3) {
            return new xu();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new wu(bArr);
        }
        if (i16 == 5) {
            return zzj;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzk;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (xu.class) {
            try {
                vyVar = zzk;
                if (vyVar == null) {
                    vyVar = new vy(zzj);
                    zzk = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
