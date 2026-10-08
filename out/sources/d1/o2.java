package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lf3/m;", "Lc5/h;", "x", "y", "e", "(Lf3/m;FF)Lf3/m;", "Lkotlin/Function1;", "Lc5/d;", "Lc5/n;", "offset", "c", "(Lf3/m;Ler/l;)Lf3/m;", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o2 {
    public static final f3.m c(f3.m mVar, final er.l<? super c5.d, c5.n> lVar) {
        return mVar.u(new OffsetPxModifier(lVar, true, new er.l() { // from class: d1.m2
            @Override // er.l
            public final Object b(Object obj) {
                return o2.d(lVar, (androidx.compose.ui.platform.v1) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(er.l lVar, androidx.compose.ui.platform.v1 v1Var) {
        v1Var.b("offset");
        v1Var.getProperties().b("offset", lVar);
        return oq.i0.f148189a;
    }

    public static final f3.m e(f3.m mVar, final float f15, final float f16) {
        return mVar.u(new OffsetModifierElement(f15, f16, true, new er.l() { // from class: d1.n2
            @Override // er.l
            public final Object b(Object obj) {
                return o2.g(f15, f16, (androidx.compose.ui.platform.v1) obj);
            }
        }, null));
    }

    public static /* synthetic */ f3.m f(f3.m mVar, float f15, float f16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = c5.h.n(0);
        }
        if ((i15 & 2) != 0) {
            f16 = c5.h.n(0);
        }
        return e(mVar, f15, f16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(float f15, float f16, androidx.compose.ui.platform.v1 v1Var) {
        v1Var.b("offset");
        v1Var.getProperties().b("x", c5.h.j(f15));
        v1Var.getProperties().b("y", c5.h.j(f16));
        return oq.i0.f148189a;
    }
}
