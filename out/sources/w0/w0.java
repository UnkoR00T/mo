package w0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00102\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0011B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lw0/w0;", "Lg4/q1;", "Lg4/g;", "Lf3/m$c;", "Lw0/v0;", "gestureConnection", "<init>", "(Lw0/v0;)V", "r", "Lw0/v0;", "n3", "()Lw0/v0;", "", "T", "()Ljava/lang/Object;", "traverseKey", "s", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class w0 extends f3.m.c implements g4.q1, g4.g {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final v0 gestureConnection;

    /* JADX INFO: renamed from: w0.w0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw0/w0$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public w0(v0 v0Var) {
        this.gestureConnection = v0Var;
    }

    @Override // g4.q1
    /* JADX INFO: renamed from: T */
    public Object getTraverseKey() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: n3, reason: from getter */
    public final v0 getGestureConnection() {
        return this.gestureConnection;
    }
}
