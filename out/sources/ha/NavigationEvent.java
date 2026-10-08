package ha;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ha.b, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0015B;\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048G¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048G¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048G¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006 "}, d2 = {"Lha/b;", "", "", "swipeEdge", "", "progress", "touchX", "touchY", "", "frameTimeMillis", "<init>", "(IFFFJ)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "c", "b", "F", "()F", "d", "e", "J", "()J", "f", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavigationEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int swipeEdge;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float progress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float touchX;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float touchY;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long frameTimeMillis;

    public NavigationEvent() {
        this(0, 0.0f, 0.0f, 0.0f, 0L, 31, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getFrameTimeMillis() {
        return this.frameTimeMillis;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSwipeEdge() {
        return this.swipeEdge;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getTouchX() {
        return this.touchX;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getTouchY() {
        return this.touchY;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && NavigationEvent.class == other.getClass()) {
            NavigationEvent navigationEvent = (NavigationEvent) other;
            return this.touchX == navigationEvent.touchX && this.touchY == navigationEvent.touchY && this.progress == navigationEvent.progress && this.swipeEdge == navigationEvent.swipeEdge && this.frameTimeMillis == navigationEvent.frameTimeMillis;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.touchX) * 31) + Float.hashCode(this.touchY)) * 31) + Float.hashCode(this.progress)) * 31) + Integer.hashCode(this.swipeEdge)) * 31) + Long.hashCode(this.frameTimeMillis);
    }

    public String toString() {
        return "NavigationEvent(touchX=" + this.touchX + ", touchY=" + this.touchY + ", progress=" + this.progress + ", swipeEdge=" + this.swipeEdge + ", frameTimeMillis=" + this.frameTimeMillis + ')';
    }

    public NavigationEvent(int i15, float f15, float f16, float f17, long j15) {
        this.swipeEdge = i15;
        this.progress = f15;
        this.touchX = f16;
        this.touchY = f17;
        this.frameTimeMillis = j15;
    }

    public /* synthetic */ NavigationEvent(int i15, float f15, float f16, float f17, long j15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 2 : i15, (i16 & 2) != 0 ? 0.0f : f15, (i16 & 4) != 0 ? 0.0f : f16, (i16 & 8) != 0 ? 0.0f : f17, (i16 & 16) != 0 ? 0L : j15);
    }
}
