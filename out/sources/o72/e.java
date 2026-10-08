package o72;

import i50.BaseScaffoldData;
import p071kotlin.Metadata;
import q72.BulletListSection;
import q72.DescribedImagesSection;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lo72/e;", "Ll00/e;", "Lo72/e$a;", "a", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<Data> {

    /* JADX INFO: renamed from: o72.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, d2 = {"Lo72/e$a;", "", "Lq72/c;", "infoFlagsSection", "personHandSignSection", "Lq72/a;", "inCaseOfFloodDangerSection", "duringFloodSection", "Lc30/b$c;", "morInfoAlertData", "Li50/a;", "scaffoldData", "<init>", "(Lq72/c;Lq72/c;Lq72/a;Lq72/a;Lc30/b$c;Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq72/c;", "c", "()Lq72/c;", "b", "e", "Lq72/a;", "()Lq72/a;", "d", "Lc30/b$c;", "()Lc30/b$c;", "f", "Li50/a;", "()Li50/a;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DescribedImagesSection infoFlagsSection;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final DescribedImagesSection personHandSignSection;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final BulletListSection inCaseOfFloodDangerSection;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final BulletListSection duringFloodSection;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b.c morInfoAlertData;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        public Data(DescribedImagesSection describedImagesSection, DescribedImagesSection describedImagesSection2, BulletListSection bulletListSection, BulletListSection bulletListSection2, c30.b.c cVar, BaseScaffoldData baseScaffoldData) {
            this.infoFlagsSection = describedImagesSection;
            this.personHandSignSection = describedImagesSection2;
            this.inCaseOfFloodDangerSection = bulletListSection;
            this.duringFloodSection = bulletListSection2;
            this.morInfoAlertData = cVar;
            this.scaffoldData = baseScaffoldData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BulletListSection getDuringFloodSection() {
            return this.duringFloodSection;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BulletListSection getInCaseOfFloodDangerSection() {
            return this.inCaseOfFloodDangerSection;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final DescribedImagesSection getInfoFlagsSection() {
            return this.infoFlagsSection;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final c30.b.c getMorInfoAlertData() {
            return this.morInfoAlertData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final DescribedImagesSection getPersonHandSignSection() {
            return this.personHandSignSection;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.infoFlagsSection, data.infoFlagsSection) && fr.t.c(this.personHandSignSection, data.personHandSignSection) && fr.t.c(this.inCaseOfFloodDangerSection, data.inCaseOfFloodDangerSection) && fr.t.c(this.duringFloodSection, data.duringFloodSection) && fr.t.c(this.morInfoAlertData, data.morInfoAlertData) && fr.t.c(this.scaffoldData, data.scaffoldData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public int hashCode() {
            return (((((((((this.infoFlagsSection.hashCode() * 31) + this.personHandSignSection.hashCode()) * 31) + this.inCaseOfFloodDangerSection.hashCode()) * 31) + this.duringFloodSection.hashCode()) * 31) + this.morInfoAlertData.hashCode()) * 31) + this.scaffoldData.hashCode();
        }

        public String toString() {
            return "Data(infoFlagsSection=" + this.infoFlagsSection + ", personHandSignSection=" + this.personHandSignSection + ", inCaseOfFloodDangerSection=" + this.inCaseOfFloodDangerSection + ", duringFloodSection=" + this.duringFloodSection + ", morInfoAlertData=" + this.morInfoAlertData + ", scaffoldData=" + this.scaffoldData + ')';
        }
    }
}
