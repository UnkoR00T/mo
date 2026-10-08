package a8;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4366k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4367l;

    private void b(long j15, int i15) {
        this.f4366k += j15;
        this.f4367l += i15;
    }

    public void a(long j15) {
        b(j15, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return w7.o0.F("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f4356a), Integer.valueOf(this.f4357b), Integer.valueOf(this.f4358c), Integer.valueOf(this.f4359d), Integer.valueOf(this.f4360e), Integer.valueOf(this.f4361f), Integer.valueOf(this.f4362g), Integer.valueOf(this.f4363h), Integer.valueOf(this.f4364i), Integer.valueOf(this.f4365j), Long.valueOf(this.f4366k), Integer.valueOf(this.f4367l));
    }
}
