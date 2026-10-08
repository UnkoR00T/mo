package l2;

import p071kotlin.Metadata;
import u0.CubicBezierEasing;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\b¨\u0006#"}, d2 = {"Ll2/l0;", "", "<init>", "()V", "Lu0/a0;", "b", "Lu0/a0;", "getEasingEmphasizedCubicBezier", "()Lu0/a0;", "EasingEmphasizedCubicBezier", "c", "a", "EasingEmphasizedAccelerateCubicBezier", "d", "EasingEmphasizedDecelerateCubicBezier", "e", "getEasingLegacyCubicBezier", "EasingLegacyCubicBezier", "f", "getEasingLegacyAccelerateCubicBezier", "EasingLegacyAccelerateCubicBezier", "g", "getEasingLegacyDecelerateCubicBezier", "EasingLegacyDecelerateCubicBezier", "h", "getEasingLinearCubicBezier", "EasingLinearCubicBezier", "i", "EasingStandardCubicBezier", "j", "getEasingStandardAccelerateCubicBezier", "EasingStandardAccelerateCubicBezier", "k", "getEasingStandardDecelerateCubicBezier", "EasingStandardDecelerateCubicBezier", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f114877a = new l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final CubicBezierEasing EasingEmphasizedCubicBezier = new CubicBezierEasing(0.2f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final CubicBezierEasing EasingEmphasizedAccelerateCubicBezier = new CubicBezierEasing(0.3f, 0.0f, 0.8f, 0.15f);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final CubicBezierEasing EasingEmphasizedDecelerateCubicBezier = new CubicBezierEasing(0.05f, 0.7f, 0.1f, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final CubicBezierEasing EasingLegacyCubicBezier = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final CubicBezierEasing EasingLegacyAccelerateCubicBezier = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final CubicBezierEasing EasingLegacyDecelerateCubicBezier = new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final CubicBezierEasing EasingLinearCubicBezier = new CubicBezierEasing(0.0f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final CubicBezierEasing EasingStandardCubicBezier = new CubicBezierEasing(0.2f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final CubicBezierEasing EasingStandardAccelerateCubicBezier = new CubicBezierEasing(0.3f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final CubicBezierEasing EasingStandardDecelerateCubicBezier = new CubicBezierEasing(0.0f, 0.0f, 0.0f, 1.0f);

    private l0() {
    }

    public final CubicBezierEasing a() {
        return EasingEmphasizedAccelerateCubicBezier;
    }

    public final CubicBezierEasing b() {
        return EasingEmphasizedDecelerateCubicBezier;
    }

    public final CubicBezierEasing c() {
        return EasingStandardCubicBezier;
    }
}
