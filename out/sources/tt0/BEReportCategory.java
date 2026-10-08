package tt0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: tt0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0015\u0010\rR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Ltt0/g;", "", "Ltt0/e;", "code", "", "name", "additionalDescription", "", "Ltt0/h;", "subCategories", "<init>", "(Ltt0/e;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltt0/e;", "b", "()Ltt0/e;", "Ljava/lang/String;", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEReportCategory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final e code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String additionalDescription;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEReportSubCategory> subCategories;

    public BEReportCategory(e eVar, String str, String str2, List<BEReportSubCategory> list) {
        this.code = eVar;
        this.name = str;
        this.additionalDescription = str2;
        this.subCategories = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdditionalDescription() {
        return this.additionalDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<BEReportSubCategory> d() {
        return this.subCategories;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEReportCategory)) {
            return false;
        }
        BEReportCategory bEReportCategory = (BEReportCategory) other;
        return this.code == bEReportCategory.code && fr.t.c(this.name, bEReportCategory.name) && fr.t.c(this.additionalDescription, bEReportCategory.additionalDescription) && fr.t.c(this.subCategories, bEReportCategory.subCategories);
    }

    public int hashCode() {
        int iHashCode = ((this.code.hashCode() * 31) + this.name.hashCode()) * 31;
        String str = this.additionalDescription;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.subCategories.hashCode();
    }

    public String toString() {
        return "BEReportCategory(code=" + this.code + ", name=" + this.name + ", additionalDescription=" + this.additionalDescription + ", subCategories=" + this.subCategories + ")";
    }
}
