package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class qa extends az implements i00 {
    private static final qa zzi;
    private static volatile p00 zzj;
    private int zzb;
    private long zzf;
    private iz zze = az.z();
    private fz zzg = az.w();
    private fz zzh = az.w();

    static {
        qa qaVar = new qa();
        zzi = qaVar;
        az.r(qa.class, qaVar);
    }

    private qa() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            ez ezVar = t2.f33746a;
            return az.s(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002ဂ\u0000\u0003ࠬ\u0004ࠬ", new Object[]{"zzb", "zze", pa.class, "zzf", "zzg", ezVar, "zzh", ezVar});
        }
        if (i16 == 3) {
            return new qa();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new na(bArr);
        }
        if (i16 == 5) {
            return zzi;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzj;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (qa.class) {
            try {
                vyVar = zzj;
                if (vyVar == null) {
                    vyVar = new vy(zzi);
                    zzj = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
