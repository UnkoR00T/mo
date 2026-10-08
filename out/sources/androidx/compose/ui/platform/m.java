package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0015R\u0018\u0010\u0019\u001a\u00060\u0011j\u0002`\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/platform/m;", "Landroidx/compose/ui/platform/c1;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "d", "()Z", "Landroidx/compose/ui/platform/a1;", "a", "()Landroidx/compose/ui/platform/a1;", "clipEntry", "Loq/i0;", "e", "(Landroidx/compose/ui/platform/a1;)V", "Landroid/content/Context;", "Landroid/content/ClipboardManager;", "b", "Landroid/content/ClipboardManager;", "_clipboardManager", "()Landroid/content/ClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/NativeClipboard;", "c", "nativeClipboard", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private ClipboardManager _clipboardManager;

    public m(Context context) {
        this.context = context;
    }

    private final ClipboardManager b() {
        ClipboardManager clipboardManager = this._clipboardManager;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        ClipboardManager clipboardManager2 = (ClipboardManager) this.context.getSystemService("clipboard");
        this._clipboardManager = clipboardManager2;
        return clipboardManager2;
    }

    public a1 a() {
        ClipData primaryClip = b().getPrimaryClip();
        if (primaryClip != null) {
            return new a1(primaryClip);
        }
        return null;
    }

    public ClipboardManager c() {
        return b();
    }

    public boolean d() {
        ClipDescription primaryClipDescription = b().getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    public void e(a1 clipEntry) {
        if (clipEntry != null) {
            b().setPrimaryClip(clipEntry.getClipData());
        } else if (Build.VERSION.SDK_INT >= 28) {
            r0.a(b());
        } else {
            b().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
