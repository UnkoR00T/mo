package p056h1;

import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lh1/c3;", "", "", "priority", "Lh1/x2;", "request", "<init>", "(ILh1/x2;)V", "a", "I", "c", "()I", "b", "Lh1/x2;", "d", "()Lh1/x2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f79342e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int priority;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x2 request;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f79341d = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f79343f = 1;

    /* JADX INFO: renamed from: h1.c3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lh1/c3$a;", "", "<init>", "()V", "", "Low", "I", "b", "()I", "High", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final int a() {
            return c3.f79343f;
        }

        public final int b() {
            return c3.f79342e;
        }

        private Companion() {
        }
    }

    public c3(int i15, x2 x2Var) {
        this.priority = i15;
        this.request = x2Var;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final x2 getRequest() {
        return this.request;
    }
}
