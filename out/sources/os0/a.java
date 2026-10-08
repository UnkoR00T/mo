package os0;

import dx.i;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Los0/a;", "Lcs0/a;", "Lms0/b;", "cardRepository", "<init>", "(Lms0/b;)V", "Lcs0/a$a;", "params", "Loq/i0;", "d", "(Lcs0/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lms0/b;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements cs0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ms0.b cardRepository;

    /* JADX INFO: renamed from: os0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3687a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f149673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f149674e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f149676g;

        C3687a(tq.e<? super C3687a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f149674e = obj;
            this.f149676g |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(ms0.b bVar) {
        this.cardRepository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(cs0.a.Params params, tq.e<? super i0> eVar) throws Throwable {
        C3687a c3687a;
        if (eVar instanceof C3687a) {
            c3687a = (C3687a) eVar;
            int i15 = c3687a.f149676g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3687a.f149676g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3687a = new C3687a(eVar);
            }
        } else {
            c3687a = new C3687a(eVar);
        }
        Object objE = c3687a.f149674e;
        Object objE2 = uq.b.e();
        int i16 = c3687a.f149676g;
        if (i16 == 0) {
            u.b(objE);
            ms0.b bVar = this.cardRepository;
            String transactionId = params.getTransactionId();
            String institutionId = params.getInstitutionId();
            c3687a.f149673d = j.a(params);
            c3687a.f149676g = 1;
            objE = bVar.e(transactionId, institutionId, c3687a);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objE);
        }
        i iVar = (i) objE;
        if (iVar instanceof i.Left) {
        } else {
            if (!(iVar instanceof i.Right)) {
                throw new p();
            }
            ((i.Right) iVar).b();
        }
        return i0.f148189a;
    }
}
