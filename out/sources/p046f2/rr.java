package p046f2;

import androidx.compose.ui.graphics.Color;
import c5.h;
import d1.a3;
import d1.c4;
import d1.d3;
import d1.f4;
import d1.u4;
import h2.c2;
import l2.a;
import l2.b;
import l2.c;
import l2.d;
import l2.e;
import l2.f;
import l2.k0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import p114t0.d1;
import u0.c0;
import u0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JK\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017JM\u0010\u001d\u001a\u00020\u00152\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJM\u0010\u001f\u001a\u00020\u00152\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\u001f\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010-\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b,\u0010*R\u0017\u00100\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010*R\u0017\u00102\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b1\u0010*R\u0017\u00105\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*R\u0017\u00107\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b6\u0010*R\u0017\u0010:\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b9\u0010*R\u0017\u0010<\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b;\u0010*R\u0017\u0010>\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b9\u0010(\u001a\u0004\b=\u0010*R\u0018\u0010A\u001a\u00020\u0004*\u00020?8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010@R\u0011\u0010E\u001a\u00020B8G¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lf2/rr;", "", "<init>", "()V", "Lf2/nr;", "r", "(Lm2/r;I)Lf2/nr;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "subtitleContentColor", "s", "(JJJJJJLm2/r;II)Lf2/nr;", "Lf2/yr;", "state", "Lkotlin/Function0;", "", "canScroll", "Lf2/ur;", "p", "(Lf2/yr;Ler/a;Lm2/r;II)Lf2/ur;", "Lu0/l;", "", "snapAnimationSpec", "Lu0/c0;", "flingAnimationSpec", "d", "(Lf2/yr;Ler/a;Lu0/l;Lu0/c0;Lm2/r;II)Lf2/ur;", "f", "Ld1/d3;", "b", "Ld1/d3;", "h", "()Ld1/d3;", "ContentPadding", "Lc5/h;", "c", "F", "n", "()F", "TopAppBarExpandedHeight", "l", "MediumAppBarCollapsedHeight", "e", "m", "MediumAppBarExpandedHeight", "getMediumFlexibleAppBarWithoutSubtitleExpandedHeight-D9Ej5fM", "MediumFlexibleAppBarWithoutSubtitleExpandedHeight", "g", "getMediumFlexibleAppBarWithSubtitleExpandedHeight-D9Ej5fM", "MediumFlexibleAppBarWithSubtitleExpandedHeight", "j", "LargeAppBarCollapsedHeight", "i", "k", "LargeAppBarExpandedHeight", "getLargeFlexibleAppBarWithoutSubtitleExpandedHeight-D9Ej5fM", "LargeFlexibleAppBarWithoutSubtitleExpandedHeight", "getLargeFlexibleAppBarWithSubtitleExpandedHeight-D9Ej5fM", "LargeFlexibleAppBarWithSubtitleExpandedHeight", "Lf2/e2;", "(Lf2/e2;)Lf2/nr;", "defaultTopAppBarColors", "Ld1/c4;", "o", "(Lm2/r;I)Ld1/c4;", "windowInsets", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class rr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rr f57664a = new rr();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final d3 ContentPadding = a3.e(h.n(0));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float TopAppBarExpandedHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float MediumAppBarCollapsedHeight;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float MediumAppBarExpandedHeight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float MediumFlexibleAppBarWithoutSubtitleExpandedHeight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float MediumFlexibleAppBarWithSubtitleExpandedHeight;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float LargeAppBarCollapsedHeight;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float LargeAppBarExpandedHeight;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final float LargeFlexibleAppBarWithoutSubtitleExpandedHeight;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float LargeFlexibleAppBarWithSubtitleExpandedHeight;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f57675l = 0;

    static {
        e eVar = e.f114428a;
        TopAppBarExpandedHeight = eVar.a();
        MediumAppBarCollapsedHeight = eVar.a();
        MediumAppBarExpandedHeight = d.f114371a.a();
        c cVar = c.f114337a;
        MediumFlexibleAppBarWithoutSubtitleExpandedHeight = cVar.a();
        MediumFlexibleAppBarWithSubtitleExpandedHeight = cVar.b();
        LargeAppBarCollapsedHeight = eVar.a();
        LargeAppBarExpandedHeight = b.f114290a.a();
        a aVar = a.f114260a;
        LargeFlexibleAppBarWithoutSubtitleExpandedHeight = aVar.a();
        LargeFlexibleAppBarWithSubtitleExpandedHeight = aVar.b();
    }

    private rr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q() {
        return true;
    }

    public final ur d(yr yrVar, er.a<Boolean> aVar, l<Float> lVar, c0<Float> c0Var, r rVar, int i15, int i16) {
        r rVar2;
        if ((i16 & 1) != 0) {
            rVar2 = rVar;
            yrVar = Function0.P(0.0f, 0.0f, 0.0f, rVar2, 0, 7);
        } else {
            rVar2 = rVar;
        }
        yr yrVar2 = yrVar;
        if ((i16 & 2) != 0) {
            Object objE = rVar2.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: f2.qr
                    @Override // er.a
                    public final Object a() {
                        return Boolean.valueOf(rr.e());
                    }
                };
                rVar2.v(objE);
            }
            aVar = (er.a) objE;
        }
        er.a<Boolean> aVar2 = aVar;
        if ((i16 & 4) != 0) {
            lVar = of.b(k0.DefaultEffects, rVar2, 6);
        }
        c0<Float> c0VarB = (i16 & 8) != 0 ? d1.b(rVar2, 0) : c0Var;
        if (t.k()) {
            t.o(959086674, i15, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:1797)");
        }
        boolean zW = ((((i15 & 14) ^ 6) > 4 && rVar2.W(yrVar2)) || (i15 & 6) == 4) | ((((i15 & 112) ^ 48) > 32 && rVar2.W(aVar2)) || (i15 & 48) == 32) | rVar2.W(lVar) | rVar2.W(c0VarB);
        Object objE2 = rVar2.E();
        if (zW || objE2 == r.INSTANCE.a()) {
            zb zbVar = new zb(yrVar2, lVar, c0VarB, aVar2, null, 16, null);
            rVar2.v(zbVar);
            objE2 = zbVar;
        }
        zb zbVar2 = (zb) objE2;
        if (t.k()) {
            t.n();
        }
        return zbVar2;
    }

    public final ur f(yr yrVar, er.a<Boolean> aVar, l<Float> lVar, c0<Float> c0Var, r rVar, int i15, int i16) {
        r rVar2;
        if ((i16 & 1) != 0) {
            rVar2 = rVar;
            yrVar = Function0.P(0.0f, 0.0f, 0.0f, rVar2, 0, 7);
        } else {
            rVar2 = rVar;
        }
        if ((i16 & 2) != 0) {
            Object objE = rVar2.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: f2.or
                    @Override // er.a
                    public final Object a() {
                        return Boolean.valueOf(rr.g());
                    }
                };
                rVar2.v(objE);
            }
            aVar = (er.a) objE;
        }
        if ((i16 & 4) != 0) {
            lVar = of.b(k0.DefaultEffects, rVar2, 6);
        }
        if ((i16 & 8) != 0) {
            c0Var = d1.b(rVar2, 0);
        }
        if (t.k()) {
            t.o(-1757023234, i15, -1, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:2017)");
        }
        boolean zW = ((((i15 & 14) ^ 6) > 4 && rVar2.W(yrVar)) || (i15 & 6) == 4) | ((((i15 & 112) ^ 48) > 32 && rVar2.W(aVar)) || (i15 & 48) == 32) | rVar2.W(lVar) | rVar2.W(c0Var);
        Object objE2 = rVar2.E();
        if (zW || objE2 == r.INSTANCE.a()) {
            objE2 = new ac(yrVar, lVar, c0Var, aVar);
            rVar2.v(objE2);
        }
        ac acVar = (ac) objE2;
        if (t.k()) {
            t.n();
        }
        return acVar;
    }

    public final d3 h() {
        return ContentPadding;
    }

    public final nr i(ColorScheme colorScheme) {
        nr defaultTopAppBarColorsCached = colorScheme.getDefaultTopAppBarColorsCached();
        if (defaultTopAppBarColorsCached != null) {
            return defaultTopAppBarColorsCached;
        }
        f fVar = f.f114480a;
        nr nrVar = new nr(g2.h(colorScheme, fVar.a()), g2.h(colorScheme, fVar.c()), g2.h(colorScheme, fVar.b()), g2.h(colorScheme, fVar.e()), g2.h(colorScheme, fVar.f()), g2.h(colorScheme, fVar.d()), null);
        colorScheme.x0(nrVar);
        return nrVar;
    }

    public final float j() {
        return LargeAppBarCollapsedHeight;
    }

    public final float k() {
        return LargeAppBarExpandedHeight;
    }

    public final float l() {
        return MediumAppBarCollapsedHeight;
    }

    public final float m() {
        return MediumAppBarExpandedHeight;
    }

    public final float n() {
        return TopAppBarExpandedHeight;
    }

    public final c4 o(r rVar, int i15) {
        if (t.k()) {
            t.o(2143182847, i15, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:1489)");
        }
        c4 c4VarA = c2.a(c4.INSTANCE, rVar, 6);
        u4.Companion companion = u4.INSTANCE;
        c4 c4VarH = f4.h(c4VarA, u4.l(companion.f(), companion.g()));
        if (t.k()) {
            t.n();
        }
        return c4VarH;
    }

    public final ur p(yr yrVar, er.a<Boolean> aVar, r rVar, int i15, int i16) {
        er.a<Boolean> aVar2;
        yr yrVarP = (i16 & 1) != 0 ? Function0.P(0.0f, 0.0f, 0.0f, rVar, 0, 7) : yrVar;
        if ((i16 & 2) != 0) {
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: f2.pr
                    @Override // er.a
                    public final Object a() {
                        return Boolean.valueOf(rr.q());
                    }
                };
                rVar.v(objE);
            }
            aVar2 = (er.a) objE;
        } else {
            aVar2 = aVar;
        }
        if (t.k()) {
            t.o(286497075, i15, -1, "androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior (AppBar.kt:1659)");
        }
        boolean z15 = ((((i15 & 14) ^ 6) > 4 && rVar.W(yrVarP)) || (i15 & 6) == 4) | ((((i15 & 112) ^ 48) > 32 && rVar.W(aVar2)) || (i15 & 48) == 32);
        Object objE2 = rVar.E();
        if (z15 || objE2 == r.INSTANCE.a()) {
            rg rgVar = new rg(yrVarP, aVar2, null, 4, null);
            rVar.v(rgVar);
            objE2 = rgVar;
        }
        rg rgVar2 = (rg) objE2;
        if (t.k()) {
            t.n();
        }
        return rgVar2;
    }

    public final nr r(r rVar, int i15) {
        if (t.k()) {
            t.o(-1388520854, i15, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:1404)");
        }
        nr nrVarI = i(androidx.compose.material3.d.f9816a.a(rVar, 6));
        if (t.k()) {
            t.n();
        }
        return nrVarI;
    }

    public final nr s(long j15, long j16, long j17, long j18, long j19, long j25, r rVar, int i15, int i16) {
        long jH = (i16 & 1) != 0 ? Color.INSTANCE.h() : j15;
        long jH2 = (i16 & 2) != 0 ? Color.INSTANCE.h() : j16;
        long jH3 = (i16 & 4) != 0 ? Color.INSTANCE.h() : j17;
        long jH4 = (i16 & 8) != 0 ? Color.INSTANCE.h() : j18;
        long jH5 = (i16 & 16) != 0 ? Color.INSTANCE.h() : j19;
        long jH6 = (i16 & 32) != 0 ? Color.INSTANCE.h() : j25;
        if (t.k()) {
            t.o(-1325733438, i15, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:1427)");
        }
        nr nrVarB = i(androidx.compose.material3.d.f9816a.a(rVar, 6)).b(jH, jH2, jH3, jH4, jH5, jH6);
        if (t.k()) {
            t.n();
        }
        return nrVarB;
    }
}
