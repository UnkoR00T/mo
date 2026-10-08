package u12;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b22.SetupData;
import cb4.DialogData;
import d12.OAuthWebViewData;
import eo0.SearchRequest;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import q22.EdorMessageSetupData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ao\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lm22/h;", "dataSourceContract", "Lkotlin/Function0;", "Loq/i0;", "exitProcess", "exitToInbox", "Lkotlin/Function1;", "Ld12/c;", "goToOauthWebView", "Ljb4/b;", "showError", "Lcb4/d;", "showDialog", "X", "(Lm22/h;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;Lm2/r;I)V", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(660129174, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:184)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u12.a1
                @Override // er.l
                public final Object b(Object obj) {
                    return s1.B0(sVar, (w22.e) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B0(f00.s sVar, w22.e eVar) {
        if (!fr.t.c(eVar, w22.e.a.f209385a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C0(final f00.s sVar, final er.l lVar, final m22.h hVar, final er.l lVar2, final er.l lVar3, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-765322202, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:197)");
        }
        f00.r.o(wVar, fr.q0.c(a32.v.class), sVar.g(y02.v.n.f222992b), y2.m.d(506356119, true, new er.q() { // from class: u12.t0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s1.D0(sVar, lVar, hVar, lVar2, lVar3, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194211a.w(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D0(final f00.s sVar, final er.l lVar, final m22.h hVar, final er.l lVar2, final er.l lVar3, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(506356119, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:201)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(lVar) | rVar.G(hVar) | rVar.W(lVar2) | rVar.W(lVar3);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar4 = new er.l() { // from class: u12.j1
                @Override // er.l
                public final Object b(Object obj) {
                    return s1.E0(sVar, lVar, hVar, lVar2, lVar3, (a32.a.j) obj);
                }
            };
            rVar.v(lVar4);
            objE = lVar4;
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E0(f00.s sVar, er.l lVar, m22.h hVar, er.l lVar2, er.l lVar3, a32.a.j jVar) {
        if (fr.t.c(jVar, a32.a.j.C0034a.f2391a)) {
            sVar.c();
        } else if (jVar instanceof a32.a.j.GoToAuthorization) {
            lVar.b(((a32.a.j.GoToAuthorization) jVar).getOAuthWebViewData());
        } else if (jVar instanceof a32.a.j.c) {
            sVar.j(y02.v.a.f222979b, hVar, y02.v.n.f222992b);
        } else if (jVar instanceof a32.a.j.ShowDialog) {
            lVar2.b(((a32.a.j.ShowDialog) jVar).getDialogData());
        } else if (jVar instanceof a32.a.j.Error) {
            lVar3.b(((a32.a.j.Error) jVar).getErrorData());
        } else if (fr.t.c(jVar, a32.a.j.d.f2394a)) {
            f00.s.m(sVar, y02.v.b.f222980b, null, 2, null);
        } else {
            if (!fr.t.c(jVar, a32.a.j.f.f2396a)) {
                throw new oq.p();
            }
            f00.s.l(sVar, y02.v.d.f222982b, hVar, null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F0(final m22.h hVar, final f00.s sVar, final er.l lVar, final er.a aVar, final er.l lVar2, final er.l lVar3, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-919095257, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:234)");
        }
        f00.r.o(wVar, fr.q0.c(o22.d0.class), new EdorMessageSetupData(hVar, hVar, hVar, hVar), y2.m.d(352583064, true, new er.q() { // from class: u12.e0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s1.G0(sVar, hVar, lVar, aVar, lVar2, lVar3, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194211a.q(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G0(final f00.s sVar, final m22.h hVar, final er.l lVar, final er.a aVar, final er.l lVar2, final er.l lVar3, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(352583064, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:243)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(hVar) | rVar.W(lVar) | rVar.W(aVar) | rVar.W(lVar2) | rVar.W(lVar3);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar4 = new er.l() { // from class: u12.i1
                @Override // er.l
                public final Object b(Object obj) {
                    return s1.H0(sVar, hVar, lVar, aVar, lVar2, lVar3, (o22.a.i) obj);
                }
            };
            rVar.v(lVar4);
            objE = lVar4;
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H0(f00.s sVar, m22.h hVar, er.l lVar, er.a aVar, er.l lVar2, er.l lVar3, o22.a.i iVar) {
        if (fr.t.c(iVar, o22.a.i.C3486a.f141053a)) {
            sVar.c();
        } else if (iVar instanceof o22.a.i.d) {
            f00.s.l(sVar, y02.v.k.f222989b, hVar, null, 4, null);
        } else if (iVar instanceof o22.a.i.ShowDialog) {
            lVar.b(((o22.a.i.ShowDialog) iVar).getDialogData());
        } else if (iVar instanceof o22.a.i.e) {
            aVar.a();
        } else if (iVar instanceof o22.a.i.GoToAuthorization) {
            lVar2.b(((o22.a.i.GoToAuthorization) iVar).getOAuthWebViewData());
        } else {
            if (!(iVar instanceof o22.a.i.GoToError)) {
                throw new oq.p();
            }
            lVar3.b(((o22.a.i.GoToError) iVar).getError());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I0(final f00.s sVar, final er.a aVar, final er.l lVar, final m22.h hVar, final er.l lVar2, final er.l lVar3, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1072868312, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:266)");
        }
        f00.r.o(wVar, fr.q0.c(u22.q.class), sVar.g(y02.v.k.f222989b), y2.m.d(198810009, true, new er.q() { // from class: u12.u0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s1.J0(sVar, aVar, lVar, hVar, lVar2, lVar3, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194211a.u(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J0(final f00.s sVar, final er.a aVar, final er.l lVar, final m22.h hVar, final er.l lVar2, final er.l lVar3, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(198810009, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:270)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar) | rVar.W(lVar) | rVar.G(hVar) | rVar.W(lVar2) | rVar.W(lVar3);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar4 = new er.l() { // from class: u12.w0
                @Override // er.l
                public final Object b(Object obj) {
                    return s1.K0(sVar, aVar, lVar, hVar, lVar2, lVar3, (u22.a.g) obj);
                }
            };
            rVar.v(lVar4);
            objE = lVar4;
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K0(f00.s sVar, er.a aVar, er.l lVar, m22.h hVar, er.l lVar2, er.l lVar3, u22.a.g gVar) {
        if (fr.t.c(gVar, u22.a.g.C5063a.f194527a)) {
            sVar.c();
        } else if (gVar instanceof u22.a.g.b) {
            aVar.a();
        } else if (gVar instanceof u22.a.g.ShowDialog) {
            lVar.b(((u22.a.g.ShowDialog) gVar).getDialogData());
        } else if (gVar instanceof u22.a.g.f) {
            f00.s.l(sVar, y02.v.p.f222994b, hVar, null, 4, null);
        } else if (gVar instanceof u22.a.g.Error) {
            lVar2.b(((u22.a.g.Error) gVar).getErrorData());
        } else {
            if (!(gVar instanceof u22.a.g.GoToAuthorization)) {
                throw new oq.p();
            }
            lVar3.b(((u22.a.g.GoToAuthorization) gVar).getOAuthWebViewData());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L0(f00.s sVar, final er.a aVar, final er.a aVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1226641367, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:295)");
        }
        f00.r.o(wVar, fr.q0.c(d32.n.class), sVar.g(y02.v.p.f222994b), y2.m.d(45036954, true, new er.q() { // from class: u12.o0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s1.M0(aVar, aVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194211a.s(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M0(final er.a aVar, final er.a aVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(45036954, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:299)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(aVar2);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u12.y0
                @Override // er.l
                public final Object b(Object obj) {
                    return s1.N0(aVar, aVar2, (d32.d) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N0(er.a aVar, er.a aVar2, d32.d dVar) {
        if (!(dVar instanceof d32.d.Close)) {
            throw new oq.p();
        }
        if (((d32.d.Close) dVar).getEntryMessageType() instanceof z02.a.EditDraft) {
            aVar.a();
        } else {
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O0(final f00.s sVar, final er.l lVar, final er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1380414422, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:315)");
        }
        f00.r.n(wVar, fr.q0.c(y12.q.class), y2.m.d(187306684, true, new er.q() { // from class: u12.s0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s1.P0(sVar, lVar, lVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194211a.y(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P0(final f00.s sVar, final er.l lVar, final er.l lVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(187306684, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:318)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(lVar) | rVar.W(lVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u12.b1
                @Override // er.l
                public final Object b(Object obj) {
                    return s1.Q0(sVar, lVar, lVar2, (y12.a.f) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q0(f00.s sVar, er.l lVar, er.l lVar2, y12.a.f fVar) {
        if (fVar instanceof y12.a.f.C5960a) {
            sVar.c();
        } else if (fVar instanceof y12.a.f.ShowCountriesDictionary) {
            f00.s.l(sVar, y02.v.l.f222990b, ((y12.a.f.ShowCountriesDictionary) fVar).getData(), null, 4, null);
        } else if (fVar instanceof y12.a.f.Error) {
            lVar.b(((y12.a.f.Error) fVar).getError());
        } else if (fVar instanceof y12.a.f.GoToAuthorization) {
            lVar2.b(((y12.a.f.GoToAuthorization) fVar).getOAuthWebViewData());
        } else {
            if (!(fVar instanceof y12.a.f.GoToResults)) {
                throw new oq.p();
            }
            f00.s.l(sVar, y02.v.c.f222981b, ((y12.a.f.GoToResults) fVar).getSearchRequest(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R0(final f00.s sVar, final m22.h hVar, final er.l lVar, final er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1534187477, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:342)");
        }
        f00.r.o(wVar, fr.q0.c(b22.k.class), new SetupData(hVar, (SearchRequest) sVar.g(y02.v.c.f222981b)), y2.m.d(-262509156, true, new er.q() { // from class: u12.p0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s1.S0(sVar, lVar, lVar2, hVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194211a.z(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S0(final f00.s sVar, final er.l lVar, final er.l lVar2, final m22.h hVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-262509156, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:351)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(lVar) | rVar.W(lVar2) | rVar.G(hVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u12.f1
                @Override // er.l
                public final Object b(Object obj) {
                    return s1.T0(sVar, lVar, lVar2, hVar, (b22.a.g) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T0(f00.s sVar, er.l lVar, er.l lVar2, m22.h hVar, b22.a.g gVar) {
        if (fr.t.c(gVar, b22.a.g.C0383a.f16152a)) {
            sVar.c();
        } else if (gVar instanceof b22.a.g.GoToAuthorization) {
            lVar.b(((b22.a.g.GoToAuthorization) gVar).getOAuthWebViewData());
        } else if (gVar instanceof b22.a.g.GoToDetails) {
            f00.s.l(sVar, y02.v.m.f222991b, ((b22.a.g.GoToDetails) gVar).getSetupData(), null, 4, null);
        } else if (gVar instanceof b22.a.g.GoToDialog) {
            lVar2.b(((b22.a.g.GoToDialog) gVar).getDialogData());
        } else {
            if (!fr.t.c(gVar, b22.a.g.e.f16156a)) {
                throw new oq.p();
            }
            f00.s.l(sVar, y02.v.a.f222979b, hVar, null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U0(m22.h hVar, er.a aVar, er.a aVar2, er.l lVar, er.l lVar2, er.l lVar3, int i15, p076m2.r rVar, int i16) {
        X(hVar, aVar, aVar2, lVar, lVar2, lVar3, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void X(final m22.h hVar, final er.a<oq.i0> aVar, final er.a<oq.i0> aVar2, final er.l<? super OAuthWebViewData, oq.i0> lVar, final er.l<? super jb4.b, oq.i0> lVar2, final er.l<? super DialogData, oq.i0> lVar3, p076m2.r rVar, final int i15) {
        int i16;
        er.a<oq.i0> aVar3;
        er.l<? super OAuthWebViewData, oq.i0> lVar4;
        er.l<? super jb4.b, oq.i0> lVar5;
        er.l<? super DialogData, oq.i0> lVar6;
        final f00.s sVar;
        p076m2.r rVarH = rVar.h(233648525);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(hVar) : rVarH.G(hVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            aVar3 = aVar2;
            i16 |= rVarH.G(aVar3) ? 256 : 128;
        } else {
            aVar3 = aVar2;
        }
        if ((i15 & 3072) == 0) {
            lVar4 = lVar;
            i16 |= rVarH.G(lVar4) ? 2048 : 1024;
        } else {
            lVar4 = lVar;
        }
        if ((i15 & 24576) == 0) {
            lVar5 = lVar2;
            i16 |= rVarH.G(lVar5) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            lVar5 = lVar2;
        }
        if ((196608 & i15) == 0) {
            lVar6 = lVar3;
            i16 |= rVarH.G(lVar6) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        } else {
            lVar6 = lVar3;
        }
        if (rVarH.r((i16 & 74899) != 74898, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(233648525, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent (MessageWizardNavContent.kt:73)");
            }
            f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            y02.v.a aVar4 = y02.v.a.f222979b;
            boolean zG = ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(hVar))) | ((i16 & 112) == 32) | ((458752 & i16) == 131072) | rVarH.G(sVarJ) | ((57344 & i16) == 16384) | ((i16 & 7168) == 2048) | ((i16 & 896) == 256);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                sVar = sVarJ;
                final er.a<oq.i0> aVar5 = aVar3;
                final er.l<? super OAuthWebViewData, oq.i0> lVar7 = lVar4;
                final er.l<? super jb4.b, oq.i0> lVar8 = lVar5;
                final er.l<? super DialogData, oq.i0> lVar9 = lVar6;
                er.l lVar10 = new er.l() { // from class: u12.v
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s1.Y(hVar, aVar, lVar9, sVar, lVar8, lVar7, aVar5, (p136y9.d1) obj);
                    }
                };
                rVarH.v(lVar10);
                objE = lVar10;
            } else {
                sVar = sVarJ;
            }
            f00.d0.j(sVar, aVar4, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: u12.g0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s1.U0(hVar, aVar, aVar2, lVar, lVar2, lVar3, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y(final m22.h hVar, final er.a aVar, final er.l lVar, final f00.s sVar, final er.l lVar2, final er.l lVar3, final er.a aVar2, p136y9.d1 d1Var) {
        f00.r.u(d1Var, y02.v.a.f222979b, null, y2.m.b(-1358544596, true, new er.r() { // from class: u12.r0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s1.Z(hVar, aVar, lVar, sVar, lVar2, lVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y02.v.j.f222988b, null, y2.m.b(-304003037, true, new er.r() { // from class: u12.q1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s1.c0(sVar, hVar, aVar, lVar, lVar2, lVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y02.v.e.f222983b, null, y2.m.b(-457776092, true, new er.r() { // from class: u12.r1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s1.w0(sVar, hVar, aVar, lVar, lVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y02.v.l.f222990b, null, y2.m.b(-611549147, true, new er.r() { // from class: u12.w
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s1.z0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y02.v.n.f222992b, null, y2.m.b(-765322202, true, new er.r() { // from class: u12.x
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s1.C0(sVar, lVar3, hVar, lVar, lVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y02.v.i.f222987b, null, y2.m.b(-919095257, true, new er.r() { // from class: u12.y
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s1.F0(hVar, sVar, lVar, aVar, lVar3, lVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y02.v.k.f222989b, null, y2.m.b(-1072868312, true, new er.r() { // from class: u12.z
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s1.I0(sVar, aVar, lVar, hVar, lVar2, lVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y02.v.p.f222994b, null, y2.m.b(-1226641367, true, new er.r() { // from class: u12.a0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s1.L0(sVar, aVar2, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y02.v.b.f222980b, null, y2.m.b(-1380414422, true, new er.r() { // from class: u12.b0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s1.O0(sVar, lVar2, lVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y02.v.c.f222981b, null, y2.m.b(-1534187477, true, new er.r() { // from class: u12.c0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s1.R0(sVar, hVar, lVar3, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y02.v.m.f222991b, null, y2.m.b(-963187421, true, new er.r() { // from class: u12.c1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s1.f0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y02.v.f.f222984b, null, y2.m.b(-1116960476, true, new er.r() { // from class: u12.m1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s1.i0(sVar, lVar, aVar, hVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y02.v.g.f222985b, null, y2.m.b(-1270733531, true, new er.r() { // from class: u12.n1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s1.l0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y02.v.h.f222986b, null, y2.m.b(-1424506586, true, new er.r() { // from class: u12.o1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s1.o0(hVar, aVar, sVar, lVar2, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y02.v.d.f222982b, null, y2.m.b(-1578279641, true, new er.r() { // from class: u12.p1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s1.t0(sVar, hVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z(final m22.h hVar, final er.a aVar, final er.l lVar, final f00.s sVar, final er.l lVar2, final er.l lVar3, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1358544596, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:83)");
        }
        f00.r.o(wVar, fr.q0.c(v12.p.class), hVar, y2.m.d(-883478819, true, new er.q() { // from class: u12.f0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s1.a0(aVar, lVar, sVar, hVar, lVar2, lVar3, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194211a.B(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(final er.a aVar, final er.l lVar, final f00.s sVar, final m22.h hVar, final er.l lVar2, final er.l lVar3, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-883478819, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:87)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(lVar) | rVar.G(sVar) | rVar.G(hVar) | rVar.W(lVar2) | rVar.W(lVar3);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar4 = new er.l() { // from class: u12.z0
                @Override // er.l
                public final Object b(Object obj) {
                    return s1.b0(aVar, lVar, sVar, hVar, lVar2, lVar3, (v12.a.i) obj);
                }
            };
            rVar.v(lVar4);
            objE = lVar4;
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b0(er.a aVar, er.l lVar, f00.s sVar, m22.h hVar, er.l lVar2, er.l lVar3, v12.a.i iVar) {
        if (fr.t.c(iVar, v12.a.i.C5279a.f203032a)) {
            aVar.a();
        } else if (iVar instanceof v12.a.i.ShowDialog) {
            lVar.b(((v12.a.i.ShowDialog) iVar).getDialogData());
        } else if (iVar instanceof v12.a.i.e) {
            f00.s.l(sVar, y02.v.n.f222992b, hVar, null, 4, null);
        } else if (iVar instanceof v12.a.i.d.C5280a) {
            f00.s.l(sVar, y02.v.i.f222987b, new EdorMessageSetupData(hVar, hVar, hVar, hVar), null, 4, null);
        } else if (iVar instanceof v12.a.i.d.b) {
            f00.s.l(sVar, y02.v.j.f222988b, hVar, null, 4, null);
        } else if (iVar instanceof v12.a.i.GoToError) {
            lVar2.b(((v12.a.i.GoToError) iVar).getErrorData());
        } else {
            if (!(iVar instanceof v12.a.i.GoToAuthorization)) {
                throw new oq.p();
            }
            lVar3.b(((v12.a.i.GoToAuthorization) iVar).getOAuthWebViewData());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c0(final f00.s sVar, final m22.h hVar, final er.a aVar, final er.l lVar, final er.l lVar2, final er.l lVar3, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-304003037, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:124)");
        }
        f00.r.o(wVar, fr.q0.c(r22.c0.class), sVar.g(y02.v.j.f222988b), y2.m.d(967675284, true, new er.q() { // from class: u12.v0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s1.d0(sVar, hVar, aVar, lVar, lVar2, lVar3, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194211a.t(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(final f00.s sVar, final m22.h hVar, final er.a aVar, final er.l lVar, final er.l lVar2, final er.l lVar3, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(967675284, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:128)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(hVar) | rVar.W(aVar) | rVar.W(lVar) | rVar.W(lVar2) | rVar.W(lVar3);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar4 = new er.l() { // from class: u12.h1
                @Override // er.l
                public final Object b(Object obj) {
                    return s1.e0(sVar, hVar, aVar, lVar, lVar2, lVar3, (r22.a.j) obj);
                }
            };
            rVar.v(lVar4);
            objE = lVar4;
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e0(f00.s sVar, m22.h hVar, er.a aVar, er.l lVar, er.l lVar2, er.l lVar3, r22.a.j jVar) {
        if (fr.t.c(jVar, r22.a.j.e.f170953a)) {
            f00.s.l(sVar, y02.v.e.f222983b, hVar, null, 4, null);
        } else if (fr.t.c(jVar, r22.a.j.C4336a.f170949a)) {
            sVar.c();
        } else if (fr.t.c(jVar, r22.a.j.f.f170954a)) {
            aVar.a();
        } else if (jVar instanceof r22.a.j.ShowDialog) {
            lVar.b(((r22.a.j.ShowDialog) jVar).getDialogData());
        } else if (jVar instanceof r22.a.j.GoToError) {
            lVar2.b(((r22.a.j.GoToError) jVar).getError());
        } else if (jVar instanceof r22.a.j.GoToSearch) {
            f00.s.l(sVar, y02.v.l.f222990b, ((r22.a.j.GoToSearch) jVar).getSearchModel(), null, 4, null);
        } else {
            if (!(jVar instanceof r22.a.j.GoToAuthorization)) {
                throw new oq.p();
            }
            lVar3.b(((r22.a.j.GoToAuthorization) jVar).getOAuthWebViewData());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-963187421, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:375)");
        }
        f00.r.o(wVar, fr.q0.c(y22.m.class), sVar.g(y02.v.m.f222991b), y2.m.d(-195865134, true, new er.q() { // from class: u12.n0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s1.g0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194211a.o(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-195865134, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:381)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u12.g1
                @Override // er.l
                public final Object b(Object obj) {
                    return s1.h0(sVar, (y22.b) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h0(f00.s sVar, y22.b bVar) {
        if (!fr.t.c(bVar, y22.b.a.f223449a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i0(final f00.s sVar, final er.l lVar, final er.a aVar, final m22.h hVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1116960476, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:394)");
        }
        f00.r.o(wVar, fr.q0.c(i22.n.class), sVar.g(y02.v.f.f222984b), y2.m.d(-349638189, true, new er.q() { // from class: u12.d0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s1.j0(sVar, lVar, aVar, hVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194211a.p(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j0(final f00.s sVar, final er.l lVar, final er.a aVar, final m22.h hVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-349638189, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:399)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(lVar) | rVar.W(aVar) | rVar.G(hVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u12.l1
                @Override // er.l
                public final Object b(Object obj) {
                    return s1.k0(sVar, lVar, aVar, hVar, (i22.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k0(f00.s sVar, er.l lVar, er.a aVar, m22.h hVar, i22.a.b bVar) {
        if (fr.t.c(bVar, i22.a.b.c.f88484a)) {
            f00.s.m(sVar, y02.v.g.f222985b, null, 2, null);
        } else if (bVar instanceof i22.a.b.ShowDialog) {
            lVar.b(((i22.a.b.ShowDialog) bVar).getDialogData());
        } else if (fr.t.c(bVar, i22.a.b.e.f88486a)) {
            aVar.a();
        } else if (fr.t.c(bVar, i22.a.b.C2085a.f88482a)) {
            sVar.c();
        } else if (bVar instanceof i22.a.b.GoToCorrespondenceAddress) {
            f00.s.l(sVar, y02.v.h.f222986b, ((i22.a.b.GoToCorrespondenceAddress) bVar).getAddressFormData(), null, 4, null);
        } else {
            if (!fr.t.c(bVar, i22.a.b.d.f88485a)) {
                throw new oq.p();
            }
            f00.s.l(sVar, y02.v.k.f222989b, hVar, null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1270733531, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:428)");
        }
        f00.r.n(wVar, fr.q0.c(k22.k.class), y2.m.d(83980499, true, new er.q() { // from class: u12.l0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s1.m0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194211a.x(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(83980499, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:431)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u12.e1
                @Override // er.l
                public final Object b(Object obj) {
                    return s1.n0(sVar, (k22.b) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n0(f00.s sVar, k22.b bVar) {
        if (!fr.t.c(bVar, k22.b.a.f107632a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o0(final m22.h hVar, final er.a aVar, final f00.s sVar, final er.l lVar, final er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1424506586, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:444)");
        }
        boolean zG = rVar.G(hVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u12.h0
                @Override // er.l
                public final Object b(Object obj) {
                    return s1.p0(hVar, (n22.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        int i16 = i15 >> 3;
        int i17 = i16 & 14;
        final n22.f fVar2 = (n22.f) q7.d.c(fr.q0.c(n22.f.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, ((i16 & 14) << 3) & 112, 0);
        xw.b<n22.a.e> bVarY1 = fVar2.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.W(lVar) | rVar.G(hVar) | rVar.W(lVar2);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            er.l lVar3 = new er.l() { // from class: u12.i0
                @Override // er.l
                public final Object b(Object obj) {
                    return s1.q0(aVar, sVar, lVar, hVar, lVar2, (n22.a.e) obj);
                }
            };
            rVar.v(lVar3);
            objE2 = lVar3;
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        y02.v.h hVar2 = y02.v.h.f222986b;
        f00.r.r(wVar, hVar2, sVar.g(hVar2), y2.m.d(1693023605, true, new er.q() { // from class: u12.j0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s1.r0(fVar2, (st3.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, i17 | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n22.f p0(m22.h hVar, n22.f.a aVar) {
        return (n22.f) aVar.a(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q0(er.a aVar, f00.s sVar, er.l lVar, m22.h hVar, er.l lVar2, n22.a.e eVar) {
        if (fr.t.c(eVar, n22.a.e.C3248e.f130786a)) {
            aVar.a();
        } else if (fr.t.c(eVar, n22.a.e.C3247a.f130782a)) {
            sVar.c();
        } else if (eVar instanceof n22.a.e.GoToError) {
            lVar.b(((n22.a.e.GoToError) eVar).getErrorData());
        } else if (eVar instanceof n22.a.e.d) {
            f00.s.l(sVar, y02.v.k.f222989b, hVar, null, 4, null);
        } else if (eVar instanceof n22.a.e.GoToSearch) {
            f00.s.l(sVar, y02.v.l.f222990b, ((n22.a.e.GoToSearch) eVar).getModel(), null, 4, null);
        } else {
            if (!(eVar instanceof n22.a.e.ShowDialog)) {
                throw new oq.p();
            }
            lVar2.b(((n22.a.e.ShowDialog) eVar).getDialogData());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r0(final n22.f fVar, st3.f fVar2, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1693023605, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:473)");
        }
        xw.b<st3.f.a> bVarY1 = fVar2.Y1();
        boolean zG = rVar.G(fVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u12.d1
                @Override // er.l
                public final Object b(Object obj) {
                    return s1.s0(fVar, (st3.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s0(n22.f fVar, st3.f.a aVar) {
        fVar.m9(aVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t0(final f00.s sVar, final m22.h hVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1578279641, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:483)");
        }
        f00.r.o(wVar, fr.q0.c(e22.o.class), sVar.g(y02.v.d.f222982b), y2.m.d(-810957354, true, new er.q() { // from class: u12.q0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s1.u0(sVar, hVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194211a.A(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u0(final f00.s sVar, final m22.h hVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-810957354, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:487)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(hVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u12.x0
                @Override // er.l
                public final Object b(Object obj) {
                    return s1.v0(sVar, hVar, (e22.d) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v0(f00.s sVar, m22.h hVar, e22.d dVar) {
        if (fr.t.c(dVar, e22.d.a.f46941a)) {
            sVar.c();
        } else {
            if (!fr.t.c(dVar, e22.d.b.f46942a)) {
                throw new oq.p();
            }
            f00.s.l(sVar, y02.v.a.f222979b, hVar, null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w0(final f00.s sVar, final m22.h hVar, final er.a aVar, final er.l lVar, final er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-457776092, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:155)");
        }
        f00.r.o(wVar, fr.q0.c(g22.p.class), sVar.g(y02.v.e.f222983b), y2.m.d(813902229, true, new er.q() { // from class: u12.k0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s1.x0(sVar, hVar, aVar, lVar, lVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194211a.v(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x0(final f00.s sVar, final m22.h hVar, final er.a aVar, final er.l lVar, final er.l lVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(813902229, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:159)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(hVar) | rVar.W(aVar) | rVar.W(lVar) | rVar.W(lVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar3 = new er.l() { // from class: u12.k1
                @Override // er.l
                public final Object b(Object obj) {
                    return s1.y0(sVar, hVar, aVar, lVar, lVar2, (g22.a.d) obj);
                }
            };
            rVar.v(lVar3);
            objE = lVar3;
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y0(f00.s sVar, m22.h hVar, er.a aVar, er.l lVar, er.l lVar2, g22.a.d dVar) {
        if (fr.t.c(dVar, g22.a.d.b.f69846a)) {
            f00.s.l(sVar, y02.v.f.f222984b, hVar, null, 4, null);
        } else if (fr.t.c(dVar, g22.a.d.C1575a.f69845a)) {
            sVar.c();
        } else if (fr.t.c(dVar, g22.a.d.c.f69847a)) {
            aVar.a();
        } else if (dVar instanceof g22.a.d.ShowDialog) {
            lVar.b(((g22.a.d.ShowDialog) dVar).getDialogData());
        } else {
            if (!(dVar instanceof g22.a.d.ShowError)) {
                throw new oq.p();
            }
            lVar2.b(((g22.a.d.ShowError) dVar).getErrorData());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-611549147, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.MessageWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MessageWizardNavContent.kt:180)");
        }
        f00.r.o(wVar, fr.q0.c(w22.x.class), sVar.g(y02.v.l.f222990b), y2.m.d(660129174, true, new er.q() { // from class: u12.m0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s1.A0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194211a.r(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }
}
