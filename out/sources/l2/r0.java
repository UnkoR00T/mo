package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u001a\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001b"}, d2 = {"Ll2/r0;", "", "<init>", "()V", "Ll2/p;", "b", "Ll2/p;", "a", "()Ll2/p;", "ActiveIndicatorColor", "Ll2/w0;", "c", "Ll2/w0;", "getActiveShape", "()Ll2/w0;", "ActiveShape", "d", "getStopColor", "StopColor", "e", "getStopShape", "StopShape", "f", "TrackColor", "g", "getTrackShape", "TrackShape", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f115221a = new r0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p ActiveIndicatorColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final w0 ActiveShape;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final p StopColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final w0 StopShape;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final p TrackColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final w0 TrackShape;

    static {
        p pVar = p.Primary;
        ActiveIndicatorColor = pVar;
        w0 w0Var = w0.CornerFull;
        ActiveShape = w0Var;
        StopColor = pVar;
        StopShape = w0Var;
        TrackColor = p.SecondaryContainer;
        TrackShape = w0Var;
    }

    private r0() {
    }

    public final p a() {
        return ActiveIndicatorColor;
    }

    public final p b() {
        return TrackColor;
    }
}
