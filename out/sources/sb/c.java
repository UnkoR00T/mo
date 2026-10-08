package sb;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsb/c;", "Lsb/b;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "a", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f179859b = new c();

    private c() {
    }

    @Override // sb.b
    public Rect a(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!a.f179855a.a(activity)) {
            Point pointA = o.f179869a.a(defaultDisplay);
            int iE = i.e(activity);
            int i15 = rect.bottom;
            if (i15 + iE == pointA.y) {
                rect.bottom = i15 + iE;
                return rect;
            }
            int i16 = rect.right;
            if (i16 + iE == pointA.x) {
                rect.right = i16 + iE;
            }
        }
        return rect;
    }
}
