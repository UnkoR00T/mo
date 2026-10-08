package cv2;

import a50.RadioButtonData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcv2/h;", "Ll00/e;", "Lcv2/h$a;", "a", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h extends l00.e<Data> {

    /* JADX INFO: renamed from: cv2.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001b\u0010$¨\u0006%"}, d2 = {"Lcv2/h$a;", "", "Lmx/a;", "nextButtonLabel", "La50/a;", "radioButtonData", "Lkotlin/Function1;", "Lfv2/a;", "Loq/i0;", "onRadioButtonClick", "Lkotlin/Function0;", "onNextButtonClick", "<init>", "(Lmx/a;La50/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "La50/a;", "c", "()La50/a;", "Ler/l;", "getOnRadioButtonClick", "()Ler/l;", "d", "Ler/a;", "()Ler/a;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f38274e = RadioButtonData.f3462h;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label nextButtonLabel;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final RadioButtonData radioButtonData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<fv2.a, i0> onRadioButtonClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Data(Label label, RadioButtonData radioButtonData, er.l<? super fv2.a, i0> lVar, er.a<i0> aVar) {
            this.nextButtonLabel = label;
            this.radioButtonData = radioButtonData;
            this.onRadioButtonClick = lVar;
            this.onNextButtonClick = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getNextButtonLabel() {
            return this.nextButtonLabel;
        }

        public final er.a<i0> b() {
            return this.onNextButtonClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final RadioButtonData getRadioButtonData() {
            return this.radioButtonData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.nextButtonLabel, data.nextButtonLabel) && fr.t.c(this.radioButtonData, data.radioButtonData) && fr.t.c(this.onRadioButtonClick, data.onRadioButtonClick) && fr.t.c(this.onNextButtonClick, data.onNextButtonClick);
        }

        public int hashCode() {
            return (((((this.nextButtonLabel.hashCode() * 31) + this.radioButtonData.hashCode()) * 31) + this.onRadioButtonClick.hashCode()) * 31) + this.onNextButtonClick.hashCode();
        }

        public String toString() {
            return "Data(nextButtonLabel=" + this.nextButtonLabel + ", radioButtonData=" + this.radioButtonData + ", onRadioButtonClick=" + this.onRadioButtonClick + ", onNextButtonClick=" + this.onNextButtonClick + ')';
        }
    }
}
