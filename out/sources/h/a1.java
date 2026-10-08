package h;

import java.util.HashMap;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0001\bJ&\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lh/a1;", "", "T", "Lh/a1$a;", "key", "c", "(Lh/a1$a;)Ljava/lang/Object;", "default", "a", "(Lh/a1$a;Ljava/lang/Object;)Ljava/lang/Object;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a1 {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u000f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000bB\u001d\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lh/a1$a;", "T", "", "", "name", "Lmr/c;", "type", "<init>", "(Ljava/lang/String;Lmr/c;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Lmr/c;", "c", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Map<String, a<?>> f78810d = new HashMap();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final mr.c<?> type;

        /* JADX INFO: renamed from: h.a1$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\b\b\u0001\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR0\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lh/a1$a$a;", "", "<init>", "()V", "T", "", "name", "Lmr/c;", "type", "Lh/a1$a;", "a", "(Ljava/lang/String;Lmr/c;)Lh/a1$a;", "", "keys", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "getKeys$camera_camera2_pipe$annotations", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final <T> a<T> a(String name, mr.c<T> type) {
                a<T> aVar;
                synchronized (b()) {
                    try {
                        Map<String, a<?>> mapB = a.INSTANCE.b();
                        Object aVar2 = mapB.get(name);
                        if (aVar2 == null) {
                            aVar2 = new a(name, type, null);
                            mapB.put(name, aVar2);
                        }
                        aVar = (a) aVar2;
                        if (!fr.t.c(((a) aVar).type, type)) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return aVar;
            }

            public final Map<String, a<?>> b() {
                return a.f78810d;
            }

            private Companion() {
            }
        }

        public /* synthetic */ a(String str, mr.c cVar, fr.k kVar) {
            this(str, cVar);
        }

        public String toString() {
            return "Metadata.Key(" + this.name + ')';
        }

        private a(String str, mr.c<?> cVar) {
            this.name = str;
            this.type = cVar;
        }
    }

    <T> T a(a<T> key, T t15);

    <T> T c(a<T> key);
}
