package ab4;

import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lab4/b;", "", "Lxa4/a;", "platform", "<init>", "(Lxa4/a;)V", "", "a", "(Ltq/e;)Ljava/lang/Object;", "Lxa4/a;", "applicationlock"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final xa4.a platform;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f5310d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f5312f;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5310d = obj;
            this.f5312f |= PKIFailureInfo.systemUnavail;
            return b.this.a(this);
        }
    }

    public b(xa4.a aVar) {
        this.platform = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(e<? super Long> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f5312f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f5312f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f5310d;
        Object objE = uq.b.e();
        int i16 = aVar.f5312f;
        if (i16 == 0) {
            u.b(objC);
            xa4.a aVar2 = this.platform;
            aVar.f5312f = 1;
            objC = aVar2.c(aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        return vq.b.f(Math.max((((Number) objC).longValue() + 300) - this.platform.e(), 0L));
    }
}
