package to1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lto1/h;", "Ll00/e;", "Lto1/h$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lto1/h$a;", "", "a", "Lto1/h$a$a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: to1.h$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\"\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b\u001e\u0010*R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b'\u0010%R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010.\u001a\u0004\b-\u0010/¨\u00060"}, d2 = {"Lto1/h$a$a;", "Lto1/h$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "description", "Lh30/a;", "saveAButton", "saveBButton", "loadBButton", "clearDbButton", "ids", "lastLog", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lh30/a;Lh30/a;Lh30/a;Lh30/a;Lmx/a;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "i", "()Li50/a;", "b", "Lmx/a;", "j", "()Lmx/a;", "c", "d", "Lh30/a;", "g", "()Lh30/a;", "e", "h", "f", "Ler/a;", "()Ler/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DeveloperDatabaseData implements a {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final int f191301k = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData saveAButton;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData saveBButton;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData loadBButton;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData clearDbButton;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label ids;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label lastLog;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            public DeveloperDatabaseData(BaseScaffoldData baseScaffoldData, Label label, Label label2, ButtonData buttonData, ButtonData buttonData2, ButtonData buttonData3, ButtonData buttonData4, Label label3, Label label4, er.a<i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.title = label;
                this.description = label2;
                this.saveAButton = buttonData;
                this.saveBButton = buttonData2;
                this.loadBButton = buttonData3;
                this.clearDbButton = buttonData4;
                this.ids = label3;
                this.lastLog = label4;
                this.onBackAction = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ButtonData getClearDbButton() {
                return this.clearDbButton;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getIds() {
                return this.ids;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getLastLog() {
                return this.lastLog;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final ButtonData getLoadBButton() {
                return this.loadBButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DeveloperDatabaseData)) {
                    return false;
                }
                DeveloperDatabaseData developerDatabaseData = (DeveloperDatabaseData) other;
                return fr.t.c(this.scaffoldData, developerDatabaseData.scaffoldData) && fr.t.c(this.title, developerDatabaseData.title) && fr.t.c(this.description, developerDatabaseData.description) && fr.t.c(this.saveAButton, developerDatabaseData.saveAButton) && fr.t.c(this.saveBButton, developerDatabaseData.saveBButton) && fr.t.c(this.loadBButton, developerDatabaseData.loadBButton) && fr.t.c(this.clearDbButton, developerDatabaseData.clearDbButton) && fr.t.c(this.ids, developerDatabaseData.ids) && fr.t.c(this.lastLog, developerDatabaseData.lastLog) && fr.t.c(this.onBackAction, developerDatabaseData.onBackAction);
            }

            public final er.a<i0> f() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final ButtonData getSaveAButton() {
                return this.saveAButton;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final ButtonData getSaveBButton() {
                return this.saveBButton;
            }

            public int hashCode() {
                return (((((((((((((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.saveAButton.hashCode()) * 31) + this.saveBButton.hashCode()) * 31) + this.loadBButton.hashCode()) * 31) + this.clearDbButton.hashCode()) * 31) + this.ids.hashCode()) * 31) + this.lastLog.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public String toString() {
                return "DeveloperDatabaseData(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", description=" + this.description + ", saveAButton=" + this.saveAButton + ", saveBButton=" + this.saveBButton + ", loadBButton=" + this.loadBButton + ", clearDbButton=" + this.clearDbButton + ", ids=" + this.ids + ", lastLog=" + this.lastLog + ", onBackAction=" + this.onBackAction + ')';
            }
        }
    }
}
