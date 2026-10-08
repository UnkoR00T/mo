package uv0;

import java.time.LocalDate;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: uv0.q, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u000fR\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001a\u0010$¨\u0006%"}, d2 = {"Luv0/q;", "", "Ljava/time/LocalDate;", "date", "", "name", "Luv0/l;", "type", "description", "", "Luv0/r;", "details", "<init>", "(Ljava/time/LocalDate;Ljava/lang/String;Luv0/l;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "Ljava/lang/String;", "c", "Luv0/l;", "getType", "()Luv0/l;", "d", "getDescription", "e", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleHistoryEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final l type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<VehicleHistoryEventDetail> details;

    public VehicleHistoryEvent(LocalDate localDate, String str, l lVar, String str2, List<VehicleHistoryEventDetail> list) {
        this.date = localDate;
        this.name = str;
        this.type = lVar;
        this.description = str2;
        this.details = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    public final List<VehicleHistoryEventDetail> b() {
        return this.details;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleHistoryEvent)) {
            return false;
        }
        VehicleHistoryEvent vehicleHistoryEvent = (VehicleHistoryEvent) other;
        return fr.t.c(this.date, vehicleHistoryEvent.date) && fr.t.c(this.name, vehicleHistoryEvent.name) && this.type == vehicleHistoryEvent.type && fr.t.c(this.description, vehicleHistoryEvent.description) && fr.t.c(this.details, vehicleHistoryEvent.details);
    }

    public int hashCode() {
        int iHashCode = ((this.date.hashCode() * 31) + this.name.hashCode()) * 31;
        l lVar = this.type;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        String str = this.description;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<VehicleHistoryEventDetail> list = this.details;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "VehicleHistoryEvent(date=" + this.date + ", name=" + this.name + ", type=" + this.type + ", description=" + this.description + ", details=" + this.details + ")";
    }
}
