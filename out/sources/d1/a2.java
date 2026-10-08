package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lf3/m;", "Ld1/c2;", "intrinsicSize", "b", "(Lf3/m;Ld1/c2;)Lf3/m;", "a", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a2 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class a extends fr.w implements er.l<androidx.compose.ui.platform.v1, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c2 f39020b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c2 c2Var) {
            super(1);
            this.f39020b = c2Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(androidx.compose.ui.platform.v1 v1Var) {
            c(v1Var);
            return oq.i0.f148189a;
        }

        public final void c(androidx.compose.ui.platform.v1 v1Var) {
            v1Var.b("height");
            v1Var.getProperties().b("intrinsicSize", this.f39020b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class b extends fr.w implements er.l<androidx.compose.ui.platform.v1, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c2 f39021b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c2 c2Var) {
            super(1);
            this.f39021b = c2Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(androidx.compose.ui.platform.v1 v1Var) {
            c(v1Var);
            return oq.i0.f148189a;
        }

        public final void c(androidx.compose.ui.platform.v1 v1Var) {
            v1Var.b("width");
            v1Var.getProperties().b("intrinsicSize", this.f39021b);
        }
    }

    public static final f3.m a(f3.m mVar, c2 c2Var) {
        return mVar.u(new y1(c2Var, true, androidx.compose.ui.platform.t1.b() ? new a(c2Var) : androidx.compose.ui.platform.t1.a()));
    }

    public static final f3.m b(f3.m mVar, c2 c2Var) {
        return mVar.u(new f2(c2Var, true, androidx.compose.ui.platform.t1.b() ? new b(c2Var) : androidx.compose.ui.platform.t1.a()));
    }
}
