package h;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\b-)\u001d\u0015\u0012%\n\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u0004\u0018\u00010$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u0004\u0018\u00010(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010/\u001a\u0004\u0018\u00010,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00060À\u0006\u0003"}, d2 = {"Lh/e1;", "", "", "e", "()Z", "Lh/c0;", "j", "()Lh/c0;", "stream", "Lh/c1;", "f", "()I", "id", "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", "size", "Lh/o1;", "b", "format", "Lh/v;", "h", "()Ljava/lang/String;", "camera", "Lh/e1$c;", "i", "()Lh/e1$c;", "mirrorMode", "Lh/e1$h;", "c", "()Lh/e1$h;", "timestampBase", "Lh/e1$b;", "k", "()Lh/e1$b;", "dynamicRangeProfile", "Lh/e1$f;", "g", "()Lh/e1$f;", "streamUseCase", "Lh/e1$d;", "d", "()Lh/e1$d;", "outputType", "Lh/e1$g;", "a", "()Lh/e1$g;", "streamUseHint", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e1 {

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 22\u00020\u0001:\u0004\u001a# \u001eBc\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001e\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001c\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b&\u00100R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103\u0082\u0001\u0003456¨\u00067"}, d2 = {"Lh/e1$a;", "", "Landroid/util/Size;", "size", "Lh/o1;", "format", "Lh/v;", "camera", "Lh/e1$c;", "mirrorMode", "Lh/e1$h;", "timestampBase", "Lh/e1$b;", "dynamicRangeProfile", "Lh/e1$f;", "streamUseCase", "Lh/e1$g;", "streamUseHint", "", "Lh/e1$e;", "sensorPixelModes", "<init>", "(Landroid/util/Size;ILjava/lang/String;Lh/e1$c;Lh/e1$h;Lh/e1$b;Lh/e1$f;Lh/e1$g;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "a", "Landroid/util/Size;", "f", "()Landroid/util/Size;", "b", "I", "c", "()I", "Ljava/lang/String;", "d", "Lh/e1$c;", "()Lh/e1$c;", "e", "Lh/e1$b;", "()Lh/e1$b;", "Lh/e1$f;", "g", "()Lh/e1$f;", "Lh/e1$g;", "h", "()Lh/e1$g;", "Ljava/util/List;", "()Ljava/util/List;", "Lh/e1$h;", "i", "()Lh/e1$h;", "Lh/e1$a$b;", "Lh/e1$a$c;", "Lh/e1$a$d;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Size size;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int format;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String camera;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final c mirrorMode;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final b dynamicRangeProfile;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final f streamUseCase;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final g streamUseHint;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final List<e> sensorPixelModes;

        /* JADX INFO: renamed from: h.e1$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u007f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lh/e1$a$a;", "", "<init>", "()V", "Lh/e1$d;", "", "c", "(Lh/e1$d;)Z", "Landroid/util/Size;", "size", "Lh/o1;", "format", "Lh/v;", "camera", "outputType", "Lh/e1$c;", "mirrorMode", "Lh/e1$h;", "timestampBase", "Lh/e1$b;", "dynamicRangeProfile", "Lh/e1$f;", "streamUseCase", "Lh/e1$g;", "streamUseHint", "", "Lh/e1$e;", "sensorPixelModes", "Lh/e1$a;", "a", "(Landroid/util/Size;ILjava/lang/String;Lh/e1$d;Lh/e1$c;Lh/e1$h;Lh/e1$b;Lh/e1$f;Lh/e1$g;Ljava/util/List;)Lh/e1$a;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ a b(Companion companion, Size size, int i15, String str, d dVar, c cVar, h hVar, b bVar, f fVar, g gVar, List list, int i16, Object obj) {
                if ((i16 & 4) != 0) {
                    str = null;
                }
                if ((i16 & 8) != 0) {
                    dVar = d.INSTANCE.c();
                }
                if ((i16 & 16) != 0) {
                    cVar = null;
                }
                if ((i16 & 32) != 0) {
                    hVar = null;
                }
                if ((i16 & 64) != 0) {
                    bVar = null;
                }
                if ((i16 & 128) != 0) {
                    fVar = null;
                }
                if ((i16 & 256) != 0) {
                    gVar = null;
                }
                if ((i16 & 512) != 0) {
                    list = pq.v.n();
                }
                return companion.a(size, i15, str, dVar, cVar, hVar, bVar, fVar, gVar, list);
            }

            private final boolean c(d dVar) {
                d.Companion companion = d.INSTANCE;
                if (fr.t.c(dVar, companion.e()) || fr.t.c(dVar, companion.f())) {
                    return true;
                }
                return (fr.t.c(dVar, companion.a()) || fr.t.c(dVar, companion.b())) && Build.VERSION.SDK_INT >= 35;
            }

            public final a a(Size size, int format, String camera, d outputType, c mirrorMode, h timestampBase, b dynamicRangeProfile, f streamUseCase, g streamUseHint, List<e> sensorPixelModes) {
                if (c(outputType)) {
                    return new c(size, format, camera, outputType, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, sensorPixelModes, null);
                }
                if (fr.t.c(outputType, d.INSTANCE.c())) {
                    return new d(size, format, camera, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, sensorPixelModes, null);
                }
                throw new IllegalStateException("Check failed.");
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Lh/e1$a$b;", "Lh/e1$a;", "Landroid/hardware/camera2/params/OutputConfiguration;", "j", "Landroid/hardware/camera2/params/OutputConfiguration;", "()Landroid/hardware/camera2/params/OutputConfiguration;", "output", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            private final OutputConfiguration output;

            /* JADX INFO: renamed from: j, reason: from getter */
            public final OutputConfiguration getOutput() {
                return this.output;
            }
        }

        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lh/e1$a$c;", "Lh/e1$a;", "Landroid/util/Size;", "size", "Lh/o1;", "format", "Lh/v;", "camera", "Lh/e1$d;", "outputType", "Lh/e1$c;", "mirrorMode", "Lh/e1$h;", "timestampBase", "Lh/e1$b;", "dynamicRangeProfile", "Lh/e1$f;", "streamUseCase", "Lh/e1$g;", "streamUseHint", "", "Lh/e1$e;", "sensorPixelModes", "<init>", "(Landroid/util/Size;ILjava/lang/String;Lh/e1$d;Lh/e1$c;Lh/e1$h;Lh/e1$b;Lh/e1$f;Lh/e1$g;Ljava/util/List;Lfr/k;)V", "j", "Lh/e1$d;", "()Lh/e1$d;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            private final d outputType;

            public /* synthetic */ c(Size size, int i15, String str, d dVar, c cVar, h hVar, b bVar, f fVar, g gVar, List list, fr.k kVar) {
                this(size, i15, str, dVar, cVar, hVar, bVar, fVar, gVar, list);
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final d getOutputType() {
                return this.outputType;
            }

            private c(Size size, int i15, String str, d dVar, c cVar, h hVar, b bVar, f fVar, g gVar, List<e> list) {
                super(size, i15, str, cVar, hVar, bVar, fVar, gVar, list, null);
                this.outputType = dVar;
            }
        }

        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lh/e1$a$d;", "Lh/e1$a;", "Landroid/util/Size;", "size", "Lh/o1;", "format", "Lh/v;", "camera", "Lh/e1$c;", "mirrorMode", "Lh/e1$h;", "timestampBase", "Lh/e1$b;", "dynamicRangeProfile", "Lh/e1$f;", "streamUseCase", "Lh/e1$g;", "streamUseHint", "", "Lh/e1$e;", "sensorPixelModes", "<init>", "(Landroid/util/Size;ILjava/lang/String;Lh/e1$c;Lh/e1$h;Lh/e1$b;Lh/e1$f;Lh/e1$g;Ljava/util/List;Lfr/k;)V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d extends a {
            public /* synthetic */ d(Size size, int i15, String str, c cVar, h hVar, b bVar, f fVar, g gVar, List list, fr.k kVar) {
                this(size, i15, str, cVar, hVar, bVar, fVar, gVar, list);
            }

            private d(Size size, int i15, String str, c cVar, h hVar, b bVar, f fVar, g gVar, List<e> list) {
                super(size, i15, str, cVar, hVar, bVar, fVar, gVar, list, null);
            }
        }

        public /* synthetic */ a(Size size, int i15, String str, c cVar, h hVar, b bVar, f fVar, g gVar, List list, fr.k kVar) {
            this(size, i15, str, cVar, hVar, bVar, fVar, gVar, list);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCamera() {
            return this.camera;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getDynamicRangeProfile() {
            return this.dynamicRangeProfile;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getFormat() {
            return this.format;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final c getMirrorMode() {
            return this.mirrorMode;
        }

        public final List<e> e() {
            return this.sensorPixelModes;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final f getStreamUseCase() {
            return this.streamUseCase;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final g getStreamUseHint() {
            return this.streamUseHint;
        }

        public final h i() {
            return null;
        }

        public String toString() {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Config(size=");
            sb5.append(this.size);
            sb5.append(", format=");
            sb5.append((Object) o1.i(this.format));
            sb5.append(", camera=");
            String str = this.camera;
            sb5.append((Object) (str == null ? "null" : v.f(str)));
            sb5.append(", mirrorMode=");
            sb5.append(this.mirrorMode);
            sb5.append(", timestampBase=");
            sb5.append((Object) null);
            sb5.append(", dynamicRangeProfile=");
            sb5.append(this.dynamicRangeProfile);
            sb5.append(", streamUseCase=");
            sb5.append(this.streamUseCase);
            sb5.append(", streamUseHint=");
            sb5.append(this.streamUseHint);
            sb5.append(", sensorPixelModes=");
            sb5.append(this.sensorPixelModes);
            sb5.append(')');
            return sb5.toString();
        }

        private a(Size size, int i15, String str, c cVar, h hVar, b bVar, f fVar, g gVar, List<e> list) {
            this.size = size;
            this.format = i15;
            this.camera = str;
            this.mirrorMode = cVar;
            this.dynamicRangeProfile = bVar;
            this.streamUseCase = fVar;
            this.streamUseHint = gVar;
            this.sensorPixelModes = list;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Lh/e1$b;", "", "", "value", "c", "(J)J", "", "g", "(J)Ljava/lang/String;", "", "f", "(J)I", "other", "", "d", "(JLjava/lang/Object;)Z", "a", "J", "getValue", "()J", "b", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f78877c = c(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f78878d = c(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f78879e = c(4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f78880f = c(8);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f78881g = c(16);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f78882h = c(32);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f78883i = c(64);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f78884j = c(128);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f78885k = c(256);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f78886l = c(512);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final long f78887m = c(1024);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final long f78888n = c(2048);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final long f78889o = c(4096);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long value;

        /* JADX INFO: renamed from: h.e1$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh/e1$b$a;", "", "<init>", "()V", "Lh/e1$b;", "STANDARD", "J", "a", "()J", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final long a() {
                return b.f78877c;
            }

            private Companion() {
            }
        }

        private /* synthetic */ b(long j15) {
            this.value = j15;
        }

        public static final /* synthetic */ b b(long j15) {
            return new b(j15);
        }

        public static long c(long j15) {
            return j15;
        }

        public static boolean d(long j15, Object obj) {
            return (obj instanceof b) && j15 == ((b) obj).getValue();
        }

        public static final boolean e(long j15, long j16) {
            return j15 == j16;
        }

        public static int f(long j15) {
            return Long.hashCode(j15);
        }

        public static String g(long j15) {
            return "DynamicRangeProfile(value=" + j15 + ')';
        }

        public boolean equals(Object obj) {
            return d(this.value, obj);
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final /* synthetic */ long getValue() {
            return this.value;
        }

        public int hashCode() {
            return f(this.value);
        }

        public String toString() {
            return g(this.value);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lh/e1$c;", "", "", "value", "c", "(I)I", "", "g", "(I)Ljava/lang/String;", "f", "other", "", "d", "(ILjava/lang/Object;)Z", "a", "I", "getValue", "()I", "b", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f78892c = c(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f78893d = c(1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f78894e = c(2);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f78895f = c(3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: h.e1$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh/e1$c$a;", "", "<init>", "()V", "Lh/e1$c;", "MIRROR_MODE_AUTO", "I", "a", "()I", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final int a() {
                return c.f78892c;
            }

            private Companion() {
            }
        }

        private /* synthetic */ c(int i15) {
            this.value = i15;
        }

        public static final /* synthetic */ c b(int i15) {
            return new c(i15);
        }

        public static int c(int i15) {
            return i15;
        }

        public static boolean d(int i15, Object obj) {
            return (obj instanceof c) && i15 == ((c) obj).getValue();
        }

        public static final boolean e(int i15, int i16) {
            return i15 == i16;
        }

        public static int f(int i15) {
            return Integer.hashCode(i15);
        }

        public static String g(int i15) {
            return "MirrorMode(value=" + i15 + ')';
        }

        public boolean equals(Object obj) {
            return d(this.value, obj);
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public int hashCode() {
            return f(this.value);
        }

        public String toString() {
            return g(this.value);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lh/e1$d;", "", "<init>", "()V", "a", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final d f78898b = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final d f78899c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final d f78900d = new d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final d f78901e = new d();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final d f78902f = new d();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final d f78903g = new d();

        /* JADX INFO: renamed from: h.e1$d$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lh/e1$d$a;", "", "<init>", "()V", "Lh/e1$d;", "SURFACE", "Lh/e1$d;", "c", "()Lh/e1$d;", "SURFACE_VIEW", "f", "SURFACE_TEXTURE", "e", "SURFACE_DEFERRED_FOR_QUERY_ONLY", "d", "MEDIA_CODEC", "a", "MEDIA_RECORDER", "b", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final d a() {
                return d.f78902f;
            }

            public final d b() {
                return d.f78903g;
            }

            public final d c() {
                return d.f78898b;
            }

            public final d d() {
                return d.f78901e;
            }

            public final d e() {
                return d.f78900d;
            }

            public final d f() {
                return d.f78899c;
            }

            private Companion() {
            }
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \f2\u00020\u0001:\u0001\u0004B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Lh/e1$e;", "", "", "value", "a", "(I)I", "", "d", "(I)Ljava/lang/String;", "c", "other", "", "b", "(ILjava/lang/Object;)Z", "I", "getValue", "()I", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f78905c = a(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f78906d = a(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        public static int a(int i15) {
            return i15;
        }

        public static boolean b(int i15, Object obj) {
            return (obj instanceof e) && i15 == ((e) obj).getValue();
        }

        public static int c(int i15) {
            return Integer.hashCode(i15);
        }

        public static String d(int i15) {
            return "SensorPixelMode(value=" + i15 + ')';
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public boolean equals(Object obj) {
            return b(this.value, obj);
        }

        public int hashCode() {
            return c(this.value);
        }

        public String toString() {
            return d(this.value);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Lh/e1$f;", "", "", "value", "e", "(J)J", "", "i", "(J)Ljava/lang/String;", "", "h", "(J)I", "other", "", "f", "(JLjava/lang/Object;)Z", "a", "J", "getValue", "()J", "b", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f78909c = e(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f78910d = e(1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f78911e = e(2);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f78912f = e(3);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f78913g = e(4);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f78914h = e(5);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f78915i = e(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long value;

        /* JADX INFO: renamed from: h.e1$f$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lh/e1$f$a;", "", "<init>", "()V", "Lh/e1$f;", "DEFAULT", "J", "a", "()J", "PREVIEW", "b", "VIDEO_RECORD", "c", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final long a() {
                return f.f78909c;
            }

            public final long b() {
                return f.f78910d;
            }

            public final long c() {
                return f.f78912f;
            }

            private Companion() {
            }
        }

        private /* synthetic */ f(long j15) {
            this.value = j15;
        }

        public static final /* synthetic */ f d(long j15) {
            return new f(j15);
        }

        public static long e(long j15) {
            return j15;
        }

        public static boolean f(long j15, Object obj) {
            return (obj instanceof f) && j15 == ((f) obj).getValue();
        }

        public static final boolean g(long j15, long j16) {
            return j15 == j16;
        }

        public static int h(long j15) {
            return Long.hashCode(j15);
        }

        public static String i(long j15) {
            return "StreamUseCase(value=" + j15 + ')';
        }

        public boolean equals(Object obj) {
            return f(this.value, obj);
        }

        public int hashCode() {
            return h(this.value);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final /* synthetic */ long getValue() {
            return this.value;
        }

        public String toString() {
            return i(this.value);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Lh/e1$g;", "", "", "value", "d", "(J)J", "", "h", "(J)Ljava/lang/String;", "", "g", "(J)I", "other", "", "e", "(JLjava/lang/Object;)Z", "a", "J", "getValue", "()J", "b", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f78918c = d(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f78919d = d(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long value;

        /* JADX INFO: renamed from: h.e1$g$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lh/e1$g$a;", "", "<init>", "()V", "Lh/e1$g;", "DEFAULT", "J", "a", "()J", "VIDEO_RECORD", "b", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final long a() {
                return g.f78918c;
            }

            public final long b() {
                return g.f78919d;
            }

            private Companion() {
            }
        }

        private /* synthetic */ g(long j15) {
            this.value = j15;
        }

        public static final /* synthetic */ g c(long j15) {
            return new g(j15);
        }

        public static long d(long j15) {
            return j15;
        }

        public static boolean e(long j15, Object obj) {
            return (obj instanceof g) && j15 == ((g) obj).getValue();
        }

        public static final boolean f(long j15, long j16) {
            return j15 == j16;
        }

        public static int g(long j15) {
            return Long.hashCode(j15);
        }

        public static String h(long j15) {
            return "StreamUseHint(value=" + j15 + ')';
        }

        public boolean equals(Object obj) {
            return e(this.value, obj);
        }

        public int hashCode() {
            return g(this.value);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final /* synthetic */ long getValue() {
            return this.value;
        }

        public String toString() {
            return h(this.value);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0007"}, d2 = {"Lh/e1$h;", "", "", "value", "b", "(I)I", "a", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f78922b = b(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f78923c = b(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f78924d = b(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f78925e = b(3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f78926f = b(4);

        /* JADX INFO: renamed from: h.e1$h$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh/e1$h$a;", "", "<init>", "()V", "Lh/e1$h;", "TIMESTAMP_BASE_REALTIME", "I", "a", "()I", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final int a() {
                return h.f78925e;
            }

            private Companion() {
            }
        }

        public static int b(int i15) {
            return i15;
        }
    }

    /* JADX INFO: renamed from: a */
    g getStreamUseHint();

    /* JADX INFO: renamed from: b */
    int getFormat();

    h c();

    /* JADX INFO: renamed from: d */
    d getOutputType();

    default boolean e() {
        if (getStreamUseCase() == null) {
            return true;
        }
        f fVarG = getStreamUseCase();
        f.Companion companion = f.INSTANCE;
        if (fVarG == null ? false : f.g(fVarG.getValue(), companion.a())) {
            return true;
        }
        f fVarG2 = getStreamUseCase();
        if (fVarG2 == null ? false : f.g(fVarG2.getValue(), companion.b())) {
            return true;
        }
        f fVarG3 = getStreamUseCase();
        if ((fVarG3 == null ? false : f.g(fVarG3.getValue(), companion.c())) || getStreamUseHint() == null) {
            return true;
        }
        g gVarA = getStreamUseHint();
        g.Companion companion2 = g.INSTANCE;
        if (gVarA == null ? false : g.f(gVarA.getValue(), companion2.a())) {
            return true;
        }
        g gVarA2 = getStreamUseHint();
        return gVarA2 == null ? false : g.f(gVarA2.getValue(), companion2.b());
    }

    /* JADX INFO: renamed from: f */
    int getId();

    /* JADX INFO: renamed from: g */
    f getStreamUseCase();

    Size getSize();

    /* JADX INFO: renamed from: h */
    String getCamera();

    /* JADX INFO: renamed from: i */
    c getMirrorMode();

    c0 j();

    /* JADX INFO: renamed from: k */
    b getDynamicRangeProfile();
}
