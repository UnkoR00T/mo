package a44;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k34.DocumentSummaryData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"La44/k1;", "Lq34/j1;", "Lu34/b;", "documentsSummaryLocalRepository", "<init>", "(Lu34/b;)V", "Lq34/j1$a;", "params", "", "d", "(Lq34/j1$a;Ltq/e;)Ljava/lang/Object;", "a", "Lu34/b;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k1 implements q34.j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u34.b documentsSummaryLocalRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3119e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3121g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3119e = obj;
            this.f3121g |= PKIFailureInfo.systemUnavail;
            return k1.this.c(null, this);
        }
    }

    public k1(u34.b bVar) {
        this.documentsSummaryLocalRepository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(q34.j1.Params params, tq.e<? super Boolean> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f3121g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f3121g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objH = aVar.f3119e;
        Object objE = uq.b.e();
        int i16 = aVar.f3121g;
        boolean z15 = true;
        if (i16 == 0) {
            oq.u.b(objH);
            u34.b bVar = this.documentsSummaryLocalRepository;
            String documentIid = params.getDocumentIid();
            aVar.f3118d = params;
            aVar.f3121g = 1;
            objH = bVar.h(documentIid, aVar);
            if (objH == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (q34.j1.Params) aVar.f3118d;
            oq.u.b(objH);
        }
        dx.i iVar = (dx.i) objH;
        if (iVar instanceof dx.i.Left) {
            return vq.b.a(false);
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        List list = (List) ((dx.i.Right) iVar).b();
        if ((list instanceof Collection) && list.isEmpty()) {
            z15 = false;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (fr.t.c(((DocumentSummaryData) it.next()).getDocumentIID(), params.getDocumentIid())) {
                }
            }
            z15 = false;
        }
        return vq.b.a(z15);
    }
}
