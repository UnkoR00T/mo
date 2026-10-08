package g00;

import lu.j;
import mu.g;
import mu.h;
import mu.i;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lg00/a;", "T", "Lmu/g;", "<init>", "()V", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "value", "F", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "Llu/g;", "Llu/g;", "channel", "b", "Lmu/g;", "channelAsFlow", "navigation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@oq.a
public final class a<T> implements g<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f69171c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final lu.g<T> channel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g<T> channelAsFlow;

    public a() {
        lu.g<T> gVarB = j.b(0, null, null, 7, null);
        this.channel = gVarB;
        this.channelAsFlow = i.W(gVarB);
    }

    public final Object F(T t15, e<? super i0> eVar) {
        Object objL = this.channel.l(t15, eVar);
        return objL == uq.b.e() ? objL : i0.f148189a;
    }

    @Override // mu.g
    public Object a(h<? super T> hVar, e<? super i0> eVar) {
        Object objA = this.channelAsFlow.a(hVar, eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }
}
