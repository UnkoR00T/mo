package s64;

import g64.GlobalSearchResult;
import java.util.Locale;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ls64/x;", "Lh64/t;", "Lr64/a;", "globalSearchRepository", "<init>", "(Lr64/a;)V", "Lh64/t$a;", "params", "Lg64/e;", "d", "(Lh64/t$a;Ltq/e;)Ljava/lang/Object;", "a", "Lr64/a;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x implements h64.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r64.a globalSearchRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f178541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f178542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178543f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f178545h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f178543f = obj;
            this.f178545h |= PKIFailureInfo.systemUnavail;
            return x.this.c(null, this);
        }
    }

    public x(r64.a aVar) {
        this.globalSearchRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(h64.t.Params params, tq.e<? super GlobalSearchResult> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f178545h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f178545h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objF = aVar.f178543f;
        Object objE = uq.b.e();
        int i16 = aVar.f178545h;
        if (i16 == 0) {
            oq.u.b(objF);
            String strD = dz.e.d(fu.r.u1(params.getQuery()).toString().toLowerCase(Locale.ROOT));
            r64.a aVar2 = this.globalSearchRepository;
            aVar.f178541d = vq.j.a(params);
            aVar.f178542e = vq.j.a(strD);
            aVar.f178545h = 1;
            objF = aVar2.f(strD, aVar);
            if (objF == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objF);
        }
        return ((dx.i) objF).a();
    }
}
