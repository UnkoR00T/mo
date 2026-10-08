package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class j7 extends az implements i00 {
    private static final j7 zzl;
    private static volatile p00 zzm;
    private int zzb;
    private int zze;
    private iz zzf = az.z();
    private iz zzg = az.z();
    private iz zzh = az.z();
    private iz zzi = az.z();
    private iz zzj = az.z();
    private iz zzk = az.z();

    static {
        j7 j7Var = new j7();
        zzl = j7Var;
        az.r(j7.class, j7Var);
    }

    private j7() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0006\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"zzb", "zze", i7.f32529a, "zzf", f2.class, "zzg", jn.class, "zzh", g5.class, "zzi", xm.class, "zzj", vm.class, "zzk", i2.class});
        }
        if (i16 == 3) {
            return new j7();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new h7(bArr);
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
        synchronized (j7.class) {
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
