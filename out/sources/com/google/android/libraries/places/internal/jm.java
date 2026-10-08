package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class jm extends az implements i00 {
    private static final jm zzJ;
    private static volatile p00 zzK;
    private double zzA;
    private nm zzB;
    private nm zzC;
    private nm zzD;
    private nm zzE;
    private nm zzF;
    private nm zzG;
    private fz zzH = az.w();
    private int zzI;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzi;
    private lm zzj;
    private lm zzk;
    private lm zzl;
    private lm zzm;
    private lm zzn;
    private lm zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private float zzt;
    private int zzu;
    private double zzv;
    private int zzw;
    private int zzx;
    private float zzy;
    private long zzz;

    static {
        jm jmVar = new jm();
        zzJ = jmVar;
        az.r(jm.class, jmVar);
    }

    private jm() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzJ, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဂ\u0004\u0006င\r\u0007င\u000e\bခ\u000f\tင\u0010\nက\u0011\u000bင\u0012\fင\u0013\rခ\u0014\u000eဂ\u0015\u000fက\u0016\u0010ဉ\u0005\u0011ဉ\u0006\u0012ဉ\u0007\u0013ဉ\b\u0014ဉ\t\u0015ဉ\n\u0016ဉ\u0017\u0017ဉ\u0018\u0018ဉ\u0019\u0019ဉ\u001a\u001aဉ\u001b\u001bဉ\u001c\u001cင\u000b\u001d'\u001eင\f\u001fင\u001d", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzp", "zzH", "zzq", "zzI"});
        }
        if (i16 == 3) {
            return new jm();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new im(bArr);
        }
        if (i16 == 5) {
            return zzJ;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzK;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (jm.class) {
            try {
                vyVar = zzK;
                if (vyVar == null) {
                    vyVar = new vy(zzJ);
                    zzK = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
