package ke;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p082nUL.y;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f110240a = true;

    public static Drawable a(Context context, int i15, Resources.Theme theme) {
        return c(context, context, i15, theme);
    }

    public static Drawable b(Context context, Context context2, int i15) {
        return c(context, context2, i15, null);
    }

    private static Drawable c(Context context, Context context2, int i15, Resources.Theme theme) {
        try {
            if (f110240a) {
                return e(context2, i15, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e15) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e15;
            }
            return u5.a.f(context2, i15);
        } catch (NoClassDefFoundError unused2) {
            f110240a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i15, theme);
    }

    private static Drawable d(Context context, int i15, Resources.Theme theme) {
        return w5.h.e(context.getResources(), i15, theme);
    }

    private static Drawable e(Context context, int i15, Resources.Theme theme) {
        if (theme != null) {
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, theme);
            dVar.a(theme.getResources().getConfiguration());
            context = dVar;
        }
        return y.b(context, i15);
    }
}
