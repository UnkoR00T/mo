package uj0;

import iy.b0;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Luj0/e;", "Lfj0/e;", "Lrj0/c;", "repository", "<init>", "(Lrj0/c;)V", "Lfj0/e$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lfj0/e$a;Ltq/e;)Ljava/lang/Object;", "a", "Lrj0/c;", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements fj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final rj0.c repository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f198541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f198542e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f198544g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f198542e = obj;
            this.f198544g |= PKIFailureInfo.systemUnavail;
            return e.this.c(null, this);
        }
    }

    public e(rj0.c cVar) {
        this.repository = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(fj0.e.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f198544g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f198544g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objD = aVar.f198542e;
        Object objE = uq.b.e();
        int i16 = aVar.f198544g;
        if (i16 == 0) {
            u.b(objD);
            rj0.c cVar = this.repository;
            b0 wkToken = params.getWkToken();
            aVar.f198541d = j.a(params);
            aVar.f198544g = 1;
            objD = cVar.d(wkToken, aVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objD);
        }
        dx.i iVar = (dx.i) objD;
        if (iVar instanceof dx.i.Left) {
            dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            return bVar instanceof dx.b.g.c ? new dx.i.Right(i0.f148189a) : new dx.i.Left(bVar);
        }
        if (iVar instanceof dx.i.Right) {
            return iVar;
        }
        throw new p();
    }
}
