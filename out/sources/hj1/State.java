package hj1;

import java.util.List;
import mj1.ContactDetailsData;
import p071kotlin.Metadata;
import vi1.ChildParticipant;
import vi1.ChosenTrainingUnitAndDate;
import zp0.AvailableDefenceTrainings;

/* JADX INFO: renamed from: hj1.r, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\\\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b\"\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001d\u0010,\u001a\u0004\b&\u0010-¨\u0006."}, d2 = {"Lhj1/r;", "", "Lhj1/q;", "setupData", "", "trainingTypeCode", "Lzp0/a;", "trainingLocation", "Lmj1/f;", "contactDetailsData", "", "Lvi1/a;", "children", "Lvi1/b;", "chosenTrainingUnitAndDate", "<init>", "(Lhj1/q;Ljava/lang/String;Lzp0/a;Lmj1/f;Ljava/util/List;Lvi1/b;)V", "a", "(Lhj1/q;Ljava/lang/String;Lzp0/a;Lmj1/f;Ljava/util/List;Lvi1/b;)Lhj1/r;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhj1/q;", "f", "()Lhj1/q;", "b", "Ljava/lang/String;", "h", "c", "Lzp0/a;", "g", "()Lzp0/a;", "d", "Lmj1/f;", "e", "()Lmj1/f;", "Ljava/util/List;", "()Ljava/util/List;", "Lvi1/b;", "()Lvi1/b;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SetupData setupData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String trainingTypeCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AvailableDefenceTrainings trainingLocation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ContactDetailsData contactDetailsData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ChildParticipant> children;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ChosenTrainingUnitAndDate chosenTrainingUnitAndDate;

    public State(SetupData setupData, String str, AvailableDefenceTrainings availableDefenceTrainings, ContactDetailsData contactDetailsData, List<ChildParticipant> list, ChosenTrainingUnitAndDate chosenTrainingUnitAndDate) {
        this.setupData = setupData;
        this.trainingTypeCode = str;
        this.trainingLocation = availableDefenceTrainings;
        this.contactDetailsData = contactDetailsData;
        this.children = list;
        this.chosenTrainingUnitAndDate = chosenTrainingUnitAndDate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, SetupData setupData, String str, AvailableDefenceTrainings availableDefenceTrainings, ContactDetailsData contactDetailsData, List list, ChosenTrainingUnitAndDate chosenTrainingUnitAndDate, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            setupData = state.setupData;
        }
        if ((i15 & 2) != 0) {
            str = state.trainingTypeCode;
        }
        if ((i15 & 4) != 0) {
            availableDefenceTrainings = state.trainingLocation;
        }
        if ((i15 & 8) != 0) {
            contactDetailsData = state.contactDetailsData;
        }
        if ((i15 & 16) != 0) {
            list = state.children;
        }
        if ((i15 & 32) != 0) {
            chosenTrainingUnitAndDate = state.chosenTrainingUnitAndDate;
        }
        List list2 = list;
        ChosenTrainingUnitAndDate chosenTrainingUnitAndDate2 = chosenTrainingUnitAndDate;
        return state.a(setupData, str, availableDefenceTrainings, contactDetailsData, list2, chosenTrainingUnitAndDate2);
    }

    public final State a(SetupData setupData, String trainingTypeCode, AvailableDefenceTrainings trainingLocation, ContactDetailsData contactDetailsData, List<ChildParticipant> children, ChosenTrainingUnitAndDate chosenTrainingUnitAndDate) {
        return new State(setupData, trainingTypeCode, trainingLocation, contactDetailsData, children, chosenTrainingUnitAndDate);
    }

    public final List<ChildParticipant> c() {
        return this.children;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ChosenTrainingUnitAndDate getChosenTrainingUnitAndDate() {
        return this.chosenTrainingUnitAndDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ContactDetailsData getContactDetailsData() {
        return this.contactDetailsData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.setupData, state.setupData) && fr.t.c(this.trainingTypeCode, state.trainingTypeCode) && fr.t.c(this.trainingLocation, state.trainingLocation) && fr.t.c(this.contactDetailsData, state.contactDetailsData) && fr.t.c(this.children, state.children) && fr.t.c(this.chosenTrainingUnitAndDate, state.chosenTrainingUnitAndDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final SetupData getSetupData() {
        return this.setupData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AvailableDefenceTrainings getTrainingLocation() {
        return this.trainingLocation;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTrainingTypeCode() {
        return this.trainingTypeCode;
    }

    public int hashCode() {
        int iHashCode = this.setupData.hashCode() * 31;
        String str = this.trainingTypeCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AvailableDefenceTrainings availableDefenceTrainings = this.trainingLocation;
        int iHashCode3 = (iHashCode2 + (availableDefenceTrainings == null ? 0 : availableDefenceTrainings.hashCode())) * 31;
        ContactDetailsData contactDetailsData = this.contactDetailsData;
        int iHashCode4 = (iHashCode3 + (contactDetailsData == null ? 0 : contactDetailsData.hashCode())) * 31;
        List<ChildParticipant> list = this.children;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ChosenTrainingUnitAndDate chosenTrainingUnitAndDate = this.chosenTrainingUnitAndDate;
        return iHashCode5 + (chosenTrainingUnitAndDate != null ? chosenTrainingUnitAndDate.hashCode() : 0);
    }

    public String toString() {
        return "State(setupData=" + this.setupData + ", trainingTypeCode=" + this.trainingTypeCode + ", trainingLocation=" + this.trainingLocation + ", contactDetailsData=" + this.contactDetailsData + ", children=" + this.children + ", chosenTrainingUnitAndDate=" + this.chosenTrainingUnitAndDate + ')';
    }
}
