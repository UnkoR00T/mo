package ur3;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import d1.r3;
import f1.q0;
import i50.BaseScaffoldData;
import java.util.List;
import n50.h0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a1\u0010\u001e\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006!²\u0006\f\u0010 \u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lur3/c;", "viewModel", "Loq/i0;", "y", "(Lur3/c;Lm2/r;I)V", "Lur3/c$a;", "data", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "onSnackBarHidden", "C", "(Lur3/c$a;Li70/p;Ler/a;Lm2/r;I)V", "Lur3/c$a$a;", "screenData", "r", "(Lur3/c$a$a;Li70/p;Ler/a;Lm2/r;I)V", "Lwr3/b;", "Lc30/b;", "alertDataWebBrowsers", "E", "(Lwr3/b;Lc30/b;Lm2/r;I)V", "Lwr3/b$a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lwr3/b$a;Lc30/b;Lm2/r;I)V", "alertData", "p", "(Lc30/b;Lm2/r;I)V", "", "Lwr3/a;", "G", "(Ljava/util/List;Lc30/b;Lc30/b;Lm2/r;I)V", "state", "zusvisit_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, ur3.c.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((ur3.c) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f200531a;

        public b(List list) {
            this.f200531a = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            this.f200531a.get(i15);
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.r<f1.e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f200532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f200533b;

        public c(List list, List list2) {
            this.f200532a = list;
            this.f200533b = list2;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            p076m2.r rVar2 = rVar;
            if ((i16 & 6) == 0) {
                i17 = i16 | (rVar2.W(eVar) ? 4 : 2);
            } else {
                i17 = i16;
            }
            if ((i16 & 48) == 0) {
                i17 |= rVar2.c(i15) ? 32 : 16;
            }
            if (!rVar2.r((i17 & 147) != 146, i17 & 1)) {
                rVar2.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(2039820996, i17, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            wr3.a aVar = (wr3.a) this.f200532a.get(i15);
            rVar2.X(1823630044);
            if (aVar instanceof wr3.a.Header) {
                rVar2.X(1823671304);
                if (i15 != 0) {
                    rVar2.X(1823688881);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing100()), rVar2, 0);
                } else {
                    rVar2.X(1817266797);
                }
                rVar2.R();
                f3.m.Companion companion = f3.m.INSTANCE;
                k70.a aVar2 = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                j70.h.g(a3.r(companion, 0.0f, 0.0f, 0.0f, aVar2.b(rVar2, i18).getSpacing200(), 7, null), null, ((wr3.a.Header) aVar).getLabel(), null, null, aVar2.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).h(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
                rVar2 = rVar;
                rVar2.R();
            } else {
                if (!(aVar instanceof wr3.a.ZusVisit)) {
                    rVar2.X(-495362553);
                    rVar2.R();
                    throw new oq.p();
                }
                rVar2.X(1824123749);
                h0.v(((wr3.a.ZusVisit) aVar).getSingleCardData(), null, rVar2, 0, 2);
                if (i15 != this.f200533b.size() - 1) {
                    rVar2.X(1824248369);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing100()), rVar2, 0);
                } else {
                    rVar2.X(1817266797);
                }
                rVar2.R();
                rVar2.R();
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f200534a;

        static {
            int[] iArr = new int[y30.n.Switch.EnumC5973b.values().length];
            try {
                iArr[y30.n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y30.n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f200534a = iArr;
        }
    }

    private static final i70.p A(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(ur3.c cVar, int i15, p076m2.r rVar, int i16) {
        y(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void C(final ur3.c.a aVar, final i70.p pVar, final er.a<i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1199359046);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar2) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1199359046, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.myvisits.MyVisitsScreenContent (MyVisitsScreen.kt:63)");
            }
            if (aVar instanceof ur3.c.a.b) {
                rVarH.X(1532813642);
                rVarH.R();
            } else {
                if (!(aVar instanceof ur3.c.a.DisplayedScreenData)) {
                    rVarH.X(1532812206);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1532815583);
                r((ur3.c.a.DisplayedScreenData) aVar, pVar, aVar2, rVarH, i16 & 1022);
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
            d5VarM.a(new er.p() { // from class: ur3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.D(aVar, pVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(ur3.c.a aVar, i70.p pVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        C(aVar, pVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void E(final wr3.b bVar, final c30.b bVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1394236603);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(bVar2) : rVarH.G(bVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1394236603, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.myvisits.VisitsContent (MyVisitsScreen.kt:132)");
            }
            if (bVar instanceof wr3.b.Empty) {
                rVarH.X(-168416214);
                L((wr3.b.Empty) bVar, bVar2, rVarH, (i16 & 112) | (i16 & 14) | (c30.b.f22944i << 3));
                rVarH.R();
            } else {
                if (!(bVar instanceof wr3.b.Visits)) {
                    rVarH.X(-168417607);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-168411566);
                wr3.b.Visits visits = (wr3.b.Visits) bVar;
                List<wr3.a> listB = visits.b();
                c30.b alertData = visits.getAlertData();
                int i17 = c30.b.f22944i;
                G(listB, alertData, bVar2, rVarH, ((i16 << 3) & 896) | (i17 << 6) | (i17 << 3));
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
            d5VarM.a(new er.p() { // from class: ur3.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.F(bVar, bVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(wr3.b bVar, c30.b bVar2, int i15, p076m2.r rVar, int i16) {
        E(bVar, bVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void G(final List<? extends wr3.a> list, final c30.b bVar, final c30.b bVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(409363688);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(list) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(bVar2) : rVarH.G(bVar2) ? 256 : 128;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(409363688, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.myvisits.VisitsListContent (MyVisitsScreen.kt:172)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
            d3 d3VarI = a3.i(0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100(), 0.0f, i50.s.N(), 5, null);
            boolean z16 = (i16 & 112) == 32 || ((i16 & 64) != 0 && rVarH.G(bVar));
            if ((i16 & 896) == 256 || ((i16 & 512) != 0 && rVarH.G(bVar2))) {
                z15 = true;
            }
            boolean zG = z16 | z15 | rVarH.G(list);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ur3.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.H(bVar, bVar2, list, (q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(mVarF, null, d3VarI, false, null, null, null, false, null, (er.l) objE, rVarH, 6, 506);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ur3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.K(list, bVar, bVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(final c30.b bVar, final c30.b bVar2, List list, q0 q0Var) {
        if (bVar != null) {
            q0.c(q0Var, null, null, y2.m.b(-21698990, true, new er.q() { // from class: ur3.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.I(bVar, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        if (bVar2 != null) {
            q0.c(q0Var, null, null, y2.m.b(120641723, true, new er.q() { // from class: ur3.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.J(bVar2, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        q0Var.j(list.size(), null, new b(list), y2.m.b(2039820996, true, new c(list, list)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(c30.b bVar, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-21698990, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.myvisits.VisitsListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyVisitsScreen.kt:182)");
            }
            c30.e.c(a3.r(f3.m.INSTANCE, 0.0f, 0.0f, 0.0f, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100(), 7, null), bVar, rVar, c30.b.f22944i << 3, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(c30.b bVar, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(120641723, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.myvisits.VisitsListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyVisitsScreen.kt:192)");
            }
            p(bVar, rVar, c30.b.f22944i);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(List list, c30.b bVar, c30.b bVar2, int i15, p076m2.r rVar, int i16) {
        G(list, bVar, bVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void L(final wr3.b.Empty empty, final c30.b bVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-856990542);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(empty) : rVarH.G(empty) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-856990542, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.myvisits.VisitsListEmptyContent (MyVisitsScreen.kt:150)");
            }
            p(bVar, rVarH, ((i16 >> 3) & 14) | c30.b.f22944i);
            q40.i.b(empty.a(), null, null, rVarH, IconPageData.f164667h, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ur3.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.M(empty, bVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(wr3.b.Empty empty, c30.b bVar, int i15, p076m2.r rVar, int i16) {
        L(empty, bVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void p(final c30.b bVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1739138654);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1739138654, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.myvisits.AlertWebBrowsers (MyVisitsScreen.kt:156)");
            }
            if (bVar == null) {
                rVarH.X(-489086704);
            } else {
                rVarH.X(-489086703);
                c30.e.c(a3.r(f3.m.INSTANCE, 0.0f, 0.0f, 0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100(), 7, null), bVar, rVarH, ((i16 << 3) & 112) | (c30.b.f22944i << 3), 0);
            }
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ur3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.q(bVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(c30.b bVar, int i15, p076m2.r rVar, int i16) {
        p(bVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void r(final ur3.c.a.DisplayedScreenData displayedScreenData, final i70.p pVar, final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2136663213);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(displayedScreenData) : rVarH.G(displayedScreenData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        int i17 = i16;
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2136663213, i17, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.myvisits.MyVisitsDisplayed (MyVisitsScreen.kt:77)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, aVar, null, null, rVarH, (i17 & 112) | 6 | (i17 & 896), 24);
            i50.s.r(displayedScreenData.getBaseScaffoldData(), null, y2.m.d(-767113437, true, new er.p() { // from class: ur3.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.s(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(321002010, true, new er.q() { // from class: ur3.l
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.t(displayedScreenData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(displayedScreenData));
            Object objE2 = rVarH.E();
            if (z15 || objE2 == companion.a()) {
                objE2 = new er.a() { // from class: ur3.m
                    @Override // er.a
                    public final Object a() {
                        return s.w(displayedScreenData);
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
            d5VarM.a(new er.p() { // from class: ur3.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.x(displayedScreenData, pVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-767113437, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.myvisits.MyVisitsDisplayed.<anonymous> (MyVisitsScreen.kt:87)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(ur3.c.a.DisplayedScreenData displayedScreenData, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(321002010, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.myvisits.MyVisitsDisplayed.<anonymous> (MyVisitsScreen.kt:91)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            Object objE = rVar.E();
            p076m2.r.Companion companion2 = p076m2.r.INSTANCE;
            if (objE == companion2.a()) {
                objE = new er.l() { // from class: ur3.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.u((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = n4.v.d(mVarL, false, (er.l) objE, 1, null);
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion3.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarI, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.x xVar = d1.x.f39368a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(companion, aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = d1.e0.a(iVar.k(), companion3.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarP);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
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
            n6.i(rVarC2, w0VarA, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarP2 = a3.p(companion, 0.0f, aVar.b(rVar, i17).getSpacing100(), 1, null);
            Object objE2 = rVar.E();
            if (objE2 == companion2.a()) {
                objE2 = new er.l() { // from class: ur3.p
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.v((n4.i0) obj);
                    }
                };
                rVar.v(objE2);
            }
            f3.m mVarD2 = n4.v.d(mVarP2, false, (er.l) objE2, 1, null);
            w0 w0VarB = m3.b(iVar.j(), companion3.l(), rVar, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarD2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB3);
            } else {
                rVar.u();
            }
            p076m2.r rVarC3 = n6.c(rVar);
            n6.i(rVarC3, w0VarB, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            q3 q3Var = q3.f39261a;
            y30.m.g(displayedScreenData.getControllersData(), rVar, y30.n.Switch.f223693f);
            rVar.x();
            int i18 = d.f200534a[displayedScreenData.getControllersData().getSelectedItemType().ordinal()];
            if (i18 == 1) {
                rVar.X(1505069162);
                E(displayedScreenData.getBookedVisits(), displayedScreenData.getAlertDataWebBrowsersInfo(), rVar, c30.b.f22944i << 3);
                rVar.R();
                i0 i0Var2 = i0.f148189a;
            } else {
                if (i18 != 2) {
                    rVar.X(1505066301);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(1505075436);
                E(displayedScreenData.getFinishedVisits(), displayedScreenData.getAlertDataWebBrowsersInfo(), rVar, c30.b.f22944i << 3);
                rVar.R();
                i0 i0Var3 = i0.f148189a;
            }
            rVar.x();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(n4.i0 i0Var) {
        n4.f0.H0(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(n4.i0 i0Var) {
        n4.f0.H0(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(ur3.c.a.DisplayedScreenData displayedScreenData) {
        displayedScreenData.f().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(ur3.c.a.DisplayedScreenData displayedScreenData, i70.p pVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        r(displayedScreenData, pVar, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void y(final ur3.c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2146501597);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2146501597, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.myvisits.MyVisitsScreen (MyVisitsScreen.kt:45)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(cVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            oz.l.b(cVar.getLifecycleConnector(), rVarH, 0);
            ur3.c.a aVarZ = z(f6VarC);
            i70.p pVarA = A(f6VarB);
            if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(cVar))) {
                z15 = false;
            }
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(cVar);
                rVarH.v(objE);
            }
            C(aVarZ, pVarA, (er.a) ((mr.g) objE), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ur3.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.B(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ur3.c.a z(f6<? extends ur3.c.a> f6Var) {
        return f6Var.getValue();
    }
}
