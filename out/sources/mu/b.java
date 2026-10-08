package mu;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0015\u0010\u0016R6\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lmu/b;", "T", "Lmu/d;", "Lkotlin/Function2;", "Llu/w;", "Ltq/e;", "Loq/i0;", "", "block", "Ltq/i;", "context", "", "capacity", "Llu/a;", "onBufferOverflow", "<init>", "(Ler/p;Ltq/i;ILlu/a;)V", "scope", "g", "(Llu/w;Ltq/e;)Ljava/lang/Object;", "Lnu/e;", "h", "(Ltq/i;ILlu/a;)Lnu/e;", "e", "Ler/p;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b<T> extends d<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final er.p<lu.w<? super T>, tq.e<? super oq.i0>, Object> block;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f128163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f128164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b<T> f128165f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f128166g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b<T> bVar, tq.e<? super a> eVar) {
            super(eVar);
            this.f128165f = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f128164e = obj;
            this.f128166g |= PKIFailureInfo.systemUnavail;
            return this.f128165f.g(null, this);
        }
    }

    public /* synthetic */ b(er.p pVar, tq.i iVar, int i15, lu.a aVar, int i16, fr.k kVar) {
        this(pVar, (i16 & 2) != 0 ? tq.j.f191408a : iVar, (i16 & 4) != 0 ? -2 : i15, (i16 & 8) != 0 ? lu.a.SUSPEND : aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mu.d, p086nu.e
    protected Object g(lu.w<? super T> wVar, tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f128166g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f128166g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(this, eVar);
            }
        } else {
            aVar = new a(this, eVar);
        }
        Object obj = aVar.f128164e;
        Object objE = uq.b.e();
        int i16 = aVar.f128166g;
        if (i16 == 0) {
            oq.u.b(obj);
            aVar.f128163d = wVar;
            aVar.f128166g = 1;
            if (super.g(wVar, aVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = (lu.w) aVar.f128163d;
            oq.u.b(obj);
        }
        if (wVar.o()) {
            return oq.i0.f148189a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // mu.d, p086nu.e
    protected p086nu.e<T> h(tq.i context, int capacity, lu.a onBufferOverflow) {
        return new b(this.block, context, capacity, onBufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(er.p<? super lu.w<? super T>, ? super tq.e<? super oq.i0>, ? extends Object> pVar, tq.i iVar, int i15, lu.a aVar) {
        super(pVar, iVar, i15, aVar);
        this.block = pVar;
    }
}
