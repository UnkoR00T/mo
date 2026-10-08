package yj;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.r6;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends l3 implements s4 {
    private static final m zzb;
    private int zzd;
    private j zzj;
    private r6 zzl;
    private String zze = "";
    private j2 zzf = j2.f29738b;
    private int zzg = 10;
    private float zzh = 0.5f;
    private float zzi = 0.05f;
    private int zzk = 1;
    private int zzm = 320;
    private int zzn = 4;
    private int zzo = 2;

    static {
        m mVar = new m();
        zzb = mVar;
        l3.C(m.class, mVar);
    }

    private m() {
    }

    public static l J() {
        return (l) zzb.g();
    }

    static /* synthetic */ void L(m mVar, j jVar) {
        jVar.getClass();
        mVar.zzj = jVar;
        mVar.zzd |= 32;
    }

    static /* synthetic */ void M(m mVar, j2 j2Var) {
        j2Var.getClass();
        mVar.zzd |= 2;
        mVar.zzf = j2Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i16 == 3) {
            return new m();
        }
        k kVar = null;
        if (i16 == 4) {
            return new l(kVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
