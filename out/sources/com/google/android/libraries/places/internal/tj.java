package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class tj extends az implements i00 {
    private static final tj zzl;
    private static volatile p00 zzm;
    private int zzb;
    private int zze;
    private int zzg;
    private int zzh;
    private long zzi;
    private boolean zzk;
    private iz zzf = az.z();
    private String zzj = "";

    static {
        tj tjVar = new tj();
        zzl = tjVar;
        az.r(tj.class, tjVar);
    }

    private tj() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001a\u0003င\u0001\u0004᠌\u0002\u0005ဂ\u0003\u0006ဈ\u0004\u0007ဇ\u0005", new Object[]{"zzb", "zze", of.f33176a, "zzf", "zzg", "zzh", wj.f34166a, "zzi", "zzj", "zzk"});
        }
        if (i16 == 3) {
            return new tj();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new sj(bArr);
        }
        if (i16 == 5) {
            return zzl;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzm;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (tj.class) {
            try {
                vyVar = zzm;
                if (vyVar == null) {
                    vyVar = new vy(zzl);
                    zzm = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
