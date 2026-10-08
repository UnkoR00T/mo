package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class x20 extends az implements i00 {
    private static final x20 zzj;
    private static volatile p00 zzk;
    private int zzb;
    private long zze;
    private sq zzh;
    private tx zzf = tx.f33820b;
    private String zzg = "";
    private String zzi = "";

    static {
        x20 x20Var = new x20();
        zzj = x20Var;
        az.r(x20.class, x20Var);
    }

    private x20() {
    }

    public static w20 I() {
        return (w20) zzj.o();
    }

    final /* synthetic */ void J(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0002\u0003ဉ\u0003\u0004ည\u0001\u0005ဈ\u0004", new Object[]{"zzb", "zze", "zzg", "zzh", "zzf", "zzi"});
        }
        if (i16 == 3) {
            return new x20();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new w20(bArr);
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
        synchronized (x20.class) {
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
