package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ht extends az implements i00 {
    private static final ht zzh;
    private static volatile p00 zzi;
    private String zzb = "";
    private int zze;
    private int zzf;
    private boolean zzg;

    static {
        ht htVar = new ht();
        zzh = htVar;
        az.r(ht.class, htVar);
    }

    private ht() {
    }

    public static gt I() {
        return (gt) zzh.o();
    }

    public static ht J() {
        return zzh;
    }

    final /* synthetic */ void K(String str) {
        this.zzb = str;
    }

    final /* synthetic */ void L(int i15) {
        this.zze = i15;
    }

    final /* synthetic */ void M(int i15) {
        this.zzf = i15;
    }

    final /* synthetic */ void N(boolean z15) {
        this.zzg = true;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i16 == 3) {
            return new ht();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new gt(bArr);
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
        synchronized (ht.class) {
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
