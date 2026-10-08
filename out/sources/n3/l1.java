package n3;

import android.graphics.Canvas;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ln3/l1;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "", "enable", "Loq/i0;", "a", "(Landroid/graphics/Canvas;Z)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1 f131019a = new l1();

    private l1() {
    }

    public final void a(Canvas canvas, boolean enable) {
        if (enable) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
