package p076m2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\f\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lm2/r1;", "", "Lm2/f4;", "scope", "", "location", "instances", "<init>", "(Lm2/f4;ILjava/lang/Object;)V", "", "d", "()Z", "a", "Lm2/f4;", "c", "()Lm2/f4;", "b", "I", "()I", "f", "(I)V", "Ljava/lang/Object;", "()Ljava/lang/Object;", "e", "(Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f4 scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int location;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object instances;

    public r1(f4 f4Var, int i15, Object obj) {
        this.scope = f4Var;
        this.location = i15;
        this.instances = obj;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getInstances() {
        return this.instances;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f4 getScope() {
        return this.scope;
    }

    public final boolean d() {
        return this.scope.x(this.instances);
    }

    public final void e(Object obj) {
        this.instances = obj;
    }

    public final void f(int i15) {
        this.location = i15;
    }
}
