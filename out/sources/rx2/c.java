package rx2;

import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import ux2.Section;
import ux2.StatementSection;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lrx2/c;", "Ll00/e;", "Lrx2/c$a;", "a", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: rx2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b$\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b \u00101R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b,\u00104R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b.\u00105\u001a\u0004\b(\u00106R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b&\u00107\u001a\u0004\b2\u00108¨\u00069"}, d2 = {"Lrx2/c$a;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "description", "", "Lux2/a;", "sections", "Lux2/b;", "statement", "Lc30/b$c;", "alertData", "", "scrollToStatement", "Lkotlin/Function0;", "Loq/i0;", "onScrolledToStatement", "Lh30/a;", "sendButtonData", "<init>", "(Li50/a;Lmx/a;Lmx/a;Ljava/util/List;Lux2/b;Lc30/b$c;ZLer/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Lmx/a;", "i", "()Lmx/a;", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "Lux2/b;", "h", "()Lux2/b;", "Lc30/b$c;", "()Lc30/b$c;", "g", "Z", "()Z", "Ler/a;", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Section> sections;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final StatementSection statement;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b.c alertData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean scrollToStatement;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToStatement;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData sendButtonData;

        public Data(BaseScaffoldData baseScaffoldData, Label label, Label label2, List<Section> list, StatementSection statementSection, c30.b.c cVar, boolean z15, er.a<i0> aVar, ButtonData buttonData) {
            this.scaffoldData = baseScaffoldData;
            this.title = label;
            this.description = label2;
            this.sections = list;
            this.statement = statementSection;
            this.alertData = cVar;
            this.scrollToStatement = z15;
            this.onScrolledToStatement = aVar;
            this.sendButtonData = buttonData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c30.b.c getAlertData() {
            return this.alertData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        public final er.a<i0> c() {
            return this.onScrolledToStatement;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getScrollToStatement() {
            return this.scrollToStatement;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.title, data.title) && fr.t.c(this.description, data.description) && fr.t.c(this.sections, data.sections) && fr.t.c(this.statement, data.statement) && fr.t.c(this.alertData, data.alertData) && this.scrollToStatement == data.scrollToStatement && fr.t.c(this.onScrolledToStatement, data.onScrolledToStatement) && fr.t.c(this.sendButtonData, data.sendButtonData);
        }

        public final List<Section> f() {
            return this.sections;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ButtonData getSendButtonData() {
            return this.sendButtonData;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final StatementSection getStatement() {
            return this.statement;
        }

        public int hashCode() {
            return (((((((((((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.sections.hashCode()) * 31) + this.statement.hashCode()) * 31) + this.alertData.hashCode()) * 31) + Boolean.hashCode(this.scrollToStatement)) * 31) + this.onScrolledToStatement.hashCode()) * 31) + this.sendButtonData.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", description=" + this.description + ", sections=" + this.sections + ", statement=" + this.statement + ", alertData=" + this.alertData + ", scrollToStatement=" + this.scrollToStatement + ", onScrolledToStatement=" + this.onScrolledToStatement + ", sendButtonData=" + this.sendButtonData + ')';
        }
    }
}
