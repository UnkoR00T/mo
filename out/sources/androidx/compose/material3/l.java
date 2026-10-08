package androidx.compose.material3;

import a4.k0;
import a4.w0;
import androidx.compose.material3.l;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.g1;
import d1.x;
import er.p;
import f3.m;
import h2.r0;
import n3.t2;
import n3.y2;
import n3.z1;
import n4.f0;
import n4.v;
import oq.i0;
import p046f2.g2;
import p046f2.h4;
import p046f2.hd;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.c4;
import p076m2.d0;
import p076m2.e0;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import w0.BorderStroke;
import w0.n1;
import w0.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ae\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0089\u0001\u0010\u0016\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0091\u0001\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a5\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u001cH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0007H\u0003¢\u0006\u0004\b \u0010!\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lf3/m;", "modifier", "Ln3/y2;", "shape", "Landroidx/compose/ui/graphics/Color;", "color", "contentColor", "Lc5/h;", "tonalElevation", "shadowElevation", "Lw0/w;", "border", "Lkotlin/Function0;", "Loq/i0;", "content", "g", "(Lf3/m;Ln3/y2;JJFFLw0/w;Ler/p;Lm2/r;II)V", "onClick", "", "enabled", "Lb1/l;", "interactionSource", "i", "(Ler/a;Lf3/m;ZLn3/y2;JJFFLw0/w;Lb1/l;Ler/p;Lm2/r;III)V", "selected", "h", "(ZLer/a;Lf3/m;ZLn3/y2;JJFFLw0/w;Lb1/l;Ler/p;Lm2/r;III)V", "backgroundColor", "", "n", "(Lf3/m;Ln3/y2;JLw0/w;F)Lf3/m;", "elevation", "o", "(JFLm2/r;I)J", "Lm2/b4;", "a", "Lm2/b4;", "getLocalAbsoluteTonalElevation", "()Lm2/b4;", "LocalAbsoluteTonalElevation", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<c5.h> f9912a = d0.h(null, new er.a() { // from class: f2.zl
        @Override // er.a
        public final Object a() {
            return l.f();
        }
    }, 1, null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9913a = new a();

        a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, tq.e<? super i0> eVar) {
            return i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.h f() {
        return c5.h.j(c5.h.n(0));
    }

    public static final void g(m mVar, y2 y2Var, long j15, long j16, float f15, float f16, BorderStroke borderStroke, final p<? super r, ? super Integer, i0> pVar, r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            mVar = m.INSTANCE;
        }
        if ((i16 & 2) != 0) {
            y2Var = t2.a();
        }
        if ((i16 & 4) != 0) {
            j15 = d.f9816a.a(rVar, 6).getSurface();
        }
        if ((i16 & 8) != 0) {
            j16 = g2.e(j15, rVar, (i15 >> 6) & 14);
        }
        if ((i16 & 16) != 0) {
            f15 = c5.h.n(0);
        }
        if ((i16 & 32) != 0) {
            f16 = c5.h.n(0);
        }
        if ((i16 & 64) != 0) {
            borderStroke = null;
        }
        if (t.k()) {
            t.o(-1093433818, i15, -1, "androidx.compose.material3.Surface (Surface.kt:107)");
        }
        b4<c5.h> b4Var = f9912a;
        final float fN = c5.h.n(((c5.h) rVar.N(b4Var)).getValue() + f15);
        c4[] c4VarArr = {h4.a().d(Color.m0boximpl(j16)), b4Var.d(c5.h.j(fN))};
        final long j17 = j15;
        final y2 y2Var2 = y2Var;
        final BorderStroke borderStroke2 = borderStroke;
        final float f17 = f16;
        final m mVar2 = mVar;
        d0.d(c4VarArr, y2.m.d(421772006, true, new p() { // from class: f2.yl
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return l.j(mVar2, y2Var2, j17, fN, borderStroke2, f17, pVar, (r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, c4.f122821i | 48);
        if (t.k()) {
            t.n();
        }
    }

    public static final void h(final boolean z15, final er.a<i0> aVar, m mVar, boolean z16, y2 y2Var, long j15, long j16, float f15, float f16, BorderStroke borderStroke, b1.l lVar, final p<? super r, ? super Integer, i0> pVar, r rVar, int i15, int i16, int i17) {
        final m mVar2 = (i17 & 4) != 0 ? m.INSTANCE : mVar;
        final boolean z17 = (i17 & 8) != 0 ? true : z16;
        final y2 y2VarA = (i17 & 16) != 0 ? t2.a() : y2Var;
        final long surface = (i17 & 32) != 0 ? d.f9816a.a(rVar, 6).getSurface() : j15;
        long jE = (i17 & 64) != 0 ? g2.e(surface, rVar, (i15 >> 15) & 14) : j16;
        float fN = (i17 & 128) != 0 ? c5.h.n(0) : f15;
        final float fN2 = (i17 & 256) != 0 ? c5.h.n(0) : f16;
        BorderStroke borderStroke2 = (i17 & 512) != 0 ? null : borderStroke;
        b1.l lVar2 = (i17 & 1024) == 0 ? lVar : null;
        if (t.k()) {
            t.o(1416521139, i15, i16, "androidx.compose.material3.Surface (Surface.kt:346)");
        }
        if (lVar2 == null) {
            rVar.X(1528105640);
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = b1.k.a();
                rVar.v(objE);
            }
            lVar2 = (b1.l) objE;
        } else {
            rVar.X(-227801585);
        }
        rVar.R();
        b4<c5.h> b4Var = f9912a;
        final float fN3 = c5.h.n(((c5.h) rVar.N(b4Var)).getValue() + fN);
        final BorderStroke borderStroke3 = borderStroke2;
        final b1.l lVar3 = lVar2;
        d0.d(new c4[]{h4.a().d(Color.m0boximpl(jE)), b4Var.d(c5.h.j(fN3))}, y2.m.d(1508735219, true, new p() { // from class: f2.am
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return l.l(mVar2, lVar3, y2VarA, surface, fN3, borderStroke3, z15, z17, aVar, fN2, pVar, (r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, c4.f122821i | 48);
        if (t.k()) {
            t.n();
        }
    }

    public static final void i(final er.a<i0> aVar, m mVar, boolean z15, y2 y2Var, long j15, long j16, float f15, float f16, BorderStroke borderStroke, b1.l lVar, final p<? super r, ? super Integer, i0> pVar, r rVar, int i15, int i16, int i17) {
        final m mVar2 = (i17 & 2) != 0 ? m.INSTANCE : mVar;
        final boolean z16 = (i17 & 4) != 0 ? true : z15;
        final y2 y2VarA = (i17 & 8) != 0 ? t2.a() : y2Var;
        final long surface = (i17 & 16) != 0 ? d.f9816a.a(rVar, 6).getSurface() : j15;
        long jE = (i17 & 32) != 0 ? g2.e(surface, rVar, (i15 >> 12) & 14) : j16;
        float fN = (i17 & 64) != 0 ? c5.h.n(0) : f15;
        final float fN2 = (i17 & 128) != 0 ? c5.h.n(0) : f16;
        BorderStroke borderStroke2 = (i17 & 256) != 0 ? null : borderStroke;
        b1.l lVar2 = (i17 & 512) == 0 ? lVar : null;
        if (t.k()) {
            t.o(-1472753265, i15, i16, "androidx.compose.material3.Surface (Surface.kt:212)");
        }
        if (lVar2 == null) {
            rVar.X(-1701074900);
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = b1.k.a();
                rVar.v(objE);
            }
            lVar2 = (b1.l) objE;
        } else {
            rVar.X(2023335947);
        }
        rVar.R();
        b4<c5.h> b4Var = f9912a;
        final float fN3 = c5.h.n(((c5.h) rVar.N(b4Var)).getValue() + fN);
        final BorderStroke borderStroke3 = borderStroke2;
        final b1.l lVar3 = lVar2;
        d0.d(new c4[]{h4.a().d(Color.m0boximpl(jE)), b4Var.d(c5.h.j(fN3))}, y2.m.d(849208527, true, new p() { // from class: f2.cm
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return l.m(mVar2, lVar3, y2VarA, surface, fN3, borderStroke3, z16, aVar, fN2, pVar, (r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, c4.f122821i | 48);
        if (t.k()) {
            t.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(m mVar, y2 y2Var, long j15, float f15, BorderStroke borderStroke, float f16, p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(421772006, i15, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:113)");
            }
            m mVarN = n(mVar, y2Var, o(j15, f15, rVar, 0), borderStroke, ((c5.d) rVar.N(g1.f())).l2(f16));
            Object objE = rVar.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = new er.l() { // from class: f2.bm
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.k((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            m mVarC = v.c(mVarN, false, (er.l) objE);
            i0 i0Var = i0.f148189a;
            Object objE2 = rVar.E();
            if (objE2 == companion.a()) {
                objE2 = a.f9913a;
                rVar.v(objE2);
            }
            m mVarC2 = w0.c(mVarC, i0Var, (PointerInputEventHandler) objE2);
            p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), true);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = f3.j.e(rVar, mVarC2);
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
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            pVar.B(rVar, 0);
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
    public static final i0 k(n4.i0 i0Var) {
        f0.a0(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(m mVar, b1.l lVar, y2 y2Var, long j15, float f15, BorderStroke borderStroke, boolean z15, boolean z16, er.a aVar, float f16, p pVar, r rVar, int i15) {
        b1.l lVar2;
        m mVarE;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1508735219, i15, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:354)");
            }
            m mVarI = hd.i(mVar);
            if (((k) rVar.N(i.f())).getFocus() instanceof k.a.C0211a) {
                lVar2 = lVar;
                mVarE = n1.e(m.INSTANCE, lVar2, i.h(false, 0.0f, 0L, y2Var, false, true, false, false, 7, null));
            } else {
                lVar2 = lVar;
                mVarE = m.INSTANCE;
            }
            m mVarC = r0.c(k1.d.b(n(mVarI.u(mVarE), y2Var, o(j15, f15, rVar, 0), borderStroke, ((c5.d) rVar.N(g1.f())).l2(f16)), z15, lVar2, i.h(false, 0.0f, 0L, y2Var, false, !(((k) rVar.N(i.f())).getFocus() instanceof k.a.C0211a), false, false, 215, null), z16, null, aVar, 16, null), null, 1, null);
            p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), true);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE2 = f3.j.e(rVar, mVarC);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE2, companion.e());
            x xVar = x.f39368a;
            pVar.B(rVar, 0);
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
    public static final i0 m(m mVar, b1.l lVar, y2 y2Var, long j15, float f15, BorderStroke borderStroke, boolean z15, er.a aVar, float f16, p pVar, r rVar, int i15) {
        b1.l lVar2;
        m mVarE;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(849208527, i15, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:220)");
            }
            m mVarI = hd.i(mVar);
            if (((k) rVar.N(i.f())).getFocus() instanceof k.a.C0211a) {
                lVar2 = lVar;
                mVarE = n1.e(m.INSTANCE, lVar2, i.h(false, 0.0f, 0L, y2Var, false, true, false, false, 7, null));
            } else {
                lVar2 = lVar;
                mVarE = m.INSTANCE;
            }
            m mVarC = r0.c(androidx.compose.foundation.b.l(n(mVarI.u(mVarE), y2Var, o(j15, f15, rVar, 0), borderStroke, ((c5.d) rVar.N(g1.f())).l2(f16)), lVar2, i.h(false, 0.0f, 0L, y2Var, false, !(((k) rVar.N(i.f())).getFocus() instanceof k.a.C0211a), false, false, 215, null), z15, null, null, aVar, 24, null), null, 1, null);
            p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), true);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE2 = f3.j.e(rVar, mVarC);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE2, companion.e());
            x xVar = x.f39368a;
            pVar.B(rVar, 0);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    private static final m n(m mVar, y2 y2Var, long j15, BorderStroke borderStroke, float f15) {
        y2 y2Var2;
        m mVarG;
        if (f15 > 0.0f) {
            y2Var2 = y2Var;
            mVarG = z1.g(m.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f15, 0.0f, 0.0f, 0.0f, 0.0f, 0L, y2Var2, false, null, 0L, 0L, 0, 0, null, 518111, null);
        } else {
            y2Var2 = y2Var;
            mVarG = m.INSTANCE;
        }
        return k3.f.a(w0.i.c(mVar.u(mVarG).u(borderStroke != null ? o.g(m.INSTANCE, borderStroke, y2Var2) : m.INSTANCE), j15, y2Var2), y2Var2);
    }

    private static final long o(long j15, float f15, r rVar, int i15) {
        if (t.k()) {
            t.o(-2079918090, i15, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:610)");
        }
        long jC = g2.c(d.f9816a.a(rVar, 6), j15, f15, rVar, (i15 << 3) & 1008);
        if (t.k()) {
            t.n();
        }
        return jC;
    }
}
