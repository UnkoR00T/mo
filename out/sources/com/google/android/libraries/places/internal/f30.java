package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class f30 extends az implements i00 {
    private static final f30 zzf;
    private static volatile p00 zzg;
    private double zzb;
    private double zze;

    static {
        f30 f30Var = new f30();
        zzf = f30Var;
        az.r(f30.class, f30Var);
    }

    private f30() {
    }

    public static e30 K() {
        return (e30) zzf.o();
    }

    public static f30 L() {
        return zzf;
    }

    public final double I() {
        return this.zzb;
    }

    public final double J() {
        return this.zze;
    }

    final /* synthetic */ void M(double d15) {
        this.zzb = d15;
    }

    final /* synthetic */ void N(double d15) {
        this.zze = d15;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"zzb", "zze"});
        }
        if (i16 == 3) {
            return new f30();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new e30(bArr);
        }
        if (i16 == 5) {
            return zzf;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzg;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (f30.class) {
            try {
                vyVar = zzg;
                if (vyVar == null) {
                    vyVar = new vy(zzf);
                    zzg = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
