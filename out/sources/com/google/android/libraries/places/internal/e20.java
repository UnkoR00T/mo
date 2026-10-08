package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class e20 extends az implements i00 {
    private static final e20 zzi;
    private static volatile p00 zzj;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        e20 e20Var = new e20();
        zzi = e20Var;
        az.r(e20.class, e20Var);
    }

    private e20() {
    }

    public static c20 I() {
        return (c20) zzi.o();
    }

    public static e20 J() {
        return zzi;
    }

    final /* synthetic */ void K(d20 d20Var) {
        this.zzb = d20Var.zza();
    }

    final /* synthetic */ void L(String str) {
        str.getClass();
        this.zze = str;
    }

    final /* synthetic */ void M(String str) {
        str.getClass();
        this.zzg = str;
    }

    final /* synthetic */ void O(int i15) {
        this.zzh = 2;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new e20();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new c20(bArr);
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
        synchronized (e20.class) {
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
