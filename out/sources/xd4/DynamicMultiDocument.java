package xd4;

import android.os.Parcel;
import android.os.Parcelable;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xd4.g, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lxd4/g;", "", "", "documentId", "Lrq0/b$c;", "documentType", "<init>", "(Ljava/lang/String;Lrq0/b$c;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Loq/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lrq0/b$c;", "()Lrq0/b$c;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicMultiDocument implements u {
    public static final Parcelable.Creator<DynamicMultiDocument> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f218072c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final rq0.b.c documentType;

    /* JADX INFO: renamed from: xd4.g$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DynamicMultiDocument> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DynamicMultiDocument createFromParcel(Parcel parcel) {
            return new DynamicMultiDocument(parcel.readString(), rq0.b.c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DynamicMultiDocument[] newArray(int i15) {
            return new DynamicMultiDocument[i15];
        }
    }

    public DynamicMultiDocument(String str, rq0.b.c cVar) {
        this.documentId = str;
        this.documentType = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final rq0.b.c getDocumentType() {
        return this.documentType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicMultiDocument)) {
            return false;
        }
        DynamicMultiDocument dynamicMultiDocument = (DynamicMultiDocument) other;
        return fr.t.c(this.documentId, dynamicMultiDocument.documentId) && this.documentType == dynamicMultiDocument.documentType;
    }

    public int hashCode() {
        return (this.documentId.hashCode() * 31) + this.documentType.hashCode();
    }

    public String toString() {
        return "DynamicMultiDocument(documentId=" + this.documentId + ", documentType=" + this.documentType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.documentId);
        dest.writeString(this.documentType.name());
    }
}
