package u6;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\nB\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lu6/v0;", "Ltq/i$b;", "parent", "Lu6/o;", "instance", "<init>", "(Lu6/v0;Lu6/o;)V", "Lu6/i;", "candidate", "Loq/i0;", "a", "(Lu6/i;)V", "Lu6/v0;", "b", "Lu6/o;", "Ltq/i$c;", "getKey", "()Ltq/i$c;", "key", "c", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v0 implements tq.i.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f195746d = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 parent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o<?> instance;

    public v0(v0 v0Var, o<?> oVar) {
        this.parent = v0Var;
        this.instance = oVar;
    }

    @Override // tq.i
    public /* bridge */ tq.i D1(tq.i.c<?> cVar) {
        return tq.i.b.a.c(this, cVar);
    }

    public final void a(i<?> candidate) {
        if (this.instance == candidate) {
            throw new IllegalStateException(f195746d.toString());
        }
        v0 v0Var = this.parent;
        if (v0Var != null) {
            v0Var.a(candidate);
        }
    }

    @Override // tq.i.b
    public tq.i.c<?> getKey() {
        return Companion.C5097a.f195749a;
    }

    @Override // tq.i.b, tq.i
    public /* bridge */ <E extends tq.i.b> E m(tq.i.c<E> cVar) {
        return (E) tq.i.b.a.b(this, cVar);
    }

    @Override // tq.i
    public /* bridge */ tq.i n0(tq.i iVar) {
        return tq.i.b.a.d(this, iVar);
    }

    @Override // tq.i
    public /* bridge */ <R> R s1(R r15, er.p<? super R, ? super tq.i.b, ? extends R> pVar) {
        return (R) tq.i.b.a.a(this, r15, pVar);
    }
}
