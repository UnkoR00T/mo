package dn;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.w2;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends l3<a, x> implements s4 {
    private static final a zzb;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private s3 zze = l3.r();
    private String zzg = "";
    private j2 zzh = j2.f29738b;

    static {
        a aVar = new a();
        zzb = aVar;
        l3.C(a.class, aVar);
    }

    private a() {
    }

    public static a K(byte[] bArr, w2 w2Var) {
        return (a) l3.n(zzb, bArr, w2Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", s.class, "zzf", k.f43487a, "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new a();
        }
        b bVar = null;
        if (i16 == 4) {
            return new x(bVar);
        }
        if (i16 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List L() {
        return this.zze;
    }
}
