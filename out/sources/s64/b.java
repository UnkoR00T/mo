package s64;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Ls64/b;", "Lh64/b;", "Lr64/a;", "globalSearchRepository", "<init>", "(Lr64/a;)V", "Lgz/b$a$a;", "params", "", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lr64/a;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements h64.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r64.a globalSearchRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f178459d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f178460e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f178462g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f178460e = obj;
            this.f178462g |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(r64.a aVar) {
        this.globalSearchRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super Boolean> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f178462g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f178462g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f178460e;
        Object objE = uq.b.e();
        int i16 = aVar.f178462g;
        if (i16 == 0) {
            oq.u.b(objB);
            r64.a aVar2 = this.globalSearchRepository;
            aVar.f178459d = vq.j.a(c1792a);
            aVar.f178462g = 1;
            objB = aVar2.b(aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        Boolean bool = (Boolean) ((dx.i) objB).a();
        return vq.b.a(bool != null ? bool.booleanValue() : false);
    }
}
