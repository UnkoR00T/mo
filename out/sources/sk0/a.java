package sk0;

import ge4.x;
import ie4.f;
import java.util.List;
import p071kotlin.Metadata;
import tq.e;
import uk0.HydroWarningAreaDto;
import uk0.HydroWarningDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0002H§@¢\u0006\u0004\b\b\u0010\u0006¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lsk0/a;", "", "Lge4/x;", "", "Luk0/a;", "b", "(Ltq/e;)Ljava/lang/Object;", "Luk0/b;", "a", "disasteralertservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @f("disaster-alert/mobile/api/warnings/hydro")
    Object a(e<? super x<List<HydroWarningDto>>> eVar);

    @f("disaster-alert/mobile/api/warnings/hydro/areas")
    Object b(e<? super x<List<HydroWarningAreaDto>>> eVar);
}
