package fw0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.a0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lfw0/a0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lfw0/g;", "a", "Ljava/util/List;", "()Ljava/util/List;", "businessMessages", "Lfw0/k;", "b", "categories", "Lfw0/w;", "c", "Lfw0/w;", "()Lfw0/w;", "document", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DriverQualificationsResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("businessMessages")
    private final List<BusinessMessageDto> businessMessages;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("categories")
    private final List<CategoryDto> categories;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("document")
    private final DocumentDto document;

    public final List<BusinessMessageDto> a() {
        return this.businessMessages;
    }

    public final List<CategoryDto> b() {
        return this.categories;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DocumentDto getDocument() {
        return this.document;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DriverQualificationsResponse)) {
            return false;
        }
        DriverQualificationsResponse driverQualificationsResponse = (DriverQualificationsResponse) other;
        return fr.t.c(this.businessMessages, driverQualificationsResponse.businessMessages) && fr.t.c(this.categories, driverQualificationsResponse.categories) && fr.t.c(this.document, driverQualificationsResponse.document);
    }

    public int hashCode() {
        return (((this.businessMessages.hashCode() * 31) + this.categories.hashCode()) * 31) + this.document.hashCode();
    }

    public String toString() {
        return "DriverQualificationsResponse(businessMessages=" + this.businessMessages + ", categories=" + this.categories + ", document=" + this.document + ')';
    }
}
