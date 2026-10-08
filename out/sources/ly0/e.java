package ly0;

import java.util.List;
import kh0.BEAirQualityRateDictionary;
import kh0.BEFavoritePointsContainer;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\n2\u0006\u0010\t\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lly0/e;", "", "Lgz/b$a$a;", "", "Lkh0/a;", "Llh0/g;", "getFavoritePointsContainerUC", "<init>", "(Llh0/g;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Llh0/g;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final lh0.g getFavoritePointsContainerUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f121391d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f121392e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f121394g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f121392e = obj;
            this.f121394g |= PKIFailureInfo.systemUnavail;
            return e.this.a(null, this);
        }
    }

    public e(lh0.g gVar) {
        this.getFavoritePointsContainerUC = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, ? extends List<BEAirQualityRateDictionary>>> eVar) throws Throwable {
        a aVar;
        List<BEAirQualityRateDictionary> listN;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f121394g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f121394g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f121392e;
        Object objE = uq.b.e();
        int i16 = aVar.f121394g;
        if (i16 == 0) {
            u.b(objC);
            lh0.g gVar = this.getFavoritePointsContainerUC;
            lh0.g.Params params = new lh0.g.Params(false);
            aVar.f121391d = vq.j.a(c1792a);
            aVar.f121394g = 1;
            objC = gVar.c(params, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new p();
        }
        BEFavoritePointsContainer bEFavoritePointsContainer = (BEFavoritePointsContainer) ((dx.i.Right) iVar).b();
        if (bEFavoritePointsContainer == null || (listN = bEFavoritePointsContainer.c()) == null) {
            listN = v.n();
        }
        return new dx.i.Right(listN);
    }
}
