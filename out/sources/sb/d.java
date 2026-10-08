package sb;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import io.sentry.android.core.c2;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsb/d;", "Lsb/b;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "a", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class d implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f179860b = new d();

    private d() {
    }

    @Override // sb.b
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public Rect a(Activity activity) throws Exception {
        DisplayCutout displayCutoutD;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (a.f179855a.a(activity)) {
                rect.set((Rect) obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null));
            } else {
                rect.set((Rect) obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null));
            }
        } catch (Exception e15) {
            if (!(e15 instanceof NoSuchFieldException) && !(e15 instanceof NoSuchMethodException) && !(e15 instanceof IllegalAccessException) && !(e15 instanceof InvocationTargetException)) {
                throw e15;
            }
            c2.i(b.INSTANCE.b(), e15);
            i.f(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        a aVar = a.f179855a;
        if (!aVar.a(activity)) {
            int iE = i.e(activity);
            int i15 = rect.bottom;
            if (i15 + iE == point.y) {
                rect.bottom = i15 + iE;
            } else {
                int i16 = rect.right;
                if (i16 + iE == point.x) {
                    rect.right = i16 + iE;
                } else if (rect.left == iE) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !aVar.a(activity) && (displayCutoutD = i.d(defaultDisplay)) != null) {
            int i17 = rect.left;
            n nVar = n.f179868a;
            if (i17 == nVar.b(displayCutoutD)) {
                rect.left = 0;
            }
            if (point.x - rect.right == nVar.c(displayCutoutD)) {
                rect.right += nVar.c(displayCutoutD);
            }
            if (rect.top == nVar.d(displayCutoutD)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == nVar.a(displayCutoutD)) {
                rect.bottom += nVar.a(displayCutoutD);
            }
        }
        return rect;
    }
}
