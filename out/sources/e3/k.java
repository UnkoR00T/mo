package e3;

import java.util.List;
import p071kotlin.Metadata;
import p076m2.q1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00122\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Le3/k;", "Le3/i;", "Lq2/g;", "Ltq/i$b;", "Lm2/q1;", "composer", "<init>", "(Lm2/q1;)V", "", "", "composeNode", "", "a", "(Ljava/lang/Throwable;Ljava/lang/Object;)Z", "", "currentOffset", "", "Le3/d;", "b", "(Ljava/lang/Integer;)Ljava/util/List;", "Lm2/q1;", "c", "()Z", "sourceInformationEnabled", "Ltq/i$c;", "getKey", "()Ltq/i$c;", "key", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements i, q2.g, tq.i.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q1 composer;

    /* JADX INFO: renamed from: e3.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Le3/k$a;", "Ltq/i$c;", "Le3/k;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements tq.i.c<k> {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public String toString() {
            return "CompositionErrorContext";
        }

        private Companion() {
        }
    }

    public k(q1 q1Var) {
        this.composer = q1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a e(k kVar, Object obj) {
        return kVar.composer.m0(obj);
    }

    @Override // tq.i
    public /* bridge */ tq.i D1(tq.i.c<?> cVar) {
        return tq.i.b.a.c(this, cVar);
    }

    @Override // e3.i
    public boolean a(Throwable th4, final Object obj) {
        return e.d(th4, new er.a() { // from class: e3.j
            @Override // er.a
            public final Object a() {
                return k.e(this.f47029a, obj);
            }
        });
    }

    @Override // q2.g
    public List<ComposeStackTraceFrame> b(Integer currentOffset) {
        return this.composer.j0();
    }

    @Override // q2.g
    public boolean c() {
        return this.composer.h0();
    }

    @Override // tq.i.b
    public tq.i.c<?> getKey() {
        return INSTANCE;
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
