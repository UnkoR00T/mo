package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends az implements i00 {
    private static final y zzq;
    private static volatile p00 zzr;
    private int zzb;
    private x zze;
    private x zzf;
    private x zzg;
    private x zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;

    static {
        y yVar = new y();
        zzq = yVar;
        az.r(y.class, yVar);
    }

    private y() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bင\n\fင\u000b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i16 == 3) {
            return new y();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new v(bArr);
        }
        if (i16 == 5) {
            return zzq;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzr;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (y.class) {
            try {
                vyVar = zzr;
                if (vyVar == null) {
                    vyVar = new vy(zzq);
                    zzr = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
