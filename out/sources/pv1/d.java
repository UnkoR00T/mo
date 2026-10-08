package pv1;

import java.util.List;
import mv1.DynamicDocumentData;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lpv1/d;", "Lpv1/c;", "Lkv1/a;", "dynamicDocumentContainersInteractor", "Lmx/c;", "labelProvider", "<init>", "(Lkv1/a;Lmx/c;)V", "Lpv1/c$a;", "params", "Ldx/i;", "Ldx/b;", "", "Lmv1/c;", "d", "(Lpv1/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lkv1/a;", "Ldx/b$c;", "b", "Ldx/b$c;", "failedLoadingError", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f162872c = dx.b.Business.f45029h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kv1.a dynamicDocumentContainersInteractor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business failedLoadingError;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f162875d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f162876e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f162878g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f162876e = obj;
            this.f162878g |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, this);
        }
    }

    public d(kv1.a aVar, mx.c cVar) {
        this.dynamicDocumentContainersInteractor = aVar;
        this.failedLoadingError = new dx.b.Business(lv1.b.FAILED_LOADING, null, cVar.c(dv1.a.f44638h0), cVar.c(dv1.a.f44636g0), null, cVar.c(dv1.a.J), null, 82, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(c.Params params, tq.e<? super dx.i<? extends dx.b, ? extends List<DynamicDocumentData>>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f162878g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f162878g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objP = aVar.f162876e;
        Object objE = uq.b.e();
        int i16 = aVar.f162878g;
        if (i16 == 0) {
            u.b(objP);
            kv1.a aVar2 = this.dynamicDocumentContainersInteractor;
            rq0.b.EnumC4479b dynamicDocumentType = params.getDynamicDocumentType();
            aVar.f162875d = j.a(params);
            aVar.f162878g = 1;
            objP = aVar2.p(dynamicDocumentType, aVar);
            if (objP == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objP);
        }
        dx.i iVar = (dx.i) objP;
        if (!(iVar instanceof dx.i.Left)) {
            if (iVar instanceof dx.i.Right) {
                return iVar;
            }
            throw new p();
        }
        Object obj = (dx.b) ((dx.i.Left) iVar).b();
        if (obj instanceof dx.b.Parsing) {
            obj = this.failedLoadingError;
        }
        return new dx.i.Left(obj);
    }
}
