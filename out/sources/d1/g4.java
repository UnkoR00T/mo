package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0004\u001a'\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf3/m;", "Ld1/c4;", "insets", "c", "(Lf3/m;Ld1/c4;)Lf3/m;", "a", "Lkotlin/Function1;", "Loq/i0;", "block", "b", "(Lf3/m;Ler/l;)Lf3/m;", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g4 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class a extends fr.w implements er.l<androidx.compose.ui.platform.v1, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c4 f39144b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c4 c4Var) {
            super(1);
            this.f39144b = c4Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(androidx.compose.ui.platform.v1 v1Var) {
            c(v1Var);
            return oq.i0.f148189a;
        }

        public final void c(androidx.compose.ui.platform.v1 v1Var) {
            v1Var.b("consumeWindowInsets");
            v1Var.getProperties().b("insets", this.f39144b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class b extends fr.w implements er.l<androidx.compose.ui.platform.v1, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.l f39145b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(er.l lVar) {
            super(1);
            this.f39145b = lVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(androidx.compose.ui.platform.v1 v1Var) {
            c(v1Var);
            return oq.i0.f148189a;
        }

        public final void c(androidx.compose.ui.platform.v1 v1Var) {
            v1Var.b("onConsumedWindowInsetsChanged");
            v1Var.getProperties().b("block", this.f39145b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class c extends fr.w implements er.l<androidx.compose.ui.platform.v1, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c4 f39146b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c4 c4Var) {
            super(1);
            this.f39146b = c4Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(androidx.compose.ui.platform.v1 v1Var) {
            c(v1Var);
            return oq.i0.f148189a;
        }

        public final void c(androidx.compose.ui.platform.v1 v1Var) {
            v1Var.b("windowInsetsPadding");
            v1Var.getProperties().b("insets", this.f39146b);
        }
    }

    public static final f3.m a(f3.m mVar, c4 c4Var) {
        return mVar.u(new x3(c4Var, androidx.compose.ui.platform.t1.b() ? new a(c4Var) : androidx.compose.ui.platform.t1.a()));
    }

    public static final f3.m b(f3.m mVar, er.l<? super c4, oq.i0> lVar) {
        return mVar.u(new j0(lVar, androidx.compose.ui.platform.t1.b() ? new b(lVar) : androidx.compose.ui.platform.t1.a()));
    }

    public static final f3.m c(f3.m mVar, c4 c4Var) {
        return mVar.u(new t1(c4Var, androidx.compose.ui.platform.t1.b() ? new c(c4Var) : androidx.compose.ui.platform.t1.a()));
    }
}
