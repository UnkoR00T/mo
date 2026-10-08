package pw;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpw/b;", "Lyw/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/accessibility/AccessibilityEvent;", "kotlin.jvm.PlatformType", "d", "()Landroid/view/accessibility/AccessibilityEvent;", "", "message", "Loq/i0;", "a", "(Ljava/lang/String;)V", "", "b", "()Z", "c", "Landroid/content/Context;", "accessibility_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements yw.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public b(Context context) {
        this.context = context;
    }

    private final AccessibilityEvent d() {
        return Build.VERSION.SDK_INT >= 30 ? a.a() : AccessibilityEvent.obtain();
    }

    @Override // yw.b
    public void a(String message) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.context.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent accessibilityEventD = d();
            accessibilityEventD.setEventType(16384);
            accessibilityEventD.setPackageName(this.context.getPackageName());
            accessibilityEventD.getText().add(message);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventD);
        }
    }

    @Override // yw.b
    public boolean b() {
        return ((AccessibilityManager) this.context.getSystemService("accessibility")).isEnabled();
    }

    @Override // yw.b
    public boolean c() {
        return ((AccessibilityManager) this.context.getSystemService("accessibility")).isTouchExplorationEnabled();
    }
}
