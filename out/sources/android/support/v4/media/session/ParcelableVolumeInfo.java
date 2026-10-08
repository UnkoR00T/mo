package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8064e;

    class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i15) {
            return new ParcelableVolumeInfo[i15];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f8060a = parcel.readInt();
        this.f8062c = parcel.readInt();
        this.f8063d = parcel.readInt();
        this.f8064e = parcel.readInt();
        this.f8061b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        parcel.writeInt(this.f8060a);
        parcel.writeInt(this.f8062c);
        parcel.writeInt(this.f8063d);
        parcel.writeInt(this.f8064e);
        parcel.writeInt(this.f8061b);
    }
}
