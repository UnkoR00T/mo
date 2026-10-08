package qb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import ob.WindowMetrics;
import ob.u;
import ob.y;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lqb/h;", "", "<init>", "()V", "Lob/v;", "windowMetrics", "Lmb/b;", "bounds", "", "d", "(Lob/v;Lmb/b;)Z", "Landroidx/window/extensions/layout/FoldingFeature;", "oemFeature", "Lob/c;", "a", "(Lob/v;Landroidx/window/extensions/layout/FoldingFeature;)Lob/c;", "Landroid/content/Context;", "context", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "info", "Lob/u;", "b", "(Landroid/content/Context;Landroidx/window/extensions/layout/WindowLayoutInfo;)Lob/u;", "c", "(Lob/v;Landroidx/window/extensions/layout/WindowLayoutInfo;)Lob/u;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f165689a = new h();

    private h() {
    }

    private final boolean d(WindowMetrics windowMetrics, mb.b bounds) {
        Rect rectA = windowMetrics.a();
        if (bounds.e()) {
            return false;
        }
        if (bounds.d() != rectA.width() && bounds.a() != rectA.height()) {
            return false;
        }
        if (bounds.d() >= rectA.width() || bounds.a() >= rectA.height()) {
            return (bounds.d() == rectA.width() && bounds.a() == rectA.height()) ? false : true;
        }
        return false;
    }

    public final ob.c a(WindowMetrics windowMetrics, FoldingFeature oemFeature) {
        ob.d.b bVarA;
        ob.c.C3575c c3575c;
        int type = oemFeature.getType();
        if (type == 1) {
            bVarA = ob.d.b.INSTANCE.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = ob.d.b.INSTANCE.b();
        }
        int state = oemFeature.getState();
        if (state == 1) {
            c3575c = ob.c.C3575c.f144159c;
        } else {
            if (state != 2) {
                return null;
            }
            c3575c = ob.c.C3575c.f144160d;
        }
        if (d(windowMetrics, new mb.b(oemFeature.getBounds()))) {
            return new ob.d(new mb.b(oemFeature.getBounds()), bVarA, c3575c);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u b(Context context, WindowLayoutInfo info) {
        y yVar = new y(null, 1, 0 == true ? 1 : 0);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 30) {
            return c(yVar.a(context), info);
        }
        if (i15 < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
        return c(yVar.b((Activity) context), info);
    }

    public final u c(WindowMetrics windowMetrics, WindowLayoutInfo info) {
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            ob.c cVarA = foldingFeature instanceof FoldingFeature ? f165689a.a(windowMetrics, foldingFeature) : null;
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return new u(arrayList);
    }
}
