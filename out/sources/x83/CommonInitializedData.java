package x83;

import fr.k;
import fr.t;
import java.util.List;
import oo0.CategoryTopics;
import oo0.Topic;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: x83.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lx83/a;", "", "", "Loo0/d;", "categories", "Lx83/d;", "Loo0/u;", "reportTopic", "", "reportDescription", "<init>", "(Ljava/util/List;Lx83/d;Lx83/d;)V", "a", "(Ljava/util/List;Lx83/d;Lx83/d;)Lx83/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lx83/d;", "e", "()Lx83/d;", "d", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommonInitializedData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CategoryTopics> categories;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final FieldData<Topic> reportTopic;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final FieldData<String> reportDescription;

    public CommonInitializedData(List<CategoryTopics> list, FieldData<Topic> fieldData, FieldData<String> fieldData2) {
        this.categories = list;
        this.reportTopic = fieldData;
        this.reportDescription = fieldData2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommonInitializedData b(CommonInitializedData commonInitializedData, List list, FieldData fieldData, FieldData fieldData2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = commonInitializedData.categories;
        }
        if ((i15 & 2) != 0) {
            fieldData = commonInitializedData.reportTopic;
        }
        if ((i15 & 4) != 0) {
            fieldData2 = commonInitializedData.reportDescription;
        }
        return commonInitializedData.a(list, fieldData, fieldData2);
    }

    public final CommonInitializedData a(List<CategoryTopics> categories, FieldData<Topic> reportTopic, FieldData<String> reportDescription) {
        return new CommonInitializedData(categories, reportTopic, reportDescription);
    }

    public final List<CategoryTopics> c() {
        return this.categories;
    }

    public final FieldData<String> d() {
        return this.reportDescription;
    }

    public final FieldData<Topic> e() {
        return this.reportTopic;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonInitializedData)) {
            return false;
        }
        CommonInitializedData commonInitializedData = (CommonInitializedData) other;
        return t.c(this.categories, commonInitializedData.categories) && t.c(this.reportTopic, commonInitializedData.reportTopic) && t.c(this.reportDescription, commonInitializedData.reportDescription);
    }

    public int hashCode() {
        return (((this.categories.hashCode() * 31) + this.reportTopic.hashCode()) * 31) + this.reportDescription.hashCode();
    }

    public String toString() {
        return "CommonInitializedData(categories=" + this.categories + ", reportTopic=" + this.reportTopic + ", reportDescription=" + this.reportDescription + ')';
    }

    public /* synthetic */ CommonInitializedData(List list, FieldData fieldData, FieldData fieldData2, int i15, k kVar) {
        this(list, (i15 & 2) != 0 ? new FieldData(null, null, 2, null) : fieldData, (i15 & 4) != 0 ? new FieldData("", null, 2, null) : fieldData2);
    }
}
