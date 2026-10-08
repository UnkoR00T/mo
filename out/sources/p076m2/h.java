package p076m2;

import er.p;
import fr.k;
import p071kotlin.Metadata;
import tq.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lm2/h;", "Ltq/i$b;", "<init>", "()V", "Ltq/i$c;", "getKey", "()Ltq/i$c;", "key", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h implements i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m2.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm2/h$a;", "Ltq/i$c;", "Lm2/h;", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements i.c<h> {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // tq.i
    public /* bridge */ i D1(i.c<?> cVar) {
        return i.b.a.c(this, cVar);
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
