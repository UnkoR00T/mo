package g3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.input.InputManager;
import androidx.compose.ui.platform.n3;
import f3.t;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR+\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010#\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020 8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u001c\"\u0004\b!\u0010\u001eR+\u0010$\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b$\u0010%\"\u0004\b\u000e\u0010&R+\u0010'\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b'\u0010%\"\u0004\b\u001a\u0010&R+\u0010*\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010%\"\u0004\b\u0012\u0010&¨\u0006+"}, d2 = {"Lg3/c;", "Lf3/t;", "Landroid/content/Context;", "context", "Landroid/hardware/input/InputManager;", "inputManager", "Landroidx/compose/ui/platform/n3;", "windowInfo", "", "imeVisibility", "<init>", "(Landroid/content/Context;Landroid/hardware/input/InputManager;Landroidx/compose/ui/platform/n3;Z)V", "Landroid/content/pm/PackageManager;", "kotlin.jvm.PlatformType", "a", "Landroid/content/pm/PackageManager;", "packageManager", "<set-?>", "b", "Lm2/a3;", "get_windowInfo", "()Landroidx/compose/ui/platform/n3;", "e", "(Landroidx/compose/ui/platform/n3;)V", "_windowInfo", "Lf3/t$b;", "c", "get_windowPosture-m18o9QQ", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "_windowPosture", "Lf3/t$a;", "d", "get_anyPointer-fpxItnM", "_anyPointer", "isDocked", "()Z", "(Z)V", "isImeVisible", "g", "getHasPhysicalKeyboard", "hasPhysicalKeyboard", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PackageManager packageManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a3 _windowInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a3 _anyPointer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a3 isImeVisible;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a3 hasPhysicalKeyboard;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a3 _windowPosture = c6.e(t.b.d(t.b.INSTANCE.b()), null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a3 isDocked = c6.e(Boolean.FALSE, null, 2, null);

    public c(Context context, InputManager inputManager, n3 n3Var, boolean z15) {
        this.packageManager = context.getPackageManager();
        this._windowInfo = c6.e(n3Var, null, 2, null);
        this._anyPointer = c6.e(t.a.e(a.l(inputManager)), null, 2, null);
        this.isImeVisible = c6.e(Boolean.valueOf(z15), null, 2, null);
        this.hasPhysicalKeyboard = c6.e(Boolean.valueOf(a.f(inputManager)), null, 2, null);
    }

    public final void a(boolean z15) {
        this.isDocked.setValue(Boolean.valueOf(z15));
    }

    public final void b(boolean z15) {
        this.hasPhysicalKeyboard.setValue(Boolean.valueOf(z15));
    }

    public final void c(boolean z15) {
        this.isImeVisible.setValue(Boolean.valueOf(z15));
    }

    public final void d(String str) {
        this._anyPointer.setValue(t.a.e(str));
    }

    public final void e(n3 n3Var) {
        this._windowInfo.setValue(n3Var);
    }

    public final void f(String str) {
        this._windowPosture.setValue(t.b.d(str));
    }
}
