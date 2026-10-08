package rh0;

import dx.b;
import dx.i;
import java.util.List;
import kh0.BEAirQualityWidgetPoint;
import kh0.BEBasicMeasurementPoint;
import kh0.BEExtendedMeasurementPoint;
import kh0.BEFavoritePointsContainer;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00022\u0006\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u0013\u0010\fJ$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u0014\u0010\fJ*\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u0002H¦@¢\u0006\u0004\b\u0019\u0010\u0007J\u000f\u0010\u001a\u001a\u00020\u0012H&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lrh0/a;", "", "Ldx/i;", "Ldx/b;", "", "Lkh0/c;", "f", "(Ltq/e;)Ljava/lang/Object;", "", "id", "Lkh0/e;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "refresh", "Lkh0/h;", "h", "(ZLtq/e;)Ljava/lang/Object;", "Loq/i0;", "a", "c", "favouritePointsIdList", "d", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Lkh0/b;", "e", "g", "()V", "airqualityservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(String str, e<? super i<? extends b, i0>> eVar);

    Object b(String str, e<? super i<? extends b, BEExtendedMeasurementPoint>> eVar);

    Object c(String str, e<? super i<? extends b, i0>> eVar);

    Object d(List<String> list, e<? super i<? extends b, i0>> eVar);

    Object e(e<? super i<? extends b, BEAirQualityWidgetPoint>> eVar);

    Object f(e<? super i<? extends b, ? extends List<BEBasicMeasurementPoint>>> eVar);

    void g();

    Object h(boolean z15, e<? super i<? extends b, BEFavoritePointsContainer>> eVar);
}
