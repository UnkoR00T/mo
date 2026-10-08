package p076m2;

import er.p;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\rJ5\u0010\u001f\u001a\u00020\t2\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\t0\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\rR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0014\u0010'\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010&¨\u0006("}, d2 = {"Lm2/i3;", "N", "Lm2/c;", "applier", "", "offset", "<init>", "(Lm2/c;I)V", "node", "Loq/i0;", "g", "(Ljava/lang/Object;)V", "j", "()V", "index", "instance", "d", "(ILjava/lang/Object;)V", "f", "count", "b", "(II)V", "from", "to", "c", "(III)V", "clear", "Lkotlin/Function2;", "", "block", "value", "k", "(Ler/p;Ljava/lang/Object;)V", "h", "a", "Lm2/c;", "I", "nesting", "()Ljava/lang/Object;", "current", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i3<N> implements c<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c<N> applier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int offset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int nesting;

    public i3(c<N> cVar, int i15) {
        this.applier = cVar;
        this.offset = i15;
    }

    @Override // p076m2.c
    public N a() {
        return this.applier.a();
    }

    @Override // p076m2.c
    public void b(int index, int count) {
        this.applier.b(index + (this.nesting == 0 ? this.offset : 0), count);
    }

    @Override // p076m2.c
    public void c(int from, int to4, int count) {
        int i15 = this.nesting == 0 ? this.offset : 0;
        this.applier.c(from + i15, to4 + i15, count);
    }

    @Override // p076m2.c
    public void clear() {
        t.b("Clear is not valid on OffsetApplier");
    }

    @Override // p076m2.c
    public void d(int index, N instance) {
        this.applier.d(index + (this.nesting == 0 ? this.offset : 0), instance);
    }

    @Override // p076m2.c
    public void f(int index, N instance) {
        this.applier.f(index + (this.nesting == 0 ? this.offset : 0), instance);
    }

    @Override // p076m2.c
    public void g(N node) {
        this.nesting++;
        this.applier.g(node);
    }

    @Override // p076m2.c
    public void h() {
        this.applier.h();
    }

    @Override // p076m2.c
    public void j() {
        if (!(this.nesting > 0)) {
            t.b("OffsetApplier up called with no corresponding down");
        }
        this.nesting--;
        this.applier.j();
    }

    @Override // p076m2.c
    public void k(p<? super N, Object, i0> block, Object value) {
        this.applier.k(block, value);
    }
}
