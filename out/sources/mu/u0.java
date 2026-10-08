package mu;

import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R6\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lmu/u0;", "T", "Lmu/f0;", "sharedFlow", "Lkotlin/Function2;", "Lmu/h;", "Ltq/e;", "Loq/i0;", "", "action", "<init>", "(Lmu/f0;Ler/p;)V", "collector", "", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "Lmu/f0;", "b", "Ler/p;", "", "c", "()Ljava/util/List;", "replayCache", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class u0<T> implements f0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f0<T> sharedFlow;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.p<h<? super T>, tq.e<? super oq.i0>, Object> action;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f128414d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ u0<T> f128415e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f128416f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u0<T> u0Var, tq.e<? super a> eVar) {
            super(eVar);
            this.f128415e = u0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f128414d = obj;
            this.f128416f |= PKIFailureInfo.systemUnavail;
            return this.f128415e.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u0(f0<? extends T> f0Var, er.p<? super h<? super T>, ? super tq.e<? super oq.i0>, ? extends Object> pVar) {
        this.sharedFlow = f0Var;
        this.action = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mu.f0, mu.g
    public Object a(h<? super T> hVar, tq.e<?> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f128416f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f128416f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(this, eVar);
            }
        } else {
            aVar = new a(this, eVar);
        }
        Object obj = aVar.f128414d;
        Object objE = uq.b.e();
        int i16 = aVar.f128416f;
        if (i16 == 0) {
            oq.u.b(obj);
            f0<T> f0Var = this.sharedFlow;
            t0 t0Var = new t0(hVar, this.action);
            aVar.f128416f = 1;
            if (f0Var.a(t0Var, aVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        throw new oq.g();
    }

    @Override // mu.f0
    public List<T> c() {
        return this.sharedFlow.c();
    }
}
