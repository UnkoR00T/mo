package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ww extends az implements i00 {
    private static final ww zzf;
    private static volatile p00 zzg;
    private int zzb = 0;
    private Object zze;

    static {
        ww wwVar = new ww();
        zzf = wwVar;
        az.r(ww.class, wwVar);
    }

    private ww() {
    }

    public static vw I() {
        return (vw) zzf.o();
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
            return new ww();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new vw(bArr);
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
        synchronized (ww.class) {
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
