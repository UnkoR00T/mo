package o20;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: o20.j, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001c"}, d2 = {"Lo20/j;", "", "", "testTag", "", "Lo20/l;", "additionalData", "Lc30/b;", "topAlertData", "bottomAlertData", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "d", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BaseDocumentComponentNewData {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f140736e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<l> additionalData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<c30.b> topAlertData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<c30.b> bottomAlertData;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseDocumentComponentNewData(String str, List<? extends l> list, List<? extends c30.b> list2, List<? extends c30.b> list3) {
        this.testTag = str;
        this.additionalData = list;
        this.topAlertData = list2;
        this.bottomAlertData = list3;
    }

    public final List<l> a() {
        return this.additionalData;
    }

    public final List<c30.b> b() {
        return this.bottomAlertData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    public final List<c30.b> d() {
        return this.topAlertData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseDocumentComponentNewData)) {
            return false;
        }
        BaseDocumentComponentNewData baseDocumentComponentNewData = (BaseDocumentComponentNewData) other;
        return fr.t.c(this.testTag, baseDocumentComponentNewData.testTag) && fr.t.c(this.additionalData, baseDocumentComponentNewData.additionalData) && fr.t.c(this.topAlertData, baseDocumentComponentNewData.topAlertData) && fr.t.c(this.bottomAlertData, baseDocumentComponentNewData.bottomAlertData);
    }

    public int hashCode() {
        String str = this.testTag;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.additionalData.hashCode()) * 31;
        List<c30.b> list = this.topAlertData;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<c30.b> list2 = this.bottomAlertData;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "BaseDocumentComponentNewData(testTag=" + this.testTag + ", additionalData=" + this.additionalData + ", topAlertData=" + this.topAlertData + ", bottomAlertData=" + this.bottomAlertData + ')';
    }

    public /* synthetic */ BaseDocumentComponentNewData(String str, List list, List list2, List list3, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, list, (i15 & 4) != 0 ? null : list2, (i15 & 8) != 0 ? null : list3);
    }
}
