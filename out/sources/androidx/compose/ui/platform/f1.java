package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\"\"\u0010\u0011\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\"2\u0010\u0018\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00078@@@X\u0080\u000e¢\u0006\u0012\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroid/view/View;", "d", "(Landroid/view/View;)Landroid/view/View;", "", "tag", "b", "(Landroid/view/View;I)I", "Landroidx/compose/ui/platform/e1;", "c", "(Landroid/view/View;)Landroidx/compose/ui/platform/e1;", "", "a", "Z", "e", "()Z", "setAreWindowInsetsRulersEnabled", "(Z)V", "areWindowInsetsRulersEnabled", "value", "f", "g", "(Landroid/view/View;Landroidx/compose/ui/platform/e1;)V", "getComposeViewContext$annotations", "(Landroid/view/View;)V", "composeViewContext", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f10508a = true;

    private static final int b(View view, int i15) {
        int i16 = 0;
        int i17 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i15);
            if (tag != null) {
                if (obj != null) {
                    if (!fr.t.c(tag, obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i17 = i16;
            }
            i16++;
            Object objA = o6.b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return i17;
    }

    public static final e1 c(View view) {
        return f(d(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View d(View view) {
        if (!view.isAttachedToWindow() || !f3.d.isSharedComposeViewContextEnabled) {
            return view;
        }
        int iMin = Math.min(b(view, o7.a.f142863a), b(view, ua.a.f196646a));
        View view2 = view;
        int i15 = 0;
        View view3 = view2;
        while (view != null) {
            if (i15 == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (f(view) == null) {
                i15++;
                Object objA = o6.b.a(view);
                View view4 = view2;
                view2 = view;
                view = objA instanceof View ? (View) objA : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final boolean e() {
        return f10508a;
    }

    public static final e1 f(View view) {
        Object tag = view.getTag(f3.p.G);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (e1) weakReference.get();
        }
        return null;
    }

    public static final void g(View view, e1 e1Var) {
        view.setTag(f3.p.G, new WeakReference(e1Var));
    }
}
