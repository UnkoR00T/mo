package dh;

/* JADX INFO: loaded from: classes3.dex */
public enum r7 implements h {
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
    private final int f42202a;

    r7(int i15) {
        this.f42202a = i15;
    }

    @Override // dh.h
    public final int zza() {
        return this.f42202a;
    }
}
