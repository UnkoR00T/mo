package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class l00 implements v00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g00 f32778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h10 f32779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f32780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final my f32781d;

    private l00(h10 h10Var, my myVar, g00 g00Var) {
        this.f32779b = h10Var;
        this.f32780c = g00Var instanceof xy;
        this.f32781d = myVar;
        this.f32778a = g00Var;
    }

    static l00 i(h10 h10Var, my myVar, g00 g00Var) {
        return new l00(h10Var, myVar, g00Var);
    }

    @Override // com.google.android.libraries.places.internal.v00
    public final int a(Object obj) {
        int iHashCode = ((az) obj).zzc.hashCode();
        return this.f32780c ? (iHashCode * 53) + ((xy) obj).zzb.f33463a.hashCode() : iHashCode;
    }

    @Override // com.google.android.libraries.places.internal.v00
    public final void b(Object obj, Object obj2) {
        w00.d(this.f32779b, obj, obj2);
        if (this.f32780c) {
            w00.c(this.f32781d, obj, obj2);
        }
    }

    @Override // com.google.android.libraries.places.internal.v00
    public final void c(Object obj, w10 w10Var) {
        Iterator itD = ((xy) obj).zzb.d();
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            py pyVar = (py) entry.getKey();
            if (pyVar.a() != v10.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            pyVar.c();
            pyVar.d();
            if (entry instanceof nz) {
                pyVar.zza();
                ((nz) entry).a();
                throw null;
            }
            pyVar.zza();
            w10Var.x(525004180, entry.getValue());
        }
        ((az) obj).zzc.f(w10Var);
    }

    @Override // com.google.android.libraries.places.internal.v00
    public final int d(Object obj) {
        int iH = ((az) obj).zzc.h();
        return this.f32780c ? iH + ((xy) obj).zzb.j() : iH;
    }

    @Override // com.google.android.libraries.places.internal.v00
    public final boolean e(Object obj, Object obj2) {
        if (!((az) obj).zzc.equals(((az) obj2).zzc)) {
            return false;
        }
        if (this.f32780c) {
            return ((xy) obj).zzb.equals(((xy) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.v00
    public final void f(Object obj, u00 u00Var, ly lyVar) {
        boolean zC;
        my myVar = this.f32781d;
        h10 h10Var = this.f32779b;
        Object objH = h10Var.h(obj);
        qy qyVarA = myVar.a(obj);
        do {
            try {
                if (u00Var.zzb() == Integer.MAX_VALUE) {
                    break;
                }
                int iA = u00Var.a();
                if (iA == 11) {
                    zy zyVarB = null;
                    tx txVarM = null;
                    int iO = 0;
                    for (int i15 = Integer.MAX_VALUE; u00Var.zzb() != i15; i15 = Integer.MAX_VALUE) {
                        int iA2 = u00Var.a();
                        if (iA2 != 16) {
                            if (iA2 != 26) {
                                if (iA2 == 12 || !u00Var.c()) {
                                    break;
                                }
                            } else if (zyVarB != null) {
                                myVar.d(u00Var, zyVarB, lyVar, qyVarA);
                            } else {
                                txVarM = u00Var.M();
                            }
                        } else {
                            iO = u00Var.O();
                            zyVarB = lyVar.b(this.f32778a, iO);
                        }
                    }
                    if (u00Var.a() != 12) {
                        throw new lz("Protocol message end-group tag did not match expected tag.");
                    }
                    if (txVarM != null) {
                        if (zyVarB != null) {
                            uy uyVar = (uy) ((az) zyVarB.f34575a).h(5, null, null);
                            xx xxVarN = txVarM.n();
                            uyVar.i2(xxVarN, lyVar);
                            qyVarA.f(zyVarB.f34576b, uyVar.u());
                            xxVarN.o(0);
                        } else {
                            h10Var.d(objH, iO, txVarM);
                        }
                    }
                } else if ((iA & 7) == 2) {
                    zy zyVarB2 = lyVar.b(this.f32778a, iA >>> 3);
                    if (zyVarB2 != null) {
                        myVar.d(u00Var, zyVarB2, lyVar, qyVarA);
                    } else {
                        zC = h10Var.k(objH, u00Var, 0);
                    }
                } else {
                    zC = u00Var.c();
                }
                zC = true;
            } catch (Throwable th4) {
                h10Var.i(obj, objH);
                throw th4;
            }
        } while (zC);
        h10Var.i(obj, objH);
    }

    @Override // com.google.android.libraries.places.internal.v00
    public final boolean g(Object obj) {
        return ((xy) obj).zzb.g();
    }

    @Override // com.google.android.libraries.places.internal.v00
    public final void h(Object obj) {
        this.f32779b.j(obj);
        this.f32781d.b(obj);
    }

    @Override // com.google.android.libraries.places.internal.v00
    public final Object zza() {
        g00 g00Var = this.f32778a;
        return g00Var instanceof az ? ((az) g00Var).E() : g00Var.c().u();
    }
}
