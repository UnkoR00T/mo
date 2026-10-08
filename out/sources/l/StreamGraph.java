package l;

import CON.j0;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import h.c0;
import h.c1;
import h.e1;
import h.o1;
import h.p1;
import h.q1;
import h.x0;
import h.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: renamed from: l.x, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\b\b\u0001\u0018\u0000 _2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u00049=51B/\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00172\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017H\u0002¢\u0006\u0004\b!\u0010\u001bJ#\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017H\u0002¢\u0006\u0004\b#\u0010\u001bJ\u001a\u0010%\u001a\u0004\u0018\u00010\u001f2\u0006\u0010$\u001a\u00020\u0018H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u0004\u0018\u00010\u00182\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001f0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR \u0010H\u001a\b\u0012\u0004\u0012\u00020C0\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR&\u0010M\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020C0?8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010A\u001a\u0004\bK\u0010LR&\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020N0?8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010A\u001a\u0004\bP\u0010LR \u0010T\u001a\b\u0012\u0004\u0012\u00020R0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010E\u001a\u0004\b5\u0010GR \u0010W\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010E\u001a\u0004\bV\u0010GR \u0010]\u001a\b\u0012\u0004\u0012\u00020'0X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020I0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010E\u001a\u0004\b^\u0010G¨\u0006`"}, d2 = {"Ll/x;", "Lh/p1;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lh/x;", "cameraMetadata", "Lh/s$b;", "graphConfig", "Ln/n;", "imageSources", "Lnq/a;", "Lh/n;", "cameraControllerProvider", "<init>", "(Lh/x;Lh/s$b;Ln/n;Lnq/a;)V", "Lh/e1$a;", "outputConfig", "Landroid/hardware/camera2/params/OutputConfiguration;", "Z", "(Lh/e1$a;)Landroid/hardware/camera2/params/OutputConfiguration;", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lh/s$b;)I", "", "Lh/c0$a;", "outputs", "a0", "(Ljava/util/List;)Ljava/util/List;", "", "K", "(Lh/x;Lh/s$b;)Z", "Lh/c0;", "unsortedStreams", "b0", "unsortedOutputs", "c0", "config", "r", "(Lh/c0$a;)Lh/c0;", "Lh/q1;", "streamId", "M", "(I)Lh/c0$a;", "", "toString", "()Ljava/lang/String;", "Loq/i0;", "close", "()V", "a", "Lh/x;", "getCameraMetadata", "()Lh/x;", "b", "Lh/s$b;", "getGraphConfig", "()Lh/s$b;", "c", "Ln/n;", "getImageSources", "()Ln/n;", "d", "Lnq/a;", "", "e", "Ljava/util/Map;", "_streamMap", "Ll/x$c;", "f", "Ljava/util/List;", "V", "()Ljava/util/List;", "outputConfigs", "Lh/e1;", "g", "O", "()Ljava/util/Map;", "outputConfigMap", "Ln/m;", "h", "N", "imageSourceMap", "Lh/x0;", "j", "inputs", "k", "G", "streams", "", "l", "Ljava/util/Set;", "getStreamIds", "()Ljava/util/Set;", "streamIds", "m", "n", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StreamGraph implements p1, AutoCloseable {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final iu.c f113882p = iu.b.c(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final iu.c f113883q = iu.b.c(0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final iu.c f113884r = iu.b.c(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final iu.c f113885s = iu.b.c(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final iu.c f113886t = iu.b.c(0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final List<e1.d> f113887v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Comparator<c0> f113888w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final List<o1> f113889x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Comparator<c0> f113890y;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h.x cameraMetadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h.s.b graphConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n.n imageSources;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final nq.a<h.n> cameraControllerProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<c0.a, c0> _streamMap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<c> outputConfigs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<e1, c> outputConfigMap;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map<q1, n.m> imageSourceMap;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<x0> inputs;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final List<c0> streams;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Set<q1> streamIds;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final List<e1> outputs;

    /* JADX INFO: renamed from: l.x$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001e¨\u0006\""}, d2 = {"Ll/x$a;", "", "<init>", "()V", "Lh/q1;", "e", "()I", "Lh/c1;", "d", "Lh/y0;", "c", "Ll/r;", "a", "", "b", "Liu/c;", "streamIds", "Liu/c;", "outputIds", "inputIds", "configIds", "groupIds", "", "Lh/e1$d;", "previewOutputTypes", "Ljava/util/List;", "Ljava/util/Comparator;", "Lh/c0;", "Lkotlin/Comparator;", "previewOutputTypesComparator", "Ljava/util/Comparator;", "Lh/o1;", "previewFormats", "previewFormatComparator", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a() {
            return r.a(StreamGraph.f113885s.d());
        }

        public final int b() {
            return StreamGraph.f113886t.d();
        }

        public final int c() {
            return y0.a(StreamGraph.f113884r.d());
        }

        public final int d() {
            return c1.b(StreamGraph.f113883q.d());
        }

        public final int e() {
            return q1.b(StreamGraph.f113882p.d());
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: l.x$b */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Ll/x$b;", "Lh/x0;", "Lh/y0;", "id", "", "maxImages", "Lh/o1;", "format", "<init>", "(IIILfr/k;)V", "a", "I", "c", "()I", "b", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b implements x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int maxImages;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int format;

        public /* synthetic */ b(int i15, int i16, int i17, fr.k kVar) {
            this(i15, i16, i17);
        }

        @Override // h.x0
        /* JADX INFO: renamed from: a, reason: from getter */
        public int getMaxImages() {
            return this.maxImages;
        }

        @Override // h.x0
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getFormat() {
            return this.format;
        }

        @Override // h.x0
        /* JADX INFO: renamed from: c, reason: from getter */
        public int getId() {
            return this.id;
        }

        private b(int i15, int i16, int i17) {
            this.id = i15;
            this.maxImages = i16;
            this.format = i17;
        }
    }

    /* JADX INFO: renamed from: l.x$c */
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\"\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b.\u00103R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b0\u00104\u001a\u0004\b*\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b,\u0010;R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b(\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b=\u0010C\u001a\u0004\b9\u0010DR \u0010G\u001a\b\u0012\u0004\u0012\u00020F0E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010C\u001a\u0004\b?\u0010DR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020F0\u001a8F¢\u0006\u0006\u001a\u0004\bK\u0010DR\u0011\u0010O\u001a\u00020M8F¢\u0006\u0006\u001a\u0004\b&\u0010NR\u0011\u0010Q\u001a\u00020M8F¢\u0006\u0006\u001a\u0004\bP\u0010N¨\u0006R"}, d2 = {"Ll/x$c;", "", "Ll/r;", "id", "Landroid/util/Size;", "size", "Lh/o1;", "format", "Lh/v;", "camera", "", "groupNumber", "Landroid/hardware/camera2/params/OutputConfiguration;", "externalOutputConfig", "Lh/e1$d;", "deferredOutputType", "Lh/e1$c;", "mirrorMode", "Lh/e1$h;", "timestampBase", "Lh/e1$b;", "dynamicRangeProfile", "Lh/e1$f;", "streamUseCase", "Lh/e1$g;", "streamUseHint", "", "Lh/e1$e;", "sensorPixelModes", "<init>", "(ILandroid/util/Size;ILjava/lang/String;Ljava/lang/Integer;Landroid/hardware/camera2/params/OutputConfiguration;Lh/e1$d;Lh/e1$c;Lh/e1$h;Lh/e1$b;Lh/e1$f;Lh/e1$g;Ljava/util/List;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "a", "I", "getId-hoCEiqs", "()I", "b", "Landroid/util/Size;", "j", "()Landroid/util/Size;", "c", "f", "d", "Ljava/lang/String;", "e", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "Landroid/hardware/camera2/params/OutputConfiguration;", "()Landroid/hardware/camera2/params/OutputConfiguration;", "Lh/e1$d;", "()Lh/e1$d;", "h", "Lh/e1$c;", "()Lh/e1$c;", "i", "Lh/e1$b;", "()Lh/e1$b;", "Lh/e1$f;", "l", "()Lh/e1$f;", "k", "Lh/e1$g;", "m", "()Lh/e1$g;", "Ljava/util/List;", "()Ljava/util/List;", "", "Lh/c0;", "streamBuilder", "Lh/e1$h;", "p", "()Lh/e1$h;", "n", "streams", "", "()Z", "deferrable", "o", "surfaceSharing", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Size size;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int format;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String camera;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Integer groupNumber;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final OutputConfiguration externalOutputConfig;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final e1.d deferredOutputType;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final e1.c mirrorMode;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final e1.b dynamicRangeProfile;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final e1.f streamUseCase;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final e1.g streamUseHint;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final List<e1.e> sensorPixelModes;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final List<c0> streamBuilder;

        public /* synthetic */ c(int i15, Size size, int i16, String str, Integer num, OutputConfiguration outputConfiguration, e1.d dVar, e1.c cVar, e1.h hVar, e1.b bVar, e1.f fVar, e1.g gVar, List list, fr.k kVar) {
            this(i15, size, i16, str, num, outputConfiguration, dVar, cVar, hVar, bVar, fVar, gVar, list);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCamera() {
            return this.camera;
        }

        public final boolean b() {
            return this.deferredOutputType != null;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final e1.d getDeferredOutputType() {
            return this.deferredOutputType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final e1.b getDynamicRangeProfile() {
            return this.dynamicRangeProfile;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final OutputConfiguration getExternalOutputConfig() {
            return this.externalOutputConfig;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getFormat() {
            return this.format;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Integer getGroupNumber() {
            return this.groupNumber;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final e1.c getMirrorMode() {
            return this.mirrorMode;
        }

        public final List<e1.e> i() {
            return this.sensorPixelModes;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        public final List<c0> k() {
            return this.streamBuilder;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final e1.f getStreamUseCase() {
            return this.streamUseCase;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final e1.g getStreamUseHint() {
            return this.streamUseHint;
        }

        public final List<c0> n() {
            return this.streamBuilder;
        }

        public final boolean o() {
            return this.streamBuilder.size() > 1;
        }

        public final e1.h p() {
            return null;
        }

        public String toString() {
            return r.b(this.id);
        }

        private c(int i15, Size size, int i16, String str, Integer num, OutputConfiguration outputConfiguration, e1.d dVar, e1.c cVar, e1.h hVar, e1.b bVar, e1.f fVar, e1.g gVar, List<e1.e> list) {
            this.id = i15;
            this.size = size;
            this.format = i16;
            this.camera = str;
            this.groupNumber = num;
            this.externalOutputConfig = outputConfiguration;
            this.deferredOutputType = dVar;
            this.mirrorMode = cVar;
            this.dynamicRangeProfile = bVar;
            this.streamUseCase = fVar;
            this.streamUseHint = gVar;
            this.sensorPixelModes = list;
            this.streamBuilder = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: l.x$d */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u00101\u001a\u0004\b$\u00102R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u00103\u001a\u0004\b\u001b\u00104R\"\u0010;\u001a\u0002058\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b6\u00108\"\u0004\b9\u0010:R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b#\u0010=¨\u0006>"}, d2 = {"Ll/x$d;", "Lh/e1;", "Lh/c1;", "id", "Landroid/util/Size;", "size", "Lh/o1;", "format", "Lh/v;", "camera", "Lh/e1$c;", "mirrorMode", "Lh/e1$h;", "timestampBase", "Lh/e1$b;", "dynamicRangeProfile", "Lh/e1$f;", "streamUseCase", "Lh/e1$d;", "outputType", "Lh/e1$g;", "streamUseHint", "<init>", "(ILandroid/util/Size;ILjava/lang/String;Lh/e1$c;Lh/e1$h;Lh/e1$b;Lh/e1$f;Lh/e1$d;Lh/e1$g;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "a", "I", "f", "()I", "b", "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", "c", "d", "Ljava/lang/String;", "h", "e", "Lh/e1$c;", "i", "()Lh/e1$c;", "Lh/e1$b;", "k", "()Lh/e1$b;", "g", "Lh/e1$f;", "()Lh/e1$f;", "Lh/e1$d;", "()Lh/e1$d;", "Lh/e1$g;", "()Lh/e1$g;", "Lh/c0;", "j", "Lh/c0;", "()Lh/c0;", "l", "(Lh/c0;)V", "stream", "Lh/e1$h;", "()Lh/e1$h;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements e1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Size size;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int format;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String camera;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final e1.c mirrorMode;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final e1.b dynamicRangeProfile;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final e1.f streamUseCase;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final e1.d outputType;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final e1.g streamUseHint;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public c0 stream;

        public /* synthetic */ d(int i15, Size size, int i16, String str, e1.c cVar, e1.h hVar, e1.b bVar, e1.f fVar, e1.d dVar, e1.g gVar, fr.k kVar) {
            this(i15, size, i16, str, cVar, hVar, bVar, fVar, dVar, gVar);
        }

        @Override // h.e1
        /* JADX INFO: renamed from: a, reason: from getter */
        public e1.g getStreamUseHint() {
            return this.streamUseHint;
        }

        @Override // h.e1
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getFormat() {
            return this.format;
        }

        @Override // h.e1
        public e1.h c() {
            return null;
        }

        @Override // h.e1
        /* JADX INFO: renamed from: d, reason: from getter */
        public e1.d getOutputType() {
            return this.outputType;
        }

        @Override // h.e1
        /* JADX INFO: renamed from: f, reason: from getter */
        public int getId() {
            return this.id;
        }

        @Override // h.e1
        /* JADX INFO: renamed from: g, reason: from getter */
        public e1.f getStreamUseCase() {
            return this.streamUseCase;
        }

        @Override // h.e1
        public Size getSize() {
            return this.size;
        }

        @Override // h.e1
        /* JADX INFO: renamed from: h, reason: from getter */
        public String getCamera() {
            return this.camera;
        }

        @Override // h.e1
        /* JADX INFO: renamed from: i, reason: from getter */
        public e1.c getMirrorMode() {
            return this.mirrorMode;
        }

        @Override // h.e1
        public c0 j() {
            c0 c0Var = this.stream;
            if (c0Var != null) {
                return c0Var;
            }
            return null;
        }

        @Override // h.e1
        /* JADX INFO: renamed from: k, reason: from getter */
        public e1.b getDynamicRangeProfile() {
            return this.dynamicRangeProfile;
        }

        public void l(c0 c0Var) {
            this.stream = c0Var;
        }

        public String toString() {
            return c1.f(getId());
        }

        private d(int i15, Size size, int i16, String str, e1.c cVar, e1.h hVar, e1.b bVar, e1.f fVar, e1.d dVar, e1.g gVar) {
            this.id = i15;
            this.size = size;
            this.format = i16;
            this.camera = str;
            this.mirrorMode = cVar;
            this.dynamicRangeProfile = bVar;
            this.streamUseCase = fVar;
            this.outputType = dVar;
            this.streamUseHint = gVar;
        }
    }

    /* JADX INFO: renamed from: l.x$e */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            Iterator<T> it = ((c0) t15).b().iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Integer numValueOf = Integer.valueOf(pq.v.q0(StreamGraph.f113887v, ((e1) it.next()).getOutputType()));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(pq.v.q0(StreamGraph.f113887v, ((e1) it.next()).getOutputType()));
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            Iterator<T> it4 = ((c0) t16).b().iterator();
            if (!it4.hasNext()) {
                throw new NoSuchElementException();
            }
            Integer numValueOf3 = Integer.valueOf(pq.v.q0(StreamGraph.f113887v, ((e1) it4.next()).getOutputType()));
            while (it4.hasNext()) {
                Integer numValueOf4 = Integer.valueOf(pq.v.q0(StreamGraph.f113887v, ((e1) it4.next()).getOutputType()));
                if (numValueOf3.compareTo(numValueOf4) < 0) {
                    numValueOf3 = numValueOf4;
                }
            }
            return sq.a.e(numValueOf, numValueOf3);
        }
    }

    /* JADX INFO: renamed from: l.x$f */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            Iterator<T> it = ((c0) t15).b().iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Integer numValueOf = Integer.valueOf(StreamGraph.f113889x.indexOf(o1.c(((e1) it.next()).getFormat())));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(StreamGraph.f113889x.indexOf(o1.c(((e1) it.next()).getFormat())));
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            Iterator<T> it4 = ((c0) t16).b().iterator();
            if (!it4.hasNext()) {
                throw new NoSuchElementException();
            }
            Integer numValueOf3 = Integer.valueOf(StreamGraph.f113889x.indexOf(o1.c(((e1) it4.next()).getFormat())));
            while (it4.hasNext()) {
                Integer numValueOf4 = Integer.valueOf(StreamGraph.f113889x.indexOf(o1.c(((e1) it4.next()).getFormat())));
                if (numValueOf3.compareTo(numValueOf4) < 0) {
                    numValueOf3 = numValueOf4;
                }
            }
            return sq.a.e(numValueOf, numValueOf3);
        }
    }

    /* JADX INFO: renamed from: l.x$g */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g<T> implements Comparator {
        public g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            Iterator<T> it = ((c) t15).n().iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Integer numValueOf = Integer.valueOf(StreamGraph.this.G().indexOf((c0) it.next()));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(StreamGraph.this.G().indexOf((c0) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            Iterator<T> it4 = ((c) t16).n().iterator();
            if (!it4.hasNext()) {
                throw new NoSuchElementException();
            }
            Integer numValueOf3 = Integer.valueOf(StreamGraph.this.G().indexOf((c0) it4.next()));
            while (it4.hasNext()) {
                Integer numValueOf4 = Integer.valueOf(StreamGraph.this.G().indexOf((c0) it4.next()));
                if (numValueOf3.compareTo(numValueOf4) > 0) {
                    numValueOf3 = numValueOf4;
                }
            }
            return sq.a.e(numValueOf, numValueOf3);
        }
    }

    static {
        e1.d.Companion companion = e1.d.INSTANCE;
        f113887v = pq.v.q(companion.f(), companion.e());
        f113888w = new e();
        o1.Companion companion2 = o1.INSTANCE;
        f113889x = pq.v.q(o1.c(companion2.b()), o1.c(companion2.a()));
        f113890y = new f();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00eb  */
    public StreamGraph(h.x xVar, h.s.b bVar, n.n nVar, nq.a<h.n> aVar) {
        fr.k kVar;
        List<x0> listN;
        e1.d outputType;
        this.cameraMetadata = xVar;
        this.graphConfig = bVar;
        this.imageSources = nVar;
        this.cameraControllerProvider = aVar;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        boolean zK = K(xVar, bVar);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (List<c0.a> list : bVar.h()) {
            if (list.isEmpty()) {
                throw new IllegalStateException("Check failed.");
            }
            int iL = L(this.graphConfig);
            for (c0.a aVar2 : list) {
                if (linkedHashMap3.containsKey(aVar2)) {
                    throw new IllegalStateException("Check failed.");
                }
                linkedHashMap3.put(aVar2, Integer.valueOf(iL));
            }
        }
        Iterator<c0.a> it = this.graphConfig.r().iterator();
        while (true) {
            kVar = null;
            if (!it.hasNext()) {
                break;
            }
            c0.a next = it.next();
            for (e1.a aVar3 : next.b()) {
                if (!linkedHashMap.containsKey(aVar3)) {
                    int iA = INSTANCE.a();
                    Size size = aVar3.getSize();
                    int format = aVar3.getFormat();
                    String camera = aVar3.getCamera();
                    String camera2 = camera == null ? this.graphConfig.getCamera() : camera;
                    Integer num = (Integer) linkedHashMap3.get(next);
                    if (zK) {
                        e1.a.c cVar = aVar3 instanceof e1.a.c ? (e1.a.c) aVar3 : null;
                        if (cVar != null) {
                            outputType = cVar.getOutputType();
                        } else {
                            outputType = null;
                        }
                    } else {
                        outputType = null;
                    }
                    e1.c mirrorMode = aVar3.getMirrorMode();
                    aVar3.i();
                    c cVar2 = new c(iA, size, format, camera2, num, Z(aVar3), outputType, mirrorMode, null, aVar3.getDynamicRangeProfile(), aVar3.getStreamUseCase(), aVar3.getStreamUseHint(), aVar3.e(), null);
                    linkedHashMap.put(aVar3, cVar2);
                    arrayList.add(cVar2);
                }
            }
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        int size2 = this.graphConfig.r().size();
        for (int i15 = 0; i15 < size2; i15++) {
            c0.a aVar4 = this.graphConfig.r().get(i15);
            List<e1.a> listB = aVar4.b();
            ArrayList arrayList3 = new ArrayList(pq.v.y(listB, 10));
            Iterator<T> it4 = listB.iterator();
            while (it4.hasNext()) {
                c cVar3 = (c) linkedHashMap.get((e1.a) it4.next());
                int iD = INSTANCE.d();
                Size size3 = cVar3.getSize();
                int format2 = cVar3.getFormat();
                String camera3 = cVar3.getCamera();
                e1.c mirrorMode2 = cVar3.getMirrorMode();
                cVar3.p();
                d dVar = new d(iD, size3, format2, camera3, mirrorMode2, null, cVar3.getDynamicRangeProfile(), cVar3.getStreamUseCase(), cVar3.getDeferredOutputType(), cVar3.getStreamUseHint(), null);
                linkedHashMap4.put(dVar, cVar3);
                arrayList3.add(dVar);
            }
            c0 c0Var = new c0(INSTANCE.e(), arrayList3, null);
            linkedHashMap2.put(aVar4, c0Var);
            arrayList2.add(c0Var);
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).l(c0Var);
            }
            Iterator<e1.a> it6 = aVar4.b().iterator();
            while (it6.hasNext()) {
                ((c) linkedHashMap.get(it6.next())).k().add(c0Var);
            }
        }
        List<x0.a> listK = this.graphConfig.k();
        if (listK != null) {
            List<x0.a> list2 = listK;
            listN = new ArrayList<>(pq.v.y(list2, 10));
            for (x0.a aVar5 : list2) {
                listN.add(new b(INSTANCE.c(), aVar5.getMaxImages(), aVar5.getStreamFormat(), kVar));
            }
        } else {
            listN = pq.v.n();
        }
        this.inputs = listN;
        this.streams = c0(b0(arrayList2));
        List<c0> listG = G();
        ArrayList arrayList4 = new ArrayList(pq.v.y(listG, 10));
        Iterator<T> it7 = listG.iterator();
        while (it7.hasNext()) {
            arrayList4.add(q1.a(((c0) it7.next()).getId()));
        }
        this.streamIds = pq.v.k1(arrayList4);
        this._streamMap = linkedHashMap2;
        this.outputConfigs = pq.v.U0(arrayList, new g());
        this.outputConfigMap = linkedHashMap4;
        List<c0> listG2 = G();
        ArrayList arrayList5 = new ArrayList();
        Iterator<T> it8 = listG2.iterator();
        while (it8.hasNext()) {
            pq.v.D(arrayList5, ((c0) it8.next()).b());
        }
        this.outputs = arrayList5;
        Map mapC = v0.c();
        Iterator<c0.a> it9 = this.graphConfig.r().iterator();
        while (it9.hasNext()) {
            it9.next().a();
        }
        this.imageSourceMap = v0.b(mapC);
    }

    private final boolean K(h.x cameraMetadata, h.s.b graphConfig) {
        int i15 = Build.VERSION.SDK_INT;
        if (!h.s.e.f(graphConfig.getSessionMode(), h.s.e.INSTANCE.d())) {
            return false;
        }
        h.x.Companion companion = h.x.INSTANCE;
        if (companion.l(cameraMetadata) || companion.m(cameraMetadata)) {
            return false;
        }
        return i15 < 28 || !companion.k(cameraMetadata);
    }

    private final int L(h.s.b graphConfig) {
        List<Integer> listA0 = a0(graphConfig.r());
        int iB = INSTANCE.b();
        while (listA0.contains(Integer.valueOf(iB))) {
            iB = INSTANCE.b();
        }
        return iB;
    }

    private final OutputConfiguration Z(e1.a outputConfig) {
        if (Build.VERSION.SDK_INT >= 33) {
            e1.a.b bVar = outputConfig instanceof e1.a.b ? (e1.a.b) outputConfig : null;
            if (bVar != null) {
                return bVar.getOutput();
            }
        }
        return null;
    }

    private final List<Integer> a0(List<c0.a> outputs) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = outputs.iterator();
        while (it.hasNext()) {
            pq.v.D(arrayList, ((c0.a) it.next()).b());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof e1.a.b) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            int iC = i.t.c(((e1.a.b) it4.next()).getOutput());
            if (!arrayList3.contains(Integer.valueOf(iC))) {
                arrayList3.add(Integer.valueOf(iC));
            }
        }
        return arrayList3;
    }

    private final List<c0> b0(List<c0> unsortedStreams) {
        boolean z15;
        boolean z16;
        e1.f streamUseCase;
        List<c0> list = unsortedStreams;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z17 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            List<e1> listB = ((c0) next).b();
            if ((listB instanceof Collection) && listB.isEmpty()) {
                z17 = false;
                break;
            }
            Iterator<T> it4 = listB.iterator();
            do {
                if (!it4.hasNext()) {
                    z17 = false;
                    break;
                }
                streamUseCase = ((e1) it4.next()).getStreamUseCase();
            } while (!(streamUseCase == null ? false : e1.f.g(streamUseCase.getValue(), e1.f.INSTANCE.b())));
            if (z17) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        oq.r rVar = new oq.r(arrayList, arrayList2);
        List list2 = (List) rVar.a();
        List list3 = (List) rVar.b();
        List list4 = list2;
        if (!list4.isEmpty()) {
            return pq.v.L0(list4, list3);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : list) {
            List<e1> listB2 = ((c0) obj).b();
            if (!(listB2 instanceof Collection) || !listB2.isEmpty()) {
                Iterator<T> it5 = listB2.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        z16 = false;
                        break;
                    }
                    if (pq.v.c0(f113887v, ((e1) it5.next()).getOutputType())) {
                        z16 = true;
                        break;
                    }
                }
            } else {
                z16 = false;
                break;
            }
            if (z16) {
                arrayList3.add(obj);
            } else {
                arrayList4.add(obj);
            }
        }
        oq.r rVar2 = new oq.r(arrayList3, arrayList4);
        List list5 = (List) rVar2.a();
        List list6 = (List) rVar2.b();
        if (!list5.isEmpty()) {
            return pq.v.L0(pq.v.U0(list5, f113888w), list6);
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : list) {
            List<e1> listB3 = ((c0) obj2).b();
            if (!(listB3 instanceof Collection) || !listB3.isEmpty()) {
                Iterator<T> it6 = listB3.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        z15 = false;
                        break;
                    }
                    if (f113889x.contains(o1.c(((e1) it6.next()).getFormat()))) {
                        z15 = true;
                        break;
                    }
                }
            } else {
                z15 = false;
                break;
            }
            if (z15) {
                arrayList5.add(obj2);
            } else {
                arrayList6.add(obj2);
            }
        }
        oq.r rVar3 = new oq.r(arrayList5, arrayList6);
        List list7 = (List) rVar3.a();
        return !list7.isEmpty() ? pq.v.L0(pq.v.U0(list7, f113890y), (List) rVar3.b()) : unsortedStreams;
    }

    private final List<c0> c0(List<c0> unsortedOutputs) {
        boolean z15;
        e1.f streamUseCase;
        List<c0> list = unsortedOutputs;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z16 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            List<e1> listB = ((c0) next).b();
            if ((listB instanceof Collection) && listB.isEmpty()) {
                z16 = false;
                break;
            }
            Iterator<T> it4 = listB.iterator();
            do {
                if (!it4.hasNext()) {
                    z16 = false;
                    break;
                }
                streamUseCase = ((e1) it4.next()).getStreamUseCase();
            } while (!(streamUseCase == null ? false : e1.f.g(streamUseCase.getValue(), e1.f.INSTANCE.c())));
            if (z16) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        oq.r rVar = new oq.r(arrayList, arrayList2);
        List list2 = (List) rVar.a();
        List list3 = (List) rVar.b();
        if (!list2.isEmpty()) {
            return pq.v.L0(list3, list2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : list) {
            List<e1> listB2 = ((c0) obj).b();
            if (!(listB2 instanceof Collection) || !listB2.isEmpty()) {
                Iterator<T> it5 = listB2.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        z15 = false;
                        break;
                    }
                    e1.g streamUseHint = ((e1) it5.next()).getStreamUseHint();
                    if (streamUseHint == null ? false : e1.g.f(streamUseHint.getValue(), e1.g.INSTANCE.b())) {
                        z15 = true;
                        break;
                    }
                }
            } else {
                z15 = false;
                break;
            }
            if (z15) {
                arrayList3.add(obj);
            } else {
                arrayList4.add(obj);
            }
        }
        oq.r rVar2 = new oq.r(arrayList3, arrayList4);
        List list4 = (List) rVar2.a();
        return !list4.isEmpty() ? pq.v.L0((List) rVar2.b(), list4) : unsortedOutputs;
    }

    @Override // h.p1
    public List<c0> G() {
        return this.streams;
    }

    public final c0.a M(int streamId) {
        Object next;
        Iterator<T> it = this._streamMap.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!q1.d(((c0) ((Map.Entry) next).getValue()).getId(), streamId));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (c0.a) entry.getKey();
        }
        return null;
    }

    public final Map<q1, n.m> N() {
        return this.imageSourceMap;
    }

    public final Map<e1, c> O() {
        return this.outputConfigMap;
    }

    public final List<c> V() {
        return this.outputConfigs;
    }

    @Override // h.p1
    public List<x0> b() {
        return this.inputs;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        Iterator<n.m> it = this.imageSourceMap.values().iterator();
        while (it.hasNext()) {
            j0.a(it.next());
        }
    }

    @Override // h.p1
    public List<e1> m() {
        return this.outputs;
    }

    @Override // h.p1
    public c0 r(c0.a config) {
        return this._streamMap.get(config);
    }

    public String toString() {
        return "StreamGraph(" + this._streamMap + ')';
    }
}
