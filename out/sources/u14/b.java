package u14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import vq.j;
import vy.Address;
import w04.LocationDetails;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lu14/b;", "Le14/b;", "Luy/c;", "geocoderManager", "<init>", "(Luy/c;)V", "Le14/b$a;", "params", "Ldx/i;", "Ldx/b;", "", "Lw04/c;", "d", "(Le14/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Luy/c;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements e14.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final uy.c geocoderManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f194371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f194372e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f194374g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f194372e = obj;
            this.f194374g |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(uy.c cVar) {
        this.geocoderManager = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(e14.b.Params params, tq.e<? super dx.i<? extends dx.b, ? extends List<LocationDetails>>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f194374g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f194374g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f194372e;
        Object objE = uq.b.e();
        int i16 = aVar.f194374g;
        if (i16 == 0) {
            u.b(objC);
            uy.c cVar = this.geocoderManager;
            String location = params.getLocation();
            aVar.f194371d = j.a(params);
            aVar.f194374g = 1;
            objC = cVar.c(location, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new p();
        }
        Iterable iterable = (Iterable) ((dx.i.Right) iVar).b();
        ArrayList arrayList = new ArrayList(v.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c.b((Address) it.next()));
        }
        return new dx.i.Right(arrayList);
    }
}
