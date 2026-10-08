package f64;

import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf64/j;", "Ls54/h;", "Le64/b;", "localNotificationsRepository", "<init>", "(Le64/b;)V", "Ls54/h$a;", "params", "Loq/i0;", "d", "(Ls54/h$a;Ltq/e;)Ljava/lang/Object;", "a", "Le64/b;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements s54.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e64.b localNotificationsRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f59609d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f59610e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f59612g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f59610e = obj;
            this.f59612g |= PKIFailureInfo.systemUnavail;
            return j.this.c(null, this);
        }
    }

    public j(e64.b bVar) {
        this.localNotificationsRepository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(s54.h.Params params, tq.e<? super i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f59612g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f59612g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f59610e;
        Object objE = uq.b.e();
        int i16 = aVar.f59612g;
        if (i16 == 0) {
            u.b(obj);
            e64.b bVar = this.localNotificationsRepository;
            r54.b documentSubType = params.getDocumentSubType();
            aVar.f59609d = vq.j.a(params);
            aVar.f59612g = 1;
            if (bVar.i(documentSubType, aVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        return i0.f148189a;
    }
}
