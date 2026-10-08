package ia3;

import ba3.ContactDetails;
import fr.t;
import ga3.Stage;
import java.util.List;
import p071kotlin.Metadata;
import vb3.ChosenParticipantsData;
import z93.TravelPersonalData;

/* JADX INFO: renamed from: ia3.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Lia3/a;", "", "Lz93/p;", "personalData", "Lba3/a;", "contactDetails", "Lvb3/a;", "chosenParticipantsData", "", "Lga3/c;", "stages", "<init>", "(Lz93/p;Lba3/a;Lvb3/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz93/p;", "c", "()Lz93/p;", "b", "Lba3/a;", "()Lba3/a;", "Lvb3/a;", "()Lvb3/a;", "d", "Ljava/util/List;", "()Ljava/util/List;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SummaryData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TravelPersonalData personalData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ContactDetails contactDetails;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ChosenParticipantsData chosenParticipantsData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Stage> stages;

    public SummaryData(TravelPersonalData travelPersonalData, ContactDetails contactDetails, ChosenParticipantsData chosenParticipantsData, List<Stage> list) {
        this.personalData = travelPersonalData;
        this.contactDetails = contactDetails;
        this.chosenParticipantsData = chosenParticipantsData;
        this.stages = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ChosenParticipantsData getChosenParticipantsData() {
        return this.chosenParticipantsData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ContactDetails getContactDetails() {
        return this.contactDetails;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TravelPersonalData getPersonalData() {
        return this.personalData;
    }

    public final List<Stage> d() {
        return this.stages;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryData)) {
            return false;
        }
        SummaryData summaryData = (SummaryData) other;
        return t.c(this.personalData, summaryData.personalData) && t.c(this.contactDetails, summaryData.contactDetails) && t.c(this.chosenParticipantsData, summaryData.chosenParticipantsData) && t.c(this.stages, summaryData.stages);
    }

    public int hashCode() {
        return (((((this.personalData.hashCode() * 31) + this.contactDetails.hashCode()) * 31) + this.chosenParticipantsData.hashCode()) * 31) + this.stages.hashCode();
    }

    public String toString() {
        return "SummaryData(personalData=" + this.personalData + ", contactDetails=" + this.contactDetails + ", chosenParticipantsData=" + this.chosenParticipantsData + ", stages=" + this.stages + ')';
    }
}
