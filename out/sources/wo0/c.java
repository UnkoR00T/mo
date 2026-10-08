package wo0;

import oo0.IdeaVoteRound;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lwo0/c;", "Lpo0/b;", "Lvo0/a;", "repository", "<init>", "(Lvo0/a;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Loo0/n;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lvo0/a;", "feedbackservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements po0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vo0.a repository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f214246d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f214247e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f214249g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f214247e = obj;
            this.f214249g |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, this);
        }
    }

    public c(vo0.a aVar) {
        this.repository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, IdeaVoteRound>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f214249g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f214249g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objG = aVar.f214247e;
        Object objE = uq.b.e();
        int i16 = aVar.f214249g;
        if (i16 == 0) {
            u.b(objG);
            vo0.a aVar2 = this.repository;
            aVar.f214246d = vq.j.a(c1792a);
            aVar.f214249g = 1;
            objG = aVar2.g(aVar);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objG);
        }
        dx.i iVar = (dx.i) objG;
        if (iVar instanceof dx.i.Left) {
            dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            return bVar instanceof dx.b.g.c ? new dx.i.Right(null) : new dx.i.Left(bVar);
        }
        if (iVar instanceof dx.i.Right) {
            return iVar;
        }
        throw new p();
    }
}
