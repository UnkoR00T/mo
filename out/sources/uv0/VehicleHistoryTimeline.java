package uv0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: uv0.t, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Luv0/t;", "", "", "yearOfProduction", "", "Luv0/q;", "events", "<init>", "(ILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleHistoryTimeline {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int yearOfProduction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<VehicleHistoryEvent> events;

    public VehicleHistoryTimeline(int i15, List<VehicleHistoryEvent> list) {
        this.yearOfProduction = i15;
        this.events = list;
    }

    public final List<VehicleHistoryEvent> a() {
        return this.events;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getYearOfProduction() {
        return this.yearOfProduction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleHistoryTimeline)) {
            return false;
        }
        VehicleHistoryTimeline vehicleHistoryTimeline = (VehicleHistoryTimeline) other;
        return this.yearOfProduction == vehicleHistoryTimeline.yearOfProduction && fr.t.c(this.events, vehicleHistoryTimeline.events);
    }

    public int hashCode() {
        return (Integer.hashCode(this.yearOfProduction) * 31) + this.events.hashCode();
    }

    public String toString() {
        return "VehicleHistoryTimeline(yearOfProduction=" + this.yearOfProduction + ", events=" + this.events + ")";
    }
}
