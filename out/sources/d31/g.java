package d31;

import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ld31/g;", "Ll00/e;", "Ld31/g$a;", "a", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ld31/g$a;", "", "c", "a", "b", "Ld31/g$a$a;", "Ld31/g$a$b;", "Ld31/g$a$c;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: d31.g$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ld31/g$a$a;", "Ld31/g$a;", "Lhb4/c;", "vmsAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ld31/g$a$c;", "Ld31/g$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f39566a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -813944627;
            }

            public String toString() {
                return "Loading";
            }
        }

        /* JADX INFO: renamed from: d31.g$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b\u001a\u0010(¨\u0006)"}, d2 = {"Ld31/g$a$b;", "Ld31/g$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "description", "Ln50/g;", "toCollisionButton", "", "Ld31/g$a$b$a;", "sections", "Lc30/b;", "alertData", "<init>", "(Li50/a;Lmx/a;Ln50/g;Ljava/util/List;Lc30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Lmx/a;", "()Lmx/a;", "Ln50/g;", "e", "()Ln50/g;", "d", "Ljava/util/List;", "()Ljava/util/List;", "Lc30/b;", "()Lc30/b;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DefaultSingleCardData toCollisionButton;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<Section> sections;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, DefaultSingleCardData defaultSingleCardData, List<Section> list, c30.b bVar) {
                this.scaffoldData = baseScaffoldData;
                this.description = label;
                this.toCollisionButton = defaultSingleCardData;
                this.sections = list;
                this.alertData = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public final List<Section> d() {
                return this.sections;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final DefaultSingleCardData getToCollisionButton() {
                return this.toCollisionButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.description, initialized.description) && fr.t.c(this.toCollisionButton, initialized.toCollisionButton) && fr.t.c(this.sections, initialized.sections) && fr.t.c(this.alertData, initialized.alertData);
            }

            public int hashCode() {
                int iHashCode = this.scaffoldData.hashCode() * 31;
                Label label = this.description;
                int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
                DefaultSingleCardData defaultSingleCardData = this.toCollisionButton;
                int iHashCode3 = (((iHashCode2 + (defaultSingleCardData == null ? 0 : defaultSingleCardData.hashCode())) * 31) + this.sections.hashCode()) * 31;
                c30.b bVar = this.alertData;
                return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", description=" + this.description + ", toCollisionButton=" + this.toCollisionButton + ", sections=" + this.sections + ", alertData=" + this.alertData + ')';
            }

            /* JADX INFO: renamed from: d31.g$a$b$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Ld31/g$a$b$a;", "", "Lmx/a;", "header", "description", "Lt40/b;", "bulletPoints", "<init>", "(Lmx/a;Lmx/a;Lt40/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Lt40/b;", "()Lt40/b;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Section {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public static final int f39562d = InfoRowListData.f187643b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label header;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label description;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final InfoRowListData bulletPoints;

                public Section(Label label, Label label2, InfoRowListData infoRowListData) {
                    this.header = label;
                    this.description = label2;
                    this.bulletPoints = infoRowListData;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final InfoRowListData getBulletPoints() {
                    return this.bulletPoints;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final Label getDescription() {
                    return this.description;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final Label getHeader() {
                    return this.header;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Section)) {
                        return false;
                    }
                    Section section = (Section) other;
                    return fr.t.c(this.header, section.header) && fr.t.c(this.description, section.description) && fr.t.c(this.bulletPoints, section.bulletPoints);
                }

                public int hashCode() {
                    int iHashCode = this.header.hashCode() * 31;
                    Label label = this.description;
                    int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
                    InfoRowListData infoRowListData = this.bulletPoints;
                    return iHashCode2 + (infoRowListData != null ? infoRowListData.hashCode() : 0);
                }

                public String toString() {
                    return "Section(header=" + this.header + ", description=" + this.description + ", bulletPoints=" + this.bulletPoints + ')';
                }

                public /* synthetic */ Section(Label label, Label label2, InfoRowListData infoRowListData, int i15, fr.k kVar) {
                    this(label, (i15 & 2) != 0 ? null : label2, (i15 & 4) != 0 ? null : infoRowListData);
                }
            }
        }
    }
}
