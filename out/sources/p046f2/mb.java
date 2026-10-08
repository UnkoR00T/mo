package p046f2;

import a4.k0;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.g1;
import c5.d;
import c5.h;
import d1.d3;
import d1.f4;
import d1.i;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.u4;
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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0017¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lf2/mb;", "Lf2/zr;", "<init>", "()V", "Lf2/as;", "Loq/i0;", "a", "(Lf2/as;Lm2/r;I)V", "", "hideTopRowSemantics", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class mb implements zr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mb f56856a = new mb();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f56857a = new a();

        a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, e<? super i0> eVar) {
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements er.a<Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ as f56858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.a<Float> f56859b;

        b(as asVar, er.a<Float> aVar) {
            this.f56858a = asVar;
            this.f56859b = aVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ Color a() {
            return Color.m0boximpl(c());
        }

        public final long c() {
            return this.f56858a.getColors().a(this.f56859b.a().floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "", "velocity", "Loq/i0;", "<anonymous>", "(Lju/p0;F)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends k implements q<p0, Float, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56860e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ float f56861f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ as f56862g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(as asVar, e<? super c> eVar) {
            super(3, eVar);
            this.f56862g = asVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56860e;
            if (i15 == 0) {
                u.b(obj);
                float f15 = this.f56861f;
                yr state = this.f56862g.getScrollBehavior().getState();
                c0<Float> c0VarC = this.f56862g.getScrollBehavior().c();
                l<Float> lVarD = this.f56862g.getScrollBehavior().d();
                this.f56860e = 1;
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
            c cVar = new c(this.f56862g, eVar);
            cVar.f56861f = f15;
            return cVar.J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(p0 p0Var, Float f15, e<? super i0> eVar) {
            return M(p0Var, f15.floatValue(), eVar);
        }
    }

    private mb() {
    }

    private static final boolean m(f6<Boolean> f6Var) {
        return f6Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(as asVar, float f15) {
        yr state = asVar.getScrollBehavior().getState();
        state.n(state.i() + f15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(er.a aVar, f fVar) {
        f.c2(fVar, ((Color) aVar.a()).m20unboximpl(), 0L, 0L, 0.0f, null, null, 0, 126, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(n4.i0 i0Var) {
        f0.H0(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float q() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float r(as asVar) {
        yr state;
        ur scrollBehavior = asVar.getScrollBehavior();
        if (scrollBehavior == null || (state = scrollBehavior.getState()) == null) {
            return 0.0f;
        }
        return state.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(mb mbVar, as asVar, int i15, r rVar, int i16) {
        mbVar.a(asVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float t(as asVar) {
        yr state;
        ur scrollBehavior = asVar.getScrollBehavior();
        if (scrollBehavior == null || (state = scrollBehavior.getState()) == null) {
            return 0.0f;
        }
        return state.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(as asVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1333673671, i15, -1, "androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar.<anonymous> (AppBar.kt:3038)");
            }
            i.e eVarF = i.f39152a.f();
            f3.c.InterfaceC1317c interfaceC1317cI = f3.c.INSTANCE.i();
            q<p3, r, Integer, i0> qVarA = asVar.a();
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
    public static final float v(er.a aVar) {
        return Function0.O().a(((Number) aVar.a()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float w(er.a aVar) {
        return 1.0f - ((Number) aVar.a()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(er.a aVar) {
        return ((Number) aVar.a()).floatValue() < 0.5f;
    }

    @Override // p046f2.zr
    public void a(final as asVar, r rVar, final int i15) {
        int i16;
        final as asVar2;
        r rVar2;
        m mVarG;
        r rVarH = rVar.h(-1640665680);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(asVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1640665680, i16, -1, "androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar (AppBar.kt:3015)");
            }
            if (Float.isNaN(asVar.getCollapsedHeight()) || (Float.floatToRawIntBits(asVar.getCollapsedHeight()) & Integer.MAX_VALUE) >= 2139095040) {
                throw new IllegalArgumentException("The collapsedHeight is expected to be specified and finite");
            }
            if (Float.isNaN(asVar.getExpandedHeight()) || (Float.floatToRawIntBits(asVar.getExpandedHeight()) & Integer.MAX_VALUE) >= 2139095040) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            if (h.l(asVar.getExpandedHeight(), asVar.getCollapsedHeight()) < 0) {
                throw new IllegalArgumentException("The expandedHeight is expected to be greater or equal to the collapsedHeight");
            }
            int iX0 = ((d) rVarH.N(g1.f())).X0(asVar.getTitleBottomPadding());
            int i17 = i16 & 14;
            boolean z15 = i17 == 4;
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: f2.bb
                    @Override // er.a
                    public final Object a() {
                        return Float.valueOf(mb.t(asVar));
                    }
                };
                rVarH.v(objE);
            }
            final er.a aVar = (er.a) objE;
            boolean zW = (i17 == 4) | rVarH.W(aVar);
            Object objE2 = rVarH.E();
            if (zW || objE2 == r.INSTANCE.a()) {
                objE2 = new b(asVar, aVar);
                rVarH.v(objE2);
            }
            final er.a aVar2 = (er.a) objE2;
            y2.f fVarD = y2.m.d(-1333673671, true, new p() { // from class: f2.eb
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return mb.u(asVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54);
            boolean zW2 = rVarH.W(aVar);
            Object objE3 = rVarH.E();
            if (zW2 || objE3 == r.INSTANCE.a()) {
                objE3 = new er.a() { // from class: f2.fb
                    @Override // er.a
                    public final Object a() {
                        return Float.valueOf(mb.v(aVar));
                    }
                };
                rVarH.v(objE3);
            }
            er.a aVar3 = (er.a) objE3;
            boolean zW3 = rVarH.W(aVar);
            Object objE4 = rVarH.E();
            if (zW3 || objE4 == r.INSTANCE.a()) {
                objE4 = new er.a() { // from class: f2.gb
                    @Override // er.a
                    public final Object a() {
                        return Float.valueOf(mb.w(aVar));
                    }
                };
                rVarH.v(objE4);
            }
            er.a aVar4 = (er.a) objE4;
            boolean zW4 = rVarH.W(aVar);
            Object objE5 = rVarH.E();
            if (zW4 || objE5 == r.INSTANCE.a()) {
                objE5 = x5.d(new er.a() { // from class: f2.hb
                    @Override // er.a
                    public final Object a() {
                        return Boolean.valueOf(mb.x(aVar));
                    }
                });
                rVarH.v(objE5);
            }
            f6 f6Var = (f6) objE5;
            boolean z16 = !m(f6Var);
            if (asVar.getScrollBehavior() == null || asVar.getScrollBehavior().getIsPinned()) {
                rVarH.X(-340524694);
                rVarH.R();
                mVarG = m.INSTANCE;
            } else {
                rVarH.X(-341139672);
                m.Companion companion = m.INSTANCE;
                a2 a2Var = a2.Vertical;
                boolean z17 = i17 == 4;
                Object objE6 = rVarH.E();
                if (z17 || objE6 == r.INSTANCE.a()) {
                    objE6 = new er.l() { // from class: f2.ib
                        @Override // er.l
                        public final Object b(Object obj) {
                            return mb.n(asVar, ((Float) obj).floatValue());
                        }
                    };
                    rVarH.v(objE6);
                }
                d1 d1VarH = Function1.h((er.l) objE6, rVarH, 0);
                boolean z18 = i17 == 4;
                Object objE7 = rVarH.E();
                if (z18 || objE7 == r.INSTANCE.a()) {
                    objE7 = new c(asVar, null);
                    rVarH.v(objE7);
                }
                mVarG = Function1.g(companion, d1VarH, a2Var, false, null, false, null, (q) objE7, false, 188, null);
                rVarH.R();
            }
            m mVarU = asVar.getModifier().u(mVarG);
            boolean zW5 = rVarH.W(aVar2);
            Object objE8 = rVarH.E();
            if (zW5 || objE8 == r.INSTANCE.a()) {
                objE8 = new er.l() { // from class: f2.jb
                    @Override // er.l
                    public final Object b(Object obj) {
                        return mb.o(aVar2, (f) obj);
                    }
                };
                rVarH.v(objE8);
            }
            m mVarB = k3.k.b(mVarU, (er.l) objE8);
            Object objE9 = rVarH.E();
            r.Companion companion2 = r.INSTANCE;
            if (objE9 == companion2.a()) {
                objE9 = new er.l() { // from class: f2.kb
                    @Override // er.l
                    public final Object b(Object obj) {
                        return mb.p((n4.i0) obj);
                    }
                };
                rVarH.v(objE9);
            }
            m mVarD = v.d(mVarB, false, (er.l) objE9, 1, null);
            i0 i0Var = i0.f148189a;
            Object objE10 = rVarH.E();
            if (objE10 == companion2.a()) {
                objE10 = a.f56857a;
                rVarH.v(objE10);
            }
            m mVarC = a4.w0.c(mVarD, i0Var, (PointerInputEventHandler) objE10);
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion3.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarC);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarI, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            x xVar = x.f39368a;
            m.Companion companion5 = m.INSTANCE;
            i iVar = i.f39152a;
            w0 w0VarA = d1.e0.a(iVar.k(), companion3.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, companion5);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            d1.i0 i0Var2 = d1.i0.f39176a;
            m mVarB2 = k3.f.b(d1.g4.c(companion5, asVar.getWindowInsets()));
            Object objE11 = rVarH.E();
            if (objE11 == companion2.a()) {
                objE11 = new h1() { // from class: f2.lb
                    @Override // h2.h1
                    public final float a() {
                        return mb.q();
                    }
                };
                rVarH.v(objE11);
            }
            long navigationIconContentColor = asVar.getColors().getNavigationIconContentColor();
            long titleContentColor = asVar.getColors().getTitleContentColor();
            long actionIconContentColor = asVar.getColors().getActionIconContentColor();
            long subtitleContentColor = asVar.getColors().getSubtitleContentColor();
            p<r, Integer, i0> pVarJ = asVar.j();
            TextStyle smallTitleTextStyle = asVar.getSmallTitleTextStyle();
            p<r, Integer, i0> pVarH = asVar.h();
            TextStyle smallSubtitleTextStyle = asVar.getSmallSubtitleTextStyle();
            i.f fVarE = iVar.e();
            f3.c.b titleHorizontalAlignment = asVar.getTitleHorizontalAlignment();
            boolean zM = m(f6Var);
            p<r, Integer, i0> pVarF = asVar.f();
            float collapsedHeight = asVar.getCollapsedHeight();
            rr rrVar = rr.f57664a;
            Function0.z(mVarB2, (h1) objE11, navigationIconContentColor, titleContentColor, subtitleContentColor, actionIconContentColor, pVarJ, smallTitleTextStyle, pVarH, smallSubtitleTextStyle, aVar3, fVarE, titleHorizontalAlignment, 0, zM, pVarF, fVarD, collapsedHeight, rrVar.h(), rVarH, 0, 102239280);
            m mVarM = Function0.M(k3.f.b(d1.g4.c(companion5, f4.h(asVar.getWindowInsets(), u4.INSTANCE.f()))), asVar.getScrollBehavior());
            boolean z19 = i17 == 4;
            Object objE12 = rVarH.E();
            if (z19 || objE12 == companion2.a()) {
                asVar2 = asVar;
                objE12 = new h1() { // from class: f2.cb
                    @Override // h2.h1
                    public final float a() {
                        return mb.r(asVar2);
                    }
                };
                rVarH.v(objE12);
            } else {
                asVar2 = asVar;
            }
            h1 h1Var = (h1) objE12;
            long navigationIconContentColor2 = asVar2.getColors().getNavigationIconContentColor();
            long titleContentColor2 = asVar2.getColors().getTitleContentColor();
            long actionIconContentColor2 = asVar2.getColors().getActionIconContentColor();
            long subtitleContentColor2 = asVar2.getColors().getSubtitleContentColor();
            p<r, Integer, i0> pVarN = asVar2.n();
            TextStyle titleTextStyle = asVar2.getTitleTextStyle();
            p<r, Integer, i0> pVarL = asVar2.l();
            TextStyle subtitleTextStyle = asVar2.getSubtitleTextStyle();
            i.n nVarD = iVar.d();
            f3.c.b titleHorizontalAlignment2 = asVar2.getTitleHorizontalAlignment();
            float fN = h.n(asVar2.getExpandedHeight() - asVar2.getCollapsedHeight());
            d3 d3VarH = rrVar.h();
            h3 h3Var = h3.f56028a;
            rVar2 = rVarH;
            Function0.z(mVarM, h1Var, navigationIconContentColor2, titleContentColor2, subtitleContentColor2, actionIconContentColor2, pVarN, titleTextStyle, pVarL, subtitleTextStyle, aVar4, nVarD, titleHorizontalAlignment2, iX0, z16, h3Var.D(), h3Var.H(), fN, d3VarH, rVar2, 0, 102432816);
            rVar2.x();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            asVar2 = asVar;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.db
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return mb.s(this.f55586a, asVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
