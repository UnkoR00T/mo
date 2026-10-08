package androidx.compose.ui.platform;

import android.view.MotionEvent;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/e2;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "", "index", "", "a", "(Landroid/view/MotionEvent;I)Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e2 f10495a = new e2();

    private e2() {
    }

    public final boolean a(MotionEvent event, int index) {
        return (Float.floatToRawIntBits(event.getRawX(index)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(event.getRawY(index)) & Integer.MAX_VALUE) < 2139095040;
    }
}
