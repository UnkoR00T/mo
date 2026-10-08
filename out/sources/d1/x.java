package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0004*\u00020\u0004H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ld1/x;", "Ld1/w;", "<init>", "()V", "Lf3/m;", "Lf3/c;", "alignment", "d", "(Lf3/m;Lf3/c;)Lf3/m;", "c", "(Lf3/m;)Lf3/m;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f39368a = new x();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class a extends fr.w implements er.l<androidx.compose.ui.platform.v1, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f3.c f39369b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f3.c cVar) {
            super(1);
            this.f39369b = cVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(androidx.compose.ui.platform.v1 v1Var) {
            c(v1Var);
            return oq.i0.f148189a;
        }

        public final void c(androidx.compose.ui.platform.v1 v1Var) {
            v1Var.b("align");
            v1Var.c(this.f39369b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class b extends fr.w implements er.l<androidx.compose.ui.platform.v1, oq.i0> {
        public b() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(androidx.compose.ui.platform.v1 v1Var) {
            c(v1Var);
            return oq.i0.f148189a;
        }

        public final void c(androidx.compose.ui.platform.v1 v1Var) {
            v1Var.b("matchParentSize");
        }
    }

    private x() {
    }

    @Override // d1.w
    public f3.m c(f3.m mVar) {
        return mVar.u(new n(f3.c.INSTANCE.e(), true, androidx.compose.ui.platform.t1.b() ? new b() : androidx.compose.ui.platform.t1.a()));
    }

    @Override // d1.w
    public f3.m d(f3.m mVar, f3.c cVar) {
        return mVar.u(new n(cVar, false, androidx.compose.ui.platform.t1.b() ? new a(cVar) : androidx.compose.ui.platform.t1.a()));
    }
}
