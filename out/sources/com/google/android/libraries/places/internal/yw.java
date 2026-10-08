package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class yw extends az implements i00 {
    private static final yw zzf;
    private static volatile p00 zzg;
    private int zzb = 0;
    private Object zze;

    static {
        yw ywVar = new yw();
        zzf = ywVar;
        az.r(yw.class, ywVar);
    }

    private yw() {
    }

    public static xw I() {
        return (xw) zzf.o();
    }

    final /* synthetic */ void J(fp fpVar) {
        fpVar.getClass();
        this.zze = fpVar;
        this.zzb = 1;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzf, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"zze", "zzb", fp.class});
        }
        if (i16 == 3) {
            return new yw();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new xw(bArr);
        }
        if (i16 == 5) {
            return zzf;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzg;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (yw.class) {
            try {
                vyVar = zzg;
                if (vyVar == null) {
                    vyVar = new vy(zzf);
                    zzg = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
