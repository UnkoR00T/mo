package dh;

/* JADX INFO: loaded from: classes3.dex */
public enum x7 implements h {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42475a;

    x7(int i15) {
        this.f42475a = i15;
    }

    @Override // dh.h
    public final int zza() {
        return this.f42475a;
    }
}
