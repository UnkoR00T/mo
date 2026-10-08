package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf3/m;", "", "ratio", "", "matchHeightConstraintsFirst", "a", "(Lf3/m;FZ)Lf3/m;", "Lc5/b;", "", "width", "height", "c", "(JII)Z", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class a extends fr.w implements er.l<androidx.compose.ui.platform.v1, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f39195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f39196c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f15, boolean z15) {
            super(1);
            this.f39195b = f15;
            this.f39196c = z15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(androidx.compose.ui.platform.v1 v1Var) {
            c(v1Var);
            return oq.i0.f148189a;
        }

        public final void c(androidx.compose.ui.platform.v1 v1Var) {
            v1Var.b("aspectRatio");
            v1Var.getProperties().b("ratio", Float.valueOf(this.f39195b));
            v1Var.getProperties().b("matchHeightConstraintsFirst", Boolean.valueOf(this.f39196c));
        }
    }

    public static final f3.m a(f3.m mVar, float f15, boolean z15) {
        return mVar.u(new j(f15, z15, androidx.compose.ui.platform.t1.b() ? new a(f15, z15) : androidx.compose.ui.platform.t1.a()));
    }

    public static /* synthetic */ f3.m b(f3.m mVar, float f15, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return a(mVar, f15, z15);
    }

    public static final boolean c(long j15, int i15, int i16) {
        int iN = c5.b.n(j15);
        if (i15 > c5.b.l(j15) || iN > i15) {
            return false;
        }
        return i16 <= c5.b.k(j15) && c5.b.m(j15) <= i16;
    }
}
