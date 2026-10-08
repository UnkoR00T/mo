package p143z0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import er.l;
import p071kotlin.Metadata;
import p076m2.a0;
import p076m2.b4;
import p076m2.d0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\"&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005\" \u0010\u000e\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u0007\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lm2/b4;", "Lz0/y;", "a", "Lm2/b4;", "c", "()Lm2/b4;", "getLocalBringIntoViewSpec$annotations", "()V", "LocalBringIntoViewSpec", "b", "Lz0/y;", "getPivotBringIntoViewSpec", "()Lz0/y;", "getPivotBringIntoViewSpec$annotations", "PivotBringIntoViewSpec", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<y> f231006a = d0.i(new l() { // from class: z0.z
        @Override // er.l
        public final Object b(Object obj) {
            return a0.b((a0) obj);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final y f231007b = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0010"}, d2 = {"z0/a0$a", "Lz0/y;", "", "offset", "size", "containerSize", "a", "(FFF)F", "b", "F", "getParentFraction", "()F", "parentFraction", "c", "getChildFraction", "childFraction", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements y {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float parentFraction = 0.3f;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float childFraction;

        a() {
        }

        @Override // p143z0.y
        public float a(float offset, float size, float containerSize) {
            float fAbs = Math.abs((size + offset) - offset);
            boolean z15 = fAbs <= containerSize;
            float f15 = (this.parentFraction * containerSize) - (this.childFraction * fAbs);
            float f16 = containerSize - f15;
            if (z15 && f16 < fAbs) {
                f15 = containerSize - fAbs;
            }
            return offset - f15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y b(p076m2.a0 a0Var) {
        return !((Context) a0Var.F(AndroidCompositionLocals_androidKt.c())).getPackageManager().hasSystemFeature("android.software.leanback") ? y.INSTANCE.b() : f231007b;
    }

    public static final b4<y> c() {
        return f231006a;
    }
}
