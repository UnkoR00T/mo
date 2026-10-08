package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class nr extends az implements i00 {
    private static final nr zzk;
    private static volatile p00 zzl;
    private int zzb;
    private lr zzg;
    private tr zzh;
    private int zzj;
    private String zze = "";
    private String zzf = "";
    private iz zzi = az.z();

    static {
        nr nrVar = new nr();
        zzk = nrVar;
        az.r(nr.class, nrVar);
    }

    private nr() {
    }

    public static nr N() {
        return zzk;
    }

    public final String I() {
        return this.zzf;
    }

    public final lr J() {
        lr lrVar = this.zzg;
        return lrVar == null ? lr.K() : lrVar;
    }

    public final tr K() {
        tr trVar = this.zzh;
        return trVar == null ? tr.K() : trVar;
    }

    public final List L() {
        return this.zzi;
    }

    public final int M() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ț\u0006\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i16 == 3) {
            return new nr();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new mr(bArr);
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
        synchronized (nr.class) {
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
