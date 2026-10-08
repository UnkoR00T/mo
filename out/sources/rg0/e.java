package rg0;

import dx.i;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pf0.LoadAccessTokenResult;
import xy.AccessToken;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lrg0/e;", "Lwy/d;", "Lqf0/a;", "loadAccessTokenUC", "<init>", "(Lqf0/a;)V", "Ldx/i;", "Ldx/b;", "Lxy/a;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lqf0/a;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements wy.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final qf0.a loadAccessTokenUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f173744d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f173746f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f173744d = obj;
            this.f173746f |= PKIFailureInfo.systemUnavail;
            return e.this.a(this);
        }
    }

    public e(qf0.a aVar) {
        this.loadAccessTokenUC = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // wy.d
    public Object a(tq.e<? super i<? extends dx.b, AccessToken>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f173746f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f173746f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f173744d;
        Object objE = uq.b.e();
        int i16 = aVar.f173746f;
        if (i16 == 0) {
            u.b(objC);
            qf0.a aVar2 = this.loadAccessTokenUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            aVar.f173746f = 1;
            objC = aVar2.c(c1792a, aVar);
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
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(((LoadAccessTokenResult) ((i.Right) iVar).b()).getAccessToken());
        }
        throw new p();
    }
}
