package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends az implements i00 {
    private static final j0 zzn;
    private static volatile p00 zzo;
    private int zzb;
    private int zzf;
    private int zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private String zze = "";
    private String zzh = "";

    static {
        j0 j0Var = new j0();
        zzn = j0Var;
        az.r(j0.class, j0Var);
    }

    private j0() {
    }

    public static e0 I() {
        return (e0) zzn.o();
    }

    final /* synthetic */ void J(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void K(int i15) {
        this.zzb |= 2;
        this.zzf = i15;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007\t᠌\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", f0.f32242a, "zzk", h0.f32426a, "zzl", g0.f32360a, "zzm", i0.f32521a});
        }
        if (i16 == 3) {
            return new j0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new e0(bArr);
        }
        if (i16 == 5) {
            return zzn;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzo;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (j0.class) {
            try {
                vyVar = zzo;
                if (vyVar == null) {
                    vyVar = new vy(zzn);
                    zzo = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
