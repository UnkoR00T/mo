package p076m2;

import er.p;
import fr.k;
import ju.a3;
import oq.i0;
import p071kotlin.Metadata;
import tq.i;
import y2.b0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\rB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lm2/k6;", "Ltq/i$b;", "Lju/a3;", "Loq/i0;", "", "name", "<init>", "(Ljava/lang/String;)V", "Ltq/i;", "context", "b", "(Ltq/i;)V", "oldState", "a", "(Ltq/i;Loq/i0;)V", "Ljava/lang/String;", "Ltq/i$c;", "getKey", "()Ltq/i$c;", "key", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class k6 implements i.b, a3<i0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: m2.k6$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm2/k6$a;", "Ltq/i$c;", "Lm2/k6;", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements i.c<k6> {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public k6(String str) {
        this.name = str;
    }

    @Override // tq.i
    public /* bridge */ i D1(i.c<?> cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // ju.a3
    public /* bridge */ /* synthetic */ i0 M(i iVar) {
        b(iVar);
        return i0.f148189a;
    }

    @Override // ju.a3
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void C1(i context, i0 oldState) {
        b0.f223360a.b(i0.f148189a);
    }

    public void b(i context) {
        b0.f223360a.a(this.name);
    }

    @Override // tq.i.b
    public i.c<?> getKey() {
        return INSTANCE;
    }

    @Override // tq.i.b, tq.i
    public /* bridge */ <E extends i.b> E m(i.c<E> cVar) {
        return (E) i.b.a.b(this, cVar);
    }

    @Override // tq.i
    public /* bridge */ i n0(i iVar) {
        return i.b.a.d(this, iVar);
    }

    @Override // tq.i
    public /* bridge */ <R> R s1(R r15, p<? super R, ? super i.b, ? extends R> pVar) {
        return (R) i.b.a.a(this, r15, pVar);
    }
}
