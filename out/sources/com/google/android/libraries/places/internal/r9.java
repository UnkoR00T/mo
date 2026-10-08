package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class r9 extends az implements i00 {
    private static final r9 zzB;
    private static volatile p00 zzC;
    private boolean zzA;
    private int zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private float zzh;
    private float zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private float zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private iz zzx = az.z();
    private int zzy;
    private float zzz;

    static {
        r9 r9Var = new r9();
        zzB = r9Var;
        az.r(r9.class, r9Var);
    }

    private r9() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            ez ezVar = q9.f33401a;
            ez ezVar2 = s2.f33645a;
            return az.s(zzB, "\u0001\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0001\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nင\t\u000bင\n\fဇ\u000b\r᠌\f\u000eခ\r\u000f᠌\u000e\u0010᠌\u000f\u0011᠌\u0010\u0012᠌\u0011\u0013᠌\u0012\u0014\u001b\u0015င\u0013\u0016ခ\u0014\u0017ဇ\u0015", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", ezVar, "zzr", "zzs", ezVar2, "zzt", ezVar2, "zzu", ezVar2, "zzv", ezVar2, "zzw", t2.f33746a, "zzx", k9.class, "zzy", "zzz", "zzA"});
        }
        if (i16 == 3) {
            return new r9();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new p9(bArr);
        }
        if (i16 == 5) {
            return zzB;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzC;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (r9.class) {
            try {
                vyVar = zzC;
                if (vyVar == null) {
                    vyVar = new vy(zzB);
                    zzC = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
