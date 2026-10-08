package yj;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends l3 implements s4 {
    private static final u zzb;
    private s3 zzd = l3.r();
    private s3 zze = l3.r();

    static {
        u uVar = new u();
        zzb = uVar;
        l3.C(u.class, uVar);
    }

    private u() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", r.class, "zze", r.class});
        }
        if (i16 == 3) {
            return new u();
        }
        s sVar = null;
        if (i16 == 4) {
            return new t(sVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
