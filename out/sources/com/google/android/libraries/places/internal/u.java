package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends az implements i00 {
    private static final u zzQ;
    private static volatile p00 zzR;
    private s8 zzA;
    private it0 zzB;
    private i20 zzC;
    private pb zzD;
    private yj0 zzE;
    private zq0 zzF;
    private gn zzG;
    private e6 zzH;
    private sm zzI;
    private om zzJ;
    private ek zzK;
    private a0 zzL;
    private j7 zzM;
    private bx0 zzN;
    private xs0 zzO;
    private int zzb;
    private int zze;
    private zi zzg;
    private w2 zzh;
    private ln zzi;
    private ud zzj;
    private a9 zzk;
    private pb0 zzl;
    private r2 zzm;
    private s1 zzn;
    private c6 zzo;
    private ya zzp;
    private sb zzq;
    private ub zzr;
    private s0 zzs;
    private x6 zzt;
    private az0 zzu;
    private ag zzv;
    private lq zzw;
    private wt0 zzx;
    private as zzy;
    private gx zzz;
    private byte zzP = 2;
    private int zzf = 1;

    static {
        u uVar = new u();
        zzQ = uVar;
        az.r(u.class, uVar);
    }

    private u() {
    }

    public static s I() {
        return (s) zzQ.o();
    }

    final /* synthetic */ void J(zi ziVar) {
        ziVar.getClass();
        this.zzg = ziVar;
        this.zzb |= 2;
    }

    final /* synthetic */ void L(int i15) {
        this.zzf = 1;
        this.zzb = 1 | this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzP);
        }
        if (i16 == 2) {
            return az.s(zzQ, "\u0001$\u0000\u0002\u0001%$\u0000\u0000\u0002\u0001᠌\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000fဉ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဉ\u0011\u0014ဉ\u0012\u0015ဉ\u0013\u0016ဉ\u0014\u0017ဉ\u0015\u0018ဉ\u0016\u0019ဉ\u0017\u001aဉ\u0018\u001bဉ\u0019\u001cဉ\u001a\u001dဉ\u001b\u001eဉ\u001c\u001fဉ\u001d ဉ\u001e!ဉ\u001f\"ဉ #ဉ!$ဉ\"%ဉ#", new Object[]{"zzb", "zze", "zzf", t.f33734a, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO"});
        }
        if (i16 == 3) {
            return new u();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new s(bArr);
        }
        if (i16 == 5) {
            return zzQ;
        }
        if (i16 != 6) {
            this.zzP = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        p00 p00Var = zzR;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (u.class) {
            try {
                vyVar = zzR;
                if (vyVar == null) {
                    vyVar = new vy(zzQ);
                    zzR = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
