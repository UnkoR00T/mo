package rs1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;
import t50.TextAreaData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lrs1/j;", "Ll00/e;", "Lrs1/j$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j extends l00.e<Data> {

    /* JADX INFO: renamed from: rs1.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b-\u00103R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b1\u0010:R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b4\u0010=R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u00109\u001a\u0004\b>\u0010:R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b@\u00109\u001a\u0004\b8\u0010:R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b;\u0010DR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bE\u00109\u001a\u0004\bF\u0010:R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bH\u00109\u001a\u0004\bB\u0010:R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bE\u0010LR\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bM\u00109\u001a\u0004\bJ\u0010:R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bM\u0010PR\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bQ\u00109\u001a\u0004\bQ\u0010:R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bR\u0010TR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bN\u0010W¨\u0006X"}, d2 = {"Lrs1/j$a;", "", "Lrs1/i;", "state", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lmx/a;", "emailDescription", "Lv50/c$g;", "emailInput", "passwordDescription", "Lv50/c$c;", "passwordInput", "maskedDescription", "Lv50/c$a;", "maskedInput", "phoneDescription", "Lv50/c$d;", "phoneNumberInput", "peselDescription", "Lv50/c$b;", "peselInput", "searchDescription", "Lv50/c$f;", "searchInput", "textAreaDescription", "Lt50/d;", "textAreaInput", "Lh30/a;", "submitButton", "<init>", "(Lrs1/i;Li50/a;Ler/a;Lmx/a;Lv50/c$g;Lmx/a;Lv50/c$c;Lmx/a;Lv50/c$a;Lmx/a;Lv50/c$d;Lmx/a;Lv50/c$b;Lmx/a;Lv50/c$f;Lmx/a;Lt50/d;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrs1/i;", "getState", "()Lrs1/i;", "b", "Li50/a;", "()Li50/a;", "c", "Ler/a;", "f", "()Ler/a;", "d", "Lmx/a;", "()Lmx/a;", "e", "Lv50/c$g;", "()Lv50/c$g;", "g", "Lv50/c$c;", "h", "()Lv50/c$c;", "i", "Lv50/c$a;", "()Lv50/c$a;", "j", "k", "Lv50/c$d;", "l", "()Lv50/c$d;", "m", "Lv50/c$b;", "()Lv50/c$b;", "n", "o", "Lv50/c$f;", "()Lv50/c$f;", "p", "q", "Lt50/d;", "()Lt50/d;", "r", "Lh30/a;", "()Lh30/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onBack;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label emailDescription;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Text emailInput;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label passwordDescription;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Password passwordInput;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label maskedDescription;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Masked maskedInput;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label phoneDescription;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.PhoneNumber phoneNumberInput;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label peselDescription;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Number peselInput;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label searchDescription;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Search searchInput;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label textAreaDescription;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextAreaData textAreaInput;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData submitButton;

        public Data(State state, BaseScaffoldData baseScaffoldData, er.a<oq.i0> aVar, Label label, v50.c.Text text, Label label2, v50.c.Password password, Label label3, v50.c.Masked masked, Label label4, v50.c.PhoneNumber phoneNumber, Label label5, v50.c.Number number, Label label6, v50.c.Search search, Label label7, TextAreaData textAreaData, ButtonData buttonData) {
            this.state = state;
            this.baseScaffoldData = baseScaffoldData;
            this.onBack = aVar;
            this.emailDescription = label;
            this.emailInput = text;
            this.passwordDescription = label2;
            this.passwordInput = password;
            this.maskedDescription = label3;
            this.maskedInput = masked;
            this.phoneDescription = label4;
            this.phoneNumberInput = phoneNumber;
            this.peselDescription = label5;
            this.peselInput = number;
            this.searchDescription = label6;
            this.searchInput = search;
            this.textAreaDescription = label7;
            this.textAreaInput = textAreaData;
            this.submitButton = buttonData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getEmailDescription() {
            return this.emailDescription;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final v50.c.Text getEmailInput() {
            return this.emailInput;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getMaskedDescription() {
            return this.maskedDescription;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final v50.c.Masked getMaskedInput() {
            return this.maskedInput;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.state, data.state) && fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.onBack, data.onBack) && fr.t.c(this.emailDescription, data.emailDescription) && fr.t.c(this.emailInput, data.emailInput) && fr.t.c(this.passwordDescription, data.passwordDescription) && fr.t.c(this.passwordInput, data.passwordInput) && fr.t.c(this.maskedDescription, data.maskedDescription) && fr.t.c(this.maskedInput, data.maskedInput) && fr.t.c(this.phoneDescription, data.phoneDescription) && fr.t.c(this.phoneNumberInput, data.phoneNumberInput) && fr.t.c(this.peselDescription, data.peselDescription) && fr.t.c(this.peselInput, data.peselInput) && fr.t.c(this.searchDescription, data.searchDescription) && fr.t.c(this.searchInput, data.searchInput) && fr.t.c(this.textAreaDescription, data.textAreaDescription) && fr.t.c(this.textAreaInput, data.textAreaInput) && fr.t.c(this.submitButton, data.submitButton);
        }

        public final er.a<oq.i0> f() {
            return this.onBack;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Label getPasswordDescription() {
            return this.passwordDescription;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final v50.c.Password getPasswordInput() {
            return this.passwordInput;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((this.state.hashCode() * 31) + this.baseScaffoldData.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.emailDescription.hashCode()) * 31) + this.emailInput.hashCode()) * 31) + this.passwordDescription.hashCode()) * 31) + this.passwordInput.hashCode()) * 31) + this.maskedDescription.hashCode()) * 31) + this.maskedInput.hashCode()) * 31) + this.phoneDescription.hashCode()) * 31) + this.phoneNumberInput.hashCode()) * 31) + this.peselDescription.hashCode()) * 31) + this.peselInput.hashCode()) * 31) + this.searchDescription.hashCode()) * 31) + this.searchInput.hashCode()) * 31) + this.textAreaDescription.hashCode()) * 31) + this.textAreaInput.hashCode()) * 31) + this.submitButton.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Label getPeselDescription() {
            return this.peselDescription;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final v50.c.Number getPeselInput() {
            return this.peselInput;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final Label getPhoneDescription() {
            return this.phoneDescription;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final v50.c.PhoneNumber getPhoneNumberInput() {
            return this.phoneNumberInput;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final Label getSearchDescription() {
            return this.searchDescription;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final v50.c.Search getSearchInput() {
            return this.searchInput;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final ButtonData getSubmitButton() {
            return this.submitButton;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final Label getTextAreaDescription() {
            return this.textAreaDescription;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final TextAreaData getTextAreaInput() {
            return this.textAreaInput;
        }

        public String toString() {
            return "Data(state=" + this.state + ", baseScaffoldData=" + this.baseScaffoldData + ", onBack=" + this.onBack + ", emailDescription=" + this.emailDescription + ", emailInput=" + this.emailInput + ", passwordDescription=" + this.passwordDescription + ", passwordInput=" + this.passwordInput + ", maskedDescription=" + this.maskedDescription + ", maskedInput=" + this.maskedInput + ", phoneDescription=" + this.phoneDescription + ", phoneNumberInput=" + this.phoneNumberInput + ", peselDescription=" + this.peselDescription + ", peselInput=" + this.peselInput + ", searchDescription=" + this.searchDescription + ", searchInput=" + this.searchInput + ", textAreaDescription=" + this.textAreaDescription + ", textAreaInput=" + this.textAreaInput + ", submitButton=" + this.submitButton + ')';
        }
    }
}
