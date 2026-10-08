package ff1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import t40.InfoRowListData;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lff1/i;", "Ll00/e;", "Lff1/i$a;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lff1/i$a;", "", "b", "a", "Lff1/i$a$a;", "Lff1/i$a$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ff1.i$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lff1/i$a$a;", "Lff1/i$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "statement", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lmx/a;", "c", "()Lmx/a;", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InfoPage implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f62191d = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label statement;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            public InfoPage(BaseScaffoldData baseScaffoldData, Label label, er.a<i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.statement = label;
                this.onBackAction = aVar;
            }

            public final er.a<i0> a() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getStatement() {
                return this.statement;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InfoPage)) {
                    return false;
                }
                InfoPage infoPage = (InfoPage) other;
                return fr.t.c(this.scaffoldData, infoPage.scaffoldData) && fr.t.c(this.statement, infoPage.statement) && fr.t.c(this.onBackAction, infoPage.onBackAction);
            }

            public int hashCode() {
                return (((this.scaffoldData.hashCode() * 31) + this.statement.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            public String toString() {
                return "InfoPage(scaffoldData=" + this.scaffoldData + ", statement=" + this.statement + ", onBackAction=" + this.onBackAction + ')';
            }
        }

        /* JADX INFO: renamed from: ff1.i$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b\u001f\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b\u001b\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b#\u0010,¨\u0006-"}, d2 = {"Lff1/i$a$b;", "Lff1/i$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "Lt40/b;", "statementsInfoRowListData", "Lj30/a;", "fullStatementButton", "Lw30/a;", "acceptCheckBoxData", "Lh30/a;", "nextButton", "<init>", "(Li50/a;Lmx/a;Lt40/b;Lj30/a;Lw30/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Lmx/a;", "f", "()Lmx/a;", "c", "Lt40/b;", "e", "()Lt40/b;", "Lj30/a;", "()Lj30/a;", "Lw30/a;", "()Lw30/a;", "Lh30/a;", "()Lh30/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f62195g = ((CheckBoxSingleData.f210090f | ButtonTextData.f99099f) | InfoRowListData.f187643b) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final InfoRowListData statementsInfoRowListData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonTextData fullStatementButton;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckBoxSingleData acceptCheckBoxData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButton;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, InfoRowListData infoRowListData, ButtonTextData buttonTextData, CheckBoxSingleData checkBoxSingleData, ButtonData buttonData) {
                this.scaffoldData = baseScaffoldData;
                this.title = label;
                this.statementsInfoRowListData = infoRowListData;
                this.fullStatementButton = buttonTextData;
                this.acceptCheckBoxData = checkBoxSingleData;
                this.nextButton = buttonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final CheckBoxSingleData getAcceptCheckBoxData() {
                return this.acceptCheckBoxData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ButtonTextData getFullStatementButton() {
                return this.fullStatementButton;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ButtonData getNextButton() {
                return this.nextButton;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final InfoRowListData getStatementsInfoRowListData() {
                return this.statementsInfoRowListData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.title, initialized.title) && fr.t.c(this.statementsInfoRowListData, initialized.statementsInfoRowListData) && fr.t.c(this.fullStatementButton, initialized.fullStatementButton) && fr.t.c(this.acceptCheckBoxData, initialized.acceptCheckBoxData) && fr.t.c(this.nextButton, initialized.nextButton);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.statementsInfoRowListData.hashCode()) * 31) + this.fullStatementButton.hashCode()) * 31) + this.acceptCheckBoxData.hashCode()) * 31) + this.nextButton.hashCode();
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", statementsInfoRowListData=" + this.statementsInfoRowListData + ", fullStatementButton=" + this.fullStatementButton + ", acceptCheckBoxData=" + this.acceptCheckBoxData + ", nextButton=" + this.nextButton + ')';
            }
        }
    }
}
