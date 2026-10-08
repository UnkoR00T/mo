package com.google.android.libraries.places.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class bx extends az implements i00 {
    private static final bx zzx;
    private static volatile p00 zzy;
    private int zzb;
    private int zzh;
    private boolean zzj;
    private double zzk;
    private int zzl;
    private int zzm;
    private boolean zzp;
    private ww zzq;
    private yw zzr;
    private uw zzs;
    private ew zzt;
    private ax zzu;
    private boolean zzv;
    private boolean zzw;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";
    private String zzn = "";
    private fz zzo = az.w();

    static {
        bx bxVar = new bx();
        zzx = bxVar;
        az.r(bx.class, bxVar);
    }

    private bx() {
    }

    public static sw I() {
        return (sw) zzx.o();
    }

    public static bx J() {
        return zzx;
    }

    final /* synthetic */ void K(String str) {
        str.getClass();
        this.zze = str;
    }

    final /* synthetic */ void L(String str) {
        str.getClass();
        this.zzf = str;
    }

    final /* synthetic */ void M(String str) {
        this.zzg = str;
    }

    final /* synthetic */ void N(String str) {
        this.zzi = str;
    }

    final /* synthetic */ void O(boolean z15) {
        this.zzj = z15;
    }

    final /* synthetic */ void P(double d15) {
        this.zzk = d15;
    }

    final /* synthetic */ void Q(int i15) {
        this.zzl = i15;
    }

    final /* synthetic */ void R(String str) {
        this.zzn = str;
    }

    final /* synthetic */ void S(Iterable iterable) {
        fz fzVar = this.zzo;
        if (!fzVar.zza()) {
            this.zzo = az.x(fzVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzo.D(((uv) it.next()).zza());
        }
    }

    final /* synthetic */ void T(boolean z15) {
        this.zzp = z15;
    }

    final /* synthetic */ void U(ww wwVar) {
        wwVar.getClass();
        this.zzq = wwVar;
        this.zzb |= 1;
    }

    final /* synthetic */ void V(yw ywVar) {
        ywVar.getClass();
        this.zzr = ywVar;
        this.zzb |= 2;
    }

    final /* synthetic */ void W(boolean z15) {
        this.zzv = true;
    }

    final /* synthetic */ void Y(int i15) {
        this.zzh = i15 - 2;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzx, "\u0000\u0013\u0000\u0001\u0001\u0015\u0013\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0006Ȉ\u0007\u0007\t\u0000\n\u0004\u000b,\f\u0007\rဉ\u0000\u000eဉ\u0001\u000fဉ\u0002\u0010ဉ\u0003\u0011ဉ\u0004\u0012\u0004\u0013Ȉ\u0014\u0007\u0015\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzm", "zzn", "zzv", "zzw"});
        }
        if (i16 == 3) {
            return new bx();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new sw(bArr);
        }
        if (i16 == 5) {
            return zzx;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzy;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (bx.class) {
            try {
                vyVar = zzy;
                if (vyVar == null) {
                    vyVar = new vy(zzx);
                    zzy = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
