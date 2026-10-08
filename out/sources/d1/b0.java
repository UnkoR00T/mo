package d1;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lf3/m;", "modifier", "Lf3/c;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Ld1/c0;", "Loq/i0;", "content", "d", "(Lf3/m;Lf3/c;ZLer/q;Lm2/r;II)V", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b0 {
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00da  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void d(f3.m mVar, f3.c cVar, boolean z15, final er.q<? super c0, ? super p076m2.r, ? super Integer, oq.i0> qVar, p076m2.r rVar, final int i15, final int i16) {
        f3.m mVar2;
        int i17;
        f3.c cVar2;
        int i18;
        boolean z16;
        int i19;
        boolean z17;
        f3.m mVar3;
        f3.c cVarO;
        d5 d5VarM;
        final p036e4.w0 w0VarI;
        boolean zW;
        Object objE;
        int i25;
        p076m2.r rVarH = rVar.h(380139498);
        int i26 = i16 & 1;
        if (i26 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        int i27 = i16 & 2;
        if (i27 == 0) {
            if ((i15 & 48) == 0) {
                cVar2 = cVar;
                i17 |= rVarH.W(cVar2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                if ((i15 & 3072) == 0) {
                    if (rVarH.G(qVar)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i17 |= i25;
                }
                if ((i17 & 1171) != 1170) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    if (i26 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i27 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    } else {
                        cVarO = cVar2;
                    }
                    if (i18 != 0) {
                        z16 = false;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(380139498, i17, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
                    }
                    w0VarI = r.i(cVarO, z16);
                    zW = rVarH.W(w0VarI) | ((i17 & 7168) == 2048);
                    objE = rVarH.E();
                    if (zW || objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.p() { // from class: d1.y
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return b0.e(w0VarI, qVar, (p036e4.s2) obj, (c5.b) obj2);
                            }
                        };
                        rVarH.v(objE);
                    }
                    p036e4.p2.b(mVar3, (er.p) objE, rVarH, i17 & 14, 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    cVarO = cVar2;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final f3.m mVar4 = mVar3;
                    final f3.c cVar3 = cVarO;
                    final boolean z18 = z16;
                    d5VarM.a(new er.p() { // from class: d1.z
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return b0.g(mVar4, cVar3, z18, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            z16 = z15;
            if ((i15 & 3072) == 0) {
                if (rVarH.G(qVar)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i17 |= i25;
            }
            if ((i17 & 1171) != 1170) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i26 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i27 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                } else {
                    cVarO = cVar2;
                }
                if (i18 != 0) {
                    z16 = false;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(380139498, i17, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
                }
                w0VarI = r.i(cVarO, z16);
                zW = rVarH.W(w0VarI) | ((i17 & 7168) == 2048);
                objE = rVarH.E();
                if (zW) {
                    objE = new er.p() { // from class: d1.y
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return b0.e(w0VarI, qVar, (p036e4.s2) obj, (c5.b) obj2);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    objE = new er.p() { // from class: d1.y
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return b0.e(w0VarI, qVar, (p036e4.s2) obj, (c5.b) obj2);
                        }
                    };
                    rVarH.v(objE);
                }
                p036e4.p2.b(mVar3, (er.p) objE, rVarH, i17 & 14, 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
                mVar3 = mVar2;
                cVarO = cVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final f3.m mVar5 = mVar3;
                final f3.c cVar4 = cVarO;
                final boolean z19 = z16;
                d5VarM.a(new er.p() { // from class: d1.z
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return b0.g(mVar5, cVar4, z19, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        cVar2 = cVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                z16 = z15;
                if (rVarH.a(z16)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i15 & 3072) == 0) {
                if (rVarH.G(qVar)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i17 |= i25;
            }
            if ((i17 & 1171) != 1170) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i26 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i27 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                } else {
                    cVarO = cVar2;
                }
                if (i18 != 0) {
                    z16 = false;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(380139498, i17, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
                }
                w0VarI = r.i(cVarO, z16);
                zW = rVarH.W(w0VarI) | ((i17 & 7168) == 2048);
                objE = rVarH.E();
                if (zW) {
                    objE = new er.p() { // from class: d1.y
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return b0.e(w0VarI, qVar, (p036e4.s2) obj, (c5.b) obj2);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    objE = new er.p() { // from class: d1.y
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return b0.e(w0VarI, qVar, (p036e4.s2) obj, (c5.b) obj2);
                        }
                    };
                    rVarH.v(objE);
                }
                p036e4.p2.b(mVar3, (er.p) objE, rVarH, i17 & 14, 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
                mVar3 = mVar2;
                cVarO = cVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final f3.m mVar6 = mVar3;
                final f3.c cVar5 = cVarO;
                final boolean z110 = z16;
                d5VarM.a(new er.p() { // from class: d1.z
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return b0.g(mVar6, cVar5, z110, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        z16 = z15;
        if ((i15 & 3072) == 0) {
            if (rVarH.G(qVar)) {
                i25 = 2048;
            } else {
                i25 = 1024;
            }
            i17 |= i25;
        }
        if ((i17 & 1171) != 1170) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i26 != 0) {
                mVar3 = f3.m.INSTANCE;
            } else {
                mVar3 = mVar2;
            }
            if (i27 != 0) {
                cVarO = f3.c.INSTANCE.o();
            } else {
                cVarO = cVar2;
            }
            if (i18 != 0) {
                z16 = false;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(380139498, i17, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
            }
            w0VarI = r.i(cVarO, z16);
            zW = rVarH.W(w0VarI) | ((i17 & 7168) == 2048);
            objE = rVarH.E();
            if (zW) {
                objE = new er.p() { // from class: d1.y
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return b0.e(w0VarI, qVar, (p036e4.s2) obj, (c5.b) obj2);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new er.p() { // from class: d1.y
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return b0.e(w0VarI, qVar, (p036e4.s2) obj, (c5.b) obj2);
                    }
                };
                rVarH.v(objE);
            }
            p036e4.p2.b(mVar3, (er.p) objE, rVarH, i17 & 14, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
            cVarO = cVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final f3.m mVar7 = mVar3;
            final f3.c cVar6 = cVarO;
            final boolean z111 = z16;
            d5VarM.a(new er.p() { // from class: d1.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b0.g(mVar7, cVar6, z111, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p036e4.x0 e(p036e4.w0 w0Var, final er.q qVar, p036e4.s2 s2Var, c5.b bVar) {
        final BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = new BoxWithConstraintsScopeImpl(s2Var, bVar.getValue(), null);
        return w0Var.e(s2Var, s2Var.g0(oq.i0.f148189a, y2.m.b(-431986394, true, new er.p() { // from class: d1.a0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return b0.f(qVar, boxWithConstraintsScopeImpl, (p076m2.r) obj, ((Integer) obj2).intValue());
            }
        })), bVar.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(er.q qVar, BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-431986394, i15, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:66)");
            }
            qVar.w(boxWithConstraintsScopeImpl, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(f3.m mVar, f3.c cVar, boolean z15, er.q qVar, int i15, int i16, p076m2.r rVar, int i17) {
        d(mVar, cVar, z15, qVar, rVar, p076m2.g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
