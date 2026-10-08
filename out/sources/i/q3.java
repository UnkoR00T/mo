package i;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0003GDJB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b \u0010!J \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b&\u0010'JB\u00100\u001a\u00020/2\u0006\u0010#\u001a\u00020\"2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0(2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+0*2\u0006\u0010.\u001a\u00020-H\u0082@¢\u0006\u0004\b0\u00101J\u001e\u00104\u001a\u00020\u000f2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\"02H\u0082@¢\u0006\u0004\b4\u00105J\u001e\u00108\u001a\u00020\u000f2\f\u00107\u001a\b\u0012\u0004\u0012\u0002060(H\u0082@¢\u0006\u0004\b8\u00109J3\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\u0004\b\u0000\u0010:*\b\u0012\u0004\u0012\u00028\u00000;2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<02H\u0002¢\u0006\u0004\b>\u0010?JK\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010#\u001a\u00020\"2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0(2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020+2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+0*H\u0016¢\u0006\u0004\bD\u0010EJ\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000f0F2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\bG\u0010HJ\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020\u000f0F2\u0006\u0010I\u001a\u00020+H\u0016¢\u0006\u0004\bJ\u0010KJ\u001d\u0010M\u001a\u00020\u000f2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000e0;H\u0001¢\u0006\u0004\bM\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010OR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010QR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u000e0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020_0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u0002060;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006f"}, d2 = {"Li/q3;", "Li/z1;", "Lk/n;", "permissions", "Li/w3;", "retryingCameraStateOpener", "Li/x1;", "camera2DeviceCloser", "Li/c2;", "camera2ErrorProcessor", "Lk/z;", "threads", "<init>", "(Lk/n;Li/w3;Li/x1;Li/c2;Lk/z;)V", "Li/r2;", "Loq/i0;", "q", "(Li/r2;)V", "request", "t", "(Li/r2;Ltq/e;)Ljava/lang/Object;", "Li/u3;", "x", "(Li/u3;Ltq/e;)Ljava/lang/Object;", "Li/r3;", "u", "(Li/r3;Ltq/e;)Ljava/lang/Object;", "Li/t3;", "w", "(Li/t3;Ltq/e;)Ljava/lang/Object;", "Li/s3;", "requestCloseAll", "v", "(Li/s3;Ltq/e;)Ljava/lang/Object;", "Lh/v;", "cameraId", "requestOpen", "Li/q3$c;", "C", "(Ljava/lang/String;Li/u3;Ltq/e;)Ljava/lang/Object;", "", "sharedCameraIds", "Lkotlin/Function1;", "", "isForegroundObserver", "Lju/p0;", "scope", "Li/q3$a;", "r", "(Ljava/lang/String;Ljava/util/List;Ler/l;Lju/p0;Ltq/e;)Ljava/lang/Object;", "", "cameraIds", "o", "(Ljava/util/Set;Ltq/e;)Ljava/lang/Object;", "Li/q3$b;", "pendingRequestOpensToDisconnect", "p", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "T", "", "", "indices", "B", "(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;", "Ll/i;", "graphListener", "isPrewarm", "Li/e4;", "c", "(Ljava/lang/String;Ljava/util/List;Ll/i;ZLer/l;)Li/e4;", "Lju/w0;", "b", "(Ljava/lang/String;)Lju/w0;", "forceCancelOpen", "a", "(Z)Lju/w0;", "requests", "y", "(Ljava/util/List;)V", "Lk/n;", "Li/w3;", "Li/x1;", "d", "Li/c2;", "e", "Lk/z;", "getThreads", "()Lk/z;", "f", "Lju/p0;", "Lk/u;", "g", "Lk/u;", "queue", "", "Li/b;", "h", "Ljava/util/Set;", "activeCameras", "i", "Ljava/util/List;", "pendingRequestOpens", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q3 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.n permissions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w3 retryingCameraStateOpener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x1 camera2DeviceCloser;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c2 camera2ErrorProcessor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ju.p0 scope;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k.u<r2> queue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Set<ActiveCamera> activeCameras;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<b> pendingRequestOpens;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Li/q3$a;", "", "b", "a", "Li/q3$a$a;", "Li/q3$a$b;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private interface a {

        /* JADX INFO: renamed from: i.q3$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Li/q3$a$a;", "Li/q3$a;", "Lh/q;", "lastCameraError", "<init>", "(Lh/q;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh/q;", "()Lh/q;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final h.q lastCameraError;

            public /* synthetic */ Error(h.q qVar, fr.k kVar) {
                this(qVar);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final h.q getLastCameraError() {
                return this.lastCameraError;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.lastCameraError, ((Error) other).lastCameraError);
            }

            public int hashCode() {
                h.q qVar = this.lastCameraError;
                if (qVar == null) {
                    return 0;
                }
                return h.q.s(qVar.getValue());
            }

            public String toString() {
                return "Error(lastCameraError=" + this.lastCameraError + ')';
            }

            private Error(h.q qVar) {
                this.lastCameraError = qVar;
            }
        }

        /* JADX INFO: renamed from: i.q3$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Li/q3$a$b;", "Li/q3$a;", "Li/b;", "activeCamera", "<init>", "(Li/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li/b;", "()Li/b;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ActiveCamera activeCamera;

            public Success(ActiveCamera activeCamera) {
                this.activeCamera = activeCamera;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ActiveCamera getActiveCamera() {
                return this.activeCamera;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && fr.t.c(this.activeCamera, ((Success) other).activeCamera);
            }

            public int hashCode() {
                return this.activeCamera.hashCode();
            }

            public String toString() {
                return "Success(activeCamera=" + this.activeCamera + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Li/q3$b;", "", "Li/u3;", "request", "Li/b;", "activeCamera", "Lk/d0;", "token", "<init>", "(Li/u3;Li/b;Lk/d0;)V", "a", "Li/u3;", "b", "()Li/u3;", "Li/b;", "()Li/b;", "c", "Lk/d0;", "()Lk/d0;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final RequestOpen request;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ActiveCamera activeCamera;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final k.d0 token;

        public b(RequestOpen requestOpen, ActiveCamera activeCamera, k.d0 d0Var) {
            this.request = requestOpen;
            this.activeCamera = activeCamera;
            this.token = d0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActiveCamera getActiveCamera() {
            return this.activeCamera;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final RequestOpen getRequest() {
            return this.request;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final k.d0 getToken() {
            return this.token;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Li/q3$c;", "", "b", "a", "Li/q3$c$a;", "Li/q3$c$b;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private interface c {

        /* JADX INFO: renamed from: i.q3$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Li/q3$c$a;", "Li/q3$c;", "Lh/q;", "lastCameraError", "<init>", "(Lh/q;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh/q;", "()Lh/q;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final h.q lastCameraError;

            public /* synthetic */ Error(h.q qVar, fr.k kVar) {
                this(qVar);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final h.q getLastCameraError() {
                return this.lastCameraError;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.lastCameraError, ((Error) other).lastCameraError);
            }

            public int hashCode() {
                h.q qVar = this.lastCameraError;
                if (qVar == null) {
                    return 0;
                }
                return h.q.s(qVar.getValue());
            }

            public String toString() {
                return "Error(lastCameraError=" + this.lastCameraError + ')';
            }

            private Error(h.q qVar) {
                this.lastCameraError = qVar;
            }
        }

        /* JADX INFO: renamed from: i.q3$c$b, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Li/q3$c$b;", "Li/q3$c;", "Li/b;", "activeCamera", "Lk/d0;", "token", "<init>", "(Li/b;Lk/d0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li/b;", "()Li/b;", "b", "Lk/d0;", "()Lk/d0;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ActiveCamera activeCamera;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final k.d0 token;

            public Success(ActiveCamera activeCamera, k.d0 d0Var) {
                this.activeCamera = activeCamera;
                this.token = d0Var;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ActiveCamera getActiveCamera() {
                return this.activeCamera;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final k.d0 getToken() {
                return this.token;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return fr.t.c(this.activeCamera, success.activeCamera) && fr.t.c(this.token, success.token);
            }

            public int hashCode() {
                return (this.activeCamera.hashCode() * 31) + this.token.hashCode();
            }

            public String toString() {
                return "Success(activeCamera=" + this.activeCamera + ", token=" + this.token + ')';
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87345d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f87347f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f87349h;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f87347f = obj;
            this.f87349h |= PKIFailureInfo.systemUnavail;
            return q3.this.o(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87350d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87351e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f87352f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f87353g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f87355j;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f87353g = obj;
            this.f87355j |= PKIFailureInfo.systemUnavail;
            return q3.this.r(null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f87357e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f87359g;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f87357e = obj;
            this.f87359g |= PKIFailureInfo.systemUnavail;
            return q3.this.u(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f87362f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f87364h;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f87362f = obj;
            this.f87364h |= PKIFailureInfo.systemUnavail;
            return q3.this.v(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87366e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f87367f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f87369h;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f87367f = obj;
            this.f87369h |= PKIFailureInfo.systemUnavail;
            return q3.this.w(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f87372f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f87373g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f87375j;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f87373g = obj;
            this.f87375j |= PKIFailureInfo.systemUnavail;
            return q3.this.x(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class j extends fr.q implements er.l<List<r2>, oq.i0> {
        j(Object obj) {
            super(1, obj, q3.class, "prune", "prune$camera_camera2_pipe(Ljava/util/List;)V", 0);
        }

        public final void E(List<r2> list) {
            ((q3) this.f66391b).y(list);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(List<r2> list) {
            E(list);
            return oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li/r2;", "it", "Loq/i0;", "<anonymous>", "(Li/r2;)V"}, k = 3, mv = {2, 1, 0})
    static final class k extends vq.k implements er.p<r2, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87376e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f87377f;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f87376e;
            if (i15 == 0) {
                oq.u.b(obj);
                r2 r2Var = (r2) this.f87377f;
                q3 q3Var = q3.this;
                this.f87376e = 1;
                if (q3Var.t(r2Var, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(r2 r2Var, tq.e<? super oq.i0> eVar) {
            return ((k) v(r2Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            k kVar = q3.this.new k(eVar);
            kVar.f87377f = obj;
            return kVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class l extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87379d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87380e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f87381f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f87382g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f87383h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f87385k;

        l(tq.e<? super l> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f87383h = obj;
            this.f87385k |= PKIFailureInfo.systemUnavail;
            return q3.this.C(null, null, this);
        }
    }

    public q3(k.n nVar, w3 w3Var, x1 x1Var, c2 c2Var, k.z zVar) {
        this.permissions = nVar;
        this.retryingCameraStateOpener = w3Var;
        this.camera2DeviceCloser = x1Var;
        this.camera2ErrorProcessor = c2Var;
        this.threads = zVar;
        ju.p0 cameraPipeScope = zVar.getCameraPipeScope();
        this.scope = cameraPipeScope;
        this.queue = k.u.INSTANCE.a(new k.u(0, new j(this), null, new k(null), 5, null), cameraPipeScope);
        this.activeCameras = new LinkedHashSet();
        this.pendingRequestOpens = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(r2 r2Var, Throwable th4) {
        ju.x<oq.i0> xVarB = ((RequestCloseById) r2Var).b();
        oq.i0 i0Var = oq.i0.f148189a;
        xVarB.d0(i0Var);
        return i0Var;
    }

    private final <T> List<T> B(List<T> list, Set<Integer> set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = pq.v.T0(set).iterator();
        while (it.hasNext()) {
            arrayList.add(list.remove(((Number) it.next()).intValue() - arrayList.size()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0092  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:65:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[LOOP:0: B:17:0x0062->B:67:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0094 -> B:28:0x0096). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object C(java.lang.String r13, i.RequestOpen r14, tq.e<? super i.q3.c> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.q3.C(java.lang.String, i.u3, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:45:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0110 -> B:46:0x0113). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:31:0x00bc
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object o(java.util.Set<h.v> r9, tq.e<? super oq.i0> r10) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.q3.o(java.util.Set, tq.e):java.lang.Object");
    }

    private final Object p(List<b> list, tq.e<? super oq.i0> eVar) {
        for (b bVar : list) {
            bVar.getToken().b();
            this.pendingRequestOpens.remove(bVar);
        }
        return oq.i0.f148189a;
    }

    private final void q(r2 r2Var) {
        if (r2Var instanceof RequestOpen) {
            e4.a(((RequestOpen) r2Var).getVirtualCamera(), null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(String str, List<h.v> list, er.l<? super oq.i0, Boolean> lVar, ju.p0 p0Var, tq.e<? super a> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f87355j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f87355j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f87353g;
        Object objE = uq.b.e();
        int i16 = eVar2.f87355j;
        if (i16 == 0) {
            oq.u.b(objB);
            if (k.k.f107055a.a()) {
                h.v.f(str);
            }
            w3 w3Var = this.retryingCameraStateOpener;
            x1 x1Var = this.camera2DeviceCloser;
            eVar2.f87350d = str;
            eVar2.f87351e = list;
            eVar2.f87352f = p0Var;
            eVar2.f87355j = 1;
            objB = w3Var.b(str, x1Var, lVar, eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p0Var = (ju.p0) eVar2.f87352f;
            list = (List) eVar2.f87351e;
            str = (String) eVar2.f87350d;
            oq.u.b(objB);
        }
        OpenCameraResult openCameraResult = (OpenCameraResult) objB;
        return openCameraResult.getCameraState() == null ? new a.Error(openCameraResult.getErrorCode(), null) : new a.Success(new ActiveCamera(openCameraResult.getCameraState(), pq.v.k1(pq.v.M0(list, h.v.a(str))), p0Var, new er.l() { // from class: i.p3
            @Override // er.l
            public final Object b(Object obj) {
                return q3.s(this.f87315a, (ActiveCamera) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(q3 q3Var, ActiveCamera activeCamera) {
        q3Var.queue.p(new RequestClose(activeCamera));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(r2 r2Var, tq.e<? super oq.i0> eVar) throws Throwable {
        if (r2Var instanceof RequestOpen) {
            Object objX = x((RequestOpen) r2Var, eVar);
            return objX == uq.b.e() ? objX : oq.i0.f148189a;
        }
        if (r2Var instanceof RequestClose) {
            Object objU = u((RequestClose) r2Var, eVar);
            return objU == uq.b.e() ? objU : oq.i0.f148189a;
        }
        if (r2Var instanceof RequestCloseById) {
            Object objW = w((RequestCloseById) r2Var, eVar);
            return objW == uq.b.e() ? objW : oq.i0.f148189a;
        }
        if (!(r2Var instanceof s3)) {
            throw new oq.p();
        }
        Object objV = v((s3) r2Var, eVar);
        return objV == uq.b.e() ? objV : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (r9.e(r0) == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(i.RequestClose r9, tq.e<? super oq.i0> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof i.q3.f
            if (r0 == 0) goto L13
            r0 = r10
            i.q3$f r0 = (i.q3.f) r0
            int r1 = r0.f87359g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87359g = r1
            goto L18
        L13:
            i.q3$f r0 = new i.q3$f
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f87357e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f87359g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            oq.u.b(r10)
            goto Lb6
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r0.f87356d
            i.r3 r9 = (i.RequestClose) r9
            oq.u.b(r10)
            goto L9f
        L3d:
            oq.u.b(r10)
            i.b r10 = r9.getActiveCamera()
            java.lang.String r10 = r10.i()
            k.k r2 = k.k.f107055a
            boolean r2 = r2.c()
            if (r2 == 0) goto L53
            h.v.f(r10)
        L53:
            java.util.Set<i.b> r10 = r8.activeCameras
            i.b r2 = r9.getActiveCamera()
            boolean r10 = r10.contains(r2)
            if (r10 == 0) goto L68
            java.util.Set<i.b> r10 = r8.activeCameras
            i.b r2 = r9.getActiveCamera()
            r10.remove(r2)
        L68:
            java.util.List<i.q3$b> r10 = r8.pendingRequestOpens
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L75:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L94
            java.lang.Object r5 = r10.next()
            r6 = r5
            i.q3$b r6 = (i.q3.b) r6
            i.b r6 = r6.getActiveCamera()
            i.b r7 = r9.getActiveCamera()
            boolean r6 = fr.t.c(r6, r7)
            if (r6 == 0) goto L75
            r2.add(r5)
            goto L75
        L94:
            r0.f87356d = r9
            r0.f87359g = r4
            java.lang.Object r10 = r8.p(r2, r0)
            if (r10 != r1) goto L9f
            goto Lb5
        L9f:
            i.b r10 = r9.getActiveCamera()
            r10.f()
            i.b r9 = r9.getActiveCamera()
            r10 = 0
            r0.f87356d = r10
            r0.f87359g = r3
            java.lang.Object r9 = r9.e(r0)
            if (r9 != r1) goto Lb6
        Lb5:
            return r1
        Lb6:
            oq.i0 r9 = oq.i0.f148189a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i.q3.u(i.r3, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:24:0x0077->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (p(r7, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(i.s3 r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof i.q3.g
            if (r0 == 0) goto L13
            r0 = r7
            i.q3$g r0 = (i.q3.g) r0
            int r1 = r0.f87364h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87364h = r1
            goto L18
        L13:
            i.q3$g r0 = new i.q3$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f87362f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f87364h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f87361e
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.f87360d
            i.s3 r2 = (i.s3) r2
            oq.u.b(r7)
            goto L77
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.f87360d
            i.s3 r6 = (i.s3) r6
            oq.u.b(r7)
            goto L59
        L44:
            oq.u.b(r7)
            k.k r7 = k.k.f107055a
            r7.c()
            java.util.List<i.q3$b> r7 = r5.pendingRequestOpens
            r0.f87360d = r6
            r0.f87364h = r4
            java.lang.Object r7 = r5.p(r7, r0)
            if (r7 != r1) goto L59
            goto L8f
        L59:
            java.util.Set<i.b> r7 = r5.activeCameras
            java.util.Iterator r7 = r7.iterator()
        L5f:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r7.next()
            i.b r2 = (i.ActiveCamera) r2
            r2.f()
            goto L5f
        L6f:
            java.util.Set<i.b> r7 = r5.activeCameras
            java.util.Iterator r7 = r7.iterator()
            r2 = r6
            r6 = r7
        L77:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L90
            java.lang.Object r7 = r6.next()
            i.b r7 = (i.ActiveCamera) r7
            r0.f87360d = r2
            r0.f87361e = r6
            r0.f87364h = r3
            java.lang.Object r7 = r7.e(r0)
            if (r7 != r1) goto L77
        L8f:
            return r1
        L90:
            java.util.Set<i.b> r6 = r5.activeCameras
            r6.clear()
            ju.x r6 = r2.a()
            oq.i0 r7 = oq.i0.f148189a
            r6.d0(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i.q3.v(i.s3, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(RequestCloseById requestCloseById, tq.e<? super oq.i0> eVar) throws Throwable {
        h hVar;
        RequestCloseById requestCloseById2;
        String str;
        Object next;
        RequestCloseById requestCloseById3;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i15 = hVar.f87369h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f87369h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object obj = hVar.f87367f;
        Object objE = uq.b.e();
        int i16 = hVar.f87369h;
        if (i16 != 0) {
            if (i16 == 1) {
                str = (String) hVar.f87366e;
                requestCloseById2 = (RequestCloseById) hVar.f87365d;
                oq.u.b(obj);
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                requestCloseById3 = (RequestCloseById) hVar.f87365d;
                oq.u.b(obj);
            }
            requestCloseById2 = requestCloseById3;
            ju.x<oq.i0> xVarB = requestCloseById2.b();
            oq.i0 i0Var = oq.i0.f148189a;
            xVarB.d0(i0Var);
            return i0Var;
        }
        oq.u.b(obj);
        String activeCameraId = requestCloseById.getActiveCameraId();
        if (k.k.f107055a.c()) {
            h.v.f(requestCloseById.getActiveCameraId());
        }
        List<b> list = this.pendingRequestOpens;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (h.v.d(((b) obj2).getRequest().getVirtualCamera().getCameraId(), activeCameraId)) {
                arrayList.add(obj2);
            }
        }
        hVar.f87365d = requestCloseById;
        hVar.f87366e = activeCameraId;
        hVar.f87369h = 1;
        if (p(arrayList, hVar) != objE) {
            requestCloseById2 = requestCloseById;
            str = activeCameraId;
        }
        return objE;
        Iterator<T> it = this.activeCameras.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!h.v.d(((ActiveCamera) next).i(), str));
        ActiveCamera activeCamera = (ActiveCamera) next;
        if (activeCamera != null) {
            this.activeCameras.remove(activeCamera);
            activeCamera.f();
            hVar.f87365d = requestCloseById2;
            hVar.f87366e = null;
            hVar.f87369h = 2;
            if (activeCamera.e(hVar) != objE) {
                requestCloseById3 = requestCloseById2;
                requestCloseById2 = requestCloseById3;
            }
            return objE;
        }
        ju.x<oq.i0> xVarB2 = requestCloseById2.b();
        oq.i0 i0Var2 = oq.i0.f148189a;
        xVarB2.d0(i0Var2);
        return i0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x028f  */
    /* JADX WARN: Code duplicated, block: B:105:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:111:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:120:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:123:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:125:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[LOOP:0: B:86:0x023d->B:128:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:? A[LOOP:1: B:94:0x0263->B:129:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:? A[LOOP:2: B:53:0x015f->B:133:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0151 A[LOOP:3: B:49:0x014b->B:51:0x0151, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0165  */
    /* JADX WARN: Code duplicated, block: B:63:0x019a  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:76:0x0209  */
    /* JADX WARN: Code duplicated, block: B:78:0x020f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0225  */
    /* JADX WARN: Code duplicated, block: B:82:0x022f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0239  */
    /* JADX WARN: Code duplicated, block: B:88:0x0243  */
    /* JADX WARN: Code duplicated, block: B:90:0x0255  */
    /* JADX WARN: Code duplicated, block: B:93:0x025f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0269  */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02b5, code lost:
    
        if (o(r11, r0) == r1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02d6, code lost:
    
        if (r12.g(r11, r0, r0) == r1) goto L117;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x01b8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x01eb, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(i.RequestOpen r11, tq.e<? super oq.i0> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.q3.x(i.u3, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(ju.x xVar, Throwable th4) {
        oq.i0 i0Var = oq.i0.f148189a;
        xVar.d0(i0Var);
        return i0Var;
    }

    @Override // i.z1
    public ju.w0<oq.i0> a(boolean forceCancelOpen) {
        if (forceCancelOpen) {
            this.retryingCameraStateOpener.a();
        }
        s3 s3Var = new s3();
        if (!this.queue.p(s3Var)) {
            if (k.k.f107055a.b()) {
                io.sentry.android.core.c2.e("CXCP", "Camera close all request failed!");
            }
            s3Var.a().d0(oq.i0.f148189a);
        }
        return s3Var.a();
    }

    @Override // i.z1
    public ju.w0<oq.i0> b(String cameraId) {
        RequestCloseById requestCloseById = new RequestCloseById(cameraId, null);
        if (!this.queue.p(requestCloseById)) {
            if (k.k.f107055a.b()) {
                io.sentry.android.core.c2.e("CXCP", "Camera close by ID request failed for " + ((Object) h.v.f(cameraId)) + '!');
            }
            requestCloseById.b().d0(oq.i0.f148189a);
        }
        return requestCloseById.b();
    }

    @Override // i.z1
    public e4 c(String cameraId, List<h.v> sharedCameraIds, l.i graphListener, boolean isPrewarm, er.l<? super oq.i0, Boolean> isForegroundObserver) {
        g4 g4Var = new g4(cameraId, graphListener, this.scope, null);
        if (this.queue.p(new RequestOpen(g4Var, sharedCameraIds, graphListener, isPrewarm, isForegroundObserver))) {
            return g4Var;
        }
        if (k.k.f107055a.b()) {
            io.sentry.android.core.c2.e("CXCP", "Camera open request failed for " + ((Object) h.v.f(cameraId)) + '!');
        }
        graphListener.d(new h.t0.a(h.q.INSTANCE.i(), false, null));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0140  */
    public final void y(List<r2> requests) {
        boolean z15;
        int iNextIndex;
        Integer numValueOf;
        boolean zContains;
        ArrayList arrayList = new ArrayList();
        for (Object obj : requests) {
            if (((r2) obj) instanceof RequestClose) {
                arrayList.add(obj);
            }
        }
        requests.removeAll(arrayList);
        Iterator it = pq.v.N0(arrayList).iterator();
        while (true) {
            z15 = false;
            if (!it.hasNext()) {
                break;
            } else {
                requests.add(0, (r2) it.next());
            }
        }
        ListIterator<r2> listIterator = requests.listIterator(requests.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (listIterator.previous() instanceof s3) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            } else {
                iNextIndex = -1;
                break;
            }
        }
        if (iNextIndex > 0) {
            s3 s3Var = (s3) requests.get(iNextIndex);
            for (int i15 = 0; i15 < iNextIndex; i15++) {
                r2 r2VarRemove = requests.remove(0);
                final ju.x<oq.i0> xVarB = r2VarRemove instanceof RequestCloseById ? ((RequestCloseById) r2VarRemove).b() : r2VarRemove instanceof s3 ? ((s3) r2VarRemove).a() : null;
                if (xVarB != null) {
                    s3Var.a().C0(new er.l() { // from class: i.n3
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return q3.z(xVarB, (Throwable) obj2);
                        }
                    });
                }
                q(r2VarRemove);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i16 = 0;
        for (final r2 r2Var : requests) {
            int i17 = i16 + 1;
            if (!(r2Var instanceof RequestOpen)) {
                if (!(r2Var instanceof RequestCloseById)) {
                    numValueOf = null;
                    break;
                }
                int size = requests.size();
                int i18 = i17;
                while (true) {
                    if (i18 >= size) {
                        numValueOf = null;
                        break;
                    }
                    r2 r2Var2 = requests.get(i18);
                    if ((r2Var2 instanceof RequestCloseById) && h.v.d(((RequestCloseById) r2Var2).getActiveCameraId(), ((RequestCloseById) r2Var).getActiveCameraId())) {
                        numValueOf = Integer.valueOf(i18);
                        break;
                    }
                    i18++;
                }
            } else {
                RequestOpen requestOpen = (RequestOpen) r2Var;
                String cameraId = requestOpen.getVirtualCamera().getCameraId();
                Set setK1 = pq.v.k1(pq.v.M0(requestOpen.a(), h.v.a(cameraId)));
                int size2 = requests.size();
                int i19 = i17;
                while (true) {
                    if (i19 >= size2) {
                        numValueOf = null;
                        break;
                    }
                    r2 r2Var3 = requests.get(i19);
                    if (r2Var3 instanceof RequestCloseById) {
                        zContains = setK1.contains(h.v.a(((RequestCloseById) r2Var3).getActiveCameraId()));
                    } else if (r2Var3 instanceof RequestOpen) {
                        boolean z16 = (requestOpen.getIsPrewarm() || !((RequestOpen) r2Var3).getIsPrewarm()) ? true : z15;
                        RequestOpen requestOpen2 = (RequestOpen) r2Var3;
                        String cameraId2 = requestOpen2.getVirtualCamera().getCameraId();
                        Set setK2 = pq.v.k1(pq.v.M0(requestOpen2.a(), h.v.a(cameraId2)));
                        if (!z16 || (!h.v.d(cameraId, cameraId2) && fr.t.c(setK1, setK2))) {
                            zContains = false;
                        } else {
                            zContains = true;
                        }
                    } else {
                        zContains = false;
                    }
                    if (zContains) {
                        numValueOf = Integer.valueOf(i19);
                        break;
                    } else {
                        i19++;
                        z15 = false;
                    }
                }
            }
            if (numValueOf != null) {
                r2 r2Var4 = requests.get(numValueOf.intValue());
                if (k.k.f107055a.a()) {
                    Objects.toString(r2Var);
                    Objects.toString(r2Var4);
                }
                linkedHashSet.add(Integer.valueOf(i16));
                if ((r2Var instanceof RequestCloseById) && (r2Var4 instanceof RequestCloseById)) {
                    ((RequestCloseById) r2Var4).b().C0(new er.l() { // from class: i.o3
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return q3.A(r2Var, (Throwable) obj2);
                        }
                    });
                }
            }
            i16 = i17;
            z15 = false;
        }
        Iterator it4 = B(requests, linkedHashSet).iterator();
        while (it4.hasNext()) {
            q((r2) it4.next());
        }
    }
}
