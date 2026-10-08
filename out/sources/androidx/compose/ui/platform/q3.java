package androidx.compose.ui.platform;

import android.view.View;
import p071kotlin.Metadata;
import p076m2.p4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/q3;", "", "Landroid/view/View;", "windowRootView", "Lm2/p4;", "a", "(Landroid/view/View;)Lm2/p4;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f10735a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.q3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/q3$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/q3;", "b", "Landroidx/compose/ui/platform/q3;", "c", "()Landroidx/compose/ui/platform/q3;", "LifecycleAware", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f10735a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final q3 LifecycleAware = new q3() { // from class: androidx.compose.ui.platform.p3
            @Override // androidx.compose.ui.platform.q3
            public final p4 a(View view) {
                return q3.Companion.b(view);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p4 b(View view) {
            return s3.d(view, null, null, 3, null);
        }

        public final q3 c() {
            return LifecycleAware;
        }
    }

    p4 a(View windowRootView);
}
