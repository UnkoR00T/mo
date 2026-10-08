package h;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b'\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lh/t0;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "b", "e", "d", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"Lh/t0$a;", "Lh/t0;", "Lh/q;", "cameraError", "", "willAttemptRetry", "<init>", "(IZLfr/k;)V", "", "toString", "()Ljava/lang/String;", "b", "I", "a", "()I", "c", "Z", "()Z", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends t0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int cameraError;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean willAttemptRetry;

        public /* synthetic */ a(int i15, boolean z15, fr.k kVar) {
            this(i15, z15);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCameraError() {
            return this.cameraError;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getWillAttemptRetry() {
            return this.willAttemptRetry;
        }

        @Override // h.t0
        /* JADX INFO: renamed from: toString */
        public String getName() {
            return super.getName() + "(cameraError=" + ((Object) q.u(this.cameraError)) + ", willAttemptRetry=" + this.willAttemptRetry + ')';
        }

        private a(int i15, boolean z15) {
            super("GRAPH_ERROR");
            this.cameraError = i15;
            this.willAttemptRetry = z15;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh/t0$b;", "Lh/t0;", "<init>", "()V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends t0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f79079b = new b();

        private b() {
            super("GRAPH_STARTED");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh/t0$c;", "Lh/t0;", "<init>", "()V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends t0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f79080b = new c();

        private c() {
            super("GRAPH_STARTING");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh/t0$d;", "Lh/t0;", "<init>", "()V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends t0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f79081b = new d();

        private d() {
            super("GRAPH_STOPPED");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh/t0$e;", "Lh/t0;", "<init>", "()V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends t0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f79082b = new e();

        private e() {
            super("GRAPH_STOPPING");
        }
    }

    public t0(String str) {
        this.name = str;
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getName() {
        return this.name;
    }
}
