package com.google.android.libraries.places.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class ig extends az implements i00 {
    private static final ig zzp;
    private static volatile p00 zzq;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private fz zzh = az.w();
    private int zzi;
    private int zzj;
    private boolean zzk;
    private rj zzl;
    private int zzm;
    private int zzn;
    private sh zzo;

    static {
        ig igVar = new ig();
        zzp = igVar;
        az.r(ig.class, igVar);
    }

    private ig() {
    }

    public static zf I() {
        return (zf) zzp.o();
    }

    final /* synthetic */ void J(hg hgVar) {
        this.zzf = hgVar.zza();
        this.zzb |= 2;
    }

    final /* synthetic */ void K(Iterable iterable) {
        fz fzVar = this.zzh;
        if (!fzVar.zza()) {
            this.zzh = az.x(fzVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzh.D(((dg) it.next()).zza());
        }
    }

    final /* synthetic */ void L(int i15) {
        this.zzb |= 16;
        this.zzj = i15;
    }

    final /* synthetic */ void M(boolean z15) {
        this.zzb |= 32;
        this.zzk = z15;
    }

    final /* synthetic */ void N(rj rjVar) {
        rjVar.getClass();
        this.zzl = rjVar;
        this.zzb |= 64;
    }

    final /* synthetic */ void O(yh yhVar) {
        this.zzn = yhVar.zza();
        this.zzb |= 256;
    }

    final /* synthetic */ void P(sh shVar) {
        shVar.getClass();
        this.zzo = shVar;
        this.zzb |= 512;
    }

    final /* synthetic */ void R(int i15) {
        this.zzi = i15 - 1;
        this.zzb |= 8;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzp, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ࠬ\u0005᠌\u0003\u0006င\u0004\u0007ဇ\u0005\bဉ\u0006\t᠌\u0007\n᠌\b\u000bဉ\t", new Object[]{"zzb", "zze", eg.f32200a, "zzf", gg.f32386a, "zzg", fg.f32296a, "zzh", cg.f31871a, "zzi", bg.f31795a, "zzj", "zzk", "zzl", "zzm", vh.f34063a, "zzn", xh.f34290a, "zzo"});
        }
        if (i16 == 3) {
            return new ig();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new zf(bArr);
        }
        if (i16 == 5) {
            return zzp;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzq;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (ig.class) {
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
