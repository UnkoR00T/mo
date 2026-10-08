package a44;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"La44/i1;", "Lq34/i1;", "Lq34/q1;", "loadCachedAddedDocumentsUC", "<init>", "(Lq34/q1;)V", "Lgz/b$a$a;", "params", "", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lq34/q1;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i1 implements q34.i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q34.q1 loadCachedAddedDocumentsUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3094d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3095e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3097g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3095e = obj;
            this.f3097g |= PKIFailureInfo.systemUnavail;
            return i1.this.c(null, this);
        }
    }

    public i1(q34.q1 q1Var) {
        this.loadCachedAddedDocumentsUC = q1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super Boolean> eVar) throws Throwable {
        a aVar;
        int i15;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i16 = aVar.f3097g;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f3097g = i16 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f3095e;
        Object objE = uq.b.e();
        int i17 = aVar.f3097g;
        if (i17 == 0) {
            oq.u.b(objC);
            q34.q1 q1Var = this.loadCachedAddedDocumentsUC;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            aVar.f3094d = vq.j.a(c1792a);
            aVar.f3097g = 1;
            objC = q1Var.c(c1792a2, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i17 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        List list = (List) objC;
        if ((list instanceof Collection) && list.isEmpty()) {
            i15 = 0;
        } else {
            Iterator it = list.iterator();
            i15 = 0;
            while (it.hasNext()) {
                if (((rq0.b) it.next()).e() && (i15 = i15 + 1) < 0) {
                    pq.v.w();
                }
            }
        }
        return vq.b.a(i15 == 1);
    }
}
