package k72;

import fr.t;
import i50.BaseScaffoldData;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lk72/h;", "Ll00/e;", "Lk72/h$a;", "a", "b", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h extends l00.e<Data> {

    /* JADX INFO: renamed from: k72.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b\u0016\u0010!¨\u0006\""}, d2 = {"Lk72/h$a;", "", "Li50/a;", "baseScaffoldData", "Lo40/a;", "headerData", "Lk72/h$b;", "content", "Lc30/b$c;", "alertData", "<init>", "(Li50/a;Lo40/a;Lk72/h$b;Lc30/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lo40/a;", "d", "()Lo40/a;", "c", "Lk72/h$b;", "()Lk72/h$b;", "Lc30/b$c;", "()Lc30/b$c;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final o40.a headerData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FloodDashboardContentScreenData content;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b.c alertData;

        public Data(BaseScaffoldData baseScaffoldData, o40.a aVar, FloodDashboardContentScreenData floodDashboardContentScreenData, c30.b.c cVar) {
            this.baseScaffoldData = baseScaffoldData;
            this.headerData = aVar;
            this.content = floodDashboardContentScreenData;
            this.alertData = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c30.b.c getAlertData() {
            return this.alertData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final FloodDashboardContentScreenData getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final o40.a getHeaderData() {
            return this.headerData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.baseScaffoldData, data.baseScaffoldData) && t.c(this.headerData, data.headerData) && t.c(this.content, data.content) && t.c(this.alertData, data.alertData);
        }

        public int hashCode() {
            return (((((this.baseScaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.content.hashCode()) * 31) + this.alertData.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", headerData=" + this.headerData + ", content=" + this.content + ", alertData=" + this.alertData + ')';
        }
    }

    /* JADX INFO: renamed from: k72.h$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lk72/h$b;", "", "Ln50/g;", "alarmStateCardData", "howToProceed", "map", "<init>", "(Ln50/g;Ln50/g;Ln50/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln50/g;", "()Ln50/g;", "b", "c", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FloodDashboardContentScreenData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DefaultSingleCardData alarmStateCardData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final DefaultSingleCardData howToProceed;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final DefaultSingleCardData map;

        public FloodDashboardContentScreenData(DefaultSingleCardData defaultSingleCardData, DefaultSingleCardData defaultSingleCardData2, DefaultSingleCardData defaultSingleCardData3) {
            this.alarmStateCardData = defaultSingleCardData;
            this.howToProceed = defaultSingleCardData2;
            this.map = defaultSingleCardData3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DefaultSingleCardData getAlarmStateCardData() {
            return this.alarmStateCardData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final DefaultSingleCardData getHowToProceed() {
            return this.howToProceed;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final DefaultSingleCardData getMap() {
            return this.map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FloodDashboardContentScreenData)) {
                return false;
            }
            FloodDashboardContentScreenData floodDashboardContentScreenData = (FloodDashboardContentScreenData) other;
            return t.c(this.alarmStateCardData, floodDashboardContentScreenData.alarmStateCardData) && t.c(this.howToProceed, floodDashboardContentScreenData.howToProceed) && t.c(this.map, floodDashboardContentScreenData.map);
        }

        public int hashCode() {
            return (((this.alarmStateCardData.hashCode() * 31) + this.howToProceed.hashCode()) * 31) + this.map.hashCode();
        }

        public String toString() {
            return "FloodDashboardContentScreenData(alarmStateCardData=" + this.alarmStateCardData + ", howToProceed=" + this.howToProceed + ", map=" + this.map + ')';
        }
    }
}
