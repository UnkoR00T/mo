package k3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lk3/p;", "Lk3/b;", "<init>", "()V", "Lm3/k;", "b", "J", "a", "()J", "size", "Lc5/t;", "c", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "layoutDirection", "Lc5/d;", "d", "Lc5/d;", "getDensity", "()Lc5/d;", "density", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class p implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f107752a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long size = m3.k.INSTANCE.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final c5.t layoutDirection = c5.t.Ltr;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final c5.d density = c5.f.a(1.0f, 1.0f);

    private p() {
    }

    @Override // k3.b
    public long a() {
        return size;
    }

    @Override // k3.b
    public c5.d getDensity() {
        return density;
    }

    @Override // k3.b
    public c5.t getLayoutDirection() {
        return layoutDirection;
    }
}
