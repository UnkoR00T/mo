package yj0;

import dx.i;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lyj0/b;", "Ljj0/b;", "Ljj0/a;", "getTrustedProfileStatusUseCase", "<init>", "(Ljj0/a;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ljj0/a;", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements jj0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jj0.a getTrustedProfileStatusUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f227281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f227282e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f227284g;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f227282e = obj;
            this.f227284g |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(jj0.a aVar) {
        this.getTrustedProfileStatusUseCase = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, e<? super i<? extends dx.b, Boolean>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f227284g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f227284g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f227282e;
        Object objE = uq.b.e();
        int i16 = aVar.f227284g;
        if (i16 == 0) {
            u.b(objC);
            jj0.a aVar2 = this.getTrustedProfileStatusUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            aVar.f227281d = j.a(c1792a);
            aVar.f227284g = 1;
            objC = aVar2.c(c1792a2, aVar);
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
            return new i.Right(vq.b.a(((bj0.a) ((i.Right) iVar).b()) == bj0.a.AVAILABLE));
        }
        throw new p();
    }
}
