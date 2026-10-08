package wo0;

import fr.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import oo0.Category;
import oo0.CategoryTopics;
import oo0.Topic;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lwo0/a;", "Lpo0/a;", "Lvo0/c;", "repository", "<init>", "(Lvo0/c;)V", "Loo0/c$a;", "params", "Ldx/i;", "Ldx/b;", "", "Loo0/u;", "d", "(Loo0/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lvo0/c;", "feedbackservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements po0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vo0.c repository;

    /* JADX INFO: renamed from: wo0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5676a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f214240d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f214241e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f214243g;

        C5676a(tq.e<? super C5676a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f214241e = obj;
            this.f214243g |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(vo0.c cVar) {
        this.repository = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(Category.a aVar, tq.e<? super dx.i<? extends dx.b, ? extends List<Topic>>> eVar) throws Throwable {
        C5676a c5676a;
        Object next;
        Collection collectionN;
        List<Topic> listD;
        if (eVar instanceof C5676a) {
            c5676a = (C5676a) eVar;
            int i15 = c5676a.f214243g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c5676a.f214243g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c5676a = new C5676a(eVar);
            }
        } else {
            c5676a = new C5676a(eVar);
        }
        Object objA = c5676a.f214241e;
        Object objE = uq.b.e();
        int i16 = c5676a.f214243g;
        if (i16 == 0) {
            u.b(objA);
            vo0.c cVar = this.repository;
            c5676a.f214240d = aVar;
            c5676a.f214243g = 1;
            objA = cVar.a(c5676a);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (Category.a) c5676a.f214240d;
            u.b(objA);
        }
        dx.i iVar = (dx.i) objA;
        if (iVar instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new p();
        }
        Iterator it = ((List) ((dx.i.Right) iVar).b()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!t.c(((CategoryTopics) next).getCategory().getCode().name(), aVar.name()));
        CategoryTopics categoryTopics = (CategoryTopics) next;
        if (categoryTopics == null || (listD = categoryTopics.d()) == null) {
            collectionN = v.n();
        } else {
            collectionN = new ArrayList();
            for (Object obj : listD) {
                if (((Topic) obj).getType() != Topic.b.UNKNOWN) {
                    collectionN.add(obj);
                }
            }
        }
        return new dx.i.Right(collectionN);
    }
}
