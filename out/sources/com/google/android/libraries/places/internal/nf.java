package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class nf extends az implements i00 {
    private static final nf zzj;
    private static volatile p00 zzk;
    private int zzb;
    private fz zze = az.w();
    private iz zzf = az.z();
    private String zzg = "";
    private boolean zzh;
    private int zzi;

    static {
        nf nfVar = new nf();
        zzj = nfVar;
        az.r(nf.class, nfVar);
    }

    private nf() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0016\u0002\u001a\u0003ဈ\u0000\u0004ဇ\u0001\u0005ဋ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i16 == 3) {
            return new nf();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new mf(bArr);
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
        synchronized (nf.class) {
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
