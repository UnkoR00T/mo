package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class hr extends az implements i00 {
    private static final hr zzr;
    private static volatile p00 zzs;
    private int zzb;
    private er zzf;
    private gr zzg;
    private f30 zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzp;
    private boolean zzq;
    private String zze = "";
    private iz zzh = az.z();
    private iz zzi = az.z();
    private String zzj = "";
    private String zzk = "";
    private String zzo = "";

    static {
        hr hrVar = new hr();
        zzr = hrVar;
        az.r(hr.class, hrVar);
    }

    private hr() {
    }

    public static cr I() {
        return (cr) zzr.o();
    }

    public static hr J() {
        return zzr;
    }

    final /* synthetic */ void K(String str) {
        str.getClass();
        this.zze = str;
    }

    final /* synthetic */ void L(er erVar) {
        erVar.getClass();
        this.zzf = erVar;
        this.zzb |= 1;
    }

    final /* synthetic */ void M(gr grVar) {
        grVar.getClass();
        this.zzg = grVar;
        this.zzb |= 2;
    }

    final /* synthetic */ void N(String str) {
        str.getClass();
        iz izVar = this.zzh;
        if (!izVar.zza()) {
            this.zzh = az.A(izVar);
        }
        this.zzh.add(str);
    }

    final /* synthetic */ void O(String str) {
        str.getClass();
        iz izVar = this.zzi;
        if (!izVar.zza()) {
            this.zzi = az.A(izVar);
        }
        this.zzi.add(str);
    }

    final /* synthetic */ void P(String str) {
        str.getClass();
        this.zzj = str;
    }

    final /* synthetic */ void Q(String str) {
        this.zzk = str;
    }

    final /* synthetic */ void R(f30 f30Var) {
        f30Var.getClass();
        this.zzl = f30Var;
        this.zzb |= 4;
    }

    final /* synthetic */ void S(int i15) {
        this.zzm = i15;
    }

    final /* synthetic */ void T(String str) {
        str.getClass();
        this.zzo = str;
    }

    final /* synthetic */ void U(boolean z15) {
        this.zzp = true;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzr, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0002\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ț\u0005Ț\u0006Ȉ\u0007Ȉ\bဉ\u0002\t\u0004\n\u0007\u000bȈ\f\u0007\r\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i16 == 3) {
            return new hr();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new cr(bArr);
        }
        if (i16 == 5) {
            return zzr;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzs;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (hr.class) {
            try {
                vyVar = zzs;
                if (vyVar == null) {
                    vyVar = new vy(zzr);
                    zzs = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
