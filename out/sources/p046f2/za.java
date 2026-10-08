package p046f2;

import a4.k0;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d1.d3;
import d1.i;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.x;
import er.p;
import er.q;
import f3.j;
import f3.m;
import h2.h1;
import ju.p0;
import n4.f0;
import n4.v;
import oq.i0;
import oq.u;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p076m2.x5;
import p114t0.v0;
import p143z0.Function1;
import p143z0.a2;
import p143z0.d1;
import p3.f;
import q4.TextStyle;
import tq.e;
import u0.c0;
import u0.l;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0017¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lf2/za;", "Lf2/kj;", "<init>", "()V", "Lf2/lj;", "Loq/i0;", "a", "(Lf2/lj;Lm2/r;I)V", "Landroidx/compose/ui/graphics/Color;", "targetColor", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class za implements kj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final za f58473a = new za();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58474a = new a();

        a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, e<? super i0> eVar) {
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "", "velocity", "Loq/i0;", "<anonymous>", "(Lju/p0;F)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements q<p0, Float, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f58475e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ float f58476f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ lj f58477g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(lj ljVar, e<? super b> eVar) {
            super(3, eVar);
            this.f58477g = ljVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f58475e;
            if (i15 == 0) {
                u.b(obj);
                float f15 = this.f58476f;
                yr state = this.f58477g.getScrollBehavior().getState();
                c0<Float> c0VarC = this.f58477g.getScrollBehavior().c();
                l<Float> lVarD = this.f58477g.getScrollBehavior().d();
                this.f58475e = 1;
                if (Function0.R(state, f15, c0VarC, lVarD, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        public final Object M(p0 p0Var, float f15, e<? super i0> eVar) {
            b bVar = new b(this.f58477g, eVar);
            bVar.f58476f = f15;
            return bVar.J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(p0 p0Var, Float f15, e<? super i0> eVar) {
            return M(p0Var, f15.floatValue(), eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements er.a<Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ lj f58478a;

        c(lj ljVar) {
            this.f58478a = ljVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ Color a() {
            return Color.m0boximpl(c());
        }

        public final long c() {
            yr state;
            ur scrollBehavior = this.f58478a.getScrollBehavior();
            return this.f58478a.getColors().a(((scrollBehavior == null || (state = scrollBehavior.getState()) == null) ? 0.0f : state.k()) > 0.01f ? 1.0f : 0.0f);
        }
    }

    private za() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(za zaVar, lj ljVar, int i15, r rVar, int i16) {
        zaVar.a(ljVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final long j(f6<Color> f6Var) {
        return f6Var.getValue().m20unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(lj ljVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1658896622, i15, -1, "androidx.compose.material3.DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar.<anonymous> (AppBar.kt:2811)");
            }
            i.e eVarF = i.f39152a.f();
            f3.c.InterfaceC1317c interfaceC1317cI = f3.c.INSTANCE.i();
            q<p3, r, Integer, i0> qVarA = ljVar.a();
            m.Companion companion = m.INSTANCE;
            w0 w0VarB = m3.b(eVarF, interfaceC1317cI, rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, companion);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            qVarA.w(q3.f39261a, rVar, 6);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(lj ljVar, float f15) {
        yr state = ljVar.getScrollBehavior().getState();
        state.n(state.i() + f15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(f6 f6Var, f fVar) {
        long jM20unboximpl = ((Color) f6Var.getValue()).m20unboximpl();
        if (!Color.m11equalsimpl0(jM20unboximpl, Color.INSTANCE.h())) {
            f.c2(fVar, jM20unboximpl, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(n4.i0 i0Var) {
        f0.H0(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float o(lj ljVar) {
        yr state;
        ur scrollBehavior = ljVar.getScrollBehavior();
        if (scrollBehavior == null || (state = scrollBehavior.getState()) == null) {
            return 0.0f;
        }
        return state.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float p() {
        return 1.0f;
    }

    @Override // p046f2.kj
    public void a(final lj ljVar, r rVar, final int i15) {
        int i16;
        m mVarG;
        r rVarH = rVar.h(2137486921);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(ljVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(2137486921, i16, -1, "androidx.compose.material3.DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar (AppBar.kt:2785)");
            }
            if (Float.isNaN(ljVar.getExpandedHeight()) || (Float.floatToRawIntBits(ljVar.getExpandedHeight()) & Integer.MAX_VALUE) >= 2139095040) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            boolean zW = rVarH.W(ljVar.getColors()) | rVarH.W(ljVar.getScrollBehavior());
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = x5.d(new c(ljVar));
                rVarH.v(objE);
            }
            final f6<Color> f6VarA = v0.a(j((f6) objE), of.b(l2.k0.DefaultEffects, rVarH, 6), null, null, rVarH, 0, 12);
            y2.f fVarD = y2.m.d(-1658896622, true, new p() { // from class: f2.sa
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return za.k(ljVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54);
            if (ljVar.getScrollBehavior() == null || ljVar.getScrollBehavior().getIsPinned()) {
                rVarH.X(690075377);
                rVarH.R();
                mVarG = m.INSTANCE;
            } else {
                rVarH.X(689460399);
                m.Companion companion = m.INSTANCE;
                a2 a2Var = a2.Vertical;
                int i17 = i16 & 14;
                boolean z15 = i17 == 4;
                Object objE2 = rVarH.E();
                if (z15 || objE2 == r.INSTANCE.a()) {
                    objE2 = new er.l() { // from class: f2.ta
                        @Override // er.l
                        public final Object b(Object obj) {
                            return za.l(ljVar, ((Float) obj).floatValue());
                        }
                    };
                    rVarH.v(objE2);
                }
                d1 d1VarH = Function1.h((er.l) objE2, rVarH, 0);
                boolean z16 = i17 == 4;
                Object objE3 = rVarH.E();
                if (z16 || objE3 == r.INSTANCE.a()) {
                    objE3 = new b(ljVar, null);
                    rVarH.v(objE3);
                }
                mVarG = Function1.g(companion, d1VarH, a2Var, false, null, false, null, (q) objE3, false, 188, null);
                rVarH.R();
            }
            m mVarU = ljVar.getModifier().u(mVarG);
            boolean zW2 = rVarH.W(f6VarA);
            Object objE4 = rVarH.E();
            if (zW2 || objE4 == r.INSTANCE.a()) {
                objE4 = new er.l() { // from class: f2.ua
                    @Override // er.l
                    public final Object b(Object obj) {
                        return za.m(f6VarA, (f) obj);
                    }
                };
                rVarH.v(objE4);
            }
            m mVarB = k3.k.b(mVarU, (er.l) objE4);
            Object objE5 = rVarH.E();
            r.Companion companion2 = r.INSTANCE;
            if (objE5 == companion2.a()) {
                objE5 = new er.l() { // from class: f2.va
                    @Override // er.l
                    public final Object b(Object obj) {
                        return za.n((n4.i0) obj);
                    }
                };
                rVarH.v(objE5);
            }
            m mVarD = v.d(mVarB, false, (er.l) objE5, 1, null);
            i0 i0Var = i0.f148189a;
            Object objE6 = rVarH.E();
            if (objE6 == companion2.a()) {
                objE6 = a.f58474a;
                rVarH.v(objE6);
            }
            m mVarC = a4.w0.c(mVarD, i0Var, (PointerInputEventHandler) objE6);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarC);
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
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            x xVar = x.f39368a;
            m mVarM = Function0.M(k3.f.b(d1.g4.c(m.INSTANCE, ljVar.getWindowInsets())), ljVar.getScrollBehavior());
            boolean z17 = (i16 & 14) == 4;
            Object objE7 = rVarH.E();
            if (z17 || objE7 == companion2.a()) {
                objE7 = new h1() { // from class: f2.wa
                    @Override // h2.h1
                    public final float a() {
                        return za.o(ljVar);
                    }
                };
                rVarH.v(objE7);
            }
            h1 h1Var = (h1) objE7;
            long navigationIconContentColor = ljVar.getColors().getNavigationIconContentColor();
            long titleContentColor = ljVar.getColors().getTitleContentColor();
            long actionIconContentColor = ljVar.getColors().getActionIconContentColor();
            long subtitleContentColor = ljVar.getColors().getSubtitleContentColor();
            p<r, Integer, i0> pVarJ = ljVar.j();
            TextStyle titleTextStyle = ljVar.getTitleTextStyle();
            p<r, Integer, i0> pVarH = ljVar.h();
            TextStyle subtitleTextStyle = ljVar.getSubtitleTextStyle();
            i.f fVarE = i.f39152a.e();
            f3.c.b titleHorizontalAlignment = ljVar.getTitleHorizontalAlignment();
            p<r, Integer, i0> pVarF = ljVar.f();
            float expandedHeight = ljVar.getExpandedHeight();
            d3 contentPadding = ljVar.getContentPadding();
            Object objE8 = rVarH.E();
            if (objE8 == companion2.a()) {
                objE8 = new er.a() { // from class: f2.xa
                    @Override // er.a
                    public final Object a() {
                        return Float.valueOf(za.p());
                    }
                };
                rVarH.v(objE8);
            }
            Function0.z(mVarM, h1Var, navigationIconContentColor, titleContentColor, subtitleContentColor, actionIconContentColor, pVarJ, titleTextStyle, pVarH, subtitleTextStyle, (er.a) objE8, fVarE, titleHorizontalAlignment, 0, false, pVarF, fVarD, expandedHeight, contentPadding, rVarH, 0, 1600566);
            rVarH = rVarH;
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.ya
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return za.i(this.f58343a, ljVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
