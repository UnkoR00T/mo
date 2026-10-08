package ub1;

import a50.RadioButtonData;
import h30.ButtonData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lub1/n;", "Ll00/e;", "Lub1/n$a;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n extends l00.e<Data> {

    /* JADX INFO: renamed from: ub1.n$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u001b\u0010\"¨\u0006#"}, d2 = {"Lub1/n$a;", "", "Lmx/a;", "title", "La50/a;", "accountingDocumentRadioGroup", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lh30/a;", "nextButton", "<init>", "(Lmx/a;La50/a;Ler/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "La50/a;", "()La50/a;", "c", "Ler/a;", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f197248e = RadioButtonData.f3462h;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final RadioButtonData accountingDocumentRadioGroup;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButton;

        public Data(Label label, RadioButtonData radioButtonData, er.a<i0> aVar, ButtonData buttonData) {
            this.title = label;
            this.accountingDocumentRadioGroup = radioButtonData;
            this.onBackAction = aVar;
            this.nextButton = buttonData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final RadioButtonData getAccountingDocumentRadioGroup() {
            return this.accountingDocumentRadioGroup;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ButtonData getNextButton() {
            return this.nextButton;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.title, data.title) && fr.t.c(this.accountingDocumentRadioGroup, data.accountingDocumentRadioGroup) && fr.t.c(this.onBackAction, data.onBackAction) && fr.t.c(this.nextButton, data.nextButton);
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + this.accountingDocumentRadioGroup.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.nextButton.hashCode();
        }

        public String toString() {
            return "Data(title=" + this.title + ", accountingDocumentRadioGroup=" + this.accountingDocumentRadioGroup + ", onBackAction=" + this.onBackAction + ", nextButton=" + this.nextButton + ')';
        }
    }
}
