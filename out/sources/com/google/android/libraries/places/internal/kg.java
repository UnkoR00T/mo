package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class kg extends az implements i00 {
    private static final kg zzl;
    private static volatile p00 zzm;
    private int zzb;
    private int zze;
    private boolean zzi;
    private int zzk;
    private iz zzf = az.z();
    private String zzg = "";
    private String zzh = "";
    private iz zzj = az.z();

    static {
        kg kgVar = new kg();
        zzl = kgVar;
        az.r(kg.class, kgVar);
    }

    private kg() {
    }

    public static jg I() {
        return (jg) zzl.o();
    }

    final /* synthetic */ void J(String str) {
        str.getClass();
        iz izVar = this.zzf;
        if (!izVar.zza()) {
            this.zzf = az.A(izVar);
        }
        this.zzf.add(str);
    }

    final /* synthetic */ void K(int i15) {
        this.zzb |= 16;
        this.zzk = i15;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001င\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006\u001a\u0007င\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i16 == 3) {
            return new kg();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new jg(bArr);
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
        synchronized (kg.class) {
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
