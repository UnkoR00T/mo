package l70;

import android.graphics.Color;
import n3.o1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "a", "(J)J", "theme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final long a(long j15) {
        float[] fArr = new float[3];
        Color.colorToHSV(o1.j(j15), fArr);
        fArr[1] = fArr[1] * 0.75f;
        fArr[2] = 1.0f;
        return o1.b(Color.HSVToColor(fArr));
    }
}
