package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class a4<T> implements l4<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u3 f30960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c5<?, ?> f30961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a2<?> f30963d;

    private a4(c5<?, ?> c5Var, a2<?> a2Var, u3 u3Var) {
        this.f30961b = c5Var;
        this.f30962c = a2Var.e(u3Var);
        this.f30963d = a2Var;
        this.f30960a = u3Var;
    }

    static <T> a4<T> i(c5<?, ?> c5Var, a2<?> a2Var, u3 u3Var) {
        return new a4<>(c5Var, a2Var, u3Var);
    }

    @Override // com.google.android.gms.internal.vision.l4
    public final void a(T t15) {
        this.f30961b.j(t15);
        this.f30963d.g(t15);
    }

    @Override // com.google.android.gms.internal.vision.l4
    public final int b(T t15) {
        int iHashCode = this.f30961b.f(t15).hashCode();
        return this.f30962c ? (iHashCode * 53) + this.f30963d.b(t15).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.vision.l4
    public final int c(T t15) {
        c5<?, ?> c5Var = this.f30961b;
        int iK = c5Var.k(c5Var.f(t15));
        return this.f30962c ? iK + this.f30963d.b(t15).s() : iK;
    }

    @Override // com.google.android.gms.internal.vision.l4
    public final void d(T t15, z5 z5Var) {
        Iterator itO = this.f30963d.b(t15).o();
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            g2 g2Var = (g2) entry.getKey();
            if (g2Var.a() != w5.MESSAGE || g2Var.c() || g2Var.d()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof b3) {
                z5Var.m(g2Var.zza(), ((b3) entry).a().c());
            } else {
                z5Var.m(g2Var.zza(), entry.getValue());
            }
        }
        c5<?, ?> c5Var = this.f30961b;
        c5Var.g(c5Var.f(t15), z5Var);
    }

    @Override // com.google.android.gms.internal.vision.l4
    public final void e(T t15, T t16) {
        m4.o(this.f30961b, t15, t16);
        if (this.f30962c) {
            m4.m(this.f30963d, t15, t16);
        }
    }

    @Override // com.google.android.gms.internal.vision.l4
    public final boolean f(T t15) {
        return this.f30963d.b(t15).r();
    }

    @Override // com.google.android.gms.internal.vision.l4
    public final boolean g(T t15, T t16) {
        if (!this.f30961b.f(t15).equals(this.f30961b.f(t16))) {
            return false;
        }
        if (this.f30962c) {
            return this.f30963d.b(t15).equals(this.f30963d.b(t16));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c2 A[EDGE_INSN: B:61:0x00c2->B:33:0x00c2 BREAK  A[LOOP:1: B:17:0x0069->B:64:0x0069], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.l4
    public final void h(T t15, byte[] bArr, int i15, int i16, a1 a1Var) throws u2 {
        int i17;
        l2 l2Var = (l2) t15;
        f5 f5VarG = l2Var.zzb;
        if (f5VarG == f5.a()) {
            f5VarG = f5.g();
            l2Var.zzb = f5VarG;
        }
        f5 f5Var = f5VarG;
        e2<l2.e> e2VarX = ((l2.c) t15).x();
        l2.d dVar = null;
        while (i15 < i16) {
            int i18 = z0.i(bArr, i15, a1Var);
            int i19 = a1Var.f30955a;
            if (i19 == 11) {
                int i25 = i16;
                a1 a1Var2 = a1Var;
                int i26 = 0;
                e1 e1Var = null;
                while (true) {
                    if (i18 >= i25) {
                        i17 = i18;
                        break;
                    }
                    i17 = z0.i(bArr, i18, a1Var2);
                    int i27 = a1Var2.f30955a;
                    int i28 = i27 >>> 3;
                    int i29 = i27 & 7;
                    if (i28 == 2) {
                        if (i29 != 0) {
                            if (i27 != 12) {
                                break;
                                break;
                            }
                            i18 = z0.a(i27, bArr, i17, i25, a1Var2);
                        } else {
                            i18 = z0.i(bArr, i17, a1Var2);
                            i26 = a1Var2.f30955a;
                            dVar = (l2.d) this.f30963d.c(a1Var2.f30958d, this.f30960a, i26);
                        }
                    } else {
                        if (i28 == 3) {
                            if (dVar != null) {
                                i18 = z0.g(h4.a().b(dVar.f31129a.getClass()), bArr, i17, i25, a1Var2);
                                e2VarX.g(dVar.f31130b, a1Var2.f30957c);
                            } else if (i29 == 2) {
                                i18 = z0.q(bArr, i17, a1Var2);
                                e1Var = (e1) a1Var2.f30957c;
                            }
                        }
                        if (i27 != 12) {
                            break;
                        } else {
                            i18 = z0.a(i27, bArr, i17, i25, a1Var2);
                        }
                    }
                }
                if (e1Var != null) {
                    f5Var.c((i26 << 3) | 2, e1Var);
                }
                i15 = i17;
                i16 = i25;
                a1Var = a1Var2;
            } else if ((i19 & 7) == 2) {
                dVar = (l2.d) this.f30963d.c(a1Var.f30958d, this.f30960a, i19 >>> 3);
                if (dVar != null) {
                    i15 = z0.g(h4.a().b(dVar.f31129a.getClass()), bArr, i18, i16, a1Var);
                    e2VarX.g(dVar.f31130b, a1Var.f30957c);
                } else {
                    i15 = z0.c(i19, bArr, i18, i16, f5Var, a1Var);
                }
            } else {
                i15 = z0.a(i19, bArr, i18, i16, a1Var);
            }
        }
        if (i15 != i16) {
            throw u2.e();
        }
    }

    @Override // com.google.android.gms.internal.vision.l4
    public final T zza() {
        return (T) this.f30960a.c().d();
    }
}
