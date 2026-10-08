package as3;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import cs3.CarouselSegmentData;
import cs3.SelectedTermSegmentData;
import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import d1.r3;
import f1.b1;
import f1.q0;
import f1.y0;
import java.util.Iterator;
import java.util.List;
import ju.p0;
import mx.Label;
import n3.y2;
import n4.f0;
import n4.g0;
import n50.h0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.c2;
import p046f2.x1;
import p046f2.y1;
import p046f2.z1;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u000e\u001a!\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a=\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010!\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020 2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0003¢\u0006\u0004\b!\u0010\"\"\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Las3/f;", "viewModel", "Loq/i0;", "y", "(Las3/f;Lm2/r;I)V", "Las3/f$a;", "screenData", "s", "(Las3/f$a;Lm2/r;I)V", "Las3/f$a$a$a;", "w", "(Las3/f$a$a$a;Lm2/r;I)V", "Las3/f$a$a$b;", "u", "(Las3/f$a$a$b;Lm2/r;I)V", "E", "Lf1/y0;", "selectedTermListState", "B", "(Las3/f$a$a$b;Lf1/y0;Lm2/r;I)V", "Lmx/a;", "freeTermLabel", "Lcs3/a;", "segmentData", "", "termIndex", "", "isSelected", "Lkotlin/Function0;", "onCardClick", "n", "(Lmx/a;Lcs3/a;IZLer/a;Lm2/r;I)V", "Lcs3/b;", "G", "(Lcs3/b;Lf1/y0;Lm2/r;I)V", "Lc5/h;", "a", "F", "CAROUSEL_SEGMENT_MINIMUM_WIDTH", "zusvisit_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f14388a = c5.h.n(134);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.a<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ as3.f.a.InterfaceC0313a.LoadedTerms f14389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f14390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p0 f14391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y0 f14392d;

        /* JADX INFO: renamed from: as3.t$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class C0315a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f14393e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ y0 f14394f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0315a(y0 y0Var, tq.e<? super C0315a> eVar) {
                super(2, eVar);
                this.f14394f = y0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f14393e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    y0 y0Var = this.f14394f;
                    if (y0Var != null) {
                        this.f14393e = 1;
                        if (y0.r(y0Var, 0, 0, this, 2, null) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((C0315a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C0315a(this.f14394f, eVar);
            }
        }

        a(as3.f.a.InterfaceC0313a.LoadedTerms loadedTerms, int i15, p0 p0Var, y0 y0Var) {
            this.f14389a = loadedTerms;
            this.f14390b = i15;
            this.f14391c = p0Var;
            this.f14392d = y0Var;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            this.f14389a.d().b(Integer.valueOf(this.f14390b));
            ju.k.d(this.f14391c, null, null, new C0315a(this.f14392d, null), 3, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f14395a;

        public b(List list) {
            this.f14395a = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            this.f14395a.get(i15);
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.r<f1.e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f14396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ as3.f.a.InterfaceC0313a.LoadedTerms f14397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p0 f14398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y0 f14399d;

        public c(List list, as3.f.a.InterfaceC0313a.LoadedTerms loadedTerms, p0 p0Var, y0 y0Var) {
            this.f14396a = list;
            this.f14397b = loadedTerms;
            this.f14398c = p0Var;
            this.f14399d = y0Var;
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
                p076m2.t.o(2039820996, i17, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            int i18 = i17 & 126;
            CarouselSegmentData carouselSegmentData = (CarouselSegmentData) this.f14396a.get(i15);
            rVar.X(-1779612464);
            Label freeTermLabel = this.f14397b.getFreeTermLabel();
            boolean z15 = i15 == this.f14397b.getSelectedTermIndex();
            boolean zG = rVar.G(this.f14397b) | ((((i17 & 112) ^ 48) > 32 && rVar.c(i15)) || (i17 & 48) == 32) | rVar.G(this.f14398c) | rVar.W(this.f14399d);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(this.f14397b, i15, this.f14398c, this.f14399d);
                rVar.v(objE);
            }
            t.n(freeTermLabel, carouselSegmentData, i15, z15, (er.a) objE, rVar, (i18 << 3) & 896);
            i0 i0Var = i0.f148189a;
            this.f14397b.a().get(i15).getIsVisible();
            rVar.R();
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
    public static final class d implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f14400a = new d();

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(n50.k kVar) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f14401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f14402b;

        public e(er.l lVar, List list) {
            this.f14401a = lVar;
            this.f14402b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f14401a.b(this.f14402b.get(i15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f implements er.r<f1.e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f14403a;

        public f(List list) {
            this.f14403a = list;
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
            n50.k kVar = (n50.k) this.f14403a.get(i15);
            rVar.X(1189936844);
            h0.v(kVar, null, rVar, 0, 2);
            rVar.R();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(as3.f fVar, int i15, p076m2.r rVar, int i16) {
        y(fVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void B(final as3.f.a.InterfaceC0313a.LoadedTerms loadedTerms, final y0 y0Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-288907651);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(loadedTerms) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(y0Var) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-288907651, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.choosedate.ContentCarousel (ChooseDateScreen.kt:152)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = Function0.i(tq.j.f191408a, rVarH);
                rVarH.v(objE);
            }
            final p0 p0Var = (p0) objE;
            d1.i iVar = d1.i.f39152a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            d1.i.f fVarR = iVar.r(aVar.b(rVarH, i17).getSpacing100());
            d3 d3VarI = a3.i(aVar.b(rVarH, i17).getSpacing200(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing300(), 2, null);
            boolean zG = rVarH.G(loadedTerms) | rVarH.G(p0Var) | ((i16 & 112) == 32);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new er.l() { // from class: as3.q
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.C(loadedTerms, p0Var, y0Var, (q0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f1.d.e(null, null, d3VarI, false, fVarR, null, null, false, null, (er.l) objE2, rVarH, 0, 491);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: as3.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.D(loadedTerms, y0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(as3.f.a.InterfaceC0313a.LoadedTerms loadedTerms, p0 p0Var, y0 y0Var, q0 q0Var) {
        List<CarouselSegmentData> listA = loadedTerms.a();
        q0Var.j(listA.size(), null, new b(listA), y2.m.b(2039820996, true, new c(listA, loadedTerms, p0Var, y0Var)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(as3.f.a.InterfaceC0313a.LoadedTerms loadedTerms, y0 y0Var, int i15, p076m2.r rVar, int i16) {
        B(loadedTerms, y0Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void E(final as3.f.a.InterfaceC0313a.LoadedTerms loadedTerms, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1603908900);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(loadedTerms) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1603908900, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.choosedate.ContentHeadline (ChooseDateScreen.kt:135)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(companion, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 2, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarP);
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
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            j70.h.g(null, null, loadedTerms.getHeadline(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).i(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: as3.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.F(loadedTerms, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(as3.f.a.InterfaceC0313a.LoadedTerms loadedTerms, int i15, p076m2.r rVar, int i16) {
        E(loadedTerms, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void G(final SelectedTermSegmentData selectedTermSegmentData, final y0 y0Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1230151158);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(selectedTermSegmentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(y0Var) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1230151158, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.choosedate.SelectedTermSegment (ChooseDateScreen.kt:250)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(companion, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarP);
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
            d1.i0 i0Var = d1.i0.f39176a;
            j70.h.g(null, null, selectedTermSegmentData.getDate(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).h(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            if (y0Var == null) {
                rVarH.X(271655869);
                d1.i.f fVarR = iVar.r(aVar.b(rVarH, i17).getSpacing100());
                f3.m mVarL = a3.l(companion, a3.i(0.0f, aVar.b(rVarH, i17).getSpacing100(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 5, null));
                w0 w0VarA2 = d1.e0.a(fVarR, companion2.k(), rVarH, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, mVarL);
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
                rVarH.X(-359909757);
                Iterator<T> it = selectedTermSegmentData.b().iterator();
                while (it.hasNext()) {
                    h0.v((n50.k) it.next(), null, rVarH, 0, 2);
                }
                rVarH.R();
                rVarH.x();
                rVarH.R();
            } else {
                rVarH.X(272125426);
                d1.i.f fVarR2 = iVar.r(aVar.b(rVarH, i17).getSpacing100());
                d3 d3VarI = a3.i(0.0f, aVar.b(rVarH, i17).getSpacing100(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 5, null);
                boolean zG = rVarH.G(selectedTermSegmentData);
                Object objE = rVarH.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: as3.n
                        @Override // er.l
                        public final Object b(Object obj) {
                            return t.H(selectedTermSegmentData, (q0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                f1.d.c(null, y0Var, d3VarI, false, fVarR2, null, null, false, null, (er.l) objE, rVarH, i16 & 112, 489);
                rVarH.R();
            }
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: as3.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.I(selectedTermSegmentData, y0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(SelectedTermSegmentData selectedTermSegmentData, q0 q0Var) {
        List<n50.k> listB = selectedTermSegmentData.b();
        q0Var.j(listB.size(), null, new e(d.f14400a, listB), y2.m.b(802480018, true, new f(listB)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(SelectedTermSegmentData selectedTermSegmentData, y0 y0Var, int i15, p076m2.r rVar, int i16) {
        G(selectedTermSegmentData, y0Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final Label label, final CarouselSegmentData carouselSegmentData, final int i15, final boolean z15, final er.a<i0> aVar, p076m2.r rVar, final int i16) {
        int i17;
        er.a<i0> aVar2;
        p076m2.r rVarH = rVar.h(427124584);
        if ((i16 & 6) == 0) {
            i17 = (rVarH.W(label) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVarH.W(carouselSegmentData) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.c(i15) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= rVarH.a(z15) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            aVar2 = aVar;
            i17 |= rVarH.G(aVar2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            aVar2 = aVar;
        }
        if (rVarH.r((i17 & 9363) != 9362, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(427124584, i17, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.choosedate.CarouselSegment (ChooseDateScreen.kt:192)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVarH.E();
            p076m2.r.Companion companion2 = p076m2.r.INSTANCE;
            if (objE == companion2.a()) {
                objE = new er.l() { // from class: as3.s
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.o((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarD = n4.v.d(companion, false, (er.l) objE, 1, null);
            boolean z16 = (i17 & 896) == 256;
            Object objE2 = rVarH.E();
            if (z16 || objE2 == companion2.a()) {
                objE2 = new er.l() { // from class: as3.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.p(i15, (n4.i0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f3.m mVarN = androidx.compose.foundation.b.n(androidx.compose.foundation.layout.d.b(n4.v.d(mVarD, false, (er.l) objE2, 1, null), f14388a, 0.0f, 2, null), false, null, null, null, aVar2, 15, null);
            y1 y1Var = y1.f58315a;
            k70.a aVar3 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            long jA = aVar3.a(rVarH, i18).getSurface().a();
            int i19 = y1.f58316b;
            x1 x1VarB = y1Var.b(jA, 0L, 0L, 0L, rVarH, i19 << 12, 14);
            y2 radius150 = aVar3.e(rVarH, i18).getRadius150();
            z1 z1VarC = y1Var.c(aVar3.c(rVarH, i18).getLevel0(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, i19 << 18, 62);
            rVarH = rVarH;
            c2.c(mVarN, radius150, x1VarB, z1VarC, z15 ? w0.x.a(aVar3.b(rVarH, i18).getSpacing25(), aVar3.a(rVarH, i18).getBase().getPrimary()) : null, y2.m.d(-1010869706, true, new er.q() { // from class: as3.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.q(carouselSegmentData, label, (d1.h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 196608, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: as3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.r(label, carouselSegmentData, i15, z15, aVar, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(n4.i0 i0Var) {
        g0.a(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(int i15, n4.i0 i0Var) {
        f0.y0(i0Var, "carouselSegment_" + i15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(CarouselSegmentData carouselSegmentData, Label label, d1.h0 h0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1010869706, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.choosedate.CarouselSegment.<anonymous> (ChooseDateScreen.kt:213)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarO = a3.o(companion, aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing150());
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarO);
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
            j70.h.g(null, null, carouselSegmentData.getDay(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).a(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing50()), rVar, 0);
            j70.h.g(null, null, carouselSegmentData.getDate(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing50()), rVar, 0);
            w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, companion);
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
            j70.h.g(null, null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).f(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            j70.h.g(null, null, carouselSegmentData.getFreeTermsNumber(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).e(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
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
    public static final i0 r(Label label, CarouselSegmentData carouselSegmentData, int i15, boolean z15, er.a aVar, int i16, p076m2.r rVar, int i17) {
        n(label, carouselSegmentData, i15, z15, aVar, rVar, g4.a(i16 | 1));
        return i0.f148189a;
    }

    public static final void s(final as3.f.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1697419031);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1697419031, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.choosedate.ChooseDateContent (ChooseDateScreen.kt:61)");
            }
            if (aVar instanceof as3.f.a.b) {
                rVarH.X(867887853);
                rVarH.R();
            } else {
                if (!(aVar instanceof as3.f.a.InterfaceC0313a)) {
                    rVarH.X(867886372);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(867889811);
                f3.m mVarF = androidx.compose.foundation.layout.d.f(w0.i.d(f3.m.INSTANCE, k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a(), null, 2, null), 0.0f, 1, null);
                w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, mVarF);
                androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
                n6.i(rVarC, w0VarA, companion.d());
                n6.i(rVarC, e0VarT, companion.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                n6.g(rVarC, companion.a());
                n6.i(rVarC, mVarE, companion.e());
                d1.i0 i0Var = d1.i0.f39176a;
                as3.f.a.InterfaceC0313a interfaceC0313a = (as3.f.a.InterfaceC0313a) aVar;
                if (interfaceC0313a instanceof as3.f.a.InterfaceC0313a.Empty) {
                    rVarH.X(-1779942663);
                    w((as3.f.a.InterfaceC0313a.Empty) aVar, rVarH, i16 & 14);
                    rVarH.R();
                } else {
                    if (!(interfaceC0313a instanceof as3.f.a.InterfaceC0313a.LoadedTerms)) {
                        rVarH.X(-1779944821);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(-1779938844);
                    u((as3.f.a.InterfaceC0313a.LoadedTerms) aVar, rVarH, i16 & 14);
                    rVarH.R();
                }
                rVarH.x();
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
            d5VarM.a(new er.p() { // from class: as3.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.t(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(as3.f.a aVar, int i15, p076m2.r rVar, int i16) {
        s(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void u(final as3.f.a.InterfaceC0313a.LoadedTerms loadedTerms, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1610462640);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(loadedTerms) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1610462640, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.choosedate.ChooseDateDisplayedContent (ChooseDateScreen.kt:94)");
            }
            if (((Configuration) rVarH.N(AndroidCompositionLocals_androidKt.b())).orientation == 2) {
                rVarH.X(1787460418);
                f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), null, rVarH, 6, 1);
                w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, mVarS);
                androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
                n6.i(rVarC, w0VarA, companion.d());
                n6.i(rVarC, e0VarT, companion.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                n6.g(rVarC, companion.a());
                n6.i(rVarC, mVarE, companion.e());
                d1.i0 i0Var = d1.i0.f39176a;
                int i17 = i16 & 14;
                E(loadedTerms, rVarH, i17);
                B(loadedTerms, null, rVarH, i17 | 48);
                G(loadedTerms.getSelectedTermSegmentData(), null, rVarH, 48);
                rVarH.x();
                rVarH.R();
            } else {
                rVarH.X(1787864100);
                y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
                f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
                w0 w0VarA2 = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, mVarF);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB2 = companion2.b();
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
                n6.i(rVarC2, w0VarA2, companion2.d());
                n6.i(rVarC2, e0VarT2, companion2.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
                n6.g(rVarC2, companion2.a());
                n6.i(rVarC2, mVarE2, companion2.e());
                d1.i0 i0Var2 = d1.i0.f39176a;
                int i18 = i16 & 14;
                E(loadedTerms, rVarH, i18);
                B(loadedTerms, y0VarC, rVarH, i18);
                G(loadedTerms.getSelectedTermSegmentData(), y0VarC, rVarH, 0);
                rVarH.x();
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
            d5VarM.a(new er.p() { // from class: as3.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.v(loadedTerms, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(as3.f.a.InterfaceC0313a.LoadedTerms loadedTerms, int i15, p076m2.r rVar, int i16) {
        u(loadedTerms, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void w(final as3.f.a.InterfaceC0313a.Empty empty, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(273325526);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(empty) : rVarH.G(empty) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(273325526, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.choosedate.ChooseDateEmpty (ChooseDateScreen.kt:81)");
            }
            f3.m mVarD = w0.i.d(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a(), null, 2, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            q40.i.b(empty.a(), null, null, rVarH, IconPageData.f164667h, 6);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: as3.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.x(empty, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(as3.f.a.InterfaceC0313a.Empty empty, int i15, p076m2.r rVar, int i16) {
        w(empty, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void y(final as3.f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1722912506);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1722912506, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.choosedate.ChooseDateScreen (ChooseDateScreen.kt:52)");
            }
            s(z(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: as3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.A(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final as3.f.a z(f6<? extends as3.f.a> f6Var) {
        return f6Var.getValue();
    }
}
