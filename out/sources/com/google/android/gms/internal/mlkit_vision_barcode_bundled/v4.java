package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class v4 implements k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r4 f30281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y5 f30282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x2 f30284d;

    private v4(y5 y5Var, x2 x2Var, r4 r4Var) {
        this.f30282b = y5Var;
        this.f30283c = r4Var instanceof i3;
        this.f30284d = x2Var;
        this.f30281a = r4Var;
    }

    static v4 a(y5 y5Var, x2 x2Var, r4 r4Var) {
        return new v4(y5Var, x2Var, r4Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5
    public final void V(Object obj, Object obj2) {
        m5.u(this.f30282b, obj, obj2);
        if (this.f30283c) {
            m5.t(this.f30284d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5
    public final void W(Object obj, o6 o6Var) {
        Iterator itF = ((i3) obj).zzb.f();
        while (itF.hasNext()) {
            Map.Entry entry = (Map.Entry) itF.next();
            a3 a3Var = (a3) entry.getKey();
            if (a3Var.d() != n6.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            a3Var.i();
            a3Var.f();
            if (entry instanceof y3) {
                o6Var.e0(a3Var.zza(), ((y3) entry).a().b());
            } else {
                o6Var.e0(a3Var.zza(), entry.getValue());
            }
        }
        ((l3) obj).zzc.k(o6Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5
    public final boolean X(Object obj, Object obj2) {
        if (!((l3) obj).zzc.equals(((l3) obj2).zzc)) {
            return false;
        }
        if (this.f30283c) {
            return ((i3) obj).zzb.equals(((i3) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8 A[EDGE_INSN: B:61:0x00b8->B:33:0x00b8 BREAK  A[LOOP:1: B:17:0x0064->B:64:0x0064], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5
    public final void Y(Object obj, byte[] bArr, int i15, int i16, x1 x1Var) throws v3 {
        int iJ;
        l3 l3Var = (l3) obj;
        z5 z5VarF = l3Var.zzc;
        if (z5VarF == z5.c()) {
            z5VarF = z5.f();
            l3Var.zzc = z5VarF;
        }
        z5 z5Var = z5VarF;
        b3 b3VarJ = ((i3) obj).J();
        k3 k3VarB = null;
        while (i15 < i16) {
            int iJ2 = y1.j(bArr, i15, x1Var);
            int i17 = x1Var.f30305a;
            if (i17 == 11) {
                int i18 = i16;
                x1 x1Var2 = x1Var;
                int i19 = 0;
                j2 j2Var = null;
                while (true) {
                    if (iJ2 >= i18) {
                        iJ = iJ2;
                        break;
                    }
                    iJ = y1.j(bArr, iJ2, x1Var2);
                    int i25 = x1Var2.f30305a;
                    int i26 = i25 >>> 3;
                    int i27 = i25 & 7;
                    if (i26 == 2) {
                        if (i27 != 0) {
                            if (i25 != 12) {
                                break;
                                break;
                            }
                            iJ2 = y1.p(i25, bArr, iJ, i18, x1Var2);
                        } else {
                            iJ2 = y1.j(bArr, iJ, x1Var2);
                            i19 = x1Var2.f30305a;
                            k3VarB = x1Var2.f30308d.b(this.f30281a, i19);
                        }
                    } else {
                        if (i26 == 3) {
                            if (k3VarB != null) {
                                iJ2 = y1.e(z4.a().b(k3VarB.f29750a.getClass()), bArr, iJ, i18, x1Var2);
                                b3VarJ.i(k3VarB.f29751b, x1Var2.f30307c);
                            } else if (i27 == 2) {
                                iJ2 = y1.a(bArr, iJ, x1Var2);
                                j2Var = (j2) x1Var2.f30307c;
                            }
                        }
                        if (i25 != 12) {
                            break;
                        } else {
                            iJ2 = y1.p(i25, bArr, iJ, i18, x1Var2);
                        }
                    }
                }
                if (j2Var != null) {
                    z5Var.j((i19 << 3) | 2, j2Var);
                }
                i15 = iJ;
                i16 = i18;
                x1Var = x1Var2;
            } else if ((i17 & 7) == 2) {
                k3VarB = x1Var.f30308d.b(this.f30281a, i17 >>> 3);
                if (k3VarB != null) {
                    i15 = y1.e(z4.a().b(k3VarB.f29750a.getClass()), bArr, iJ2, i16, x1Var);
                    b3VarJ.i(k3VarB.f29751b, x1Var.f30307c);
                } else {
                    i15 = y1.i(i17, bArr, iJ2, i16, z5Var, x1Var);
                }
            } else {
                i15 = y1.p(i17, bArr, iJ2, i16, x1Var);
            }
        }
        if (i15 != i16) {
            throw new v3("Failed to parse the message.");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5
    public final int b(Object obj) {
        int iB = ((l3) obj).zzc.b();
        return this.f30283c ? iB + ((i3) obj).zzb.b() : iB;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5
    public final int c(Object obj) {
        int iHashCode = ((l3) obj).zzc.hashCode();
        return this.f30283c ? (iHashCode * 53) + ((i3) obj).zzb.f29647a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5
    public final Object d() {
        r4 r4Var = this.f30281a;
        return r4Var instanceof l3 ? ((l3) r4Var).m() : r4Var.w().h();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5
    public final boolean f(Object obj) {
        return ((i3) obj).zzb.k();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5
    public final void u(Object obj) {
        this.f30282b.a(obj);
        this.f30284d.a(obj);
    }
}
