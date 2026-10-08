package mc;

import er.p;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: mc.i, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H&¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001c*\u00020\u001b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ>\u0010#\u001a\u00028\u0000\"\n\b\u0000\u0010\u001f*\u0004\u0018\u00010\u00102\u0006\u0010 \u001a\u00028\u00002\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00028\u00000!H\u0096\u0001¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%¨\u0006&"}, d2 = {"Lmc/i;", "Ltq/i;", "delegate", "<init>", "(Ltq/i;)V", "old", "new", "a", "(Ltq/i;Ltq/i;)Lmc/i;", "Ltq/i$c;", "key", "D1", "(Ltq/i$c;)Ltq/i;", "context", "n0", "(Ltq/i;)Ltq/i;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ltq/i$b;", "E", "m", "(Ltq/i$c;)Ltq/i$b;", "R", "initial", "Lkotlin/Function2;", "operation", "s1", "(Ljava/lang/Object;Ler/p;)Ljava/lang/Object;", "Ltq/i;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ForwardingCoroutineContext implements tq.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final tq.i delegate;

    public ForwardingCoroutineContext(tq.i iVar) {
        this.delegate = iVar;
    }

    @Override // tq.i
    public tq.i D1(tq.i.c<?> key) {
        return a(this, this.delegate.D1(key));
    }

    public abstract ForwardingCoroutineContext a(tq.i old, tq.i iVar);

    public boolean equals(Object other) {
        return t.c(this.delegate, other);
    }

    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // tq.i
    public <E extends tq.i.b> E m(tq.i.c<E> key) {
        return (E) this.delegate.m(key);
    }

    @Override // tq.i
    public tq.i n0(tq.i context) {
        return a(this, this.delegate.n0(context));
    }

    @Override // tq.i
    public <R> R s1(R initial, p<? super R, ? super tq.i.b, ? extends R> operation) {
        return (R) this.delegate.s1(initial, operation);
    }

    public String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.delegate + ")";
    }
}
