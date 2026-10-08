package h;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: h.m1, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lh/m1;", "", "Lh/m1$a;", "status", "Lh/q0;", "frameMetadata", "<init>", "(ILh/q0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lh/q0;", "()Lh/q0;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Result3A {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q0 frameMetadata;

    /* JADX INFO: renamed from: h.m1$a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000b"}, d2 = {"Lh/m1$a;", "", "", "value", "f", "(I)I", "", "i", "(I)Ljava/lang/String;", "h", "a", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f78973b = f(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f78974c = f(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f78975d = f(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f78976e = f(3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f78977f = f(4);

        /* JADX INFO: renamed from: h.m1$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lh/m1$a$a;", "", "<init>", "()V", "Lh/m1$a;", "OK", "I", "b", "()I", "FRAME_LIMIT_REACHED", "a", "TIME_LIMIT_REACHED", "e", "SUBMIT_CANCELLED", "c", "SUBMIT_FAILED", "d", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final int a() {
                return a.f78974c;
            }

            public final int b() {
                return a.f78973b;
            }

            public final int c() {
                return a.f78976e;
            }

            public final int d() {
                return a.f78977f;
            }

            public final int e() {
                return a.f78975d;
            }

            private Companion() {
            }
        }

        private static int f(int i15) {
            return i15;
        }

        public static final boolean g(int i15, int i16) {
            return i15 == i16;
        }

        public static int h(int i15) {
            return Integer.hashCode(i15);
        }

        public static String i(int i15) {
            return "Status(value=" + i15 + ')';
        }
    }

    public /* synthetic */ Result3A(int i15, q0 q0Var, fr.k kVar) {
        this(i15, q0Var);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final q0 getFrameMetadata() {
        return this.frameMetadata;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Result3A)) {
            return false;
        }
        Result3A result3A = (Result3A) other;
        return a.g(this.status, result3A.status) && fr.t.c(this.frameMetadata, result3A.frameMetadata);
    }

    public int hashCode() {
        int iH = a.h(this.status) * 31;
        q0 q0Var = this.frameMetadata;
        return iH + (q0Var == null ? 0 : q0Var.hashCode());
    }

    public String toString() {
        return "Result3A(status=" + ((Object) a.i(this.status)) + ", frameMetadata=" + this.frameMetadata + ')';
    }

    private Result3A(int i15, q0 q0Var) {
        this.status = i15;
        this.frameMetadata = q0Var;
    }

    public /* synthetic */ Result3A(int i15, q0 q0Var, int i16, fr.k kVar) {
        this(i15, (i16 & 2) != 0 ? null : q0Var, null);
    }
}
