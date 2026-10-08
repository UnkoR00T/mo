package vb3;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;
import z93.TravelPersonalData;

/* JADX INFO: renamed from: vb3.c, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lvb3/c;", "", "", "isChecked", "Lz93/p;", "data", "<init>", "(ZLz93/p;)V", "a", "(ZLz93/p;)Lvb3/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "Lz93/p;", "c", "()Lz93/p;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ParticipantUIData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f205952c = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isChecked;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TravelPersonalData data;

    public ParticipantUIData(boolean z15, TravelPersonalData pVar) {
        this.isChecked = z15;
        this.data = pVar;
    }

    public static /* synthetic */ ParticipantUIData b(ParticipantUIData participantUIData, boolean z15, TravelPersonalData pVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = participantUIData.isChecked;
        }
        if ((i15 & 2) != 0) {
            pVar = participantUIData.data;
        }
        return participantUIData.a(z15, pVar);
    }

    public final ParticipantUIData a(boolean isChecked, TravelPersonalData data) {
        return new ParticipantUIData(isChecked, data);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TravelPersonalData getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParticipantUIData)) {
            return false;
        }
        ParticipantUIData participantUIData = (ParticipantUIData) other;
        return this.isChecked == participantUIData.isChecked && t.c(this.data, participantUIData.data);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isChecked) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "ParticipantUIData(isChecked=" + this.isChecked + ", data=" + this.data + ')';
    }
}
