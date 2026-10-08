package m04;

import e04.BiometricData;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lm04/e;", "Lg04/e;", "Lf04/a;", "biometricRepository", "<init>", "(Lf04/a;)V", "Lgz/b$a$a;", "params", "", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lf04/a;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements g04.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f04.a biometricRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122198d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f122199e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f122201g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122199e = obj;
            this.f122201g |= PKIFailureInfo.systemUnavail;
            return e.this.c(null, this);
        }
    }

    public e(f04.a aVar) {
        this.biometricRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super Boolean> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f122201g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f122201g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objW = aVar.f122199e;
        Object objE = uq.b.e();
        int i16 = aVar.f122201g;
        if (i16 == 0) {
            u.b(objW);
            f04.a aVar2 = this.biometricRepository;
            aVar.f122198d = vq.j.a(c1792a);
            aVar.f122201g = 1;
            objW = aVar2.W(aVar);
            if (objW == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objW);
        }
        return vq.b.a(!(((BiometricData) objW).getInAppStatus() instanceof e04.e.a));
    }
}
