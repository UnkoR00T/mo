package h01;

import h64.i;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh01/b;", "Lf01/b;", "Lix/a;", "inAppReviewPromptRunner", "Lf01/a;", "isAppRatingFeatureFlagActiveUC", "Lh64/i;", "getRateConfigurationUseCase", "<init>", "(Lix/a;Lf01/a;Lh64/i;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lix/a;", "b", "Lf01/a;", "c", "Lh64/i;", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f01.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ix.a inAppReviewPromptRunner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f01.a isAppRatingFeatureFlagActiveUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i getRateConfigurationUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f79191d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f79192e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f79194g;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f79192e = obj;
            this.f79194g |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(ix.a aVar, f01.a aVar2, i iVar) {
        this.inAppReviewPromptRunner = aVar;
        this.isAppRatingFeatureFlagActiveUC = aVar2;
        this.getRateConfigurationUseCase = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, e<? super i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f79194g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f79194g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f79192e;
        Object objE = uq.b.e();
        int i16 = aVar.f79194g;
        if (i16 == 0) {
            u.b(obj);
            f01.a aVar2 = this.isAppRatingFeatureFlagActiveUC;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            if (!aVar2.a(c1792a2).booleanValue() || !this.getRateConfigurationUseCase.a(c1792a2).getNativeRateSupported()) {
                return i0.f148189a;
            }
            ix.a aVar3 = this.inAppReviewPromptRunner;
            aVar.f79191d = j.a(c1792a);
            aVar.f79194g = 1;
            if (aVar3.a(aVar) == objE) {
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
