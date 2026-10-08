package yj;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.q3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends l3 implements s4 {
    private static final g zzb;
    private int zzd;
    private q3 zze = l3.o();
    private q3 zzf = l3.o();
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        g gVar = new g();
        zzb = gVar;
        l3.C(g.class, gVar);
    }

    private g() {
    }

    public static f J() {
        return (f) zzb.g();
    }

    static /* synthetic */ void L(g gVar, int i15) {
        gVar.zzd |= 2;
        gVar.zzh = i15;
    }

    static /* synthetic */ void M(g gVar, float f15) {
        q3 q3Var = gVar.zze;
        if (!q3Var.a()) {
            gVar.zze = l3.p(q3Var);
        }
        gVar.zze.j2(f15);
    }

    static /* synthetic */ void N(g gVar, float f15) {
        q3 q3Var = gVar.zzf;
        if (!q3Var.a()) {
            gVar.zzf = l3.p(q3Var);
        }
        gVar.zzf.j2(f15);
    }

    static /* synthetic */ void O(g gVar, int i15) {
        gVar.zzd |= 1;
        gVar.zzg = i15;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i16 == 3) {
            return new g();
        }
        b bVar = null;
        if (i16 == 4) {
            return new f(bVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
