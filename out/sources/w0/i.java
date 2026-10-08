package w0;

import androidx.compose.ui.graphics.Color;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf3/m;", "Landroidx/compose/ui/graphics/Color;", "color", "Ln3/y2;", "shape", "c", "(Lf3/m;JLn3/y2;)Lf3/m;", "Landroidx/compose/ui/graphics/c;", "brush", "", "alpha", "a", "(Lf3/m;Landroidx/compose/ui/graphics/c;Ln3/y2;F)Lf3/m;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class a extends fr.w implements er.l<androidx.compose.ui.platform.v1, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f208951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.c f208952c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n3.y2 f208953d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f15, androidx.compose.ui.graphics.c cVar, n3.y2 y2Var) {
            super(1);
            this.f208951b = f15;
            this.f208952c = cVar;
            this.f208953d = y2Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(androidx.compose.ui.platform.v1 v1Var) {
            c(v1Var);
            return oq.i0.f148189a;
        }

        public final void c(androidx.compose.ui.platform.v1 v1Var) {
            v1Var.b("background");
            v1Var.getProperties().b("alpha", Float.valueOf(this.f208951b));
            v1Var.getProperties().b("brush", this.f208952c);
            v1Var.getProperties().b("shape", this.f208953d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class b extends fr.w implements er.l<androidx.compose.ui.platform.v1, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f208954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n3.y2 f208955c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j15, n3.y2 y2Var) {
            super(1);
            this.f208954b = j15;
            this.f208955c = y2Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(androidx.compose.ui.platform.v1 v1Var) {
            c(v1Var);
            return oq.i0.f148189a;
        }

        public final void c(androidx.compose.ui.platform.v1 v1Var) {
            v1Var.b("background");
            v1Var.c(Color.m0boximpl(this.f208954b));
            v1Var.getProperties().b("color", Color.m0boximpl(this.f208954b));
            v1Var.getProperties().b("shape", this.f208955c);
        }
    }

    public static final f3.m a(f3.m mVar, androidx.compose.ui.graphics.c cVar, n3.y2 y2Var, float f15) {
        return mVar.u(new h(0L, cVar, f15, y2Var, androidx.compose.ui.platform.t1.b() ? new a(f15, cVar, y2Var) : androidx.compose.ui.platform.t1.a(), 1, null));
    }

    public static /* synthetic */ f3.m b(f3.m mVar, androidx.compose.ui.graphics.c cVar, n3.y2 y2Var, float f15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            y2Var = n3.t2.a();
        }
        if ((i15 & 4) != 0) {
            f15 = 1.0f;
        }
        return a(mVar, cVar, y2Var, f15);
    }

    public static final f3.m c(f3.m mVar, long j15, n3.y2 y2Var) {
        return mVar.u(new h(j15, null, 1.0f, y2Var, androidx.compose.ui.platform.t1.b() ? new b(j15, y2Var) : androidx.compose.ui.platform.t1.a(), 2, null));
    }

    public static /* synthetic */ f3.m d(f3.m mVar, long j15, n3.y2 y2Var, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            y2Var = n3.t2.a();
        }
        return c(mVar, j15, y2Var);
    }
}
