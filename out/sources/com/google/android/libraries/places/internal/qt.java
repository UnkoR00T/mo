package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class qt extends az implements i00 {
    private static final qt zzj;
    private static volatile p00 zzk;
    private int zze;
    private int zzf;
    private String zzb = "";
    private iz zzg = az.z();
    private String zzh = "";
    private String zzi = "";

    static {
        qt qtVar = new qt();
        zzj = qtVar;
        az.r(qt.class, qtVar);
    }

    private qt() {
    }

    public final String I() {
        return this.zzb;
    }

    public final int J() {
        return this.zze;
    }

    public final int K() {
        return this.zzf;
    }

    public final List L() {
        return this.zzg;
    }

    public final String M() {
        return this.zzh;
    }

    public final String N() {
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
            return az.s(zzj, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u001b\u0005Ȉ\u0006Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg", br.class, "zzh", "zzi"});
        }
        if (i16 == 3) {
            return new qt();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new pt(bArr);
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
        synchronized (qt.class) {
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
