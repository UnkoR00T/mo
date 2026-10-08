package ch1;

import i34.IdentityDeactivateData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lch1/m;", "Lch1/l;", "Lyg1/a;", "dashboardContainersInteractor", "<init>", "(Lyg1/a;)V", "Lch1/l$a;", "params", "Ldx/b;", "d", "(Lch1/l$a;Ltq/e;)Ljava/lang/Object;", "a", "Lyg1/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yg1.a dashboardContainersInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f26918d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f26919e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f26920f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f26922h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f26920f = obj;
            this.f26922h |= PKIFailureInfo.systemUnavail;
            return m.this.c(null, this);
        }
    }

    public m(yg1.a aVar) {
        this.dashboardContainersInteractor = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(l.Params params, tq.e<? super dx.b> eVar) throws Throwable {
        a aVar;
        k34.u uVar;
        dx.i iVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f26922h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f26922h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objG = aVar.f26920f;
        Object objE = uq.b.e();
        int i16 = aVar.f26922h;
        if (i16 == 0) {
            oq.u.b(objG);
            yg1.a aVar2 = this.dashboardContainersInteractor;
            rq0.b documentType = params.getDocumentType();
            aVar.f26918d = vq.j.a(params);
            aVar.f26922h = 1;
            objG = aVar2.g(documentType, aVar);
            if (objG != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            params = (l.Params) aVar.f26918d;
            oq.u.b(objG);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = (k34.u) aVar.f26919e;
            oq.u.b(objG);
        }
        iVar = (dx.i) objG;
        if (iVar instanceof dx.i.Left) {
            return (dx.b) ((dx.i.Left) iVar).b();
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.b.Deactivate(new IdentityDeactivateData(uVar, false, ((Boolean) ((dx.i.Right) iVar).b()).booleanValue()));
        }
        throw new oq.p();
        k34.u uVar2 = (k34.u) objG;
        yg1.a aVar3 = this.dashboardContainersInteractor;
        aVar.f26918d = vq.j.a(params);
        aVar.f26919e = uVar2;
        aVar.f26922h = 2;
        Object objD = aVar3.d(aVar);
        if (objD != objE) {
            objG = objD;
            uVar = uVar2;
            iVar = (dx.i) objG;
            if (iVar instanceof dx.i.Left) {
                return (dx.b) ((dx.i.Left) iVar).b();
            }
            if (iVar instanceof dx.i.Right) {
                return new dx.b.Deactivate(new IdentityDeactivateData(uVar, false, ((Boolean) ((dx.i.Right) iVar).b()).booleanValue()));
            }
            throw new oq.p();
        }
        return objE;
    }
}
