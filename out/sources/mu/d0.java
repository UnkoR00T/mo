package mu;

import java.util.List;
import ju.d2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096A¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0014\u0010\u001b\u001a\u00028\u00008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lmu/d0;", "T", "Lmu/p0;", "", "Lnu/r;", "flow", "Lju/d2;", "job", "<init>", "(Lmu/p0;Lju/d2;)V", "Ltq/i;", "context", "", "capacity", "Llu/a;", "onBufferOverflow", "Lmu/g;", "b", "(Ltq/i;ILlu/a;)Lmu/g;", "Lmu/h;", "collector", "", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "Lju/d2;", "getValue", "()Ljava/lang/Object;", "value", "", "c", "()Ljava/util/List;", "replayCache", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d0<T> implements p0<T>, g, p086nu.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ p0<T> f128173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d2 job;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(p0<? extends T> p0Var, d2 d2Var) {
        this.f128173a = p0Var;
        this.job = d2Var;
    }

    @Override // mu.f0, mu.g
    public Object a(h<? super T> hVar, tq.e<?> eVar) {
        return this.f128173a.a(hVar, eVar);
    }

    @Override // p086nu.r
    public g<T> b(tq.i context, int capacity, lu.a onBufferOverflow) {
        return r0.d(this, context, capacity, onBufferOverflow);
    }

    @Override // mu.f0
    public List<T> c() {
        return this.f128173a.c();
    }

    @Override // mu.p0
    public T getValue() {
        return this.f128173a.getValue();
    }
}
