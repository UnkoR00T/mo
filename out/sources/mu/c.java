package mu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0094@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0018\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010 \u001a\u00020\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096@¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004¨\u0006*"}, d2 = {"Lmu/c;", "T", "Lnu/e;", "Llu/y;", "channel", "", "consume", "Ltq/i;", "context", "", "capacity", "Llu/a;", "onBufferOverflow", "<init>", "(Llu/y;ZLtq/i;ILlu/a;)V", "Loq/i0;", "o", "()V", "h", "(Ltq/i;ILlu/a;)Lnu/e;", "Lmu/g;", "i", "()Lmu/g;", "Llu/w;", "scope", "g", "(Llu/w;Ltq/e;)Ljava/lang/Object;", "Lju/p0;", "l", "(Lju/p0;)Llu/y;", "Lmu/h;", "collector", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "", "d", "()Ljava/lang/String;", "Llu/y;", "e", "Z", "Liu/a;", "consumed", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c<T> extends p086nu.e<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f128167f = AtomicIntegerFieldUpdater.newUpdater(c.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final lu.y<T> channel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean consume;

    public /* synthetic */ c(lu.y yVar, boolean z15, tq.i iVar, int i15, lu.a aVar, int i16, fr.k kVar) {
        this(yVar, z15, (i16 & 4) != 0 ? tq.j.f191408a : iVar, (i16 & 8) != 0 ? -3 : i15, (i16 & 16) != 0 ? lu.a.SUSPEND : aVar);
    }

    private final void o() {
        if (this.consume && f128167f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    @Override // p086nu.e, mu.g
    public Object a(h<? super T> hVar, tq.e<? super oq.i0> eVar) throws Throwable {
        if (this.capacity != -3) {
            Object objA = super.a(hVar, eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
        o();
        Object objD = k.d(hVar, this.channel, this.consume, eVar);
        return objD == uq.b.e() ? objD : oq.i0.f148189a;
    }

    @Override // p086nu.e
    protected String d() {
        return "channel=" + this.channel;
    }

    @Override // p086nu.e
    protected Object g(lu.w<? super T> wVar, tq.e<? super oq.i0> eVar) throws Throwable {
        Object objD = k.d(new p086nu.a0(wVar), this.channel, this.consume, eVar);
        return objD == uq.b.e() ? objD : oq.i0.f148189a;
    }

    @Override // p086nu.e
    protected p086nu.e<T> h(tq.i context, int capacity, lu.a onBufferOverflow) {
        return new c(this.channel, this.consume, context, capacity, onBufferOverflow);
    }

    @Override // p086nu.e
    public g<T> i() {
        return new c(this.channel, this.consume, null, 0, null, 28, null);
    }

    @Override // p086nu.e
    public lu.y<T> l(ju.p0 scope) {
        o();
        return this.capacity == -3 ? this.channel : super.l(scope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(lu.y<? extends T> yVar, boolean z15, tq.i iVar, int i15, lu.a aVar) {
        super(iVar, i15, aVar);
        this.channel = yVar;
        this.consume = z15;
    }
}
