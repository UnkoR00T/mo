package n3;

import android.graphics.Path;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ln3/m2;", "a", "()Ln3/m2;", "Landroid/graphics/Path;", "c", "(Landroid/graphics/Path;)Ln3/m2;", "", "message", "Loq/i0;", "d", "(Ljava/lang/String;)V", "Ln3/m2$b;", "Landroid/graphics/Path$Direction;", "e", "(Ln3/m2$b;)Landroid/graphics/Path$Direction;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131065a;

        static {
            int[] iArr = new int[m2.b.values().length];
            try {
                iArr[m2.b.CounterClockwise.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m2.b.Clockwise.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f131065a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final m2 a() {
        return new p0(null, 1, 0 == true ? 1 : 0);
    }

    public static final m2 c(Path path) {
        return new p0(path);
    }

    public static final void d(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path.Direction e(m2.b bVar) {
        int i15 = a.f131065a[bVar.ordinal()];
        if (i15 == 1) {
            return Path.Direction.CCW;
        }
        if (i15 == 2) {
            return Path.Direction.CW;
        }
        throw new oq.p();
    }
}
