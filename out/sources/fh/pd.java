package fh;

/* JADX INFO: loaded from: classes3.dex */
public enum pd implements x1 {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f63457a;

    pd(int i15) {
        this.f63457a = i15;
    }

    @Override // fh.x1
    public final int zza() {
        return this.f63457a;
    }
}
