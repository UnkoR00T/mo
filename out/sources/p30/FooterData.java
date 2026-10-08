package p30;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: p30.a0, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"Lp30/a0;", "", "Lp30/b0;", "sourcesData", "", "Lp30/x;", "actionsData", "<init>", "(Lp30/b0;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp30/b0;", "b", "()Lp30/b0;", "Ljava/util/List;", "()Ljava/util/List;", "c", "Z", "()Z", "isVisible", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FooterData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SourcesData sourcesData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<x> actionsData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isVisible;

    /* JADX WARN: Multi-variable type inference failed */
    public FooterData(SourcesData sourcesData, List<? extends x> list) {
        this.sourcesData = sourcesData;
        this.actionsData = list;
        this.isVisible = (sourcesData == null && list.isEmpty()) ? false : true;
    }

    public final List<x> a() {
        return this.actionsData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SourcesData getSourcesData() {
        return this.sourcesData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FooterData)) {
            return false;
        }
        FooterData footerData = (FooterData) other;
        return fr.t.c(this.sourcesData, footerData.sourcesData) && fr.t.c(this.actionsData, footerData.actionsData);
    }

    public int hashCode() {
        SourcesData sourcesData = this.sourcesData;
        return ((sourcesData == null ? 0 : sourcesData.hashCode()) * 31) + this.actionsData.hashCode();
    }

    public String toString() {
        return "FooterData(sourcesData=" + this.sourcesData + ", actionsData=" + this.actionsData + ')';
    }
}
