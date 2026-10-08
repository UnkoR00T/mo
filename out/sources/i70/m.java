package i70;

import fr.t;
import ju.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.al;
import p046f2.nk;
import p046f2.wl;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aM\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf2/al;", "snackbarHostState", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "Loq/i0;", "onSnackBarHidden", "onDismissed", "onActionPerformed", "d", "(Lf2/al;Li70/p;Ler/a;Ler/a;Ler/a;Lm2/r;II)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89848e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p f89849f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ al f89850g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f89851h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f89852j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f89853k;

        /* JADX INFO: renamed from: i70.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C2130a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f89854a;

            static {
                int[] iArr = new int[wl.values().length];
                try {
                    iArr[wl.Dismissed.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[wl.ActionPerformed.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f89854a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p pVar, al alVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f89849f = pVar;
            this.f89850g = alVar;
            this.f89851h = aVar;
            this.f89852j = aVar2;
            this.f89853k = aVar3;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f89848e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = this.f89849f;
                if (pVar instanceof p.Visible) {
                    al alVar = this.f89850g;
                    p50.a snackBarData = ((p.Visible) pVar).getSnackBarData();
                    this.f89848e = 1;
                    obj = alVar.d(snackBarData, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (!t.c(pVar, p.a.f89857a)) {
                        throw new oq.p();
                    }
                    nk nkVarB = this.f89850g.b();
                    if (nkVarB != null) {
                        nkVarB.dismiss();
                    }
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            er.a<i0> aVar = this.f89851h;
            er.a<i0> aVar2 = this.f89852j;
            er.a<i0> aVar3 = this.f89853k;
            int i16 = C2130a.f89854a[((wl) obj).ordinal()];
            if (i16 == 1) {
                aVar.a();
            } else {
                if (i16 != 2) {
                    throw new oq.p();
                }
                aVar2.a();
            }
            aVar3.a();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f89849f, this.f89850g, this.f89851h, this.f89852j, this.f89853k, eVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0134  */
    /* JADX WARN: Code duplicated, block: B:104:0x014f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0155  */
    /* JADX WARN: Code duplicated, block: B:109:0x0160  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00da  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x0102  */
    /* JADX WARN: Code duplicated, block: B:87:0x0105  */
    /* JADX WARN: Code duplicated, block: B:90:0x0110  */
    /* JADX WARN: Code duplicated, block: B:91:0x0113  */
    /* JADX WARN: Code duplicated, block: B:94:0x011c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    public static final void d(final al alVar, final p pVar, final er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, r rVar, final int i15, final int i16) {
        al alVar2;
        int i17;
        er.a<i0> aVar4;
        er.a<i0> aVar5;
        int i18;
        er.a<i0> aVar6;
        int i19;
        boolean z15;
        final er.a<i0> aVar7;
        final er.a<i0> aVar8;
        d5 d5VarM;
        er.a<i0> aVar9;
        er.a<i0> aVar10;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z25;
        Object aVar11;
        er.a<i0> aVar12;
        er.a<i0> aVar13;
        Object objE;
        Object objE2;
        r rVarH = rVar.h(-860478765);
        if ((i15 & 6) == 0) {
            alVar2 = alVar;
            i17 = (rVarH.W(alVar2) ? 4 : 2) | i15;
        } else {
            alVar2 = alVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= (i15 & 64) == 0 ? rVarH.W(pVar) : rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            aVar4 = aVar;
            i17 |= rVarH.G(aVar4) ? 256 : 128;
        } else {
            aVar4 = aVar;
        }
        int i25 = i16 & 8;
        if (i25 == 0) {
            if ((i15 & 3072) == 0) {
                aVar5 = aVar2;
                i17 |= rVarH.G(aVar5) ? 2048 : 1024;
            }
            i18 = i16 & 16;
            if (i18 != 0) {
                if ((i15 & 24576) == 0) {
                    aVar6 = aVar3;
                    if (rVarH.G(aVar6)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i19;
                }
                if ((i17 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i25 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = new er.a() { // from class: i70.j
                                @Override // er.a
                                public final Object a() {
                                    return m.e();
                                }
                            };
                            rVarH.v(objE2);
                        }
                        aVar9 = (er.a) objE2;
                    } else {
                        aVar9 = aVar5;
                    }
                    if (i18 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: i70.k
                                @Override // er.a
                                public final Object a() {
                                    return m.f();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar10 = (er.a) objE;
                    } else {
                        aVar10 = aVar6;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-860478765, i17, -1, "pl.gov.coi.common.ui.snackBar.SnackBarManager (SnackBarManager.kt:14)");
                    }
                    if ((i17 & 112) != 32 || ((i17 & 64) != 0 && rVarH.G(pVar))) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i17 & 14) == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z26 = z16 | z17;
                    if ((i17 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z27 = z26 | z18;
                    if ((57344 & i17) == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z25 = z27 | z19 | ((i17 & 896) == 256);
                    Object objE3 = rVarH.E();
                    if (!z25 || objE3 == r.INSTANCE.a()) {
                        aVar12 = aVar9;
                        aVar13 = aVar10;
                        aVar11 = new a(pVar, alVar2, aVar12, aVar13, aVar4, null);
                        rVarH.v(aVar11);
                    } else {
                        aVar11 = objE3;
                        aVar12 = aVar9;
                        aVar13 = aVar10;
                    }
                    Function0.d(pVar, (er.p) aVar11, rVarH, (i17 >> 3) & 14);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    aVar8 = aVar13;
                    aVar7 = aVar12;
                } else {
                    rVarH.O();
                    aVar7 = aVar5;
                    aVar8 = aVar6;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: i70.l
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return m.g(alVar, pVar, aVar, aVar7, aVar8, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            aVar6 = aVar3;
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i25 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = new er.a() { // from class: i70.j
                            @Override // er.a
                            public final Object a() {
                                return m.e();
                            }
                        };
                        rVarH.v(objE2);
                    }
                    aVar9 = (er.a) objE2;
                } else {
                    aVar9 = aVar5;
                }
                if (i18 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.a() { // from class: i70.k
                            @Override // er.a
                            public final Object a() {
                                return m.f();
                            }
                        };
                        rVarH.v(objE);
                    }
                    aVar10 = (er.a) objE;
                } else {
                    aVar10 = aVar6;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-860478765, i17, -1, "pl.gov.coi.common.ui.snackBar.SnackBarManager (SnackBarManager.kt:14)");
                }
                if ((i17 & 112) != 32) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if ((i17 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z28 = z16 | z17;
                if ((i17 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z29 = z28 | z18;
                if ((57344 & i17) == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z25 = z29 | z19 | ((i17 & 896) == 256);
                Object objE4 = rVarH.E();
                if (z25) {
                    aVar12 = aVar9;
                    aVar13 = aVar10;
                    aVar11 = new a(pVar, alVar2, aVar12, aVar13, aVar4, null);
                    rVarH.v(aVar11);
                } else {
                    aVar12 = aVar9;
                    aVar13 = aVar10;
                    aVar11 = new a(pVar, alVar2, aVar12, aVar13, aVar4, null);
                    rVarH.v(aVar11);
                }
                Function0.d(pVar, (er.p) aVar11, rVarH, (i17 >> 3) & 14);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                aVar8 = aVar13;
                aVar7 = aVar12;
            } else {
                rVarH.O();
                aVar7 = aVar5;
                aVar8 = aVar6;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: i70.l
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return m.g(alVar, pVar, aVar, aVar7, aVar8, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        aVar5 = aVar2;
        i18 = i16 & 16;
        if (i18 != 0) {
            if ((i15 & 24576) == 0) {
                aVar6 = aVar3;
                if (rVarH.G(aVar6)) {
                    i19 = 16384;
                } else {
                    i19 = PKIFailureInfo.certRevoked;
                }
                i17 |= i19;
            }
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i25 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = new er.a() { // from class: i70.j
                            @Override // er.a
                            public final Object a() {
                                return m.e();
                            }
                        };
                        rVarH.v(objE2);
                    }
                    aVar9 = (er.a) objE2;
                } else {
                    aVar9 = aVar5;
                }
                if (i18 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.a() { // from class: i70.k
                            @Override // er.a
                            public final Object a() {
                                return m.f();
                            }
                        };
                        rVarH.v(objE);
                    }
                    aVar10 = (er.a) objE;
                } else {
                    aVar10 = aVar6;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-860478765, i17, -1, "pl.gov.coi.common.ui.snackBar.SnackBarManager (SnackBarManager.kt:14)");
                }
                if ((i17 & 112) != 32) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if ((i17 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z210 = z16 | z17;
                if ((i17 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z211 = z210 | z18;
                if ((57344 & i17) == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z25 = z211 | z19 | ((i17 & 896) == 256);
                Object objE5 = rVarH.E();
                if (z25) {
                    aVar12 = aVar9;
                    aVar13 = aVar10;
                    aVar11 = new a(pVar, alVar2, aVar12, aVar13, aVar4, null);
                    rVarH.v(aVar11);
                } else {
                    aVar12 = aVar9;
                    aVar13 = aVar10;
                    aVar11 = new a(pVar, alVar2, aVar12, aVar13, aVar4, null);
                    rVarH.v(aVar11);
                }
                Function0.d(pVar, (er.p) aVar11, rVarH, (i17 >> 3) & 14);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                aVar8 = aVar13;
                aVar7 = aVar12;
            } else {
                rVarH.O();
                aVar7 = aVar5;
                aVar8 = aVar6;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: i70.l
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return m.g(alVar, pVar, aVar, aVar7, aVar8, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        aVar6 = aVar3;
        if ((i17 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i25 != 0) {
                objE2 = rVarH.E();
                if (objE2 == r.INSTANCE.a()) {
                    objE2 = new er.a() { // from class: i70.j
                        @Override // er.a
                        public final Object a() {
                            return m.e();
                        }
                    };
                    rVarH.v(objE2);
                }
                aVar9 = (er.a) objE2;
            } else {
                aVar9 = aVar5;
            }
            if (i18 != 0) {
                objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new er.a() { // from class: i70.k
                        @Override // er.a
                        public final Object a() {
                            return m.f();
                        }
                    };
                    rVarH.v(objE);
                }
                aVar10 = (er.a) objE;
            } else {
                aVar10 = aVar6;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-860478765, i17, -1, "pl.gov.coi.common.ui.snackBar.SnackBarManager (SnackBarManager.kt:14)");
            }
            if ((i17 & 112) != 32) {
                z16 = true;
            } else {
                z16 = true;
            }
            if ((i17 & 14) == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z212 = z16 | z17;
            if ((i17 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z213 = z212 | z18;
            if ((57344 & i17) == 16384) {
                z19 = true;
            } else {
                z19 = false;
            }
            z25 = z213 | z19 | ((i17 & 896) == 256);
            Object objE6 = rVarH.E();
            if (z25) {
                aVar12 = aVar9;
                aVar13 = aVar10;
                aVar11 = new a(pVar, alVar2, aVar12, aVar13, aVar4, null);
                rVarH.v(aVar11);
            } else {
                aVar12 = aVar9;
                aVar13 = aVar10;
                aVar11 = new a(pVar, alVar2, aVar12, aVar13, aVar4, null);
                rVarH.v(aVar11);
            }
            Function0.d(pVar, (er.p) aVar11, rVarH, (i17 >> 3) & 14);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            aVar8 = aVar13;
            aVar7 = aVar12;
        } else {
            rVarH.O();
            aVar7 = aVar5;
            aVar8 = aVar6;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i70.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.g(alVar, pVar, aVar, aVar7, aVar8, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(al alVar, p pVar, er.a aVar, er.a aVar2, er.a aVar3, int i15, int i16, r rVar, int i17) {
        d(alVar, pVar, aVar, aVar2, aVar3, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
