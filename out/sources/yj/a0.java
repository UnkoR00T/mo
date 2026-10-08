package yj;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.r6;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends l3 implements s4 {
    private static final a0 zzb;
    private int zzd;
    private r6 zzf;
    private j2 zze = j2.f29738b;
    private int zzg = 1;
    private float zzh = 0.75f;
    private boolean zzi = true;

    static {
        a0 a0Var = new a0();
        zzb = a0Var;
        l3.C(a0.class, a0Var);
    }

    private a0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ခ\u0003\u0005ဇ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i16 == 3) {
            return new a0();
        }
        y yVar = null;
        if (i16 == 4) {
            return new z(yVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
