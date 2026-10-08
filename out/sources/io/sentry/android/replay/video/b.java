package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0016\u0010!\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0016\u0010'\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001b¨\u0006("}, d2 = {"Lio/sentry/android/replay/video/b;", "", "", "path", "", "fps", "<init>", "(Ljava/lang/String;F)V", "", "b", "()Z", "Landroid/media/MediaFormat;", "videoFormat", "Loq/i0;", "e", "(Landroid/media/MediaFormat;)V", "Ljava/nio/ByteBuffer;", "encodedData", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "c", "(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V", "d", "()V", "", "a", "()J", "J", "frameDurationUsec", "Landroid/media/MediaMuxer;", "Landroid/media/MediaMuxer;", "muxer", "Z", "started", "", "I", "videoTrackIndex", "videoFrames", "f", "finalVideoTime", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long frameDurationUsec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final MediaMuxer muxer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean started;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int videoTrackIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int videoFrames;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long finalVideoTime;

    public b(String str, float f15) {
        this.frameDurationUsec = (long) (TimeUnit.SECONDS.toMicros(1L) / f15);
        this.muxer = new MediaMuxer(str, 0);
    }

    public long a() {
        if (this.videoFrames == 0) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.convert(this.finalVideoTime + this.frameDurationUsec, TimeUnit.MICROSECONDS);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getStarted() {
        return this.started;
    }

    public void c(ByteBuffer encodedData, MediaCodec.BufferInfo bufferInfo) {
        long j15 = this.frameDurationUsec;
        int i15 = this.videoFrames;
        this.videoFrames = i15 + 1;
        long j16 = j15 * ((long) i15);
        this.finalVideoTime = j16;
        bufferInfo.presentationTimeUs = j16;
        this.muxer.writeSampleData(this.videoTrackIndex, encodedData, bufferInfo);
    }

    public void d() {
        this.muxer.stop();
        this.muxer.release();
    }

    public void e(MediaFormat videoFormat) {
        this.videoTrackIndex = this.muxer.addTrack(videoFormat);
        this.muxer.start();
        this.started = true;
    }
}
