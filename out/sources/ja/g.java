package ja;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lja/g;", "T", "Lmu/h;", "Llu/z;", "channel", "<init>", "(Llu/z;)V", "value", "Loq/i0;", "F", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "a", "Llu/z;", "getChannel", "()Llu/z;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g<T> implements mu.h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final lu.z<T> channel;

    /* JADX WARN: Multi-variable type inference failed */
    public g(lu.z<? super T> zVar) {
        this.channel = zVar;
    }

    @Override // mu.h
    public Object F(T t15, tq.e<? super oq.i0> eVar) {
        Object objL = this.channel.l(t15, eVar);
        return objL == uq.b.e() ? objL : oq.i0.f148189a;
    }
}
