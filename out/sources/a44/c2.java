package a44;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k34.DocumentSummaryData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"La44/c2;", "Lq34/b2;", "Lu34/b;", "documentsSummaryLocalRepository", "Lez/b;", "dateCalculator", "<init>", "(Lu34/b;Lez/b;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lu34/b;", "b", "Lez/b;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c2 implements q34.b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u34.b documentsSummaryLocalRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.b dateCalculator;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f3013f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f3014g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f3015h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f3016j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f3017k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f3018l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f3019m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f3020n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3022q;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3020n = obj;
            this.f3022q |= PKIFailureInfo.systemUnavail;
            return c2.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "Loq/i0;", "<anonymous>", "(Lju/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super List<? extends oq.i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3023e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f3024f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f3026e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Map.Entry<rq0.b, List<DocumentSummaryData>> f3027f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c2 f3028g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Map.Entry<? extends rq0.b, ? extends List<DocumentSummaryData>> entry, c2 c2Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f3027f = entry;
                this.f3028g = c2Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f3026e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    List<DocumentSummaryData> value = this.f3027f.getValue();
                    c2 c2Var = this.f3028g;
                    if (!(value instanceof Collection) || !value.isEmpty()) {
                        Iterator<T> it = value.iterator();
                        while (it.hasNext()) {
                            if (c2Var.dateCalculator.d(((DocumentSummaryData) it.next()).getTimestamp(), DocumentSummaryData.INSTANCE.a())) {
                                u34.b bVar = this.f3028g.documentsSummaryLocalRepository;
                                rq0.b key = this.f3027f.getKey();
                                this.f3026e = 1;
                                if (bVar.d(key, this) != objE) {
                                    break;
                                }
                                return objE;
                            }
                        }
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return oq.i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f3027f, this.f3028g, eVar);
            }
        }

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ju.p0 p0Var = (ju.p0) this.f3024f;
            Object objE = uq.b.e();
            int i15 = this.f3023e;
            if (i15 == 0) {
                oq.u.b(obj);
                u34.b bVar = c2.this.documentsSummaryLocalRepository;
                this.f3024f = p0Var;
                this.f3023e = 1;
                obj = bVar.i(this);
                if (obj != objE) {
                }
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            Map map = (Map) obj;
            c2 c2Var = c2.this;
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(ju.k.b(p0Var, null, null, new a((Map.Entry) it.next(), c2Var, null), 3, null));
            }
            this.f3024f = vq.j.a(p0Var);
            this.f3023e = 2;
            Object objA = ju.f.a(arrayList, this);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super List<oq.i0>> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = c2.this.new b(eVar);
            bVar.f3024f = obj;
            return bVar;
        }
    }

    public c2(u34.b bVar, ez.b bVar2) {
        this.documentsSummaryLocalRepository = bVar;
        this.dateCalculator = bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [gz.b$a$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f3022q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f3022q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f3020n;
        Object objE = uq.b.e();
        int i16 = aVar.f3022q;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        b bVar = new b(null);
                        aVar.f3011d = vq.j.a(c1792a);
                        aVar.f3012e = jVarA;
                        aVar.f3013f = vq.j.a(aVar2);
                        aVar.f3014g = vq.j.a(aVar2);
                        aVar.f3015h = 0;
                        aVar.f3016j = 0;
                        aVar.f3017k = 0;
                        aVar.f3018l = 0;
                        aVar.f3019m = 0;
                        aVar.f3022q = 1;
                        Object objE2 = ju.q0.e(bVar, aVar);
                        if (objE2 == objE) {
                            return objE;
                        }
                        obj = objE2;
                    } catch (ex.c e16) {
                        e15 = e16;
                        new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        c1792a = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(c1792a));
                        dx.i iVarA = c1792a.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                new dx.i.Right((List) obj);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
        return oq.i0.f148189a;
    }
}
