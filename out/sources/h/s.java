package h;

import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import i.h2;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007\u0004\u0005\u0006\u0007\b\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lh/s;", "Lh/t;", "Lh/s$g;", "Lh/o;", "b", "a", "f", "d", "e", "c", "g", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface s extends t<g>, o {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lh/s$a;", "", "", "Lh/s$b;", "graphConfigs", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<b> graphConfigs;

        /* JADX WARN: Code duplicated, block: B:16:0x0043  */
        public a(List<b> list) {
            boolean zD;
            boolean z15;
            this.graphConfigs = list;
            if (list.size() < 2) {
                throw new IllegalStateException("Cannot create ConcurrentGraphConfig without 2 or more CameraGraph.Config(s)");
            }
            b bVar = (b) pq.v.l0(list);
            List<b> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z15 = true;
                        break;
                    }
                    String cameraBackendId = ((b) it.next()).getCameraBackendId();
                    String cameraBackendId2 = bVar.getCameraBackendId();
                    if (cameraBackendId == null) {
                        if (cameraBackendId2 == null) {
                            zD = true;
                        } else {
                            zD = false;
                        }
                    } else if (cameraBackendId2 == null) {
                        zD = false;
                    } else {
                        zD = h.g.d(cameraBackendId, cameraBackendId2);
                    }
                    if (!zD) {
                        z15 = false;
                        break;
                    }
                }
            } else {
                z15 = true;
                break;
            }
            if (!z15) {
                throw new IllegalStateException("Each CameraGraph.Config must use the same camera backend!");
            }
            List<b> list3 = this.graphConfigs;
            ArrayList arrayList = new ArrayList(pq.v.y(list3, 10));
            Iterator<T> it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList.add(v.a(((b) it4.next()).getCamera()));
            }
            if (!(pq.v.e0(arrayList).size() == this.graphConfigs.size())) {
                throw new IllegalStateException("Each CameraGraph.Config must have a distinct camera id!");
            }
        }

        public final List<b> a() {
            return this.graphConfigs;
        }
    }

    @Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u0010&R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00048\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010)R#\u0010\u000e\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b5\u0010=\u001a\u0004\bC\u0010)R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\b?\u0010)R#\u0010\u0012\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8\u0006¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\b<\u0010BR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u00103R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\bE\u00103R#\u0010\u0017\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8\u0006¢\u0006\f\n\u0004\bF\u0010@\u001a\u0004\bF\u0010BR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bG\u0010/\u001a\u0004\b0\u0010&R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bC\u0010H\u001a\u0004\b6\u0010IR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bA\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b>\u0010M\u001a\u0004\bD\u0010NR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\bG\u0010&R$\u0010T\u001a\u0004\u0018\u00010O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\b4\u0010R\"\u0004\bP\u0010S¨\u0006U"}, d2 = {"Lh/s$b;", "", "Lh/v;", "camera", "", "Lh/c0$a;", "streams", "exclusiveStreamGroups", "Lh/x0$a;", "input", "postviewStream", "Lh/k1;", "sessionTemplate", "", "sessionParameters", "Lh/s$e;", "sessionMode", "defaultTemplate", "defaultParameters", "Lh/g1$a;", "defaultListeners", "Lh/u0;", "graphStateListeners", "requiredParameters", "Lh/g;", "cameraBackendId", "Lh/f;", "customCameraBackend", "Lh/b1;", "metadataTransform", "Lh/s$d;", "flags", "Lh/k;", "sessionColorSpace", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lh/c0$a;ILjava/util/Map;IILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lh/f;Lh/b1;Lh/s$d;Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "r", "()Ljava/util/List;", "c", "h", "d", "k", "e", "Lh/c0$a;", "l", "()Lh/c0$a;", "f", "I", "q", "g", "Ljava/util/Map;", "p", "()Ljava/util/Map;", "o", "i", "j", "m", "n", "Lh/f;", "()Lh/f;", "Lh/b1;", "getMetadataTransform", "()Lh/b1;", "Lh/s$d;", "()Lh/s$d;", "Lh/j0;", "s", "Lh/j0;", "()Lh/j0;", "(Lh/j0;)V", "concurrentCameraGraphs", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String camera;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<c0.a> streams;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<List<c0.a>> exclusiveStreamGroups;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<x0.a> input;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final c0.a postviewStream;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final int sessionTemplate;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final Map<?, Object> sessionParameters;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final int sessionMode;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final int defaultTemplate;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final Map<?, Object> defaultParameters;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final List<g1.a> defaultListeners;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final List<u0> graphStateListeners;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final Map<?, Object> requiredParameters;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final String cameraBackendId;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final h.f customCameraBackend;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final MetadataTransform metadataTransform;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final Flags flags;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final String sessionColorSpace;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private ConcurrentCameraGraphs concurrentCameraGraphs;

        public /* synthetic */ b(String str, List list, List list2, List list3, c0.a aVar, int i15, Map map, int i16, int i17, Map map2, List list4, List list5, Map map3, String str2, h.f fVar, MetadataTransform metadataTransform, Flags flags, String str3, fr.k kVar) {
            this(str, list, list2, list3, aVar, i15, map, i16, i17, map2, list4, list5, map3, str2, fVar, metadataTransform, flags, str3);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCamera() {
            return this.camera;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCameraBackendId() {
            return this.cameraBackendId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ConcurrentCameraGraphs getConcurrentCameraGraphs() {
            return this.concurrentCameraGraphs;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final h.f getCustomCameraBackend() {
            return this.customCameraBackend;
        }

        public final List<g1.a> e() {
            return this.defaultListeners;
        }

        /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:70:0x00dc  */
        public boolean equals(Object other) {
            boolean zD;
            boolean zB;
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            if (!v.d(this.camera, bVar.camera) || !fr.t.c(this.streams, bVar.streams) || !fr.t.c(this.exclusiveStreamGroups, bVar.exclusiveStreamGroups) || !fr.t.c(this.input, bVar.input) || !fr.t.c(this.postviewStream, bVar.postviewStream) || !k1.d(this.sessionTemplate, bVar.sessionTemplate) || !fr.t.c(this.sessionParameters, bVar.sessionParameters) || !e.f(this.sessionMode, bVar.sessionMode) || !k1.d(this.defaultTemplate, bVar.defaultTemplate) || !fr.t.c(this.defaultParameters, bVar.defaultParameters) || !fr.t.c(this.defaultListeners, bVar.defaultListeners) || !fr.t.c(this.graphStateListeners, bVar.graphStateListeners) || !fr.t.c(this.requiredParameters, bVar.requiredParameters)) {
                return false;
            }
            String str = this.cameraBackendId;
            String str2 = bVar.cameraBackendId;
            if (str == null) {
                if (str2 == null) {
                    zD = true;
                } else {
                    zD = false;
                }
            } else if (str2 == null) {
                zD = false;
            } else {
                zD = h.g.d(str, str2);
            }
            if (!zD || !fr.t.c(this.customCameraBackend, bVar.customCameraBackend) || !fr.t.c(this.metadataTransform, bVar.metadataTransform) || !fr.t.c(this.flags, bVar.flags)) {
                return false;
            }
            String str3 = this.sessionColorSpace;
            String str4 = bVar.sessionColorSpace;
            if (str3 == null) {
                if (str4 == null) {
                    zB = true;
                } else {
                    zB = false;
                }
            } else if (str4 == null) {
                zB = false;
            } else {
                zB = k.b(str3, str4);
            }
            return zB;
        }

        public final Map<?, Object> f() {
            return this.defaultParameters;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getDefaultTemplate() {
            return this.defaultTemplate;
        }

        public final List<List<c0.a>> h() {
            return this.exclusiveStreamGroups;
        }

        public int hashCode() {
            int iE = ((((v.e(this.camera) * 31) + this.streams.hashCode()) * 31) + this.exclusiveStreamGroups.hashCode()) * 31;
            List<x0.a> list = this.input;
            int iHashCode = (iE + (list == null ? 0 : list.hashCode())) * 31;
            c0.a aVar = this.postviewStream;
            int iHashCode2 = (((((((((((((((((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + k1.f(this.sessionTemplate)) * 31) + this.sessionParameters.hashCode()) * 31) + e.g(this.sessionMode)) * 31) + k1.f(this.defaultTemplate)) * 31) + this.defaultParameters.hashCode()) * 31) + this.defaultListeners.hashCode()) * 31) + this.graphStateListeners.hashCode()) * 31) + this.requiredParameters.hashCode()) * 31;
            String str = this.cameraBackendId;
            int iE2 = (iHashCode2 + (str == null ? 0 : h.g.e(str))) * 31;
            h.f fVar = this.customCameraBackend;
            int iHashCode3 = (((((iE2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + this.metadataTransform.hashCode()) * 31) + this.flags.hashCode()) * 31;
            String str2 = this.sessionColorSpace;
            return iHashCode3 + (str2 != null ? k.c(str2) : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Flags getFlags() {
            return this.flags;
        }

        public final List<u0> j() {
            return this.graphStateListeners;
        }

        public final List<x0.a> k() {
            return this.input;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final c0.a getPostviewStream() {
            return this.postviewStream;
        }

        public final Map<?, Object> m() {
            return this.requiredParameters;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getSessionColorSpace() {
            return this.sessionColorSpace;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final int getSessionMode() {
            return this.sessionMode;
        }

        public final Map<?, Object> p() {
            return this.sessionParameters;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final int getSessionTemplate() {
            return this.sessionTemplate;
        }

        public final List<c0.a> r() {
            return this.streams;
        }

        public final void s(ConcurrentCameraGraphs j0Var) {
            this.concurrentCameraGraphs = j0Var;
        }

        public String toString() {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Config(camera=");
            sb5.append((Object) v.f(this.camera));
            sb5.append(", streams=");
            sb5.append(this.streams);
            sb5.append(", exclusiveStreamGroups=");
            sb5.append(this.exclusiveStreamGroups);
            sb5.append(", input=");
            sb5.append(this.input);
            sb5.append(", postviewStream=");
            sb5.append(this.postviewStream);
            sb5.append(", sessionTemplate=");
            sb5.append((Object) k1.g(this.sessionTemplate));
            sb5.append(", sessionParameters=");
            sb5.append(this.sessionParameters);
            sb5.append(", sessionMode=");
            sb5.append((Object) e.h(this.sessionMode));
            sb5.append(", defaultTemplate=");
            sb5.append((Object) k1.g(this.defaultTemplate));
            sb5.append(", defaultParameters=");
            sb5.append(this.defaultParameters);
            sb5.append(", defaultListeners=");
            sb5.append(this.defaultListeners);
            sb5.append(", graphStateListeners=");
            sb5.append(this.graphStateListeners);
            sb5.append(", requiredParameters=");
            sb5.append(this.requiredParameters);
            sb5.append(", cameraBackendId=");
            String str = this.cameraBackendId;
            sb5.append((Object) (str == null ? "null" : h.g.f(str)));
            sb5.append(", customCameraBackend=");
            sb5.append(this.customCameraBackend);
            sb5.append(", metadataTransform=");
            sb5.append(this.metadataTransform);
            sb5.append(", flags=");
            sb5.append(this.flags);
            sb5.append(", sessionColorSpace=");
            String str2 = this.sessionColorSpace;
            sb5.append((Object) (str2 != null ? k.e(str2) : "null"));
            sb5.append(')');
            return sb5.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private b(String str, List<c0.a> list, List<? extends List<c0.a>> list2, List<x0.a> list3, c0.a aVar, int i15, Map<?, ? extends Object> map, int i16, int i17, Map<?, ? extends Object> map2, List<? extends g1.a> list4, List<? extends u0> list5, Map<?, ? extends Object> map3, String str2, h.f fVar, MetadataTransform metadataTransform, Flags flags, String str3) {
            this.camera = str;
            this.streams = list;
            this.exclusiveStreamGroups = list2;
            this.input = list3;
            this.postviewStream = aVar;
            this.sessionTemplate = i15;
            this.sessionParameters = map;
            this.sessionMode = i16;
            this.defaultTemplate = i17;
            this.defaultParameters = map2;
            this.defaultListeners = list4;
            this.graphStateListeners = list5;
            this.requiredParameters = map3;
            this.cameraBackendId = str2;
            this.customCameraBackend = fVar;
            this.metadataTransform = metadataTransform;
            this.flags = flags;
            this.sessionColorSpace = str3;
            if (str2 != null && fVar != null) {
                throw new IllegalStateException("Setting both cameraBackendId and customCameraBackend is not supported.");
            }
        }

        public /* synthetic */ b(String str, List list, List list2, List list3, c0.a aVar, int i15, Map map, int i16, int i17, Map map2, List list4, List list5, Map map3, String str2, h.f fVar, MetadataTransform metadataTransform, Flags flags, String str3, int i18, fr.k kVar) {
            this(str, list, (i18 & 4) != 0 ? pq.v.n() : list2, (i18 & 8) != 0 ? null : list3, (i18 & 16) != 0 ? null : aVar, (i18 & 32) != 0 ? k1.b(1) : i15, (i18 & 64) != 0 ? pq.v0.i() : map, (i18 & 128) != 0 ? e.INSTANCE.d() : i16, (i18 & 256) != 0 ? k1.b(1) : i17, (i18 & 512) != 0 ? pq.v0.i() : map2, (i18 & 1024) != 0 ? pq.v.n() : list4, (i18 & 2048) != 0 ? pq.v.n() : list5, (i18 & PKIFailureInfo.certConfirmed) != 0 ? pq.v0.i() : map3, (i18 & PKIFailureInfo.certRevoked) != 0 ? null : str2, (i18 & 16384) != 0 ? null : fVar, (32768 & i18) != 0 ? new MetadataTransform(0, 0, null, 7, null) : metadataTransform, (65536 & i18) != 0 ? new Flags(false, false, null, null, 0, false, false, false, GF2Field.MASK, null) : flags, (i18 & PKIFailureInfo.unsupportedVersion) != 0 ? null : str3, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lh/s$c;", "", "<init>", "()V", "", "Landroid/hardware/camera2/params/MeteringRectangle;", "b", "[Landroid/hardware/camera2/params/MeteringRectangle;", "getMETERING_REGIONS_EMPTY", "()[Landroid/hardware/camera2/params/MeteringRectangle;", "METERING_REGIONS_EMPTY", "c", "a", "METERING_REGIONS_DEFAULT", "Lh/r0;", "d", "J", "getFRAME_NUMBER_INVALID-Ugla2oM", "()J", "FRAME_NUMBER_INVALID", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f79050a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final MeteringRectangle[] METERING_REGIONS_EMPTY = new MeteringRectangle[0];

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final MeteringRectangle[] METERING_REGIONS_DEFAULT = {new MeteringRectangle(0, 0, 0, 0, 0)};

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final long FRAME_NUMBER_INVALID = r0.b(-1);

        private c() {
        }

        public final MeteringRectangle[] a() {
            return METERING_REGIONS_DEFAULT;
        }
    }

    /* JADX INFO: renamed from: h.s$d, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b \u0010\u001bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b&\u0010\u001b¨\u0006("}, d2 = {"Lh/s$d;", "", "", "configureBlankSessionOnStop", "abortCapturesOnStop", "Lh/s$f;", "awaitRepeatingRequestBeforeCapture", "awaitRepeatingRequestOnDisconnect", "Lh/s$d$a;", "finalizeSessionOnCloseBehavior", "closeCaptureSessionOnDisconnect", "closeCameraDeviceOnClose", "enableRestartDelays", "<init>", "(ZZLh/s$f;Ljava/lang/Boolean;IZZZLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getConfigureBlankSessionOnStop", "()Z", "b", "c", "Lh/s$f;", "()Lh/s$f;", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "I", "g", "f", "h", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Flags {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean configureBlankSessionOnStop;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean abortCapturesOnStop;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final f awaitRepeatingRequestBeforeCapture;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean awaitRepeatingRequestOnDisconnect;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int finalizeSessionOnCloseBehavior;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean closeCaptureSessionOnDisconnect;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean closeCameraDeviceOnClose;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enableRestartDelays;

        /* JADX INFO: renamed from: h.s$d$a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000b"}, d2 = {"Lh/s$d$a;", "", "", "value", "d", "(I)I", "", "g", "(I)Ljava/lang/String;", "f", "a", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final int f79063b = d(0);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final int f79064c = d(1);

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final int f79065d = d(2);

            /* JADX INFO: renamed from: h.s$d$a$a, reason: collision with other inner class name and from kotlin metadata */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lh/s$d$a$a;", "", "<init>", "()V", "Lh/s$d$a;", "OFF", "I", "b", "()I", "IMMEDIATE", "a", "TIMEOUT", "c", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(fr.k kVar) {
                    this();
                }

                public final int a() {
                    return a.f79064c;
                }

                public final int b() {
                    return a.f79063b;
                }

                public final int c() {
                    return a.f79065d;
                }

                private Companion() {
                }
            }

            private static int d(int i15) {
                return i15;
            }

            public static final boolean e(int i15, int i16) {
                return i15 == i16;
            }

            public static int f(int i15) {
                return Integer.hashCode(i15);
            }

            public static String g(int i15) {
                return "FinalizeSessionOnCloseBehavior(value=" + i15 + ')';
            }
        }

        public /* synthetic */ Flags(boolean z15, boolean z16, f fVar, Boolean bool, int i15, boolean z17, boolean z18, boolean z19, fr.k kVar) {
            this(z15, z16, fVar, bool, i15, z17, z18, z19);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getAbortCapturesOnStop() {
            return this.abortCapturesOnStop;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final f getAwaitRepeatingRequestBeforeCapture() {
            return this.awaitRepeatingRequestBeforeCapture;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Boolean getAwaitRepeatingRequestOnDisconnect() {
            return this.awaitRepeatingRequestOnDisconnect;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getCloseCameraDeviceOnClose() {
            return this.closeCameraDeviceOnClose;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getCloseCaptureSessionOnDisconnect() {
            return this.closeCaptureSessionOnDisconnect;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Flags)) {
                return false;
            }
            Flags flags = (Flags) other;
            return this.configureBlankSessionOnStop == flags.configureBlankSessionOnStop && this.abortCapturesOnStop == flags.abortCapturesOnStop && fr.t.c(this.awaitRepeatingRequestBeforeCapture, flags.awaitRepeatingRequestBeforeCapture) && fr.t.c(this.awaitRepeatingRequestOnDisconnect, flags.awaitRepeatingRequestOnDisconnect) && a.e(this.finalizeSessionOnCloseBehavior, flags.finalizeSessionOnCloseBehavior) && this.closeCaptureSessionOnDisconnect == flags.closeCaptureSessionOnDisconnect && this.closeCameraDeviceOnClose == flags.closeCameraDeviceOnClose && this.enableRestartDelays == flags.enableRestartDelays;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getEnableRestartDelays() {
            return this.enableRestartDelays;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getFinalizeSessionOnCloseBehavior() {
            return this.finalizeSessionOnCloseBehavior;
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.configureBlankSessionOnStop) * 31) + Boolean.hashCode(this.abortCapturesOnStop)) * 31) + this.awaitRepeatingRequestBeforeCapture.hashCode()) * 31;
            Boolean bool = this.awaitRepeatingRequestOnDisconnect;
            return ((((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + a.f(this.finalizeSessionOnCloseBehavior)) * 31) + Boolean.hashCode(this.closeCaptureSessionOnDisconnect)) * 31) + Boolean.hashCode(this.closeCameraDeviceOnClose)) * 31) + Boolean.hashCode(this.enableRestartDelays);
        }

        public String toString() {
            return "Flags(configureBlankSessionOnStop=" + this.configureBlankSessionOnStop + ", abortCapturesOnStop=" + this.abortCapturesOnStop + ", awaitRepeatingRequestBeforeCapture=" + this.awaitRepeatingRequestBeforeCapture + ", awaitRepeatingRequestOnDisconnect=" + this.awaitRepeatingRequestOnDisconnect + ", finalizeSessionOnCloseBehavior=" + ((Object) a.g(this.finalizeSessionOnCloseBehavior)) + ", closeCaptureSessionOnDisconnect=" + this.closeCaptureSessionOnDisconnect + ", closeCameraDeviceOnClose=" + this.closeCameraDeviceOnClose + ", enableRestartDelays=" + this.enableRestartDelays + ')';
        }

        private Flags(boolean z15, boolean z16, f fVar, Boolean bool, int i15, boolean z17, boolean z18, boolean z19) {
            this.configureBlankSessionOnStop = z15;
            this.abortCapturesOnStop = z16;
            this.awaitRepeatingRequestBeforeCapture = fVar;
            this.awaitRepeatingRequestOnDisconnect = bool;
            this.finalizeSessionOnCloseBehavior = i15;
            this.closeCaptureSessionOnDisconnect = z17;
            this.closeCameraDeviceOnClose = z18;
            this.enableRestartDelays = z19;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Flags(boolean z15, boolean z16, f fVar, Boolean bool, int i15, boolean z17, boolean z18, boolean z19, int i16, fr.k kVar) {
            Object[] objArr = 0;
            z15 = (i16 & 1) != 0 ? false : z15;
            if ((i16 & 2) != 0) {
                z16 = Build.VERSION.SDK_INT >= 30;
            }
            this(z15, z16, (i16 & 4) != 0 ? new f(objArr == true ? 1 : 0, null, 3, 0 == true ? 1 : 0) : fVar, (i16 & 8) != 0 ? null : bool, (i16 & 16) != 0 ? a.INSTANCE.b() : i15, (i16 & 32) != 0 ? h2.INSTANCE.a() : z17, (i16 & 64) != 0 ? false : z18, (i16 & 128) == 0 ? z19 : false, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000b"}, d2 = {"Lh/s$e;", "", "", "mode", "e", "(I)I", "", "h", "(I)Ljava/lang/String;", "g", "a", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f79067b = e(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f79068c = e(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f79069d = e(2);

        /* JADX INFO: renamed from: h.s$e$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lh/s$e$a;", "", "<init>", "()V", "", "mode", "Lh/s$e;", "a", "(I)I", "NORMAL", "I", "d", "()I", "HIGH_SPEED", "c", "EXTENSION", "b", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final int a(int mode) {
                if (mode != d() && mode != c()) {
                    return e.e(mode);
                }
                if (k.k.f107055a.b()) {
                    c2.e("CXCP", "Custom operating mode " + mode + " conflicts with standard modes");
                }
                throw new IllegalArgumentException(oq.i0.f148189a.toString());
            }

            public final int b() {
                return e.f79069d;
            }

            public final int c() {
                return e.f79068c;
            }

            public final int d() {
                return e.f79067b;
            }

            private Companion() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int e(int i15) {
            return i15;
        }

        public static final boolean f(int i15, int i16) {
            return i15 == i16;
        }

        public static int g(int i15) {
            return Integer.hashCode(i15);
        }

        public static String h(int i15) {
            return "OperatingMode(mode=" + i15 + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lh/s$f;", "", "Loq/b0;", "repeatingFramesToComplete", "Lh/s$f$a;", "completionBehavior", "<init>", "(ILh/s$f$a;Lfr/k;)V", "a", "I", "b", "()I", "Lh/s$f$a;", "()Lh/s$f$a;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int repeatingFramesToComplete;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final a completionBehavior;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lh/s$f$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum a {
            AT_LEAST,
            EXACT;


            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ wq.a f79075d = wq.b.a(b());
        }

        public /* synthetic */ f(int i15, a aVar, fr.k kVar) {
            this(i15, aVar);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getCompletionBehavior() {
            return this.completionBehavior;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getRepeatingFramesToComplete() {
            return this.repeatingFramesToComplete;
        }

        private f(int i15, a aVar) {
            this.repeatingFramesToComplete = i15;
            this.completionBehavior = aVar;
        }

        public /* synthetic */ f(int i15, a aVar, int i16, fr.k kVar) {
            this((i16 & 1) != 0 ? 0 : i15, (i16 & 2) != 0 ? a.AT_LEAST : aVar, null);
        }
    }

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bg\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH&¢\u0006\u0004\b\r\u0010\u000eJî\u0001\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001e2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001e2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020%H¦@¢\u0006\u0004\b*\u0010+Jf\u00101\u001a\b\u0012\u0004\u0012\u00020)0(2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010 2\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001e2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u00100\u001a\u00020%H¦@¢\u0006\u0004\b1\u00102J>\u00105\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0002\u00103\u001a\u00020 2\b\b\u0002\u00104\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u00100\u001a\u00020%H¦@¢\u0006\u0004\b5\u00106J \u00108\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0002\u00107\u001a\u00020 H¦@¢\u0006\u0004\b8\u00109ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006:À\u0006\u0003"}, d2 = {"Lh/s$g;", "Lh/o;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lh/g1;", "request", "Loq/i0;", "L0", "(Lh/g1;)V", "stopRepeating", "()V", "", "requests", "p0", "(Ljava/util/List;)V", "Lh/a;", "aeMode", "Lh/b;", "afMode", "Lh/d;", "awbMode", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Lh/z0;", "aeLockBehavior", "afLockBehavior", "awbLockBehavior", "afTriggerStartAeMode", "Lkotlin/Function1;", "Lh/q0;", "", "convergedCondition", "lockedCondition", "", "frameLimit", "", "convergedTimeLimitNs", "lockedTimeLimitNs", "Lju/w0;", "Lh/m1;", "p3", "(Lh/a;Lh/b;Lh/d;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lh/z0;Lh/z0;Lh/z0;Lh/a;Ler/l;Ler/l;IJJLtq/e;)Ljava/lang/Object;", "ae", "af", "awb", "unlockedCondition", "timeLimitNs", "z1", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ler/l;IJLtq/e;)Ljava/lang/Object;", "triggerAf", "waitForAwb", "l2", "(ZZIJLtq/e;)Ljava/lang/Object;", "cancelAf", "b2", "(ZLtq/e;)Ljava/lang/Object;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface g extends o, AutoCloseable {
        static /* synthetic */ Object R3(g gVar, boolean z15, boolean z16, int i15, long j15, tq.e eVar, int i16, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock3AForCapture");
            }
            if ((i16 & 1) != 0) {
                z15 = true;
            }
            if ((i16 & 2) != 0) {
                z16 = false;
            }
            if ((i16 & 4) != 0) {
                i15 = 60;
            }
            if ((i16 & 8) != 0) {
                j15 = 3000000000L;
            }
            int i17 = i15;
            return gVar.l2(z15, z16, i17, j15, eVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ Object T2(g gVar, Boolean bool, Boolean bool2, Boolean bool3, er.l lVar, int i15, long j15, tq.e eVar, int i16, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock3A");
            }
            if ((i16 & 1) != 0) {
                bool = null;
            }
            if ((i16 & 2) != 0) {
                bool2 = null;
            }
            if ((i16 & 4) != 0) {
                bool3 = null;
            }
            if ((i16 & 8) != 0) {
                lVar = null;
            }
            if ((i16 & 16) != 0) {
                i15 = 60;
            }
            if ((i16 & 32) != 0) {
                j15 = 3000000000L;
            }
            return gVar.z1(bool, bool2, bool3, lVar, i15, j15, eVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ Object Z2(g gVar, h.a aVar, h.b bVar, d dVar, List list, List list2, List list3, z0 z0Var, z0 z0Var2, z0 z0Var3, h.a aVar2, er.l lVar, er.l lVar2, int i15, long j15, long j16, tq.e eVar, int i16, Object obj) {
            if (obj == null) {
                return gVar.p3((i16 & 1) != 0 ? null : aVar, (i16 & 2) != 0 ? null : bVar, (i16 & 4) != 0 ? null : dVar, (i16 & 8) != 0 ? null : list, (i16 & 16) != 0 ? null : list2, (i16 & 32) != 0 ? null : list3, (i16 & 64) != 0 ? null : z0Var, (i16 & 128) != 0 ? null : z0Var2, (i16 & 256) != 0 ? null : z0Var3, (i16 & 512) != 0 ? null : aVar2, (i16 & 1024) != 0 ? null : lVar, (i16 & 2048) != 0 ? null : lVar2, (i16 & PKIFailureInfo.certConfirmed) != 0 ? 60 : i15, (i16 & PKIFailureInfo.certRevoked) != 0 ? 3000000000L : j15, (i16 & 16384) != 0 ? 3000000000L : j16, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock3A--tS25XM");
        }

        void L0(g1 request);

        Object b2(boolean z15, tq.e<? super ju.w0<Result3A>> eVar);

        Object l2(boolean z15, boolean z16, int i15, long j15, tq.e<? super ju.w0<Result3A>> eVar);

        void p0(List<g1> requests);

        Object p3(h.a aVar, h.b bVar, d dVar, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, z0 z0Var, z0 z0Var2, z0 z0Var3, h.a aVar2, er.l<? super q0, Boolean> lVar, er.l<? super q0, Boolean> lVar2, int i15, long j15, long j16, tq.e<? super ju.w0<Result3A>> eVar);

        void stopRepeating();

        Object z1(Boolean bool, Boolean bool2, Boolean bool3, er.l<? super q0, Boolean> lVar, int i15, long j15, tq.e<? super ju.w0<Result3A>> eVar);
    }
}
