package qb;

import androidx.window.extensions.layout.WindowLayoutComponent;
import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lqb/a;", "Lpb/a;", "a", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements pb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: qb.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqb/a$a;", "", "<init>", "()V", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "Lmb/d;", "adapter", "Lpb/a;", "a", "(Landroidx/window/extensions/layout/WindowLayoutComponent;Lmb/d;)Lpb/a;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final pb.a a(WindowLayoutComponent component, mb.d adapter) {
            int iA = mb.e.f125202a.a();
            if (iA >= 9) {
                return new g(component, adapter);
            }
            if (iA >= 6) {
                return new f(component, adapter);
            }
            if (iA >= 2) {
                return new e(component, adapter);
            }
            return iA == 1 ? new d(component, adapter) : new c();
        }

        private Companion() {
        }
    }
}
