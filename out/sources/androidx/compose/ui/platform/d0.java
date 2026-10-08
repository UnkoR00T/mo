package androidx.compose.ui.platform;

import a4.AndroidPointerIcon;
import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/d0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "La4/w;", "icon", "Landroid/view/PointerIcon;", "b", "(Landroid/content/Context;La4/w;)Landroid/view/PointerIcon;", "Landroid/view/View;", "view", "Loq/i0;", "a", "(Landroid/view/View;La4/w;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f10437a = new d0();

    private d0() {
    }

    public final void a(View view, a4.w icon) {
        PointerIcon pointerIconB = b(view.getContext(), icon);
        if (fr.t.c(view.getPointerIcon(), pointerIconB)) {
            return;
        }
        view.setPointerIcon(pointerIconB);
    }

    public final PointerIcon b(Context context, a4.w icon) {
        if (icon instanceof a4.a) {
            return ((a4.a) icon).a();
        }
        return icon instanceof AndroidPointerIcon ? PointerIcon.getSystemIcon(context, ((AndroidPointerIcon) icon).getType()) : PointerIcon.getSystemIcon(context, 1000);
    }
}
