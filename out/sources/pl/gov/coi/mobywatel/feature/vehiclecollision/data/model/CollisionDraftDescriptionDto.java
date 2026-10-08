package pl.gov.coi.mobywatel.feature.vehiclecollision.data.model;

import androidx.annotation.Keep;
import fr.k;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDescriptionDto;", "", "date", "Ljava/time/OffsetDateTime;", "address", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/LocationDetailsDto;", "description", "", "<init>", "(Ljava/time/OffsetDateTime;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/LocationDetailsDto;Ljava/lang/String;)V", "getDate", "()Ljava/time/OffsetDateTime;", "getAddress", "()Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/LocationDetailsDto;", "getDescription", "()Ljava/lang/String;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CollisionDraftDescriptionDto {
    public static final int $stable = 8;

    @c("address")
    private final LocationDetailsDto address;

    @c("dateDescription")
    private final OffsetDateTime date;

    @c("description")
    private final String description;

    public CollisionDraftDescriptionDto(OffsetDateTime offsetDateTime, LocationDetailsDto locationDetailsDto, String str) {
        this.date = offsetDateTime;
        this.address = locationDetailsDto;
        this.description = str;
    }

    public final LocationDetailsDto getAddress() {
        return this.address;
    }

    public final OffsetDateTime getDate() {
        return this.date;
    }

    public final String getDescription() {
        return this.description;
    }

    public /* synthetic */ CollisionDraftDescriptionDto(OffsetDateTime offsetDateTime, LocationDetailsDto locationDetailsDto, String str, int i15, k kVar) {
        this(offsetDateTime, (i15 & 2) != 0 ? null : locationDetailsDto, str);
    }
}
