package e00;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u000e"}, d2 = {"Le00/a;", "Lzy/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "text", "Loq/i0;", "a", "(Ljava/lang/String;)V", "Landroid/content/ClipboardManager;", "Landroid/content/ClipboardManager;", "manager", "memory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements zy.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ClipboardManager manager;

    public a(Context context) {
        this.manager = (ClipboardManager) context.getSystemService("clipboard");
    }

    @Override // zy.a
    public void a(String text) {
        this.manager.setPrimaryClip(ClipData.newPlainText(null, text));
    }
}
