package dn;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends l3 implements s4 {
    private static final h zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        h hVar = new h();
        zzb = hVar;
        l3.C(h.class, hVar);
    }

    private h() {
    }

    public static g L() {
        return (g) zzb.g();
    }

    static /* synthetic */ void N(h hVar, int i15) {
        hVar.zzd |= 1;
        hVar.zze = i15;
    }

    static /* synthetic */ void O(h hVar, int i15) {
        hVar.zzd |= 2;
        hVar.zzf = i15;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new h();
        }
        b bVar = null;
        if (i16 == 4) {
            return new g(bVar);
        }
        if (i16 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int J() {
        return this.zze;
    }

    public final int K() {
        return this.zzf;
    }
}
