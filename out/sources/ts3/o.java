package ts3;

import d1.a3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import h30.ButtonData;
import mx.Label;
import n3.y2;
import n50.DefaultSingleCardData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.c2;
import p046f2.y1;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import u50.v0;
import vs3.PersonalDataScreenData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001ag\u0010\u001a\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\u0017H\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lts3/d;", "viewModel", "Loq/i0;", "w", "(Lts3/d;Lm2/r;I)V", "Lts3/d$a;", "screenData", "p", "(Lts3/d$a;Lm2/r;I)V", "Lvs3/a;", "r", "(Lvs3/a;Lm2/r;I)V", "Lv50/c;", "nameTextInputData", "surnameTextInputData", "", "isCardExpanded", "Lmx/a;", "personLabel", "Ln50/k;", "singleCardData", "Lh30/a;", "deleteButtonData", "Lkotlin/Function1;", "onNameFocusChange", "onSurnameFocusChange", "k", "(Lv50/c;Lv50/c;ZLmx/a;Ln50/k;Lh30/a;Ler/l;Ler/l;Lm2/r;I)V", "zusvisit_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {
    private static final void k(final v50.c cVar, final v50.c cVar2, final boolean z15, final Label label, final n50.k kVar, final ButtonData buttonData, final er.l<? super Boolean, oq.i0> lVar, final er.l<? super Boolean, oq.i0> lVar2, p076m2.r rVar, final int i15) {
        int i16;
        Label label2;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1366144513);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(cVar2) : rVarH.G(cVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            label2 = label;
            i16 |= rVarH.W(label2) ? 2048 : 1024;
        } else {
            label2 = label;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(kVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.W(buttonData) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.G(lVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i15) == 0) {
            i16 |= rVarH.G(lVar2) ? 8388608 : 4194304;
        }
        if (rVarH.r((4793491 & i16) != 4793490, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1366144513, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.personaldata.AddPersonCard (PersonalDataScreen.kt:163)");
            }
            if (z15) {
                rVarH.X(-304833343);
            } else {
                rVarH.X(-298569204);
                n50.h0.v(kVar, null, rVarH, (i16 >> 12) & 14, 2);
            }
            rVarH.R();
            if (z15) {
                rVarH.X(-298448397);
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                y2 radius150 = aVar.e(rVarH, i17).getRadius150();
                y1 y1Var = y1.f58315a;
                long jA = aVar.a(rVarH, i17).getSurface().a();
                int i18 = y1.f58316b;
                final Label label3 = label2;
                c2.c(null, radius150, y1Var.b(jA, 0L, 0L, 0L, rVarH, i18 << 12, 14), y1Var.c(aVar.c(rVarH, i17).getLevel0(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, i18 << 18, 62), null, y2.m.d(348954173, true, new er.q() { // from class: ts3.k
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return o.l(label3, buttonData, cVar, lVar, cVar2, lVar2, (d1.h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, 196608, 17);
                rVar2 = rVarH;
            } else {
                rVar2 = rVarH;
                rVar2.X(-304833343);
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ts3.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.o(cVar, cVar2, z15, label, kVar, buttonData, lVar, lVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(Label label, ButtonData buttonData, v50.c cVar, final er.l lVar, v50.c cVar2, final er.l lVar2, d1.h0 h0Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(h0Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(348954173, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.personaldata.AddPersonCard.<anonymous> (PersonalDataScreen.kt:175)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(a3.r(a3.p(mVarH, aVar.b(rVar, i17).getSpacing250(), 0.0f, 2, null), 0.0f, aVar.b(rVar, i17).getSpacing250(), 0.0f, 0.0f, 13, null), 0.0f, 0.0f, 0.0f, aVar.b(rVar, i17).getSpacing100(), 7, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            f3.m mVarC = h0Var.c(mVarR, companion2.g());
            d1.i iVar = d1.i.f39152a;
            w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarC);
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
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            q3 q3Var = q3.f39261a;
            j70.h.g(q3Var.b(p3.c(q3Var, companion, 1.0f, false, 2, null), companion2.i()), null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).a(), null, null, false, false, null, rVar, 0, 0, 0, 33030138);
            h30.q.p(buttonData, false, null, rVar, 0, 6);
            rVar.x();
            f3.m mVarP = a3.p(companion, aVar.b(rVar, i17).getSpacing250(), 0.0f, 2, null);
            w0 w0VarA = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarP);
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
            n6.i(rVarC2, w0VarA, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            boolean zW = rVar.W(lVar);
            Object objE = rVar.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ts3.m
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o.m(lVar, ((Boolean) obj).booleanValue());
                    }
                };
                rVar.v(objE);
            }
            d60.c cVarB = d60.e.b(false, (er.l) objE, rVar, 0, 1);
            int i18 = v50.c.f203957t;
            v0.g(cVar, cVarB, rVar, i18, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            boolean zW2 = rVar.W(lVar2);
            Object objE2 = rVar.E();
            if (zW2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: ts3.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o.n(lVar2, ((Boolean) obj).booleanValue());
                    }
                };
                rVar.v(objE2);
            }
            v0.g(cVar2, d60.e.b(false, (er.l) objE2, rVar, 0, 1), rVar, i18, 0);
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
    public static final oq.i0 m(er.l lVar, boolean z15) {
        lVar.b(Boolean.valueOf(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(er.l lVar, boolean z15) {
        lVar.b(Boolean.valueOf(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(v50.c cVar, v50.c cVar2, boolean z15, Label label, n50.k kVar, ButtonData buttonData, er.l lVar, er.l lVar2, int i15, p076m2.r rVar, int i16) {
        k(cVar, cVar2, z15, label, kVar, buttonData, lVar, lVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void p(final d.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(889440538);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(889440538, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.personaldata.PersonalDataContent (PersonalDataScreen.kt:46)");
            }
            if (aVar instanceof d.a.C5014a) {
                rVarH.X(1669953510);
                rVarH.R();
            } else {
                if (!(aVar instanceof d.a.Initialized)) {
                    rVarH.X(53867597);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(53871160);
                r(((d.a.Initialized) aVar).getData(), rVarH, 0);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ts3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.q(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(d.a aVar, int i15, p076m2.r rVar, int i16) {
        p(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void r(final PersonalDataScreenData personalDataScreenData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        boolean z15;
        p076m2.r rVarH = rVar.h(-388716031);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(personalDataScreenData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-388716031, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.personaldata.PersonalDataInputScreen (PersonalDataScreen.kt:56)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(androidx.compose.foundation.layout.d.f(w0.i.d(companion, aVar.a(rVarH, i17).getBase().a(), null, 2, null), 0.0f, 1, null), aVar.b(rVarH, i17).getSpacing200(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing200(), 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarR);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            f3.m mVarR2 = a3.r(t70.i.S(d1.h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, rVarH, 0, 1), 0.0f, aVar.b(rVarH, i17).getSpacing100(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 5, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarR2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            j70.h.g(null, null, personalDataScreenData.getHeadline(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).i(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            p076m2.r rVar3 = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar3, i17).getSpacing300()), rVar3, 0);
            x30.c.c(null, 0.0f, y2.m.d(-1803553714, true, new er.p() { // from class: ts3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.s(personalDataScreenData, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar3, 54), rVar3, MLKEMEngine.KyberPolyBytes, 3);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar3, i17).getSpacing300()), rVar3, 0);
            PersonalDataScreenData.PeselSegmentData peselSegmentData = personalDataScreenData.getPeselSegmentData();
            if (peselSegmentData == null) {
                rVar3.X(61694693);
                rVar3.R();
                z15 = false;
            } else {
                rVar3.X(61694694);
                j70.h.g(null, null, peselSegmentData.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar3, i17).j(), null, null, false, false, null, rVar3, 0, 0, 0, 33030139);
                rVar3 = rVar3;
                z15 = false;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar3, i17).getSpacing200()), rVar3, 0);
                n50.h0.v(peselSegmentData.getSingleCardData(), null, rVar3, 0, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar3, i17).getSpacing300()), rVar3, 0);
                oq.i0 i0Var = oq.i0.f148189a;
                rVar3.R();
            }
            p076m2.r rVar4 = rVar3;
            j70.h.g(null, null, personalDataScreenData.getCaregiverSubtitleLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar3, i17).j(), null, null, false, false, null, rVar4, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar4, i17).getSpacing200()), rVar4, 0);
            v50.c caregiverNameTextInputData = personalDataScreenData.getCaregiverNameTextInputData();
            v50.c caregiverSurnameTextInputData = personalDataScreenData.getCaregiverSurnameTextInputData();
            boolean caregiverCardExpanded = personalDataScreenData.getCaregiverCardExpanded();
            Label caregiverLabel = personalDataScreenData.getCaregiverLabel();
            ButtonData caregiverDeleteButtonData = personalDataScreenData.getCaregiverDeleteButtonData();
            er.l<Boolean, oq.i0> lVarK = personalDataScreenData.k();
            DefaultSingleCardData caregiverSingleCardData = personalDataScreenData.getCaregiverSingleCardData();
            er.l<Boolean, oq.i0> lVarL = personalDataScreenData.l();
            int i18 = v50.c.f203957t;
            k(caregiverNameTextInputData, caregiverSurnameTextInputData, caregiverCardExpanded, caregiverLabel, caregiverSingleCardData, caregiverDeleteButtonData, lVarK, lVarL, rVar4, i18 | (i18 << 3));
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar4, i17).getSpacing300()), rVar4, 0);
            j70.h.g(null, null, personalDataScreenData.getTranslatorSubtitleLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar4, i17).j(), null, null, false, false, null, rVar4, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar4, i17).getSpacing200()), rVar4, 0);
            k(personalDataScreenData.getTranslatorNameTextInputData(), personalDataScreenData.getTranslatorSurnameTextInputData(), personalDataScreenData.getTranslatorCardExpanded(), personalDataScreenData.getTranslatorLabel(), personalDataScreenData.getTranslatorSingleCardData(), personalDataScreenData.getTranslatorDeleteButtonData(), personalDataScreenData.o(), personalDataScreenData.p(), rVar4, i18 | (i18 << 3));
            rVar4.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar4, i17).getSpacing200()), rVar4, 0);
            h30.q.p(personalDataScreenData.getNextButtonData(), false, null, rVar4, 0, 6);
            rVar2 = rVar4;
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ts3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.v(personalDataScreenData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(final PersonalDataScreenData personalDataScreenData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1803553714, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.personaldata.PersonalDataInputScreen.<anonymous>.<anonymous>.<anonymous> (PersonalDataScreen.kt:83)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            v50.c emailTextInputData = personalDataScreenData.getEmailTextInputData();
            boolean zG = rVar.G(personalDataScreenData);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ts3.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o.t(personalDataScreenData, ((Boolean) obj).booleanValue());
                    }
                };
                rVar.v(objE);
            }
            d60.c cVarB = d60.e.b(false, (er.l) objE, rVar, 0, 1);
            int i16 = v50.c.f203957t;
            v0.g(emailTextInputData, cVarB, rVar, i16, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            v50.c phoneTextInputData = personalDataScreenData.getPhoneTextInputData();
            boolean zG2 = rVar.G(personalDataScreenData);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: ts3.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o.u(personalDataScreenData, ((Boolean) obj).booleanValue());
                    }
                };
                rVar.v(objE2);
            }
            v0.g(phoneTextInputData, d60.e.b(false, (er.l) objE2, rVar, 0, 1), rVar, i16, 0);
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
    public static final oq.i0 t(PersonalDataScreenData personalDataScreenData, boolean z15) {
        personalDataScreenData.m().b(Boolean.valueOf(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(PersonalDataScreenData personalDataScreenData, boolean z15) {
        personalDataScreenData.n().b(Boolean.valueOf(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(PersonalDataScreenData personalDataScreenData, int i15, p076m2.r rVar, int i16) {
        r(personalDataScreenData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void w(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1400627499);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1400627499, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.personaldata.PersonalDataScreen (PersonalDataScreen.kt:38)");
            }
            p(x(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ts3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.y(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a x(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(d dVar, int i15, p076m2.r rVar, int i16) {
        w(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
