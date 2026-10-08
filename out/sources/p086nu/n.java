package p086nu;

import er.p;
import p071kotlin.Metadata;
import tq.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0003¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u0012\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0096\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lnu/n;", "Ltq/i;", "", "e", "originalContext", "<init>", "(Ljava/lang/Throwable;Ltq/i;)V", "Ltq/i$b;", "E", "Ltq/i$c;", "key", "m", "(Ltq/i$c;)Ltq/i$b;", "", "R", "initial", "Lkotlin/Function2;", "operation", "s1", "(Ljava/lang/Object;Ler/p;)Ljava/lang/Object;", "context", "n0", "(Ltq/i;)Ltq/i;", "D1", "(Ltq/i$c;)Ltq/i;", "b", "Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ i f138780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Throwable e;

    public n(Throwable th4, i iVar) {
        this.f138780a = iVar;
        this.e = th4;
    }

    @Override // tq.i
    public i D1(i.c<?> key) {
        return this.f138780a.D1(key);
    }

    @Override // tq.i
    public <E extends i.b> E m(i.c<E> key) {
        return (E) this.f138780a.m(key);
    }

    @Override // tq.i
    public i n0(i context) {
        return this.f138780a.n0(context);
    }

    @Override // tq.i
    public <R> R s1(R initial, p<? super R, ? super i.b, ? extends R> operation) {
        return (R) this.f138780a.s1(initial, operation);
    }
}
