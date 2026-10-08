package d1;

import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a;\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lf3/m;", "Le4/a;", "alignmentLine", "Lc5/h;", "before", "after", "f", "(Lf3/m;Le4/a;FF)Lf3/m;", "top", "bottom", "h", "(Lf3/m;FF)Lf3/m;", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/a;FFLe4/v0;J)Le4/x0;", "", "e", "(Le4/a;)Z", "horizontal", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class a extends fr.w implements er.l<androidx.compose.ui.platform.v1, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p036e4.a f39023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f39024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f39025d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p036e4.a aVar, float f15, float f16) {
            super(1);
            this.f39023b = aVar;
            this.f39024c = f15;
            this.f39025d = f16;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(androidx.compose.ui.platform.v1 v1Var) {
            c(v1Var);
            return oq.i0.f148189a;
        }

        public final void c(androidx.compose.ui.platform.v1 v1Var) {
            v1Var.b("paddingFrom");
            v1Var.getProperties().b("alignmentLine", this.f39023b);
            v1Var.getProperties().b("before", c5.h.j(this.f39024c));
            v1Var.getProperties().b("after", c5.h.j(this.f39025d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p036e4.x0 c(p036e4.y0 y0Var, final p036e4.a aVar, final float f15, float f16, p036e4.v0 v0Var, long j15) {
        final p036e4.a2 a2VarO0 = v0Var.o0(e(aVar) ? c5.b.d(j15, 0, 0, 0, 0, 11, null) : c5.b.d(j15, 0, 0, 0, 0, 14, null));
        int I = a2VarO0.I(aVar);
        if (I == Integer.MIN_VALUE) {
            I = 0;
        }
        int height = e(aVar) ? a2VarO0.getHeight() : a2VarO0.getWidth();
        int iK = (e(aVar) ? c5.b.k(j15) : c5.b.l(j15)) - height;
        final int iN = lr.m.n((!Float.isNaN(f15) ? y0Var.X0(f15) : 0) - I, 0, iK);
        final int iN2 = lr.m.n(((!Float.isNaN(f16) ? y0Var.X0(f16) : 0) - height) + I, 0, iK - iN);
        final int width = e(aVar) ? a2VarO0.getWidth() : Math.max(a2VarO0.getWidth() + iN + iN2, c5.b.n(j15));
        final int iMax = e(aVar) ? Math.max(a2VarO0.getHeight() + iN + iN2, c5.b.m(j15)) : a2VarO0.getHeight();
        return p036e4.y0.j2(y0Var, width, iMax, null, new er.l() { // from class: d1.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.d(aVar, f15, iN, width, iN2, a2VarO0, iMax, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(p036e4.a aVar, float f15, int i15, int i16, int i17, p036e4.a2 a2Var, int i18, e4.a2.a aVar2) {
        int width;
        int i19;
        if (e(aVar)) {
            width = 0;
        } else {
            width = !c5.h.p(f15, c5.h.INSTANCE.c()) ? i15 : (i16 - i17) - a2Var.getWidth();
        }
        if (e(aVar)) {
            if (c5.h.p(f15, c5.h.INSTANCE.c())) {
                i15 = (i18 - i17) - a2Var.getHeight();
            }
            i19 = i15;
        } else {
            i19 = 0;
        }
        e4.a2.a.I(aVar2, a2Var, width, i19, 0.0f, 4, null);
        return oq.i0.f148189a;
    }

    private static final boolean e(p036e4.a aVar) {
        return aVar instanceof p036e4.q;
    }

    public static final f3.m f(f3.m mVar, p036e4.a aVar, float f15, float f16) {
        return mVar.u(new c(aVar, f15, f16, androidx.compose.ui.platform.t1.b() ? new a(aVar, f15, f16) : androidx.compose.ui.platform.t1.a(), null));
    }

    public static /* synthetic */ f3.m g(f3.m mVar, p036e4.a aVar, float f15, float f16, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            f15 = c5.h.INSTANCE.c();
        }
        if ((i15 & 4) != 0) {
            f16 = c5.h.INSTANCE.c();
        }
        return f(mVar, aVar, f15, f16);
    }

    public static final f3.m h(f3.m mVar, float f15, float f16) {
        return mVar.u(!Float.isNaN(f15) ? g(f3.m.INSTANCE, p036e4.b.a(), f15, 0.0f, 4, null) : f3.m.INSTANCE).u(!Float.isNaN(f16) ? g(f3.m.INSTANCE, p036e4.b.b(), 0.0f, f16, 2, null) : f3.m.INSTANCE);
    }
}
