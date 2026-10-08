package tr0;

import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltr0/h;", "Llr0/h;", "Lrr0/a;", "repository", "<init>", "(Lrr0/a;)V", "Llr0/h$a;", "params", "Loq/i0;", "d", "(Llr0/h$a;Ltq/e;)Ljava/lang/Object;", "a", "Lrr0/a;", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements lr0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final rr0.a repository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f191743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f191744e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f191746g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f191744e = obj;
            this.f191746g |= PKIFailureInfo.systemUnavail;
            return h.this.c(null, this);
        }
    }

    public h(rr0.a aVar) {
        this.repository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(lr0.h.Params params, tq.e<? super i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f191746g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f191746g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f191744e;
        Object objE = uq.b.e();
        int i16 = aVar.f191746g;
        if (i16 == 0) {
            u.b(obj);
            rr0.a aVar2 = this.repository;
            String task = params.getTask();
            aVar.f191743d = j.a(params);
            aVar.f191746g = 1;
            if (aVar2.d(task, aVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        return i0.f148189a;
    }
}
