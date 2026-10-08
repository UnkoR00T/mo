package sb;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;
import ob.WindowMetrics;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsb/r;", "Lsb/p;", "<init>", "()V", "Landroid/content/Context;", "context", "Lsb/k;", "densityCompatHelper", "Lob/v;", "a", "(Landroid/content/Context;Lsb/k;)Lob/v;", "Landroid/app/Activity;", "activity", "b", "(Landroid/app/Activity;Lsb/k;)Lob/v;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f179873b = new r();

    private r() {
    }

    @Override // sb.p
    public WindowMetrics a(Context context, k densityCompatHelper) {
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        return new WindowMetrics(windowManager.getCurrentWindowMetrics().getBounds(), windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // sb.p
    public WindowMetrics b(Activity activity, k densityCompatHelper) {
        return q.f179872b.b(activity, densityCompatHelper);
    }
}
