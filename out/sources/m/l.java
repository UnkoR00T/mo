package m;

import android.os.Build;
import h.c0;
import h.c1;
import h.d1;
import h.e1;
import h.g1;
import h.h1;
import h.i1;
import h.p0;
import h.q1;
import h.s0;
import h.v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l.StreamGraph;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 E2\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0002-+B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0014H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00170/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R2\u00107\u001a \u0012\u0004\u0012\u00020\u001b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u0002040/03038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lm/l;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lh/g1$a;", "Ll/x;", "streamGraphImpl", "Lm/i;", "frameCaptureQueue", "", "isCameraTimebaseRealtime", "", "realtimeToMonotonicOffsetNs", "<init>", "(Ll/x;Lm/i;ZJ)V", "Lh/i1;", "requestMetadata", "Lh/r0;", "frameNumber", "Lh/f0;", "timestamp", "Loq/i0;", "Z", "(Lh/i1;JJ)V", "Lh/p0;", "result", "K", "(Lh/i1;JLh/p0;)V", "Lh/q1;", "streamId", "Lh/c1;", "outputId", "h", "(Lh/i1;JII)V", "Lh/h1;", "requestFailure", "p", "(Lh/i1;JLh/h1;)V", "Lh/g1;", "request", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lh/g1;)V", "close", "()V", "a", "Ll/x;", "b", "Lm/i;", "Lm/r;", "c", "Lm/r;", "frameInfoDistributor", "", "Ln/r;", "d", "Ljava/util/Map;", "imageDistributors", "", "Lh/c0;", "e", "Ljava/util/Set;", "imageStreams", "Lm/l$b;", "f", "Lm/l$b;", "getFrameStartedListener", "()Lm/l$b;", "setFrameStartedListener", "(Lm/l$b;)V", "frameStartedListener", "g", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements AutoCloseable, g1.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final StreamGraph streamGraphImpl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i frameCaptureQueue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r<p0> frameInfoDistributor = new r<>(0, n.q.f129757a, s.INSTANCE.a(), 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<q1, Map<c1, r<n.r>>> imageDistributors;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Set<c0> imageStreams;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private b frameStartedListener;

    /* JADX INFO: renamed from: m.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lm/l$a;", "", "<init>", "()V", "Lh/q1;", "cameraStreamId", "Lh/c0$a;", "cameraStreamConfig", "Lh/v0;", "imageSourceConfig", "", "isCameraTimebaseRealtime", "", "realtimeToMonotonicOffsetNs", "Lm/s;", "b", "(ILh/c0$a;Lh/v0;ZJ)Lm/s;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final s b(int cameraStreamId, c0.a cameraStreamConfig, v0 imageSourceConfig, boolean isCameraTimebaseRealtime, long realtimeToMonotonicOffsetNs) {
            if (!isCameraTimebaseRealtime) {
                if (Build.VERSION.SDK_INT >= 33) {
                    List<e1.a> listB = cameraStreamConfig.b();
                    if (!(listB instanceof Collection) || !listB.isEmpty()) {
                        Iterator<T> it = listB.iterator();
                        while (it.hasNext()) {
                            ((e1.a) it.next()).i();
                            e1.h.INSTANCE.a();
                        }
                    }
                }
                return s.INSTANCE.a();
            }
            if (Build.VERSION.SDK_INT >= 33) {
                List<e1.a> listB2 = cameraStreamConfig.b();
                if (!(listB2 instanceof Collection) || !listB2.isEmpty()) {
                    Iterator<T> it4 = listB2.iterator();
                    while (it4.hasNext()) {
                        ((e1.a) it4.next()).i();
                    }
                }
            }
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 29 || i15 >= 33) {
                throw null;
            }
            return s.INSTANCE.a();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lm/l$b;", "", "Lh/s0;", "frameReference", "Loq/i0;", "a", "(Lh/s0;)V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        void a(s0 frameReference);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements n.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map<c1, r<n.r>> f121848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n.m f121849b;

        c(Map<c1, r<n.r>> map, n.m mVar) {
            this.f121848a = map;
            this.f121849b = mVar;
        }
    }

    public l(StreamGraph streamGraph, i iVar, boolean z15, long j15) {
        this.streamGraphImpl = streamGraph;
        this.frameCaptureQueue = iVar;
        Map<q1, n.m> mapN = streamGraph.N();
        LinkedHashMap linkedHashMap = new LinkedHashMap(pq.v0.e(mapN.size()));
        Iterator<T> it = mapN.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            int value = ((q1) entry.getKey()).getValue();
            n.m mVar = (n.m) entry.getValue();
            final c0 c0VarH = this.streamGraphImpl.h(value);
            if (c0VarH == null) {
                throw new IllegalStateException("Required value was null.");
            }
            c0.a aVarM = this.streamGraphImpl.M(value);
            aVarM.a();
            s sVarB = INSTANCE.b(value, aVarM, null, z15, j15);
            Map mapC = pq.v0.c();
            for (e1 e1Var : c0VarH.b()) {
                mapC.put(c1.a(e1Var.getId()), new r(0, n.f.f129755a, sVarB, 1, null));
            }
            final Map mapB = pq.v0.b(mapC);
            mVar.J1(new c(mapB, mVar));
            mVar.a4(new n.g() { // from class: m.j
            });
            linkedHashMap.put(key, mapB);
        }
        this.imageDistributors = linkedHashMap;
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(v.y(setKeySet, 10));
        Iterator it4 = setKeySet.iterator();
        while (it4.hasNext()) {
            c0 c0VarH2 = this.streamGraphImpl.h(((q1) it4.next()).getValue());
            if (c0VarH2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(c0VarH2);
        }
        this.imageStreams = v.k1(arrayList);
        this.frameStartedListener = new b() { // from class: m.k
            @Override // m.l.b
            public final void a(s0 s0Var) {
                l.c0(s0Var);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(s0 s0Var) {
    }

    @Override // h.g1.a
    public void H(g1 request) {
        i.a aVarM = this.frameCaptureQueue.m(request);
        if (aVarM != null) {
            aVarM.h(d1.INSTANCE.b());
        }
    }

    @Override // h.g1.a
    public void K(i1 requestMetadata, long frameNumber, p0 result) {
        this.frameInfoDistributor.h(frameNumber, t.c(result));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.g1.a
    public void Z(i1 requestMetadata, long frameNumber, long timestamp) throws Exception {
        i.a aVarM;
        n nVar = new n(requestMetadata, frameNumber, timestamp, this.imageStreams, null);
        this.frameInfoDistributor.m(frameNumber, timestamp, frameNumber, nVar.getFrameInfoOutput());
        int size = nVar.f().size();
        for (int i15 = 0; i15 < size; i15++) {
            n.d dVar = nVar.f().get(i15);
            Map<c1, r<n.r>> map = this.imageDistributors.get(q1.a(dVar.getStreamId()));
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            r<n.r> rVar = map.get(c1.a(dVar.getOutputId()));
            if (rVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            r<n.r> rVar2 = rVar;
            rVar2.m(frameNumber, timestamp, timestamp, dVar);
            if (!requestMetadata.G().keySet().contains(q1.a(dVar.getStreamId()))) {
                rVar2.b(nVar.getFrameNumber());
            }
        }
        m mVar = new m(nVar, null, 2, 0 == true ? 1 : 0);
        this.frameStartedListener.a(mVar);
        if (requestMetadata.getRepeating() || (aVarM = this.frameCaptureQueue.m(requestMetadata.getRequest())) == null) {
            mVar.close();
        } else {
            aVarM.b(mVar);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.frameCaptureQueue.close();
        this.frameInfoDistributor.close();
        Iterator<Map<c1, r<n.r>>> it = this.imageDistributors.values().iterator();
        while (it.hasNext()) {
            Iterator<r<n.r>> it4 = it.next().values().iterator();
            while (it4.hasNext()) {
                it4.next().close();
            }
        }
    }

    @Override // h.g1.a
    public void h(i1 requestMetadata, long frameNumber, int streamId, int outputId) {
        Map<c1, r<n.r>> map = this.imageDistributors.get(q1.a(streamId));
        if (map == null) {
            return;
        }
        c0.a aVarM = this.streamGraphImpl.M(streamId);
        if (aVarM == null) {
            throw new IllegalStateException("Required value was null.");
        }
        aVarM.a();
        if (!map.containsKey(c1.a(outputId))) {
            throw new IllegalStateException("Check failed.");
        }
        Iterator<r<n.r>> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().b(frameNumber);
        }
    }

    @Override // h.g1.a
    public void p(i1 requestMetadata, long frameNumber, h1 requestFailure) {
        r<p0> rVar = this.frameInfoDistributor;
        t.Companion companion = t.INSTANCE;
        rVar.h(frameNumber, t.c(d1.f(d1.INSTANCE.c())));
        if (requestFailure.getWasImageCaptured()) {
            return;
        }
        Iterator<q1> it = requestMetadata.G().keySet().iterator();
        while (it.hasNext()) {
            Map<c1, r<n.r>> map = this.imageDistributors.get(q1.a(it.next().getValue()));
            if (map != null) {
                Iterator<r<n.r>> it4 = map.values().iterator();
                while (it4.hasNext()) {
                    it4.next().b(frameNumber);
                }
            }
        }
    }
}
