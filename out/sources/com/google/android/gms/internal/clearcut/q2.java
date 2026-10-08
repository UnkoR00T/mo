package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class q2<T> implements c3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2 f29520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u3<?, ?> f29521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s0<?> f29523d;

    private q2(u3<?, ?> u3Var, s0<?> s0Var, l2 l2Var) {
        this.f29521b = u3Var;
        this.f29522c = s0Var.g(l2Var);
        this.f29523d = s0Var;
        this.f29520a = l2Var;
    }

    static <T> q2<T> j(u3<?, ?> u3Var, s0<?> s0Var, l2 l2Var) {
        return new q2<>(u3Var, s0Var, l2Var);
    }

    @Override // com.google.android.gms.internal.clearcut.c3
    public final void a(T t15) {
        this.f29521b.d(t15);
        this.f29523d.f(t15);
    }

    @Override // com.google.android.gms.internal.clearcut.c3
    public final int b(T t15) {
        int iHashCode = this.f29521b.k(t15).hashCode();
        return this.f29522c ? (iHashCode * 53) + this.f29523d.b(t15).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.clearcut.c3
    public final boolean c(T t15, T t16) {
        if (!this.f29521b.k(t15).equals(this.f29521b.k(t16))) {
            return false;
        }
        if (this.f29522c) {
            return this.f29523d.b(t15).equals(this.f29523d.b(t16));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.c3
    public final T d() {
        return (T) this.f29520a.j().O0();
    }

    @Override // com.google.android.gms.internal.clearcut.c3
    public final void e(T t15, p4 p4Var) {
        Iterator itE = this.f29523d.b(t15).e();
        while (itE.hasNext()) {
            Map.Entry entry = (Map.Entry) itE.next();
            z0 z0Var = (z0) entry.getKey();
            if (z0Var.Y0() != o4.MESSAGE || z0Var.o1() || z0Var.H0()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            p4Var.m(z0Var.a(), entry instanceof q1 ? ((q1) entry).a().c() : entry.getValue());
        }
        u3<?, ?> u3Var = this.f29521b;
        u3Var.e(u3Var.k(t15), p4Var);
    }

    @Override // com.google.android.gms.internal.clearcut.c3
    public final boolean f(T t15) {
        return this.f29523d.b(t15).d();
    }

    @Override // com.google.android.gms.internal.clearcut.c3
    public final void g(T t15, T t16) {
        e3.i(this.f29521b, t15, t16);
        if (this.f29522c) {
            e3.g(this.f29523d, t15, t16);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.c3
    public final int h(T t15) {
        u3<?, ?> u3Var = this.f29521b;
        int iL = u3Var.l(u3Var.k(t15));
        return this.f29522c ? iL + this.f29523d.b(t15).m() : iL;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0064 A[EDGE_INSN: B:51:0x0064->B:28:0x0064 BREAK  A[LOOP:1: B:14:0x0034->B:54:0x0034], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.clearcut.c3
    public final void i(T t15, byte[] bArr, int i15, int i16, w wVar) throws l1 {
        int iE;
        f1 f1Var = (f1) t15;
        v3 v3VarI = f1Var.zzjp;
        if (v3VarI == v3.h()) {
            v3VarI = v3.i();
            f1Var.zzjp = v3VarI;
        }
        v3 v3Var = v3VarI;
        while (i15 < i16) {
            int iE2 = v.e(bArr, i15, wVar);
            int i17 = wVar.f29577a;
            if (i17 != 11) {
                byte[] bArr2 = bArr;
                int i18 = i16;
                w wVar2 = wVar;
                i15 = (i17 & 7) == 2 ? v.c(i17, bArr2, iE2, i18, v3Var, wVar2) : v.a(i17, bArr2, iE2, i18, wVar2);
            } else {
                byte[] bArr3 = bArr;
                int i19 = i16;
                w wVar3 = wVar;
                int i25 = 0;
                a0 a0Var = null;
                while (true) {
                    if (iE2 >= i19) {
                        iE = iE2;
                        break;
                    }
                    iE = v.e(bArr3, iE2, wVar3);
                    int i26 = wVar3.f29577a;
                    int i27 = i26 >>> 3;
                    int i28 = i26 & 7;
                    if (i27 == 2) {
                        if (i28 != 0) {
                            if (i26 != 12) {
                                break;
                                break;
                            }
                            iE2 = v.a(i26, bArr3, iE, i19, wVar3);
                        } else {
                            iE2 = v.e(bArr3, iE, wVar3);
                            i25 = wVar3.f29577a;
                        }
                    } else if (i27 != 3 || i28 != 2) {
                        if (i26 != 12) {
                            break;
                        } else {
                            iE2 = v.a(i26, bArr3, iE, i19, wVar3);
                        }
                    } else {
                        iE2 = v.m(bArr3, iE, wVar3);
                        a0Var = (a0) wVar3.f29579c;
                    }
                }
                if (a0Var != null) {
                    v3Var.e((i25 << 3) | 2, a0Var);
                }
                i15 = iE;
                bArr = bArr3;
                i16 = i19;
                wVar = wVar3;
            }
        }
        if (i15 != i16) {
            throw l1.d();
        }
    }
}
