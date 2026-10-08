package p096or3;

import android.os.Bundle;
import androidx.p016lifecycle.h;
import as3.z;
import cj0.ZusEVisitDepartment;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import ds3.o;
import er.l;
import er.p;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q;
import fr.q0;
import fr.t;
import fs3.a;
import ks3.e;
import mr.g;
import ms3.b;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p114t0.f;
import p136y9.d1;
import p136y9.e0;
import p136y9.w;
import p136y9.y0;
import p7.CreationExtras;
import ss3.SummaryData;
import ts3.SetupData;
import ws3.c;
import ws3.v;
import zr3.m;
import zr3.n;
import zx.d;

/* JADX INFO: renamed from: or3.v0, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a]\u0010\u0012\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "Lkotlin/Function1;", "Ljb4/b;", "navError", "Lzr3/n;", "viewModelNavigation", i.f37094u, "(Ler/a;Ler/l;Lzr3/n;Lm2/r;I)V", "Lzx/d;", "Lfs3/a$c;", "navigation", "Lf00/s;", "destinationNavigator", "handleBackNavigation", "Lss3/b;", "summaryData", "I", "(Lzx/d;Lf00/s;Ler/a;Ler/l;Lzr3/n;Lss3/b;Lm2/r;I)V", "zusvisit_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class C6464v0 {

    /* JADX INFO: renamed from: or3.v0$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends q implements er.a<i0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f148791j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ s f148792k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ f6<SummaryData> f148793l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(er.a<i0> aVar, s sVar, f6<SummaryData> f6Var) {
            super(0, t.a.class, "handleBackNavigation", "NewVisitWizardNavContent$handleBackNavigation(Lkotlin/jvm/functions/Function0;Lpl/gov/coi/common/navigation/DestinationNavigator;Landroidx/compose/runtime/State;)V", 0);
            this.f148791j = aVar;
            this.f148792k = sVar;
            this.f148793l = f6Var;
        }

        public final void E() {
            C6464v0.M(this.f148791j, this.f148792k, this.f148793l);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    /* JADX INFO: renamed from: or3.v0$b */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends q implements er.a<i0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f148794j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ s f148795k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ f6<SummaryData> f148796l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(er.a<i0> aVar, s sVar, f6<SummaryData> f6Var) {
            super(0, t.a.class, "handleBackNavigation", "NewVisitWizardNavContent$handleBackNavigation(Lkotlin/jvm/functions/Function0;Lpl/gov/coi/common/navigation/DestinationNavigator;Landroidx/compose/runtime/State;)V", 0);
            this.f148794j = aVar;
            this.f148795k = sVar;
            this.f148796l = f6Var;
        }

        public final void E() {
            C6464v0.M(this.f148794j, this.f148795k, this.f148796l);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    /* JADX INFO: renamed from: or3.v0$c */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f148797a;

        static {
            int[] iArr = new int[ps3.c.values().length];
            try {
                iArr[ps3.c.POP_DESTINATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ps3.c.GO_TO_CHOOSE_DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f148797a = iArr;
        }
    }

    private static final void I(final d<fs3.a.c, i0> dVar, final s sVar, final er.a<i0> aVar, final l<? super jb4.b, i0> lVar, final n nVar, final SummaryData summaryData, r rVar, final int i15) {
        int i16;
        er.a<i0> aVar2;
        l<? super jb4.b, i0> lVar2;
        r rVarH = rVar.h(68506048);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(sVar) : rVarH.G(sVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            aVar2 = aVar;
            i16 |= rVarH.G(aVar2) ? 256 : 128;
        } else {
            aVar2 = aVar;
        }
        if ((i15 & 3072) == 0) {
            lVar2 = lVar;
            i16 |= rVarH.G(lVar2) ? 2048 : 1024;
        } else {
            lVar2 = lVar;
        }
        if ((i15 & 24576) == 0) {
            i16 |= (i15 & 32768) == 0 ? rVarH.W(nVar) : rVarH.G(nVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.G(summaryData) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if (rVarH.r((74899 & i16) != 74898, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(68506048, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.ChooseInternationalEventHandler (NewVisitWizardNavContent.kt:428)");
            }
            xw.b<fs3.a.c> bVarY1 = dVar.Y1();
            boolean zG = ((i16 & 112) == 32 || ((i16 & 64) != 0 && rVarH.G(sVar))) | rVarH.G(summaryData) | ((57344 & i16) == 16384 || ((i16 & 32768) != 0 && rVarH.G(nVar))) | ((i16 & 896) == 256) | ((i16 & 7168) == 2048);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                final er.a<i0> aVar3 = aVar2;
                final l<? super jb4.b, i0> lVar3 = lVar2;
                l lVar4 = new l() { // from class: or3.f0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return C6464v0.J(sVar, summaryData, nVar, aVar3, lVar3, (a.c) obj);
                    }
                };
                rVarH.v(lVar4);
                objE = lVar4;
            }
            f0.b(bVarY1, (l) objE, rVarH, xw.b.f221619c);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: or3.g0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6464v0.K(dVar, sVar, aVar, lVar, nVar, summaryData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(s sVar, SummaryData summaryData, n nVar, er.a aVar, l lVar, fs3.a.c cVar) {
        if (cVar instanceof fs3.a.c.EnterDate) {
            x0 x0Var = x0.f148825a;
            fs3.a.c.EnterDate enterDate = (fs3.a.c.EnterDate) cVar;
            SummaryData summaryDataB = SummaryData.b(summaryData, null, null, null, 0, null, null, enterDate.getUseAlternativeTopicId(), enterDate.getDepartment(), null, null, 831, null);
            nVar.A7(summaryDataB);
            i0 i0Var = i0.f148189a;
            s.l(sVar, x0Var, summaryDataB, null, 4, null);
        } else if (cVar instanceof fs3.a.c.C1495c) {
            nVar.A7(SummaryData.b(summaryData, null, null, null, 0, null, null, true, null, null, null, 959, null));
            s.l(sVar, y0.f148833a, summaryData, null, 4, null);
        } else if (cVar instanceof fs3.a.c.SelectRadio) {
            nVar.A7(SummaryData.b(summaryData, null, null, null, 0, null, null, false, null, ((fs3.a.c.SelectRadio) cVar).getRadioButtonId(), null, 639, null));
        } else if (cVar instanceof fs3.a.c.EnterDepartmentSelect) {
            s.l(sVar, d1.f148639a, ((fs3.a.c.EnterDepartmentSelect) cVar).getSetupData(), null, 4, null);
        } else if (cVar instanceof fs3.a.c.C1494a) {
            aVar.a();
        } else {
            if (!(cVar instanceof fs3.a.c.Error)) {
                throw new oq.p();
            }
            lVar.b(((fs3.a.c.Error) cVar).getError());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(d dVar, s sVar, er.a aVar, l lVar, n nVar, SummaryData summaryData, int i15, r rVar, int i16) {
        I(dVar, sVar, aVar, lVar, nVar, summaryData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void L(final er.a<i0> aVar, final l<? super jb4.b, i0> lVar, final n nVar, r rVar, final int i15) {
        int i16;
        final s sVar;
        r rVarH = rVar.h(-509946759);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(nVar) : rVarH.G(nVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-509946759, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent (NewVisitWizardNavContent.kt:54)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            final f6 f6VarB = m7.b.b(nVar.c(), new SummaryData(null, null, null, 0, null, null, false, null, null, null, 1023, null), null, null, null, rVarH, 0, 14);
            xw.b<m.b> bVarG = nVar.g();
            int i17 = i16 & 14;
            boolean zW = rVarH.W(f6VarB) | (i17 == 4) | rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: or3.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return C6464v0.O(sVarJ, aVar, f6VarB, (m.b) obj);
                    }
                };
                rVarH.v(objE);
            }
            f0.b(bVarG, (l) objE, rVarH, xw.b.f221619c);
            c1 c1Var = c1.f148631a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 896) == 256 || ((i16 & 512) != 0 && rVarH.G(nVar))) | rVarH.W(f6VarB) | (i17 == 4) | ((i16 & 112) == 32);
            Object objE2 = rVarH.E();
            if (zG || objE2 == r.INSTANCE.a()) {
                sVar = sVarJ;
                l lVar2 = new l() { // from class: or3.y
                    @Override // er.l
                    public final Object b(Object obj) {
                        return C6464v0.P(sVar, nVar, f6VarB, aVar, lVar, (d1) obj);
                    }
                };
                rVarH.v(lVar2);
                objE2 = lVar2;
            } else {
                sVar = sVarJ;
            }
            d0.j(sVar, c1Var, (l) objE2, rVarH, s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: or3.j0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6464v0.t0(aVar, lVar, nVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(er.a<i0> aVar, s sVar, f6<SummaryData> f6Var) {
        w0 w0VarA = ss3.a.INSTANCE.a(N(f6Var).getNewVisitState());
        if (w0VarA == null) {
            aVar.a();
            return;
        }
        y0 y0VarS = sVar.getNavController().s();
        if (t.c(y0VarS != null ? y0VarS.u() : null, w0VarA.getRoute())) {
            aVar.a();
        } else {
            sVar.c();
        }
    }

    private static final SummaryData N(f6<SummaryData> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(s sVar, er.a aVar, f6 f6Var, m.b bVar) {
        if (bVar instanceof m.b.a) {
            M(aVar, sVar, f6Var);
        } else if (bVar instanceof m.b.ShowExitDialog) {
            s.l(sVar, e1.f148648a, ((m.b.ShowExitDialog) bVar).getNavigationDialogModel(), null, 4, null);
        } else {
            if (!(bVar instanceof m.b.ToChooseDate)) {
                throw new oq.p();
            }
            sVar.j(x0.f148825a, ((m.b.ToChooseDate) bVar).getSummaryData(), c1.f148631a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(final s sVar, final n nVar, final f6 f6Var, final er.a aVar, final l lVar, d1 d1Var) {
        sVar.getNavController().i(new e0.c() { // from class: or3.o0
            @Override // y9.e0.c
            public final void a(e0 e0Var, y0 y0Var, Bundle bundle) {
                C6464v0.Q(nVar, e0Var, y0Var, bundle);
            }
        });
        f00.r.u(d1Var, c1.f148631a, null, y2.m.b(999494074, true, new er.r() { // from class: or3.q0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return C6464v0.R(sVar, f6Var, nVar, aVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, b1.f148623a, null, y2.m.b(-451171677, true, new er.r() { // from class: or3.r0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return C6464v0.W(sVar, nVar, f6Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z0.f148837a, null, y2.m.b(142316994, true, new er.r() { // from class: or3.s0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return C6464v0.Y(sVar, f6Var, aVar, lVar, nVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a1.f148619a, null, y2.m.b(735805665, true, new er.r() { // from class: or3.t0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return C6464v0.b0(sVar, f6Var, aVar, lVar, nVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y0.f148833a, null, y2.m.b(1329294336, true, new er.r() { // from class: or3.u0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return C6464v0.e0(sVar, f6Var, nVar, aVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d1.f148639a, null, y2.m.b(1922783007, true, new er.r() { // from class: or3.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return C6464v0.h0(sVar, nVar, f6Var, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, x0.f148825a, null, y2.m.b(-1778695618, true, new er.r() { // from class: or3.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return C6464v0.k0(sVar, f6Var, nVar, aVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, f1.f148662a, null, y2.m.b(-1185206947, true, new er.r() { // from class: or3.q
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return C6464v0.n0(sVar, f6Var, nVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, g1.f148672a, null, y2.m.b(-591718276, true, new er.r() { // from class: or3.r
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return C6464v0.q0(sVar, nVar, f6Var, aVar, lVar, (f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, e1.f148648a, new g0.Dialog(null, 1, null), y2.m.b(1770395, true, new er.r() { // from class: or3.p0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return C6464v0.T(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(n nVar, e0 e0Var, y0 y0Var, Bundle bundle) {
        nVar.P4(y0Var.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(final s sVar, final f6 f6Var, final n nVar, final er.a aVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(999494074, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:100)");
        }
        boolean z15 = N(f6Var).getNewVisitState() == ss3.a.NEW_VISIT;
        if (!z15) {
            rVar.X(-1558866101);
            c60.b.b(rVar, 0);
            rVar.R();
        } else {
            if (!z15) {
                rVar.X(-1558866428);
                rVar.R();
                throw new oq.p();
            }
            rVar.X(-1080110665);
            androidx.p016lifecycle.y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
            if (y0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ms3.p pVar = (ms3.p) q7.d.c(q0.c(ms3.p.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
            xw.b<ms3.b> bVarY1 = pVar.Y1();
            boolean zG = rVar.G(sVar) | rVar.W(f6Var) | rVar.G(nVar) | rVar.W(aVar) | rVar.W(lVar);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                l lVar2 = new l() { // from class: or3.v
                    @Override // er.l
                    public final Object b(Object obj) {
                        return C6464v0.S(sVar, lVar, f6Var, nVar, aVar, (b) obj);
                    }
                };
                rVar.v(lVar2);
                objE = lVar2;
            }
            f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
            ms3.i.h(pVar, rVar, 0);
            rVar.R();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(s sVar, l lVar, f6 f6Var, n nVar, er.a aVar, ms3.b bVar) {
        if (bVar instanceof ms3.b.ToChooseDepartment) {
            y0 y0Var = y0.f148833a;
            SummaryData summaryDataB = SummaryData.b(N(f6Var), null, null, null, 0, ((ms3.b.ToChooseDepartment) bVar).getTopic(), null, false, null, null, null, 943, null);
            nVar.A7(summaryDataB);
            i0 i0Var = i0.f148189a;
            s.l(sVar, y0Var, summaryDataB, null, 4, null);
        } else if (bVar instanceof ms3.b.ToChooseInternationalTopic) {
            b1 b1Var = b1.f148623a;
            ms3.b.ToChooseInternationalTopic toChooseInternationalTopic = (ms3.b.ToChooseInternationalTopic) bVar;
            SummaryData summaryDataB2 = SummaryData.b(N(f6Var), null, null, null, 0, toChooseInternationalTopic.getTopic(), toChooseInternationalTopic.getAlternativeTopicId(), false, null, null, null, 975, null);
            nVar.A7(summaryDataB2);
            i0 i0Var2 = i0.f148189a;
            s.l(sVar, b1Var, summaryDataB2, null, 4, null);
        } else if (bVar instanceof ms3.b.ToChooseDate) {
            x0 x0Var = x0.f148825a;
            SummaryData summaryDataB3 = SummaryData.b(N(f6Var), null, null, null, 0, ((ms3.b.ToChooseDate) bVar).getTopic(), null, false, null, null, null, 815, null);
            nVar.A7(summaryDataB3);
            i0 i0Var3 = i0.f148189a;
            s.l(sVar, x0Var, summaryDataB3, null, 4, null);
        } else if (bVar instanceof ms3.b.ShowDialog) {
            s.l(sVar, e1.f148648a, ((ms3.b.ShowDialog) bVar).getNavigationDialogModel(), null, 4, null);
        } else if (bVar instanceof ms3.b.a) {
            M(aVar, sVar, f6Var);
        } else {
            if (!(bVar instanceof ms3.b.Error)) {
                throw new oq.p();
            }
            lVar.b(((ms3.b.Error) bVar).getError());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1770395, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:405)");
        }
        e1 e1Var = e1.f148648a;
        f00.r.r(wVar, e1Var, sVar.g(e1Var), y2.m.d(182699248, true, new er.q() { // from class: or3.w
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return C6464v0.U(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(182699248, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:409)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: or3.m0
                @Override // er.l
                public final Object b(Object obj) {
                    return C6464v0.V(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(s sVar, cb4.f.a aVar) {
        if (!t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W(final s sVar, n nVar, f6 f6Var, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-451171677, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:155)");
        }
        androidx.p016lifecycle.y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ks3.f fVar2 = (ks3.f) q7.d.c(q0.c(ks3.f.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<ks3.a> bVarY1 = fVar2.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: or3.z
                @Override // er.l
                public final Object b(Object obj) {
                    return C6464v0.X(sVar, (ks3.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        nVar.A7(SummaryData.b(N(f6Var), null, null, null, 0, null, null, false, null, null, null, 639, null));
        e.e(fVar2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(s sVar, ks3.a aVar) {
        if (aVar instanceof ks3.a.C2724a) {
            s.m(sVar, z0.f148837a, null, 2, null);
        } else {
            if (!(aVar instanceof ks3.a.b)) {
                throw new oq.p();
            }
            s.m(sVar, a1.f148619a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(final s sVar, final f6 f6Var, final er.a aVar, final l lVar, final n nVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(142316994, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:181)");
        }
        f00.r.n(wVar, q0.c(is3.e.class), y2.m.d(1262804848, true, new er.q() { // from class: or3.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return C6464v0.Z(sVar, f6Var, aVar, lVar, nVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y2.m.d(-492969893, true, new er.q() { // from class: or3.u
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return C6464v0.a0(f6Var, (is3.e) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z(s sVar, f6 f6Var, er.a aVar, l lVar, n nVar, d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1262804848, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:184)");
        }
        boolean zW = rVar.W(f6Var) | rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new a(aVar, sVar, f6Var);
            rVar.v(objE);
        }
        I(dVar, sVar, (er.a) ((g) objE), lVar, nVar, N(f6Var), rVar, (i15 & 14) | (s.f54562e << 3));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a0(f6 f6Var, is3.e eVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-492969893, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:194)");
        }
        ZusEVisitDepartment department = N(f6Var).getDepartment();
        if (department != null) {
            eVar.p9(department);
        }
        hs3.a chooseInternationalRadioButtonId = N(f6Var).getChooseInternationalRadioButtonId();
        if (chooseInternationalRadioButtonId != null) {
            eVar.q9(chooseInternationalRadioButtonId);
        }
        is3.b.b(eVar, rVar, i15 & 14);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b0(final s sVar, final f6 f6Var, final er.a aVar, final l lVar, final n nVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(735805665, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:208)");
        }
        f00.r.n(wVar, q0.c(js3.e.class), y2.m.d(1856293519, true, new er.q() { // from class: or3.a0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return C6464v0.c0(sVar, f6Var, aVar, lVar, nVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y2.m.d(2141594258, true, new er.q() { // from class: or3.b0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return C6464v0.d0(f6Var, (js3.e) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c0(s sVar, f6 f6Var, er.a aVar, l lVar, n nVar, d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1856293519, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:211)");
        }
        boolean zW = rVar.W(f6Var) | rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new b(aVar, sVar, f6Var);
            rVar.v(objE);
        }
        I(dVar, sVar, (er.a) ((g) objE), lVar, nVar, N(f6Var), rVar, (i15 & 14) | (s.f54562e << 3));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d0(f6 f6Var, js3.e eVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2141594258, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:221)");
        }
        ZusEVisitDepartment department = N(f6Var).getDepartment();
        if (department != null) {
            eVar.p9(department);
        }
        hs3.a chooseInternationalRadioButtonId = N(f6Var).getChooseInternationalRadioButtonId();
        if (chooseInternationalRadioButtonId != null) {
            eVar.q9(chooseInternationalRadioButtonId);
        }
        js3.b.b(eVar, rVar, i15 & 14);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e0(final s sVar, final f6 f6Var, final n nVar, final er.a aVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1329294336, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:235)");
        }
        f00.r.o(wVar, q0.c(o.class), sVar.g(y0.f148833a), y2.m.d(-2076447825, true, new er.q() { // from class: or3.c0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return C6464v0.f0(sVar, f6Var, nVar, aVar, lVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f148651a.h(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f0(final s sVar, final f6 f6Var, final n nVar, final er.a aVar, final l lVar, d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2076447825, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:241)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(f6Var) | rVar.G(nVar) | rVar.W(aVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            l lVar2 = new l() { // from class: or3.n0
                @Override // er.l
                public final Object b(Object obj) {
                    return C6464v0.g0(sVar, lVar, f6Var, nVar, aVar, (ds3.a.e) obj);
                }
            };
            rVar.v(lVar2);
            objE = lVar2;
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g0(s sVar, l lVar, f6 f6Var, n nVar, er.a aVar, ds3.a.e eVar) {
        if (eVar instanceof ds3.a.e.EnterDate) {
            x0 x0Var = x0.f148825a;
            SummaryData summaryDataB = SummaryData.b(N(f6Var), null, null, null, 0, null, null, false, ((ds3.a.e.EnterDate) eVar).getDepartment(), null, null, 895, null);
            nVar.A7(summaryDataB);
            i0 i0Var = i0.f148189a;
            s.l(sVar, x0Var, summaryDataB, null, 4, null);
        } else if (eVar instanceof ds3.a.e.C1003a) {
            M(aVar, sVar, f6Var);
        } else if (eVar instanceof ds3.a.e.Error) {
            lVar.b(((ds3.a.e.Error) eVar).getError());
        } else {
            if (!(eVar instanceof ds3.a.e.EnterDepartmentSelect)) {
                throw new oq.p();
            }
            s.l(sVar, d1.f148639a, ((ds3.a.e.EnterDepartmentSelect) eVar).getSetupData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h0(final s sVar, final n nVar, final f6 f6Var, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1922783007, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:267)");
        }
        f00.r.o(wVar, q0.c(ps3.q.class), sVar.g(d1.f148639a), y2.m.d(-1482959154, true, new er.q() { // from class: or3.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return C6464v0.i0(sVar, nVar, f6Var, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f148651a.g(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i0(final s sVar, final n nVar, final f6 f6Var, d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1482959154, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:273)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(nVar) | rVar.W(f6Var);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: or3.i0
                @Override // er.l
                public final Object b(Object obj) {
                    return C6464v0.j0(sVar, nVar, f6Var, (ps3.a.d) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j0(s sVar, n nVar, f6 f6Var, ps3.a.d dVar) {
        if (dVar instanceof ps3.a.d.C4005a) {
            sVar.c();
        } else {
            if (!(dVar instanceof ps3.a.d.SelectDepartment)) {
                throw new oq.p();
            }
            ps3.a.d.SelectDepartment selectDepartment = (ps3.a.d.SelectDepartment) dVar;
            nVar.A7(SummaryData.b(N(f6Var), null, null, null, 0, null, null, false, selectDepartment.getDepartment(), null, null, 895, null));
            int i15 = c.f148797a[selectDepartment.getScreenExitType().ordinal()];
            if (i15 == 1) {
                sVar.c();
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                sVar.j(x0.f148825a, N(f6Var), d1.f148639a);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k0(final s sVar, final f6 f6Var, final n nVar, final er.a aVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1778695618, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:304)");
        }
        f00.r.o(wVar, q0.c(z.class), sVar.g(x0.f148825a), y2.m.d(-889470483, true, new er.q() { // from class: or3.d0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return C6464v0.l0(sVar, f6Var, nVar, aVar, lVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f148651a.f(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l0(final s sVar, final f6 f6Var, final n nVar, final er.a aVar, final l lVar, d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-889470483, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:310)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(f6Var) | rVar.G(nVar) | rVar.W(aVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            l lVar2 = new l() { // from class: or3.l0
                @Override // er.l
                public final Object b(Object obj) {
                    return C6464v0.m0(sVar, aVar, lVar, f6Var, nVar, (as3.b) obj);
                }
            };
            rVar.v(lVar2);
            objE = lVar2;
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m0(s sVar, er.a aVar, l lVar, f6 f6Var, n nVar, as3.b bVar) {
        if (bVar instanceof as3.b.EnterPersonalData) {
            f1 f1Var = f1.f148662a;
            as3.b.EnterPersonalData enterPersonalData = (as3.b.EnterPersonalData) bVar;
            SummaryData summaryDataB = SummaryData.b(N(f6Var), null, null, enterPersonalData.getTerm(), enterPersonalData.getHourIndex(), null, null, false, null, null, null, 1011, null);
            nVar.A7(summaryDataB);
            i0 i0Var = i0.f148189a;
            s.l(sVar, f1Var, new SetupData(summaryDataB.getPersonalData()), null, 4, null);
        } else if (bVar instanceof as3.b.a) {
            M(aVar, sVar, f6Var);
        } else if (bVar instanceof as3.b.ShowExitDialog) {
            s.l(sVar, e1.f148648a, ((as3.b.ShowExitDialog) bVar).getNavigationDialogModel(), null, 4, null);
        } else if (bVar instanceof as3.b.C0312b) {
            aVar.a();
        } else {
            if (!(bVar instanceof as3.b.Error)) {
                throw new oq.p();
            }
            lVar.b(((as3.b.Error) bVar).getError());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n0(final s sVar, final f6 f6Var, final n nVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1185206947, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:344)");
        }
        f00.r.o(wVar, q0.c(ts3.t.class), sVar.g(f1.f148662a), y2.m.d(-295981812, true, new er.q() { // from class: or3.x
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return C6464v0.o0(sVar, f6Var, nVar, lVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f148651a.j(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o0(final s sVar, final f6 f6Var, final n nVar, final l lVar, d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-295981812, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:350)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(f6Var) | rVar.G(nVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: or3.k0
                @Override // er.l
                public final Object b(Object obj) {
                    return C6464v0.p0(sVar, lVar, f6Var, nVar, (ts3.a.m) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p0(s sVar, l lVar, f6 f6Var, n nVar, ts3.a.m mVar) {
        if (mVar instanceof ts3.a.m.GoToSummary) {
            g1 g1Var = g1.f148672a;
            SummaryData summaryDataB = SummaryData.b(N(f6Var), null, null, null, 0, null, null, false, null, null, ((ts3.a.m.GoToSummary) mVar).getPersonalData(), 511, null);
            nVar.A7(summaryDataB);
            i0 i0Var = i0.f148189a;
            s.l(sVar, g1Var, new ws3.SetupData(summaryDataB), null, 4, null);
        } else {
            if (!(mVar instanceof ts3.a.m.C5013a)) {
                throw new oq.p();
            }
            lVar.b(((ts3.a.m.C5013a) mVar).a());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q0(final s sVar, final n nVar, final f6 f6Var, final er.a aVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-591718276, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:372)");
        }
        f00.r.o(wVar, q0.c(v.class), sVar.g(g1.f148672a), y2.m.d(297506859, true, new er.q() { // from class: or3.e0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return C6464v0.r0(nVar, sVar, f6Var, aVar, lVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f148651a.i(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r0(final n nVar, final s sVar, final f6 f6Var, final er.a aVar, final l lVar, d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(297506859, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.NewVisitWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewVisitWizardNavContent.kt:378)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(nVar) | rVar.G(sVar) | rVar.W(f6Var) | rVar.W(aVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            l lVar2 = new l() { // from class: or3.h0
                @Override // er.l
                public final Object b(Object obj) {
                    return C6464v0.s0(nVar, sVar, lVar, f6Var, aVar, (c) obj);
                }
            };
            rVar.v(lVar2);
            objE = lVar2;
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s0(n nVar, s sVar, l lVar, f6 f6Var, er.a aVar, ws3.c cVar) {
        if (cVar instanceof ws3.c.GoToSuccess) {
            nVar.I8(((ws3.c.GoToSuccess) cVar).getBookedData());
        } else if (cVar instanceof ws3.c.e) {
            s.l(sVar, x0.f148825a, N(f6Var), null, 4, null);
        } else if (cVar instanceof ws3.c.a) {
            M(aVar, sVar, f6Var);
        } else if (cVar instanceof ws3.c.Error) {
            lVar.b(((ws3.c.Error) cVar).getError());
        } else {
            if (!t.c(cVar, ws3.c.d.f214924a)) {
                throw new oq.p();
            }
            nVar.f7();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t0(er.a aVar, l lVar, n nVar, int i15, r rVar, int i16) {
        L(aVar, lVar, nVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
