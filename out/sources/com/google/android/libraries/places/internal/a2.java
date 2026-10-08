package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class a2 extends az implements i00 {
    private static final a2 zzh;
    private static volatile p00 zzi;
    private int zzb;
    private p1 zze;
    private int zzf;
    private int zzg;

    static {
        a2 a2Var = new a2();
        zzh = a2Var;
        az.r(a2.class, a2Var);
    }

    private a2() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zzb", "zze", "zzf", z1.f34460a, "zzg"});
        }
        if (i16 == 3) {
            return new a2();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new y1(bArr);
        }
        if (i16 == 5) {
            return zzh;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzi;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (a2.class) {
            try {
                vyVar = zzi;
                if (vyVar == null) {
                    vyVar = new vy(zzh);
                    zzi = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
