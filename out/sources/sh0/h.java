package sh0;

import java.util.List;
import kh0.BEDashboardFavoritePoints;
import kh0.BEFavoriteMeasurementPoint;
import kh0.BEFavoritePointsContainer;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsh0/h;", "Llh0/h;", "Lrh0/a;", "airQualityRepository", "<init>", "(Lrh0/a;)V", "Llh0/h$a;", "params", "Ldx/i;", "Ldx/b;", "Lkh0/d;", "d", "(Llh0/h$a;Ltq/e;)Ljava/lang/Object;", "a", "Lrh0/a;", "airqualityservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements lh0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final rh0.a airQualityRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f181668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f181669e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f181671g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f181669e = obj;
            this.f181671g |= PKIFailureInfo.systemUnavail;
            return h.this.c(null, this);
        }
    }

    public h(rh0.a aVar) {
        this.airQualityRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(lh0.h.Params params, tq.e<? super dx.i<? extends dx.b, BEDashboardFavoritePoints>> eVar) throws Throwable {
        a aVar;
        List<BEFavoriteMeasurementPoint> listN;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f181671g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f181671g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objH = aVar.f181669e;
        Object objE = uq.b.e();
        int i16 = aVar.f181671g;
        if (i16 == 0) {
            u.b(objH);
            rh0.a aVar2 = this.airQualityRepository;
            boolean refresh = params.getRefresh();
            aVar.f181668d = j.a(params);
            aVar.f181671g = 1;
            objH = aVar2.h(refresh, aVar);
            if (objH == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objH);
        }
        dx.i iVar = (dx.i) objH;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new p();
        }
        BEFavoritePointsContainer bEFavoritePointsContainer = (BEFavoritePointsContainer) ((dx.i.Right) iVar).b();
        String widgetPointId = bEFavoritePointsContainer != null ? bEFavoritePointsContainer.getWidgetPointId() : null;
        if (bEFavoritePointsContainer == null || (listN = bEFavoritePointsContainer.a()) == null) {
            listN = v.n();
        }
        return new dx.i.Right(new BEDashboardFavoritePoints(listN, widgetPointId));
    }
}
