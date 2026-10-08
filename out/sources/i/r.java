package i;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0001\u0018\u0000 +2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Li/r;", "Li/l3;", "Landroid/hardware/camera2/params/OutputConfiguration;", "output", "", "surfaceSharing", "", "maxSharedSurfaceCount", "Lh/v;", "physicalCameraId", "<init>", "(Landroid/hardware/camera2/params/OutputConfiguration;ZILjava/lang/String;Lfr/k;)V", "Landroid/view/Surface;", "surface", "Loq/i0;", "u", "(Landroid/view/Surface;)V", "", "T", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "a", "Landroid/hardware/camera2/params/OutputConfiguration;", "b", "Z", "getSurfaceSharing", "()Z", "c", "I", "getMaxSharedSurfaceCount", "()I", "d", "Ljava/lang/String;", "getPhysicalCameraId-1LO98Z0", "e", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "f", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements l3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OutputConfiguration output;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean surfaceSharing;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int maxSharedSurfaceCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String physicalCameraId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Surface surface;

    /* JADX INFO: renamed from: i.r$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\t*\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u009b\u0001\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u00122\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Li/r$a;", "", "<init>", "()V", "Lh/e1$d;", "Ljava/lang/Class;", "e", "(Lh/e1$d;)Ljava/lang/Class;", "Landroid/hardware/camera2/params/OutputConfiguration;", "Loq/i0;", "c", "(Landroid/hardware/camera2/params/OutputConfiguration;)V", "Lh/v;", "physicalCameraId", "d", "(Landroid/hardware/camera2/params/OutputConfiguration;Ljava/lang/String;)V", "Landroid/view/Surface;", "surface", "", "format", "outputType", "Lh/e1$c;", "mirrorMode", "Lh/e1$h;", "timestampBase", "Lh/e1$b;", "dynamicRangeProfile", "Lh/e1$f;", "streamUseCase", "", "Lh/e1$e;", "sensorPixelModes", "Landroid/util/Size;", "size", "", "surfaceSharing", "surfaceGroupId", "Li/l3;", "a", "(Landroid/view/Surface;Ljava/lang/Integer;Lh/e1$d;Lh/e1$c;Lh/e1$h;Lh/e1$b;Lh/e1$f;Ljava/util/List;Landroid/util/Size;ZILjava/lang/String;)Li/l3;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ l3 b(Companion companion, Surface surface, Integer num, h.e1.d dVar, h.e1.c cVar, h.e1.h hVar, h.e1.b bVar, h.e1.f fVar, List list, Size size, boolean z15, int i15, String str, int i16, Object obj) {
            if ((i16 & 2) != 0) {
                num = null;
            }
            if ((i16 & 4) != 0) {
                dVar = h.e1.d.INSTANCE.c();
            }
            if ((i16 & 8) != 0) {
                cVar = null;
            }
            if ((i16 & 16) != 0) {
                hVar = null;
            }
            if ((i16 & 32) != 0) {
                bVar = null;
            }
            if ((i16 & 64) != 0) {
                fVar = null;
            }
            if ((i16 & 128) != 0) {
                list = pq.v.n();
            }
            if ((i16 & 256) != 0) {
                size = null;
            }
            if ((i16 & 512) != 0) {
                z15 = false;
            }
            if ((i16 & 1024) != 0) {
                i15 = -1;
            }
            if ((i16 & 2048) != 0) {
                str = null;
            }
            return companion.a(surface, num, dVar, cVar, hVar, bVar, fVar, list, size, z15, i15, str);
        }

        private final void c(OutputConfiguration outputConfiguration) {
            u.b(outputConfiguration);
        }

        private final void d(OutputConfiguration outputConfiguration, String str) {
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 28) {
                if (i15 >= 28) {
                    w.k(outputConfiguration, str);
                    return;
                }
                return;
            }
            throw new IllegalStateException(("physicalCameraId is not supported on API " + i15 + " (requires API 28)").toString());
        }

        private final Class<? extends Object> e(h.e1.d dVar) {
            h.e1.d.Companion companion = h.e1.d.INSTANCE;
            if (fr.t.c(dVar, companion.e())) {
                return SurfaceTexture.class;
            }
            if (fr.t.c(dVar, companion.f())) {
                return SurfaceHolder.class;
            }
            if (fr.t.c(dVar, companion.a())) {
                if (Build.VERSION.SDK_INT >= 35) {
                    return MediaCodec.class;
                }
                throw new IllegalStateException("OutputType.MEDIA_CODEC requires API 35 or higher.");
            }
            if (fr.t.c(dVar, companion.b())) {
                if (Build.VERSION.SDK_INT >= 35) {
                    return MediaRecorder.class;
                }
                throw new IllegalStateException("OutputType.MEDIA_RECORDER requires API 35 or higher.");
            }
            throw new IllegalStateException("Unsupported OutputType: " + dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [android.view.Surface] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v19 */
        /* JADX WARN: Type inference failed for: r10v20 */
        /* JADX WARN: Type inference failed for: r10v21 */
        /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v10, types: [android.hardware.camera2.params.OutputConfiguration] */
        /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r9v0, types: [i.r$a] */
        public final l3 a(Surface surface, Integer format, h.e1.d outputType, h.e1.c mirrorMode, h.e1.h timestampBase, h.e1.b dynamicRangeProfile, h.e1.f streamUseCase, List<h.e1.e> sensorPixelModes, Size size, boolean surfaceSharing, int surfaceGroupId, String physicalCameraId) {
            ?? D;
            h.e1.d.Companion companion = h.e1.d.INSTANCE;
            if (!fr.t.c(outputType, companion.d()) || Build.VERSION.SDK_INT < 35) {
                if (fr.t.c(outputType, companion.c())) {
                    if (surface == 0) {
                        Objects.toString(companion.c());
                        throw new IllegalStateException("non-null surface!");
                    }
                    try {
                        surface = surfaceGroupId != -1 ? new OutputConfiguration(surfaceGroupId, (Surface) surface) : new OutputConfiguration(surface);
                        D = surface;
                    } catch (Throwable th4) {
                        if (!k.k.f107055a.d()) {
                            return null;
                        }
                        io.sentry.android.core.c2.h("CXCP", "Failed to create an OutputConfiguration for " + surface + '!', th4);
                        return null;
                    }
                } else {
                    if (size == null) {
                        throw new IllegalStateException("Size must defined when creating a deferred OutputConfiguration.");
                    }
                    D = u.d(size, e(outputType));
                }
            } else {
                if (format == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (size == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                D = m0.e(format.intValue(), size);
            }
            ?? r15 = D;
            if (surfaceSharing) {
                c(r15);
            }
            if (physicalCameraId != null) {
                d(r15, physicalCameraId);
            }
            if (mirrorMode != null) {
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 33) {
                    f0.d(r15, mirrorMode.getValue());
                } else {
                    if (!h.e1.c.e(mirrorMode.getValue(), h.e1.c.INSTANCE.a()) && k.k.f107055a.d()) {
                        io.sentry.android.core.c2.g("CXCP", "Cannot set mirrorMode to a non-default value on API " + i15 + ". This may result in unexpected behavior. Requested " + ((Object) h.e1.c.g(mirrorMode.getValue())));
                    }
                }
            }
            if (dynamicRangeProfile != null) {
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 33) {
                    f0.c(r15, dynamicRangeProfile.getValue());
                } else {
                    if (!h.e1.b.e(dynamicRangeProfile.getValue(), h.e1.b.INSTANCE.a()) && k.k.f107055a.d()) {
                        io.sentry.android.core.c2.g("CXCP", "Cannot set dynamicRangeProfile to a non-default value on API " + i16 + ". This may result in unexpected behavior. Requested " + ((Object) h.e1.b.g(dynamicRangeProfile.getValue())));
                    }
                }
            }
            if (streamUseCase != null && Build.VERSION.SDK_INT >= 33) {
                f0.e(r15, streamUseCase.getValue());
            }
            if (!sensorPixelModes.isEmpty()) {
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 31) {
                    Iterator<h.e1.e> it = sensorPixelModes.iterator();
                    while (it.hasNext()) {
                        e0.a(r15, it.next().getValue());
                    }
                } else if (k.k.f107055a.d()) {
                    io.sentry.android.core.c2.g("CXCP", "Cannot add sensorPixelModeUsed value on API " + i17 + ". This may result in unexpected behavior. Requested " + sensorPixelModes);
                }
            }
            return new r(r15, surfaceSharing, Build.VERSION.SDK_INT >= 28 ? w.d(r15) : 1, physicalCameraId, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ r(OutputConfiguration outputConfiguration, boolean z15, int i15, String str, fr.k kVar) {
        this(outputConfiguration, z15, i15, str);
    }

    @Override // h.t1
    public <T> T c0(mr.c<T> type) {
        if (fr.t.c(type, fr.q0.c(OutputConfiguration.class))) {
            return (T) this.output;
        }
        return null;
    }

    public String toString() {
        return this.output.toString();
    }

    @Override // i.l3
    public void u(Surface surface) {
        u.a(this.output, surface);
    }

    private r(OutputConfiguration outputConfiguration, boolean z15, int i15, String str) {
        this.output = outputConfiguration;
        this.surfaceSharing = z15;
        this.maxSharedSurfaceCount = i15;
        this.physicalCameraId = str;
        this.surface = outputConfiguration.getSurface();
    }
}
