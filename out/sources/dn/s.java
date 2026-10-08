package dn;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.r1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.r3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends l3 implements s4 {
    private static final s zzb;
    private byte zzA = 2;
    private int zzd;
    private int zze;
    private j2 zzf;
    private String zzg;
    private f zzh;
    private int zzi;
    private f0 zzj;
    private l0 zzk;
    private r1 zzl;
    private j zzm;
    private q zzn;
    private m zzo;
    private p0 zzp;
    private d0 zzq;
    private h0 zzr;
    private z zzs;
    private s3 zzt;
    private r3 zzu;
    private String zzv;
    private s3 zzw;
    private boolean zzx;
    private double zzy;
    private j2 zzz;

    static {
        s sVar = new s();
        zzb = sVar;
        l3.C(s.class, sVar);
    }

    private s() {
        j2 j2Var = j2.f29738b;
        this.zzf = j2Var;
        this.zzg = "";
        this.zzt = l3.r();
        this.zzu = l3.q();
        this.zzv = "";
        this.zzw = l3.r();
        this.zzx = true;
        this.zzz = j2Var;
    }

    static /* synthetic */ void Y(s sVar, int i15, h hVar) {
        hVar.getClass();
        s3 s3Var = sVar.zzt;
        if (!s3Var.a()) {
            sVar.zzt = l3.s(s3Var);
        }
        sVar.zzt.set(i15, hVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzA);
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0004\u0005ᐉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bЛ\fဈ\u000f\rЛ\u000eည\u0012\u000fᐉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012\u0016\u0013ဉ\u000e\u0014ဇ\u0010\u0015က\u0011\u0017ဉ\u0003", new Object[]{"zzd", "zze", t.f43489a, "zzf", "zzg", "zzi", v.f43490a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzt", h.class, "zzv", "zzw", h.class, "zzz", "zzp", "zzq", "zzr", "zzu", "zzs", "zzx", "zzy", "zzh"});
        }
        if (i16 == 3) {
            return new s();
        }
        b bVar = null;
        if (i16 == 4) {
            return new r(bVar);
        }
        if (i16 == 5) {
            return zzb;
        }
        this.zzA = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int J() {
        int iA = w.a(this.zzi);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int K() {
        return this.zzt.size();
    }

    public final r1 L() {
        r1 r1Var = this.zzl;
        return r1Var == null ? r1.K() : r1Var;
    }

    public final d0 N() {
        d0 d0Var = this.zzq;
        return d0Var == null ? d0.M() : d0Var;
    }

    public final f0 O() {
        f0 f0Var = this.zzj;
        return f0Var == null ? f0.L() : f0Var;
    }

    public final h0 P() {
        h0 h0Var = this.zzr;
        return h0Var == null ? h0.K() : h0Var;
    }

    public final l0 Q() {
        l0 l0Var = this.zzk;
        return l0Var == null ? l0.K() : l0Var;
    }

    public final p0 R() {
        p0 p0Var = this.zzp;
        return p0Var == null ? p0.M() : p0Var;
    }

    public final j S() {
        j jVar = this.zzm;
        return jVar == null ? j.K() : jVar;
    }

    public final m T() {
        m mVar = this.zzo;
        return mVar == null ? m.K() : mVar;
    }

    public final q U() {
        q qVar = this.zzn;
        return qVar == null ? q.K() : qVar;
    }

    public final j2 V() {
        return this.zzf;
    }

    public final String W() {
        return this.zzg;
    }

    public final List X() {
        return this.zzt;
    }

    public final boolean Z() {
        return (this.zzd & PKIFailureInfo.certConfirmed) != 0;
    }

    public final boolean a0() {
        return (this.zzd & 32) != 0;
    }

    public final boolean b0() {
        return (this.zzd & PKIFailureInfo.certRevoked) != 0;
    }

    public final boolean c0() {
        return (this.zzd & 64) != 0;
    }

    public final boolean d0() {
        return (this.zzd & 2048) != 0;
    }

    public final boolean e0() {
        return (this.zzd & 128) != 0;
    }

    public final boolean f0() {
        return (this.zzd & 256) != 0;
    }

    public final boolean g0() {
        return (this.zzd & 1024) != 0;
    }

    public final boolean h0() {
        return (this.zzd & 512) != 0;
    }

    public final int i0() {
        int iA = u.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
