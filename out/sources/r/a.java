package r;

import a0.f;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.q;
import o.i0;
import p071kotlin.Metadata;
import v.j3;
import v.u1;
import v.w3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lr/a;", "", "Lv/j3;", "sessionConfig", "", "a", "(Lv/j3;)Z", "b", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f169768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f169767b = new C4294a();

    /* JADX INFO: renamed from: r.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"r/a$a", "Lr/a;", "Lv/j3;", "sessionConfig", "", "a", "(Lv/j3;)Z", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C4294a implements a {
        C4294a() {
        }

        @Override // r.a
        public boolean a(j3 sessionConfig) {
            return false;
        }
    }

    /* JADX INFO: renamed from: r.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0001¨\u0006\u000f"}, d2 = {"Lr/a$b;", "", "<init>", "()V", "Lv/w3;", "Landroid/util/Size;", "resolution", "Lo/i0;", "dynamicRange", "Lv/j3$b;", "a", "(Lv/w3;Landroid/util/Size;Lo/i0;)Lv/j3$b;", "Lr/a;", "NO_OP_FEATURE_COMBINATION_QUERY", "Lr/a;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f169768a = new Companion();

        /* JADX INFO: renamed from: r.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"r/a$b$a", "Lv/u1;", "Lcom/google/common/util/concurrent/q;", "Landroid/view/Surface;", "o", "()Lcom/google/common/util/concurrent/q;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C4295a extends u1 {
            C4295a(Size size, int i15) {
                super(size, i15);
            }

            @Override // v.u1
            protected q<Surface> o() {
                return f.h(null);
            }
        }

        private Companion() {
        }

        public final j3.b a(w3<?> w3Var, Size size, i0 i0Var) {
            C4295a c4295a = new C4295a(size, w3Var.r());
            Class<?> clsE = c.INSTANCE.c(w3Var).e();
            if (clsE != null) {
                c4295a.p(clsE);
            }
            return j3.b.p(w3Var, size).m(c4295a, i0Var);
        }
    }

    boolean a(j3 sessionConfig);
}
