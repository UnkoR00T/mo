package mh0;

import ge4.x;
import ie4.b;
import ie4.f;
import ie4.o;
import ie4.p;
import ie4.s;
import oh0.AirQualityWidgetPointDto;
import oh0.FavouritePointWithDictionaryContainerDto;
import oh0.SaveFavouritePointsRequest;
import oh0.SmogMeasurementPointContainerDto;
import oh0.SmogMeasurementPointDetailsDtoExtended;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H§@¢\u0006\u0004\b\f\u0010\nJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0007J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H§@¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0007J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lmh0/a;", "", "", "id", "Lge4/x;", "Loq/i0;", "e", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Loh0/k;", "b", "(Ltq/e;)Ljava/lang/Object;", "Loh0/d;", "d", "Loh0/m;", "g", "Loh0/c;", "c", "pointId", "a", "Loh0/i;", "saveFavouritePointsRequest", "f", "(Loh0/i;Ltq/e;)Ljava/lang/Object;", "airqualityservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @o("air-quality/mobile/api/air-quality/smog/favourite/measurement-point/{pointId}")
    Object a(@s("pointId") String str, e<? super x<i0>> eVar);

    @f("air-quality/mobile/api/air-quality/smog/measurement-points/v2")
    Object b(e<? super x<SmogMeasurementPointContainerDto>> eVar);

    @f("air-quality/mobile/api/air-quality/smog/widget-point")
    Object c(e<? super x<AirQualityWidgetPointDto>> eVar);

    @f("air-quality/mobile/api/air-quality/smog/favourite/measurement-points")
    Object d(e<? super x<FavouritePointWithDictionaryContainerDto>> eVar);

    @b("air-quality/mobile/api/air-quality/smog/favourite/measurement-point/{id}")
    Object e(@s("id") String str, e<? super x<i0>> eVar);

    @p("air-quality/mobile/api/air-quality/smog/favourite/measurement-points")
    Object f(@ie4.a SaveFavouritePointsRequest saveFavouritePointsRequest, e<? super x<i0>> eVar);

    @f("air-quality/mobile/api/air-quality/smog/measurement-points/{id}")
    Object g(@s("id") String str, e<? super x<SmogMeasurementPointDetailsDtoExtended>> eVar);
}
