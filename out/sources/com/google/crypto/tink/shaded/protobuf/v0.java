package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class v0<T> implements g1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f36309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n1<?, ?> f36310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q<?> f36312d;

    private v0(n1<?, ?> n1Var, q<?> qVar, r0 r0Var) {
        this.f36310b = n1Var;
        this.f36311c = qVar.e(r0Var);
        this.f36312d = qVar;
        this.f36309a = r0Var;
    }

    private <UT, UB> int k(n1<UT, UB> n1Var, T t15) {
        return n1Var.i(n1Var.g(t15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends u.b<ET>> void l(n1<UT, UB> n1Var, q<ET> qVar, T t15, f1 f1Var, p pVar) throws Throwable {
        n1<UT, UB> n1Var2;
        UB ubF = n1Var.f(t15);
        Object objD = qVar.d(t15);
        while (f1Var.z() != Integer.MAX_VALUE) {
            try {
                n1Var2 = n1Var;
                q<ET> qVar2 = qVar;
                f1 f1Var2 = f1Var;
                p pVar2 = pVar;
                try {
                    if (!n(f1Var2, pVar2, qVar2, objD, n1Var2, ubF)) {
                        n1Var2.o(t15, ubF);
                        return;
                    }
                    f1Var = f1Var2;
                    pVar = pVar2;
                    qVar = qVar2;
                    n1Var = n1Var2;
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th5 = th;
                    n1Var2.o(t15, ubF);
                    throw th5;
                }
            } catch (Throwable th6) {
                th = th6;
                n1Var2 = n1Var;
            }
        }
        n1Var.o(t15, ubF);
    }

    static <T> v0<T> m(n1<?, ?> n1Var, q<?> qVar, r0 r0Var) {
        return new v0<>(n1Var, qVar, r0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends u.b<ET>> boolean n(f1 f1Var, p pVar, q<ET> qVar, u<ET> uVar, n1<UT, UB> n1Var, UB ub5) throws b0 {
        int tag = f1Var.getTag();
        if (tag != t1.f36203a) {
            if (t1.b(tag) != 2) {
                return f1Var.C();
            }
            Object objB = qVar.b(pVar, this.f36309a, t1.a(tag));
            if (objB == null) {
                return n1Var.m(ub5, f1Var);
            }
            qVar.h(f1Var, objB, pVar, uVar);
            return true;
        }
        Object objB2 = null;
        int iG = 0;
        h hVarN = null;
        while (f1Var.z() != Integer.MAX_VALUE) {
            int tag2 = f1Var.getTag();
            if (tag2 == t1.f36205c) {
                iG = f1Var.g();
                objB2 = qVar.b(pVar, this.f36309a, iG);
            } else if (tag2 == t1.f36206d) {
                if (objB2 != null) {
                    qVar.h(f1Var, objB2, pVar, uVar);
                } else {
                    hVarN = f1Var.n();
                }
            } else if (!f1Var.C()) {
                break;
            }
        }
        if (f1Var.getTag() != t1.f36204b) {
            throw b0.b();
        }
        if (hVarN != null) {
            if (objB2 != null) {
                qVar.i(hVarN, objB2, pVar, uVar);
            } else {
                n1Var.d(ub5, iG, hVarN);
            }
        }
        return true;
    }

    private <UT, UB> void o(n1<UT, UB> n1Var, T t15, u1 u1Var) {
        n1Var.s(n1Var.g(t15), u1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void a(T t15, T t16) {
        i1.G(this.f36310b, t15, t16);
        if (this.f36311c) {
            i1.E(this.f36312d, t15, t16);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int b(T t15) {
        int iHashCode = this.f36310b.g(t15).hashCode();
        return this.f36311c ? (iHashCode * 53) + this.f36312d.c(t15).hashCode() : iHashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public boolean c(T t15, T t16) {
        if (!this.f36310b.g(t15).equals(this.f36310b.g(t16))) {
            return false;
        }
        if (this.f36311c) {
            return this.f36312d.c(t15).equals(this.f36312d.c(t16));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public T d() {
        r0 r0Var = this.f36309a;
        return r0Var instanceof y ? (T) ((y) r0Var).L() : (T) r0Var.g().E();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void e(T t15) {
        this.f36310b.j(t15);
        this.f36312d.f(t15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final boolean f(T t15) {
        return this.f36312d.c(t15).o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int g(T t15) {
        int iK = k(this.f36310b, t15);
        return this.f36311c ? iK + this.f36312d.c(t15).j() : iK;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf A[EDGE_INSN: B:62:0x00cf->B:34:0x00cf BREAK  A[LOOP:1: B:17:0x006f->B:65:0x006f], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void h(T t15, byte[] bArr, int i15, int i16, e.b bVar) throws b0 {
        int I;
        y yVar = (y) t15;
        o1 o1VarK = yVar.unknownFields;
        if (o1VarK == o1.c()) {
            o1VarK = o1.k();
            yVar.unknownFields = o1VarK;
        }
        o1 o1Var = o1VarK;
        u<y.d> uVarV = ((y.c) t15).V();
        y.e eVar = null;
        while (i15 < i16) {
            int I2 = e.I(bArr, i15, bVar);
            int i17 = bVar.f36039a;
            if (i17 == t1.f36203a) {
                int i18 = i16;
                e.b bVar2 = bVar;
                int i19 = 0;
                h hVar = null;
                while (true) {
                    if (I2 >= i18) {
                        I = I2;
                        break;
                    }
                    I = e.I(bArr, I2, bVar2);
                    int i25 = bVar2.f36039a;
                    int iA = t1.a(i25);
                    int iB = t1.b(i25);
                    if (iA != 2) {
                        if (iA == 3) {
                            if (eVar != null) {
                                I2 = e.p(c1.a().c(eVar.b().getClass()), bArr, I, i18, bVar2);
                                uVarV.x(eVar.f36326b, bVar2.f36041c);
                            } else if (iB == 2) {
                                I2 = e.b(bArr, I, bVar2);
                                hVar = (h) bVar2.f36041c;
                            }
                        }
                        if (i25 == t1.f36204b) {
                            break;
                        } else {
                            I2 = e.P(i25, bArr, I, i18, bVar2);
                        }
                    } else if (iB == 0) {
                        I2 = e.I(bArr, I, bVar2);
                        i19 = bVar2.f36039a;
                        eVar = (y.e) this.f36312d.b(bVar2.f36042d, this.f36309a, i19);
                    } else {
                        if (i25 == t1.f36204b) {
                            break;
                            break;
                        }
                        I2 = e.P(i25, bArr, I, i18, bVar2);
                    }
                }
                if (hVar != null) {
                    o1Var.n(t1.c(i19, 2), hVar);
                }
                i15 = I;
                i16 = i18;
                bVar = bVar2;
            } else if (t1.b(i17) == 2) {
                eVar = (y.e) this.f36312d.b(bVar.f36042d, this.f36309a, t1.a(i17));
                if (eVar != null) {
                    i15 = e.p(c1.a().c(eVar.b().getClass()), bArr, I2, i16, bVar);
                    uVarV.x(eVar.f36326b, bVar.f36041c);
                } else {
                    i15 = e.G(i17, bArr, I2, i16, o1Var, bVar);
                }
            } else {
                i15 = e.P(i17, bArr, I2, i16, bVar);
            }
        }
        if (i15 != i16) {
            throw b0.h();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void i(T t15, f1 f1Var, p pVar) throws Throwable {
        l(this.f36310b, this.f36312d, t15, f1Var, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void j(T t15, u1 u1Var) {
        Iterator itS = this.f36312d.c(t15).s();
        while (itS.hasNext()) {
            Map.Entry entry = (Map.Entry) itS.next();
            u.b bVar = (u.b) entry.getKey();
            if (bVar.L() != t1.c.MESSAGE || bVar.C() || bVar.M()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof d0.b) {
                u1Var.b(bVar.h(), ((d0.b) entry).a().e());
            } else {
                u1Var.b(bVar.h(), entry.getValue());
            }
        }
        o(this.f36310b, t15, u1Var);
    }
}
