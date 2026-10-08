package sb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import ob.WindowMetrics;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lsb/p;", "", "Landroid/content/Context;", "context", "Lsb/k;", "densityCompatHelper", "Lob/v;", "a", "(Landroid/content/Context;Lsb/k;)Lob/v;", "Landroid/app/Activity;", "activity", "b", "(Landroid/app/Activity;Lsb/k;)Lob/v;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f179871a;

    /* JADX INFO: renamed from: sb.p$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsb/p$a;", "", "<init>", "()V", "Lsb/p;", "a", "()Lsb/p;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f179871a = new Companion();

        private Companion() {
        }

        public final p a() {
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 34) {
                return r.f179873b;
            }
            return i15 >= 30 ? q.f179872b : s.f179874b;
        }
    }

    WindowMetrics a(Context context, k densityCompatHelper);

    WindowMetrics b(Activity activity, k densityCompatHelper);
}
