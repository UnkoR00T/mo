package u0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\r\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\t\u0010\u0004\"\u0017\u0010\f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b\u000b\u0010\u0004¨\u0006\r"}, d2 = {"Lu0/g0;", "a", "Lu0/g0;", "d", "()Lu0/g0;", "FastOutSlowInEasing", "b", "f", "LinearOutSlowInEasing", "c", "FastOutLinearInEasing", "e", "LinearEasing", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g0 f193650a = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g0 f193651b = new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g0 f193652c = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g0 f193653d = new g0() { // from class: u0.h0
        @Override // u0.g0
        public final float a(float f15) {
            return i0.b(f15);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(float f15) {
        return f15;
    }

    public static final g0 c() {
        return f193652c;
    }

    public static final g0 d() {
        return f193650a;
    }

    public static final g0 e() {
        return f193653d;
    }

    public static final g0 f() {
        return f193651b;
    }
}
