package ja;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.IndexedValue;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005H\u0086@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00050\u000bH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u001a"}, d2 = {"Lja/l;", "", "T", "<init>", "()V", "Lpq/p0;", "Lja/f0;", "event", "Loq/i0;", "c", "(Lpq/p0;Ltq/e;)Ljava/lang/Object;", "", "b", "(Ltq/e;)Ljava/lang/Object;", "Lja/f0$b;", "a", "()Lja/f0$b;", "Lja/m;", "Lja/m;", "list", "Lsu/a;", "Lsu/a;", "lock", "", "I", "maxEventIndex", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m<T> list = new m<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final su.a lock = su.g.b(false, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int maxEventIndex = -1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f101020d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f101021e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ l<T> f101022f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f101023g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l<T> lVar, tq.e<? super a> eVar) {
            super(eVar);
            this.f101022f = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f101021e = obj;
            this.f101023g |= PKIFailureInfo.systemUnavail;
            return this.f101022f.b(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f101024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f101025e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f101026f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l<T> f101027g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f101028h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l<T> lVar, tq.e<? super b> eVar) {
            super(eVar);
            this.f101027g = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f101026f = obj;
            this.f101028h |= PKIFailureInfo.systemUnavail;
            return this.f101027g.c(null, this);
        }
    }

    public final f0.b<T> a() {
        f0 f0Var = (f0) pq.v.n0(this.list.b());
        if (f0Var != null && (f0Var instanceof f0.b)) {
            f0.b<T> bVar = (f0.b) f0Var;
            if (bVar.getLoadType() == y.REFRESH) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(tq.e<? super List<? extends IndexedValue<? extends f0<T>>>> eVar) throws Throwable {
        a aVar;
        su.a aVar2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f101023g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f101023g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(this, eVar);
            }
        } else {
            aVar = new a(this, eVar);
        }
        Object obj = aVar.f101021e;
        Object objE = uq.b.e();
        int i16 = aVar.f101023g;
        if (i16 == 0) {
            oq.u.b(obj);
            su.a aVar3 = this.lock;
            aVar.f101020d = aVar3;
            aVar.f101023g = 1;
            if (aVar3.h(null, aVar) == objE) {
                return objE;
            }
            aVar2 = aVar3;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (su.a) aVar.f101020d;
            oq.u.b(obj);
        }
        try {
            List<f0<T>> listB = this.list.b();
            int size = (this.maxEventIndex - listB.size()) + 1;
            List<f0<T>> list = listB;
            ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
            int i17 = 0;
            for (T t15 : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    pq.v.x();
                }
                arrayList.add(new IndexedValue(i17 + size, (f0) t15));
                i17 = i18;
            }
            return arrayList;
        } finally {
            aVar2.r(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(IndexedValue<? extends f0<T>> indexedValue, tq.e<? super oq.i0> eVar) throws Throwable {
        b bVar;
        su.a aVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f101028h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f101028h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(this, eVar);
            }
        } else {
            bVar = new b(this, eVar);
        }
        Object obj = bVar.f101026f;
        Object objE = uq.b.e();
        int i16 = bVar.f101028h;
        if (i16 == 0) {
            oq.u.b(obj);
            aVar = this.lock;
            bVar.f101024d = indexedValue;
            bVar.f101025e = aVar;
            bVar.f101028h = 1;
            if (aVar.h(null, bVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            su.a aVar2 = (su.a) bVar.f101025e;
            IndexedValue<? extends f0<T>> indexedValue2 = (IndexedValue) bVar.f101024d;
            oq.u.b(obj);
            aVar = aVar2;
            indexedValue = indexedValue2;
        }
        try {
            this.maxEventIndex = indexedValue.c();
            this.list.a(indexedValue.d());
            oq.i0 i0Var = oq.i0.f148189a;
            return oq.i0.f148189a;
        } finally {
            aVar.r(null);
        }
    }
}
