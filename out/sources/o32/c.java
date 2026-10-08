package o32;

import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lo32/c;", "Ll00/e;", "Lo32/c$a;", "a", "b", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: o32.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u001e\u0010\"¨\u0006#"}, d2 = {"Lo32/c$a;", "", "Li50/a;", "scaffoldData", "Ln30/b;", "messageDetails", "Lo32/c$b;", "filesSection", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "<init>", "(Li50/a;Ln30/b;Lo32/c$b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Ln30/b;", "()Ln30/b;", "c", "Lo32/c$b;", "()Lo32/c$b;", "Ler/a;", "()Ler/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f141943e = BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData messageDetails;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FilesSection filesSection;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        public Data(BaseScaffoldData baseScaffoldData, CardListData cardListData, FilesSection filesSection, er.a<i0> aVar) {
            this.scaffoldData = baseScaffoldData;
            this.messageDetails = cardListData;
            this.filesSection = filesSection;
            this.onCloseClick = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FilesSection getFilesSection() {
            return this.filesSection;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CardListData getMessageDetails() {
            return this.messageDetails;
        }

        public final er.a<i0> c() {
            return this.onCloseClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.scaffoldData, data.scaffoldData) && t.c(this.messageDetails, data.messageDetails) && t.c(this.filesSection, data.filesSection) && t.c(this.onCloseClick, data.onCloseClick);
        }

        public int hashCode() {
            int iHashCode = ((this.scaffoldData.hashCode() * 31) + this.messageDetails.hashCode()) * 31;
            FilesSection filesSection = this.filesSection;
            return ((iHashCode + (filesSection == null ? 0 : filesSection.hashCode())) * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", messageDetails=" + this.messageDetails + ", filesSection=" + this.filesSection + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }

    /* JADX INFO: renamed from: o32.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lo32/c$b;", "", "Lmx/a;", "filesSectionLabel", "Ln30/b;", "files", "<init>", "(Lmx/a;Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Ln30/b;", "()Ln30/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FilesSection {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label filesSectionLabel;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData files;

        public FilesSection(Label label, CardListData cardListData) {
            this.filesSectionLabel = label;
            this.files = cardListData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CardListData getFiles() {
            return this.files;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getFilesSectionLabel() {
            return this.filesSectionLabel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FilesSection)) {
                return false;
            }
            FilesSection filesSection = (FilesSection) other;
            return t.c(this.filesSectionLabel, filesSection.filesSectionLabel) && t.c(this.files, filesSection.files);
        }

        public int hashCode() {
            return (this.filesSectionLabel.hashCode() * 31) + this.files.hashCode();
        }

        public String toString() {
            return "FilesSection(filesSectionLabel=" + this.filesSectionLabel + ", files=" + this.files + ')';
        }
    }
}
