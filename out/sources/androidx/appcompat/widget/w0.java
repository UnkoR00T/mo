package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class w0 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f9084c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList<WeakReference<w0>> f9085d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f9086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources.Theme f9087b;

    private w0(Context context) {
        super(context);
        if (!f1.c()) {
            this.f9086a = new y0(this, context.getResources());
            this.f9087b = null;
            return;
        }
        f1 f1Var = new f1(this, context.getResources());
        this.f9086a = f1Var;
        Resources.Theme themeNewTheme = f1Var.newTheme();
        this.f9087b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof w0) || (context.getResources() instanceof y0) || (context.getResources() instanceof f1) || !f1.c()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f9084c) {
            try {
                ArrayList<WeakReference<w0>> arrayList = f9085d;
                if (arrayList == null) {
                    f9085d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<w0> weakReference = f9085d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f9085d.remove(size);
                        }
                    }
                    for (int size2 = f9085d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<w0> weakReference2 = f9085d.get(size2);
                        w0 w0Var = weakReference2 != null ? weakReference2.get() : null;
                        if (w0Var != null && w0Var.getBaseContext() == context) {
                            return w0Var;
                        }
                    }
                }
                w0 w0Var2 = new w0(context);
                f9085d.add(new WeakReference<>(w0Var2));
                return w0Var2;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f9086a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f9086a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f9087b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i15) {
        Resources.Theme theme = this.f9087b;
        if (theme == null) {
            super.setTheme(i15);
        } else {
            theme.applyStyle(i15, true);
        }
    }
}
