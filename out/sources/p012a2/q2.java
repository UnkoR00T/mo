package p012a2;

import androidx.compose.ui.graphics.Color;
import c5.h;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import u0.i0;
import u0.l;
import u0.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, d2 = {"La2/q2;", "", "<init>", "()V", "Lc5/h;", "b", "F", "()F", "Elevation", "Lu0/l;", "", "c", "Lu0/l;", "a", "()Lu0/l;", "AnimationSpec", "Landroidx/compose/ui/graphics/Color;", "(Lm2/r;I)J", "scrimColor", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q2 f1887a = new q2();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float Elevation = h.n(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final l<Float> AnimationSpec = m.l(300, 0, i0.d(), 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f1890d = 8;

    private q2() {
    }

    public final l<Float> a() {
        return AnimationSpec;
    }

    public final float b() {
        return Elevation;
    }

    public final long c(r rVar, int i15) {
        if (t.k()) {
            t.o(-112572414, i15, -1, "androidx.compose.material.ModalBottomSheetDefaults.<get-scrimColor> (ModalBottomSheet.kt:522)");
        }
        long jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(m2.f1788a.a(rVar, 6).g(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (t.k()) {
            t.n();
        }
        return jM9copywmQWz5c$default;
    }
}
