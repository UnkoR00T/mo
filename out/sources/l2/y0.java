package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u001c\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u001f\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\b¨\u0006#"}, d2 = {"Ll2/y0;", "", "<init>", "()V", "Ll2/p;", "b", "Ll2/p;", "a", "()Ll2/p;", "DockedContainerColor", "Ll2/w0;", "c", "Ll2/w0;", "()Ll2/w0;", "DockedContainerShape", "d", "DockedDragHandleColor", "Lc5/h;", "e", "F", "()F", "DockedDragHandleHeight", "f", "DockedDragHandleWidth", "g", "getDockedMinimizedContainerShape", "DockedMinimizedContainerShape", "h", "DockedModalContainerElevation", "i", "getDockedStandardContainerElevation-D9Ej5fM", "DockedStandardContainerElevation", "j", "getFocusIndicatorColor", "FocusIndicatorColor", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f115384a = new y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p DockedContainerColor = p.SurfaceContainerLow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final w0 DockedContainerShape = w0.CornerExtraLargeTop;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final p DockedDragHandleColor = p.OnSurfaceVariant;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float DockedDragHandleHeight = c5.h.n((float) 4.0d);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float DockedDragHandleWidth = c5.h.n((float) 32.0d);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final w0 DockedMinimizedContainerShape = w0.CornerNone;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float DockedModalContainerElevation;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float DockedStandardContainerElevation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final p FocusIndicatorColor;

    static {
        t tVar = t.f115244a;
        DockedModalContainerElevation = tVar.b();
        DockedStandardContainerElevation = tVar.b();
        FocusIndicatorColor = p.Secondary;
    }

    private y0() {
    }

    public final p a() {
        return DockedContainerColor;
    }

    public final w0 b() {
        return DockedContainerShape;
    }

    public final p c() {
        return DockedDragHandleColor;
    }

    public final float d() {
        return DockedDragHandleHeight;
    }

    public final float e() {
        return DockedDragHandleWidth;
    }

    public final float f() {
        return DockedModalContainerElevation;
    }
}
