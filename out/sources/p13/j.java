package p13;

import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;
import t40.InfoRowListData;
import y60.MediaPlayerComponentData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lp13/j;", "Ll00/e;", "Lp13/j$a;", "a", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j extends l00.e<Data> {

    /* JADX INFO: renamed from: p13.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b7\u0010)R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010'\u001a\u0004\b,\u0010)R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b\"\u0010)R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b6\u0010)R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b8\u0010)R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b.\u0010)R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b0\u00109\u001a\u0004\b&\u0010:R\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b-\u00109\u001a\u0004\b2\u0010:¨\u0006;"}, d2 = {"Lp13/j$a;", "", "Li50/a;", "baseScaffoldData", "Lmx/a;", "headerData", "descriptionData", "threatsSectionTitleData", "Lt40/b;", "threatsInfoRowListData", "Lc30/b;", "rsoAlertData", "alertsSectionTitleData", "alarmAnnouncementTitlePart1", "alarmAnnouncementTitlePart2", "alarmAnnouncementDescription", "alarmCancellationTitlePart1", "alarmCancellationTitlePart2", "alarmCancellationDescription", "Ly60/c;", "alarmAnnouncementMediaPlayerComponentData", "alarmCancellationMediaPlayerComponentData", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lmx/a;Lt40/b;Lc30/b;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Ly60/c;Ly60/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "j", "()Li50/a;", "b", "Lmx/a;", "l", "()Lmx/a;", "c", "k", "d", "o", "e", "Lt40/b;", "n", "()Lt40/b;", "f", "Lc30/b;", "m", "()Lc30/b;", "g", "i", "h", "Ly60/c;", "()Ly60/c;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f151557p = ((MediaPlayerComponentData.f224389j | c30.b.f22944i) | InfoRowListData.f187643b) | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label headerData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label descriptionData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label threatsSectionTitleData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final InfoRowListData threatsInfoRowListData;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b rsoAlertData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label alertsSectionTitleData;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label alarmAnnouncementTitlePart1;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label alarmAnnouncementTitlePart2;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label alarmAnnouncementDescription;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label alarmCancellationTitlePart1;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label alarmCancellationTitlePart2;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label alarmCancellationDescription;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final MediaPlayerComponentData alarmAnnouncementMediaPlayerComponentData;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final MediaPlayerComponentData alarmCancellationMediaPlayerComponentData;

        public Data(BaseScaffoldData baseScaffoldData, Label label, Label label2, Label label3, InfoRowListData infoRowListData, c30.b bVar, Label label4, Label label5, Label label6, Label label7, Label label8, Label label9, Label label10, MediaPlayerComponentData mediaPlayerComponentData, MediaPlayerComponentData mediaPlayerComponentData2) {
            this.baseScaffoldData = baseScaffoldData;
            this.headerData = label;
            this.descriptionData = label2;
            this.threatsSectionTitleData = label3;
            this.threatsInfoRowListData = infoRowListData;
            this.rsoAlertData = bVar;
            this.alertsSectionTitleData = label4;
            this.alarmAnnouncementTitlePart1 = label5;
            this.alarmAnnouncementTitlePart2 = label6;
            this.alarmAnnouncementDescription = label7;
            this.alarmCancellationTitlePart1 = label8;
            this.alarmCancellationTitlePart2 = label9;
            this.alarmCancellationDescription = label10;
            this.alarmAnnouncementMediaPlayerComponentData = mediaPlayerComponentData;
            this.alarmCancellationMediaPlayerComponentData = mediaPlayerComponentData2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getAlarmAnnouncementDescription() {
            return this.alarmAnnouncementDescription;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final MediaPlayerComponentData getAlarmAnnouncementMediaPlayerComponentData() {
            return this.alarmAnnouncementMediaPlayerComponentData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getAlarmAnnouncementTitlePart1() {
            return this.alarmAnnouncementTitlePart1;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getAlarmAnnouncementTitlePart2() {
            return this.alarmAnnouncementTitlePart2;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getAlarmCancellationDescription() {
            return this.alarmCancellationDescription;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.headerData, data.headerData) && fr.t.c(this.descriptionData, data.descriptionData) && fr.t.c(this.threatsSectionTitleData, data.threatsSectionTitleData) && fr.t.c(this.threatsInfoRowListData, data.threatsInfoRowListData) && fr.t.c(this.rsoAlertData, data.rsoAlertData) && fr.t.c(this.alertsSectionTitleData, data.alertsSectionTitleData) && fr.t.c(this.alarmAnnouncementTitlePart1, data.alarmAnnouncementTitlePart1) && fr.t.c(this.alarmAnnouncementTitlePart2, data.alarmAnnouncementTitlePart2) && fr.t.c(this.alarmAnnouncementDescription, data.alarmAnnouncementDescription) && fr.t.c(this.alarmCancellationTitlePart1, data.alarmCancellationTitlePart1) && fr.t.c(this.alarmCancellationTitlePart2, data.alarmCancellationTitlePart2) && fr.t.c(this.alarmCancellationDescription, data.alarmCancellationDescription) && fr.t.c(this.alarmAnnouncementMediaPlayerComponentData, data.alarmAnnouncementMediaPlayerComponentData) && fr.t.c(this.alarmCancellationMediaPlayerComponentData, data.alarmCancellationMediaPlayerComponentData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final MediaPlayerComponentData getAlarmCancellationMediaPlayerComponentData() {
            return this.alarmCancellationMediaPlayerComponentData;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Label getAlarmCancellationTitlePart1() {
            return this.alarmCancellationTitlePart1;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Label getAlarmCancellationTitlePart2() {
            return this.alarmCancellationTitlePart2;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((this.baseScaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.descriptionData.hashCode()) * 31) + this.threatsSectionTitleData.hashCode()) * 31) + this.threatsInfoRowListData.hashCode()) * 31) + this.rsoAlertData.hashCode()) * 31) + this.alertsSectionTitleData.hashCode()) * 31) + this.alarmAnnouncementTitlePart1.hashCode()) * 31) + this.alarmAnnouncementTitlePart2.hashCode()) * 31) + this.alarmAnnouncementDescription.hashCode()) * 31) + this.alarmCancellationTitlePart1.hashCode()) * 31) + this.alarmCancellationTitlePart2.hashCode()) * 31) + this.alarmCancellationDescription.hashCode()) * 31) + this.alarmAnnouncementMediaPlayerComponentData.hashCode()) * 31) + this.alarmCancellationMediaPlayerComponentData.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Label getAlertsSectionTitleData() {
            return this.alertsSectionTitleData;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final Label getDescriptionData() {
            return this.descriptionData;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final Label getHeaderData() {
            return this.headerData;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final c30.b getRsoAlertData() {
            return this.rsoAlertData;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final InfoRowListData getThreatsInfoRowListData() {
            return this.threatsInfoRowListData;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final Label getThreatsSectionTitleData() {
            return this.threatsSectionTitleData;
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", headerData=" + this.headerData + ", descriptionData=" + this.descriptionData + ", threatsSectionTitleData=" + this.threatsSectionTitleData + ", threatsInfoRowListData=" + this.threatsInfoRowListData + ", rsoAlertData=" + this.rsoAlertData + ", alertsSectionTitleData=" + this.alertsSectionTitleData + ", alarmAnnouncementTitlePart1=" + this.alarmAnnouncementTitlePart1 + ", alarmAnnouncementTitlePart2=" + this.alarmAnnouncementTitlePart2 + ", alarmAnnouncementDescription=" + this.alarmAnnouncementDescription + ", alarmCancellationTitlePart1=" + this.alarmCancellationTitlePart1 + ", alarmCancellationTitlePart2=" + this.alarmCancellationTitlePart2 + ", alarmCancellationDescription=" + this.alarmCancellationDescription + ", alarmAnnouncementMediaPlayerComponentData=" + this.alarmAnnouncementMediaPlayerComponentData + ", alarmCancellationMediaPlayerComponentData=" + this.alarmCancellationMediaPlayerComponentData + ')';
        }
    }
}
