package ev0;

import cv0.BETravelRequestModel;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lev0/n;", "Lev0/m;", "Ldv0/b;", "repository", "<init>", "(Ldv0/b;)V", "Lev0/m$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lev0/m$a;Ltq/e;)Ljava/lang/Object;", "a", "Ldv0/b;", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dv0.b repository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f53793d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f53794e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f53796g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f53794e = obj;
            this.f53796g |= PKIFailureInfo.systemUnavail;
            return n.this.c(null, this);
        }
    }

    public n(dv0.b bVar) {
        this.repository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(m.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f53796g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f53796g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objG = aVar.f53794e;
        Object objE = uq.b.e();
        int i16 = aVar.f53796g;
        if (i16 == 0) {
            u.b(objG);
            dv0.b bVar = this.repository;
            String travelUuid = params.getTravelUuid();
            BETravelRequestModel model = params.getModel();
            aVar.f53793d = vq.j.a(params);
            aVar.f53796g = 1;
            objG = bVar.g(travelUuid, model, aVar);
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
            dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
            return bVar2 instanceof dx.b.g.c ? new dx.i.Right(i0.f148189a) : new dx.i.Left(bVar2);
        }
        if (iVar instanceof dx.i.Right) {
            return iVar;
        }
        throw new oq.p();
    }
}
