package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class sg extends az implements i00 {
    private static final sg zzp;
    private static volatile p00 zzq;
    private int zzb;
    private kg zzg;
    private s6 zzh;
    private int zzk;
    private int zzl;
    private int zzn;
    private byte zzo = 2;
    private String zze = "";
    private String zzf = "";
    private int zzi = 1;
    private String zzj = "";
    private String zzm = "";

    static {
        sg sgVar = new sg();
        zzp = sgVar;
        az.r(sg.class, sgVar);
    }

    private sg() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzo);
        }
        if (i16 == 2) {
            return az.s(zzp, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005᠌\u0004\u0006ဈ\u0005\u0007᠌\u0006\bင\u0007\tဈ\b\n᠌\t", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", pg.f33321a, "zzj", "zzk", rg.f33510a, "zzl", "zzm", "zzn", qg.f33411a});
        }
        if (i16 == 3) {
            return new sg();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new og(bArr);
        }
        if (i16 == 5) {
            return zzp;
        }
        if (i16 != 6) {
            this.zzo = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        p00 p00Var = zzq;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (sg.class) {
            try {
                vyVar = zzq;
                if (vyVar == null) {
                    vyVar = new vy(zzp);
                    zzq = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
