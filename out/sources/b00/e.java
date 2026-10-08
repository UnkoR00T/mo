package b00;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\b\u0010\u000b¨\u0006\u000e"}, d2 = {"Lb00/e;", "Lqx/a;", "", "defaultImageQuality", "defaultImageMaxSide", "thumbnailMaxSide", "<init>", "(III)V", "a", "I", "d", "()I", "b", "c", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements qx.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int defaultImageQuality;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int defaultImageMaxSide;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int thumbnailMaxSide;

    public e(int i15, int i16, int i17) {
        this.defaultImageQuality = i15;
        this.defaultImageMaxSide = i16;
        this.thumbnailMaxSide = i17;
    }

    @Override // qx.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getThumbnailMaxSide() {
        return this.thumbnailMaxSide;
    }

    @Override // qx.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getDefaultImageMaxSide() {
        return this.defaultImageMaxSide;
    }

    @Override // qx.a
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getDefaultImageQuality() {
        return this.defaultImageQuality;
    }
}
