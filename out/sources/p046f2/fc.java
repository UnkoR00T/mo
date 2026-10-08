package p046f2;

import c5.h;
import l2.a0;
import l2.w;
import l2.y;
import l2.z;
import n3.y2;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0080D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u001b\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u001e¨\u0006 "}, d2 = {"Lf2/fc;", "", "<init>", "()V", "Lc5/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "Lf2/gc;", "a", "(FFFFLm2/r;II)Lf2/gc;", "", "b", "F", "getShowHideTargetScale$material3", "()F", "ShowHideTargetScale", "c", "getMediumIconSize-D9Ej5fM", "getMediumIconSize-D9Ej5fM$annotations", "MediumIconSize", "d", "getLargeIconSize-D9Ej5fM", "LargeIconSize", "Ln3/y2;", "(Lm2/r;I)Ln3/y2;", "shape", "extendedFabShape", "Landroidx/compose/ui/graphics/Color;", "(Lm2/r;I)J", "containerColor", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class fc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fc f55847a = new fc();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ShowHideTargetScale = 0.2f;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float MediumIconSize = z.f115394a.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float LargeIconSize = h.n(36);

    private fc() {
    }

    public final gc a(float f15, float f16, float f17, float f18, r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            f15 = a0.f114265a.b();
        }
        if ((i16 & 2) != 0) {
            f16 = a0.f114265a.e();
        }
        if ((i16 & 4) != 0) {
            f17 = a0.f114265a.c();
        }
        float f19 = f17;
        if ((i16 & 8) != 0) {
            f18 = a0.f114265a.d();
        }
        if (t.k()) {
            t.o(-241106249, i15, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:1063)");
        }
        float f25 = f15;
        gc gcVar = new gc(f25, f16, f19, f18, null);
        if (t.k()) {
            t.n();
        }
        return gcVar;
    }

    public final long b(r rVar, int i15) {
        if (t.k()) {
            t.o(1855656391, i15, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:1043)");
        }
        long jI = g2.i(a0.f114265a.a(), rVar, 6);
        if (t.k()) {
            t.n();
        }
        return jI;
    }

    public final y2 c(r rVar, int i15) {
        if (t.k()) {
            t.o(-536021915, i15, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-extendedFabShape> (FloatingActionButton.kt:1024)");
        }
        y2 y2VarH = ui.h(w.f115308a.a(), rVar, 6);
        if (t.k()) {
            t.n();
        }
        return y2VarH;
    }

    public final y2 d(r rVar, int i15) {
        if (t.k()) {
            t.o(-53247565, i15, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:1007)");
        }
        y2 y2VarH = ui.h(y.f115379a.b(), rVar, 6);
        if (t.k()) {
            t.n();
        }
        return y2VarH;
    }
}
