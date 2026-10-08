package os0;

import dx.i;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Los0/c;", "Lcs0/c;", "Lms0/b;", "cardRepository", "<init>", "(Lms0/b;)V", "Lcs0/c$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lcs0/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lms0/b;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements cs0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ms0.b cardRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f149679d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f149680e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f149682g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f149680e = obj;
            this.f149682g |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, this);
        }
    }

    public c(ms0.b bVar) {
        this.cardRepository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(cs0.c.Params params, tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f149682g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f149682g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f149680e;
        Object objE = uq.b.e();
        int i16 = aVar.f149682g;
        if (i16 == 0) {
            u.b(objC);
            ms0.b bVar = this.cardRepository;
            String cardTokenId = params.getCardTokenId();
            aVar.f149679d = j.a(params);
            aVar.f149682g = 1;
            objC = bVar.c(cardTokenId, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        return ((iVar instanceof i.Left) && (((i.Left) iVar).b() instanceof dx.b.g.c)) ? new i.Right(i0.f148189a) : iVar;
    }
}
