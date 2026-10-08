package ym2;

import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n50.DefaultSingleCardData;
import oq.i0;
import p071kotlin.Metadata;
import zm2.NetworkSecurityIssuesIllegalContentAddressErrorData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lym2/c;", "Ll00/e;", "Lym2/c$a;", "a", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: ym2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b&\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b*\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b(\u0010/\u001a\u0004\b+\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b-\u00101\u001a\u0004\b\u001f\u00102R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105¨\u00066"}, d2 = {"Lym2/c$a;", "", "Li50/a;", "baseScaffoldData", "Lmx/a;", "contentHeader", "contentDescription", "", "Ln50/g;", "illegalContents", "countLimitDescription", "Lh30/a;", "nextButtonData", "Lzm2/b;", "errorData", "addWebsiteAddressButtonData", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Li50/a;Lmx/a;Lmx/a;Ljava/util/List;Lmx/a;Lh30/a;Lzm2/b;Ln50/g;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lmx/a;", "d", "()Lmx/a;", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "e", "f", "Lh30/a;", "h", "()Lh30/a;", "Lzm2/b;", "()Lzm2/b;", "Ln50/g;", "()Ln50/g;", "i", "Ler/a;", "()Ler/a;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label contentHeader;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label contentDescription;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DefaultSingleCardData> illegalContents;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label countLimitDescription;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButtonData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final NetworkSecurityIssuesIllegalContentAddressErrorData errorData;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final DefaultSingleCardData addWebsiteAddressButtonData;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        public Data(BaseScaffoldData baseScaffoldData, Label label, Label label2, List<DefaultSingleCardData> list, Label label3, ButtonData buttonData, NetworkSecurityIssuesIllegalContentAddressErrorData networkSecurityIssuesIllegalContentAddressErrorData, DefaultSingleCardData defaultSingleCardData, er.a<i0> aVar) {
            this.baseScaffoldData = baseScaffoldData;
            this.contentHeader = label;
            this.contentDescription = label2;
            this.illegalContents = list;
            this.countLimitDescription = label3;
            this.nextButtonData = buttonData;
            this.errorData = networkSecurityIssuesIllegalContentAddressErrorData;
            this.addWebsiteAddressButtonData = defaultSingleCardData;
            this.onBack = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DefaultSingleCardData getAddWebsiteAddressButtonData() {
            return this.addWebsiteAddressButtonData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getContentDescription() {
            return this.contentDescription;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getContentHeader() {
            return this.contentHeader;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getCountLimitDescription() {
            return this.countLimitDescription;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.contentHeader, data.contentHeader) && fr.t.c(this.contentDescription, data.contentDescription) && fr.t.c(this.illegalContents, data.illegalContents) && fr.t.c(this.countLimitDescription, data.countLimitDescription) && fr.t.c(this.nextButtonData, data.nextButtonData) && fr.t.c(this.errorData, data.errorData) && fr.t.c(this.addWebsiteAddressButtonData, data.addWebsiteAddressButtonData) && fr.t.c(this.onBack, data.onBack);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final NetworkSecurityIssuesIllegalContentAddressErrorData getErrorData() {
            return this.errorData;
        }

        public final List<DefaultSingleCardData> g() {
            return this.illegalContents;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final ButtonData getNextButtonData() {
            return this.nextButtonData;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.baseScaffoldData.hashCode() * 31) + this.contentHeader.hashCode()) * 31) + this.contentDescription.hashCode()) * 31) + this.illegalContents.hashCode()) * 31) + this.countLimitDescription.hashCode()) * 31) + this.nextButtonData.hashCode()) * 31) + this.errorData.hashCode()) * 31;
            DefaultSingleCardData defaultSingleCardData = this.addWebsiteAddressButtonData;
            return ((iHashCode + (defaultSingleCardData == null ? 0 : defaultSingleCardData.hashCode())) * 31) + this.onBack.hashCode();
        }

        public final er.a<i0> i() {
            return this.onBack;
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", contentHeader=" + this.contentHeader + ", contentDescription=" + this.contentDescription + ", illegalContents=" + this.illegalContents + ", countLimitDescription=" + this.countLimitDescription + ", nextButtonData=" + this.nextButtonData + ", errorData=" + this.errorData + ", addWebsiteAddressButtonData=" + this.addWebsiteAddressButtonData + ", onBack=" + this.onBack + ')';
        }
    }
}
