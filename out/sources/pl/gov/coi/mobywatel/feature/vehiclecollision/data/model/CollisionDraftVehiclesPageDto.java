package pl.gov.coi.mobywatel.feature.vehiclecollision.data.model;

import androidx.annotation.Keep;
import fr.k;
import java.util.List;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehiclesPageDto;", "", "currentPage", "", "nextPageId", "list", "", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCurrentPage", "()Ljava/lang/String;", "getNextPageId", "getList", "()Ljava/util/List;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CollisionDraftVehiclesPageDto {
    public static final int $stable = 8;

    @c("currentPage")
    private final String currentPage;

    @c("list")
    private final List<CollisionDraftVehicleDto> list;

    @c("nextPageId")
    private final String nextPageId;

    public CollisionDraftVehiclesPageDto(String str, String str2, List<CollisionDraftVehicleDto> list) {
        this.currentPage = str;
        this.nextPageId = str2;
        this.list = list;
    }

    public final String getCurrentPage() {
        return this.currentPage;
    }

    public final List<CollisionDraftVehicleDto> getList() {
        return this.list;
    }

    public final String getNextPageId() {
        return this.nextPageId;
    }

    public /* synthetic */ CollisionDraftVehiclesPageDto(String str, String str2, List list, int i15, k kVar) {
        this(str, (i15 & 2) != 0 ? null : str2, list);
    }
}
