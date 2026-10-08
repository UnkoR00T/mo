package h21;

import fr0.DocumentConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lh21/h;", "", "Lgz/b$a$a;", "", "Lrq0/b;", "Ld00/a;", "inMemoryCache", "Lkr0/a;", "beFetchDocumentsConfigsUC", "<init>", "(Ld00/a;Lkr0/a;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ld00/a;", "b", "Lkr0/a;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d00.a inMemoryCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kr0.a beFetchDocumentsConfigsUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f80078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f80079e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f80081g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f80079e = obj;
            this.f80081g |= PKIFailureInfo.systemUnavail;
            return h.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldx/i;", "Ldx/b;", "", "Lfr0/g;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends List<? extends DocumentConfig>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80082e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f80082e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            kr0.a aVar = h.this.beFetchDocumentsConfigsUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            this.f80082e = 1;
            Object objC = aVar.c(c1792a, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return h.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, ? extends List<DocumentConfig>>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public h(d00.a aVar, kr0.a aVar2) {
        this.inMemoryCache = aVar;
        this.beFetchDocumentsConfigsUC = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends rq0.b>>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f80081g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f80081g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        a aVar2 = aVar;
        Object objP = aVar2.f80079e;
        Object objE = uq.b.e();
        int i16 = aVar2.f80081g;
        if (i16 == 0) {
            u.b(objP);
            d00.a aVar3 = this.inMemoryCache;
            b bVar = new b(null);
            aVar2.f80078d = vq.j.a(c1792a);
            aVar2.f80081g = 1;
            objP = d00.a.p(aVar3, 75695, 0L, bVar, aVar2, 2, null);
            if (objP == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objP);
        }
        dx.i iVar = (dx.i) objP;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new p();
        }
        List list = (List) ((dx.i.Right) iVar).b();
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DocumentConfig) it.next()).getType());
        }
        return new dx.i.Right(arrayList);
    }
}
