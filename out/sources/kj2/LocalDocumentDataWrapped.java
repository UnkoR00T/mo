package kj2;

import android.os.Parcel;
import android.os.Parcelable;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: kj2.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lkj2/c;", "Landroid/os/Parcelable;", "Lxh2/a;", "dataHeader", "Lkj2/a;", "dataContainer", "<init>", "(Lxh2/a;Lkj2/a;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Loq/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxh2/a;", "b", "()Lxh2/a;", "Lkj2/a;", "()Lkj2/a;", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocalDocumentDataWrapped implements Parcelable {
    public static final Parcelable.Creator<LocalDocumentDataWrapped> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dataHeader")
    private final xh2.a dataHeader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dataContainer")
    private final LocalDocumentDataContainer dataContainer;

    /* JADX INFO: renamed from: kj2.c$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocalDocumentDataWrapped> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LocalDocumentDataWrapped createFromParcel(Parcel parcel) {
            return new LocalDocumentDataWrapped((xh2.a) parcel.readSerializable(), LocalDocumentDataContainer.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LocalDocumentDataWrapped[] newArray(int i15) {
            return new LocalDocumentDataWrapped[i15];
        }
    }

    public LocalDocumentDataWrapped(xh2.a aVar, LocalDocumentDataContainer localDocumentDataContainer) {
        this.dataHeader = aVar;
        this.dataContainer = localDocumentDataContainer;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDocumentDataContainer getDataContainer() {
        return this.dataContainer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final xh2.a getDataHeader() {
        return this.dataHeader;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalDocumentDataWrapped)) {
            return false;
        }
        LocalDocumentDataWrapped localDocumentDataWrapped = (LocalDocumentDataWrapped) other;
        return t.c(this.dataHeader, localDocumentDataWrapped.dataHeader) && t.c(this.dataContainer, localDocumentDataWrapped.dataContainer);
    }

    public int hashCode() {
        return (this.dataHeader.hashCode() * 31) + this.dataContainer.hashCode();
    }

    public String toString() {
        return "LocalDocumentDataWrapped(dataHeader=" + this.dataHeader + ", dataContainer=" + this.dataContainer + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.dataHeader);
        this.dataContainer.writeToParcel(dest, flags);
    }
}
