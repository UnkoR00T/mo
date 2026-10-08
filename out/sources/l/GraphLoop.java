package l;

import h.g1;
import h.l1;
import io.sentry.android.core.c2;
import java.io.Closeable;
import java.util.List;
import java.util.Map;
import ju.CoroutineName;
import ju.l0;
import ju.p0;
import ju.q0;
import ju.r0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: renamed from: l.j, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b,\b\u0000\u0018\u0000 \u009a\u00012\u00020\u0001:\u0002:MBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00192\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010!\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J-\u0010$\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J/\u0010'\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0004\b'\u0010(J-\u0010*\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J-\u0010-\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J.\u00100\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020/H\u0082@¢\u0006\u0004\b0\u00101J%\u00102\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b2\u00103J%\u00104\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b4\u00103J\u001e\u00105\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0082@¢\u0006\u0004\b5\u0010\u0018J\u000f\u00106\u001a\u00020\u001fH\u0002¢\u0006\u0004\b6\u00107J\u001d\u0010:\u001a\u00020\u00162\f\u00109\u001a\b\u0012\u0004\u0012\u0002080\bH\u0002¢\u0006\u0004\b:\u0010;J\u001d\u0010=\u001a\u00020\u00162\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00140\bH\u0002¢\u0006\u0004\b=\u0010;J;\u0010@\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u001f2\f\u00109\u001a\b\u0012\u0004\u0012\u0002080\b2\u0014\b\u0002\u0010?\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b@\u0010AJ\u001b\u0010B\u001a\u00020\u001f2\f\u00109\u001a\b\u0012\u0004\u0012\u0002080\b¢\u0006\u0004\bB\u0010CJ!\u0010E\u001a\u00020\u001f2\u0012\u0010D\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0016H\u0016¢\u0006\u0004\bI\u0010HJ\u000f\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR \u0010\u0006\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010OR \u0010\u0007\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010OR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010RR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010UR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00140X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010a\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010h\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\"\u0010j\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bi\u0010OR\"\u0010l\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bk\u0010OR\u001c\u0010n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bm\u0010RR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010t\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010gR\"\u0010v\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010OR\"\u0010x\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010OR\"\u0010z\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010OR\u001c\u0010|\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010RR\u0018\u0010~\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010dR-\u0010\u0084\u0001\u001a\u0004\u0018\u00010b2\b\u0010\u007f\u001a\u0004\u0018\u00010b8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R-\u0010\u0089\u0001\u001a\u0004\u0018\u0001082\b\u0010\u007f\u001a\u0004\u0018\u0001088F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001RA\u0010\u008e\u0001\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0012\u0010\u007f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001RA\u0010\u0091\u0001\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0012\u0010\u007f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008f\u0001\u0010\u008b\u0001\"\u0006\b\u0090\u0001\u0010\u008d\u0001R4\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\t0\b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0005\b\u0094\u0001\u0010;R(\u0010\u0099\u0001\u001a\u00020\u001f2\u0006\u0010\u007f\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u0096\u0001\u00107\"\u0006\b\u0097\u0001\u0010\u0098\u0001¨\u0006\u009b\u0001"}, d2 = {"Ll/j;", "Ljava/io/Closeable;", "Lh/u;", "cameraGraphId", "", "", "defaultParameters", "requiredParameters", "", "Lh/g1$a;", "requiredListeners", "Ll/j$b;", "listeners", "Lju/p0;", "shutdownScope", "Lju/l0;", "dispatcher", "<init>", "(Lh/u;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lju/p0;Lju/l0;)V", "", "Ll/h;", "commands", "Loq/i0;", "J", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "", "t0", "(Ljava/util/List;)I", "idx", "Ll/h$b;", "command", "", "repeatAllowed", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ljava/util/List;ILl/h$b;Z)V", "Ll/h$j;", "d0", "(Ljava/util/List;ILl/h$j;)V", "captureAllowed", "V", "(Ljava/util/List;IZ)V", "Ll/h$e;", "O", "(Ljava/util/List;ILl/h$e;)V", "Ll/h$d;", "N", "(Ljava/util/List;ILl/h$d;)V", "Ll/h$g;", "a0", "(Ljava/util/List;ILl/h$g;Ltq/e;)Ljava/lang/Object;", "c0", "(Ljava/util/List;I)V", "K", "b0", "n0", "()Z", "Lh/g1;", "requests", "b", "(Ljava/util/List;)V", "unprocessedCommands", "C", "isRepeating", "oneTimeRequiredParameters", "u", "(ZLjava/util/List;Ljava/util/Map;)Z", "d1", "(Ljava/util/List;)Z", "parameters", "i1", "(Ljava/util/Map;)Z", "I", "()V", "close", "", "toString", "()Ljava/lang/String;", "a", "Lh/u;", "Ljava/util/Map;", "c", "d", "Ljava/util/List;", "e", "f", "Lju/p0;", "g", "graphLoopScope", "Lk/q;", "h", "Lk/q;", "processingQueue", "j", "Ljava/lang/Object;", "lock", "k", "Z", "closed", "Ll/m;", "l", "Ll/m;", "_requestProcessor", "m", "Lh/g1;", "_repeatingRequest", "n", "_graphParameters", "p", "_graph3AParameters", "q", "_requestListeners", "Liu/a;", "r", "Liu/a;", "_captureProcessingEnabled", "s", "currentRepeatingRequest", "t", "currentGraphParameters", "v", "currentGraph3AParameters", "w", "currentRequiredParameters", "x", "currentRequestListeners", "y", "currentRequestProcessor", "value", "getRequestProcessor", "()Ll/m;", "Y0", "(Ll/m;)V", "requestProcessor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()Lh/g1;", "O0", "(Lh/g1;)V", "repeatingRequest", "getGraphParameters", "()Ljava/util/Map;", "H0", "(Ljava/util/Map;)V", "graphParameters", "getGraph3AParameters", "C0", "graph3AParameters", "getRequestListeners", "()Ljava/util/List;", "T0", "requestListeners", "E", "u0", "(Z)V", "captureProcessingEnabled", "z", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GraphLoop implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h.u cameraGraphId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<?, Object> defaultParameters;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<?, Object> requiredParameters;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<g1.a> requiredListeners;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<b> listeners;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0 shutdownScope;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0 graphLoopScope;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k.q<l.h> processingQueue;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private volatile boolean closed;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private m _requestProcessor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private g1 _repeatingRequest;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Map<?, ? extends Object> _graphParameters;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Map<?, ? extends Object> _graph3AParameters;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private List<? extends g1.a> _requestListeners;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final iu.a _captureProcessingEnabled;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private g1 currentRepeatingRequest;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Map<?, ? extends Object> currentGraphParameters;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Map<?, ? extends Object> currentGraph3AParameters;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private Map<?, ? extends Object> currentRequiredParameters;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private List<? extends g1.a> currentRequestListeners;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private m currentRequestProcessor;

    /* JADX INFO: renamed from: l.j$b */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Ll/j$b;", "", "Loq/i0;", "a", "()V", "c", "d", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        void a();

        void c();

        void d();
    }

    /* JADX INFO: renamed from: l.j$c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m f113826f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m mVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f113826f = mVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113825e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = this.f113826f;
                this.f113825e = 1;
                if (mVar.e(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f113826f, eVar);
        }
    }

    /* JADX INFO: renamed from: l.j$d */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113827e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ l.h f113828f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(l.h hVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f113828f = hVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        
            if (r5.e(r4) == r0) goto L19;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f113827e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L47
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L34
            L1e:
                oq.u.b(r5)
                l.h r5 = r4.f113828f
                l.h$g r5 = (l.h.g) r5
                l.m r5 = r5.getOld()
                if (r5 == 0) goto L34
                r4.f113827e = r3
                java.lang.Object r5 = r5.e(r4)
                if (r5 != r0) goto L34
                goto L46
            L34:
                l.h r5 = r4.f113828f
                l.h$g r5 = (l.h.g) r5
                l.m r5 = r5.getNew()
                if (r5 == 0) goto L47
                r4.f113827e = r2
                java.lang.Object r5 = r5.e(r4)
                if (r5 != r0) goto L47
            L46:
                return r0
            L47:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: l.GraphLoop.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f113828f, eVar);
        }
    }

    /* JADX INFO: renamed from: l.j$e */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f113829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f113830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f113831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f113832g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f113833h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f113834j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f113835k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f113836l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f113838n;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f113836l = obj;
            this.f113838n |= PKIFailureInfo.systemUnavail;
            return GraphLoop.this.a0(null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: l.j$f */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f113839d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f113840e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f113841f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f113842g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f113843h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f113845k;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f113843h = obj;
            this.f113845k |= PKIFailureInfo.systemUnavail;
            return GraphLoop.this.b0(null, this);
        }
    }

    /* JADX INFO: renamed from: l.j$g */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class g extends fr.q implements er.l<List<? extends l.h>, i0> {
        g(Object obj) {
            super(1, obj, GraphLoop.class, "finalizeUnprocessedCommands", "finalizeUnprocessedCommands(Ljava/util/List;)V", 0);
        }

        public final void E(List<? extends l.h> list) {
            ((GraphLoop) this.f66391b).C(list);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(List<? extends l.h> list) {
            E(list);
            return i0.f148189a;
        }
    }

    /* JADX INFO: renamed from: l.j$h */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class h extends fr.q implements er.p<List<l.h>, tq.e<? super i0>, Object> {
        h(Object obj) {
            super(2, obj, GraphLoop.class, "process", "process(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // er.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Object B(List<l.h> list, tq.e<? super i0> eVar) {
            return ((GraphLoop) this.f66391b).J(list, eVar);
        }
    }

    /* JADX INFO: renamed from: l.j$i */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class i extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m f113847f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(m mVar, tq.e<? super i> eVar) {
            super(2, eVar);
            this.f113847f = mVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113846e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = this.f113847f;
                this.f113846e = 1;
                if (mVar.e(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((i) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new i(this.f113847f, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GraphLoop(h.u uVar, Map<?, ? extends Object> map, Map<?, ? extends Object> map2, List<? extends g1.a> list, List<? extends b> list2, p0 p0Var, l0 l0Var) {
        this.cameraGraphId = uVar;
        this.defaultParameters = map;
        this.requiredParameters = map2;
        this.requiredListeners = list;
        this.listeners = list2;
        this.shutdownScope = p0Var;
        p0 p0VarA = q0.a(l0Var.n0(new CoroutineName("CXCP-GraphLoop")));
        this.graphLoopScope = p0VarA;
        this.processingQueue = k.q.INSTANCE.a(new k.q(0, new g(this), new h(this), 1, null), p0VarA);
        this.lock = new Object();
        this._graphParameters = v0.i();
        this._graph3AParameters = v0.i();
        this._requestListeners = pq.v.n();
        this._captureProcessingEnabled = iu.b.a(true);
        this.currentGraphParameters = v0.i();
        this.currentGraph3AParameters = v0.i();
        this.currentRequiredParameters = map2;
        this.currentRequestListeners = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(List<? extends l.h> unprocessedCommands) {
        for (l.h hVar : unprocessedCommands) {
            if (hVar instanceof l.h.b) {
                b(((l.h.b) hVar).a());
            } else if (hVar instanceof l.h.g) {
                ju.k.d(this.shutdownScope, null, r0.UNDISPATCHED, new d(hVar, null), 1, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object J(List<l.h> list, tq.e<? super i0> eVar) throws Throwable {
        int iT0 = t0(list);
        l.h hVar = list.get(iT0);
        if (fr.t.c(hVar, l.h.c.f113792a)) {
            list.remove(iT0);
        } else {
            if (fr.t.c(hVar, l.h.C2762h.f113799a)) {
                Object objB0 = b0(list, eVar);
                return objB0 == uq.b.e() ? objB0 : i0.f148189a;
            }
            if (fr.t.c(hVar, l.h.a.f113790a)) {
                K(list, iT0);
            } else if (fr.t.c(hVar, l.h.i.f113800a)) {
                c0(list, iT0);
            } else {
                if (hVar instanceof l.h.g) {
                    Object objA0 = a0(list, iT0, (l.h.g) hVar, eVar);
                    return objA0 == uq.b.e() ? objA0 : i0.f148189a;
                }
                if (hVar instanceof l.h.b) {
                    M(this, list, iT0, (l.h.b) hVar, false, 8, null);
                } else if (hVar instanceof l.h.j) {
                    d0(list, iT0, (l.h.j) hVar);
                } else if (hVar instanceof l.h.e) {
                    O(list, iT0, (l.h.e) hVar);
                } else if (hVar instanceof l.h.d) {
                    N(list, iT0, (l.h.d) hVar);
                } else {
                    if (!(hVar instanceof l.h.f)) {
                        throw new oq.p();
                    }
                    Z(this, list, iT0, false, 4, null);
                }
            }
        }
        return i0.f148189a;
    }

    private final void K(List<l.h> commands, int idx) {
        m mVar = this.currentRequestProcessor;
        if (mVar != null) {
            mVar.a();
        }
        this.currentRepeatingRequest = null;
        commands.remove(idx);
        int i15 = 0;
        while (i15 < idx) {
            l.h hVar = commands.get(i15);
            if (!fr.t.c(hVar, l.h.i.f113800a) && !fr.t.c(hVar, l.h.a.f113790a) && !(hVar instanceof l.h.f) && !(hVar instanceof l.h.j)) {
                if (hVar instanceof l.h.b) {
                    b(((l.h.b) hVar).a());
                } else {
                    i15++;
                }
            }
            commands.remove(i15);
            idx--;
        }
    }

    private final void L(List<l.h> commands, int idx, l.h.b command, boolean repeatAllowed) {
        if (E() && y(this, false, command.a(), null, 4, null)) {
            commands.remove(idx);
            return;
        }
        if (!repeatAllowed || idx <= 0) {
            return;
        }
        int i15 = idx - 1;
        if (!(commands.get(i15) instanceof l.h.f)) {
            throw new IllegalStateException("Check failed.");
        }
        V(commands, i15, false);
    }

    static /* synthetic */ void M(GraphLoop graphLoop, List list, int i15, l.h.b bVar, boolean z15, int i16, Object obj) {
        if ((i16 & 8) != 0) {
            z15 = true;
        }
        graphLoop.L(list, i15, bVar, z15);
    }

    private final void N(List<l.h> commands, int idx, l.h.d command) {
        this.currentRequestListeners = pq.v.e0(pq.v.L0(command.a(), this.requiredListeners));
        commands.remove(idx);
        int i15 = 0;
        while (i15 < idx) {
            if (commands.get(i15) instanceof l.h.d) {
                commands.remove(i15);
                idx--;
            } else {
                i15++;
            }
        }
        n0();
    }

    private final void O(List<l.h> commands, int idx, l.h.e command) {
        Map<?, ? extends Object> mapB;
        this.currentGraphParameters = command.b();
        this.currentGraph3AParameters = command.a();
        if (command.a().isEmpty()) {
            mapB = this.requiredParameters;
        } else {
            Map mapC = v0.c();
            l1.a(mapC, command.a());
            l1.a(mapC, this.requiredParameters);
            mapB = v0.b(mapC);
        }
        this.currentRequiredParameters = mapB;
        commands.remove(idx);
        int i15 = 0;
        while (i15 < idx) {
            if (commands.get(i15) instanceof l.h.e) {
                commands.remove(i15);
                idx--;
            } else {
                i15++;
            }
        }
        n0();
    }

    private final void V(List<l.h> commands, int idx, boolean captureAllowed) {
        int i15;
        int i16 = idx;
        while (true) {
            int i17 = 0;
            if (-1 >= i16) {
                if (!captureAllowed || (i15 = idx + 1) >= commands.size()) {
                    return;
                }
                l.h hVar = commands.get(i15);
                if (hVar instanceof l.h.b) {
                    L(commands, i15, (l.h.b) hVar, false);
                    return;
                } else {
                    if (hVar instanceof l.h.j) {
                        d0(commands, i15, (l.h.j) hVar);
                        return;
                    }
                    return;
                }
            }
            l.h hVar2 = commands.get(i16);
            if (hVar2 instanceof l.h.f) {
                l.h.f fVar = (l.h.f) hVar2;
                if (y(this, true, pq.v.e(fVar.getRequest()), null, 4, null)) {
                    this.currentRepeatingRequest = fVar.getRequest();
                    commands.remove(i16);
                    while (i17 < i16) {
                        if (commands.get(i17) instanceof l.h.f) {
                            commands.remove(i17);
                            i16--;
                        } else {
                            i17++;
                        }
                    }
                    return;
                }
            }
            i16--;
        }
    }

    static /* synthetic */ void Z(GraphLoop graphLoop, List list, int i15, boolean z15, int i16, Object obj) {
        if ((i16 & 4) != 0) {
            z15 = true;
        }
        graphLoop.V(list, i15, z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x0106  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109  */
    /* JADX WARN: Code duplicated, block: B:41:0x010f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00de -> B:37:0x00f9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00f7 -> B:36:0x00f8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0106 -> B:39:0x0107). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a0(java.util.List<l.h> r18, int r19, l.h.g r20, tq.e<? super oq.i0> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.GraphLoop.a0(java.util.List, int, l.h$g, tq.e):java.lang.Object");
    }

    private final void b(List<g1> requests) {
        List<g1> list = requests;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            g1 g1Var = requests.get(i15);
            int size2 = this.currentRequestListeners.size();
            for (int i16 = 0; i16 < size2; i16++) {
                this.currentRequestListeners.get(i16).H(g1Var);
            }
        }
        int size3 = list.size();
        for (int i17 = 0; i17 < size3; i17++) {
            g1 g1Var2 = requests.get(i17);
            int size4 = g1Var2.d().size();
            for (int i18 = 0; i18 < size4; i18++) {
                g1Var2.d().get(i18).H(g1Var2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee A[PHI: r3 r8 r11
      0x00ee: PHI (r3v5 int) = (r3v3 int), (r3v8 int) binds: [B:32:0x00b0, B:47:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r8v8 java.util.List<l.h>) = (r8v7 java.util.List<l.h>), (r8v9 java.util.List<l.h>) binds: [B:32:0x00b0, B:47:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r11v8 int) = (r11v5 int), (r11v9 int) binds: [B:32:0x00b0, B:47:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b0 -> B:48:0x00ee). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00d9 -> B:47:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00e9 -> B:47:0x00ec). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b0(java.util.List<l.h> r11, tq.e<? super oq.i0> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.GraphLoop.b0(java.util.List, tq.e):java.lang.Object");
    }

    private final void c0(List<l.h> commands, int idx) {
        m mVar = this.currentRequestProcessor;
        if (mVar != null) {
            mVar.f();
        }
        this.currentRepeatingRequest = null;
        commands.remove(idx);
        int i15 = 0;
        while (i15 < idx) {
            l.h hVar = commands.get(i15);
            if (fr.t.c(hVar, l.h.i.f113800a) || (hVar instanceof l.h.f)) {
                commands.remove(i15);
                idx--;
            } else {
                i15++;
            }
        }
    }

    private final void d0(List<l.h> commands, int idx, l.h.j command) {
        g1 g1Var = this.currentRepeatingRequest;
        if (g1Var == null && idx == 0) {
            commands.remove(idx);
            return;
        }
        if (E() && g1Var != null && u(false, pq.v.e(g1Var), command.a())) {
            commands.remove(idx);
        } else if (idx > 0) {
            int i15 = idx - 1;
            if (!(commands.get(i15) instanceof l.h.f)) {
                throw new IllegalStateException("Check failed.");
            }
            V(commands, i15, false);
        }
    }

    private final boolean n0() {
        m mVar = this.currentRequestProcessor;
        if (mVar == null) {
            return false;
        }
        g1 g1Var = this.currentRepeatingRequest;
        return fr.t.c(g1Var != null ? Boolean.valueOf(mVar.g(true, pq.v.e(g1Var), this.defaultParameters, this.currentGraphParameters, this.currentRequiredParameters, this.currentRequestListeners)) : null, Boolean.TRUE);
    }

    private final int t0(List<l.h> commands) {
        if (commands.size() == 1) {
            return 0;
        }
        List<l.h> list = commands;
        int size = list.size() - 1;
        int i15 = -1;
        if (size >= 0) {
            while (true) {
                int i16 = size - 1;
                l.h hVar = commands.get(size);
                if (fr.t.c(hVar, l.h.a.f113790a) || fr.t.c(hVar, l.h.c.f113792a) || fr.t.c(hVar, l.h.i.f113800a) || fr.t.c(hVar, l.h.C2762h.f113799a)) {
                    return size;
                }
                if ((hVar instanceof l.h.g) && i15 < 0) {
                    i15 = size;
                }
                if (i16 < 0) {
                    break;
                }
                size = i16;
            }
        }
        if (i15 >= 0) {
            return i15;
        }
        int size2 = list.size();
        int i17 = -1;
        int i18 = -1;
        for (int i19 = 0; i19 < size2; i19++) {
            l.h hVar2 = commands.get(i19);
            if (!(hVar2 instanceof l.h.e)) {
                if (!(hVar2 instanceof l.h.d)) {
                    if (!(hVar2 instanceof l.h.f)) {
                        break;
                    }
                } else {
                    i18 = i19;
                }
            } else {
                i17 = i19;
            }
        }
        if (i17 >= 0) {
            return i17;
        }
        if (i18 >= 0) {
            return i18;
        }
        if (this.currentRepeatingRequest != null && E()) {
            int size3 = list.size();
            for (int i25 = 0; i25 < size3; i25++) {
                l.h hVar3 = commands.get(i25);
                if ((hVar3 instanceof l.h.b) || (hVar3 instanceof l.h.j)) {
                    return i25;
                }
            }
        }
        int size4 = list.size();
        int i26 = -1;
        int i27 = 0;
        while (i27 < size4 && (commands.get(i27) instanceof l.h.f)) {
            int i28 = i27;
            i27++;
            i26 = i28;
        }
        if (i26 >= 0) {
            return i26;
        }
        return 0;
    }

    private final boolean u(boolean isRepeating, List<g1> requests, Map<?, ? extends Object> oneTimeRequiredParameters) throws Exception {
        Map<?, ? extends Object> mapB;
        m mVar = this.currentRequestProcessor;
        if (mVar == null) {
            return false;
        }
        Map<?, ? extends Object> map = this.defaultParameters;
        Map<?, ? extends Object> map2 = this.currentGraphParameters;
        if (oneTimeRequiredParameters.isEmpty()) {
            mapB = this.currentRequiredParameters;
        } else {
            Map mapC = v0.c();
            l1.a(mapC, this.currentGraph3AParameters);
            l1.a(mapC, oneTimeRequiredParameters);
            l1.a(mapC, this.requiredParameters);
            i0 i0Var = i0.f148189a;
            mapB = v0.b(mapC);
        }
        boolean zG = mVar.g(isRepeating, requests, map, map2, mapB, this.currentRequestListeners);
        if (!zG) {
            if (isRepeating) {
                if (k.k.f107055a.d()) {
                    c2.g("CXCP", "Failed to repeat with " + pq.v.P0(requests));
                    return zG;
                }
            } else if (oneTimeRequiredParameters.isEmpty()) {
                if (k.k.f107055a.d()) {
                    c2.g("CXCP", "Failed to submit capture with " + requests);
                    return zG;
                }
            } else if (k.k.f107055a.d()) {
                c2.g("CXCP", "Failed to trigger with " + pq.v.P0(requests) + " and " + oneTimeRequiredParameters);
            }
        }
        return zG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean y(GraphLoop graphLoop, boolean z15, List list, Map map, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            map = v0.i();
        }
        return graphLoop.u(z15, list, map);
    }

    public final void C0(Map<?, ? extends Object> map) {
        synchronized (this.lock) {
            this._graph3AParameters = map;
            this.processingQueue.j(new l.h.e(this._graphParameters, map));
            i0 i0Var = i0.f148189a;
        }
    }

    public final boolean E() {
        return this._captureProcessingEnabled.b();
    }

    public final g1 H() {
        g1 g1Var;
        synchronized (this.lock) {
            g1Var = this._repeatingRequest;
        }
        return g1Var;
    }

    public final void H0(Map<?, ? extends Object> map) {
        synchronized (this.lock) {
            this._graphParameters = map;
            this.processingQueue.j(new l.h.e(map, this._graph3AParameters));
            i0 i0Var = i0.f148189a;
        }
    }

    public final void I() {
        this.processingQueue.j(l.h.c.f113792a);
    }

    public final void O0(g1 g1Var) {
        synchronized (this.lock) {
            try {
                g1 g1Var2 = this._repeatingRequest;
                this._repeatingRequest = g1Var;
                if (g1Var2 != null || g1Var != null) {
                    if (g1Var != null) {
                        this.processingQueue.j(new l.h.f(g1Var));
                    } else {
                        this.processingQueue.j(l.h.i.f113800a);
                    }
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (g1Var == null) {
            int size = this.listeners.size();
            for (int i15 = 0; i15 < size; i15++) {
                this.listeners.get(i15).a();
            }
        }
    }

    public final void T0(List<? extends g1.a> list) {
        synchronized (this.lock) {
            this._requestListeners = list;
            this.processingQueue.j(new l.h.d(list));
            i0 i0Var = i0.f148189a;
        }
    }

    public final void Y0(m mVar) {
        synchronized (this.lock) {
            m mVar2 = this._requestProcessor;
            this._requestProcessor = mVar;
            if (this.closed) {
                this._requestProcessor = null;
                if (mVar != null) {
                    ju.k.d(this.shutdownScope, null, null, new i(mVar, null), 3, null);
                }
                return;
            }
            if (mVar2 != mVar) {
                this.processingQueue.j(new l.h.g(mVar2, mVar));
            }
            i0 i0Var = i0.f148189a;
            if (mVar == null) {
                int size = this.listeners.size();
                for (int i15 = 0; i15 < size; i15++) {
                    this.listeners.get(i15).c();
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return;
                }
                this.closed = true;
                m mVar = this._requestProcessor;
                if (mVar != null) {
                    ju.k.d(this.shutdownScope, null, null, new c(mVar, null), 3, null);
                }
                this._requestProcessor = null;
                this.processingQueue.j(l.h.C2762h.f113799a);
                int size = this.listeners.size();
                for (int i15 = 0; i15 < size; i15++) {
                    this.listeners.get(i15).d();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final boolean d1(List<g1> requests) {
        if (this.processingQueue.j(new l.h.b(requests))) {
            return true;
        }
        b(requests);
        return false;
    }

    public final boolean i1(Map<?, ? extends Object> parameters) {
        if (H() != null) {
            return this.processingQueue.j(new l.h.j(parameters));
        }
        throw new IllegalStateException("Cannot submit parameters without an active repeating request!");
    }

    public String toString() {
        return "GraphLoop(" + this.cameraGraphId + ')';
    }

    public final void u0(boolean z15) {
        this._captureProcessingEnabled.c(z15);
        if (z15) {
            I();
        }
    }
}
