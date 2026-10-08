package p012a2;

import c5.h;
import n3.o1;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"La2/p1;", "La2/y1;", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "color", "Lc5/h;", "elevation", "a", "(JFLm2/r;I)J", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class p1 implements y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1 f1861a = new p1();

    private p1() {
    }

    @Override // p012a2.y1
    public long a(long j15, float f15, r rVar, int i15) {
        rVar.X(-1687113661);
        if (t.k()) {
            t.o(-1687113661, i15, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:67)");
        }
        Colors colorsA = m2.f1788a.a(rVar, 6);
        if (h.l(f15, h.n(0)) <= 0 || colorsA.m()) {
            rVar.X(-1095489470);
            rVar.R();
        } else {
            rVar.X(-1095627978);
            j15 = o1.g(b2.f(j15, f15, rVar, i15 & 126), j15);
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return j15;
    }
}
