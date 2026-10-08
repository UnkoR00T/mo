package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class fp extends az implements i00 {
    private static final fp zzg;
    private static volatile p00 zzh;
    private int zzb;
    private f30 zze;
    private f30 zzf;

    static {
        fp fpVar = new fp();
        zzg = fpVar;
        az.r(fp.class, fpVar);
    }

    private fp() {
    }

    public static ep K() {
        return (ep) zzg.o();
    }

    public static fp L() {
        return zzg;
    }

    public final f30 I() {
        f30 f30Var = this.zze;
        return f30Var == null ? f30.L() : f30Var;
    }

    public final f30 J() {
        f30 f30Var = this.zzf;
        return f30Var == null ? f30.L() : f30Var;
    }

    final /* synthetic */ void M(f30 f30Var) {
        f30Var.getClass();
        this.zze = f30Var;
        this.zzb |= 1;
    }

    final /* synthetic */ void N(f30 f30Var) {
        f30Var.getClass();
        this.zzf = f30Var;
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
            return az.s(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new fp();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ep(bArr);
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
        synchronized (fp.class) {
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
