package dp3;

import android.graphics.Bitmap;
import androidx.compose.ui.platform.g1;
import b30.AccordionData;
import d1.d3;
import d1.m3;
import d1.q3;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l60.AccordionSection;
import n3.l0;
import n4.v;
import n50.SingleCardConfig;
import n50.h0;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.j0;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p047f5.a0;
import p047f5.e0;
import p047f5.f0;
import p047f5.t;
import p047f5.w;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.x5;
import p088nul.q0;
import t70.s;
import u4.FontWeight;
import w0.i1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Ldp3/c;", "viewModel", "Loq/i0;", "g", "(Ldp3/c;Lm2/r;I)V", "Ldp3/c$a$b;", "data", "d", "(Ldp3/c$a$b;Lm2/r;I)V", "Ldp3/c$a;", "state", "verification_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f43724a;

        a(p047f5.f fVar) {
            this.f43724a = fVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            w.a(eVar.getTop(), eVar.getParent().getTop(), 0.0f, 0.0f, 6, null);
            w.a(eVar.getBottom(), this.f43724a.getTop(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getStart(), eVar.getParent().getStart(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getEnd(), eVar.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            eVar.o(t.INSTANCE.a());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f43725a = new b();

        b() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            w.a(eVar.getBottom(), eVar.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getStart(), eVar.getParent().getStart(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getEnd(), eVar.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.a<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ dp3.c.a.Initialized f43726a;

        c(dp3.c.a.Initialized initialized) {
            this.f43726a = initialized;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float a() {
            return Float.valueOf(this.f43726a.getTimerProgress());
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;"}, k = 3, mv = {2, 2, 0})
    public static final class d implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a3 f43727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f43728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.p f43729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f43730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a3 f43731e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends fr.w implements er.l<a2.a, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f43732b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f43733c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f43734d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a0 a0Var, List list, Map map) {
                super(1);
                this.f43732b = a0Var;
                this.f43733c = list;
                this.f43734d = map;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
                c(aVar);
                return i0.f148189a;
            }

            public final void c(a2.a aVar) {
                this.f43732b.h(aVar, this.f43733c, this.f43734d);
            }
        }

        public d(a3 a3Var, a0 a0Var, p047f5.p pVar, int i15, a3 a3Var2) {
            this.f43727a = a3Var;
            this.f43728b = a0Var;
            this.f43729c = pVar;
            this.f43730d = i15;
            this.f43731e = a3Var2;
        }

        @Override // p036e4.w0
        public final x0 e(y0 y0Var, List<? extends v0> list, long j15) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f43727a.getValue();
            long jI = this.f43728b.i(j15, y0Var.getLayoutDirection(), this.f43729c, list, linkedHashMap, this.f43730d);
            this.f43731e.getValue();
            return y0.j2(y0Var, c5.r.g(jI), c5.r.f(jI), null, new a(this.f43728b, list, linkedHashMap), 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 2, 0})
    static final class e extends fr.w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a3 f43735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.p f43736c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a3 a3Var, p047f5.p pVar) {
            super(0);
            this.f43735b = a3Var;
            this.f43736c = pVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            a3 a3Var = this.f43735b;
            a3Var.setValue(Boolean.valueOf(!((Boolean) a3Var.getValue()).booleanValue()));
            this.f43736c.j(true);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln4/i0;", "Loq/i0;", "c", "(Ln4/i0;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends fr.w implements er.l<n4.i0, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f43737b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a0 a0Var) {
            super(1);
            this.f43737b = a0Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
            c(i0Var);
            return i0.f148189a;
        }

        public final void c(n4.i0 i0Var) {
            e0.a(i0Var, this.f43737b);
        }
    }

    /* JADX INFO: renamed from: dp3.g$g, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 2, 0})
    public static final class C0985g extends fr.w implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a3 f43738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.l f43739c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.a f43740d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d3 f43741e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ dp3.c.a.Initialized f43742f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f43743g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f43744h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f43745j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0985g(a3 a3Var, p047f5.l lVar, er.a aVar, d3 d3Var, dp3.c.a.Initialized initialized, float f15, float f16, float f17) {
            super(2);
            this.f43738b = a3Var;
            this.f43739c = lVar;
            this.f43740d = aVar;
            this.f43741e = d3Var;
            this.f43742f = initialized;
            this.f43743g = f15;
            this.f43744h = f16;
            this.f43745j = f17;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            int i16;
            SingleCardConfig singleCardConfig;
            f3.m.Companion companion;
            p047f5.l lVar;
            k70.a aVar;
            p047f5.f fVar;
            p076m2.r rVar2;
            int i17;
            int i18;
            p076m2.r rVar3 = rVar;
            if ((i15 & 3) == 2 && rVar3.i()) {
                rVar3.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1200550679, i15, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
            }
            this.f43738b.setValue(i0.f148189a);
            int helpersHashCode = this.f43739c.getHelpersHashCode();
            this.f43739c.f();
            p047f5.l lVar2 = this.f43739c;
            rVar3.X(-1706051198);
            f5.l.b bVarJ = lVar2.j();
            p047f5.f fVarA = bVarJ.a();
            p047f5.f fVarE = bVarJ.e();
            f3.m.Companion companion2 = f3.m.INSTANCE;
            boolean zW = rVar3.W(fVarE);
            Object objE = rVar3.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(fVarE);
                rVar3.v(objE);
            }
            f3.m mVarN = s.n(t70.i.S(d1.a3.l(lVar2.h(companion2, fVarA, (er.l) objE), this.f43741e), null, rVar3, 0, 1), rVar3, 0);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion3.k(), rVar3, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar3, 0));
            p076m2.e0 e0VarT = rVar3.t();
            f3.m mVarE = f3.j.e(rVar3, mVarN);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVar3.l() == null) {
                p076m2.m.d();
            }
            rVar3.K();
            if (rVar3.getInserting()) {
                rVar3.H(aVarB);
            } else {
                rVar3.u();
            }
            p076m2.r rVarC = n6.c(rVar3);
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Bitmap image = this.f43742f.getImage();
            if (image == null) {
                rVar3.X(665521831);
                rVar3.R();
                companion = companion2;
                singleCardConfig = null;
                i16 = 0;
            } else {
                rVar3.X(665521832);
                i16 = 0;
                singleCardConfig = null;
                companion = companion2;
                i1.g(l0.c(image), null, k3.f.a(androidx.compose.foundation.layout.d.y(androidx.compose.foundation.layout.d.i(companion2, this.f43743g), this.f43744h), l1.h.f(this.f43745j)), null, p036e4.l.INSTANCE.b(), 0.0f, null, 0, rVar, 24624, 232);
                rVar3 = rVar;
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar3, k70.a.f108865b).getSpacing300()), rVar3, 0);
                rVar3.R();
            }
            h0.v(this.f43742f.getStatusData(), singleCardConfig, rVar3, i16, 2);
            k70.a aVar2 = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar3, i19).getSpacing300()), rVar3, i16);
            m30.i.d(this.f43742f.getCardListData(), null, null, rVar3, 0, 6);
            AccordionSection accordionSection = this.f43742f.getAccordionSection();
            if (accordionSection == null) {
                rVar3.X(666154727);
                rVar3.R();
                rVar2 = rVar3;
                aVar = aVar2;
                i17 = i19;
                i18 = i16;
                lVar = lVar2;
                fVar = fVarE;
            } else {
                rVar3.X(666154728);
                r3.a(androidx.compose.foundation.layout.d.t(companion, aVar2.b(rVar3, i19).getSpacing300()), rVar3, i16);
                lVar = lVar2;
                aVar = aVar2;
                fVar = fVarE;
                j70.h.g(null, null, accordionSection.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar3, i19).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                i17 = i19;
                companion = companion;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.t(companion, aVar.b(rVar2, i17).getSpacing150()), rVar2, 0);
                b30.j.g(accordionSection.getData(), rVar2, AccordionData.f16343b);
                rVar2.R();
            }
            rVar2.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, i18);
            f3.m.Companion companion5 = companion;
            f3.m mVarN2 = s.n(w0.i.d(companion5, aVar.a(rVar2, i17).getBase().a(), null, 2, null), rVar2, i18);
            Object objE2 = rVar2.E();
            p076m2.r.Companion companion6 = p076m2.r.INSTANCE;
            if (objE2 == companion6.a()) {
                objE2 = b.f43725a;
                rVar2.v(objE2);
            }
            f3.m mVarH = lVar.h(mVarN2, fVar, (er.l) objE2);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion3.k(), rVar2, i18);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, i18));
            p076m2.e0 e0VarT2 = rVar2.t();
            f3.m mVarE2 = f3.j.e(rVar2, mVarH);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB2);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC2 = n6.c(rVar2);
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar.b(rVar2, i17).getSpacing200()), rVar2, i18);
            f3.m mVarH2 = androidx.compose.foundation.layout.d.h(companion5, 0.0f, 1, null);
            boolean zG = rVar2.G(this.f43742f);
            Object objE3 = rVar2.E();
            if (zG || objE3 == companion6.a()) {
                objE3 = new c(this.f43742f);
                rVar2.v(objE3);
            }
            p076m2.r rVar4 = rVar2;
            k60.c.c(mVarH2, (er.a) objE3, 0, 0L, rVar4, 6, 12);
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar.b(rVar4, i17).getSpacing200()), rVar4, i18);
            f3.m mVarH3 = androidx.compose.foundation.layout.d.h(companion5, 0.0f, 1, null);
            w0 w0VarB = m3.b(iVar.e(), companion3.l(), rVar4, 6);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar4, i18));
            p076m2.e0 e0VarT3 = rVar4.t();
            f3.m mVarE3 = f3.j.e(rVar4, mVarH3);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
            if (rVar4.l() == null) {
                p076m2.m.d();
            }
            rVar4.K();
            if (rVar4.getInserting()) {
                rVar4.H(aVarB3);
            } else {
                rVar4.u();
            }
            p076m2.r rVarC3 = n6.c(rVar4);
            n6.i(rVarC3, w0VarB, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            q3 q3Var = q3.f39261a;
            int i25 = i17;
            j70.h.g(null, null, this.f43742f.getTimerLabel(), null, null, aVar.a(rVar4, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar4, i17).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.y(companion5, aVar.b(rVar, i25).getSpacing25()), rVar, 0);
            j70.h.g(null, null, this.f43742f.getTimeLeftLabel(), null, null, aVar.a(rVar, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, FontWeight.INSTANCE.a(), null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i25).d(), null, null, false, false, null, rVar, 100663296, 0, 0, 33029851);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar.b(rVar, i25).getSpacing200()), rVar, 0);
            h30.q.p(this.f43742f.getCloseButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            rVar.R();
            if (this.f43739c.getHelpersHashCode() != helpersHashCode) {
                Function0.g(this.f43740d, rVar, 6);
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
    }

    public static final void d(final dp3.c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1897683862);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1897683862, i16, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.verificationdetails.VerificationDetailScreenContent (VerificationDetailsScreen.kt:57)");
            }
            final float fN = c5.h.n(125);
            final float fN2 = c5.h.n(168);
            final float fN3 = c5.h.n(12);
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1711156221, true, new er.q() { // from class: dp3.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return g.e(initialized, fN2, fN, fN3, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, initialized.getCloseButtonData().h(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: dp3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.f(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(dp3.c.a.Initialized initialized, float f15, float f16, float f17, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1711156221, i16, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.verificationdetails.VerificationDetailScreenContent.<anonymous> (VerificationDetailsScreen.kt:66)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
            rVar.X(-1003410150);
            rVar.X(212064437);
            rVar.R();
            c5.d dVar = (c5.d) rVar.N(g1.f());
            Object objE = rVar.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new a0(dVar);
                rVar.v(objE);
            }
            a0 a0Var = (a0) objE;
            Object objE2 = rVar.E();
            if (objE2 == companion.a()) {
                objE2 = new p047f5.l();
                rVar.v(objE2);
            }
            p047f5.l lVar = (p047f5.l) objE2;
            Object objE3 = rVar.E();
            if (objE3 == companion.a()) {
                objE3 = c6.e(Boolean.FALSE, null, 2, null);
                rVar.v(objE3);
            }
            a3 a3Var = (a3) objE3;
            Object objE4 = rVar.E();
            if (objE4 == companion.a()) {
                objE4 = new p047f5.p(lVar);
                rVar.v(objE4);
            }
            p047f5.p pVar = (p047f5.p) objE4;
            Object objE5 = rVar.E();
            if (objE5 == companion.a()) {
                objE5 = x5.i(i0.f148189a, x5.k());
                rVar.v(objE5);
            }
            a3 a3Var2 = (a3) objE5;
            boolean zG = rVar.G(a0Var) | rVar.c(257);
            Object objE6 = rVar.E();
            if (zG || objE6 == companion.a()) {
                Object dVar2 = new d(a3Var2, a0Var, pVar, 257, a3Var);
                rVar.v(dVar2);
                objE6 = dVar2;
            }
            w0 w0Var = (w0) objE6;
            Object objE7 = rVar.E();
            if (objE7 == companion.a()) {
                objE7 = new e(a3Var, pVar);
                rVar.v(objE7);
            }
            er.a aVar = (er.a) objE7;
            boolean zG2 = rVar.G(a0Var);
            Object objE8 = rVar.E();
            if (zG2 || objE8 == companion.a()) {
                objE8 = new f(a0Var);
                rVar.v(objE8);
            }
            j0.a(v.d(mVarF, false, (er.l) objE8, 1, null), y2.m.d(1200550679, true, new C0985g(a3Var2, lVar, aVar, d3Var, initialized, f15, f16, f17), rVar, 54), w0Var, rVar, 48, 0);
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(dp3.c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        d(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final dp3.c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(851300856);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(851300856, i16, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.verificationdetails.VerificationDetailsScreen (VerificationDetailsScreen.kt:45)");
            }
            dp3.c.a aVarH = h(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarH instanceof dp3.c.a.C0984a) {
                rVarH.X(2056343484);
                rVarH.R();
            } else {
                if (!(aVarH instanceof dp3.c.a.Initialized)) {
                    rVarH.X(2056341141);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(2056345508);
                d((dp3.c.a.Initialized) aVarH, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: dp3.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.i(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final dp3.c.a h(f6<? extends dp3.c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(dp3.c cVar, int i15, p076m2.r rVar, int i16) {
        g(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
