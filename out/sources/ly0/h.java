package ly0;

import ay0.AirQualityWidgetPoint;
import fr.t;
import java.util.Iterator;
import kh0.BEDashboardFavoritePoints;
import kh0.BEFavoriteMeasurementPoint;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lly0/h;", "", "Lgz/b$a$a;", "Lkh0/d;", "Llh0/h;", "loadFavoritePointsContainerUC", "Lez/a;", "currentTimeProvider", "Lky0/b;", "airQualityWidgetRepository", "<init>", "(Llh0/h;Lez/a;Lky0/b;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Llh0/h;", "b", "Lez/a;", "c", "Lky0/b;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final lh0.h loadFavoritePointsContainerUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ky0.b airQualityWidgetRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f121418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f121419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f121420f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f121421g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f121422h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f121423j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f121424k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f121426m;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f121424k = obj;
            this.f121426m |= PKIFailureInfo.systemUnavail;
            return h.this.a(null, this);
        }
    }

    public h(lh0.h hVar, ez.a aVar, ky0.b bVar) {
        this.loadFavoritePointsContainerUC = hVar;
        this.currentTimeProvider = aVar;
        this.airQualityWidgetRepository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0107 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, BEDashboardFavoritePoints>> eVar) throws Throwable {
        a aVar;
        Object next;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f121426m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f121426m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f121424k;
        Object objE = uq.b.e();
        int i16 = aVar.f121426m;
        if (i16 == 0) {
            u.b(objC);
            lh0.h hVar = this.loadFavoritePointsContainerUC;
            lh0.h.Params params = new lh0.h.Params(true);
            aVar.f121418d = vq.j.a(c1792a);
            aVar.f121426m = 1;
            objC = hVar.c(params, aVar);
            if (objC != objE) {
            }
            return objE;
        }
        if (i16 != 1) {
            if (i16 != 2 && i16 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dx.i iVar = (dx.i) aVar.f121419e;
            u.b(objC);
            return iVar;
        }
        c1792a = (gz.b.a.C1792a) aVar.f121418d;
        u.b(objC);
        dx.i iVar2 = (dx.i) objC;
        if (iVar2 instanceof dx.i.Right) {
            BEDashboardFavoritePoints bEDashboardFavoritePoints = (BEDashboardFavoritePoints) ((dx.i.Right) iVar2).b();
            Iterator<T> it = bEDashboardFavoritePoints.a().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!t.c(((BEFavoriteMeasurementPoint) next).getId(), bEDashboardFavoritePoints.getWidgetPointId()));
            AirQualityWidgetPoint airQualityWidgetPointD = jy0.a.d((BEFavoriteMeasurementPoint) next);
            if (airQualityWidgetPointD == null) {
                ky0.b bVar = this.airQualityWidgetRepository;
                hy0.a.NotAdded notAdded = new hy0.a.NotAdded(vq.b.f(this.currentTimeProvider.e()));
                aVar.f121418d = vq.j.a(c1792a);
                aVar.f121419e = iVar2;
                aVar.f121420f = vq.j.a(bEDashboardFavoritePoints);
                aVar.f121421g = vq.j.a(airQualityWidgetPointD);
                aVar.f121422h = 0;
                aVar.f121423j = 0;
                aVar.f121426m = 2;
                if (bVar.c(notAdded, aVar) == objE) {
                    return objE;
                }
            } else {
                ky0.b bVar2 = this.airQualityWidgetRepository;
                hy0.a.Added added = new hy0.a.Added(airQualityWidgetPointD, this.currentTimeProvider.e());
                aVar.f121418d = vq.j.a(c1792a);
                aVar.f121419e = iVar2;
                aVar.f121420f = vq.j.a(bEDashboardFavoritePoints);
                aVar.f121421g = vq.j.a(airQualityWidgetPointD);
                aVar.f121422h = 0;
                aVar.f121423j = 0;
                aVar.f121426m = 3;
                if (bVar2.c(added, aVar) == objE) {
                    return objE;
                }
            }
        }
        return iVar2;
    }
}
