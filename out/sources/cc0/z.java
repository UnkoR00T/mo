package cc0;

import android.graphics.Bitmap;
import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import o20.BaseDocumentData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcc0/m;", "viewModel", "Loq/i0;", "x", "(Lcc0/m;Lm2/r;I)V", "Lcc0/m$a$c;", "data", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "hideSnackBar", "p", "(Lcc0/m$a$c;Li70/p;Ler/a;Lm2/r;I)V", "B", "(Lcc0/m$a$c;Lm2/r;I)V", "Lcc0/m$a$a;", "m", "(Lcc0/m$a$a;Lm2/r;I)V", "Lcc0/m$a;", "screenState", "familycard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class z {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<oq.i0> {
        a(Object obj) {
            super(0, obj, m.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((m) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25428a = new b();

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(n50.k kVar) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f25429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f25430b;

        public c(er.l lVar, List list) {
            this.f25429a = lVar;
            this.f25430b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f25429a.b(this.f25430b.get(i15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements er.r<f1.e, Integer, p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f25431a;

        public d(List list) {
            this.f25431a = list;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            if ((i16 & 6) == 0) {
                i17 = (rVar.W(eVar) ? 4 : 2) | i16;
            } else {
                i17 = i16;
            }
            if ((i16 & 48) == 0) {
                i17 |= rVar.c(i15) ? 32 : 16;
            }
            if (!rVar.r((i17 & 147) != 146, i17 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(802480018, i17, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            n50.k kVar = (n50.k) this.f25431a.get(i15);
            rVar.X(1670339171);
            n50.h0.v(kVar, null, rVar, 0, 2);
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ oq.i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25432a;

        static {
            int[] iArr = new int[y30.n.Switch.EnumC5973b.values().length];
            try {
                iArr[y30.n.Switch.EnumC5973b.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f25432a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(m mVar, int i15, p076m2.r rVar, int i16) {
        x(mVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void B(final m.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1433732831);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1433732831, i16, -1, "pl.gov.coi.mjunior.feature.familycard.presentation.screen.FamilyMembersListContent (FamilyCardScreen.kt:114)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            d1.i iVar = d1.i.f39152a;
            p036e4.w0 w0VarA = d1.e0.a(iVar.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarF);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            d1.i.f fVarR = iVar.r(aVar.b(rVarH, i17).getSpacing100());
            f3.m mVarF2 = androidx.compose.foundation.layout.d.f(d1.h0.b(i0Var, a3.p(companion, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 2, null), 1.0f, false, 2, null), 0.0f, 1, null);
            d3 d3VarI = a3.i(0.0f, aVar.b(rVarH, i17).getSpacing100(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 5, null);
            boolean zG = rVarH.G(initialized);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: cc0.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return z.C(initialized, (f1.q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(mVarF2, null, d3VarI, false, fVarR, null, null, false, null, (er.l) objE, rVarH, 0, 490);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cc0.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.D(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(m.a.Initialized initialized, f1.q0 q0Var) {
        List<n50.k> listE = initialized.e();
        q0Var.j(listE.size(), null, new c(b.f25428a, listE), y2.m.b(802480018, true, new d(listE)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(m.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        B(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void m(final m.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(389256037);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(389256037, i16, -1, "pl.gov.coi.mjunior.feature.familycard.presentation.screen.ErrorScreen (FamilyCardScreen.kt:139)");
            }
            error.getError().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: cc0.u
                    @Override // er.a
                    public final Object a() {
                        return z.n();
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cc0.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.o(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(m.a.Error error, int i15, p076m2.r rVar, int i16) {
        m(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void p(final m.a.Initialized initialized, final i70.p pVar, final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-235862690);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-235862690, i16, -1, "pl.gov.coi.mjunior.feature.familycard.presentation.screen.FamilyCardInitializedContent (FamilyCardScreen.kt:56)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, aVar, null, null, rVarH, (i16 & 112) | 6 | (i16 & 896), 24);
            g30.t.f(initialized.getBottomSheetData(), 0.0f, false, null, null, y2.m.d(-1923427931, true, new er.p() { // from class: cc0.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.q(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(-1161546620, true, new er.p() { // from class: cc0.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.s(initialized, alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, ModalBottomSheetData.f70192e | 1769472, 30);
            cb4.i dialogVMSAdapter = initialized.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(-17219845);
            } else {
                rVarH.X(969275846);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            boolean zG = rVarH.G(initialized);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new er.a() { // from class: cc0.s
                    @Override // er.a
                    public final Object a() {
                        return z.v(initialized);
                    }
                };
                rVarH.v(objE2);
            }
            p088nul.q0.g(false, (er.a) objE2, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cc0.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.w(initialized, pVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(final m.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1923427931, i15, -1, "pl.gov.coi.mjunior.feature.familycard.presentation.screen.FamilyCardInitializedContent.<anonymous> (FamilyCardScreen.kt:66)");
            }
            Bitmap qrCode = initialized.getBottomSheetContentData().getQrCode();
            Label closeButton = initialized.getBottomSheetContentData().getCloseButton();
            boolean zG = rVar.G(initialized);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: cc0.w
                    @Override // er.a
                    public final Object a() {
                        return z.r(initialized);
                    }
                };
                rVar.v(objE);
            }
            a70.b.b(qrCode, closeButton, (er.a) objE, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(m.a.Initialized initialized) {
        initialized.i().b(Boolean.FALSE);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(final m.a.Initialized initialized, final al alVar, final i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1161546620, i15, -1, "pl.gov.coi.mjunior.feature.familycard.presentation.screen.FamilyCardInitializedContent.<anonymous> (FamilyCardScreen.kt:73)");
            }
            i50.s.r(initialized.getScaffoldData(), null, y2.m.d(-1311057458, true, new er.p() { // from class: cc0.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.t(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-694784969, true, new er.q() { // from class: cc0.y
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return z.u(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1311057458, i15, -1, "pl.gov.coi.mjunior.feature.familycard.presentation.screen.FamilyCardInitializedContent.<anonymous>.<anonymous> (FamilyCardScreen.kt:76)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(m.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-694784969, i16, -1, "pl.gov.coi.mjunior.feature.familycard.presentation.screen.FamilyCardInitializedContent.<anonymous>.<anonymous> (FamilyCardScreen.kt:79)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.d(companion, 0.0f, 1, null), d3Var);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            f3.c.b bVarG = companion2.g();
            d1.i iVar = d1.i.f39152a;
            p036e4.w0 w0VarA = d1.e0.a(iVar.k(), bVarG, rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            y30.n.Switch controllersData = initialized.getControllersData();
            if (controllersData == null) {
                rVar.X(-773257971);
            } else {
                rVar.X(-773257970);
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                f3.m mVarP = a3.p(a3.p(companion, 0.0f, aVar.b(rVar, i17).getSpacing100(), 1, null), aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
                p036e4.w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVar, 0);
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
                n6.i(rVarC2, w0VarB, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                q3 q3Var = q3.f39261a;
                y30.m.g(controllersData, rVar, y30.n.Switch.f223693f);
                rVar.x();
            }
            rVar.R();
            y30.n.Switch controllersData2 = initialized.getControllersData();
            y30.n.Switch.EnumC5973b selectedItemType = controllersData2 != null ? controllersData2.getSelectedItemType() : null;
            if ((selectedItemType == null ? -1 : e.f25432a[selectedItemType.ordinal()]) == 1) {
                rVar.X(1637637094);
                B(initialized, rVar, 0);
                rVar.R();
            } else {
                rVar.X(1637638963);
                o20.i.m(initialized.getScreenData(), rVar, BaseDocumentData.f140741h);
                rVar.R();
            }
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
    public static final oq.i0 v(m.a.Initialized initialized) {
        initialized.f().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(m.a.Initialized initialized, i70.p pVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        p(initialized, pVar, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void x(final m mVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(66894217);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(mVar) : rVarH.G(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(66894217, i16, -1, "pl.gov.coi.mjunior.feature.familycard.presentation.screen.FamilyCardScreen (FamilyCardScreen.kt:35)");
            }
            f6 f6VarC = m7.b.c(mVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(mVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            m.a aVarY = y(f6VarC);
            if (fr.t.c(aVarY, m.a.b.f25238a)) {
                rVarH.X(-139156070);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarY instanceof m.a.Error) {
                rVarH.X(-139154136);
                m((m.a.Error) aVarY, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarY instanceof m.a.Initialized)) {
                    rVarH.X(-139158279);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-139151463);
                m.a.Initialized initialized = (m.a.Initialized) aVarY;
                i70.p pVarZ = z(f6VarB);
                if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(mVar))) {
                    z15 = false;
                }
                Object objE = rVarH.E();
                if (z15 || objE == p076m2.r.INSTANCE.a()) {
                    objE = new a(mVar);
                    rVarH.v(objE);
                }
                p(initialized, pVarZ, (er.a) ((mr.g) objE), rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: cc0.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.A(mVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final m.a y(f6<? extends m.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p z(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }
}
