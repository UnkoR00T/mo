package n3;

import android.graphics.DashPathEffect;
import android.graphics.PathEffect;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln3/n2;", "Landroid/graphics/PathEffect;", "b", "(Ln3/n2;)Landroid/graphics/PathEffect;", "", "intervals", "", "phase", "a", "([FF)Ln3/n2;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r0 {
    public static final n2 a(float[] fArr, float f15) {
        return new q0(new DashPathEffect(fArr, f15));
    }

    public static final PathEffect b(n2 n2Var) {
        return ((q0) n2Var).getNativePathEffect();
    }
}
