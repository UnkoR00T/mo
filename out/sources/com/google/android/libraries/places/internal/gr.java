package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class gr extends az implements i00 {
    private static final gr zzf;
    private static volatile p00 zzg;
    private int zzb = 0;
    private Object zze;

    static {
        gr grVar = new gr();
        zzf = grVar;
        az.r(gr.class, grVar);
    }

    private gr() {
    }

    public static fr I() {
        return (fr) zzf.o();
    }

    final /* synthetic */ void J(fp fpVar) {
        fpVar.getClass();
        this.zze = fpVar;
        this.zzb = 1;
    }

    final /* synthetic */ void K(zr zrVar) {
        zrVar.getClass();
        this.zze = zrVar;
        this.zzb = 2;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzf, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzb", fp.class, zr.class});
        }
        if (i16 == 3) {
            return new gr();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new fr(bArr);
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
        synchronized (gr.class) {
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
