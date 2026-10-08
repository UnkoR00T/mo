package j6;

import android.content.Context;
import android.view.PointerIcon;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointerIcon f99622a;

    static class a {
        static PointerIcon a(Context context, int i15) {
            return PointerIcon.getSystemIcon(context, i15);
        }
    }

    private c0(PointerIcon pointerIcon) {
        this.f99622a = pointerIcon;
    }

    public static c0 b(Context context, int i15) {
        return new c0(a.a(context, i15));
    }

    public Object a() {
        return this.f99622a;
    }
}
