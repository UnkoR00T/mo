package sb;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import io.sentry.android.core.c2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroid/content/Context;", "context", "", "e", "(Landroid/content/Context;)I", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "bounds", "Loq/i0;", "f", "(Landroid/app/Activity;Landroid/graphics/Rect;)V", "Landroid/view/Display;", "display", "Landroid/view/DisplayCutout;", "d", "(Landroid/view/Display;)Landroid/view/DisplayCutout;", "window_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i {
    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"BanUncheckedReflection"})
    public static final DisplayCutout d(Display display) throws Exception {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (g.a(obj)) {
                return h.a(obj);
            }
        } catch (Exception e15) {
            if (!(e15 instanceof ClassNotFoundException) && !(e15 instanceof NoSuchMethodException) && !(e15 instanceof NoSuchFieldException) && !(e15 instanceof IllegalAccessException) && !(e15 instanceof InvocationTargetException) && !(e15 instanceof InstantiationException)) {
                throw e15;
            }
            c2.i(b.INSTANCE.b(), e15);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
