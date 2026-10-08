package yj;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends l3 implements s4 {
    private static final e zzb;
    private int zzd;
    private String zze = "";
    private j2 zzf;
    private String zzg;
    private j2 zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    static {
        e eVar = new e();
        zzb = eVar;
        l3.C(e.class, eVar);
    }

    private e() {
        j2 j2Var = j2.f29738b;
        this.zzf = j2Var;
        this.zzg = "";
        this.zzh = j2Var;
        this.zzi = 0.25f;
        this.zzj = 0.25f;
        this.zzk = 0.5f;
        this.zzl = 0.85f;
        this.zzm = 1;
    }

    public static d J() {
        return (d) zzb.g();
    }

    static /* synthetic */ void L(e eVar, j2 j2Var) {
        j2Var.getClass();
        eVar.zzd |= 2;
        eVar.zzf = j2Var;
    }

    static /* synthetic */ void M(e eVar, j2 j2Var) {
        j2Var.getClass();
        eVar.zzd |= 8;
        eVar.zzh = j2Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i16 == 3) {
            return new e();
        }
        c cVar = null;
        if (i16 == 4) {
            return new d(cVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
