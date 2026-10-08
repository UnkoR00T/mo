package m70;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.g1;
import c5.r;
import d1.r3;
import er.l;
import f3.m;
import fr.w;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mx.Label;
import n4.v;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.j0;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p046f2.vb;
import p047f5.a0;
import p047f5.e0;
import p047f5.f0;
import p047f5.g0;
import p047f5.p;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import p076m2.x5;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lm70/a;", "data", "Loq/i0;", "g", "(Lm70/a;Lm2/r;I)V", "", "isNotLast", "Lm70/b;", "timelineItemData", "d", "(ZLm70/b;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;"}, k = 3, mv = {2, 2, 0})
    public static final class a implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a3 f124027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f124028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f124029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f124030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a3 f124031e;

        /* JADX INFO: renamed from: m70.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 2, 0})
        static final class C3037a extends w implements l<a2.a, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f124032b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f124033c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f124034d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3037a(a0 a0Var, List list, Map map) {
                super(1);
                this.f124032b = a0Var;
                this.f124033c = list;
                this.f124034d = map;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
                c(aVar);
                return i0.f148189a;
            }

            public final void c(a2.a aVar) {
                this.f124032b.h(aVar, this.f124033c, this.f124034d);
            }
        }

        public a(a3 a3Var, a0 a0Var, p pVar, int i15, a3 a3Var2) {
            this.f124027a = a3Var;
            this.f124028b = a0Var;
            this.f124029c = pVar;
            this.f124030d = i15;
            this.f124031e = a3Var2;
        }

        @Override // p036e4.w0
        public final x0 e(y0 y0Var, List<? extends v0> list, long j15) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f124027a.getValue();
            long jI = this.f124028b.i(j15, y0Var.getLayoutDirection(), this.f124029c, list, linkedHashMap, this.f124030d);
            this.f124031e.getValue();
            return y0.j2(y0Var, r.g(jI), r.f(jI), null, new C3037a(this.f124028b, list, linkedHashMap), 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a3 f124035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f124036c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a3 a3Var, p pVar) {
            super(0);
            this.f124035b = a3Var;
            this.f124036c = pVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            a3 a3Var = this.f124035b;
            a3Var.setValue(Boolean.valueOf(!((Boolean) a3Var.getValue()).booleanValue()));
            this.f124036c.j(true);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln4/i0;", "Loq/i0;", "c", "(Ln4/i0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends w implements l<n4.i0, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f124037b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a0 a0Var) {
            super(1);
            this.f124037b = a0Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
            c(i0Var);
            return i0.f148189a;
        }

        public final void c(n4.i0 i0Var) {
            e0.a(i0Var, this.f124037b);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends w implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a3 f124038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.l f124039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.a f124040d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f124041e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f124042f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f124043g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ TimelineItemData f124044h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f124045j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f124046k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a3 a3Var, p047f5.l lVar, er.a aVar, boolean z15, float f15, float f16, TimelineItemData timelineItemData, float f17, float f18) {
            super(2);
            this.f124038b = a3Var;
            this.f124039c = lVar;
            this.f124040d = aVar;
            this.f124041e = z15;
            this.f124042f = f15;
            this.f124043g = f16;
            this.f124044h = timelineItemData;
            this.f124045j = f17;
            this.f124046k = f18;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            char c15;
            p076m2.r rVar2 = rVar;
            if ((i15 & 3) == 2 && rVar2.i()) {
                rVar2.O();
                return;
            }
            if (t.k()) {
                t.o(1200550679, i15, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
            }
            this.f124038b.setValue(i0.f148189a);
            int helpersHashCode = this.f124039c.getHelpersHashCode();
            this.f124039c.f();
            p047f5.l lVar = this.f124039c;
            rVar2.X(260163910);
            f5.l.b bVarJ = lVar.j();
            p047f5.f fVarA = bVarJ.a();
            p047f5.f fVarE = bVarJ.e();
            p047f5.f fVarF = bVarJ.f();
            p047f5.f fVarG = bVarJ.g();
            p047f5.f fVarH = bVarJ.h();
            p047f5.f fVarI = bVarJ.i();
            m.Companion companion = m.INSTANCE;
            boolean zW = rVar2.W(fVarF);
            Object objE = rVar2.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new e(fVarF);
                rVar2.v(objE);
            }
            d40.h.f(lVar.h(companion, fVarA, (l) objE), new d40.b.C0864b(null, jz.a.R1, d40.i.m.f39716e, C3038f.f124048a, null, null, 33, null), false, rVar2, 0, 4);
            if (this.f124041e) {
                rVar2.X(260636690);
                boolean zW2 = rVar2.W(fVarA) | rVar2.b(this.f124042f);
                Object objE2 = rVar2.E();
                if (zW2 || objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new g(fVarA, this.f124042f);
                    rVar2.v(objE2);
                }
                m mVarH = lVar.h(companion, fVarE, (l) objE2);
                k70.a aVar = k70.a.f108864a;
                int i16 = k70.a.f108865b;
                c15 = 49454;
                vb.k(mVarH, aVar.b(rVar2, i16).getStrokeWidth(), aVar.a(rVar2, i16).getNeutral().a(), rVar2, 0, 0);
                rVar2 = rVar2;
            } else {
                c15 = 49454;
                rVar2.X(257933614);
            }
            rVar2.R();
            boolean zW3 = rVar2.W(fVarA) | rVar2.b(this.f124043g);
            Object objE3 = rVar2.E();
            if (zW3 || objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = new h(fVarA, this.f124043g);
                rVar2.v(objE3);
            }
            m mVarH2 = lVar.h(companion, fVarF, (l) objE3);
            Label label = this.f124044h.getLabel();
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(mVarH2, null, label, null, null, aVar2.a(rVar2, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i17).d(), null, null, false, true, null, rVar, 0, 0, 3072, 24641498);
            boolean zW4 = rVar.W(fVarF) | rVar.b(this.f124045j);
            Object objE4 = rVar.E();
            if (zW4 || objE4 == p076m2.r.INSTANCE.a()) {
                objE4 = new i(fVarF, this.f124045j);
                rVar.v(objE4);
            }
            j70.h.g(lVar.h(companion, fVarG, (l) objE4), null, this.f124044h.getTitle(), null, null, aVar2.a(rVar, i17).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).a(), null, null, false, true, null, rVar, 0, 0, 3072, 24641498);
            boolean zW5 = rVar.W(fVarG) | rVar.b(this.f124045j) | rVar.W(this.f124044h);
            Object objE5 = rVar.E();
            if (zW5 || objE5 == p076m2.r.INSTANCE.a()) {
                objE5 = new j(fVarG, this.f124045j, this.f124044h);
                rVar.v(objE5);
            }
            j70.h.g(lVar.h(companion, fVarH, (l) objE5), null, this.f124044h.getDescription(), null, null, aVar2.a(rVar, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).d(), null, null, false, true, null, rVar, 0, 0, 3072, 24641498);
            if (this.f124041e) {
                rVar.X(262842216);
                m mVarI = androidx.compose.foundation.layout.d.i(companion, this.f124046k);
                boolean zW6 = rVar.W(fVarH);
                Object objE6 = rVar.E();
                if (zW6 || objE6 == p076m2.r.INSTANCE.a()) {
                    objE6 = new k(fVarH);
                    rVar.v(objE6);
                }
                r3.a(lVar.h(mVarI, fVarI, (l) objE6), rVar, 0);
            } else {
                rVar.X(257933614);
            }
            rVar.R();
            rVar.R();
            if (this.f124039c.getHelpersHashCode() != helpersHashCode) {
                Function0.g(this.f124040d, rVar, 6);
            }
            if (t.k()) {
                t.n();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f124047a;

        e(p047f5.f fVar) {
            this.f124047a = fVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), this.f124047a.getTop(), 0.0f, 0.0f, 6, null);
            p047f5.w.a(eVar.getBottom(), this.f124047a.getBottom(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getStart(), eVar.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }
    }

    /* JADX INFO: renamed from: m70.f$f, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3038f implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3038f f124048a = new C3038f();

        C3038f() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-1515416531);
            if (t.k()) {
                t.o(-1515416531, i15, -1, "pl.gov.coi.common.ui.timeline.TimeLineItemComponent.<anonymous>.<anonymous> (Timeline.kt:72)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g implements l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f124049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f124050b;

        g(p047f5.f fVar, float f15) {
            this.f124049a = fVar;
            this.f124050b = f15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), this.f124049a.getBottom(), this.f124050b, 0.0f, 4, null);
            p047f5.w.a(eVar.getBottom(), eVar.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getStart(), this.f124049a.getStart(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getEnd(), this.f124049a.getEnd(), 0.0f, 0.0f, 6, null);
            eVar.o(p047f5.t.INSTANCE.a());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h implements l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f124051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f124052b;

        h(p047f5.f fVar, float f15) {
            this.f124051a = fVar;
            this.f124052b = f15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), eVar.getParent().getTop(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getStart(), this.f124051a.getEnd(), this.f124052b, 0.0f, 4, null);
            f0.b(eVar.getEnd(), eVar.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            eVar.q(p047f5.t.INSTANCE.a());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i implements l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f124053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f124054b;

        i(p047f5.f fVar, float f15) {
            this.f124053a = fVar;
            this.f124054b = f15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            f0.b(eVar.getStart(), this.f124053a.getStart(), 0.0f, 0.0f, 6, null);
            p047f5.w.a(eVar.getTop(), this.f124053a.getBottom(), this.f124054b, 0.0f, 4, null);
            f0.b(eVar.getEnd(), eVar.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            eVar.q(p047f5.t.INSTANCE.a());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j implements l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f124055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f124056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TimelineItemData f124057c;

        j(p047f5.f fVar, float f15, TimelineItemData timelineItemData) {
            this.f124055a = fVar;
            this.f124056b = f15;
            this.f124057c = timelineItemData;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            f0.b(eVar.getStart(), this.f124055a.getStart(), 0.0f, 0.0f, 6, null);
            p047f5.w.a(eVar.getTop(), this.f124055a.getBottom(), this.f124056b, 0.0f, 4, null);
            f0.b(eVar.getEnd(), eVar.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            eVar.q(p047f5.t.INSTANCE.a());
            eVar.p((this.f124057c.getDescription() == null || fu.r.t0(this.f124057c.getDescription().getText())) ? g0.INSTANCE.a() : g0.INSTANCE.b());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k implements l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f124058a;

        k(p047f5.f fVar) {
            this.f124058a = fVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), this.f124058a.getBottom(), 0.0f, 0.0f, 6, null);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void d(boolean z15, final TimelineItemData timelineItemData, p076m2.r rVar, final int i15) {
        int i16;
        final boolean z16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-668911445);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(timelineItemData) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-668911445, i16, -1, "pl.gov.coi.common.ui.timeline.TimeLineItemComponent (Timeline.kt:46)");
            }
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            float spacing100 = aVar.b(rVarH, i17).getSpacing100();
            float spacing25 = aVar.b(rVarH, i17).getSpacing25();
            float spacing200 = aVar.b(rVarH, i17).getSpacing200();
            float spacing250 = aVar.b(rVarH, i17).getSpacing250();
            m mVarH = androidx.compose.foundation.layout.d.h(m.INSTANCE, 0.0f, 1, null);
            boolean z17 = (i16 & 112) == 32;
            Object objE = rVarH.E();
            if (z17 || objE == p076m2.r.INSTANCE.a()) {
                objE = new l() { // from class: m70.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.e(timelineItemData, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            m mVarD = v.d(mVarH, false, (l) objE, 1, null);
            rVarH.X(-1003410150);
            rVarH.X(212064437);
            rVarH.R();
            c5.d dVar = (c5.d) rVarH.N(g1.f());
            Object objE2 = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE2 == companion.a()) {
                objE2 = new a0(dVar);
                rVarH.v(objE2);
            }
            a0 a0Var = (a0) objE2;
            Object objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                objE3 = new p047f5.l();
                rVarH.v(objE3);
            }
            p047f5.l lVar = (p047f5.l) objE3;
            Object objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = c6.e(Boolean.FALSE, null, 2, null);
                rVarH.v(objE4);
            }
            a3 a3Var = (a3) objE4;
            Object objE5 = rVarH.E();
            if (objE5 == companion.a()) {
                objE5 = new p(lVar);
                rVarH.v(objE5);
            }
            p pVar = (p) objE5;
            Object objE6 = rVarH.E();
            if (objE6 == companion.a()) {
                objE6 = x5.i(i0.f148189a, x5.k());
                rVarH.v(objE6);
            }
            a3 a3Var2 = (a3) objE6;
            boolean zG = rVarH.G(a0Var) | rVarH.c(257);
            Object objE7 = rVarH.E();
            if (zG || objE7 == companion.a()) {
                objE7 = new a(a3Var2, a0Var, pVar, 257, a3Var);
                rVarH.v(objE7);
            }
            w0 w0Var = (w0) objE7;
            Object objE8 = rVarH.E();
            if (objE8 == companion.a()) {
                objE8 = new b(a3Var, pVar);
                rVarH.v(objE8);
            }
            er.a aVar2 = (er.a) objE8;
            boolean zG2 = rVarH.G(a0Var);
            Object objE9 = rVarH.E();
            if (zG2 || objE9 == companion.a()) {
                objE9 = new c(a0Var);
                rVarH.v(objE9);
            }
            m mVarD2 = v.d(mVarD, false, (l) objE9, 1, null);
            d dVar2 = new d(a3Var2, lVar, aVar2, z15, spacing100, spacing200, timelineItemData, spacing25, spacing250);
            z16 = z15;
            rVar2 = rVarH;
            j0.a(mVarD2, y2.m.d(1200550679, true, dVar2, rVarH, 54), w0Var, rVar2, 48, 0);
            rVar2.R();
            if (t.k()) {
                t.n();
            }
        } else {
            z16 = z15;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m70.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.f(z16, timelineItemData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(TimelineItemData timelineItemData, n4.i0 i0Var) {
        String text;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(timelineItemData.getLabel().getText());
        Label.Companion companion = Label.INSTANCE;
        sb5.append(companion.d().getText());
        sb5.append(timelineItemData.getTitle().getText());
        sb5.append(companion.d().getText());
        Label description = timelineItemData.getDescription();
        if (description == null || (text = description.getText()) == null) {
            text = companion.c().getText();
        }
        sb5.append(text);
        n4.f0.c0(i0Var, sb5.toString());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(boolean z15, TimelineItemData timelineItemData, int i15, p076m2.r rVar, int i16) {
        d(z15, timelineItemData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final TimelineData timelineData, p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(990396608);
        int i16 = (i15 & 6) == 0 ? (rVarH.G(timelineData) ? 4 : 2) | i15 : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(990396608, i16, -1, "pl.gov.coi.common.ui.timeline.Timeline (Timeline.kt:31)");
            }
            m.Companion companion = m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, companion);
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
            rVarH.X(-565023374);
            int i17 = 0;
            for (Object obj : timelineData.a()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    pq.v.x();
                }
                d(i17 < timelineData.a().size() - 1, (TimelineItemData) obj, rVarH, 0);
                i17 = i18;
            }
            rVarH.R();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m70.c
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return f.h(timelineData, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(TimelineData timelineData, int i15, p076m2.r rVar, int i16) {
        g(timelineData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
