package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ow extends az implements i00 {
    private static final ow zzf;
    private static volatile p00 zzg;
    private int zzb = 0;
    private Object zze;

    static {
        ow owVar = new ow();
        zzf = owVar;
        az.r(ow.class, owVar);
    }

    private ow() {
    }

    public static nw I() {
        return (nw) zzf.o();
    }

    final /* synthetic */ void J(zr zrVar) {
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
            return az.s(zzf, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003Ȼ\u0000\u0004<\u0000\u0005Ȼ\u0000", new Object[]{"zze", "zzb", ot.class, zr.class, mw.class});
        }
        if (i16 == 3) {
            return new ow();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new nw(bArr);
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
        synchronized (ow.class) {
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
