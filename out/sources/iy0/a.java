package iy0;

import android.content.Context;
import ly0.k;
import oa.n;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.airquality.data.db.MeasurementPointsDatabase;
import xy0.y0;
import xy0.z0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000bH\u0007¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020 2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Liy0/a;", "", "<init>", "()V", "Lky0/b;", "i", "()Lky0/b;", "Ldy0/a;", "dao", "Landroid/content/Context;", "context", "Lky0/a;", "a", "(Ldy0/a;Landroid/content/Context;)Lky0/a;", "Lpl/gov/coi/mobywatel/feature/airquality/data/db/MeasurementPointsDatabase;", "e", "(Landroid/content/Context;)Lpl/gov/coi/mobywatel/feature/airquality/data/db/MeasurementPointsDatabase;", "database", "d", "(Lpl/gov/coi/mobywatel/feature/airquality/data/db/MeasurementPointsDatabase;)Ldy0/a;", "Llh0/d;", "fetchAirQualityWidgetPointUC", "airQualityWidgetRepository", "Lly0/k;", "shouldUpdateWidgetPointUC", "Lez/a;", "currentTimeProvider", "Lh64/n;", "isServiceTemporaryInterruptedUC", "Lby0/c;", "f", "(Llh0/d;Lky0/b;Lly0/k;Lez/a;Lh64/n;)Lby0/c;", "Lby0/b;", "clearAirQualityWidgetTemporaryCacheUC", "airQualityLegacyRepository", "Lby0/a;", "b", "(Lby0/b;Lky0/a;)Lby0/a;", "Llh0/b;", "clearAirQualityRepoCacheUC", "c", "(Llh0/b;Lky0/b;)Lby0/b;", "Lh64/e;", "getFeatureFlagListUseCase", "Lby0/d;", "g", "(Lh64/e;)Lby0/d;", "Lxy0/y0;", "h", "()Lxy0/y0;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f97777a = new a();

    private a() {
    }

    public final ky0.a a(dy0.a dao, Context context) {
        return new gy0.a(dao, context);
    }

    public final by0.a b(by0.b clearAirQualityWidgetTemporaryCacheUC, ky0.a airQualityLegacyRepository) {
        return new ly0.c(clearAirQualityWidgetTemporaryCacheUC, airQualityLegacyRepository);
    }

    public final by0.b c(lh0.b clearAirQualityRepoCacheUC, ky0.b airQualityWidgetRepository) {
        return new ly0.b(clearAirQualityRepoCacheUC, airQualityWidgetRepository);
    }

    public final dy0.a d(MeasurementPointsDatabase database) {
        return database.Z();
    }

    public final MeasurementPointsDatabase e(Context context) {
        return (MeasurementPointsDatabase) n.a(context, MeasurementPointsDatabase.class, "measurement_points_db").e();
    }

    public final by0.c f(lh0.d fetchAirQualityWidgetPointUC, ky0.b airQualityWidgetRepository, k shouldUpdateWidgetPointUC, ez.a currentTimeProvider, h64.n isServiceTemporaryInterruptedUC) {
        return new ly0.f(airQualityWidgetRepository, shouldUpdateWidgetPointUC, currentTimeProvider, isServiceTemporaryInterruptedUC, fetchAirQualityWidgetPointUC);
    }

    public final by0.d g(h64.e getFeatureFlagListUseCase) {
        return new ly0.g(getFeatureFlagListUseCase);
    }

    public final y0 h() {
        return new z0();
    }

    public final ky0.b i() {
        return new gy0.b();
    }
}
