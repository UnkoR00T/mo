package sh0;

import kh0.BEExtendedMeasurementPoint;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsh0/f;", "Llh0/f;", "Lrh0/a;", "repository", "<init>", "(Lrh0/a;)V", "Llh0/f$a;", "params", "Ldx/i;", "Ldx/b;", "Lkh0/e;", "d", "(Llh0/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Lrh0/a;", "airqualityservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements lh0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final rh0.a repository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f181662d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f181663e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f181665g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f181663e = obj;
            this.f181665g |= PKIFailureInfo.systemUnavail;
            return f.this.c(null, this);
        }
    }

    public f(rh0.a aVar) {
        this.repository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(lh0.f.Params params, tq.e<? super dx.i<? extends dx.b, BEExtendedMeasurementPoint>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f181665g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f181665g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f181663e;
        Object objE = uq.b.e();
        int i16 = aVar.f181665g;
        if (i16 == 0) {
            u.b(objB);
            rh0.a aVar2 = this.repository;
            String id5 = params.getId();
            aVar.f181662d = j.a(params);
            aVar.f181665g = 1;
            objB = aVar2.b(id5, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right((BEExtendedMeasurementPoint) ((dx.i.Right) iVar).b());
        }
        throw new p();
    }
}
