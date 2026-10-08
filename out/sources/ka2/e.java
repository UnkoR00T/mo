package ka2;

import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lka2/e;", "Lz92/d;", "Lja2/b;", "repository", "<init>", "(Lja2/b;)V", "Lz92/d$a;", "params", "Loq/i0;", "d", "(Lz92/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lja2/b;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements z92.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ja2.b repository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f109375d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f109376e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f109378g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f109376e = obj;
            this.f109378g |= PKIFailureInfo.systemUnavail;
            return e.this.c(null, this);
        }
    }

    public e(ja2.b bVar) {
        this.repository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(z92.d.Params params, tq.e<? super i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f109378g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f109378g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f109376e;
        Object objE = uq.b.e();
        int i16 = aVar.f109378g;
        if (i16 == 0) {
            u.b(obj);
            ja2.b bVar = this.repository;
            int olderThanDays = params.getOlderThanDays();
            int exceedingCount = params.getExceedingCount();
            aVar.f109375d = j.a(params);
            aVar.f109378g = 1;
            if (bVar.b(olderThanDays, exceedingCount, aVar) == objE) {
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
