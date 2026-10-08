package ob;

import android.content.Context;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lob/x;", "", "Landroid/content/Context;", "context", "Lob/v;", "a", "(Landroid/content/Context;)Lob/v;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f144206a;

    /* JADX INFO: renamed from: ob.x$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lob/x$a;", "", "<init>", "()V", "Lob/x;", "c", "()Lob/x;", "Lkotlin/Function1;", "b", "Ler/l;", "decorator", "Lob/y;", "Lob/y;", "windowMetricsCalculatorCompat", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f144206a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static er.l<? super x, ? extends x> decorator = new er.l() { // from class: ob.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.Companion.b((x) obj);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final y windowMetricsCalculatorCompat = new y(null, 1, null);

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x b(x xVar) {
            return xVar;
        }

        public final x c() {
            return decorator.b(windowMetricsCalculatorCompat);
        }
    }

    default WindowMetrics a(Context context) {
        throw new oq.q("Must override computeCurrentWindowMetrics(context) and provide an implementation.");
    }
}
