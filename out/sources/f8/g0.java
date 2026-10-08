package f8;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
class g0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f59980a;

    public g0(MediaCodec mediaCodec) {
        this.f59980a = mediaCodec;
    }

    @Override // f8.n
    public void a(int i15, int i16, int i17, long j15, int i18) {
        this.f59980a.queueInputBuffer(i15, i16, i17, j15, i18);
    }

    @Override // f8.n
    public void b() {
    }

    @Override // f8.n
    public void c(int i15, int i16, z7.c cVar, long j15, int i17) {
        this.f59980a.queueSecureInputBuffer(i15, i16, cVar.a(), j15, i17);
    }

    @Override // f8.n
    public void d(Bundle bundle) {
        this.f59980a.setParameters(bundle);
    }

    @Override // f8.n
    public void flush() {
    }

    @Override // f8.n
    public void shutdown() {
    }

    @Override // f8.n
    public void start() {
    }
}
