package h;

import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bBq\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010 R'\u0010\u0007\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R'\u0010\t\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b!\u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b&\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010*\u001a\u0004\b%\u0010+¨\u0006,"}, d2 = {"Lh/g1;", "", "", "Lh/q1;", "streams", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "parameters", "Lh/a1$a;", "extras", "Lh/g1$a;", "listeners", "Lh/k1;", "template", "Lh/w0;", "inputRequest", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lh/k1;Lh/w0;Lfr/k;)V", "T", "key", "h", "(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;", "", "verbose", "", "i", "(Z)Ljava/lang/String;", "a", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "c", "d", "Lh/k1;", "g", "()Lh/k1;", "Lh/w0;", "()Lh/w0;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<q1> streams;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<CaptureRequest.Key<?>, Object> parameters;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<a1.a<?>, Object> extras;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<a> listeners;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k1 template;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InputRequest inputRequest;

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J'\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\nJ'\u0010!\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b!\u0010\"J/\u0010&\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010-J\u0017\u0010/\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u0010-J\u001f\u00100\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u00101ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00062À\u0006\u0003"}, d2 = {"Lh/g1$a;", "", "Lh/i1;", "requestMetadata", "Lh/r0;", "frameNumber", "Lh/f0;", "timestamp", "Loq/i0;", "Z", "(Lh/i1;JJ)V", "Lh/q0;", "captureResult", "b", "(Lh/i1;JLh/q0;)V", "", "progress", "C", "(Lh/i1;I)V", "Lh/p0;", "totalCaptureResult", "a0", "(Lh/i1;JLh/p0;)V", "result", "K", "Lh/h1;", "requestFailure", "p", "(Lh/i1;JLh/h1;)V", "Lh/n1;", "O", "Lh/q1;", "stream", "J", "(Lh/i1;JI)V", "streamId", "Lh/c1;", "outputId", "h", "(Lh/i1;JII)V", "Lh/g1;", "request", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lh/g1;)V", "M", "(Lh/i1;)V", "V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "r", "(Lh/i1;J)V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        default void C(i1 requestMetadata, int progress) {
        }

        default void H(g1 request) {
        }

        @oq.a
        default void J(i1 requestMetadata, long frameNumber, int stream) {
        }

        default void K(i1 requestMetadata, long frameNumber, p0 result) {
        }

        default void L(i1 requestMetadata) {
        }

        default void M(i1 requestMetadata) {
        }

        default void O(i1 requestMetadata, long frameNumber, long timestamp) {
        }

        default void V(i1 requestMetadata) {
        }

        default void Z(i1 requestMetadata, long frameNumber, long timestamp) {
        }

        default void a0(i1 requestMetadata, long frameNumber, p0 totalCaptureResult) {
        }

        default void b(i1 requestMetadata, long frameNumber, q0 captureResult) {
        }

        default void h(i1 requestMetadata, long frameNumber, int streamId, int outputId) {
        }

        default void p(i1 requestMetadata, long frameNumber, h1 requestFailure) {
        }

        default void r(i1 requestMetadata, long frameNumber) {
        }
    }

    public /* synthetic */ g1(List list, Map map, Map map2, List list2, k1 k1Var, InputRequest inputRequest, fr.k kVar) {
        this(list, map, map2, list2, k1Var, inputRequest);
    }

    private final <T> T h(CaptureRequest.Key<T> key) {
        return (T) this.parameters.get(key);
    }

    private final String i(boolean verbose) {
        String str;
        String str2;
        String str3 = "";
        if (this.template == null) {
            str = "";
        } else {
            str = ", template=" + ((Object) k1.g(this.template.getValue()));
        }
        if (!verbose || this.parameters.isEmpty()) {
            str2 = "";
        } else {
            str2 = ", parameters=" + k.h.f107050a.e(this.parameters, 5);
        }
        if (verbose && !this.extras.isEmpty()) {
            str3 = ", extras=" + k.h.f107050a.e(this.extras, 5);
        }
        return "Request(streams=" + this.streams + str + str2 + str3 + ")@" + Integer.toHexString(hashCode());
    }

    public final <T> T a(CaptureRequest.Key<T> key) {
        return (T) h(key);
    }

    public final Map<a1.a<?>, Object> b() {
        return this.extras;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InputRequest getInputRequest() {
        return this.inputRequest;
    }

    public final List<a> d() {
        return this.listeners;
    }

    public final Map<CaptureRequest.Key<?>, Object> e() {
        return this.parameters;
    }

    public final List<q1> f() {
        return this.streams;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final k1 getTemplate() {
        return this.template;
    }

    public String toString() {
        return i(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private g1(List<q1> list, Map<CaptureRequest.Key<?>, ? extends Object> map, Map<a1.a<?>, ? extends Object> map2, List<? extends a> list2, k1 k1Var, InputRequest inputRequest) {
        this.streams = list;
        this.parameters = map;
        this.extras = map2;
        this.listeners = list2;
        this.template = k1Var;
        this.inputRequest = inputRequest;
    }

    public /* synthetic */ g1(List list, Map map, Map map2, List list2, k1 k1Var, InputRequest inputRequest, int i15, fr.k kVar) {
        this(list, (i15 & 2) != 0 ? pq.v0.i() : map, (i15 & 4) != 0 ? pq.v0.i() : map2, (i15 & 8) != 0 ? pq.v.n() : list2, (i15 & 16) != 0 ? null : k1Var, (i15 & 32) != 0 ? null : inputRequest, null);
    }
}
