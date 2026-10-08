package a44;

import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"La44/r1;", "Lq34/q1;", "Lu34/b;", "documentsSummaryLocalRepository", "<init>", "(Lu34/b;)V", "Lgz/b$a$a;", "params", "", "Lrq0/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lu34/b;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r1 implements q34.q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u34.b documentsSummaryLocalRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3181d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3182e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3184g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3182e = obj;
            this.f3184g |= PKIFailureInfo.systemUnavail;
            return r1.this.c(null, this);
        }
    }

    public r1(u34.b bVar) {
        this.documentsSummaryLocalRepository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super List<? extends rq0.b>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f3184g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f3184g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objI = aVar.f3182e;
        Object objE = uq.b.e();
        int i16 = aVar.f3184g;
        if (i16 == 0) {
            oq.u.b(objI);
            u34.b bVar = this.documentsSummaryLocalRepository;
            aVar.f3181d = vq.j.a(c1792a);
            aVar.f3184g = 1;
            objI = bVar.i(aVar);
            if (objI == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objI);
        }
        List listF1 = pq.v.f1(((Map) objI).keySet());
        if (listF1.isEmpty()) {
            px.f.f163100a.g("No cached documents", px.c.a(this));
        }
        return listF1;
    }
}
