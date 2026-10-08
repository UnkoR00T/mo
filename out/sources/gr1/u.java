package gr1;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import d1.r3;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q4.TextStyle;
import u4.FontWeight;
import u50.v0;
import w0.r1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\u000f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\b\u001a\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, d2 = {"Lgr1/e;", "viewModel", "Loq/i0;", "x", "(Lgr1/e;Lm2/r;I)V", "Lgr1/e$a$a;", "data", "n", "(Lgr1/e$a$a;Lm2/r;I)V", "", "Lmx/a;", "items", "selectedItem", "Lkotlin/Function1;", "onClickItem", "k", "(Ljava/util/List;Lmx/a;Ler/l;Lm2/r;II)V", "r", "Lgr1/e$a$b;", "u", "(Lgr1/e$a$b;Lm2/r;I)V", "Lgr1/e$a;", "state", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class u {
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:55:0x0122  */
    /* JADX WARN: Code duplicated, block: B:58:0x014f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0164  */
    /* JADX WARN: Code duplicated, block: B:62:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x0178  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x0220  */
    /* JADX WARN: Code duplicated, block: B:78:0x0227  */
    /* JADX WARN: Code duplicated, block: B:81:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:83:0x0312  */
    /* JADX WARN: Code duplicated, block: B:87:0x033d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0342  */
    /* JADX WARN: Code duplicated, block: B:92:0x034d  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    private static final void k(final List<Label> list, Label label, final er.l<? super Label, oq.i0> lVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        Label label2;
        int i18;
        int i19;
        boolean z15;
        p076m2.r rVar2;
        final Label label3;
        d5 d5VarM;
        Object obj;
        Label label4;
        er.a<androidx.compose.ui.node.c> aVarB;
        Iterator it;
        final Label label5;
        f3.m.Companion companion;
        long jC;
        Object objE;
        p076m2.r.Companion companion2;
        int i25;
        int i26;
        Object objE2;
        k70.a aVar;
        int i27;
        er.a<androidx.compose.ui.node.c> aVarB2;
        FontWeight fontWeightD;
        Label label6;
        p076m2.r rVar3;
        int i28;
        final er.l<? super Label, oq.i0> lVar2 = lVar;
        p076m2.r rVarH = rVar.h(-1739956008);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(list) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i29 = i16 & 2;
        if (i29 == 0) {
            if ((i15 & 48) == 0) {
                label2 = label;
                i17 |= rVarH.W(label2) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.G(lVar2)) {
                    i28 = 256;
                } else {
                    i28 = 128;
                }
                i17 |= i28;
            }
            i18 = 1;
            i19 = 0;
            if ((i17 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                obj = null;
                if (i29 != 0) {
                    label4 = null;
                } else {
                    label4 = label2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1739956008, i17, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.edo.DeveloperEdoFillingFormBottomSheetContent (DeveloperEdoScreen.kt:79)");
                }
                f3.m mVarS = t70.i.S(f3.m.INSTANCE, null, rVarH, 6, 1);
                w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, mVarS);
                androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion3.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarA, companion3.d());
                n6.i(rVarC, e0VarT, companion3.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
                n6.g(rVarC, companion3.a());
                n6.i(rVarC, mVarE, companion3.e());
                d1.i0 i0Var = d1.i0.f39176a;
                rVarH.X(618874791);
                it = list.iterator();
                while (it.hasNext()) {
                    label5 = (Label) it.next();
                    companion = f3.m.INSTANCE;
                    f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, i18, obj);
                    if (fr.t.c(label5, label4)) {
                        rVarH.X(-1525813522);
                        jC = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().getSecondary();
                    } else {
                        rVarH.X(-1525812275);
                        jC = k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c();
                    }
                    rVarH.R();
                    f3.m mVarD = w0.i.d(mVarH, jC, null, 2, null);
                    objE = rVarH.E();
                    companion2 = p076m2.r.INSTANCE;
                    if (objE == companion2.a()) {
                        objE = b1.k.a();
                        rVarH.v(objE);
                    }
                    b1.l lVar3 = (b1.l) objE;
                    r1 r1VarE = t70.s.E(0.0f, rVarH, i19, i18);
                    if ((i17 & 896) == 256) {
                        i25 = i18;
                    } else {
                        i25 = i19;
                    }
                    i26 = i25 | (rVarH.W(label5) ? 1 : 0);
                    objE2 = rVarH.E();
                    if (i26 == 0 || objE2 == companion2.a()) {
                        objE2 = new er.a() { // from class: gr1.r
                            @Override // er.a
                            public final Object a() {
                                return u.l(lVar2, label5);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    f3.m mVarL = androidx.compose.foundation.b.l(mVarD, lVar3, r1VarE, false, null, null, (er.a) objE2, 20, null);
                    aVar = k70.a.f108864a;
                    i27 = k70.a.f108865b;
                    f3.m mVarN = a3.n(mVarL, aVar.b(rVarH, i27).getSpacing200());
                    w0 w0VarB = m3.b(d1.i.f39152a.h(), f3.c.INSTANCE.i(), rVarH, 54);
                    int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, i19));
                    p076m2.e0 e0VarT2 = rVarH.t();
                    f3.m mVarE2 = f3.j.e(rVarH, mVarN);
                    androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB2 = companion4.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB2);
                    } else {
                        rVarH.u();
                    }
                    p076m2.r rVarC2 = n6.c(rVarH);
                    Iterator it4 = it;
                    n6.i(rVarC2, w0VarB, companion4.d());
                    n6.i(rVarC2, e0VarT2, companion4.f());
                    n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
                    n6.g(rVarC2, companion4.a());
                    n6.i(rVarC2, mVarE2, companion4.e());
                    q3 q3Var = q3.f39261a;
                    TextStyle textStyleD = aVar.f(rVarH, i27).d();
                    if (fr.t.c(label5, label4)) {
                        fontWeightD = FontWeight.INSTANCE.c();
                    } else {
                        fontWeightD = FontWeight.INSTANCE.d();
                    }
                    int i35 = i17;
                    label6 = label4;
                    p076m2.r rVar4 = rVarH;
                    j70.h.g(null, null, label5, null, null, aVar.a(rVarH, i27).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, fontWeightD, null, 0L, null, b5.j.h(b5.j.INSTANCE.f()), 0L, 0, false, 0, 0, null, textStyleD, null, null, false, false, null, rVar4, 0, 0, 0, 33025755);
                    rVar3 = rVar4;
                    if (fr.t.c(label5, label6)) {
                        rVar3.X(997721399);
                        r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar3, i27).getSpacing50()), rVar3, 0);
                        h60.f.e(a3.r(companion, aVar.b(rVar3, i27).getSpacing100(), 0.0f, 0.0f, 0.0f, 14, null), null, Integer.valueOf(c20.b.f22709q), h60.g.Small, aVar.a(rVar3, i27).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0.0f, null, null, 0L, 0.0f, 0.0f, "Chosen element", rVar3, 3072, 48, 2018);
                        rVar3 = rVar3;
                    } else {
                        rVar3.X(993574529);
                    }
                    rVar3.R();
                    rVar3.x();
                    lVar2 = lVar;
                    label4 = label6;
                    i19 = 0;
                    rVarH = rVar3;
                    obj = null;
                    i18 = 1;
                    i17 = i35;
                    it = it4;
                }
                rVar2 = rVarH;
                Label label7 = label4;
                rVar2.R();
                rVar2.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                label3 = label7;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                label3 = label2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: gr1.s
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return u.m(list, label3, lVar, i15, i16, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        label2 = label;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if (rVarH.G(lVar2)) {
                i28 = 256;
            } else {
                i28 = 128;
            }
            i17 |= i28;
        }
        i18 = 1;
        i19 = 0;
        if ((i17 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            obj = null;
            if (i29 != 0) {
                label4 = null;
            } else {
                label4 = label2;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1739956008, i17, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.edo.DeveloperEdoFillingFormBottomSheetContent (DeveloperEdoScreen.kt:79)");
            }
            f3.m mVarS2 = t70.i.S(f3.m.INSTANCE, null, rVarH, 6, 1);
            w0 w0VarA2 = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarS2);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion5.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarA2, companion5.d());
            n6.i(rVarC3, e0VarT3, companion5.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion5.c());
            n6.g(rVarC3, companion5.a());
            n6.i(rVarC3, mVarE3, companion5.e());
            d1.i0 i0Var2 = d1.i0.f39176a;
            rVarH.X(618874791);
            it = list.iterator();
            while (it.hasNext()) {
                label5 = (Label) it.next();
                companion = f3.m.INSTANCE;
                f3.m mVarH2 = androidx.compose.foundation.layout.d.h(companion, 0.0f, i18, obj);
                if (fr.t.c(label5, label4)) {
                    rVarH.X(-1525813522);
                    jC = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().getSecondary();
                } else {
                    rVarH.X(-1525812275);
                    jC = k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c();
                }
                rVarH.R();
                f3.m mVarD2 = w0.i.d(mVarH2, jC, null, 2, null);
                objE = rVarH.E();
                companion2 = p076m2.r.INSTANCE;
                if (objE == companion2.a()) {
                    objE = b1.k.a();
                    rVarH.v(objE);
                }
                b1.l lVar4 = (b1.l) objE;
                r1 r1VarE2 = t70.s.E(0.0f, rVarH, i19, i18);
                if ((i17 & 896) == 256) {
                    i25 = i18;
                } else {
                    i25 = i19;
                }
                i26 = i25 | (rVarH.W(label5) ? 1 : 0);
                objE2 = rVarH.E();
                if (i26 == 0) {
                    objE2 = new er.a() { // from class: gr1.r
                        @Override // er.a
                        public final Object a() {
                            return u.l(lVar2, label5);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new er.a() { // from class: gr1.r
                        @Override // er.a
                        public final Object a() {
                            return u.l(lVar2, label5);
                        }
                    };
                    rVarH.v(objE2);
                }
                f3.m mVarL2 = androidx.compose.foundation.b.l(mVarD2, lVar4, r1VarE2, false, null, null, (er.a) objE2, 20, null);
                aVar = k70.a.f108864a;
                i27 = k70.a.f108865b;
                f3.m mVarN2 = a3.n(mVarL2, aVar.b(rVarH, i27).getSpacing200());
                w0 w0VarB2 = m3.b(d1.i.f39152a.h(), f3.c.INSTANCE.i(), rVarH, 54);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, i19));
                p076m2.e0 e0VarT4 = rVarH.t();
                f3.m mVarE4 = f3.j.e(rVarH, mVarN2);
                androidx.compose.ui.node.c.Companion companion6 = androidx.compose.ui.node.c.INSTANCE;
                aVarB2 = companion6.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC4 = n6.c(rVarH);
                Iterator it5 = it;
                n6.i(rVarC4, w0VarB2, companion6.d());
                n6.i(rVarC4, e0VarT4, companion6.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion6.c());
                n6.g(rVarC4, companion6.a());
                n6.i(rVarC4, mVarE4, companion6.e());
                q3 q3Var2 = q3.f39261a;
                TextStyle textStyleD2 = aVar.f(rVarH, i27).d();
                if (fr.t.c(label5, label4)) {
                    fontWeightD = FontWeight.INSTANCE.c();
                } else {
                    fontWeightD = FontWeight.INSTANCE.d();
                }
                int i36 = i17;
                label6 = label4;
                p076m2.r rVar5 = rVarH;
                j70.h.g(null, null, label5, null, null, aVar.a(rVarH, i27).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, fontWeightD, null, 0L, null, b5.j.h(b5.j.INSTANCE.f()), 0L, 0, false, 0, 0, null, textStyleD2, null, null, false, false, null, rVar5, 0, 0, 0, 33025755);
                rVar3 = rVar5;
                if (fr.t.c(label5, label6)) {
                    rVar3.X(997721399);
                    r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar3, i27).getSpacing50()), rVar3, 0);
                    h60.f.e(a3.r(companion, aVar.b(rVar3, i27).getSpacing100(), 0.0f, 0.0f, 0.0f, 14, null), null, Integer.valueOf(c20.b.f22709q), h60.g.Small, aVar.a(rVar3, i27).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0.0f, null, null, 0L, 0.0f, 0.0f, "Chosen element", rVar3, 3072, 48, 2018);
                    rVar3 = rVar3;
                } else {
                    rVar3.X(993574529);
                }
                rVar3.R();
                rVar3.x();
                lVar2 = lVar;
                label4 = label6;
                i19 = 0;
                rVarH = rVar3;
                obj = null;
                i18 = 1;
                i17 = i36;
                it = it5;
            }
            rVar2 = rVarH;
            Label label8 = label4;
            rVar2.R();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            label3 = label8;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            label3 = label2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gr1.s
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return u.m(list, label3, lVar, i15, i16, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(er.l lVar, Label label) {
        lVar.b(label);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(List list, Label label, er.l lVar, int i15, int i16, p076m2.r rVar, int i17) {
        k(list, label, lVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    public static final void n(final e.a.FillingForm fillingForm, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1847098902);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(fillingForm) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1847098902, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.edo.DeveloperEdoFillingFormContent (DeveloperEdoScreen.kt:60)");
            }
            g30.t.f(fillingForm.getModalBottomSheetData(), 0.0f, false, null, null, y2.m.d(-821511779, true, new er.p() { // from class: gr1.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.o(fillingForm, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(-536375876, true, new er.p() { // from class: gr1.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.p(fillingForm, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, ModalBottomSheetData.f70192e | 1769472, 30);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gr1.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.q(fillingForm, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(e.a.FillingForm fillingForm, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-821511779, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.edo.DeveloperEdoFillingFormContent.<anonymous> (DeveloperEdoScreen.kt:64)");
            }
            k(fillingForm.getBottomSheetContentData().a(), fillingForm.getBottomSheetContentData().getSelectedItem(), fillingForm.getBottomSheetContentData().b(), rVar, 0, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(e.a.FillingForm fillingForm, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-536375876, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.edo.DeveloperEdoFillingFormContent.<anonymous> (DeveloperEdoScreen.kt:70)");
            }
            r(fillingForm, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(e.a.FillingForm fillingForm, int i15, p076m2.r rVar, int i16) {
        n(fillingForm, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void r(final e.a.FillingForm fillingForm, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1894685282);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(fillingForm) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1894685282, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.edo.DeveloperEdoFillingFormInnerContent (DeveloperEdoScreen.kt:123)");
            }
            rVar2 = rVarH;
            i50.s.r(fillingForm.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1122134731, true, new er.q() { // from class: gr1.p
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return u.s(fillingForm, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gr1.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.t(fillingForm, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(e.a.FillingForm fillingForm, d3 d3Var, p076m2.r rVar, int i15) {
        d3 d3Var2;
        int i16;
        if ((i15 & 6) == 0) {
            d3Var2 = d3Var;
            i16 = i15 | (rVar.W(d3Var2) ? 4 : 2);
        } else {
            d3Var2 = d3Var;
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1122134731, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.edo.DeveloperEdoFillingFormInnerContent.<anonymous> (DeveloperEdoScreen.kt:127)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(t70.i.S(a3.r(companion, 0.0f, d3Var2.getTop(), 0.0f, 0.0f, 13, null), null, rVar, 0, 1), 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null), aVar.b(rVar, i17).getSpacing250(), 0.0f, aVar.b(rVar, i17).getSpacing250(), aVar.b(rVar, i17).getSpacing250(), 2, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j40.l.m(fillingForm.getDropDownButtonData(), rVar, DropDownButtonData.f99359i);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            if (fillingForm.getDataToSignInput().getVisible()) {
                rVar.X(147381061);
                v0.g(new v50.c.Text(null, fillingForm.getDataToSignInput().getLabel(), fillingForm.getDataToSignInput().getHint(), fillingForm.getDataToSignInput().getValue(), null, null, null, fillingForm.getDataToSignInput().c(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048433, null), null, rVar, v50.c.Text.P, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            } else {
                rVar.X(141901377);
            }
            rVar.R();
            if (fillingForm.getPinInput().getVisible()) {
                rVar.X(147790881);
                v0.g(new v50.c.Text(null, fillingForm.getPinInput().getLabel(), fillingForm.getPinInput().getHint(), fillingForm.getPinInput().getValue(), null, null, null, fillingForm.getPinInput().c(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048433, null), null, rVar, v50.c.Text.P, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            } else {
                rVar.X(141901377);
            }
            rVar.R();
            if (fillingForm.getNewPinInput().getVisible()) {
                rVar.X(148177172);
                v0.g(new v50.c.Text(null, fillingForm.getNewPinInput().getLabel(), fillingForm.getNewPinInput().getHint(), fillingForm.getNewPinInput().getValue(), null, null, null, fillingForm.getNewPinInput().c(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048433, null), null, rVar, v50.c.Text.P, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            } else {
                rVar.X(141901377);
            }
            rVar.R();
            if (fillingForm.getCanInput().getVisible()) {
                rVar.X(148572577);
                v0.g(new v50.c.Text(null, fillingForm.getCanInput().getLabel(), fillingForm.getCanInput().getHint(), fillingForm.getCanInput().getValue(), null, null, null, fillingForm.getCanInput().c(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048433, null), null, rVar, v50.c.Text.P, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            } else {
                rVar.X(141901377);
            }
            rVar.R();
            if (fillingForm.getPukInput().getVisible()) {
                rVar.X(148955489);
                v0.g(new v50.c.Text(null, fillingForm.getPukInput().getLabel(), fillingForm.getPukInput().getHint(), fillingForm.getPukInput().getValue(), null, null, null, fillingForm.getPukInput().c(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048433, null), null, rVar, v50.c.Text.P, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            } else {
                rVar.X(141901377);
            }
            rVar.R();
            h30.q.p(fillingForm.getInitButton(), false, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(e.a.FillingForm fillingForm, int i15, p076m2.r rVar, int i16) {
        r(fillingForm, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void u(final e.a.NfcScanning nfcScanning, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-514683530);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(nfcScanning) : rVarH.G(nfcScanning) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-514683530, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.edo.DeveloperEdoNfcScanningContent (DeveloperEdoScreen.kt:209)");
            }
            rVar2 = rVarH;
            i50.s.r(nfcScanning.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-2110504919, true, new er.q() { // from class: gr1.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return u.v(nfcScanning, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gr1.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.w(nfcScanning, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(e.a.NfcScanning nfcScanning, d3 d3Var, p076m2.r rVar, int i15) {
        d3 d3Var2;
        int i16;
        if ((i15 & 6) == 0) {
            d3Var2 = d3Var;
            i16 = i15 | (rVar.W(d3Var2) ? 4 : 2);
        } else {
            d3Var2 = d3Var;
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2110504919, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.edo.DeveloperEdoNfcScanningContent.<anonymous> (DeveloperEdoScreen.kt:213)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.r(companion, 0.0f, d3Var2.getTop(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null), aVar.b(rVar, i17).getSpacing250(), 0.0f, aVar.b(rVar, i17).getSpacing250(), aVar.b(rVar, i17).getSpacing250(), 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h30.q.p(nfcScanning.getCancelButton(), false, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            f3.m mVarS = t70.i.S(companion, null, rVar, 6, 1);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarS);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            j70.h.g(null, null, nfcScanning.getReadingData(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(e.a.NfcScanning nfcScanning, int i15, p076m2.r rVar, int i16) {
        u(nfcScanning, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void x(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-442031731);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-442031731, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.edo.DeveloperEdoScreen (DeveloperEdoScreen.kt:46)");
            }
            f6 f6VarC = m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7);
            e.a aVarY = y(f6VarC);
            if (aVarY instanceof e.a.FillingForm) {
                rVarH.X(409275384);
                n((e.a.FillingForm) aVarY, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarY instanceof e.a.NfcScanning)) {
                    rVarH.X(409273126);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(409278392);
                u((e.a.NfcScanning) aVarY, rVarH, 0);
                rVarH.R();
            }
            q0.g(false, y(f6VarC).a(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gr1.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.z(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a y(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(e eVar, int i15, p076m2.r rVar, int i16) {
        x(eVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
