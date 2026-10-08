package ng3;

import fr.t;
import h30.ButtonData;
import java.util.List;
import mx.Label;
import n50.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lng3/a;", "", "a", "b", "Lng3/a$a;", "Lng3/a$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: ng3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lng3/a$a;", "Lng3/a;", "Ln50/k;", "singleCardData", "Lh30/a;", "goToNextStepButton", "<init>", "(Ln50/k;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln50/k;", "b", "()Ln50/k;", "Lh30/a;", "()Lh30/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Empty implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k singleCardData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData goToNextStepButton;

        public Empty(k kVar, ButtonData buttonData) {
            this.singleCardData = kVar;
            this.goToNextStepButton = buttonData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonData getGoToNextStepButton() {
            return this.goToNextStepButton;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final k getSingleCardData() {
            return this.singleCardData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) other;
            return t.c(this.singleCardData, empty.singleCardData) && t.c(this.goToNextStepButton, empty.goToNextStepButton);
        }

        public int hashCode() {
            return (this.singleCardData.hashCode() * 31) + this.goToNextStepButton.hashCode();
        }

        public String toString() {
            return "Empty(singleCardData=" + this.singleCardData + ", goToNextStepButton=" + this.goToNextStepButton + ')';
        }
    }

    /* JADX INFO: renamed from: ng3.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lng3/a$b;", "Lng3/a;", "Lmx/a;", "addInsuranceDescription", "", "Ln50/k;", "insuranceCardsList", "Lh30/a;", "addInsuranceButtonData", "goToNextStepButton", "<init>", "(Lmx/a;Ljava/util/List;Lh30/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Lh30/a;", "()Lh30/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InsuranceList implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label addInsuranceDescription;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<k> insuranceCardsList;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData addInsuranceButtonData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData goToNextStepButton;

        /* JADX WARN: Multi-variable type inference failed */
        public InsuranceList(Label label, List<? extends k> list, ButtonData buttonData, ButtonData buttonData2) {
            this.addInsuranceDescription = label;
            this.insuranceCardsList = list;
            this.addInsuranceButtonData = buttonData;
            this.goToNextStepButton = buttonData2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonData getAddInsuranceButtonData() {
            return this.addInsuranceButtonData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getAddInsuranceDescription() {
            return this.addInsuranceDescription;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ButtonData getGoToNextStepButton() {
            return this.goToNextStepButton;
        }

        public final List<k> d() {
            return this.insuranceCardsList;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InsuranceList)) {
                return false;
            }
            InsuranceList insuranceList = (InsuranceList) other;
            return t.c(this.addInsuranceDescription, insuranceList.addInsuranceDescription) && t.c(this.insuranceCardsList, insuranceList.insuranceCardsList) && t.c(this.addInsuranceButtonData, insuranceList.addInsuranceButtonData) && t.c(this.goToNextStepButton, insuranceList.goToNextStepButton);
        }

        public int hashCode() {
            return (((((this.addInsuranceDescription.hashCode() * 31) + this.insuranceCardsList.hashCode()) * 31) + this.addInsuranceButtonData.hashCode()) * 31) + this.goToNextStepButton.hashCode();
        }

        public String toString() {
            return "InsuranceList(addInsuranceDescription=" + this.addInsuranceDescription + ", insuranceCardsList=" + this.insuranceCardsList + ", addInsuranceButtonData=" + this.addInsuranceButtonData + ", goToNextStepButton=" + this.goToNextStepButton + ')';
        }
    }
}
