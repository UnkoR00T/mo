package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class tr extends az implements i00 {
    private static final tr zzg;
    private static volatile p00 zzh;
    private int zzb;
    private lr zze;
    private lr zzf;

    static {
        tr trVar = new tr();
        zzg = trVar;
        az.r(tr.class, trVar);
    }

    private tr() {
    }

    public static tr K() {
        return zzg;
    }

    public final lr I() {
        lr lrVar = this.zze;
        return lrVar == null ? lr.K() : lrVar;
    }

    public final lr J() {
        lr lrVar = this.zzf;
        return lrVar == null ? lr.K() : lrVar;
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
            return new tr();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new sr(bArr);
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
        synchronized (tr.class) {
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
