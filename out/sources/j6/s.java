package j6;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static boolean a(MotionEvent motionEvent, int i15) {
        return (motionEvent.getSource() & i15) == i15;
    }
}
