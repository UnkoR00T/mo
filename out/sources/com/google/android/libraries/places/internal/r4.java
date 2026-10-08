package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class r4 extends az implements i00 {
    private static final r4 zzl;
    private static volatile p00 zzm;
    private int zzb;
    private long zze;
    private int zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private a00 zzk = a00.b();
    private tx zzf = tx.f33820b;

    static {
        r4 r4Var = new r4();
        zzl = r4Var;
        az.r(r4.class, r4Var);
    }

    private r4() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u00072", new Object[]{"zzb", "zze", "zzf", "zzg", ys0.a(), "zzh", "zzi", "zzj", "zzk", p4.f33263a});
        }
        if (i16 == 3) {
            return new r4();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new q4(bArr);
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
        synchronized (r4.class) {
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
