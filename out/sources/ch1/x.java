package ch1;

import ah1.DocumentsSequenceOrder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q34.p1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u001e2\u0006\u0010\u001d\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lch1/x;", "", "Lgz/b$a$a;", "", "Lk34/g;", "Lq34/p1;", "loadCachedAddedDocumentsInfoUC", "Lch1/v;", "getDocumentsOrderDataStoreUseCase", "Lch1/w0;", "updateDocumentsOrderUseCase", "Lch1/i;", "getAllTempShellDocumentsInfoUC", "Lyg1/a;", "dashboardContainersInteractor", "<init>", "(Lq34/p1;Lch1/v;Lch1/w0;Lch1/i;Lyg1/a;)V", "Lrq0/b;", "mainIdentityType", "j", "(Ljava/util/List;Lrq0/b;)Ljava/util/List;", "Lah1/c;", "orderSequence", "k", "(Ljava/util/List;Lah1/c;Lrq0/b;)Ljava/util/List;", "defaultOrder", "Loq/i0;", "i", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "params", "Lmu/g;", "h", "(Lgz/b$a$a;)Lmu/g;", "a", "Lq34/p1;", "b", "Lch1/v;", "c", "Lch1/w0;", "d", "Lch1/i;", "e", "Lyg1/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x implements gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p1 loadCachedAddedDocumentsInfoUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v getDocumentsOrderDataStoreUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w0 updateDocumentsOrderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i getAllTempShellDocumentsInfoUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yg1.a dashboardContainersInteractor;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<List<? extends k34.g>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f27071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f27072b;

        /* JADX INFO: renamed from: ch1.x$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0695a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f27073a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f27074b;

            /* JADX INFO: renamed from: ch1.x$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0696a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f27075d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f27076e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f27077f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f27079h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f27080j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f27081k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                Object f27082l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                Object f27083m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f27084n;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                Object f27085p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                Object f27086q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                Object f27087r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f27088s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f27089t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                int f27090v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                int f27091w;

                public C0696a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f27075d = obj;
                    this.f27076e |= PKIFailureInfo.systemUnavail;
                    return C0695a.this.F(null, this);
                }
            }

            public C0695a(mu.h hVar, x xVar) {
                this.f27073a = hVar;
                this.f27074b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x01a4, code lost:
            
                if (r13.F(r1, r2) == r3) goto L34;
             */
            @Override // mu.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object F(java.lang.Object r19, tq.e r20) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 426
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ch1.x.a.C0695a.F(java.lang.Object, tq.e):java.lang.Object");
            }
        }

        public a(mu.g gVar, x xVar) {
            this.f27071a = gVar;
            this.f27072b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super List<? extends k34.g>> hVar, tq.e eVar) {
            Object objA = this.f27071a.a(new C0695a(hVar, this.f27072b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "Lk34/g;", "<anonymous>", "(Lju/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super List<? extends k34.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f27092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f27093f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x005e  */
        /* JADX WARN: Code duplicated, block: B:23:0x007d A[LOOP:1: B:21:0x0077->B:23:0x007d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:30:0x0095 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:32:0x0058 A[SYNTHETIC] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List list;
            ArrayList arrayList;
            k34.g gVar;
            ArrayList arrayList2;
            Iterator it;
            Object objE = uq.b.e();
            int i15 = this.f27093f;
            if (i15 == 0) {
                oq.u.b(obj);
                p1 p1Var = x.this.loadCachedAddedDocumentsInfoUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f27093f = 1;
                obj = p1Var.c(c1792a, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.f27092e;
                oq.u.b(obj);
            }
            arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                gVar = (k34.g) obj2;
                List list2 = list;
                arrayList2 = new ArrayList(pq.v.y(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((k34.g) it.next()).getType());
                }
                if (!arrayList2.contains(gVar.getType())) {
                    arrayList.add(obj2);
                }
            }
            return pq.v.L0(list, arrayList);
            List list3 = (List) obj;
            i iVar = x.this.getAllTempShellDocumentsInfoUC;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            this.f27092e = list3;
            this.f27093f = 2;
            Object objC = iVar.c(c1792a2, this);
            if (objC != objE) {
                list = list3;
                obj = objC;
                arrayList = new ArrayList();
                while (r8.hasNext()) {
                    gVar = (k34.g) obj2;
                    List list4 = list;
                    arrayList2 = new ArrayList(pq.v.y(list4, 10));
                    it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((k34.g) it.next()).getType());
                    }
                    if (!arrayList2.contains(gVar.getType())) {
                        arrayList.add(obj2);
                    }
                }
                return pq.v.L0(list, arrayList);
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super List<? extends k34.g>> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return x.this.new b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ rq0.b f27095a;

        public c(rq0.b bVar) {
            this.f27095a = bVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Boolean.valueOf(!fr.t.c(((k34.g) t15).getType(), this.f27095a)), Boolean.valueOf(!fr.t.c(((k34.g) t16).getType(), this.f27095a)));
        }
    }

    public x(p1 p1Var, v vVar, w0 w0Var, i iVar, yg1.a aVar) {
        this.loadCachedAddedDocumentsInfoUC = p1Var;
        this.getDocumentsOrderDataStoreUseCase = vVar;
        this.updateDocumentsOrderUseCase = w0Var;
        this.getAllTempShellDocumentsInfoUC = iVar;
        this.dashboardContainersInteractor = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(List<? extends k34.g> list, tq.e<? super oq.i0> eVar) {
        w0 w0Var = this.updateDocumentsOrderUseCase;
        List<? extends k34.g> list2 = list;
        ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((k34.g) it.next()).getType().getReferenceName());
        }
        Object objC = w0Var.c(new w0.Params(new DocumentsSequenceOrder(arrayList)), eVar);
        return objC == uq.b.e() ? objC : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<k34.g> j(List<? extends k34.g> list, rq0.b bVar) {
        return pq.v.U0(list, new c(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<k34.g> k(List<? extends k34.g> list, DocumentsSequenceOrder documentsSequenceOrder, rq0.b bVar) {
        Object next;
        List<String> listA = documentsSequenceOrder.a();
        ArrayList arrayList = new ArrayList();
        for (String str : listA) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fr.t.c(((k34.g) next).getType().getReferenceName(), str));
            k34.g gVar = (k34.g) next;
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        List listI1 = pq.v.i1(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!listI1.contains((k34.g) obj)) {
                arrayList2.add(obj);
            }
        }
        return pq.v.L0(listI1, j(arrayList2, bVar));
    }

    public mu.g<List<k34.g>> h(gz.b.a.C1792a params) {
        return new a((mu.g) this.getDocumentsOrderDataStoreUseCase.a(gz.b.a.C1792a.f78542a), this);
    }
}
