package h;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lh/c0;", "", "Lh/q1;", "id", "", "Lh/e1;", "outputs", "<init>", "(ILjava/util/List;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "a", "I", "()I", "b", "Ljava/util/List;", "()Ljava/util/List;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<e1> outputs;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\fB#\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lh/c0$a;", "", "", "Lh/e1$a;", "outputs", "Lh/v0;", "imageSourceConfig", "<init>", "(Ljava/util/List;Lh/v0;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lh/v0;", "()Lh/v0;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<e1.a> outputs;

        /* JADX INFO: renamed from: h.c0$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lh/c0$a$a;", "", "<init>", "()V", "Lh/e1$a;", "output", "Lh/v0;", "imageSourceConfig", "Lh/c0$a;", "a", "(Lh/e1$a;Lh/v0;)Lh/c0$a;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public static /* synthetic */ a b(Companion companion, e1.a aVar, v0 v0Var, int i15, Object obj) {
                if ((i15 & 2) != 0) {
                    v0Var = null;
                }
                return companion.a(aVar, v0Var);
            }

            public final a a(e1.a output, v0 imageSourceConfig) {
                return new a(pq.v.e(output), imageSourceConfig);
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends e1.a> list, v0 v0Var) {
            this.outputs = list;
            e1.a aVar = (e1.a) pq.v.l0(list);
            List<? extends e1.a> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return;
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (!o1.f(((e1.a) it.next()).getFormat(), aVar.getFormat())) {
                    throw new IllegalStateException("All outputs must have the same format!");
                }
            }
        }

        public final v0 a() {
            return null;
        }

        public final List<e1.a> b() {
            return this.outputs;
        }

        public String toString() {
            return "CameraStream.Config(outputs=" + this.outputs + ", imageSourceConfig=" + ((Object) null) + ')';
        }
    }

    public /* synthetic */ c0(int i15, List list, fr.k kVar) {
        this(i15, list);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final List<e1> b() {
        return this.outputs;
    }

    public String toString() {
        return q1.f(this.id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c0(int i15, List<? extends e1> list) {
        this.id = i15;
        this.outputs = list;
    }
}
