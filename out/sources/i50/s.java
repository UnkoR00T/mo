package i50;

import android.view.KeyEvent;
import c5.y;
import d1.c4;
import d1.d3;
import d1.r3;
import d1.x;
import l3.d0;
import l3.g0;
import mx.Label;
import n3.a2;
import n3.z1;
import n4.f0;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.cc;
import p046f2.di;
import p046f2.rh;
import p046f2.rr;
import p046f2.ur;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.w5;
import p143z0.v2;
import r70.BaseFloatingActionButtonData;
import t70.z;
import w0.q0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aË\u0001\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00030\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!\"\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)²\u0006\u000e\u0010(\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"Li50/a;", "data", "Lkotlin/Function0;", "Loq/i0;", "bottomBar", "snackBarHost", "Lf2/cc;", "floatingActionButtonPosition", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "Ld1/c4;", "contentWindowInsets", "Lz0/v2;", "contentScrollableState", "", "reverseLayout", "Ll3/d0;", "topAppBarNextFocusRequester", "topAppBarPreviousFocusRequester", "topAppBarLastElementFocusRequester", "contentLastElementContentFocusRequester", "enableAutomaticFocusOrderFix", "", "fabAlpha", "topAppBarAlpha", "Lkotlin/Function1;", "Ld1/d3;", "content", "r", "(Li50/a;Ler/p;Ler/p;IJLd1/c4;Lz0/v2;ZLl3/d0;Ll3/d0;Ll3/d0;Ll3/d0;ZFFLer/q;Lm2/r;III)V", "Ll3/g;", "Li50/w;", "O", "(I)Li50/w;", "Lc5/h;", "a", "F", "N", "()F", "LIST_WITH_FAB_BOTTOM_PADDING", "isScrollingUp", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f89488a = c5.h.n(104);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.l<y3.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseScaffoldData f89489a;

        a(BaseScaffoldData baseScaffoldData) {
            this.f89489a = baseScaffoldData;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(y3.b bVar) {
            return c(bVar.getNativeKeyEvent());
        }

        public final Boolean c(KeyEvent keyEvent) {
            return Boolean.valueOf(this.f89489a.f(keyEvent));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"i50/s$b", "Lz3/a;", "Lm3/e;", "available", "Lz3/g;", "source", "h2", "(JI)J", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements z3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a3<Boolean> f89490a;

        b(a3<Boolean> a3Var) {
            this.f89490a = a3Var;
        }

        @Override // z3.a
        public /* bridge */ Object W0(long j15, long j16, tq.e<? super y> eVar) {
            return super.W0(j15, j16, eVar);
        }

        @Override // z3.a
        public /* bridge */ long d1(long j15, long j16, int i15) {
            return super.d1(j15, j16, i15);
        }

        @Override // z3.a
        public long h2(long available, int source) {
            int i15 = (int) (available & BodyPartID.bodyIdMax);
            if (Float.intBitsToFloat(i15) != 0.0f) {
                s.t(this.f89490a, Float.intBitsToFloat(i15) > 0.0f);
            }
            return m3.e.INSTANCE.c();
        }

        @Override // z3.a
        public /* bridge */ Object r2(long j15, tq.e<? super y> eVar) {
            return super.r2(j15, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f89492b;

        static {
            int[] iArr = new int[BaseScaffoldData.EnumC2111a.values().length];
            try {
                iArr[BaseScaffoldData.EnumC2111a.EnterAlwaysScroll.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BaseScaffoldData.EnumC2111a.PinnedScroll.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f89491a = iArr;
            int[] iArr2 = new int[w.values().length];
            try {
                iArr2[w.Next.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[w.Previous.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[w.Unsupported.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f89492b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(d0 d0Var, final boolean z15, final d0 d0Var2, final d0 d0Var3, final d0 d0Var4, final d0 d0Var5, final d0 d0Var6, er.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1731472246, i15, -1, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold.<anonymous>.<anonymous> (BaseScaffold.kt:267)");
            }
            f3.m mVarA = g0.a(f3.m.INSTANCE, d0Var);
            boolean zA = rVar.a(z15) | rVar.W(d0Var2) | rVar.W(d0Var3);
            Object objE = rVar.E();
            if (zA || objE == p076m2.r.INSTANCE.a()) {
                er.l lVar = new er.l() { // from class: i50.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.B(z15, d0Var4, d0Var5, d0Var6, d0Var3, d0Var2, (l3.v) obj);
                    }
                };
                rVar.v(lVar);
                objE = lVar;
            }
            f3.m mVarA2 = q0.a(l3.y.a(mVarA, (er.l) objE));
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarA2);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            pVar.B(rVar, 0);
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
    public static final i0 B(final boolean z15, final d0 d0Var, final d0 d0Var2, final d0 d0Var3, final d0 d0Var4, final d0 d0Var5, l3.v vVar) {
        vVar.s(new er.l() { // from class: i50.f
            @Override // er.l
            public final Object b(Object obj) {
                return s.C(z15, d0Var, d0Var2, d0Var3, d0Var4, d0Var5, (l3.h) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(boolean z15, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, d0 d0Var5, l3.h hVar) {
        if (z15) {
            px.f.f163100a.b("Focus exited BottomBar: " + ((Object) l3.g.n(hVar.getRequestedFocusDirection())), pq.v.e(z.f188762a.b()));
            int i15 = c.f89492b[O(hVar.getRequestedFocusDirection()).ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new oq.p();
                    }
                } else if (!d0.f(d0Var3, 0, 1, null) && !L(d0Var5) && !d0.f(d0Var2, 0, 1, null)) {
                    d0.f(d0Var4, 0, 1, null);
                }
            } else if (!d0.f(d0Var, 0, 1, null) && !d0.f(d0Var2, 0, 1, null)) {
                d0.f(d0Var3, 0, 1, null);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(final float f15, d0 d0Var, final boolean z15, final d0 d0Var2, final d0 d0Var3, final d0 d0Var4, final d0 d0Var5, final d0 d0Var6, BaseScaffoldData baseScaffoldData, a3 a3Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1287648884, i15, -1, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold.<anonymous>.<anonymous> (BaseScaffold.kt:222)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            boolean zB = rVar.b(f15);
            Object objE = rVar.E();
            if (zB || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: i50.q
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.E(f15, (a2) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarA = g0.a(z1.c(companion, (er.l) objE), d0Var);
            boolean zA = rVar.a(z15) | rVar.W(d0Var2) | rVar.W(d0Var3);
            Object objE2 = rVar.E();
            if (zA || objE2 == p076m2.r.INSTANCE.a()) {
                er.l lVar = new er.l() { // from class: i50.r
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.F(z15, d0Var4, d0Var5, d0Var6, d0Var3, d0Var2, (l3.v) obj);
                    }
                };
                rVar.v(lVar);
                objE2 = lVar;
            }
            f3.m mVarA2 = q0.a(l3.y.a(mVarA, (er.l) objE2));
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.j(), rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarA2);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVar.X(948806486);
            int i16 = 0;
            for (Object obj : baseScaffoldData.a()) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    pq.v.x();
                }
                r70.j.i((BaseFloatingActionButtonData) obj, s(a3Var), d0Var2, rVar, 0, 0);
                if (baseScaffoldData.a().size() - 1 != i16) {
                    rVar.X(2050786313);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
                    rVar.R();
                } else {
                    rVar.X(2050896425);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
                    rVar.R();
                }
                i16 = i17;
            }
            rVar.R();
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
    public static final i0 E(float f15, a2 a2Var) {
        a2Var.g(f15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(final boolean z15, final d0 d0Var, final d0 d0Var2, final d0 d0Var3, final d0 d0Var4, final d0 d0Var5, l3.v vVar) {
        vVar.s(new er.l() { // from class: i50.h
            @Override // er.l
            public final Object b(Object obj) {
                return s.G(z15, d0Var, d0Var2, d0Var3, d0Var4, d0Var5, (l3.h) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(boolean z15, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, d0 d0Var5, l3.h hVar) {
        if (z15) {
            px.f.f163100a.b("Focus exited FAB: " + ((Object) l3.g.n(hVar.getRequestedFocusDirection())), pq.v.e(z.f188762a.b()));
            int i15 = c.f89492b[O(hVar.getRequestedFocusDirection()).ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new oq.p();
                    }
                } else if (!L(d0Var5) && !d0.f(d0Var3, 0, 1, null) && !d0.f(d0Var4, 0, 1, null)) {
                    d0.f(d0Var, 0, 1, null);
                }
            } else if (!d0.f(d0Var, 0, 1, null) && !d0.f(d0Var2, 0, 1, null)) {
                d0.f(d0Var3, 0, 1, null);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(d0 d0Var, final boolean z15, final d0 d0Var2, final d0 d0Var3, final d0 d0Var4, final d0 d0Var5, er.q qVar, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1671840340, i16, -1, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold.<anonymous>.<anonymous> (BaseScaffold.kt:191)");
            }
            f3.m mVarA = g0.a(f3.m.INSTANCE, d0Var);
            boolean zA = rVar.a(z15) | rVar.W(d0Var2);
            Object objE = rVar.E();
            if (zA || objE == p076m2.r.INSTANCE.a()) {
                er.l lVar = new er.l() { // from class: i50.p
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.I(z15, d0Var3, d0Var4, d0Var5, d0Var2, (l3.v) obj);
                    }
                };
                rVar.v(lVar);
                objE = lVar;
            }
            f3.m mVarA2 = q0.a(l3.y.a(mVarA, (er.l) objE));
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarA2);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            qVar.w(d3Var, rVar, Integer.valueOf(i16 & 14));
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
    public static final i0 I(final boolean z15, final d0 d0Var, final d0 d0Var2, final d0 d0Var3, final d0 d0Var4, l3.v vVar) {
        vVar.s(new er.l() { // from class: i50.i
            @Override // er.l
            public final Object b(Object obj) {
                return s.J(z15, d0Var, d0Var2, d0Var3, d0Var4, (l3.h) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(boolean z15, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, l3.h hVar) {
        if (z15) {
            px.f.f163100a.b("Focus exited content: " + ((Object) l3.g.n(hVar.getRequestedFocusDirection())), pq.v.e(z.f188762a.b()));
            int i15 = c.f89492b[O(hVar.getRequestedFocusDirection()).ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new oq.p();
                    }
                } else if (!d0.f(d0Var4, 0, 1, null) && !d0.f(d0Var2, 0, 1, null)) {
                    d0.f(d0Var, 0, 1, null);
                }
            } else if (!d0.f(d0Var, 0, 1, null) && !d0.f(d0Var2, 0, 1, null)) {
                d0.f(d0Var3, 0, 1, null);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(BaseScaffoldData baseScaffoldData, er.p pVar, er.p pVar2, int i15, long j15, c4 c4Var, v2 v2Var, boolean z15, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, boolean z16, float f15, float f16, er.q qVar, int i16, int i17, int i18, p076m2.r rVar, int i19) {
        r(baseScaffoldData, pVar, pVar2, i15, j15, c4Var, v2Var, z15, d0Var, d0Var2, d0Var3, d0Var4, z16, f15, f16, qVar, rVar, g4.a(i16 | 1), g4.a(i17), i18);
        return i0.f148189a;
    }

    private static final boolean L(d0 d0Var) {
        if (d0Var != null) {
            return d0.f(d0Var, 0, 1, null);
        }
        return false;
    }

    public static final float N() {
        return f89488a;
    }

    private static final w O(int i15) {
        l3.g.Companion companion = l3.g.INSTANCE;
        if (!l3.g.l(i15, companion.f()) && !l3.g.l(i15, companion.h()) && !l3.g.l(i15, companion.d())) {
            if (!l3.g.l(i15, companion.e()) && !l3.g.l(i15, companion.a()) && !l3.g.l(i15, companion.g())) {
                return w.Unsupported;
            }
            return w.Next;
        }
        return w.Previous;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0123  */
    /* JADX WARN: Code duplicated, block: B:102:0x012d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0130  */
    /* JADX WARN: Code duplicated, block: B:107:0x0138  */
    /* JADX WARN: Code duplicated, block: B:108:0x0141  */
    /* JADX WARN: Code duplicated, block: B:110:0x0145  */
    /* JADX WARN: Code duplicated, block: B:112:0x014f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0152  */
    /* JADX WARN: Code duplicated, block: B:115:0x0157  */
    /* JADX WARN: Code duplicated, block: B:118:0x0161  */
    /* JADX WARN: Code duplicated, block: B:120:0x0168  */
    /* JADX WARN: Code duplicated, block: B:122:0x016c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0176  */
    /* JADX WARN: Code duplicated, block: B:125:0x0179  */
    /* JADX WARN: Code duplicated, block: B:127:0x017e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0189  */
    /* JADX WARN: Code duplicated, block: B:131:0x018c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0192  */
    /* JADX WARN: Code duplicated, block: B:135:0x019a  */
    /* JADX WARN: Code duplicated, block: B:136:0x019d  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:147:0x01be  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:156:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:162:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:169:0x0207  */
    /* JADX WARN: Code duplicated, block: B:173:0x0213  */
    /* JADX WARN: Code duplicated, block: B:176:0x021c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0223  */
    /* JADX WARN: Code duplicated, block: B:191:0x0261 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:192:0x0263  */
    /* JADX WARN: Code duplicated, block: B:194:0x026c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0273  */
    /* JADX WARN: Code duplicated, block: B:198:0x0278  */
    /* JADX WARN: Code duplicated, block: B:199:0x0281  */
    /* JADX WARN: Code duplicated, block: B:202:0x0286  */
    /* JADX WARN: Code duplicated, block: B:203:0x029b  */
    /* JADX WARN: Code duplicated, block: B:206:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:208:0x02af  */
    /* JADX WARN: Code duplicated, block: B:210:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:211:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:213:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:214:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:216:0x02be  */
    /* JADX WARN: Code duplicated, block: B:217:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:219:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:221:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:223:0x02db  */
    /* JADX WARN: Code duplicated, block: B:225:0x02df  */
    /* JADX WARN: Code duplicated, block: B:226:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:228:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:229:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:231:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:232:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:234:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:235:0x0314  */
    /* JADX WARN: Code duplicated, block: B:238:0x033b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:241:0x034c  */
    /* JADX WARN: Code duplicated, block: B:244:0x0362  */
    /* JADX WARN: Code duplicated, block: B:247:0x0378  */
    /* JADX WARN: Code duplicated, block: B:250:0x038e  */
    /* JADX WARN: Code duplicated, block: B:253:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:255:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:257:0x03af  */
    /* JADX WARN: Code duplicated, block: B:259:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:261:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:262:0x040c  */
    /* JADX WARN: Code duplicated, block: B:265:0x0440  */
    /* JADX WARN: Code duplicated, block: B:268:0x0484  */
    /* JADX WARN: Code duplicated, block: B:270:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:273:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0118  */
    /* JADX WARN: Code duplicated, block: B:98:0x011f  */
    public static final void r(final BaseScaffoldData baseScaffoldData, er.p<? super p076m2.r, ? super Integer, i0> pVar, er.p<? super p076m2.r, ? super Integer, i0> pVar2, int i15, long j15, c4 c4Var, v2 v2Var, boolean z15, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, boolean z16, float f15, float f16, final er.q<? super d3, ? super p076m2.r, ? super Integer, i0> qVar, p076m2.r rVar, final int i16, final int i17, final int i18) {
        int i19;
        er.p<? super p076m2.r, ? super Integer, i0> pVarC;
        int i25;
        er.p<? super p076m2.r, ? super Integer, i0> pVar3;
        int i26;
        int i27;
        int i28;
        int i29;
        long j16;
        int i35;
        int i36;
        c4 c4VarA;
        int i37;
        v2 v2Var2;
        int i38;
        int i39;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        int i75;
        int i76;
        int i77;
        int i78;
        int i79;
        int i85;
        boolean z17;
        final boolean z18;
        final d0 d0Var5;
        final float f17;
        final er.p<? super p076m2.r, ? super Integer, i0> pVar4;
        final v2 v2Var3;
        final int i86;
        final c4 c4Var2;
        final er.p<? super p076m2.r, ? super Integer, i0> pVar5;
        final long j17;
        final d0 d0Var6;
        final d0 d0Var7;
        final d0 d0Var8;
        final boolean z19;
        final float f18;
        d5 d5VarM;
        er.p<? super p076m2.r, ? super Integer, i0> pVarD;
        int iA;
        long jA;
        boolean z25;
        d0 d0Var9;
        d0 d0Var10;
        d0 d0Var11;
        d0 d0Var12;
        boolean z26;
        float f19;
        final er.p<? super p076m2.r, ? super Integer, i0> pVar6;
        d0 d0Var13;
        final long j18;
        final d0 d0Var14;
        final d0 d0Var15;
        final int i87;
        final boolean z27;
        final d0 d0Var16;
        final er.p<? super p076m2.r, ? super Integer, i0> pVar7;
        final float f25;
        final boolean z28;
        w5 w5Var;
        int i88;
        final float f26;
        final v2 v2Var4;
        final c4 c4Var3;
        Object objE;
        Object objE2;
        p076m2.r.Companion companion;
        Object objE3;
        Object objE4;
        Object objE5;
        int i89;
        ur urVarD;
        Object objE6;
        int i95;
        int i96;
        int i97;
        p076m2.r rVarH = rVar.h(-45887867);
        if ((i16 & 6) == 0) {
            i19 = (rVarH.G(baseScaffoldData) ? 4 : 2) | i16;
        } else {
            i19 = i16;
        }
        int i98 = i18 & 2;
        if (i98 == 0) {
            if ((i16 & 48) == 0) {
                pVarC = pVar;
                i19 |= rVarH.G(pVarC) ? 32 : 16;
            }
            i25 = i18 & 4;
            if (i25 != 0) {
                if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                    pVar3 = pVar2;
                    if (rVarH.G(pVar3)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i19 |= i26;
                }
                if ((i16 & 3072) == 0) {
                    if ((i18 & 8) == 0) {
                        i27 = i15;
                        if (rVarH.c(i27)) {
                            i97 = 2048;
                        }
                        i19 |= i97;
                    } else {
                        i27 = i15;
                    }
                    i97 = 1024;
                    i19 |= i97;
                } else {
                    i27 = i15;
                }
                i28 = i16 & 24576;
                i29 = PKIFailureInfo.certRevoked;
                if (i28 == 0) {
                    j16 = j15;
                    if ((i18 & 16) == 0 || !rVarH.d(j16)) {
                        i96 = 8192;
                    } else {
                        i96 = 16384;
                    }
                    i19 |= i96;
                } else {
                    j16 = j15;
                }
                i35 = i16 & 196608;
                i36 = PKIFailureInfo.unsupportedVersion;
                if (i35 == 0) {
                    c4VarA = c4Var;
                    if ((i18 & 32) == 0 || !rVarH.W(c4VarA)) {
                        i95 = PKIFailureInfo.notAuthorized;
                    } else {
                        i95 = 131072;
                    }
                    i19 |= i95;
                } else {
                    c4VarA = c4Var;
                }
                i37 = i18 & 64;
                if (i37 != 0) {
                    i19 |= 1572864;
                    v2Var2 = v2Var;
                } else {
                    v2Var2 = v2Var;
                    if ((i16 & 1572864) == 0) {
                        if (rVarH.G(v2Var2)) {
                            i38 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i38 = PKIFailureInfo.signerNotTrusted;
                        }
                        i19 |= i38;
                    }
                }
                i39 = i18 & 128;
                if (i39 != 0) {
                    i19 |= 12582912;
                } else if ((i16 & 12582912) == 0) {
                    if (rVarH.a(z15)) {
                        i45 = 8388608;
                    } else {
                        i45 = 4194304;
                    }
                    i19 |= i45;
                }
                i46 = i18 & 256;
                if (i46 != 0) {
                    if ((i16 & 100663296) == 0) {
                        if (rVarH.W(d0Var)) {
                            i47 = 67108864;
                        } else {
                            i47 = 33554432;
                        }
                        i19 |= i47;
                    }
                    i48 = i18 & 512;
                    if (i48 != 0) {
                        if ((i16 & 805306368) == 0) {
                            if (rVarH.W(d0Var2)) {
                                i49 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i49 = 268435456;
                            }
                            i19 |= i49;
                        }
                        i55 = i18 & 1024;
                        if (i55 != 0) {
                            i56 = i17 | 6;
                        } else if ((i17 & 6) == 0) {
                            if (rVarH.W(d0Var3)) {
                                i57 = 4;
                            } else {
                                i57 = 2;
                            }
                            i56 = i17 | i57;
                        } else {
                            i56 = i17;
                        }
                        i58 = i18 & 2048;
                        if (i58 != 0) {
                            i56 |= 48;
                        } else if ((i17 & 48) != 0) {
                            if (rVarH.W(d0Var4)) {
                                i59 = 32;
                            } else {
                                i59 = 16;
                            }
                            i56 |= i59;
                        }
                        i65 = i56;
                        i66 = i18 & PKIFailureInfo.certConfirmed;
                        if (i66 != 0) {
                            i68 = i65 | MLKEMEngine.KyberPolyBytes;
                        } else {
                            i67 = i65;
                            if ((i17 & MLKEMEngine.KyberPolyBytes) != 0) {
                                if (rVarH.a(z16)) {
                                    i69 = 256;
                                } else {
                                    i69 = 128;
                                }
                                i67 |= i69;
                            }
                            i68 = i67;
                        }
                        i75 = i18 & PKIFailureInfo.certRevoked;
                        if (i75 != 0) {
                            i77 = i68 | 3072;
                        } else {
                            i76 = i68;
                            if ((i17 & 3072) == 0) {
                                i77 = i76 | (rVarH.b(f15) ? 2048 : 1024);
                            } else {
                                i77 = i76;
                            }
                        }
                        i78 = i18 & 16384;
                        if (i78 != 0) {
                            i79 = i77;
                            if ((i17 & 24576) == 0) {
                                if (rVarH.b(f16)) {
                                    i29 = 16384;
                                }
                                i79 |= i29;
                            }
                            if ((i17 & 196608) == 0) {
                                if (!rVarH.G(qVar)) {
                                    i36 = PKIFailureInfo.notAuthorized;
                                }
                                i79 |= i36;
                            }
                            i85 = i79;
                            if ((i19 & 306783379) == 306783378 || (74899 & i85) != 74898) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (rVarH.r(z17, i19 & 1)) {
                                rVarH.I();
                                if ((i16 & 1) != 0 || rVarH.Q()) {
                                    if (i98 != 0) {
                                        pVarC = v.f89493a.c();
                                    }
                                    if (i25 != 0) {
                                        pVarD = v.f89493a.d();
                                    } else {
                                        pVarD = pVar3;
                                    }
                                    if ((i18 & 8) != 0) {
                                        iA = cc.INSTANCE.a();
                                        i19 &= -7169;
                                    } else {
                                        iA = i27;
                                    }
                                    if ((i18 & 16) != 0) {
                                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                        i19 &= -57345;
                                    } else {
                                        jA = j16;
                                    }
                                    if ((i18 & 32) != 0) {
                                        i19 &= -458753;
                                        c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                                    }
                                    if (i37 != 0) {
                                        v2Var2 = null;
                                    }
                                    if (i39 != 0) {
                                        z25 = false;
                                    } else {
                                        z25 = z15;
                                    }
                                    if (i46 != 0) {
                                        d0Var9 = null;
                                    } else {
                                        d0Var9 = d0Var;
                                    }
                                    if (i48 != 0) {
                                        d0Var10 = null;
                                    } else {
                                        d0Var10 = d0Var2;
                                    }
                                    if (i55 != 0) {
                                        objE = rVarH.E();
                                        if (objE == p076m2.r.INSTANCE.a()) {
                                            objE = new d0();
                                            rVarH.v(objE);
                                        }
                                        d0Var11 = (d0) objE;
                                    } else {
                                        d0Var11 = d0Var3;
                                    }
                                    if (i58 != 0) {
                                        d0Var12 = null;
                                    } else {
                                        d0Var12 = d0Var4;
                                    }
                                    if (i66 != 0) {
                                        z26 = true;
                                    } else {
                                        z26 = z16;
                                    }
                                    if (i75 != 0) {
                                        f19 = 1.0f;
                                    } else {
                                        f19 = f15;
                                    }
                                    if (i78 != 0) {
                                        long j19 = jA;
                                        pVar6 = pVarD;
                                        d0Var13 = d0Var10;
                                        j18 = j19;
                                        d0Var14 = d0Var11;
                                        d0Var15 = d0Var12;
                                        i87 = iA;
                                        d0Var16 = d0Var9;
                                        pVar7 = pVarC;
                                        f25 = f19;
                                        z28 = z26;
                                        w5Var = null;
                                        i88 = -45887867;
                                        v2Var4 = v2Var2;
                                        c4Var3 = c4VarA;
                                        f26 = 1.0f;
                                        z27 = z25;
                                    } else {
                                        long j25 = jA;
                                        pVar6 = pVarD;
                                        d0Var13 = d0Var10;
                                        j18 = j25;
                                        d0Var14 = d0Var11;
                                        d0Var15 = d0Var12;
                                        i87 = iA;
                                        z27 = z25;
                                        d0Var16 = d0Var9;
                                        pVar7 = pVarC;
                                        f25 = f19;
                                        z28 = z26;
                                        w5Var = null;
                                        i88 = -45887867;
                                        f26 = f16;
                                        v2Var4 = v2Var2;
                                        c4Var3 = c4VarA;
                                    }
                                } else {
                                    rVarH.O();
                                    if ((i18 & 8) != 0) {
                                        i19 &= -7169;
                                    }
                                    if ((i18 & 16) != 0) {
                                        i19 &= -57345;
                                    }
                                    if ((i18 & 32) != 0) {
                                        i19 &= -458753;
                                    }
                                    z27 = z15;
                                    d0Var16 = d0Var;
                                    d0Var13 = d0Var2;
                                    d0Var14 = d0Var3;
                                    d0Var15 = d0Var4;
                                    z28 = z16;
                                    f25 = f15;
                                    f26 = f16;
                                    pVar6 = pVar3;
                                    c4Var3 = c4VarA;
                                    pVar7 = pVarC;
                                    j18 = j16;
                                    w5Var = null;
                                    i88 = -45887867;
                                    v2Var4 = v2Var2;
                                    i87 = i27;
                                }
                                rVarH.y();
                                if (p076m2.t.k()) {
                                    p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                                }
                                objE2 = rVarH.E();
                                companion = p076m2.r.INSTANCE;
                                if (objE2 == companion.a()) {
                                    objE2 = new d0();
                                    rVarH.v(objE2);
                                }
                                final d0 d0Var17 = (d0) objE2;
                                objE3 = rVarH.E();
                                if (objE3 == companion.a()) {
                                    objE3 = new d0();
                                    rVarH.v(objE3);
                                }
                                final d0 d0Var18 = (d0) objE3;
                                objE4 = rVarH.E();
                                if (objE4 == companion.a()) {
                                    objE4 = new d0();
                                    rVarH.v(objE4);
                                }
                                final d0 d0Var19 = (d0) objE4;
                                objE5 = rVarH.E();
                                if (objE5 == companion.a()) {
                                    objE5 = new d0();
                                    rVarH.v(objE5);
                                }
                                final d0 d0Var20 = (d0) objE5;
                                i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                                if (i89 != 1) {
                                    rVarH.X(-1148515264);
                                    urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                                    rVarH.R();
                                } else if (i89 != 2) {
                                    rVarH.X(-1148511225);
                                    urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                                    rVarH.R();
                                } else {
                                    if (i89 == 3) {
                                        rVarH.X(-1148518986);
                                        rVarH.R();
                                        throw new oq.p();
                                    }
                                    rVarH.X(-1148507365);
                                    urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                                    rVarH.R();
                                }
                                final ur urVar = urVarD;
                                objE6 = rVarH.E();
                                if (objE6 == companion.a()) {
                                    objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                                    rVarH.v(objE6);
                                }
                                final a3 a3Var = (a3) objE6;
                                final b bVar = new b(a3Var);
                                final d0 d0Var21 = d0Var13;
                                p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return s.u(baseScaffoldData, urVar, bVar, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var17, z28, d0Var15, d0Var18, d0Var19, d0Var20, d0Var16, d0Var21, d0Var14, pVar7, f25, a3Var, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                                if (p076m2.t.k()) {
                                    p076m2.t.n();
                                }
                                v2Var3 = v2Var4;
                                pVar4 = pVar6;
                                i86 = i87;
                                j17 = j18;
                                c4Var2 = c4Var3;
                                z18 = z27;
                                f17 = f26;
                                z19 = z28;
                                d0Var5 = d0Var15;
                                d0Var6 = d0Var16;
                                d0Var7 = d0Var21;
                                d0Var8 = d0Var14;
                                pVar5 = pVar7;
                                f18 = f25;
                            } else {
                                rVarH.O();
                                z18 = z15;
                                d0Var5 = d0Var4;
                                f17 = f16;
                                pVar4 = pVar3;
                                v2Var3 = v2Var2;
                                i86 = i27;
                                c4Var2 = c4VarA;
                                pVar5 = pVarC;
                                j17 = j16;
                                d0Var6 = d0Var;
                                d0Var7 = d0Var2;
                                d0Var8 = d0Var3;
                                z19 = z16;
                                f18 = f15;
                            }
                            d5VarM = rVarH.m();
                            if (d5VarM != null) {
                                d5VarM.a(new er.p() { // from class: i50.j
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i79 = i77 | 24576;
                        if ((i17 & 196608) == 0) {
                            if (!rVarH.G(qVar)) {
                                i36 = PKIFailureInfo.notAuthorized;
                            }
                            i79 |= i36;
                        }
                        i85 = i79;
                        if ((i19 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i19 & 1)) {
                            rVarH.I();
                            if ((i16 & 1) != 0) {
                                if (i98 != 0) {
                                    pVarC = v.f89493a.c();
                                }
                                if (i25 != 0) {
                                    pVarD = v.f89493a.d();
                                } else {
                                    pVarD = pVar3;
                                }
                                if ((i18 & 8) != 0) {
                                    iA = cc.INSTANCE.a();
                                    i19 &= -7169;
                                } else {
                                    iA = i27;
                                }
                                if ((i18 & 16) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i19 &= -57345;
                                } else {
                                    jA = j16;
                                }
                                if ((i18 & 32) != 0) {
                                    i19 &= -458753;
                                    c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                                }
                                if (i37 != 0) {
                                    v2Var2 = null;
                                }
                                if (i39 != 0) {
                                    z25 = false;
                                } else {
                                    z25 = z15;
                                }
                                if (i46 != 0) {
                                    d0Var9 = null;
                                } else {
                                    d0Var9 = d0Var;
                                }
                                if (i48 != 0) {
                                    d0Var10 = null;
                                } else {
                                    d0Var10 = d0Var2;
                                }
                                if (i55 != 0) {
                                    objE = rVarH.E();
                                    if (objE == p076m2.r.INSTANCE.a()) {
                                        objE = new d0();
                                        rVarH.v(objE);
                                    }
                                    d0Var11 = (d0) objE;
                                } else {
                                    d0Var11 = d0Var3;
                                }
                                if (i58 != 0) {
                                    d0Var12 = null;
                                } else {
                                    d0Var12 = d0Var4;
                                }
                                if (i66 != 0) {
                                    z26 = true;
                                } else {
                                    z26 = z16;
                                }
                                if (i75 != 0) {
                                    f19 = 1.0f;
                                } else {
                                    f19 = f15;
                                }
                                if (i78 != 0) {
                                    long j110 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j110;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                    f26 = 1.0f;
                                    z27 = z25;
                                } else {
                                    long j26 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j26;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    z27 = z25;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    f26 = f16;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                }
                            } else {
                                if (i98 != 0) {
                                    pVarC = v.f89493a.c();
                                }
                                if (i25 != 0) {
                                    pVarD = v.f89493a.d();
                                } else {
                                    pVarD = pVar3;
                                }
                                if ((i18 & 8) != 0) {
                                    iA = cc.INSTANCE.a();
                                    i19 &= -7169;
                                } else {
                                    iA = i27;
                                }
                                if ((i18 & 16) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i19 &= -57345;
                                } else {
                                    jA = j16;
                                }
                                if ((i18 & 32) != 0) {
                                    i19 &= -458753;
                                    c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                                }
                                if (i37 != 0) {
                                    v2Var2 = null;
                                }
                                if (i39 != 0) {
                                    z25 = false;
                                } else {
                                    z25 = z15;
                                }
                                if (i46 != 0) {
                                    d0Var9 = null;
                                } else {
                                    d0Var9 = d0Var;
                                }
                                if (i48 != 0) {
                                    d0Var10 = null;
                                } else {
                                    d0Var10 = d0Var2;
                                }
                                if (i55 != 0) {
                                    objE = rVarH.E();
                                    if (objE == p076m2.r.INSTANCE.a()) {
                                        objE = new d0();
                                        rVarH.v(objE);
                                    }
                                    d0Var11 = (d0) objE;
                                } else {
                                    d0Var11 = d0Var3;
                                }
                                if (i58 != 0) {
                                    d0Var12 = null;
                                } else {
                                    d0Var12 = d0Var4;
                                }
                                if (i66 != 0) {
                                    z26 = true;
                                } else {
                                    z26 = z16;
                                }
                                if (i75 != 0) {
                                    f19 = 1.0f;
                                } else {
                                    f19 = f15;
                                }
                                if (i78 != 0) {
                                    long j111 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j111;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                    f26 = 1.0f;
                                    z27 = z25;
                                } else {
                                    long j27 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j27;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    z27 = z25;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    f26 = f16;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                }
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                            }
                            objE2 = rVarH.E();
                            companion = p076m2.r.INSTANCE;
                            if (objE2 == companion.a()) {
                                objE2 = new d0();
                                rVarH.v(objE2);
                            }
                            final d0 d0Var110 = (d0) objE2;
                            objE3 = rVarH.E();
                            if (objE3 == companion.a()) {
                                objE3 = new d0();
                                rVarH.v(objE3);
                            }
                            final d0 d0Var111 = (d0) objE3;
                            objE4 = rVarH.E();
                            if (objE4 == companion.a()) {
                                objE4 = new d0();
                                rVarH.v(objE4);
                            }
                            final d0 d0Var112 = (d0) objE4;
                            objE5 = rVarH.E();
                            if (objE5 == companion.a()) {
                                objE5 = new d0();
                                rVarH.v(objE5);
                            }
                            final d0 d0Var22 = (d0) objE5;
                            i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                            if (i89 != 1) {
                                rVarH.X(-1148515264);
                                urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                                rVarH.R();
                            } else if (i89 != 2) {
                                rVarH.X(-1148511225);
                                urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                                rVarH.R();
                            } else {
                                if (i89 == 3) {
                                    rVarH.X(-1148518986);
                                    rVarH.R();
                                    throw new oq.p();
                                }
                                rVarH.X(-1148507365);
                                urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                                rVarH.R();
                            }
                            final ur urVar2 = urVarD;
                            objE6 = rVarH.E();
                            if (objE6 == companion.a()) {
                                objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                                rVarH.v(objE6);
                            }
                            final a3 a3Var2 = (a3) objE6;
                            final b bVar2 = new b(a3Var2);
                            final d0 d0Var23 = d0Var13;
                            p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return s.u(baseScaffoldData, urVar2, bVar2, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var110, z28, d0Var15, d0Var111, d0Var112, d0Var22, d0Var16, d0Var23, d0Var14, pVar7, f25, a3Var2, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            v2Var3 = v2Var4;
                            pVar4 = pVar6;
                            i86 = i87;
                            j17 = j18;
                            c4Var2 = c4Var3;
                            z18 = z27;
                            f17 = f26;
                            z19 = z28;
                            d0Var5 = d0Var15;
                            d0Var6 = d0Var16;
                            d0Var7 = d0Var23;
                            d0Var8 = d0Var14;
                            pVar5 = pVar7;
                            f18 = f25;
                        } else {
                            rVarH.O();
                            z18 = z15;
                            d0Var5 = d0Var4;
                            f17 = f16;
                            pVar4 = pVar3;
                            v2Var3 = v2Var2;
                            i86 = i27;
                            c4Var2 = c4VarA;
                            pVar5 = pVarC;
                            j17 = j16;
                            d0Var6 = d0Var;
                            d0Var7 = d0Var2;
                            d0Var8 = d0Var3;
                            z19 = z16;
                            f18 = f15;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new er.p() { // from class: i50.j
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i19 |= 805306368;
                    i55 = i18 & 1024;
                    if (i55 != 0) {
                        i56 = i17 | 6;
                    } else if ((i17 & 6) == 0) {
                        if (rVarH.W(d0Var3)) {
                            i57 = 4;
                        } else {
                            i57 = 2;
                        }
                        i56 = i17 | i57;
                    } else {
                        i56 = i17;
                    }
                    i58 = i18 & 2048;
                    if (i58 != 0) {
                        i56 |= 48;
                    } else if ((i17 & 48) != 0) {
                        if (rVarH.W(d0Var4)) {
                            i59 = 32;
                        } else {
                            i59 = 16;
                        }
                        i56 |= i59;
                    }
                    i65 = i56;
                    i66 = i18 & PKIFailureInfo.certConfirmed;
                    if (i66 != 0) {
                        i68 = i65 | MLKEMEngine.KyberPolyBytes;
                    } else {
                        i67 = i65;
                        if ((i17 & MLKEMEngine.KyberPolyBytes) != 0) {
                            if (rVarH.a(z16)) {
                                i69 = 256;
                            } else {
                                i69 = 128;
                            }
                            i67 |= i69;
                        }
                        i68 = i67;
                    }
                    i75 = i18 & PKIFailureInfo.certRevoked;
                    if (i75 != 0) {
                        i77 = i68 | 3072;
                    } else {
                        i76 = i68;
                        if ((i17 & 3072) == 0) {
                            i77 = i76 | (rVarH.b(f15) ? 2048 : 1024);
                        } else {
                            i77 = i76;
                        }
                    }
                    i78 = i18 & 16384;
                    if (i78 != 0) {
                        i79 = i77;
                        if ((i17 & 24576) == 0) {
                            if (rVarH.b(f16)) {
                                i29 = 16384;
                            }
                            i79 |= i29;
                        }
                        if ((i17 & 196608) == 0) {
                            if (!rVarH.G(qVar)) {
                                i36 = PKIFailureInfo.notAuthorized;
                            }
                            i79 |= i36;
                        }
                        i85 = i79;
                        if ((i19 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i19 & 1)) {
                            rVarH.I();
                            if ((i16 & 1) != 0) {
                                if (i98 != 0) {
                                    pVarC = v.f89493a.c();
                                }
                                if (i25 != 0) {
                                    pVarD = v.f89493a.d();
                                } else {
                                    pVarD = pVar3;
                                }
                                if ((i18 & 8) != 0) {
                                    iA = cc.INSTANCE.a();
                                    i19 &= -7169;
                                } else {
                                    iA = i27;
                                }
                                if ((i18 & 16) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i19 &= -57345;
                                } else {
                                    jA = j16;
                                }
                                if ((i18 & 32) != 0) {
                                    i19 &= -458753;
                                    c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                                }
                                if (i37 != 0) {
                                    v2Var2 = null;
                                }
                                if (i39 != 0) {
                                    z25 = false;
                                } else {
                                    z25 = z15;
                                }
                                if (i46 != 0) {
                                    d0Var9 = null;
                                } else {
                                    d0Var9 = d0Var;
                                }
                                if (i48 != 0) {
                                    d0Var10 = null;
                                } else {
                                    d0Var10 = d0Var2;
                                }
                                if (i55 != 0) {
                                    objE = rVarH.E();
                                    if (objE == p076m2.r.INSTANCE.a()) {
                                        objE = new d0();
                                        rVarH.v(objE);
                                    }
                                    d0Var11 = (d0) objE;
                                } else {
                                    d0Var11 = d0Var3;
                                }
                                if (i58 != 0) {
                                    d0Var12 = null;
                                } else {
                                    d0Var12 = d0Var4;
                                }
                                if (i66 != 0) {
                                    z26 = true;
                                } else {
                                    z26 = z16;
                                }
                                if (i75 != 0) {
                                    f19 = 1.0f;
                                } else {
                                    f19 = f15;
                                }
                                if (i78 != 0) {
                                    long j112 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j112;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                    f26 = 1.0f;
                                    z27 = z25;
                                } else {
                                    long j28 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j28;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    z27 = z25;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    f26 = f16;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                }
                            } else {
                                if (i98 != 0) {
                                    pVarC = v.f89493a.c();
                                }
                                if (i25 != 0) {
                                    pVarD = v.f89493a.d();
                                } else {
                                    pVarD = pVar3;
                                }
                                if ((i18 & 8) != 0) {
                                    iA = cc.INSTANCE.a();
                                    i19 &= -7169;
                                } else {
                                    iA = i27;
                                }
                                if ((i18 & 16) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i19 &= -57345;
                                } else {
                                    jA = j16;
                                }
                                if ((i18 & 32) != 0) {
                                    i19 &= -458753;
                                    c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                                }
                                if (i37 != 0) {
                                    v2Var2 = null;
                                }
                                if (i39 != 0) {
                                    z25 = false;
                                } else {
                                    z25 = z15;
                                }
                                if (i46 != 0) {
                                    d0Var9 = null;
                                } else {
                                    d0Var9 = d0Var;
                                }
                                if (i48 != 0) {
                                    d0Var10 = null;
                                } else {
                                    d0Var10 = d0Var2;
                                }
                                if (i55 != 0) {
                                    objE = rVarH.E();
                                    if (objE == p076m2.r.INSTANCE.a()) {
                                        objE = new d0();
                                        rVarH.v(objE);
                                    }
                                    d0Var11 = (d0) objE;
                                } else {
                                    d0Var11 = d0Var3;
                                }
                                if (i58 != 0) {
                                    d0Var12 = null;
                                } else {
                                    d0Var12 = d0Var4;
                                }
                                if (i66 != 0) {
                                    z26 = true;
                                } else {
                                    z26 = z16;
                                }
                                if (i75 != 0) {
                                    f19 = 1.0f;
                                } else {
                                    f19 = f15;
                                }
                                if (i78 != 0) {
                                    long j113 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j113;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                    f26 = 1.0f;
                                    z27 = z25;
                                } else {
                                    long j29 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j29;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    z27 = z25;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    f26 = f16;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                }
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                            }
                            objE2 = rVarH.E();
                            companion = p076m2.r.INSTANCE;
                            if (objE2 == companion.a()) {
                                objE2 = new d0();
                                rVarH.v(objE2);
                            }
                            final d0 d0Var113 = (d0) objE2;
                            objE3 = rVarH.E();
                            if (objE3 == companion.a()) {
                                objE3 = new d0();
                                rVarH.v(objE3);
                            }
                            final d0 d0Var114 = (d0) objE3;
                            objE4 = rVarH.E();
                            if (objE4 == companion.a()) {
                                objE4 = new d0();
                                rVarH.v(objE4);
                            }
                            final d0 d0Var115 = (d0) objE4;
                            objE5 = rVarH.E();
                            if (objE5 == companion.a()) {
                                objE5 = new d0();
                                rVarH.v(objE5);
                            }
                            final d0 d0Var24 = (d0) objE5;
                            i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                            if (i89 != 1) {
                                rVarH.X(-1148515264);
                                urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                                rVarH.R();
                            } else if (i89 != 2) {
                                rVarH.X(-1148511225);
                                urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                                rVarH.R();
                            } else {
                                if (i89 == 3) {
                                    rVarH.X(-1148518986);
                                    rVarH.R();
                                    throw new oq.p();
                                }
                                rVarH.X(-1148507365);
                                urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                                rVarH.R();
                            }
                            final ur urVar3 = urVarD;
                            objE6 = rVarH.E();
                            if (objE6 == companion.a()) {
                                objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                                rVarH.v(objE6);
                            }
                            final a3 a3Var3 = (a3) objE6;
                            final b bVar3 = new b(a3Var3);
                            final d0 d0Var25 = d0Var13;
                            p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return s.u(baseScaffoldData, urVar3, bVar3, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var113, z28, d0Var15, d0Var114, d0Var115, d0Var24, d0Var16, d0Var25, d0Var14, pVar7, f25, a3Var3, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            v2Var3 = v2Var4;
                            pVar4 = pVar6;
                            i86 = i87;
                            j17 = j18;
                            c4Var2 = c4Var3;
                            z18 = z27;
                            f17 = f26;
                            z19 = z28;
                            d0Var5 = d0Var15;
                            d0Var6 = d0Var16;
                            d0Var7 = d0Var25;
                            d0Var8 = d0Var14;
                            pVar5 = pVar7;
                            f18 = f25;
                        } else {
                            rVarH.O();
                            z18 = z15;
                            d0Var5 = d0Var4;
                            f17 = f16;
                            pVar4 = pVar3;
                            v2Var3 = v2Var2;
                            i86 = i27;
                            c4Var2 = c4VarA;
                            pVar5 = pVarC;
                            j17 = j16;
                            d0Var6 = d0Var;
                            d0Var7 = d0Var2;
                            d0Var8 = d0Var3;
                            z19 = z16;
                            f18 = f15;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new er.p() { // from class: i50.j
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i79 = i77 | 24576;
                    if ((i17 & 196608) == 0) {
                        if (!rVarH.G(qVar)) {
                            i36 = PKIFailureInfo.notAuthorized;
                        }
                        i79 |= i36;
                    }
                    i85 = i79;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i19 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j114 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j114;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j210 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j210;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        } else {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j115 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j115;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j211 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j211;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                        }
                        objE2 = rVarH.E();
                        companion = p076m2.r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        final d0 d0Var116 = (d0) objE2;
                        objE3 = rVarH.E();
                        if (objE3 == companion.a()) {
                            objE3 = new d0();
                            rVarH.v(objE3);
                        }
                        final d0 d0Var117 = (d0) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = new d0();
                            rVarH.v(objE4);
                        }
                        final d0 d0Var118 = (d0) objE4;
                        objE5 = rVarH.E();
                        if (objE5 == companion.a()) {
                            objE5 = new d0();
                            rVarH.v(objE5);
                        }
                        final d0 d0Var26 = (d0) objE5;
                        i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                        if (i89 != 1) {
                            rVarH.X(-1148515264);
                            urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else if (i89 != 2) {
                            rVarH.X(-1148511225);
                            urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else {
                            if (i89 == 3) {
                                rVarH.X(-1148518986);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(-1148507365);
                            urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                            rVarH.R();
                        }
                        final ur urVar4 = urVarD;
                        objE6 = rVarH.E();
                        if (objE6 == companion.a()) {
                            objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                            rVarH.v(objE6);
                        }
                        final a3 a3Var4 = (a3) objE6;
                        final b bVar4 = new b(a3Var4);
                        final d0 d0Var27 = d0Var13;
                        p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.u(baseScaffoldData, urVar4, bVar4, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var116, z28, d0Var15, d0Var117, d0Var118, d0Var26, d0Var16, d0Var27, d0Var14, pVar7, f25, a3Var4, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        v2Var3 = v2Var4;
                        pVar4 = pVar6;
                        i86 = i87;
                        j17 = j18;
                        c4Var2 = c4Var3;
                        z18 = z27;
                        f17 = f26;
                        z19 = z28;
                        d0Var5 = d0Var15;
                        d0Var6 = d0Var16;
                        d0Var7 = d0Var27;
                        d0Var8 = d0Var14;
                        pVar5 = pVar7;
                        f18 = f25;
                    } else {
                        rVarH.O();
                        z18 = z15;
                        d0Var5 = d0Var4;
                        f17 = f16;
                        pVar4 = pVar3;
                        v2Var3 = v2Var2;
                        i86 = i27;
                        c4Var2 = c4VarA;
                        pVar5 = pVarC;
                        j17 = j16;
                        d0Var6 = d0Var;
                        d0Var7 = d0Var2;
                        d0Var8 = d0Var3;
                        z19 = z16;
                        f18 = f15;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: i50.j
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 100663296;
                i48 = i18 & 512;
                if (i48 != 0) {
                    if ((i16 & 805306368) == 0) {
                        if (rVarH.W(d0Var2)) {
                            i49 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i49 = 268435456;
                        }
                        i19 |= i49;
                    }
                    i55 = i18 & 1024;
                    if (i55 != 0) {
                        i56 = i17 | 6;
                    } else if ((i17 & 6) == 0) {
                        if (rVarH.W(d0Var3)) {
                            i57 = 4;
                        } else {
                            i57 = 2;
                        }
                        i56 = i17 | i57;
                    } else {
                        i56 = i17;
                    }
                    i58 = i18 & 2048;
                    if (i58 != 0) {
                        i56 |= 48;
                    } else if ((i17 & 48) != 0) {
                        if (rVarH.W(d0Var4)) {
                            i59 = 32;
                        } else {
                            i59 = 16;
                        }
                        i56 |= i59;
                    }
                    i65 = i56;
                    i66 = i18 & PKIFailureInfo.certConfirmed;
                    if (i66 != 0) {
                        i68 = i65 | MLKEMEngine.KyberPolyBytes;
                    } else {
                        i67 = i65;
                        if ((i17 & MLKEMEngine.KyberPolyBytes) != 0) {
                            if (rVarH.a(z16)) {
                                i69 = 256;
                            } else {
                                i69 = 128;
                            }
                            i67 |= i69;
                        }
                        i68 = i67;
                    }
                    i75 = i18 & PKIFailureInfo.certRevoked;
                    if (i75 != 0) {
                        i77 = i68 | 3072;
                    } else {
                        i76 = i68;
                        if ((i17 & 3072) == 0) {
                            i77 = i76 | (rVarH.b(f15) ? 2048 : 1024);
                        } else {
                            i77 = i76;
                        }
                    }
                    i78 = i18 & 16384;
                    if (i78 != 0) {
                        i79 = i77;
                        if ((i17 & 24576) == 0) {
                            if (rVarH.b(f16)) {
                                i29 = 16384;
                            }
                            i79 |= i29;
                        }
                        if ((i17 & 196608) == 0) {
                            if (!rVarH.G(qVar)) {
                                i36 = PKIFailureInfo.notAuthorized;
                            }
                            i79 |= i36;
                        }
                        i85 = i79;
                        if ((i19 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i19 & 1)) {
                            rVarH.I();
                            if ((i16 & 1) != 0) {
                                if (i98 != 0) {
                                    pVarC = v.f89493a.c();
                                }
                                if (i25 != 0) {
                                    pVarD = v.f89493a.d();
                                } else {
                                    pVarD = pVar3;
                                }
                                if ((i18 & 8) != 0) {
                                    iA = cc.INSTANCE.a();
                                    i19 &= -7169;
                                } else {
                                    iA = i27;
                                }
                                if ((i18 & 16) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i19 &= -57345;
                                } else {
                                    jA = j16;
                                }
                                if ((i18 & 32) != 0) {
                                    i19 &= -458753;
                                    c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                                }
                                if (i37 != 0) {
                                    v2Var2 = null;
                                }
                                if (i39 != 0) {
                                    z25 = false;
                                } else {
                                    z25 = z15;
                                }
                                if (i46 != 0) {
                                    d0Var9 = null;
                                } else {
                                    d0Var9 = d0Var;
                                }
                                if (i48 != 0) {
                                    d0Var10 = null;
                                } else {
                                    d0Var10 = d0Var2;
                                }
                                if (i55 != 0) {
                                    objE = rVarH.E();
                                    if (objE == p076m2.r.INSTANCE.a()) {
                                        objE = new d0();
                                        rVarH.v(objE);
                                    }
                                    d0Var11 = (d0) objE;
                                } else {
                                    d0Var11 = d0Var3;
                                }
                                if (i58 != 0) {
                                    d0Var12 = null;
                                } else {
                                    d0Var12 = d0Var4;
                                }
                                if (i66 != 0) {
                                    z26 = true;
                                } else {
                                    z26 = z16;
                                }
                                if (i75 != 0) {
                                    f19 = 1.0f;
                                } else {
                                    f19 = f15;
                                }
                                if (i78 != 0) {
                                    long j116 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j116;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                    f26 = 1.0f;
                                    z27 = z25;
                                } else {
                                    long j212 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j212;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    z27 = z25;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    f26 = f16;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                }
                            } else {
                                if (i98 != 0) {
                                    pVarC = v.f89493a.c();
                                }
                                if (i25 != 0) {
                                    pVarD = v.f89493a.d();
                                } else {
                                    pVarD = pVar3;
                                }
                                if ((i18 & 8) != 0) {
                                    iA = cc.INSTANCE.a();
                                    i19 &= -7169;
                                } else {
                                    iA = i27;
                                }
                                if ((i18 & 16) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i19 &= -57345;
                                } else {
                                    jA = j16;
                                }
                                if ((i18 & 32) != 0) {
                                    i19 &= -458753;
                                    c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                                }
                                if (i37 != 0) {
                                    v2Var2 = null;
                                }
                                if (i39 != 0) {
                                    z25 = false;
                                } else {
                                    z25 = z15;
                                }
                                if (i46 != 0) {
                                    d0Var9 = null;
                                } else {
                                    d0Var9 = d0Var;
                                }
                                if (i48 != 0) {
                                    d0Var10 = null;
                                } else {
                                    d0Var10 = d0Var2;
                                }
                                if (i55 != 0) {
                                    objE = rVarH.E();
                                    if (objE == p076m2.r.INSTANCE.a()) {
                                        objE = new d0();
                                        rVarH.v(objE);
                                    }
                                    d0Var11 = (d0) objE;
                                } else {
                                    d0Var11 = d0Var3;
                                }
                                if (i58 != 0) {
                                    d0Var12 = null;
                                } else {
                                    d0Var12 = d0Var4;
                                }
                                if (i66 != 0) {
                                    z26 = true;
                                } else {
                                    z26 = z16;
                                }
                                if (i75 != 0) {
                                    f19 = 1.0f;
                                } else {
                                    f19 = f15;
                                }
                                if (i78 != 0) {
                                    long j117 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j117;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                    f26 = 1.0f;
                                    z27 = z25;
                                } else {
                                    long j213 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j213;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    z27 = z25;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    f26 = f16;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                }
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                            }
                            objE2 = rVarH.E();
                            companion = p076m2.r.INSTANCE;
                            if (objE2 == companion.a()) {
                                objE2 = new d0();
                                rVarH.v(objE2);
                            }
                            final d0 d0Var119 = (d0) objE2;
                            objE3 = rVarH.E();
                            if (objE3 == companion.a()) {
                                objE3 = new d0();
                                rVarH.v(objE3);
                            }
                            final d0 d0Var1110 = (d0) objE3;
                            objE4 = rVarH.E();
                            if (objE4 == companion.a()) {
                                objE4 = new d0();
                                rVarH.v(objE4);
                            }
                            final d0 d0Var1111 = (d0) objE4;
                            objE5 = rVarH.E();
                            if (objE5 == companion.a()) {
                                objE5 = new d0();
                                rVarH.v(objE5);
                            }
                            final d0 d0Var28 = (d0) objE5;
                            i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                            if (i89 != 1) {
                                rVarH.X(-1148515264);
                                urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                                rVarH.R();
                            } else if (i89 != 2) {
                                rVarH.X(-1148511225);
                                urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                                rVarH.R();
                            } else {
                                if (i89 == 3) {
                                    rVarH.X(-1148518986);
                                    rVarH.R();
                                    throw new oq.p();
                                }
                                rVarH.X(-1148507365);
                                urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                                rVarH.R();
                            }
                            final ur urVar5 = urVarD;
                            objE6 = rVarH.E();
                            if (objE6 == companion.a()) {
                                objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                                rVarH.v(objE6);
                            }
                            final a3 a3Var5 = (a3) objE6;
                            final b bVar5 = new b(a3Var5);
                            final d0 d0Var29 = d0Var13;
                            p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return s.u(baseScaffoldData, urVar5, bVar5, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var119, z28, d0Var15, d0Var1110, d0Var1111, d0Var28, d0Var16, d0Var29, d0Var14, pVar7, f25, a3Var5, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            v2Var3 = v2Var4;
                            pVar4 = pVar6;
                            i86 = i87;
                            j17 = j18;
                            c4Var2 = c4Var3;
                            z18 = z27;
                            f17 = f26;
                            z19 = z28;
                            d0Var5 = d0Var15;
                            d0Var6 = d0Var16;
                            d0Var7 = d0Var29;
                            d0Var8 = d0Var14;
                            pVar5 = pVar7;
                            f18 = f25;
                        } else {
                            rVarH.O();
                            z18 = z15;
                            d0Var5 = d0Var4;
                            f17 = f16;
                            pVar4 = pVar3;
                            v2Var3 = v2Var2;
                            i86 = i27;
                            c4Var2 = c4VarA;
                            pVar5 = pVarC;
                            j17 = j16;
                            d0Var6 = d0Var;
                            d0Var7 = d0Var2;
                            d0Var8 = d0Var3;
                            z19 = z16;
                            f18 = f15;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new er.p() { // from class: i50.j
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i79 = i77 | 24576;
                    if ((i17 & 196608) == 0) {
                        if (!rVarH.G(qVar)) {
                            i36 = PKIFailureInfo.notAuthorized;
                        }
                        i79 |= i36;
                    }
                    i85 = i79;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i19 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j118 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j118;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j214 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j214;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        } else {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j119 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j119;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j215 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j215;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                        }
                        objE2 = rVarH.E();
                        companion = p076m2.r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        final d0 d0Var1112 = (d0) objE2;
                        objE3 = rVarH.E();
                        if (objE3 == companion.a()) {
                            objE3 = new d0();
                            rVarH.v(objE3);
                        }
                        final d0 d0Var1113 = (d0) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = new d0();
                            rVarH.v(objE4);
                        }
                        final d0 d0Var1114 = (d0) objE4;
                        objE5 = rVarH.E();
                        if (objE5 == companion.a()) {
                            objE5 = new d0();
                            rVarH.v(objE5);
                        }
                        final d0 d0Var210 = (d0) objE5;
                        i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                        if (i89 != 1) {
                            rVarH.X(-1148515264);
                            urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else if (i89 != 2) {
                            rVarH.X(-1148511225);
                            urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else {
                            if (i89 == 3) {
                                rVarH.X(-1148518986);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(-1148507365);
                            urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                            rVarH.R();
                        }
                        final ur urVar6 = urVarD;
                        objE6 = rVarH.E();
                        if (objE6 == companion.a()) {
                            objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                            rVarH.v(objE6);
                        }
                        final a3 a3Var6 = (a3) objE6;
                        final b bVar6 = new b(a3Var6);
                        final d0 d0Var211 = d0Var13;
                        p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.u(baseScaffoldData, urVar6, bVar6, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var1112, z28, d0Var15, d0Var1113, d0Var1114, d0Var210, d0Var16, d0Var211, d0Var14, pVar7, f25, a3Var6, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        v2Var3 = v2Var4;
                        pVar4 = pVar6;
                        i86 = i87;
                        j17 = j18;
                        c4Var2 = c4Var3;
                        z18 = z27;
                        f17 = f26;
                        z19 = z28;
                        d0Var5 = d0Var15;
                        d0Var6 = d0Var16;
                        d0Var7 = d0Var211;
                        d0Var8 = d0Var14;
                        pVar5 = pVar7;
                        f18 = f25;
                    } else {
                        rVarH.O();
                        z18 = z15;
                        d0Var5 = d0Var4;
                        f17 = f16;
                        pVar4 = pVar3;
                        v2Var3 = v2Var2;
                        i86 = i27;
                        c4Var2 = c4VarA;
                        pVar5 = pVarC;
                        j17 = j16;
                        d0Var6 = d0Var;
                        d0Var7 = d0Var2;
                        d0Var8 = d0Var3;
                        z19 = z16;
                        f18 = f15;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: i50.j
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 805306368;
                i55 = i18 & 1024;
                if (i55 != 0) {
                    i56 = i17 | 6;
                } else if ((i17 & 6) == 0) {
                    if (rVarH.W(d0Var3)) {
                        i57 = 4;
                    } else {
                        i57 = 2;
                    }
                    i56 = i17 | i57;
                } else {
                    i56 = i17;
                }
                i58 = i18 & 2048;
                if (i58 != 0) {
                    i56 |= 48;
                } else if ((i17 & 48) != 0) {
                    if (rVarH.W(d0Var4)) {
                        i59 = 32;
                    } else {
                        i59 = 16;
                    }
                    i56 |= i59;
                }
                i65 = i56;
                i66 = i18 & PKIFailureInfo.certConfirmed;
                if (i66 != 0) {
                    i68 = i65 | MLKEMEngine.KyberPolyBytes;
                } else {
                    i67 = i65;
                    if ((i17 & MLKEMEngine.KyberPolyBytes) != 0) {
                        if (rVarH.a(z16)) {
                            i69 = 256;
                        } else {
                            i69 = 128;
                        }
                        i67 |= i69;
                    }
                    i68 = i67;
                }
                i75 = i18 & PKIFailureInfo.certRevoked;
                if (i75 != 0) {
                    i77 = i68 | 3072;
                } else {
                    i76 = i68;
                    if ((i17 & 3072) == 0) {
                        i77 = i76 | (rVarH.b(f15) ? 2048 : 1024);
                    } else {
                        i77 = i76;
                    }
                }
                i78 = i18 & 16384;
                if (i78 != 0) {
                    i79 = i77;
                    if ((i17 & 24576) == 0) {
                        if (rVarH.b(f16)) {
                            i29 = 16384;
                        }
                        i79 |= i29;
                    }
                    if ((i17 & 196608) == 0) {
                        if (!rVarH.G(qVar)) {
                            i36 = PKIFailureInfo.notAuthorized;
                        }
                        i79 |= i36;
                    }
                    i85 = i79;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i19 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j1110 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j1110;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j216 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j216;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        } else {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j1111 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j1111;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j217 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j217;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                        }
                        objE2 = rVarH.E();
                        companion = p076m2.r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        final d0 d0Var1115 = (d0) objE2;
                        objE3 = rVarH.E();
                        if (objE3 == companion.a()) {
                            objE3 = new d0();
                            rVarH.v(objE3);
                        }
                        final d0 d0Var1116 = (d0) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = new d0();
                            rVarH.v(objE4);
                        }
                        final d0 d0Var1117 = (d0) objE4;
                        objE5 = rVarH.E();
                        if (objE5 == companion.a()) {
                            objE5 = new d0();
                            rVarH.v(objE5);
                        }
                        final d0 d0Var212 = (d0) objE5;
                        i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                        if (i89 != 1) {
                            rVarH.X(-1148515264);
                            urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else if (i89 != 2) {
                            rVarH.X(-1148511225);
                            urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else {
                            if (i89 == 3) {
                                rVarH.X(-1148518986);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(-1148507365);
                            urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                            rVarH.R();
                        }
                        final ur urVar7 = urVarD;
                        objE6 = rVarH.E();
                        if (objE6 == companion.a()) {
                            objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                            rVarH.v(objE6);
                        }
                        final a3 a3Var7 = (a3) objE6;
                        final b bVar7 = new b(a3Var7);
                        final d0 d0Var213 = d0Var13;
                        p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.u(baseScaffoldData, urVar7, bVar7, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var1115, z28, d0Var15, d0Var1116, d0Var1117, d0Var212, d0Var16, d0Var213, d0Var14, pVar7, f25, a3Var7, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        v2Var3 = v2Var4;
                        pVar4 = pVar6;
                        i86 = i87;
                        j17 = j18;
                        c4Var2 = c4Var3;
                        z18 = z27;
                        f17 = f26;
                        z19 = z28;
                        d0Var5 = d0Var15;
                        d0Var6 = d0Var16;
                        d0Var7 = d0Var213;
                        d0Var8 = d0Var14;
                        pVar5 = pVar7;
                        f18 = f25;
                    } else {
                        rVarH.O();
                        z18 = z15;
                        d0Var5 = d0Var4;
                        f17 = f16;
                        pVar4 = pVar3;
                        v2Var3 = v2Var2;
                        i86 = i27;
                        c4Var2 = c4VarA;
                        pVar5 = pVarC;
                        j17 = j16;
                        d0Var6 = d0Var;
                        d0Var7 = d0Var2;
                        d0Var8 = d0Var3;
                        z19 = z16;
                        f18 = f15;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: i50.j
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i79 = i77 | 24576;
                if ((i17 & 196608) == 0) {
                    if (!rVarH.G(qVar)) {
                        i36 = PKIFailureInfo.notAuthorized;
                    }
                    i79 |= i36;
                }
                i85 = i79;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i19 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j1112 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j1112;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j218 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j218;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    } else {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j1113 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j1113;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j219 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j219;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                    }
                    objE2 = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new d0();
                        rVarH.v(objE2);
                    }
                    final d0 d0Var1118 = (d0) objE2;
                    objE3 = rVarH.E();
                    if (objE3 == companion.a()) {
                        objE3 = new d0();
                        rVarH.v(objE3);
                    }
                    final d0 d0Var1119 = (d0) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = new d0();
                        rVarH.v(objE4);
                    }
                    final d0 d0Var11110 = (d0) objE4;
                    objE5 = rVarH.E();
                    if (objE5 == companion.a()) {
                        objE5 = new d0();
                        rVarH.v(objE5);
                    }
                    final d0 d0Var214 = (d0) objE5;
                    i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                    if (i89 != 1) {
                        rVarH.X(-1148515264);
                        urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else if (i89 != 2) {
                        rVarH.X(-1148511225);
                        urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else {
                        if (i89 == 3) {
                            rVarH.X(-1148518986);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(-1148507365);
                        urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                        rVarH.R();
                    }
                    final ur urVar8 = urVarD;
                    objE6 = rVarH.E();
                    if (objE6 == companion.a()) {
                        objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                        rVarH.v(objE6);
                    }
                    final a3 a3Var8 = (a3) objE6;
                    final b bVar8 = new b(a3Var8);
                    final d0 d0Var215 = d0Var13;
                    p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.u(baseScaffoldData, urVar8, bVar8, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var1118, z28, d0Var15, d0Var1119, d0Var11110, d0Var214, d0Var16, d0Var215, d0Var14, pVar7, f25, a3Var8, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    v2Var3 = v2Var4;
                    pVar4 = pVar6;
                    i86 = i87;
                    j17 = j18;
                    c4Var2 = c4Var3;
                    z18 = z27;
                    f17 = f26;
                    z19 = z28;
                    d0Var5 = d0Var15;
                    d0Var6 = d0Var16;
                    d0Var7 = d0Var215;
                    d0Var8 = d0Var14;
                    pVar5 = pVar7;
                    f18 = f25;
                } else {
                    rVarH.O();
                    z18 = z15;
                    d0Var5 = d0Var4;
                    f17 = f16;
                    pVar4 = pVar3;
                    v2Var3 = v2Var2;
                    i86 = i27;
                    c4Var2 = c4VarA;
                    pVar5 = pVarC;
                    j17 = j16;
                    d0Var6 = d0Var;
                    d0Var7 = d0Var2;
                    d0Var8 = d0Var3;
                    z19 = z16;
                    f18 = f15;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: i50.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= MLKEMEngine.KyberPolyBytes;
            pVar3 = pVar2;
            if ((i16 & 3072) == 0) {
                if ((i18 & 8) == 0) {
                    i27 = i15;
                    if (rVarH.c(i27)) {
                        i97 = 2048;
                    }
                    i19 |= i97;
                } else {
                    i27 = i15;
                }
                i97 = 1024;
                i19 |= i97;
            } else {
                i27 = i15;
            }
            i28 = i16 & 24576;
            i29 = PKIFailureInfo.certRevoked;
            if (i28 == 0) {
                j16 = j15;
                if ((i18 & 16) == 0) {
                    i96 = 8192;
                } else {
                    i96 = 8192;
                }
                i19 |= i96;
            } else {
                j16 = j15;
            }
            i35 = i16 & 196608;
            i36 = PKIFailureInfo.unsupportedVersion;
            if (i35 == 0) {
                c4VarA = c4Var;
                if ((i18 & 32) == 0) {
                    i95 = PKIFailureInfo.notAuthorized;
                } else {
                    i95 = PKIFailureInfo.notAuthorized;
                }
                i19 |= i95;
            } else {
                c4VarA = c4Var;
            }
            i37 = i18 & 64;
            if (i37 != 0) {
                i19 |= 1572864;
                v2Var2 = v2Var;
            } else {
                v2Var2 = v2Var;
                if ((i16 & 1572864) == 0) {
                    if (rVarH.G(v2Var2)) {
                        i38 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i38 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i38;
                }
            }
            i39 = i18 & 128;
            if (i39 != 0) {
                i19 |= 12582912;
            } else if ((i16 & 12582912) == 0) {
                if (rVarH.a(z15)) {
                    i45 = 8388608;
                } else {
                    i45 = 4194304;
                }
                i19 |= i45;
            }
            i46 = i18 & 256;
            if (i46 != 0) {
                if ((i16 & 100663296) == 0) {
                    if (rVarH.W(d0Var)) {
                        i47 = 67108864;
                    } else {
                        i47 = 33554432;
                    }
                    i19 |= i47;
                }
                i48 = i18 & 512;
                if (i48 != 0) {
                    if ((i16 & 805306368) == 0) {
                        if (rVarH.W(d0Var2)) {
                            i49 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i49 = 268435456;
                        }
                        i19 |= i49;
                    }
                    i55 = i18 & 1024;
                    if (i55 != 0) {
                        i56 = i17 | 6;
                    } else if ((i17 & 6) == 0) {
                        if (rVarH.W(d0Var3)) {
                            i57 = 4;
                        } else {
                            i57 = 2;
                        }
                        i56 = i17 | i57;
                    } else {
                        i56 = i17;
                    }
                    i58 = i18 & 2048;
                    if (i58 != 0) {
                        i56 |= 48;
                    } else if ((i17 & 48) != 0) {
                        if (rVarH.W(d0Var4)) {
                            i59 = 32;
                        } else {
                            i59 = 16;
                        }
                        i56 |= i59;
                    }
                    i65 = i56;
                    i66 = i18 & PKIFailureInfo.certConfirmed;
                    if (i66 != 0) {
                        i68 = i65 | MLKEMEngine.KyberPolyBytes;
                    } else {
                        i67 = i65;
                        if ((i17 & MLKEMEngine.KyberPolyBytes) != 0) {
                            if (rVarH.a(z16)) {
                                i69 = 256;
                            } else {
                                i69 = 128;
                            }
                            i67 |= i69;
                        }
                        i68 = i67;
                    }
                    i75 = i18 & PKIFailureInfo.certRevoked;
                    if (i75 != 0) {
                        i77 = i68 | 3072;
                    } else {
                        i76 = i68;
                        if ((i17 & 3072) == 0) {
                            i77 = i76 | (rVarH.b(f15) ? 2048 : 1024);
                        } else {
                            i77 = i76;
                        }
                    }
                    i78 = i18 & 16384;
                    if (i78 != 0) {
                        i79 = i77;
                        if ((i17 & 24576) == 0) {
                            if (rVarH.b(f16)) {
                                i29 = 16384;
                            }
                            i79 |= i29;
                        }
                        if ((i17 & 196608) == 0) {
                            if (!rVarH.G(qVar)) {
                                i36 = PKIFailureInfo.notAuthorized;
                            }
                            i79 |= i36;
                        }
                        i85 = i79;
                        if ((i19 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i19 & 1)) {
                            rVarH.I();
                            if ((i16 & 1) != 0) {
                                if (i98 != 0) {
                                    pVarC = v.f89493a.c();
                                }
                                if (i25 != 0) {
                                    pVarD = v.f89493a.d();
                                } else {
                                    pVarD = pVar3;
                                }
                                if ((i18 & 8) != 0) {
                                    iA = cc.INSTANCE.a();
                                    i19 &= -7169;
                                } else {
                                    iA = i27;
                                }
                                if ((i18 & 16) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i19 &= -57345;
                                } else {
                                    jA = j16;
                                }
                                if ((i18 & 32) != 0) {
                                    i19 &= -458753;
                                    c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                                }
                                if (i37 != 0) {
                                    v2Var2 = null;
                                }
                                if (i39 != 0) {
                                    z25 = false;
                                } else {
                                    z25 = z15;
                                }
                                if (i46 != 0) {
                                    d0Var9 = null;
                                } else {
                                    d0Var9 = d0Var;
                                }
                                if (i48 != 0) {
                                    d0Var10 = null;
                                } else {
                                    d0Var10 = d0Var2;
                                }
                                if (i55 != 0) {
                                    objE = rVarH.E();
                                    if (objE == p076m2.r.INSTANCE.a()) {
                                        objE = new d0();
                                        rVarH.v(objE);
                                    }
                                    d0Var11 = (d0) objE;
                                } else {
                                    d0Var11 = d0Var3;
                                }
                                if (i58 != 0) {
                                    d0Var12 = null;
                                } else {
                                    d0Var12 = d0Var4;
                                }
                                if (i66 != 0) {
                                    z26 = true;
                                } else {
                                    z26 = z16;
                                }
                                if (i75 != 0) {
                                    f19 = 1.0f;
                                } else {
                                    f19 = f15;
                                }
                                if (i78 != 0) {
                                    long j1114 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j1114;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                    f26 = 1.0f;
                                    z27 = z25;
                                } else {
                                    long j2110 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j2110;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    z27 = z25;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    f26 = f16;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                }
                            } else {
                                if (i98 != 0) {
                                    pVarC = v.f89493a.c();
                                }
                                if (i25 != 0) {
                                    pVarD = v.f89493a.d();
                                } else {
                                    pVarD = pVar3;
                                }
                                if ((i18 & 8) != 0) {
                                    iA = cc.INSTANCE.a();
                                    i19 &= -7169;
                                } else {
                                    iA = i27;
                                }
                                if ((i18 & 16) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i19 &= -57345;
                                } else {
                                    jA = j16;
                                }
                                if ((i18 & 32) != 0) {
                                    i19 &= -458753;
                                    c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                                }
                                if (i37 != 0) {
                                    v2Var2 = null;
                                }
                                if (i39 != 0) {
                                    z25 = false;
                                } else {
                                    z25 = z15;
                                }
                                if (i46 != 0) {
                                    d0Var9 = null;
                                } else {
                                    d0Var9 = d0Var;
                                }
                                if (i48 != 0) {
                                    d0Var10 = null;
                                } else {
                                    d0Var10 = d0Var2;
                                }
                                if (i55 != 0) {
                                    objE = rVarH.E();
                                    if (objE == p076m2.r.INSTANCE.a()) {
                                        objE = new d0();
                                        rVarH.v(objE);
                                    }
                                    d0Var11 = (d0) objE;
                                } else {
                                    d0Var11 = d0Var3;
                                }
                                if (i58 != 0) {
                                    d0Var12 = null;
                                } else {
                                    d0Var12 = d0Var4;
                                }
                                if (i66 != 0) {
                                    z26 = true;
                                } else {
                                    z26 = z16;
                                }
                                if (i75 != 0) {
                                    f19 = 1.0f;
                                } else {
                                    f19 = f15;
                                }
                                if (i78 != 0) {
                                    long j1115 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j1115;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                    f26 = 1.0f;
                                    z27 = z25;
                                } else {
                                    long j2111 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j2111;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    z27 = z25;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    f26 = f16;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                }
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                            }
                            objE2 = rVarH.E();
                            companion = p076m2.r.INSTANCE;
                            if (objE2 == companion.a()) {
                                objE2 = new d0();
                                rVarH.v(objE2);
                            }
                            final d0 d0Var11111 = (d0) objE2;
                            objE3 = rVarH.E();
                            if (objE3 == companion.a()) {
                                objE3 = new d0();
                                rVarH.v(objE3);
                            }
                            final d0 d0Var11112 = (d0) objE3;
                            objE4 = rVarH.E();
                            if (objE4 == companion.a()) {
                                objE4 = new d0();
                                rVarH.v(objE4);
                            }
                            final d0 d0Var11113 = (d0) objE4;
                            objE5 = rVarH.E();
                            if (objE5 == companion.a()) {
                                objE5 = new d0();
                                rVarH.v(objE5);
                            }
                            final d0 d0Var216 = (d0) objE5;
                            i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                            if (i89 != 1) {
                                rVarH.X(-1148515264);
                                urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                                rVarH.R();
                            } else if (i89 != 2) {
                                rVarH.X(-1148511225);
                                urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                                rVarH.R();
                            } else {
                                if (i89 == 3) {
                                    rVarH.X(-1148518986);
                                    rVarH.R();
                                    throw new oq.p();
                                }
                                rVarH.X(-1148507365);
                                urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                                rVarH.R();
                            }
                            final ur urVar9 = urVarD;
                            objE6 = rVarH.E();
                            if (objE6 == companion.a()) {
                                objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                                rVarH.v(objE6);
                            }
                            final a3 a3Var9 = (a3) objE6;
                            final b bVar9 = new b(a3Var9);
                            final d0 d0Var217 = d0Var13;
                            p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return s.u(baseScaffoldData, urVar9, bVar9, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var11111, z28, d0Var15, d0Var11112, d0Var11113, d0Var216, d0Var16, d0Var217, d0Var14, pVar7, f25, a3Var9, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            v2Var3 = v2Var4;
                            pVar4 = pVar6;
                            i86 = i87;
                            j17 = j18;
                            c4Var2 = c4Var3;
                            z18 = z27;
                            f17 = f26;
                            z19 = z28;
                            d0Var5 = d0Var15;
                            d0Var6 = d0Var16;
                            d0Var7 = d0Var217;
                            d0Var8 = d0Var14;
                            pVar5 = pVar7;
                            f18 = f25;
                        } else {
                            rVarH.O();
                            z18 = z15;
                            d0Var5 = d0Var4;
                            f17 = f16;
                            pVar4 = pVar3;
                            v2Var3 = v2Var2;
                            i86 = i27;
                            c4Var2 = c4VarA;
                            pVar5 = pVarC;
                            j17 = j16;
                            d0Var6 = d0Var;
                            d0Var7 = d0Var2;
                            d0Var8 = d0Var3;
                            z19 = z16;
                            f18 = f15;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new er.p() { // from class: i50.j
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i79 = i77 | 24576;
                    if ((i17 & 196608) == 0) {
                        if (!rVarH.G(qVar)) {
                            i36 = PKIFailureInfo.notAuthorized;
                        }
                        i79 |= i36;
                    }
                    i85 = i79;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i19 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j1116 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j1116;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j2112 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j2112;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        } else {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j1117 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j1117;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j2113 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j2113;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                        }
                        objE2 = rVarH.E();
                        companion = p076m2.r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        final d0 d0Var11114 = (d0) objE2;
                        objE3 = rVarH.E();
                        if (objE3 == companion.a()) {
                            objE3 = new d0();
                            rVarH.v(objE3);
                        }
                        final d0 d0Var11115 = (d0) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = new d0();
                            rVarH.v(objE4);
                        }
                        final d0 d0Var11116 = (d0) objE4;
                        objE5 = rVarH.E();
                        if (objE5 == companion.a()) {
                            objE5 = new d0();
                            rVarH.v(objE5);
                        }
                        final d0 d0Var218 = (d0) objE5;
                        i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                        if (i89 != 1) {
                            rVarH.X(-1148515264);
                            urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else if (i89 != 2) {
                            rVarH.X(-1148511225);
                            urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else {
                            if (i89 == 3) {
                                rVarH.X(-1148518986);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(-1148507365);
                            urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                            rVarH.R();
                        }
                        final ur urVar10 = urVarD;
                        objE6 = rVarH.E();
                        if (objE6 == companion.a()) {
                            objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                            rVarH.v(objE6);
                        }
                        final a3 a3Var10 = (a3) objE6;
                        final b bVar10 = new b(a3Var10);
                        final d0 d0Var219 = d0Var13;
                        p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.u(baseScaffoldData, urVar10, bVar10, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var11114, z28, d0Var15, d0Var11115, d0Var11116, d0Var218, d0Var16, d0Var219, d0Var14, pVar7, f25, a3Var10, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        v2Var3 = v2Var4;
                        pVar4 = pVar6;
                        i86 = i87;
                        j17 = j18;
                        c4Var2 = c4Var3;
                        z18 = z27;
                        f17 = f26;
                        z19 = z28;
                        d0Var5 = d0Var15;
                        d0Var6 = d0Var16;
                        d0Var7 = d0Var219;
                        d0Var8 = d0Var14;
                        pVar5 = pVar7;
                        f18 = f25;
                    } else {
                        rVarH.O();
                        z18 = z15;
                        d0Var5 = d0Var4;
                        f17 = f16;
                        pVar4 = pVar3;
                        v2Var3 = v2Var2;
                        i86 = i27;
                        c4Var2 = c4VarA;
                        pVar5 = pVarC;
                        j17 = j16;
                        d0Var6 = d0Var;
                        d0Var7 = d0Var2;
                        d0Var8 = d0Var3;
                        z19 = z16;
                        f18 = f15;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: i50.j
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 805306368;
                i55 = i18 & 1024;
                if (i55 != 0) {
                    i56 = i17 | 6;
                } else if ((i17 & 6) == 0) {
                    if (rVarH.W(d0Var3)) {
                        i57 = 4;
                    } else {
                        i57 = 2;
                    }
                    i56 = i17 | i57;
                } else {
                    i56 = i17;
                }
                i58 = i18 & 2048;
                if (i58 != 0) {
                    i56 |= 48;
                } else if ((i17 & 48) != 0) {
                    if (rVarH.W(d0Var4)) {
                        i59 = 32;
                    } else {
                        i59 = 16;
                    }
                    i56 |= i59;
                }
                i65 = i56;
                i66 = i18 & PKIFailureInfo.certConfirmed;
                if (i66 != 0) {
                    i68 = i65 | MLKEMEngine.KyberPolyBytes;
                } else {
                    i67 = i65;
                    if ((i17 & MLKEMEngine.KyberPolyBytes) != 0) {
                        if (rVarH.a(z16)) {
                            i69 = 256;
                        } else {
                            i69 = 128;
                        }
                        i67 |= i69;
                    }
                    i68 = i67;
                }
                i75 = i18 & PKIFailureInfo.certRevoked;
                if (i75 != 0) {
                    i77 = i68 | 3072;
                } else {
                    i76 = i68;
                    if ((i17 & 3072) == 0) {
                        i77 = i76 | (rVarH.b(f15) ? 2048 : 1024);
                    } else {
                        i77 = i76;
                    }
                }
                i78 = i18 & 16384;
                if (i78 != 0) {
                    i79 = i77;
                    if ((i17 & 24576) == 0) {
                        if (rVarH.b(f16)) {
                            i29 = 16384;
                        }
                        i79 |= i29;
                    }
                    if ((i17 & 196608) == 0) {
                        if (!rVarH.G(qVar)) {
                            i36 = PKIFailureInfo.notAuthorized;
                        }
                        i79 |= i36;
                    }
                    i85 = i79;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i19 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j1118 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j1118;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j2114 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j2114;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        } else {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j1119 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j1119;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j2115 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j2115;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                        }
                        objE2 = rVarH.E();
                        companion = p076m2.r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        final d0 d0Var11117 = (d0) objE2;
                        objE3 = rVarH.E();
                        if (objE3 == companion.a()) {
                            objE3 = new d0();
                            rVarH.v(objE3);
                        }
                        final d0 d0Var11118 = (d0) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = new d0();
                            rVarH.v(objE4);
                        }
                        final d0 d0Var11119 = (d0) objE4;
                        objE5 = rVarH.E();
                        if (objE5 == companion.a()) {
                            objE5 = new d0();
                            rVarH.v(objE5);
                        }
                        final d0 d0Var2110 = (d0) objE5;
                        i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                        if (i89 != 1) {
                            rVarH.X(-1148515264);
                            urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else if (i89 != 2) {
                            rVarH.X(-1148511225);
                            urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else {
                            if (i89 == 3) {
                                rVarH.X(-1148518986);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(-1148507365);
                            urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                            rVarH.R();
                        }
                        final ur urVar11 = urVarD;
                        objE6 = rVarH.E();
                        if (objE6 == companion.a()) {
                            objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                            rVarH.v(objE6);
                        }
                        final a3 a3Var11 = (a3) objE6;
                        final b bVar11 = new b(a3Var11);
                        final d0 d0Var2111 = d0Var13;
                        p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.u(baseScaffoldData, urVar11, bVar11, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var11117, z28, d0Var15, d0Var11118, d0Var11119, d0Var2110, d0Var16, d0Var2111, d0Var14, pVar7, f25, a3Var11, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        v2Var3 = v2Var4;
                        pVar4 = pVar6;
                        i86 = i87;
                        j17 = j18;
                        c4Var2 = c4Var3;
                        z18 = z27;
                        f17 = f26;
                        z19 = z28;
                        d0Var5 = d0Var15;
                        d0Var6 = d0Var16;
                        d0Var7 = d0Var2111;
                        d0Var8 = d0Var14;
                        pVar5 = pVar7;
                        f18 = f25;
                    } else {
                        rVarH.O();
                        z18 = z15;
                        d0Var5 = d0Var4;
                        f17 = f16;
                        pVar4 = pVar3;
                        v2Var3 = v2Var2;
                        i86 = i27;
                        c4Var2 = c4VarA;
                        pVar5 = pVarC;
                        j17 = j16;
                        d0Var6 = d0Var;
                        d0Var7 = d0Var2;
                        d0Var8 = d0Var3;
                        z19 = z16;
                        f18 = f15;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: i50.j
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i79 = i77 | 24576;
                if ((i17 & 196608) == 0) {
                    if (!rVarH.G(qVar)) {
                        i36 = PKIFailureInfo.notAuthorized;
                    }
                    i79 |= i36;
                }
                i85 = i79;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i19 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j11110 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j11110;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j2116 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j2116;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    } else {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j11111 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j11111;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j2117 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j2117;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                    }
                    objE2 = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new d0();
                        rVarH.v(objE2);
                    }
                    final d0 d0Var111110 = (d0) objE2;
                    objE3 = rVarH.E();
                    if (objE3 == companion.a()) {
                        objE3 = new d0();
                        rVarH.v(objE3);
                    }
                    final d0 d0Var111111 = (d0) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = new d0();
                        rVarH.v(objE4);
                    }
                    final d0 d0Var111112 = (d0) objE4;
                    objE5 = rVarH.E();
                    if (objE5 == companion.a()) {
                        objE5 = new d0();
                        rVarH.v(objE5);
                    }
                    final d0 d0Var2112 = (d0) objE5;
                    i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                    if (i89 != 1) {
                        rVarH.X(-1148515264);
                        urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else if (i89 != 2) {
                        rVarH.X(-1148511225);
                        urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else {
                        if (i89 == 3) {
                            rVarH.X(-1148518986);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(-1148507365);
                        urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                        rVarH.R();
                    }
                    final ur urVar12 = urVarD;
                    objE6 = rVarH.E();
                    if (objE6 == companion.a()) {
                        objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                        rVarH.v(objE6);
                    }
                    final a3 a3Var12 = (a3) objE6;
                    final b bVar12 = new b(a3Var12);
                    final d0 d0Var2113 = d0Var13;
                    p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.u(baseScaffoldData, urVar12, bVar12, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var111110, z28, d0Var15, d0Var111111, d0Var111112, d0Var2112, d0Var16, d0Var2113, d0Var14, pVar7, f25, a3Var12, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    v2Var3 = v2Var4;
                    pVar4 = pVar6;
                    i86 = i87;
                    j17 = j18;
                    c4Var2 = c4Var3;
                    z18 = z27;
                    f17 = f26;
                    z19 = z28;
                    d0Var5 = d0Var15;
                    d0Var6 = d0Var16;
                    d0Var7 = d0Var2113;
                    d0Var8 = d0Var14;
                    pVar5 = pVar7;
                    f18 = f25;
                } else {
                    rVarH.O();
                    z18 = z15;
                    d0Var5 = d0Var4;
                    f17 = f16;
                    pVar4 = pVar3;
                    v2Var3 = v2Var2;
                    i86 = i27;
                    c4Var2 = c4VarA;
                    pVar5 = pVarC;
                    j17 = j16;
                    d0Var6 = d0Var;
                    d0Var7 = d0Var2;
                    d0Var8 = d0Var3;
                    z19 = z16;
                    f18 = f15;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: i50.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 100663296;
            i48 = i18 & 512;
            if (i48 != 0) {
                if ((i16 & 805306368) == 0) {
                    if (rVarH.W(d0Var2)) {
                        i49 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i49 = 268435456;
                    }
                    i19 |= i49;
                }
                i55 = i18 & 1024;
                if (i55 != 0) {
                    i56 = i17 | 6;
                } else if ((i17 & 6) == 0) {
                    if (rVarH.W(d0Var3)) {
                        i57 = 4;
                    } else {
                        i57 = 2;
                    }
                    i56 = i17 | i57;
                } else {
                    i56 = i17;
                }
                i58 = i18 & 2048;
                if (i58 != 0) {
                    i56 |= 48;
                } else if ((i17 & 48) != 0) {
                    if (rVarH.W(d0Var4)) {
                        i59 = 32;
                    } else {
                        i59 = 16;
                    }
                    i56 |= i59;
                }
                i65 = i56;
                i66 = i18 & PKIFailureInfo.certConfirmed;
                if (i66 != 0) {
                    i68 = i65 | MLKEMEngine.KyberPolyBytes;
                } else {
                    i67 = i65;
                    if ((i17 & MLKEMEngine.KyberPolyBytes) != 0) {
                        if (rVarH.a(z16)) {
                            i69 = 256;
                        } else {
                            i69 = 128;
                        }
                        i67 |= i69;
                    }
                    i68 = i67;
                }
                i75 = i18 & PKIFailureInfo.certRevoked;
                if (i75 != 0) {
                    i77 = i68 | 3072;
                } else {
                    i76 = i68;
                    if ((i17 & 3072) == 0) {
                        i77 = i76 | (rVarH.b(f15) ? 2048 : 1024);
                    } else {
                        i77 = i76;
                    }
                }
                i78 = i18 & 16384;
                if (i78 != 0) {
                    i79 = i77;
                    if ((i17 & 24576) == 0) {
                        if (rVarH.b(f16)) {
                            i29 = 16384;
                        }
                        i79 |= i29;
                    }
                    if ((i17 & 196608) == 0) {
                        if (!rVarH.G(qVar)) {
                            i36 = PKIFailureInfo.notAuthorized;
                        }
                        i79 |= i36;
                    }
                    i85 = i79;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i19 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j11112 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j11112;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j2118 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j2118;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        } else {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j11113 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j11113;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j2119 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j2119;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                        }
                        objE2 = rVarH.E();
                        companion = p076m2.r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        final d0 d0Var111113 = (d0) objE2;
                        objE3 = rVarH.E();
                        if (objE3 == companion.a()) {
                            objE3 = new d0();
                            rVarH.v(objE3);
                        }
                        final d0 d0Var111114 = (d0) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = new d0();
                            rVarH.v(objE4);
                        }
                        final d0 d0Var111115 = (d0) objE4;
                        objE5 = rVarH.E();
                        if (objE5 == companion.a()) {
                            objE5 = new d0();
                            rVarH.v(objE5);
                        }
                        final d0 d0Var2114 = (d0) objE5;
                        i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                        if (i89 != 1) {
                            rVarH.X(-1148515264);
                            urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else if (i89 != 2) {
                            rVarH.X(-1148511225);
                            urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else {
                            if (i89 == 3) {
                                rVarH.X(-1148518986);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(-1148507365);
                            urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                            rVarH.R();
                        }
                        final ur urVar13 = urVarD;
                        objE6 = rVarH.E();
                        if (objE6 == companion.a()) {
                            objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                            rVarH.v(objE6);
                        }
                        final a3 a3Var13 = (a3) objE6;
                        final b bVar13 = new b(a3Var13);
                        final d0 d0Var2115 = d0Var13;
                        p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.u(baseScaffoldData, urVar13, bVar13, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var111113, z28, d0Var15, d0Var111114, d0Var111115, d0Var2114, d0Var16, d0Var2115, d0Var14, pVar7, f25, a3Var13, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        v2Var3 = v2Var4;
                        pVar4 = pVar6;
                        i86 = i87;
                        j17 = j18;
                        c4Var2 = c4Var3;
                        z18 = z27;
                        f17 = f26;
                        z19 = z28;
                        d0Var5 = d0Var15;
                        d0Var6 = d0Var16;
                        d0Var7 = d0Var2115;
                        d0Var8 = d0Var14;
                        pVar5 = pVar7;
                        f18 = f25;
                    } else {
                        rVarH.O();
                        z18 = z15;
                        d0Var5 = d0Var4;
                        f17 = f16;
                        pVar4 = pVar3;
                        v2Var3 = v2Var2;
                        i86 = i27;
                        c4Var2 = c4VarA;
                        pVar5 = pVarC;
                        j17 = j16;
                        d0Var6 = d0Var;
                        d0Var7 = d0Var2;
                        d0Var8 = d0Var3;
                        z19 = z16;
                        f18 = f15;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: i50.j
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i79 = i77 | 24576;
                if ((i17 & 196608) == 0) {
                    if (!rVarH.G(qVar)) {
                        i36 = PKIFailureInfo.notAuthorized;
                    }
                    i79 |= i36;
                }
                i85 = i79;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i19 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j11114 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j11114;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j21110 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j21110;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    } else {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j11115 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j11115;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j21111 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j21111;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                    }
                    objE2 = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new d0();
                        rVarH.v(objE2);
                    }
                    final d0 d0Var111116 = (d0) objE2;
                    objE3 = rVarH.E();
                    if (objE3 == companion.a()) {
                        objE3 = new d0();
                        rVarH.v(objE3);
                    }
                    final d0 d0Var111117 = (d0) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = new d0();
                        rVarH.v(objE4);
                    }
                    final d0 d0Var111118 = (d0) objE4;
                    objE5 = rVarH.E();
                    if (objE5 == companion.a()) {
                        objE5 = new d0();
                        rVarH.v(objE5);
                    }
                    final d0 d0Var2116 = (d0) objE5;
                    i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                    if (i89 != 1) {
                        rVarH.X(-1148515264);
                        urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else if (i89 != 2) {
                        rVarH.X(-1148511225);
                        urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else {
                        if (i89 == 3) {
                            rVarH.X(-1148518986);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(-1148507365);
                        urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                        rVarH.R();
                    }
                    final ur urVar14 = urVarD;
                    objE6 = rVarH.E();
                    if (objE6 == companion.a()) {
                        objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                        rVarH.v(objE6);
                    }
                    final a3 a3Var14 = (a3) objE6;
                    final b bVar14 = new b(a3Var14);
                    final d0 d0Var2117 = d0Var13;
                    p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.u(baseScaffoldData, urVar14, bVar14, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var111116, z28, d0Var15, d0Var111117, d0Var111118, d0Var2116, d0Var16, d0Var2117, d0Var14, pVar7, f25, a3Var14, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    v2Var3 = v2Var4;
                    pVar4 = pVar6;
                    i86 = i87;
                    j17 = j18;
                    c4Var2 = c4Var3;
                    z18 = z27;
                    f17 = f26;
                    z19 = z28;
                    d0Var5 = d0Var15;
                    d0Var6 = d0Var16;
                    d0Var7 = d0Var2117;
                    d0Var8 = d0Var14;
                    pVar5 = pVar7;
                    f18 = f25;
                } else {
                    rVarH.O();
                    z18 = z15;
                    d0Var5 = d0Var4;
                    f17 = f16;
                    pVar4 = pVar3;
                    v2Var3 = v2Var2;
                    i86 = i27;
                    c4Var2 = c4VarA;
                    pVar5 = pVarC;
                    j17 = j16;
                    d0Var6 = d0Var;
                    d0Var7 = d0Var2;
                    d0Var8 = d0Var3;
                    z19 = z16;
                    f18 = f15;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: i50.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 805306368;
            i55 = i18 & 1024;
            if (i55 != 0) {
                i56 = i17 | 6;
            } else if ((i17 & 6) == 0) {
                if (rVarH.W(d0Var3)) {
                    i57 = 4;
                } else {
                    i57 = 2;
                }
                i56 = i17 | i57;
            } else {
                i56 = i17;
            }
            i58 = i18 & 2048;
            if (i58 != 0) {
                i56 |= 48;
            } else if ((i17 & 48) != 0) {
                if (rVarH.W(d0Var4)) {
                    i59 = 32;
                } else {
                    i59 = 16;
                }
                i56 |= i59;
            }
            i65 = i56;
            i66 = i18 & PKIFailureInfo.certConfirmed;
            if (i66 != 0) {
                i68 = i65 | MLKEMEngine.KyberPolyBytes;
            } else {
                i67 = i65;
                if ((i17 & MLKEMEngine.KyberPolyBytes) != 0) {
                    if (rVarH.a(z16)) {
                        i69 = 256;
                    } else {
                        i69 = 128;
                    }
                    i67 |= i69;
                }
                i68 = i67;
            }
            i75 = i18 & PKIFailureInfo.certRevoked;
            if (i75 != 0) {
                i77 = i68 | 3072;
            } else {
                i76 = i68;
                if ((i17 & 3072) == 0) {
                    i77 = i76 | (rVarH.b(f15) ? 2048 : 1024);
                } else {
                    i77 = i76;
                }
            }
            i78 = i18 & 16384;
            if (i78 != 0) {
                i79 = i77;
                if ((i17 & 24576) == 0) {
                    if (rVarH.b(f16)) {
                        i29 = 16384;
                    }
                    i79 |= i29;
                }
                if ((i17 & 196608) == 0) {
                    if (!rVarH.G(qVar)) {
                        i36 = PKIFailureInfo.notAuthorized;
                    }
                    i79 |= i36;
                }
                i85 = i79;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i19 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j11116 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j11116;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j21112 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j21112;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    } else {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j11117 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j11117;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j21113 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j21113;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                    }
                    objE2 = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new d0();
                        rVarH.v(objE2);
                    }
                    final d0 d0Var111119 = (d0) objE2;
                    objE3 = rVarH.E();
                    if (objE3 == companion.a()) {
                        objE3 = new d0();
                        rVarH.v(objE3);
                    }
                    final d0 d0Var1111110 = (d0) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = new d0();
                        rVarH.v(objE4);
                    }
                    final d0 d0Var1111111 = (d0) objE4;
                    objE5 = rVarH.E();
                    if (objE5 == companion.a()) {
                        objE5 = new d0();
                        rVarH.v(objE5);
                    }
                    final d0 d0Var2118 = (d0) objE5;
                    i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                    if (i89 != 1) {
                        rVarH.X(-1148515264);
                        urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else if (i89 != 2) {
                        rVarH.X(-1148511225);
                        urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else {
                        if (i89 == 3) {
                            rVarH.X(-1148518986);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(-1148507365);
                        urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                        rVarH.R();
                    }
                    final ur urVar15 = urVarD;
                    objE6 = rVarH.E();
                    if (objE6 == companion.a()) {
                        objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                        rVarH.v(objE6);
                    }
                    final a3 a3Var15 = (a3) objE6;
                    final b bVar15 = new b(a3Var15);
                    final d0 d0Var2119 = d0Var13;
                    p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.u(baseScaffoldData, urVar15, bVar15, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var111119, z28, d0Var15, d0Var1111110, d0Var1111111, d0Var2118, d0Var16, d0Var2119, d0Var14, pVar7, f25, a3Var15, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    v2Var3 = v2Var4;
                    pVar4 = pVar6;
                    i86 = i87;
                    j17 = j18;
                    c4Var2 = c4Var3;
                    z18 = z27;
                    f17 = f26;
                    z19 = z28;
                    d0Var5 = d0Var15;
                    d0Var6 = d0Var16;
                    d0Var7 = d0Var2119;
                    d0Var8 = d0Var14;
                    pVar5 = pVar7;
                    f18 = f25;
                } else {
                    rVarH.O();
                    z18 = z15;
                    d0Var5 = d0Var4;
                    f17 = f16;
                    pVar4 = pVar3;
                    v2Var3 = v2Var2;
                    i86 = i27;
                    c4Var2 = c4VarA;
                    pVar5 = pVarC;
                    j17 = j16;
                    d0Var6 = d0Var;
                    d0Var7 = d0Var2;
                    d0Var8 = d0Var3;
                    z19 = z16;
                    f18 = f15;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: i50.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i79 = i77 | 24576;
            if ((i17 & 196608) == 0) {
                if (!rVarH.G(qVar)) {
                    i36 = PKIFailureInfo.notAuthorized;
                }
                i79 |= i36;
            }
            i85 = i79;
            if ((i19 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i19 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i98 != 0) {
                        pVarC = v.f89493a.c();
                    }
                    if (i25 != 0) {
                        pVarD = v.f89493a.d();
                    } else {
                        pVarD = pVar3;
                    }
                    if ((i18 & 8) != 0) {
                        iA = cc.INSTANCE.a();
                        i19 &= -7169;
                    } else {
                        iA = i27;
                    }
                    if ((i18 & 16) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i19 &= -57345;
                    } else {
                        jA = j16;
                    }
                    if ((i18 & 32) != 0) {
                        i19 &= -458753;
                        c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                    }
                    if (i37 != 0) {
                        v2Var2 = null;
                    }
                    if (i39 != 0) {
                        z25 = false;
                    } else {
                        z25 = z15;
                    }
                    if (i46 != 0) {
                        d0Var9 = null;
                    } else {
                        d0Var9 = d0Var;
                    }
                    if (i48 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var2;
                    }
                    if (i55 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        d0Var11 = (d0) objE;
                    } else {
                        d0Var11 = d0Var3;
                    }
                    if (i58 != 0) {
                        d0Var12 = null;
                    } else {
                        d0Var12 = d0Var4;
                    }
                    if (i66 != 0) {
                        z26 = true;
                    } else {
                        z26 = z16;
                    }
                    if (i75 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f15;
                    }
                    if (i78 != 0) {
                        long j11118 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j11118;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                        f26 = 1.0f;
                        z27 = z25;
                    } else {
                        long j21114 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j21114;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        z27 = z25;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        f26 = f16;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                    }
                } else {
                    if (i98 != 0) {
                        pVarC = v.f89493a.c();
                    }
                    if (i25 != 0) {
                        pVarD = v.f89493a.d();
                    } else {
                        pVarD = pVar3;
                    }
                    if ((i18 & 8) != 0) {
                        iA = cc.INSTANCE.a();
                        i19 &= -7169;
                    } else {
                        iA = i27;
                    }
                    if ((i18 & 16) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i19 &= -57345;
                    } else {
                        jA = j16;
                    }
                    if ((i18 & 32) != 0) {
                        i19 &= -458753;
                        c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                    }
                    if (i37 != 0) {
                        v2Var2 = null;
                    }
                    if (i39 != 0) {
                        z25 = false;
                    } else {
                        z25 = z15;
                    }
                    if (i46 != 0) {
                        d0Var9 = null;
                    } else {
                        d0Var9 = d0Var;
                    }
                    if (i48 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var2;
                    }
                    if (i55 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        d0Var11 = (d0) objE;
                    } else {
                        d0Var11 = d0Var3;
                    }
                    if (i58 != 0) {
                        d0Var12 = null;
                    } else {
                        d0Var12 = d0Var4;
                    }
                    if (i66 != 0) {
                        z26 = true;
                    } else {
                        z26 = z16;
                    }
                    if (i75 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f15;
                    }
                    if (i78 != 0) {
                        long j11119 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j11119;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                        f26 = 1.0f;
                        z27 = z25;
                    } else {
                        long j21115 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j21115;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        z27 = z25;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        f26 = f16;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                }
                objE2 = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = new d0();
                    rVarH.v(objE2);
                }
                final d0 d0Var1111112 = (d0) objE2;
                objE3 = rVarH.E();
                if (objE3 == companion.a()) {
                    objE3 = new d0();
                    rVarH.v(objE3);
                }
                final d0 d0Var1111113 = (d0) objE3;
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = new d0();
                    rVarH.v(objE4);
                }
                final d0 d0Var1111114 = (d0) objE4;
                objE5 = rVarH.E();
                if (objE5 == companion.a()) {
                    objE5 = new d0();
                    rVarH.v(objE5);
                }
                final d0 d0Var21110 = (d0) objE5;
                i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                if (i89 != 1) {
                    rVarH.X(-1148515264);
                    urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                    rVarH.R();
                } else if (i89 != 2) {
                    rVarH.X(-1148511225);
                    urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                    rVarH.R();
                } else {
                    if (i89 == 3) {
                        rVarH.X(-1148518986);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(-1148507365);
                    urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                    rVarH.R();
                }
                final ur urVar16 = urVarD;
                objE6 = rVarH.E();
                if (objE6 == companion.a()) {
                    objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                    rVarH.v(objE6);
                }
                final a3 a3Var16 = (a3) objE6;
                final b bVar16 = new b(a3Var16);
                final d0 d0Var21111 = d0Var13;
                p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.u(baseScaffoldData, urVar16, bVar16, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var1111112, z28, d0Var15, d0Var1111113, d0Var1111114, d0Var21110, d0Var16, d0Var21111, d0Var14, pVar7, f25, a3Var16, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                v2Var3 = v2Var4;
                pVar4 = pVar6;
                i86 = i87;
                j17 = j18;
                c4Var2 = c4Var3;
                z18 = z27;
                f17 = f26;
                z19 = z28;
                d0Var5 = d0Var15;
                d0Var6 = d0Var16;
                d0Var7 = d0Var21111;
                d0Var8 = d0Var14;
                pVar5 = pVar7;
                f18 = f25;
            } else {
                rVarH.O();
                z18 = z15;
                d0Var5 = d0Var4;
                f17 = f16;
                pVar4 = pVar3;
                v2Var3 = v2Var2;
                i86 = i27;
                c4Var2 = c4VarA;
                pVar5 = pVarC;
                j17 = j16;
                d0Var6 = d0Var;
                d0Var7 = d0Var2;
                d0Var8 = d0Var3;
                z19 = z16;
                f18 = f15;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: i50.j
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 48;
        pVarC = pVar;
        i25 = i18 & 4;
        if (i25 != 0) {
            if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                pVar3 = pVar2;
                if (rVarH.G(pVar3)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i19 |= i26;
            }
            if ((i16 & 3072) == 0) {
                if ((i18 & 8) == 0) {
                    i27 = i15;
                    if (rVarH.c(i27)) {
                        i97 = 2048;
                    }
                    i19 |= i97;
                } else {
                    i27 = i15;
                }
                i97 = 1024;
                i19 |= i97;
            } else {
                i27 = i15;
            }
            i28 = i16 & 24576;
            i29 = PKIFailureInfo.certRevoked;
            if (i28 == 0) {
                j16 = j15;
                if ((i18 & 16) == 0) {
                    i96 = 8192;
                } else {
                    i96 = 8192;
                }
                i19 |= i96;
            } else {
                j16 = j15;
            }
            i35 = i16 & 196608;
            i36 = PKIFailureInfo.unsupportedVersion;
            if (i35 == 0) {
                c4VarA = c4Var;
                if ((i18 & 32) == 0) {
                    i95 = PKIFailureInfo.notAuthorized;
                } else {
                    i95 = PKIFailureInfo.notAuthorized;
                }
                i19 |= i95;
            } else {
                c4VarA = c4Var;
            }
            i37 = i18 & 64;
            if (i37 != 0) {
                i19 |= 1572864;
                v2Var2 = v2Var;
            } else {
                v2Var2 = v2Var;
                if ((i16 & 1572864) == 0) {
                    if (rVarH.G(v2Var2)) {
                        i38 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i38 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i38;
                }
            }
            i39 = i18 & 128;
            if (i39 != 0) {
                i19 |= 12582912;
            } else if ((i16 & 12582912) == 0) {
                if (rVarH.a(z15)) {
                    i45 = 8388608;
                } else {
                    i45 = 4194304;
                }
                i19 |= i45;
            }
            i46 = i18 & 256;
            if (i46 != 0) {
                if ((i16 & 100663296) == 0) {
                    if (rVarH.W(d0Var)) {
                        i47 = 67108864;
                    } else {
                        i47 = 33554432;
                    }
                    i19 |= i47;
                }
                i48 = i18 & 512;
                if (i48 != 0) {
                    if ((i16 & 805306368) == 0) {
                        if (rVarH.W(d0Var2)) {
                            i49 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i49 = 268435456;
                        }
                        i19 |= i49;
                    }
                    i55 = i18 & 1024;
                    if (i55 != 0) {
                        i56 = i17 | 6;
                    } else if ((i17 & 6) == 0) {
                        if (rVarH.W(d0Var3)) {
                            i57 = 4;
                        } else {
                            i57 = 2;
                        }
                        i56 = i17 | i57;
                    } else {
                        i56 = i17;
                    }
                    i58 = i18 & 2048;
                    if (i58 != 0) {
                        i56 |= 48;
                    } else if ((i17 & 48) != 0) {
                        if (rVarH.W(d0Var4)) {
                            i59 = 32;
                        } else {
                            i59 = 16;
                        }
                        i56 |= i59;
                    }
                    i65 = i56;
                    i66 = i18 & PKIFailureInfo.certConfirmed;
                    if (i66 != 0) {
                        i68 = i65 | MLKEMEngine.KyberPolyBytes;
                    } else {
                        i67 = i65;
                        if ((i17 & MLKEMEngine.KyberPolyBytes) != 0) {
                            if (rVarH.a(z16)) {
                                i69 = 256;
                            } else {
                                i69 = 128;
                            }
                            i67 |= i69;
                        }
                        i68 = i67;
                    }
                    i75 = i18 & PKIFailureInfo.certRevoked;
                    if (i75 != 0) {
                        i77 = i68 | 3072;
                    } else {
                        i76 = i68;
                        if ((i17 & 3072) == 0) {
                            i77 = i76 | (rVarH.b(f15) ? 2048 : 1024);
                        } else {
                            i77 = i76;
                        }
                    }
                    i78 = i18 & 16384;
                    if (i78 != 0) {
                        i79 = i77;
                        if ((i17 & 24576) == 0) {
                            if (rVarH.b(f16)) {
                                i29 = 16384;
                            }
                            i79 |= i29;
                        }
                        if ((i17 & 196608) == 0) {
                            if (!rVarH.G(qVar)) {
                                i36 = PKIFailureInfo.notAuthorized;
                            }
                            i79 |= i36;
                        }
                        i85 = i79;
                        if ((i19 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i19 & 1)) {
                            rVarH.I();
                            if ((i16 & 1) != 0) {
                                if (i98 != 0) {
                                    pVarC = v.f89493a.c();
                                }
                                if (i25 != 0) {
                                    pVarD = v.f89493a.d();
                                } else {
                                    pVarD = pVar3;
                                }
                                if ((i18 & 8) != 0) {
                                    iA = cc.INSTANCE.a();
                                    i19 &= -7169;
                                } else {
                                    iA = i27;
                                }
                                if ((i18 & 16) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i19 &= -57345;
                                } else {
                                    jA = j16;
                                }
                                if ((i18 & 32) != 0) {
                                    i19 &= -458753;
                                    c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                                }
                                if (i37 != 0) {
                                    v2Var2 = null;
                                }
                                if (i39 != 0) {
                                    z25 = false;
                                } else {
                                    z25 = z15;
                                }
                                if (i46 != 0) {
                                    d0Var9 = null;
                                } else {
                                    d0Var9 = d0Var;
                                }
                                if (i48 != 0) {
                                    d0Var10 = null;
                                } else {
                                    d0Var10 = d0Var2;
                                }
                                if (i55 != 0) {
                                    objE = rVarH.E();
                                    if (objE == p076m2.r.INSTANCE.a()) {
                                        objE = new d0();
                                        rVarH.v(objE);
                                    }
                                    d0Var11 = (d0) objE;
                                } else {
                                    d0Var11 = d0Var3;
                                }
                                if (i58 != 0) {
                                    d0Var12 = null;
                                } else {
                                    d0Var12 = d0Var4;
                                }
                                if (i66 != 0) {
                                    z26 = true;
                                } else {
                                    z26 = z16;
                                }
                                if (i75 != 0) {
                                    f19 = 1.0f;
                                } else {
                                    f19 = f15;
                                }
                                if (i78 != 0) {
                                    long j111110 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j111110;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                    f26 = 1.0f;
                                    z27 = z25;
                                } else {
                                    long j21116 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j21116;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    z27 = z25;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    f26 = f16;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                }
                            } else {
                                if (i98 != 0) {
                                    pVarC = v.f89493a.c();
                                }
                                if (i25 != 0) {
                                    pVarD = v.f89493a.d();
                                } else {
                                    pVarD = pVar3;
                                }
                                if ((i18 & 8) != 0) {
                                    iA = cc.INSTANCE.a();
                                    i19 &= -7169;
                                } else {
                                    iA = i27;
                                }
                                if ((i18 & 16) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i19 &= -57345;
                                } else {
                                    jA = j16;
                                }
                                if ((i18 & 32) != 0) {
                                    i19 &= -458753;
                                    c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                                }
                                if (i37 != 0) {
                                    v2Var2 = null;
                                }
                                if (i39 != 0) {
                                    z25 = false;
                                } else {
                                    z25 = z15;
                                }
                                if (i46 != 0) {
                                    d0Var9 = null;
                                } else {
                                    d0Var9 = d0Var;
                                }
                                if (i48 != 0) {
                                    d0Var10 = null;
                                } else {
                                    d0Var10 = d0Var2;
                                }
                                if (i55 != 0) {
                                    objE = rVarH.E();
                                    if (objE == p076m2.r.INSTANCE.a()) {
                                        objE = new d0();
                                        rVarH.v(objE);
                                    }
                                    d0Var11 = (d0) objE;
                                } else {
                                    d0Var11 = d0Var3;
                                }
                                if (i58 != 0) {
                                    d0Var12 = null;
                                } else {
                                    d0Var12 = d0Var4;
                                }
                                if (i66 != 0) {
                                    z26 = true;
                                } else {
                                    z26 = z16;
                                }
                                if (i75 != 0) {
                                    f19 = 1.0f;
                                } else {
                                    f19 = f15;
                                }
                                if (i78 != 0) {
                                    long j111111 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j111111;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                    f26 = 1.0f;
                                    z27 = z25;
                                } else {
                                    long j21117 = jA;
                                    pVar6 = pVarD;
                                    d0Var13 = d0Var10;
                                    j18 = j21117;
                                    d0Var14 = d0Var11;
                                    d0Var15 = d0Var12;
                                    i87 = iA;
                                    z27 = z25;
                                    d0Var16 = d0Var9;
                                    pVar7 = pVarC;
                                    f25 = f19;
                                    z28 = z26;
                                    w5Var = null;
                                    i88 = -45887867;
                                    f26 = f16;
                                    v2Var4 = v2Var2;
                                    c4Var3 = c4VarA;
                                }
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                            }
                            objE2 = rVarH.E();
                            companion = p076m2.r.INSTANCE;
                            if (objE2 == companion.a()) {
                                objE2 = new d0();
                                rVarH.v(objE2);
                            }
                            final d0 d0Var1111115 = (d0) objE2;
                            objE3 = rVarH.E();
                            if (objE3 == companion.a()) {
                                objE3 = new d0();
                                rVarH.v(objE3);
                            }
                            final d0 d0Var1111116 = (d0) objE3;
                            objE4 = rVarH.E();
                            if (objE4 == companion.a()) {
                                objE4 = new d0();
                                rVarH.v(objE4);
                            }
                            final d0 d0Var1111117 = (d0) objE4;
                            objE5 = rVarH.E();
                            if (objE5 == companion.a()) {
                                objE5 = new d0();
                                rVarH.v(objE5);
                            }
                            final d0 d0Var21112 = (d0) objE5;
                            i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                            if (i89 != 1) {
                                rVarH.X(-1148515264);
                                urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                                rVarH.R();
                            } else if (i89 != 2) {
                                rVarH.X(-1148511225);
                                urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                                rVarH.R();
                            } else {
                                if (i89 == 3) {
                                    rVarH.X(-1148518986);
                                    rVarH.R();
                                    throw new oq.p();
                                }
                                rVarH.X(-1148507365);
                                urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                                rVarH.R();
                            }
                            final ur urVar17 = urVarD;
                            objE6 = rVarH.E();
                            if (objE6 == companion.a()) {
                                objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                                rVarH.v(objE6);
                            }
                            final a3 a3Var17 = (a3) objE6;
                            final b bVar17 = new b(a3Var17);
                            final d0 d0Var21113 = d0Var13;
                            p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return s.u(baseScaffoldData, urVar17, bVar17, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var1111115, z28, d0Var15, d0Var1111116, d0Var1111117, d0Var21112, d0Var16, d0Var21113, d0Var14, pVar7, f25, a3Var17, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            v2Var3 = v2Var4;
                            pVar4 = pVar6;
                            i86 = i87;
                            j17 = j18;
                            c4Var2 = c4Var3;
                            z18 = z27;
                            f17 = f26;
                            z19 = z28;
                            d0Var5 = d0Var15;
                            d0Var6 = d0Var16;
                            d0Var7 = d0Var21113;
                            d0Var8 = d0Var14;
                            pVar5 = pVar7;
                            f18 = f25;
                        } else {
                            rVarH.O();
                            z18 = z15;
                            d0Var5 = d0Var4;
                            f17 = f16;
                            pVar4 = pVar3;
                            v2Var3 = v2Var2;
                            i86 = i27;
                            c4Var2 = c4VarA;
                            pVar5 = pVarC;
                            j17 = j16;
                            d0Var6 = d0Var;
                            d0Var7 = d0Var2;
                            d0Var8 = d0Var3;
                            z19 = z16;
                            f18 = f15;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new er.p() { // from class: i50.j
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i79 = i77 | 24576;
                    if ((i17 & 196608) == 0) {
                        if (!rVarH.G(qVar)) {
                            i36 = PKIFailureInfo.notAuthorized;
                        }
                        i79 |= i36;
                    }
                    i85 = i79;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i19 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j111112 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j111112;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j21118 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j21118;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        } else {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j111113 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j111113;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j21119 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j21119;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                        }
                        objE2 = rVarH.E();
                        companion = p076m2.r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        final d0 d0Var1111118 = (d0) objE2;
                        objE3 = rVarH.E();
                        if (objE3 == companion.a()) {
                            objE3 = new d0();
                            rVarH.v(objE3);
                        }
                        final d0 d0Var1111119 = (d0) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = new d0();
                            rVarH.v(objE4);
                        }
                        final d0 d0Var11111110 = (d0) objE4;
                        objE5 = rVarH.E();
                        if (objE5 == companion.a()) {
                            objE5 = new d0();
                            rVarH.v(objE5);
                        }
                        final d0 d0Var21114 = (d0) objE5;
                        i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                        if (i89 != 1) {
                            rVarH.X(-1148515264);
                            urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else if (i89 != 2) {
                            rVarH.X(-1148511225);
                            urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else {
                            if (i89 == 3) {
                                rVarH.X(-1148518986);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(-1148507365);
                            urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                            rVarH.R();
                        }
                        final ur urVar18 = urVarD;
                        objE6 = rVarH.E();
                        if (objE6 == companion.a()) {
                            objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                            rVarH.v(objE6);
                        }
                        final a3 a3Var18 = (a3) objE6;
                        final b bVar18 = new b(a3Var18);
                        final d0 d0Var21115 = d0Var13;
                        p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.u(baseScaffoldData, urVar18, bVar18, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var1111118, z28, d0Var15, d0Var1111119, d0Var11111110, d0Var21114, d0Var16, d0Var21115, d0Var14, pVar7, f25, a3Var18, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        v2Var3 = v2Var4;
                        pVar4 = pVar6;
                        i86 = i87;
                        j17 = j18;
                        c4Var2 = c4Var3;
                        z18 = z27;
                        f17 = f26;
                        z19 = z28;
                        d0Var5 = d0Var15;
                        d0Var6 = d0Var16;
                        d0Var7 = d0Var21115;
                        d0Var8 = d0Var14;
                        pVar5 = pVar7;
                        f18 = f25;
                    } else {
                        rVarH.O();
                        z18 = z15;
                        d0Var5 = d0Var4;
                        f17 = f16;
                        pVar4 = pVar3;
                        v2Var3 = v2Var2;
                        i86 = i27;
                        c4Var2 = c4VarA;
                        pVar5 = pVarC;
                        j17 = j16;
                        d0Var6 = d0Var;
                        d0Var7 = d0Var2;
                        d0Var8 = d0Var3;
                        z19 = z16;
                        f18 = f15;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: i50.j
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 805306368;
                i55 = i18 & 1024;
                if (i55 != 0) {
                    i56 = i17 | 6;
                } else if ((i17 & 6) == 0) {
                    if (rVarH.W(d0Var3)) {
                        i57 = 4;
                    } else {
                        i57 = 2;
                    }
                    i56 = i17 | i57;
                } else {
                    i56 = i17;
                }
                i58 = i18 & 2048;
                if (i58 != 0) {
                    i56 |= 48;
                } else if ((i17 & 48) != 0) {
                    if (rVarH.W(d0Var4)) {
                        i59 = 32;
                    } else {
                        i59 = 16;
                    }
                    i56 |= i59;
                }
                i65 = i56;
                i66 = i18 & PKIFailureInfo.certConfirmed;
                if (i66 != 0) {
                    i68 = i65 | MLKEMEngine.KyberPolyBytes;
                } else {
                    i67 = i65;
                    if ((i17 & MLKEMEngine.KyberPolyBytes) != 0) {
                        if (rVarH.a(z16)) {
                            i69 = 256;
                        } else {
                            i69 = 128;
                        }
                        i67 |= i69;
                    }
                    i68 = i67;
                }
                i75 = i18 & PKIFailureInfo.certRevoked;
                if (i75 != 0) {
                    i77 = i68 | 3072;
                } else {
                    i76 = i68;
                    if ((i17 & 3072) == 0) {
                        i77 = i76 | (rVarH.b(f15) ? 2048 : 1024);
                    } else {
                        i77 = i76;
                    }
                }
                i78 = i18 & 16384;
                if (i78 != 0) {
                    i79 = i77;
                    if ((i17 & 24576) == 0) {
                        if (rVarH.b(f16)) {
                            i29 = 16384;
                        }
                        i79 |= i29;
                    }
                    if ((i17 & 196608) == 0) {
                        if (!rVarH.G(qVar)) {
                            i36 = PKIFailureInfo.notAuthorized;
                        }
                        i79 |= i36;
                    }
                    i85 = i79;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i19 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j111114 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j111114;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j211110 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j211110;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        } else {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j111115 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j111115;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j211111 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j211111;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                        }
                        objE2 = rVarH.E();
                        companion = p076m2.r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        final d0 d0Var11111111 = (d0) objE2;
                        objE3 = rVarH.E();
                        if (objE3 == companion.a()) {
                            objE3 = new d0();
                            rVarH.v(objE3);
                        }
                        final d0 d0Var11111112 = (d0) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = new d0();
                            rVarH.v(objE4);
                        }
                        final d0 d0Var11111113 = (d0) objE4;
                        objE5 = rVarH.E();
                        if (objE5 == companion.a()) {
                            objE5 = new d0();
                            rVarH.v(objE5);
                        }
                        final d0 d0Var21116 = (d0) objE5;
                        i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                        if (i89 != 1) {
                            rVarH.X(-1148515264);
                            urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else if (i89 != 2) {
                            rVarH.X(-1148511225);
                            urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else {
                            if (i89 == 3) {
                                rVarH.X(-1148518986);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(-1148507365);
                            urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                            rVarH.R();
                        }
                        final ur urVar19 = urVarD;
                        objE6 = rVarH.E();
                        if (objE6 == companion.a()) {
                            objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                            rVarH.v(objE6);
                        }
                        final a3 a3Var19 = (a3) objE6;
                        final b bVar19 = new b(a3Var19);
                        final d0 d0Var21117 = d0Var13;
                        p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.u(baseScaffoldData, urVar19, bVar19, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var11111111, z28, d0Var15, d0Var11111112, d0Var11111113, d0Var21116, d0Var16, d0Var21117, d0Var14, pVar7, f25, a3Var19, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        v2Var3 = v2Var4;
                        pVar4 = pVar6;
                        i86 = i87;
                        j17 = j18;
                        c4Var2 = c4Var3;
                        z18 = z27;
                        f17 = f26;
                        z19 = z28;
                        d0Var5 = d0Var15;
                        d0Var6 = d0Var16;
                        d0Var7 = d0Var21117;
                        d0Var8 = d0Var14;
                        pVar5 = pVar7;
                        f18 = f25;
                    } else {
                        rVarH.O();
                        z18 = z15;
                        d0Var5 = d0Var4;
                        f17 = f16;
                        pVar4 = pVar3;
                        v2Var3 = v2Var2;
                        i86 = i27;
                        c4Var2 = c4VarA;
                        pVar5 = pVarC;
                        j17 = j16;
                        d0Var6 = d0Var;
                        d0Var7 = d0Var2;
                        d0Var8 = d0Var3;
                        z19 = z16;
                        f18 = f15;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: i50.j
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i79 = i77 | 24576;
                if ((i17 & 196608) == 0) {
                    if (!rVarH.G(qVar)) {
                        i36 = PKIFailureInfo.notAuthorized;
                    }
                    i79 |= i36;
                }
                i85 = i79;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i19 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j111116 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j111116;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j211112 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j211112;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    } else {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j111117 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j111117;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j211113 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j211113;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                    }
                    objE2 = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new d0();
                        rVarH.v(objE2);
                    }
                    final d0 d0Var11111114 = (d0) objE2;
                    objE3 = rVarH.E();
                    if (objE3 == companion.a()) {
                        objE3 = new d0();
                        rVarH.v(objE3);
                    }
                    final d0 d0Var11111115 = (d0) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = new d0();
                        rVarH.v(objE4);
                    }
                    final d0 d0Var11111116 = (d0) objE4;
                    objE5 = rVarH.E();
                    if (objE5 == companion.a()) {
                        objE5 = new d0();
                        rVarH.v(objE5);
                    }
                    final d0 d0Var21118 = (d0) objE5;
                    i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                    if (i89 != 1) {
                        rVarH.X(-1148515264);
                        urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else if (i89 != 2) {
                        rVarH.X(-1148511225);
                        urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else {
                        if (i89 == 3) {
                            rVarH.X(-1148518986);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(-1148507365);
                        urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                        rVarH.R();
                    }
                    final ur urVar110 = urVarD;
                    objE6 = rVarH.E();
                    if (objE6 == companion.a()) {
                        objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                        rVarH.v(objE6);
                    }
                    final a3 a3Var110 = (a3) objE6;
                    final b bVar110 = new b(a3Var110);
                    final d0 d0Var21119 = d0Var13;
                    p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.u(baseScaffoldData, urVar110, bVar110, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var11111114, z28, d0Var15, d0Var11111115, d0Var11111116, d0Var21118, d0Var16, d0Var21119, d0Var14, pVar7, f25, a3Var110, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    v2Var3 = v2Var4;
                    pVar4 = pVar6;
                    i86 = i87;
                    j17 = j18;
                    c4Var2 = c4Var3;
                    z18 = z27;
                    f17 = f26;
                    z19 = z28;
                    d0Var5 = d0Var15;
                    d0Var6 = d0Var16;
                    d0Var7 = d0Var21119;
                    d0Var8 = d0Var14;
                    pVar5 = pVar7;
                    f18 = f25;
                } else {
                    rVarH.O();
                    z18 = z15;
                    d0Var5 = d0Var4;
                    f17 = f16;
                    pVar4 = pVar3;
                    v2Var3 = v2Var2;
                    i86 = i27;
                    c4Var2 = c4VarA;
                    pVar5 = pVarC;
                    j17 = j16;
                    d0Var6 = d0Var;
                    d0Var7 = d0Var2;
                    d0Var8 = d0Var3;
                    z19 = z16;
                    f18 = f15;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: i50.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 100663296;
            i48 = i18 & 512;
            if (i48 != 0) {
                if ((i16 & 805306368) == 0) {
                    if (rVarH.W(d0Var2)) {
                        i49 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i49 = 268435456;
                    }
                    i19 |= i49;
                }
                i55 = i18 & 1024;
                if (i55 != 0) {
                    i56 = i17 | 6;
                } else if ((i17 & 6) == 0) {
                    if (rVarH.W(d0Var3)) {
                        i57 = 4;
                    } else {
                        i57 = 2;
                    }
                    i56 = i17 | i57;
                } else {
                    i56 = i17;
                }
                i58 = i18 & 2048;
                if (i58 != 0) {
                    i56 |= 48;
                } else if ((i17 & 48) != 0) {
                    if (rVarH.W(d0Var4)) {
                        i59 = 32;
                    } else {
                        i59 = 16;
                    }
                    i56 |= i59;
                }
                i65 = i56;
                i66 = i18 & PKIFailureInfo.certConfirmed;
                if (i66 != 0) {
                    i68 = i65 | MLKEMEngine.KyberPolyBytes;
                } else {
                    i67 = i65;
                    if ((i17 & MLKEMEngine.KyberPolyBytes) != 0) {
                        if (rVarH.a(z16)) {
                            i69 = 256;
                        } else {
                            i69 = 128;
                        }
                        i67 |= i69;
                    }
                    i68 = i67;
                }
                i75 = i18 & PKIFailureInfo.certRevoked;
                if (i75 != 0) {
                    i77 = i68 | 3072;
                } else {
                    i76 = i68;
                    if ((i17 & 3072) == 0) {
                        i77 = i76 | (rVarH.b(f15) ? 2048 : 1024);
                    } else {
                        i77 = i76;
                    }
                }
                i78 = i18 & 16384;
                if (i78 != 0) {
                    i79 = i77;
                    if ((i17 & 24576) == 0) {
                        if (rVarH.b(f16)) {
                            i29 = 16384;
                        }
                        i79 |= i29;
                    }
                    if ((i17 & 196608) == 0) {
                        if (!rVarH.G(qVar)) {
                            i36 = PKIFailureInfo.notAuthorized;
                        }
                        i79 |= i36;
                    }
                    i85 = i79;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i19 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j111118 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j111118;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j211114 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j211114;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        } else {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j111119 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j111119;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j211115 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j211115;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                        }
                        objE2 = rVarH.E();
                        companion = p076m2.r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        final d0 d0Var11111117 = (d0) objE2;
                        objE3 = rVarH.E();
                        if (objE3 == companion.a()) {
                            objE3 = new d0();
                            rVarH.v(objE3);
                        }
                        final d0 d0Var11111118 = (d0) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = new d0();
                            rVarH.v(objE4);
                        }
                        final d0 d0Var11111119 = (d0) objE4;
                        objE5 = rVarH.E();
                        if (objE5 == companion.a()) {
                            objE5 = new d0();
                            rVarH.v(objE5);
                        }
                        final d0 d0Var211110 = (d0) objE5;
                        i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                        if (i89 != 1) {
                            rVarH.X(-1148515264);
                            urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else if (i89 != 2) {
                            rVarH.X(-1148511225);
                            urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else {
                            if (i89 == 3) {
                                rVarH.X(-1148518986);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(-1148507365);
                            urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                            rVarH.R();
                        }
                        final ur urVar111 = urVarD;
                        objE6 = rVarH.E();
                        if (objE6 == companion.a()) {
                            objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                            rVarH.v(objE6);
                        }
                        final a3 a3Var111 = (a3) objE6;
                        final b bVar111 = new b(a3Var111);
                        final d0 d0Var211111 = d0Var13;
                        p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.u(baseScaffoldData, urVar111, bVar111, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var11111117, z28, d0Var15, d0Var11111118, d0Var11111119, d0Var211110, d0Var16, d0Var211111, d0Var14, pVar7, f25, a3Var111, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        v2Var3 = v2Var4;
                        pVar4 = pVar6;
                        i86 = i87;
                        j17 = j18;
                        c4Var2 = c4Var3;
                        z18 = z27;
                        f17 = f26;
                        z19 = z28;
                        d0Var5 = d0Var15;
                        d0Var6 = d0Var16;
                        d0Var7 = d0Var211111;
                        d0Var8 = d0Var14;
                        pVar5 = pVar7;
                        f18 = f25;
                    } else {
                        rVarH.O();
                        z18 = z15;
                        d0Var5 = d0Var4;
                        f17 = f16;
                        pVar4 = pVar3;
                        v2Var3 = v2Var2;
                        i86 = i27;
                        c4Var2 = c4VarA;
                        pVar5 = pVarC;
                        j17 = j16;
                        d0Var6 = d0Var;
                        d0Var7 = d0Var2;
                        d0Var8 = d0Var3;
                        z19 = z16;
                        f18 = f15;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: i50.j
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i79 = i77 | 24576;
                if ((i17 & 196608) == 0) {
                    if (!rVarH.G(qVar)) {
                        i36 = PKIFailureInfo.notAuthorized;
                    }
                    i79 |= i36;
                }
                i85 = i79;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i19 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j1111110 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j1111110;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j211116 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j211116;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    } else {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j1111111 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j1111111;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j211117 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j211117;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                    }
                    objE2 = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new d0();
                        rVarH.v(objE2);
                    }
                    final d0 d0Var111111110 = (d0) objE2;
                    objE3 = rVarH.E();
                    if (objE3 == companion.a()) {
                        objE3 = new d0();
                        rVarH.v(objE3);
                    }
                    final d0 d0Var111111111 = (d0) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = new d0();
                        rVarH.v(objE4);
                    }
                    final d0 d0Var111111112 = (d0) objE4;
                    objE5 = rVarH.E();
                    if (objE5 == companion.a()) {
                        objE5 = new d0();
                        rVarH.v(objE5);
                    }
                    final d0 d0Var211112 = (d0) objE5;
                    i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                    if (i89 != 1) {
                        rVarH.X(-1148515264);
                        urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else if (i89 != 2) {
                        rVarH.X(-1148511225);
                        urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else {
                        if (i89 == 3) {
                            rVarH.X(-1148518986);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(-1148507365);
                        urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                        rVarH.R();
                    }
                    final ur urVar112 = urVarD;
                    objE6 = rVarH.E();
                    if (objE6 == companion.a()) {
                        objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                        rVarH.v(objE6);
                    }
                    final a3 a3Var112 = (a3) objE6;
                    final b bVar112 = new b(a3Var112);
                    final d0 d0Var211113 = d0Var13;
                    p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.u(baseScaffoldData, urVar112, bVar112, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var111111110, z28, d0Var15, d0Var111111111, d0Var111111112, d0Var211112, d0Var16, d0Var211113, d0Var14, pVar7, f25, a3Var112, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    v2Var3 = v2Var4;
                    pVar4 = pVar6;
                    i86 = i87;
                    j17 = j18;
                    c4Var2 = c4Var3;
                    z18 = z27;
                    f17 = f26;
                    z19 = z28;
                    d0Var5 = d0Var15;
                    d0Var6 = d0Var16;
                    d0Var7 = d0Var211113;
                    d0Var8 = d0Var14;
                    pVar5 = pVar7;
                    f18 = f25;
                } else {
                    rVarH.O();
                    z18 = z15;
                    d0Var5 = d0Var4;
                    f17 = f16;
                    pVar4 = pVar3;
                    v2Var3 = v2Var2;
                    i86 = i27;
                    c4Var2 = c4VarA;
                    pVar5 = pVarC;
                    j17 = j16;
                    d0Var6 = d0Var;
                    d0Var7 = d0Var2;
                    d0Var8 = d0Var3;
                    z19 = z16;
                    f18 = f15;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: i50.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 805306368;
            i55 = i18 & 1024;
            if (i55 != 0) {
                i56 = i17 | 6;
            } else if ((i17 & 6) == 0) {
                if (rVarH.W(d0Var3)) {
                    i57 = 4;
                } else {
                    i57 = 2;
                }
                i56 = i17 | i57;
            } else {
                i56 = i17;
            }
            i58 = i18 & 2048;
            if (i58 != 0) {
                i56 |= 48;
            } else if ((i17 & 48) != 0) {
                if (rVarH.W(d0Var4)) {
                    i59 = 32;
                } else {
                    i59 = 16;
                }
                i56 |= i59;
            }
            i65 = i56;
            i66 = i18 & PKIFailureInfo.certConfirmed;
            if (i66 != 0) {
                i68 = i65 | MLKEMEngine.KyberPolyBytes;
            } else {
                i67 = i65;
                if ((i17 & MLKEMEngine.KyberPolyBytes) != 0) {
                    if (rVarH.a(z16)) {
                        i69 = 256;
                    } else {
                        i69 = 128;
                    }
                    i67 |= i69;
                }
                i68 = i67;
            }
            i75 = i18 & PKIFailureInfo.certRevoked;
            if (i75 != 0) {
                i77 = i68 | 3072;
            } else {
                i76 = i68;
                if ((i17 & 3072) == 0) {
                    i77 = i76 | (rVarH.b(f15) ? 2048 : 1024);
                } else {
                    i77 = i76;
                }
            }
            i78 = i18 & 16384;
            if (i78 != 0) {
                i79 = i77;
                if ((i17 & 24576) == 0) {
                    if (rVarH.b(f16)) {
                        i29 = 16384;
                    }
                    i79 |= i29;
                }
                if ((i17 & 196608) == 0) {
                    if (!rVarH.G(qVar)) {
                        i36 = PKIFailureInfo.notAuthorized;
                    }
                    i79 |= i36;
                }
                i85 = i79;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i19 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j1111112 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j1111112;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j211118 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j211118;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    } else {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j1111113 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j1111113;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j211119 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j211119;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                    }
                    objE2 = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new d0();
                        rVarH.v(objE2);
                    }
                    final d0 d0Var111111113 = (d0) objE2;
                    objE3 = rVarH.E();
                    if (objE3 == companion.a()) {
                        objE3 = new d0();
                        rVarH.v(objE3);
                    }
                    final d0 d0Var111111114 = (d0) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = new d0();
                        rVarH.v(objE4);
                    }
                    final d0 d0Var111111115 = (d0) objE4;
                    objE5 = rVarH.E();
                    if (objE5 == companion.a()) {
                        objE5 = new d0();
                        rVarH.v(objE5);
                    }
                    final d0 d0Var211114 = (d0) objE5;
                    i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                    if (i89 != 1) {
                        rVarH.X(-1148515264);
                        urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else if (i89 != 2) {
                        rVarH.X(-1148511225);
                        urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else {
                        if (i89 == 3) {
                            rVarH.X(-1148518986);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(-1148507365);
                        urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                        rVarH.R();
                    }
                    final ur urVar113 = urVarD;
                    objE6 = rVarH.E();
                    if (objE6 == companion.a()) {
                        objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                        rVarH.v(objE6);
                    }
                    final a3 a3Var113 = (a3) objE6;
                    final b bVar113 = new b(a3Var113);
                    final d0 d0Var211115 = d0Var13;
                    p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.u(baseScaffoldData, urVar113, bVar113, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var111111113, z28, d0Var15, d0Var111111114, d0Var111111115, d0Var211114, d0Var16, d0Var211115, d0Var14, pVar7, f25, a3Var113, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    v2Var3 = v2Var4;
                    pVar4 = pVar6;
                    i86 = i87;
                    j17 = j18;
                    c4Var2 = c4Var3;
                    z18 = z27;
                    f17 = f26;
                    z19 = z28;
                    d0Var5 = d0Var15;
                    d0Var6 = d0Var16;
                    d0Var7 = d0Var211115;
                    d0Var8 = d0Var14;
                    pVar5 = pVar7;
                    f18 = f25;
                } else {
                    rVarH.O();
                    z18 = z15;
                    d0Var5 = d0Var4;
                    f17 = f16;
                    pVar4 = pVar3;
                    v2Var3 = v2Var2;
                    i86 = i27;
                    c4Var2 = c4VarA;
                    pVar5 = pVarC;
                    j17 = j16;
                    d0Var6 = d0Var;
                    d0Var7 = d0Var2;
                    d0Var8 = d0Var3;
                    z19 = z16;
                    f18 = f15;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: i50.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i79 = i77 | 24576;
            if ((i17 & 196608) == 0) {
                if (!rVarH.G(qVar)) {
                    i36 = PKIFailureInfo.notAuthorized;
                }
                i79 |= i36;
            }
            i85 = i79;
            if ((i19 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i19 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i98 != 0) {
                        pVarC = v.f89493a.c();
                    }
                    if (i25 != 0) {
                        pVarD = v.f89493a.d();
                    } else {
                        pVarD = pVar3;
                    }
                    if ((i18 & 8) != 0) {
                        iA = cc.INSTANCE.a();
                        i19 &= -7169;
                    } else {
                        iA = i27;
                    }
                    if ((i18 & 16) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i19 &= -57345;
                    } else {
                        jA = j16;
                    }
                    if ((i18 & 32) != 0) {
                        i19 &= -458753;
                        c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                    }
                    if (i37 != 0) {
                        v2Var2 = null;
                    }
                    if (i39 != 0) {
                        z25 = false;
                    } else {
                        z25 = z15;
                    }
                    if (i46 != 0) {
                        d0Var9 = null;
                    } else {
                        d0Var9 = d0Var;
                    }
                    if (i48 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var2;
                    }
                    if (i55 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        d0Var11 = (d0) objE;
                    } else {
                        d0Var11 = d0Var3;
                    }
                    if (i58 != 0) {
                        d0Var12 = null;
                    } else {
                        d0Var12 = d0Var4;
                    }
                    if (i66 != 0) {
                        z26 = true;
                    } else {
                        z26 = z16;
                    }
                    if (i75 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f15;
                    }
                    if (i78 != 0) {
                        long j1111114 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j1111114;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                        f26 = 1.0f;
                        z27 = z25;
                    } else {
                        long j2111110 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j2111110;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        z27 = z25;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        f26 = f16;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                    }
                } else {
                    if (i98 != 0) {
                        pVarC = v.f89493a.c();
                    }
                    if (i25 != 0) {
                        pVarD = v.f89493a.d();
                    } else {
                        pVarD = pVar3;
                    }
                    if ((i18 & 8) != 0) {
                        iA = cc.INSTANCE.a();
                        i19 &= -7169;
                    } else {
                        iA = i27;
                    }
                    if ((i18 & 16) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i19 &= -57345;
                    } else {
                        jA = j16;
                    }
                    if ((i18 & 32) != 0) {
                        i19 &= -458753;
                        c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                    }
                    if (i37 != 0) {
                        v2Var2 = null;
                    }
                    if (i39 != 0) {
                        z25 = false;
                    } else {
                        z25 = z15;
                    }
                    if (i46 != 0) {
                        d0Var9 = null;
                    } else {
                        d0Var9 = d0Var;
                    }
                    if (i48 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var2;
                    }
                    if (i55 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        d0Var11 = (d0) objE;
                    } else {
                        d0Var11 = d0Var3;
                    }
                    if (i58 != 0) {
                        d0Var12 = null;
                    } else {
                        d0Var12 = d0Var4;
                    }
                    if (i66 != 0) {
                        z26 = true;
                    } else {
                        z26 = z16;
                    }
                    if (i75 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f15;
                    }
                    if (i78 != 0) {
                        long j1111115 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j1111115;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                        f26 = 1.0f;
                        z27 = z25;
                    } else {
                        long j2111111 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j2111111;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        z27 = z25;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        f26 = f16;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                }
                objE2 = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = new d0();
                    rVarH.v(objE2);
                }
                final d0 d0Var111111116 = (d0) objE2;
                objE3 = rVarH.E();
                if (objE3 == companion.a()) {
                    objE3 = new d0();
                    rVarH.v(objE3);
                }
                final d0 d0Var111111117 = (d0) objE3;
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = new d0();
                    rVarH.v(objE4);
                }
                final d0 d0Var111111118 = (d0) objE4;
                objE5 = rVarH.E();
                if (objE5 == companion.a()) {
                    objE5 = new d0();
                    rVarH.v(objE5);
                }
                final d0 d0Var211116 = (d0) objE5;
                i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                if (i89 != 1) {
                    rVarH.X(-1148515264);
                    urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                    rVarH.R();
                } else if (i89 != 2) {
                    rVarH.X(-1148511225);
                    urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                    rVarH.R();
                } else {
                    if (i89 == 3) {
                        rVarH.X(-1148518986);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(-1148507365);
                    urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                    rVarH.R();
                }
                final ur urVar114 = urVarD;
                objE6 = rVarH.E();
                if (objE6 == companion.a()) {
                    objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                    rVarH.v(objE6);
                }
                final a3 a3Var114 = (a3) objE6;
                final b bVar114 = new b(a3Var114);
                final d0 d0Var211117 = d0Var13;
                p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.u(baseScaffoldData, urVar114, bVar114, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var111111116, z28, d0Var15, d0Var111111117, d0Var111111118, d0Var211116, d0Var16, d0Var211117, d0Var14, pVar7, f25, a3Var114, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                v2Var3 = v2Var4;
                pVar4 = pVar6;
                i86 = i87;
                j17 = j18;
                c4Var2 = c4Var3;
                z18 = z27;
                f17 = f26;
                z19 = z28;
                d0Var5 = d0Var15;
                d0Var6 = d0Var16;
                d0Var7 = d0Var211117;
                d0Var8 = d0Var14;
                pVar5 = pVar7;
                f18 = f25;
            } else {
                rVarH.O();
                z18 = z15;
                d0Var5 = d0Var4;
                f17 = f16;
                pVar4 = pVar3;
                v2Var3 = v2Var2;
                i86 = i27;
                c4Var2 = c4VarA;
                pVar5 = pVarC;
                j17 = j16;
                d0Var6 = d0Var;
                d0Var7 = d0Var2;
                d0Var8 = d0Var3;
                z19 = z16;
                f18 = f15;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: i50.j
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= MLKEMEngine.KyberPolyBytes;
        pVar3 = pVar2;
        if ((i16 & 3072) == 0) {
            if ((i18 & 8) == 0) {
                i27 = i15;
                if (rVarH.c(i27)) {
                    i97 = 2048;
                }
                i19 |= i97;
            } else {
                i27 = i15;
            }
            i97 = 1024;
            i19 |= i97;
        } else {
            i27 = i15;
        }
        i28 = i16 & 24576;
        i29 = PKIFailureInfo.certRevoked;
        if (i28 == 0) {
            j16 = j15;
            if ((i18 & 16) == 0) {
                i96 = 8192;
            } else {
                i96 = 8192;
            }
            i19 |= i96;
        } else {
            j16 = j15;
        }
        i35 = i16 & 196608;
        i36 = PKIFailureInfo.unsupportedVersion;
        if (i35 == 0) {
            c4VarA = c4Var;
            if ((i18 & 32) == 0) {
                i95 = PKIFailureInfo.notAuthorized;
            } else {
                i95 = PKIFailureInfo.notAuthorized;
            }
            i19 |= i95;
        } else {
            c4VarA = c4Var;
        }
        i37 = i18 & 64;
        if (i37 != 0) {
            i19 |= 1572864;
            v2Var2 = v2Var;
        } else {
            v2Var2 = v2Var;
            if ((i16 & 1572864) == 0) {
                if (rVarH.G(v2Var2)) {
                    i38 = PKIFailureInfo.badCertTemplate;
                } else {
                    i38 = PKIFailureInfo.signerNotTrusted;
                }
                i19 |= i38;
            }
        }
        i39 = i18 & 128;
        if (i39 != 0) {
            i19 |= 12582912;
        } else if ((i16 & 12582912) == 0) {
            if (rVarH.a(z15)) {
                i45 = 8388608;
            } else {
                i45 = 4194304;
            }
            i19 |= i45;
        }
        i46 = i18 & 256;
        if (i46 != 0) {
            if ((i16 & 100663296) == 0) {
                if (rVarH.W(d0Var)) {
                    i47 = 67108864;
                } else {
                    i47 = 33554432;
                }
                i19 |= i47;
            }
            i48 = i18 & 512;
            if (i48 != 0) {
                if ((i16 & 805306368) == 0) {
                    if (rVarH.W(d0Var2)) {
                        i49 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i49 = 268435456;
                    }
                    i19 |= i49;
                }
                i55 = i18 & 1024;
                if (i55 != 0) {
                    i56 = i17 | 6;
                } else if ((i17 & 6) == 0) {
                    if (rVarH.W(d0Var3)) {
                        i57 = 4;
                    } else {
                        i57 = 2;
                    }
                    i56 = i17 | i57;
                } else {
                    i56 = i17;
                }
                i58 = i18 & 2048;
                if (i58 != 0) {
                    i56 |= 48;
                } else if ((i17 & 48) != 0) {
                    if (rVarH.W(d0Var4)) {
                        i59 = 32;
                    } else {
                        i59 = 16;
                    }
                    i56 |= i59;
                }
                i65 = i56;
                i66 = i18 & PKIFailureInfo.certConfirmed;
                if (i66 != 0) {
                    i68 = i65 | MLKEMEngine.KyberPolyBytes;
                } else {
                    i67 = i65;
                    if ((i17 & MLKEMEngine.KyberPolyBytes) != 0) {
                        if (rVarH.a(z16)) {
                            i69 = 256;
                        } else {
                            i69 = 128;
                        }
                        i67 |= i69;
                    }
                    i68 = i67;
                }
                i75 = i18 & PKIFailureInfo.certRevoked;
                if (i75 != 0) {
                    i77 = i68 | 3072;
                } else {
                    i76 = i68;
                    if ((i17 & 3072) == 0) {
                        i77 = i76 | (rVarH.b(f15) ? 2048 : 1024);
                    } else {
                        i77 = i76;
                    }
                }
                i78 = i18 & 16384;
                if (i78 != 0) {
                    i79 = i77;
                    if ((i17 & 24576) == 0) {
                        if (rVarH.b(f16)) {
                            i29 = 16384;
                        }
                        i79 |= i29;
                    }
                    if ((i17 & 196608) == 0) {
                        if (!rVarH.G(qVar)) {
                            i36 = PKIFailureInfo.notAuthorized;
                        }
                        i79 |= i36;
                    }
                    i85 = i79;
                    if ((i19 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i19 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j1111116 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j1111116;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j2111112 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j2111112;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        } else {
                            if (i98 != 0) {
                                pVarC = v.f89493a.c();
                            }
                            if (i25 != 0) {
                                pVarD = v.f89493a.d();
                            } else {
                                pVarD = pVar3;
                            }
                            if ((i18 & 8) != 0) {
                                iA = cc.INSTANCE.a();
                                i19 &= -7169;
                            } else {
                                iA = i27;
                            }
                            if ((i18 & 16) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i19 &= -57345;
                            } else {
                                jA = j16;
                            }
                            if ((i18 & 32) != 0) {
                                i19 &= -458753;
                                c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z15;
                            }
                            if (i46 != 0) {
                                d0Var9 = null;
                            } else {
                                d0Var9 = d0Var;
                            }
                            if (i48 != 0) {
                                d0Var10 = null;
                            } else {
                                d0Var10 = d0Var2;
                            }
                            if (i55 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var11 = (d0) objE;
                            } else {
                                d0Var11 = d0Var3;
                            }
                            if (i58 != 0) {
                                d0Var12 = null;
                            } else {
                                d0Var12 = d0Var4;
                            }
                            if (i66 != 0) {
                                z26 = true;
                            } else {
                                z26 = z16;
                            }
                            if (i75 != 0) {
                                f19 = 1.0f;
                            } else {
                                f19 = f15;
                            }
                            if (i78 != 0) {
                                long j1111117 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j1111117;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                                f26 = 1.0f;
                                z27 = z25;
                            } else {
                                long j2111113 = jA;
                                pVar6 = pVarD;
                                d0Var13 = d0Var10;
                                j18 = j2111113;
                                d0Var14 = d0Var11;
                                d0Var15 = d0Var12;
                                i87 = iA;
                                z27 = z25;
                                d0Var16 = d0Var9;
                                pVar7 = pVarC;
                                f25 = f19;
                                z28 = z26;
                                w5Var = null;
                                i88 = -45887867;
                                f26 = f16;
                                v2Var4 = v2Var2;
                                c4Var3 = c4VarA;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                        }
                        objE2 = rVarH.E();
                        companion = p076m2.r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        final d0 d0Var111111119 = (d0) objE2;
                        objE3 = rVarH.E();
                        if (objE3 == companion.a()) {
                            objE3 = new d0();
                            rVarH.v(objE3);
                        }
                        final d0 d0Var1111111110 = (d0) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = new d0();
                            rVarH.v(objE4);
                        }
                        final d0 d0Var1111111111 = (d0) objE4;
                        objE5 = rVarH.E();
                        if (objE5 == companion.a()) {
                            objE5 = new d0();
                            rVarH.v(objE5);
                        }
                        final d0 d0Var211118 = (d0) objE5;
                        i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                        if (i89 != 1) {
                            rVarH.X(-1148515264);
                            urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else if (i89 != 2) {
                            rVarH.X(-1148511225);
                            urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                            rVarH.R();
                        } else {
                            if (i89 == 3) {
                                rVarH.X(-1148518986);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(-1148507365);
                            urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                            rVarH.R();
                        }
                        final ur urVar115 = urVarD;
                        objE6 = rVarH.E();
                        if (objE6 == companion.a()) {
                            objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                            rVarH.v(objE6);
                        }
                        final a3 a3Var115 = (a3) objE6;
                        final b bVar115 = new b(a3Var115);
                        final d0 d0Var211119 = d0Var13;
                        p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.u(baseScaffoldData, urVar115, bVar115, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var111111119, z28, d0Var15, d0Var1111111110, d0Var1111111111, d0Var211118, d0Var16, d0Var211119, d0Var14, pVar7, f25, a3Var115, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        v2Var3 = v2Var4;
                        pVar4 = pVar6;
                        i86 = i87;
                        j17 = j18;
                        c4Var2 = c4Var3;
                        z18 = z27;
                        f17 = f26;
                        z19 = z28;
                        d0Var5 = d0Var15;
                        d0Var6 = d0Var16;
                        d0Var7 = d0Var211119;
                        d0Var8 = d0Var14;
                        pVar5 = pVar7;
                        f18 = f25;
                    } else {
                        rVarH.O();
                        z18 = z15;
                        d0Var5 = d0Var4;
                        f17 = f16;
                        pVar4 = pVar3;
                        v2Var3 = v2Var2;
                        i86 = i27;
                        c4Var2 = c4VarA;
                        pVar5 = pVarC;
                        j17 = j16;
                        d0Var6 = d0Var;
                        d0Var7 = d0Var2;
                        d0Var8 = d0Var3;
                        z19 = z16;
                        f18 = f15;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: i50.j
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i79 = i77 | 24576;
                if ((i17 & 196608) == 0) {
                    if (!rVarH.G(qVar)) {
                        i36 = PKIFailureInfo.notAuthorized;
                    }
                    i79 |= i36;
                }
                i85 = i79;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i19 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j1111118 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j1111118;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j2111114 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j2111114;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    } else {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j1111119 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j1111119;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j2111115 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j2111115;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                    }
                    objE2 = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new d0();
                        rVarH.v(objE2);
                    }
                    final d0 d0Var1111111112 = (d0) objE2;
                    objE3 = rVarH.E();
                    if (objE3 == companion.a()) {
                        objE3 = new d0();
                        rVarH.v(objE3);
                    }
                    final d0 d0Var1111111113 = (d0) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = new d0();
                        rVarH.v(objE4);
                    }
                    final d0 d0Var1111111114 = (d0) objE4;
                    objE5 = rVarH.E();
                    if (objE5 == companion.a()) {
                        objE5 = new d0();
                        rVarH.v(objE5);
                    }
                    final d0 d0Var2111110 = (d0) objE5;
                    i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                    if (i89 != 1) {
                        rVarH.X(-1148515264);
                        urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else if (i89 != 2) {
                        rVarH.X(-1148511225);
                        urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else {
                        if (i89 == 3) {
                            rVarH.X(-1148518986);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(-1148507365);
                        urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                        rVarH.R();
                    }
                    final ur urVar116 = urVarD;
                    objE6 = rVarH.E();
                    if (objE6 == companion.a()) {
                        objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                        rVarH.v(objE6);
                    }
                    final a3 a3Var116 = (a3) objE6;
                    final b bVar116 = new b(a3Var116);
                    final d0 d0Var2111111 = d0Var13;
                    p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.u(baseScaffoldData, urVar116, bVar116, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var1111111112, z28, d0Var15, d0Var1111111113, d0Var1111111114, d0Var2111110, d0Var16, d0Var2111111, d0Var14, pVar7, f25, a3Var116, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    v2Var3 = v2Var4;
                    pVar4 = pVar6;
                    i86 = i87;
                    j17 = j18;
                    c4Var2 = c4Var3;
                    z18 = z27;
                    f17 = f26;
                    z19 = z28;
                    d0Var5 = d0Var15;
                    d0Var6 = d0Var16;
                    d0Var7 = d0Var2111111;
                    d0Var8 = d0Var14;
                    pVar5 = pVar7;
                    f18 = f25;
                } else {
                    rVarH.O();
                    z18 = z15;
                    d0Var5 = d0Var4;
                    f17 = f16;
                    pVar4 = pVar3;
                    v2Var3 = v2Var2;
                    i86 = i27;
                    c4Var2 = c4VarA;
                    pVar5 = pVarC;
                    j17 = j16;
                    d0Var6 = d0Var;
                    d0Var7 = d0Var2;
                    d0Var8 = d0Var3;
                    z19 = z16;
                    f18 = f15;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: i50.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 805306368;
            i55 = i18 & 1024;
            if (i55 != 0) {
                i56 = i17 | 6;
            } else if ((i17 & 6) == 0) {
                if (rVarH.W(d0Var3)) {
                    i57 = 4;
                } else {
                    i57 = 2;
                }
                i56 = i17 | i57;
            } else {
                i56 = i17;
            }
            i58 = i18 & 2048;
            if (i58 != 0) {
                i56 |= 48;
            } else if ((i17 & 48) != 0) {
                if (rVarH.W(d0Var4)) {
                    i59 = 32;
                } else {
                    i59 = 16;
                }
                i56 |= i59;
            }
            i65 = i56;
            i66 = i18 & PKIFailureInfo.certConfirmed;
            if (i66 != 0) {
                i68 = i65 | MLKEMEngine.KyberPolyBytes;
            } else {
                i67 = i65;
                if ((i17 & MLKEMEngine.KyberPolyBytes) != 0) {
                    if (rVarH.a(z16)) {
                        i69 = 256;
                    } else {
                        i69 = 128;
                    }
                    i67 |= i69;
                }
                i68 = i67;
            }
            i75 = i18 & PKIFailureInfo.certRevoked;
            if (i75 != 0) {
                i77 = i68 | 3072;
            } else {
                i76 = i68;
                if ((i17 & 3072) == 0) {
                    i77 = i76 | (rVarH.b(f15) ? 2048 : 1024);
                } else {
                    i77 = i76;
                }
            }
            i78 = i18 & 16384;
            if (i78 != 0) {
                i79 = i77;
                if ((i17 & 24576) == 0) {
                    if (rVarH.b(f16)) {
                        i29 = 16384;
                    }
                    i79 |= i29;
                }
                if ((i17 & 196608) == 0) {
                    if (!rVarH.G(qVar)) {
                        i36 = PKIFailureInfo.notAuthorized;
                    }
                    i79 |= i36;
                }
                i85 = i79;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i19 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j11111110 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j11111110;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j2111116 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j2111116;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    } else {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j11111111 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j11111111;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j2111117 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j2111117;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                    }
                    objE2 = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new d0();
                        rVarH.v(objE2);
                    }
                    final d0 d0Var1111111115 = (d0) objE2;
                    objE3 = rVarH.E();
                    if (objE3 == companion.a()) {
                        objE3 = new d0();
                        rVarH.v(objE3);
                    }
                    final d0 d0Var1111111116 = (d0) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = new d0();
                        rVarH.v(objE4);
                    }
                    final d0 d0Var1111111117 = (d0) objE4;
                    objE5 = rVarH.E();
                    if (objE5 == companion.a()) {
                        objE5 = new d0();
                        rVarH.v(objE5);
                    }
                    final d0 d0Var2111112 = (d0) objE5;
                    i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                    if (i89 != 1) {
                        rVarH.X(-1148515264);
                        urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else if (i89 != 2) {
                        rVarH.X(-1148511225);
                        urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else {
                        if (i89 == 3) {
                            rVarH.X(-1148518986);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(-1148507365);
                        urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                        rVarH.R();
                    }
                    final ur urVar117 = urVarD;
                    objE6 = rVarH.E();
                    if (objE6 == companion.a()) {
                        objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                        rVarH.v(objE6);
                    }
                    final a3 a3Var117 = (a3) objE6;
                    final b bVar117 = new b(a3Var117);
                    final d0 d0Var2111113 = d0Var13;
                    p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.u(baseScaffoldData, urVar117, bVar117, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var1111111115, z28, d0Var15, d0Var1111111116, d0Var1111111117, d0Var2111112, d0Var16, d0Var2111113, d0Var14, pVar7, f25, a3Var117, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    v2Var3 = v2Var4;
                    pVar4 = pVar6;
                    i86 = i87;
                    j17 = j18;
                    c4Var2 = c4Var3;
                    z18 = z27;
                    f17 = f26;
                    z19 = z28;
                    d0Var5 = d0Var15;
                    d0Var6 = d0Var16;
                    d0Var7 = d0Var2111113;
                    d0Var8 = d0Var14;
                    pVar5 = pVar7;
                    f18 = f25;
                } else {
                    rVarH.O();
                    z18 = z15;
                    d0Var5 = d0Var4;
                    f17 = f16;
                    pVar4 = pVar3;
                    v2Var3 = v2Var2;
                    i86 = i27;
                    c4Var2 = c4VarA;
                    pVar5 = pVarC;
                    j17 = j16;
                    d0Var6 = d0Var;
                    d0Var7 = d0Var2;
                    d0Var8 = d0Var3;
                    z19 = z16;
                    f18 = f15;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: i50.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i79 = i77 | 24576;
            if ((i17 & 196608) == 0) {
                if (!rVarH.G(qVar)) {
                    i36 = PKIFailureInfo.notAuthorized;
                }
                i79 |= i36;
            }
            i85 = i79;
            if ((i19 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i19 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i98 != 0) {
                        pVarC = v.f89493a.c();
                    }
                    if (i25 != 0) {
                        pVarD = v.f89493a.d();
                    } else {
                        pVarD = pVar3;
                    }
                    if ((i18 & 8) != 0) {
                        iA = cc.INSTANCE.a();
                        i19 &= -7169;
                    } else {
                        iA = i27;
                    }
                    if ((i18 & 16) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i19 &= -57345;
                    } else {
                        jA = j16;
                    }
                    if ((i18 & 32) != 0) {
                        i19 &= -458753;
                        c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                    }
                    if (i37 != 0) {
                        v2Var2 = null;
                    }
                    if (i39 != 0) {
                        z25 = false;
                    } else {
                        z25 = z15;
                    }
                    if (i46 != 0) {
                        d0Var9 = null;
                    } else {
                        d0Var9 = d0Var;
                    }
                    if (i48 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var2;
                    }
                    if (i55 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        d0Var11 = (d0) objE;
                    } else {
                        d0Var11 = d0Var3;
                    }
                    if (i58 != 0) {
                        d0Var12 = null;
                    } else {
                        d0Var12 = d0Var4;
                    }
                    if (i66 != 0) {
                        z26 = true;
                    } else {
                        z26 = z16;
                    }
                    if (i75 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f15;
                    }
                    if (i78 != 0) {
                        long j11111112 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j11111112;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                        f26 = 1.0f;
                        z27 = z25;
                    } else {
                        long j2111118 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j2111118;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        z27 = z25;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        f26 = f16;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                    }
                } else {
                    if (i98 != 0) {
                        pVarC = v.f89493a.c();
                    }
                    if (i25 != 0) {
                        pVarD = v.f89493a.d();
                    } else {
                        pVarD = pVar3;
                    }
                    if ((i18 & 8) != 0) {
                        iA = cc.INSTANCE.a();
                        i19 &= -7169;
                    } else {
                        iA = i27;
                    }
                    if ((i18 & 16) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i19 &= -57345;
                    } else {
                        jA = j16;
                    }
                    if ((i18 & 32) != 0) {
                        i19 &= -458753;
                        c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                    }
                    if (i37 != 0) {
                        v2Var2 = null;
                    }
                    if (i39 != 0) {
                        z25 = false;
                    } else {
                        z25 = z15;
                    }
                    if (i46 != 0) {
                        d0Var9 = null;
                    } else {
                        d0Var9 = d0Var;
                    }
                    if (i48 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var2;
                    }
                    if (i55 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        d0Var11 = (d0) objE;
                    } else {
                        d0Var11 = d0Var3;
                    }
                    if (i58 != 0) {
                        d0Var12 = null;
                    } else {
                        d0Var12 = d0Var4;
                    }
                    if (i66 != 0) {
                        z26 = true;
                    } else {
                        z26 = z16;
                    }
                    if (i75 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f15;
                    }
                    if (i78 != 0) {
                        long j11111113 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j11111113;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                        f26 = 1.0f;
                        z27 = z25;
                    } else {
                        long j2111119 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j2111119;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        z27 = z25;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        f26 = f16;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                }
                objE2 = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = new d0();
                    rVarH.v(objE2);
                }
                final d0 d0Var1111111118 = (d0) objE2;
                objE3 = rVarH.E();
                if (objE3 == companion.a()) {
                    objE3 = new d0();
                    rVarH.v(objE3);
                }
                final d0 d0Var1111111119 = (d0) objE3;
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = new d0();
                    rVarH.v(objE4);
                }
                final d0 d0Var11111111110 = (d0) objE4;
                objE5 = rVarH.E();
                if (objE5 == companion.a()) {
                    objE5 = new d0();
                    rVarH.v(objE5);
                }
                final d0 d0Var2111114 = (d0) objE5;
                i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                if (i89 != 1) {
                    rVarH.X(-1148515264);
                    urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                    rVarH.R();
                } else if (i89 != 2) {
                    rVarH.X(-1148511225);
                    urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                    rVarH.R();
                } else {
                    if (i89 == 3) {
                        rVarH.X(-1148518986);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(-1148507365);
                    urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                    rVarH.R();
                }
                final ur urVar118 = urVarD;
                objE6 = rVarH.E();
                if (objE6 == companion.a()) {
                    objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                    rVarH.v(objE6);
                }
                final a3 a3Var118 = (a3) objE6;
                final b bVar118 = new b(a3Var118);
                final d0 d0Var2111115 = d0Var13;
                p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.u(baseScaffoldData, urVar118, bVar118, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var1111111118, z28, d0Var15, d0Var1111111119, d0Var11111111110, d0Var2111114, d0Var16, d0Var2111115, d0Var14, pVar7, f25, a3Var118, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                v2Var3 = v2Var4;
                pVar4 = pVar6;
                i86 = i87;
                j17 = j18;
                c4Var2 = c4Var3;
                z18 = z27;
                f17 = f26;
                z19 = z28;
                d0Var5 = d0Var15;
                d0Var6 = d0Var16;
                d0Var7 = d0Var2111115;
                d0Var8 = d0Var14;
                pVar5 = pVar7;
                f18 = f25;
            } else {
                rVarH.O();
                z18 = z15;
                d0Var5 = d0Var4;
                f17 = f16;
                pVar4 = pVar3;
                v2Var3 = v2Var2;
                i86 = i27;
                c4Var2 = c4VarA;
                pVar5 = pVarC;
                j17 = j16;
                d0Var6 = d0Var;
                d0Var7 = d0Var2;
                d0Var8 = d0Var3;
                z19 = z16;
                f18 = f15;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: i50.j
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 100663296;
        i48 = i18 & 512;
        if (i48 != 0) {
            if ((i16 & 805306368) == 0) {
                if (rVarH.W(d0Var2)) {
                    i49 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i49 = 268435456;
                }
                i19 |= i49;
            }
            i55 = i18 & 1024;
            if (i55 != 0) {
                i56 = i17 | 6;
            } else if ((i17 & 6) == 0) {
                if (rVarH.W(d0Var3)) {
                    i57 = 4;
                } else {
                    i57 = 2;
                }
                i56 = i17 | i57;
            } else {
                i56 = i17;
            }
            i58 = i18 & 2048;
            if (i58 != 0) {
                i56 |= 48;
            } else if ((i17 & 48) != 0) {
                if (rVarH.W(d0Var4)) {
                    i59 = 32;
                } else {
                    i59 = 16;
                }
                i56 |= i59;
            }
            i65 = i56;
            i66 = i18 & PKIFailureInfo.certConfirmed;
            if (i66 != 0) {
                i68 = i65 | MLKEMEngine.KyberPolyBytes;
            } else {
                i67 = i65;
                if ((i17 & MLKEMEngine.KyberPolyBytes) != 0) {
                    if (rVarH.a(z16)) {
                        i69 = 256;
                    } else {
                        i69 = 128;
                    }
                    i67 |= i69;
                }
                i68 = i67;
            }
            i75 = i18 & PKIFailureInfo.certRevoked;
            if (i75 != 0) {
                i77 = i68 | 3072;
            } else {
                i76 = i68;
                if ((i17 & 3072) == 0) {
                    i77 = i76 | (rVarH.b(f15) ? 2048 : 1024);
                } else {
                    i77 = i76;
                }
            }
            i78 = i18 & 16384;
            if (i78 != 0) {
                i79 = i77;
                if ((i17 & 24576) == 0) {
                    if (rVarH.b(f16)) {
                        i29 = 16384;
                    }
                    i79 |= i29;
                }
                if ((i17 & 196608) == 0) {
                    if (!rVarH.G(qVar)) {
                        i36 = PKIFailureInfo.notAuthorized;
                    }
                    i79 |= i36;
                }
                i85 = i79;
                if ((i19 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i19 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j11111114 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j11111114;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j21111110 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j21111110;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    } else {
                        if (i98 != 0) {
                            pVarC = v.f89493a.c();
                        }
                        if (i25 != 0) {
                            pVarD = v.f89493a.d();
                        } else {
                            pVarD = pVar3;
                        }
                        if ((i18 & 8) != 0) {
                            iA = cc.INSTANCE.a();
                            i19 &= -7169;
                        } else {
                            iA = i27;
                        }
                        if ((i18 & 16) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i19 &= -57345;
                        } else {
                            jA = j16;
                        }
                        if ((i18 & 32) != 0) {
                            i19 &= -458753;
                            c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z15;
                        }
                        if (i46 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var;
                        }
                        if (i48 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i55 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var11 = (d0) objE;
                        } else {
                            d0Var11 = d0Var3;
                        }
                        if (i58 != 0) {
                            d0Var12 = null;
                        } else {
                            d0Var12 = d0Var4;
                        }
                        if (i66 != 0) {
                            z26 = true;
                        } else {
                            z26 = z16;
                        }
                        if (i75 != 0) {
                            f19 = 1.0f;
                        } else {
                            f19 = f15;
                        }
                        if (i78 != 0) {
                            long j11111115 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j11111115;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                            f26 = 1.0f;
                            z27 = z25;
                        } else {
                            long j21111111 = jA;
                            pVar6 = pVarD;
                            d0Var13 = d0Var10;
                            j18 = j21111111;
                            d0Var14 = d0Var11;
                            d0Var15 = d0Var12;
                            i87 = iA;
                            z27 = z25;
                            d0Var16 = d0Var9;
                            pVar7 = pVarC;
                            f25 = f19;
                            z28 = z26;
                            w5Var = null;
                            i88 = -45887867;
                            f26 = f16;
                            v2Var4 = v2Var2;
                            c4Var3 = c4VarA;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                    }
                    objE2 = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new d0();
                        rVarH.v(objE2);
                    }
                    final d0 d0Var11111111111 = (d0) objE2;
                    objE3 = rVarH.E();
                    if (objE3 == companion.a()) {
                        objE3 = new d0();
                        rVarH.v(objE3);
                    }
                    final d0 d0Var11111111112 = (d0) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = new d0();
                        rVarH.v(objE4);
                    }
                    final d0 d0Var11111111113 = (d0) objE4;
                    objE5 = rVarH.E();
                    if (objE5 == companion.a()) {
                        objE5 = new d0();
                        rVarH.v(objE5);
                    }
                    final d0 d0Var2111116 = (d0) objE5;
                    i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                    if (i89 != 1) {
                        rVarH.X(-1148515264);
                        urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else if (i89 != 2) {
                        rVarH.X(-1148511225);
                        urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                        rVarH.R();
                    } else {
                        if (i89 == 3) {
                            rVarH.X(-1148518986);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(-1148507365);
                        urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                        rVarH.R();
                    }
                    final ur urVar119 = urVarD;
                    objE6 = rVarH.E();
                    if (objE6 == companion.a()) {
                        objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                        rVarH.v(objE6);
                    }
                    final a3 a3Var119 = (a3) objE6;
                    final b bVar119 = new b(a3Var119);
                    final d0 d0Var2111117 = d0Var13;
                    p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.u(baseScaffoldData, urVar119, bVar119, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var11111111111, z28, d0Var15, d0Var11111111112, d0Var11111111113, d0Var2111116, d0Var16, d0Var2111117, d0Var14, pVar7, f25, a3Var119, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    v2Var3 = v2Var4;
                    pVar4 = pVar6;
                    i86 = i87;
                    j17 = j18;
                    c4Var2 = c4Var3;
                    z18 = z27;
                    f17 = f26;
                    z19 = z28;
                    d0Var5 = d0Var15;
                    d0Var6 = d0Var16;
                    d0Var7 = d0Var2111117;
                    d0Var8 = d0Var14;
                    pVar5 = pVar7;
                    f18 = f25;
                } else {
                    rVarH.O();
                    z18 = z15;
                    d0Var5 = d0Var4;
                    f17 = f16;
                    pVar4 = pVar3;
                    v2Var3 = v2Var2;
                    i86 = i27;
                    c4Var2 = c4VarA;
                    pVar5 = pVarC;
                    j17 = j16;
                    d0Var6 = d0Var;
                    d0Var7 = d0Var2;
                    d0Var8 = d0Var3;
                    z19 = z16;
                    f18 = f15;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: i50.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i79 = i77 | 24576;
            if ((i17 & 196608) == 0) {
                if (!rVarH.G(qVar)) {
                    i36 = PKIFailureInfo.notAuthorized;
                }
                i79 |= i36;
            }
            i85 = i79;
            if ((i19 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i19 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i98 != 0) {
                        pVarC = v.f89493a.c();
                    }
                    if (i25 != 0) {
                        pVarD = v.f89493a.d();
                    } else {
                        pVarD = pVar3;
                    }
                    if ((i18 & 8) != 0) {
                        iA = cc.INSTANCE.a();
                        i19 &= -7169;
                    } else {
                        iA = i27;
                    }
                    if ((i18 & 16) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i19 &= -57345;
                    } else {
                        jA = j16;
                    }
                    if ((i18 & 32) != 0) {
                        i19 &= -458753;
                        c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                    }
                    if (i37 != 0) {
                        v2Var2 = null;
                    }
                    if (i39 != 0) {
                        z25 = false;
                    } else {
                        z25 = z15;
                    }
                    if (i46 != 0) {
                        d0Var9 = null;
                    } else {
                        d0Var9 = d0Var;
                    }
                    if (i48 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var2;
                    }
                    if (i55 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        d0Var11 = (d0) objE;
                    } else {
                        d0Var11 = d0Var3;
                    }
                    if (i58 != 0) {
                        d0Var12 = null;
                    } else {
                        d0Var12 = d0Var4;
                    }
                    if (i66 != 0) {
                        z26 = true;
                    } else {
                        z26 = z16;
                    }
                    if (i75 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f15;
                    }
                    if (i78 != 0) {
                        long j11111116 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j11111116;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                        f26 = 1.0f;
                        z27 = z25;
                    } else {
                        long j21111112 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j21111112;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        z27 = z25;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        f26 = f16;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                    }
                } else {
                    if (i98 != 0) {
                        pVarC = v.f89493a.c();
                    }
                    if (i25 != 0) {
                        pVarD = v.f89493a.d();
                    } else {
                        pVarD = pVar3;
                    }
                    if ((i18 & 8) != 0) {
                        iA = cc.INSTANCE.a();
                        i19 &= -7169;
                    } else {
                        iA = i27;
                    }
                    if ((i18 & 16) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i19 &= -57345;
                    } else {
                        jA = j16;
                    }
                    if ((i18 & 32) != 0) {
                        i19 &= -458753;
                        c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                    }
                    if (i37 != 0) {
                        v2Var2 = null;
                    }
                    if (i39 != 0) {
                        z25 = false;
                    } else {
                        z25 = z15;
                    }
                    if (i46 != 0) {
                        d0Var9 = null;
                    } else {
                        d0Var9 = d0Var;
                    }
                    if (i48 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var2;
                    }
                    if (i55 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        d0Var11 = (d0) objE;
                    } else {
                        d0Var11 = d0Var3;
                    }
                    if (i58 != 0) {
                        d0Var12 = null;
                    } else {
                        d0Var12 = d0Var4;
                    }
                    if (i66 != 0) {
                        z26 = true;
                    } else {
                        z26 = z16;
                    }
                    if (i75 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f15;
                    }
                    if (i78 != 0) {
                        long j11111117 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j11111117;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                        f26 = 1.0f;
                        z27 = z25;
                    } else {
                        long j21111113 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j21111113;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        z27 = z25;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        f26 = f16;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                }
                objE2 = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = new d0();
                    rVarH.v(objE2);
                }
                final d0 d0Var11111111114 = (d0) objE2;
                objE3 = rVarH.E();
                if (objE3 == companion.a()) {
                    objE3 = new d0();
                    rVarH.v(objE3);
                }
                final d0 d0Var11111111115 = (d0) objE3;
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = new d0();
                    rVarH.v(objE4);
                }
                final d0 d0Var11111111116 = (d0) objE4;
                objE5 = rVarH.E();
                if (objE5 == companion.a()) {
                    objE5 = new d0();
                    rVarH.v(objE5);
                }
                final d0 d0Var2111118 = (d0) objE5;
                i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                if (i89 != 1) {
                    rVarH.X(-1148515264);
                    urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                    rVarH.R();
                } else if (i89 != 2) {
                    rVarH.X(-1148511225);
                    urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                    rVarH.R();
                } else {
                    if (i89 == 3) {
                        rVarH.X(-1148518986);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(-1148507365);
                    urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                    rVarH.R();
                }
                final ur urVar1110 = urVarD;
                objE6 = rVarH.E();
                if (objE6 == companion.a()) {
                    objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                    rVarH.v(objE6);
                }
                final a3 a3Var1110 = (a3) objE6;
                final b bVar1110 = new b(a3Var1110);
                final d0 d0Var2111119 = d0Var13;
                p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.u(baseScaffoldData, urVar1110, bVar1110, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var11111111114, z28, d0Var15, d0Var11111111115, d0Var11111111116, d0Var2111118, d0Var16, d0Var2111119, d0Var14, pVar7, f25, a3Var1110, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                v2Var3 = v2Var4;
                pVar4 = pVar6;
                i86 = i87;
                j17 = j18;
                c4Var2 = c4Var3;
                z18 = z27;
                f17 = f26;
                z19 = z28;
                d0Var5 = d0Var15;
                d0Var6 = d0Var16;
                d0Var7 = d0Var2111119;
                d0Var8 = d0Var14;
                pVar5 = pVar7;
                f18 = f25;
            } else {
                rVarH.O();
                z18 = z15;
                d0Var5 = d0Var4;
                f17 = f16;
                pVar4 = pVar3;
                v2Var3 = v2Var2;
                i86 = i27;
                c4Var2 = c4VarA;
                pVar5 = pVarC;
                j17 = j16;
                d0Var6 = d0Var;
                d0Var7 = d0Var2;
                d0Var8 = d0Var3;
                z19 = z16;
                f18 = f15;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: i50.j
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 805306368;
        i55 = i18 & 1024;
        if (i55 != 0) {
            i56 = i17 | 6;
        } else if ((i17 & 6) == 0) {
            if (rVarH.W(d0Var3)) {
                i57 = 4;
            } else {
                i57 = 2;
            }
            i56 = i17 | i57;
        } else {
            i56 = i17;
        }
        i58 = i18 & 2048;
        if (i58 != 0) {
            i56 |= 48;
        } else if ((i17 & 48) != 0) {
            if (rVarH.W(d0Var4)) {
                i59 = 32;
            } else {
                i59 = 16;
            }
            i56 |= i59;
        }
        i65 = i56;
        i66 = i18 & PKIFailureInfo.certConfirmed;
        if (i66 != 0) {
            i68 = i65 | MLKEMEngine.KyberPolyBytes;
        } else {
            i67 = i65;
            if ((i17 & MLKEMEngine.KyberPolyBytes) != 0) {
                if (rVarH.a(z16)) {
                    i69 = 256;
                } else {
                    i69 = 128;
                }
                i67 |= i69;
            }
            i68 = i67;
        }
        i75 = i18 & PKIFailureInfo.certRevoked;
        if (i75 != 0) {
            i77 = i68 | 3072;
        } else {
            i76 = i68;
            if ((i17 & 3072) == 0) {
                i77 = i76 | (rVarH.b(f15) ? 2048 : 1024);
            } else {
                i77 = i76;
            }
        }
        i78 = i18 & 16384;
        if (i78 != 0) {
            i79 = i77;
            if ((i17 & 24576) == 0) {
                if (rVarH.b(f16)) {
                    i29 = 16384;
                }
                i79 |= i29;
            }
            if ((i17 & 196608) == 0) {
                if (!rVarH.G(qVar)) {
                    i36 = PKIFailureInfo.notAuthorized;
                }
                i79 |= i36;
            }
            i85 = i79;
            if ((i19 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i19 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i98 != 0) {
                        pVarC = v.f89493a.c();
                    }
                    if (i25 != 0) {
                        pVarD = v.f89493a.d();
                    } else {
                        pVarD = pVar3;
                    }
                    if ((i18 & 8) != 0) {
                        iA = cc.INSTANCE.a();
                        i19 &= -7169;
                    } else {
                        iA = i27;
                    }
                    if ((i18 & 16) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i19 &= -57345;
                    } else {
                        jA = j16;
                    }
                    if ((i18 & 32) != 0) {
                        i19 &= -458753;
                        c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                    }
                    if (i37 != 0) {
                        v2Var2 = null;
                    }
                    if (i39 != 0) {
                        z25 = false;
                    } else {
                        z25 = z15;
                    }
                    if (i46 != 0) {
                        d0Var9 = null;
                    } else {
                        d0Var9 = d0Var;
                    }
                    if (i48 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var2;
                    }
                    if (i55 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        d0Var11 = (d0) objE;
                    } else {
                        d0Var11 = d0Var3;
                    }
                    if (i58 != 0) {
                        d0Var12 = null;
                    } else {
                        d0Var12 = d0Var4;
                    }
                    if (i66 != 0) {
                        z26 = true;
                    } else {
                        z26 = z16;
                    }
                    if (i75 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f15;
                    }
                    if (i78 != 0) {
                        long j11111118 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j11111118;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                        f26 = 1.0f;
                        z27 = z25;
                    } else {
                        long j21111114 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j21111114;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        z27 = z25;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        f26 = f16;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                    }
                } else {
                    if (i98 != 0) {
                        pVarC = v.f89493a.c();
                    }
                    if (i25 != 0) {
                        pVarD = v.f89493a.d();
                    } else {
                        pVarD = pVar3;
                    }
                    if ((i18 & 8) != 0) {
                        iA = cc.INSTANCE.a();
                        i19 &= -7169;
                    } else {
                        iA = i27;
                    }
                    if ((i18 & 16) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i19 &= -57345;
                    } else {
                        jA = j16;
                    }
                    if ((i18 & 32) != 0) {
                        i19 &= -458753;
                        c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                    }
                    if (i37 != 0) {
                        v2Var2 = null;
                    }
                    if (i39 != 0) {
                        z25 = false;
                    } else {
                        z25 = z15;
                    }
                    if (i46 != 0) {
                        d0Var9 = null;
                    } else {
                        d0Var9 = d0Var;
                    }
                    if (i48 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var2;
                    }
                    if (i55 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        d0Var11 = (d0) objE;
                    } else {
                        d0Var11 = d0Var3;
                    }
                    if (i58 != 0) {
                        d0Var12 = null;
                    } else {
                        d0Var12 = d0Var4;
                    }
                    if (i66 != 0) {
                        z26 = true;
                    } else {
                        z26 = z16;
                    }
                    if (i75 != 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = f15;
                    }
                    if (i78 != 0) {
                        long j11111119 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j11111119;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                        f26 = 1.0f;
                        z27 = z25;
                    } else {
                        long j21111115 = jA;
                        pVar6 = pVarD;
                        d0Var13 = d0Var10;
                        j18 = j21111115;
                        d0Var14 = d0Var11;
                        d0Var15 = d0Var12;
                        i87 = iA;
                        z27 = z25;
                        d0Var16 = d0Var9;
                        pVar7 = pVarC;
                        f25 = f19;
                        z28 = z26;
                        w5Var = null;
                        i88 = -45887867;
                        f26 = f16;
                        v2Var4 = v2Var2;
                        c4Var3 = c4VarA;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
                }
                objE2 = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = new d0();
                    rVarH.v(objE2);
                }
                final d0 d0Var11111111117 = (d0) objE2;
                objE3 = rVarH.E();
                if (objE3 == companion.a()) {
                    objE3 = new d0();
                    rVarH.v(objE3);
                }
                final d0 d0Var11111111118 = (d0) objE3;
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = new d0();
                    rVarH.v(objE4);
                }
                final d0 d0Var11111111119 = (d0) objE4;
                objE5 = rVarH.E();
                if (objE5 == companion.a()) {
                    objE5 = new d0();
                    rVarH.v(objE5);
                }
                final d0 d0Var21111110 = (d0) objE5;
                i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
                if (i89 != 1) {
                    rVarH.X(-1148515264);
                    urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                    rVarH.R();
                } else if (i89 != 2) {
                    rVarH.X(-1148511225);
                    urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                    rVarH.R();
                } else {
                    if (i89 == 3) {
                        rVarH.X(-1148518986);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(-1148507365);
                    urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                    rVarH.R();
                }
                final ur urVar1111 = urVarD;
                objE6 = rVarH.E();
                if (objE6 == companion.a()) {
                    objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                    rVarH.v(objE6);
                }
                final a3 a3Var1111 = (a3) objE6;
                final b bVar1111 = new b(a3Var1111);
                final d0 d0Var21111111 = d0Var13;
                p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.u(baseScaffoldData, urVar1111, bVar1111, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var11111111117, z28, d0Var15, d0Var11111111118, d0Var11111111119, d0Var21111110, d0Var16, d0Var21111111, d0Var14, pVar7, f25, a3Var1111, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                v2Var3 = v2Var4;
                pVar4 = pVar6;
                i86 = i87;
                j17 = j18;
                c4Var2 = c4Var3;
                z18 = z27;
                f17 = f26;
                z19 = z28;
                d0Var5 = d0Var15;
                d0Var6 = d0Var16;
                d0Var7 = d0Var21111111;
                d0Var8 = d0Var14;
                pVar5 = pVar7;
                f18 = f25;
            } else {
                rVarH.O();
                z18 = z15;
                d0Var5 = d0Var4;
                f17 = f16;
                pVar4 = pVar3;
                v2Var3 = v2Var2;
                i86 = i27;
                c4Var2 = c4VarA;
                pVar5 = pVarC;
                j17 = j16;
                d0Var6 = d0Var;
                d0Var7 = d0Var2;
                d0Var8 = d0Var3;
                z19 = z16;
                f18 = f15;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: i50.j
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i79 = i77 | 24576;
        if ((i17 & 196608) == 0) {
            if (!rVarH.G(qVar)) {
                i36 = PKIFailureInfo.notAuthorized;
            }
            i79 |= i36;
        }
        i85 = i79;
        if ((i19 & 306783379) == 306783378) {
            z17 = true;
        } else {
            z17 = true;
        }
        if (rVarH.r(z17, i19 & 1)) {
            rVarH.I();
            if ((i16 & 1) != 0) {
                if (i98 != 0) {
                    pVarC = v.f89493a.c();
                }
                if (i25 != 0) {
                    pVarD = v.f89493a.d();
                } else {
                    pVarD = pVar3;
                }
                if ((i18 & 8) != 0) {
                    iA = cc.INSTANCE.a();
                    i19 &= -7169;
                } else {
                    iA = i27;
                }
                if ((i18 & 16) != 0) {
                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                    i19 &= -57345;
                } else {
                    jA = j16;
                }
                if ((i18 & 32) != 0) {
                    i19 &= -458753;
                    c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                }
                if (i37 != 0) {
                    v2Var2 = null;
                }
                if (i39 != 0) {
                    z25 = false;
                } else {
                    z25 = z15;
                }
                if (i46 != 0) {
                    d0Var9 = null;
                } else {
                    d0Var9 = d0Var;
                }
                if (i48 != 0) {
                    d0Var10 = null;
                } else {
                    d0Var10 = d0Var2;
                }
                if (i55 != 0) {
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new d0();
                        rVarH.v(objE);
                    }
                    d0Var11 = (d0) objE;
                } else {
                    d0Var11 = d0Var3;
                }
                if (i58 != 0) {
                    d0Var12 = null;
                } else {
                    d0Var12 = d0Var4;
                }
                if (i66 != 0) {
                    z26 = true;
                } else {
                    z26 = z16;
                }
                if (i75 != 0) {
                    f19 = 1.0f;
                } else {
                    f19 = f15;
                }
                if (i78 != 0) {
                    long j111111110 = jA;
                    pVar6 = pVarD;
                    d0Var13 = d0Var10;
                    j18 = j111111110;
                    d0Var14 = d0Var11;
                    d0Var15 = d0Var12;
                    i87 = iA;
                    d0Var16 = d0Var9;
                    pVar7 = pVarC;
                    f25 = f19;
                    z28 = z26;
                    w5Var = null;
                    i88 = -45887867;
                    v2Var4 = v2Var2;
                    c4Var3 = c4VarA;
                    f26 = 1.0f;
                    z27 = z25;
                } else {
                    long j21111116 = jA;
                    pVar6 = pVarD;
                    d0Var13 = d0Var10;
                    j18 = j21111116;
                    d0Var14 = d0Var11;
                    d0Var15 = d0Var12;
                    i87 = iA;
                    z27 = z25;
                    d0Var16 = d0Var9;
                    pVar7 = pVarC;
                    f25 = f19;
                    z28 = z26;
                    w5Var = null;
                    i88 = -45887867;
                    f26 = f16;
                    v2Var4 = v2Var2;
                    c4Var3 = c4VarA;
                }
            } else {
                if (i98 != 0) {
                    pVarC = v.f89493a.c();
                }
                if (i25 != 0) {
                    pVarD = v.f89493a.d();
                } else {
                    pVarD = pVar3;
                }
                if ((i18 & 8) != 0) {
                    iA = cc.INSTANCE.a();
                    i19 &= -7169;
                } else {
                    iA = i27;
                }
                if ((i18 & 16) != 0) {
                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                    i19 &= -57345;
                } else {
                    jA = j16;
                }
                if ((i18 & 32) != 0) {
                    i19 &= -458753;
                    c4VarA = rh.f57581a.a(rVarH, rh.f57582b);
                }
                if (i37 != 0) {
                    v2Var2 = null;
                }
                if (i39 != 0) {
                    z25 = false;
                } else {
                    z25 = z15;
                }
                if (i46 != 0) {
                    d0Var9 = null;
                } else {
                    d0Var9 = d0Var;
                }
                if (i48 != 0) {
                    d0Var10 = null;
                } else {
                    d0Var10 = d0Var2;
                }
                if (i55 != 0) {
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new d0();
                        rVarH.v(objE);
                    }
                    d0Var11 = (d0) objE;
                } else {
                    d0Var11 = d0Var3;
                }
                if (i58 != 0) {
                    d0Var12 = null;
                } else {
                    d0Var12 = d0Var4;
                }
                if (i66 != 0) {
                    z26 = true;
                } else {
                    z26 = z16;
                }
                if (i75 != 0) {
                    f19 = 1.0f;
                } else {
                    f19 = f15;
                }
                if (i78 != 0) {
                    long j111111111 = jA;
                    pVar6 = pVarD;
                    d0Var13 = d0Var10;
                    j18 = j111111111;
                    d0Var14 = d0Var11;
                    d0Var15 = d0Var12;
                    i87 = iA;
                    d0Var16 = d0Var9;
                    pVar7 = pVarC;
                    f25 = f19;
                    z28 = z26;
                    w5Var = null;
                    i88 = -45887867;
                    v2Var4 = v2Var2;
                    c4Var3 = c4VarA;
                    f26 = 1.0f;
                    z27 = z25;
                } else {
                    long j21111117 = jA;
                    pVar6 = pVarD;
                    d0Var13 = d0Var10;
                    j18 = j21111117;
                    d0Var14 = d0Var11;
                    d0Var15 = d0Var12;
                    i87 = iA;
                    z27 = z25;
                    d0Var16 = d0Var9;
                    pVar7 = pVarC;
                    f25 = f19;
                    z28 = z26;
                    w5Var = null;
                    i88 = -45887867;
                    f26 = f16;
                    v2Var4 = v2Var2;
                    c4Var3 = c4VarA;
                }
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(i88, i19, i85, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold (BaseScaffold.kt:94)");
            }
            objE2 = rVarH.E();
            companion = p076m2.r.INSTANCE;
            if (objE2 == companion.a()) {
                objE2 = new d0();
                rVarH.v(objE2);
            }
            final d0 d0Var111111111110 = (d0) objE2;
            objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                objE3 = new d0();
                rVarH.v(objE3);
            }
            final d0 d0Var111111111111 = (d0) objE3;
            objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = new d0();
                rVarH.v(objE4);
            }
            final d0 d0Var111111111112 = (d0) objE4;
            objE5 = rVarH.E();
            if (objE5 == companion.a()) {
                objE5 = new d0();
                rVarH.v(objE5);
            }
            final d0 d0Var21111112 = (d0) objE5;
            i89 = c.f89491a[baseScaffoldData.getTopAppBarScrollBehavior().ordinal()];
            if (i89 != 1) {
                rVarH.X(-1148515264);
                urVarD = rr.f57664a.d(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                rVarH.R();
            } else if (i89 != 2) {
                rVarH.X(-1148511225);
                urVarD = rr.f57664a.f(null, null, null, null, rVarH, rr.f57675l << 12, 15);
                rVarH.R();
            } else {
                if (i89 == 3) {
                    rVarH.X(-1148518986);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1148507365);
                urVarD = rr.f57664a.p(null, null, rVarH, rr.f57675l << 6, 3);
                rVarH.R();
            }
            final ur urVar1112 = urVarD;
            objE6 = rVarH.E();
            if (objE6 == companion.a()) {
                objE6 = c6.e(Boolean.TRUE, w5Var, 2, w5Var);
                rVarH.v(objE6);
            }
            final a3 a3Var1112 = (a3) objE6;
            final b bVar1112 = new b(a3Var1112);
            final d0 d0Var21111113 = d0Var13;
            p076m2.d0.c(d60.i.c().d(d60.i.d(baseScaffoldData.c(), rVarH, 0)), y2.m.d(-2012556475, true, new er.p() { // from class: i50.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.u(baseScaffoldData, urVar1112, bVar1112, v2Var4, pVar6, i87, j18, c4Var3, z27, f26, d0Var111111111110, z28, d0Var15, d0Var111111111111, d0Var111111111112, d0Var21111112, d0Var16, d0Var21111113, d0Var14, pVar7, f25, a3Var1112, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            v2Var3 = v2Var4;
            pVar4 = pVar6;
            i86 = i87;
            j17 = j18;
            c4Var2 = c4Var3;
            z18 = z27;
            f17 = f26;
            z19 = z28;
            d0Var5 = d0Var15;
            d0Var6 = d0Var16;
            d0Var7 = d0Var21111113;
            d0Var8 = d0Var14;
            pVar5 = pVar7;
            f18 = f25;
        } else {
            rVarH.O();
            z18 = z15;
            d0Var5 = d0Var4;
            f17 = f16;
            pVar4 = pVar3;
            v2Var3 = v2Var2;
            i86 = i27;
            c4Var2 = c4VarA;
            pVar5 = pVarC;
            j17 = j16;
            d0Var6 = d0Var;
            d0Var7 = d0Var2;
            d0Var8 = d0Var3;
            z19 = z16;
            f18 = f15;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i50.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.K(baseScaffoldData, pVar5, pVar4, i86, j17, c4Var2, v2Var3, z18, d0Var6, d0Var7, d0Var8, d0Var5, z19, f18, f17, qVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean s(a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(final BaseScaffoldData baseScaffoldData, final ur urVar, b bVar, v2 v2Var, er.p pVar, int i15, long j15, c4 c4Var, boolean z15, final float f15, final d0 d0Var, final boolean z16, final d0 d0Var2, final d0 d0Var3, final d0 d0Var4, final d0 d0Var5, final d0 d0Var6, final d0 d0Var7, final d0 d0Var8, final er.p pVar2, final float f16, final a3 a3Var, final er.q qVar, p076m2.r rVar, int i16) {
        p076m2.r rVar2;
        if (rVar.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2012556475, i16, -1, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold.<anonymous> (BaseScaffold.kt:128)");
            }
            f3.m mVar = f3.m.INSTANCE;
            boolean zG = rVar.G(baseScaffoldData);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: i50.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.v(baseScaffoldData, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarC = null;
            f3.m mVarB = z3.d.b(z3.d.b(n4.v.d(mVar, false, (er.l) objE, 1, null), urVar.getNestedScrollConnection(), null, 2, null), bVar, null, 2, null);
            boolean zG2 = rVar.G(baseScaffoldData);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new a(baseScaffoldData);
                rVar.v(objE2);
            }
            f3.m mVarA = y3.f.a(mVarB, (er.l) objE2);
            if (v2Var == null) {
                rVar.X(1673924184);
                rVar.R();
                rVar2 = rVar;
            } else {
                rVar.X(1673924185);
                mVarC = t70.i.C(mVar, v2Var, z15, rVar, 6, 0);
                rVar2 = rVar;
                rVar2.R();
            }
            if (mVarC != null) {
                mVar = mVarC;
            }
            di.l(mVarA.u(mVar), y2.m.d(-1953383927, true, new er.p() { // from class: i50.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.w(f15, d0Var, z16, d0Var2, d0Var3, d0Var4, d0Var5, baseScaffoldData, urVar, d0Var6, d0Var7, d0Var8, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar2, 54), y2.m.d(-1731472246, true, new er.p() { // from class: i50.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.A(d0Var5, z16, d0Var2, d0Var8, d0Var, d0Var3, d0Var4, pVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar2, 54), pVar, y2.m.d(-1287648884, true, new er.p() { // from class: i50.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.D(f16, d0Var4, z16, d0Var2, d0Var8, d0Var5, d0Var, d0Var3, baseScaffoldData, a3Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar2, 54), i15, j15, j15, c4Var, y2.m.d(1671840340, true, new er.q() { // from class: i50.o
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.H(d0Var3, z16, d0Var8, d0Var4, d0Var5, d0Var, qVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar2, 54), rVar2, 805331376, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(BaseScaffoldData baseScaffoldData, n4.i0 i0Var) {
        String text;
        Label title;
        Label paneTitle = baseScaffoldData.getPaneTitle();
        if (paneTitle == null || (text = paneTitle.getText()) == null) {
            x50.i topMenuData = baseScaffoldData.getTopMenuData();
            text = (topMenuData == null || (title = topMenuData.getTitle()) == null) ? "" : title.getText();
        }
        f0.n0(i0Var, text);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(final float f15, d0 d0Var, final boolean z15, final d0 d0Var2, final d0 d0Var3, final d0 d0Var4, final d0 d0Var5, BaseScaffoldData baseScaffoldData, ur urVar, d0 d0Var6, d0 d0Var7, d0 d0Var8, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1953383927, i15, -1, "pl.gov.coi.common.ui.ds.scaffold.BaseScaffold.<anonymous>.<anonymous> (BaseScaffold.kt:150)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            boolean zB = rVar.b(f15);
            Object objE = rVar.E();
            if (zB || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: i50.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.x(f15, (a2) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarA = g0.a(z1.c(companion, (er.l) objE), d0Var);
            boolean zA = rVar.a(z15) | rVar.W(d0Var2);
            Object objE2 = rVar.E();
            if (zA || objE2 == p076m2.r.INSTANCE.a()) {
                er.l lVar = new er.l() { // from class: i50.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.y(z15, d0Var3, d0Var4, d0Var5, d0Var2, (l3.v) obj);
                    }
                };
                rVar.v(lVar);
                objE2 = lVar;
            }
            f3.m mVarA2 = q0.a(l3.y.a(mVarA, (er.l) objE2));
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarA2);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            x50.i topMenuData = baseScaffoldData.getTopMenuData();
            if (topMenuData == null) {
                rVar.X(-43088693);
                rVar.R();
            } else {
                rVar.X(-43088692);
                x50.k.b(topMenuData, urVar, d0Var6, d0Var7, d0Var8, rVar, 0, 0);
                rVar.R();
            }
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
    public static final i0 x(float f15, a2 a2Var) {
        a2Var.g(f15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(final boolean z15, final d0 d0Var, final d0 d0Var2, final d0 d0Var3, final d0 d0Var4, l3.v vVar) {
        vVar.s(new er.l() { // from class: i50.g
            @Override // er.l
            public final Object b(Object obj) {
                return s.z(z15, d0Var, d0Var2, d0Var3, d0Var4, (l3.h) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(boolean z15, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, l3.h hVar) {
        if (z15) {
            px.f.f163100a.b("Focus exited TopBar: " + ((Object) l3.g.n(hVar.getRequestedFocusDirection())), pq.v.e(z.f188762a.b()));
            int i15 = c.f89492b[O(hVar.getRequestedFocusDirection()).ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new oq.p();
                    }
                } else if (!d0.f(d0Var3, 0, 1, null) && !d0.f(d0Var2, 0, 1, null) && !L(d0Var4)) {
                    d0.f(d0Var, 0, 1, null);
                }
            } else if (!d0.f(d0Var, 0, 1, null) && !d0.f(d0Var2, 0, 1, null)) {
                d0.f(d0Var3, 0, 1, null);
            }
        }
        return i0.f148189a;
    }
}
