package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends az implements i00 {
    private static final d1 zzg;
    private static volatile p00 zzh;
    private int zzb;
    private iz zze = az.z();
    private int zzf;

    static {
        d1 d1Var = new d1();
        zzg = d1Var;
        az.r(d1.class, d1Var);
    }

    private d1() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဋ\u0000", new Object[]{"zzb", "zze", b1.class, "zzf"});
        }
        if (i16 == 3) {
            return new d1();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new c1(bArr);
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
        synchronized (d1.class) {
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
