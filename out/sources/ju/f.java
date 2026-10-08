package ju;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a<\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0007H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\n0\u0007H\u0086@¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"T", "", "Lju/w0;", "deferreds", "", "b", "([Lju/w0;Ltq/e;)Ljava/lang/Object;", "", "a", "(Ljava/util/Collection;Ltq/e;)Ljava/lang/Object;", "Lju/d2;", "Loq/i0;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f105685d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f105686e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f105687f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f105686e = obj;
            this.f105687f |= PKIFailureInfo.systemUnavail;
            return f.c(null, this);
        }
    }

    public static final <T> Object a(Collection<? extends w0<? extends T>> collection, tq.e<? super List<? extends T>> eVar) {
        return collection.isEmpty() ? pq.v.n() : new e((w0[]) collection.toArray(new w0[0])).c(eVar);
    }

    public static final <T> Object b(w0<? extends T>[] w0VarArr, tq.e<? super List<? extends T>> eVar) {
        return w0VarArr.length == 0 ? pq.v.n() : new e(w0VarArr).c(eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(Collection<? extends d2> collection, tq.e<? super oq.i0> eVar) {
        a aVar;
        Iterator it;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f105687f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f105687f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f105686e;
        Object objE = uq.b.e();
        int i16 = aVar.f105687f;
        if (i16 == 0) {
            oq.u.b(obj);
            it = collection.iterator();
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) aVar.f105685d;
            oq.u.b(obj);
        }
        while (it.hasNext()) {
            d2 d2Var = (d2) it.next();
            aVar.f105685d = it;
            aVar.f105687f = 1;
            if (d2Var.T0(aVar) == objE) {
                return objE;
            }
        }
        return oq.i0.f148189a;
    }
}
