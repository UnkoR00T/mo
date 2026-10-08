package ei2;

import android.os.Parcel;
import android.os.Parcelable;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ei2.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lei2/c;", "Landroid/os/Parcelable;", "Lvh2/b;", "Lxh2/a;", "dataHeader", "Lei2/a;", "dataContainer", "<init>", "(Lxh2/a;Lei2/a;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Loq/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lxh2/a;", "b", "()Lxh2/a;", "d", "Lei2/a;", "a", "()Lei2/a;", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RailwayCardWrapped extends vh2.b implements Parcelable {
    public static final Parcelable.Creator<RailwayCardWrapped> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dh")
    private final xh2.a dataHeader;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dc")
    private final RailwayCardData dataContainer;

    /* JADX INFO: renamed from: ei2.c$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RailwayCardWrapped> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RailwayCardWrapped createFromParcel(Parcel parcel) {
            return new RailwayCardWrapped((xh2.a) parcel.readSerializable(), RailwayCardData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RailwayCardWrapped[] newArray(int i15) {
            return new RailwayCardWrapped[i15];
        }
    }

    public RailwayCardWrapped(xh2.a aVar, RailwayCardData railwayCardData) {
        super(aVar, railwayCardData);
        this.dataHeader = aVar;
        this.dataContainer = railwayCardData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public RailwayCardData getDataContainer() {
        return this.dataContainer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public xh2.a getDataHeader() {
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
        if (!(other instanceof RailwayCardWrapped)) {
            return false;
        }
        RailwayCardWrapped railwayCardWrapped = (RailwayCardWrapped) other;
        return t.c(this.dataHeader, railwayCardWrapped.dataHeader) && t.c(this.dataContainer, railwayCardWrapped.dataContainer);
    }

    public int hashCode() {
        return (this.dataHeader.hashCode() * 31) + this.dataContainer.hashCode();
    }

    public String toString() {
        return "RailwayCardWrapped(dataHeader=" + this.dataHeader + ", dataContainer=" + this.dataContainer + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.dataHeader);
        this.dataContainer.writeToParcel(dest, flags);
    }
}
