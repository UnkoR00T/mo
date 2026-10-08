package m;

import h.g1;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ju.p0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lm/f;", "", "Lm/p;", "sessionLock", "Ll/k;", "graphProcessor", "Lju/p0;", "graphScope", "<init>", "(Lm/p;Ll/k;Lju/p0;)V", "", "Lh/g1$a;", "a", "()Ljava/util/List;", "Lm/p;", "b", "Ll/k;", "c", "Lju/p0;", "d", "Ljava/lang/Object;", "lock", "", "e", "Ljava/util/Set;", "listeners", "", "f", "Z", "dirty", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p sessionLock;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l.k graphProcessor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p0 graphScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Set<g1.a> listeners = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean dirty;

    public f(p pVar, l.k kVar, p0 p0Var) {
        this.sessionLock = pVar;
        this.graphProcessor = kVar;
        this.graphScope = p0Var;
    }

    public final List<g1.a> a() {
        synchronized (this.lock) {
            if (!this.dirty) {
                return null;
            }
            this.dirty = false;
            return v.f1(this.listeners);
        }
    }
}
