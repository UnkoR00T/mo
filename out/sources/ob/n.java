package ob;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import fr.q0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lob/n;", "", "Landroid/content/Context;", "context", "Lmu/g;", "Lob/u;", "b", "(Landroid/content/Context;)Lmu/g;", "Landroid/app/Activity;", "activity", "a", "(Landroid/app/Activity;)Lmu/g;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f144181a;

    /* JADX INFO: renamed from: ob.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR#\u0010\u0012\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0016"}, d2 = {"Lob/n$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lob/n;", "d", "(Landroid/content/Context;)Lob/n;", "", "b", "Ljava/lang/String;", "TAG", "Lpb/a;", "c", "Loq/k;", "()Lpb/a;", "getExtensionBackend$window_release$annotations", "extensionBackend", "Lob/o;", "Lob/o;", "decorator", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f144181a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String TAG = q0.c(n.class).D();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final oq.k<pb.a> extensionBackend = oq.l.a(new er.a() { // from class: ob.m
            @Override // er.a
            public final Object a() {
                return n.Companion.b();
            }
        });

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static o decorator = b.f144149a;

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final pb.a b() {
            WindowLayoutComponent windowLayoutComponentL;
            try {
                ClassLoader classLoader = n.class.getClassLoader();
                l lVar = classLoader != null ? new l(classLoader, new mb.d(classLoader)) : null;
                if (lVar == null || (windowLayoutComponentL = lVar.l()) == null) {
                    return null;
                }
                return qb.a.INSTANCE.a(windowLayoutComponentL, new mb.d(classLoader));
            } catch (Throwable unused) {
                return null;
            }
        }

        public final pb.a c() {
            return extensionBackend.getValue();
        }

        public final n d(Context context) {
            pb.a aVarC = c();
            if (aVarC == null) {
                aVarC = androidx.window.layout.adapter.sidecar.b.INSTANCE.a(context);
            }
            return decorator.a(new r(new y(null, 1, null), aVarC, lb.e.INSTANCE.a()));
        }
    }

    mu.g<u> a(Activity activity);

    default mu.g<u> b(Context context) {
        Activity activity = context instanceof Activity ? (Activity) context : null;
        mu.g<u> gVarA = activity != null ? a(activity) : null;
        if (gVarA != null) {
            return gVarA;
        }
        throw new oq.q("Must override windowLayoutInfo(context) and provide an implementation.");
    }
}
