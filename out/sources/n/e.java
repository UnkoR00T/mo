package n;

import android.hardware.camera2.MultiResolutionImageReader;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.Image;
import android.media.ImageReader;
import fr.q0;
import h.c1;
import h.o1;
import h.t1;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import pq.e1;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u00022\u00020\u0001:\u0001\u0013J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R/\u00106\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010.8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R/\u0010=\u001a\u0004\u0018\u0001072\b\u0010/\u001a\u0004\u0018\u0001078V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00101\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006?"}, d2 = {"Ln/e;", "", "Landroid/media/ImageReader$OnImageAvailableListener;", "Landroid/media/ImageReader;", "reader", "Loq/i0;", "onImageAvailable", "(Landroid/media/ImageReader;)V", "close", "()V", "T", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Landroid/hardware/camera2/MultiResolutionImageReader;", "a", "Landroid/hardware/camera2/MultiResolutionImageReader;", "multiResolutionImageReader", "Lh/o1;", "b", "I", "streamFormat", "Lh/q1;", "c", "streamId", "", "Landroid/hardware/camera2/params/OutputConfiguration;", "d", "Ljava/util/List;", "s1", "()Ljava/util/List;", "outputConfigurations", "", "Landroid/hardware/camera2/params/MultiResolutionStreamInfo;", "Lh/c1;", "e", "Ljava/util/Map;", "streamInfoToOutputIdMap", "", "f", "Z", "concurrentOutputsEnabled", "Ln/l;", "<set-?>", "g", "Liu/e;", "o1", "()Ln/l;", "setOnImageListener", "(Ln/l;)V", "onImageListener", "Ln/k;", "h", "i1", "()Ln/k;", "setOnExpectedOutputsListener", "(Ln/k;)V", "onExpectedOutputsListener", "j", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements t1, AutoCloseable, ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MultiResolutionImageReader multiResolutionImageReader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int streamFormat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int streamId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<OutputConfiguration> outputConfigurations;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<MultiResolutionStreamInfo, c1> streamInfoToOutputIdMap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean concurrentOutputsEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final iu.e onImageListener;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final iu.e onExpectedOutputsListener;

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence x1(MultiResolutionStreamInfo multiResolutionStreamInfo) {
        return multiResolutionStreamInfo.getPhysicalCameraId() + ":w" + multiResolutionStreamInfo.getWidth() + 'h' + multiResolutionStreamInfo.getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.t1
    public <T> T c0(mr.c<T> type) {
        if (fr.t.c(type, q0.c(e.class))) {
            return this;
        }
        if (fr.t.c(type, q0.c(c.a()))) {
            return (T) this.multiResolutionImageReader;
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.multiResolutionImageReader.close();
    }

    public k i1() {
        return (k) this.onExpectedOutputsListener.c();
    }

    public l o1() {
        return (l) this.onImageListener.c();
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(ImageReader reader) {
        k kVarI1;
        Image imageAcquireNextImage = reader != null ? reader.acquireNextImage() : null;
        if (imageAcquireNextImage != null) {
            l lVarO1 = o1();
            if (lVarO1 == null) {
                imageAcquireNextImage.close();
                return;
            }
            MultiResolutionStreamInfo streamInfoForImageReader = this.multiResolutionImageReader.getStreamInfoForImageReader(reader);
            c1 c1Var = this.streamInfoToOutputIdMap.get(streamInfoForImageReader);
            if (c1Var != null) {
                int value = c1Var.getValue();
                if (!this.concurrentOutputsEnabled && (kVarI1 = i1()) != null) {
                    kVarI1.a(imageAcquireNextImage.getTimestamp(), e1.d(c1.a(value)));
                }
                lVarO1.a(this.streamId, value, new a(imageAcquireNextImage));
                return;
            }
            throw new IllegalStateException((this + ": Failed to find OutputId for " + reader + " based on streamInfo " + streamInfoForImageReader + '!').toString());
        }
    }

    public final List<OutputConfiguration> s1() {
        return this.outputConfigurations;
    }

    public String toString() {
        return "MultiResolutionImageReader@" + Integer.toString(super.hashCode(), fu.a.a(16)) + '-' + o1.g(this.streamFormat) + '-' + v.v0(this.streamInfoToOutputIdMap.keySet(), null, "[", "]", 0, null, new er.l() { // from class: n.d
            @Override // er.l
            public final Object b(Object obj) {
                return e.x1((MultiResolutionStreamInfo) obj);
            }
        }, 25, null);
    }
}
