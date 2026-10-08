package jc2;

import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mc2.Section;
import mc2.StatementSection;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ljc2/k;", "Ll00/e;", "Ljc2/k$a;", "a", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ljc2/k$a;", "", "b", "a", "Ljc2/k$a$a;", "Ljc2/k$a$b;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: jc2.k$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljc2/k$a$a;", "Ljc2/k$a;", "Lhb4/c;", "vmsAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c vmsAdapter;

            public Error(hb4.c cVar) {
                this.vmsAdapter = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getVmsAdapter() {
                return this.vmsAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.vmsAdapter, ((Error) other).vmsAdapter);
            }

            public int hashCode() {
                return this.vmsAdapter.hashCode();
            }

            public String toString() {
                return "Error(vmsAdapter=" + this.vmsAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: jc2.k$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b-\u00106R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b/\u00107\u001a\u0004\b)\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b'\u00109\u001a\u0004\b%\u0010:R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b2\u0010;\u001a\u0004\b4\u0010<¨\u0006="}, d2 = {"Ljc2/k$a$b;", "Ljc2/k$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "title", "", "Lmc2/a;", "sections", "Lmc2/b;", "statement", "Lc30/b$e;", "warningAlertData", "", "scrollToStatement", "Lkotlin/Function0;", "Loq/i0;", "onScrolledToStatement", "Lc30/b$c;", "infoAlertData", "Lh30/a;", "sendButtonData", "<init>", "(Li50/a;Lmx/a;Ljava/util/List;Lmc2/b;Lc30/b$e;ZLer/a;Lc30/b$c;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "h", "()Lmx/a;", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "d", "Lmc2/b;", "g", "()Lmc2/b;", "Lc30/b$e;", "i", "()Lc30/b$e;", "f", "Z", "()Z", "Ler/a;", "()Ler/a;", "Lc30/b$c;", "()Lc30/b$c;", "Lh30/a;", "()Lh30/a;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<Section> sections;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final StatementSection statement;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b.e warningAlertData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean scrollToStatement;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onScrolledToStatement;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b.c infoAlertData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData sendButtonData;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, List<Section> list, StatementSection statementSection, c30.b.e eVar, boolean z15, er.a<oq.i0> aVar, c30.b.c cVar, ButtonData buttonData) {
                this.baseScaffoldData = baseScaffoldData;
                this.title = label;
                this.sections = list;
                this.statement = statementSection;
                this.warningAlertData = eVar;
                this.scrollToStatement = z15;
                this.onScrolledToStatement = aVar;
                this.infoAlertData = cVar;
                this.sendButtonData = buttonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final c30.b.c getInfoAlertData() {
                return this.infoAlertData;
            }

            public final er.a<oq.i0> c() {
                return this.onScrolledToStatement;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getScrollToStatement() {
                return this.scrollToStatement;
            }

            public final List<Section> e() {
                return this.sections;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.title, initialized.title) && fr.t.c(this.sections, initialized.sections) && fr.t.c(this.statement, initialized.statement) && fr.t.c(this.warningAlertData, initialized.warningAlertData) && this.scrollToStatement == initialized.scrollToStatement && fr.t.c(this.onScrolledToStatement, initialized.onScrolledToStatement) && fr.t.c(this.infoAlertData, initialized.infoAlertData) && fr.t.c(this.sendButtonData, initialized.sendButtonData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final ButtonData getSendButtonData() {
                return this.sendButtonData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final StatementSection getStatement() {
                return this.statement;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((this.baseScaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.sections.hashCode()) * 31) + this.statement.hashCode()) * 31) + this.warningAlertData.hashCode()) * 31) + Boolean.hashCode(this.scrollToStatement)) * 31) + this.onScrolledToStatement.hashCode()) * 31;
                c30.b.c cVar = this.infoAlertData;
                return ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.sendButtonData.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final c30.b.e getWarningAlertData() {
                return this.warningAlertData;
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", title=" + this.title + ", sections=" + this.sections + ", statement=" + this.statement + ", warningAlertData=" + this.warningAlertData + ", scrollToStatement=" + this.scrollToStatement + ", onScrolledToStatement=" + this.onScrolledToStatement + ", infoAlertData=" + this.infoAlertData + ", sendButtonData=" + this.sendButtonData + ')';
            }
        }
    }
}
