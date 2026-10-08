package ha;

import android.annotation.SuppressLint;
import android.os.Build;
import android.window.BackEvent;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/window/BackEvent;", "backEvent", "Lha/b;", "a", "(Landroid/window/BackEvent;)Lha/b;", "navigationevent"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class k {
    @SuppressLint({"WrongConstant"})
    public static final NavigationEvent a(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new NavigationEvent(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }
}
