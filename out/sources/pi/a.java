package pi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import zj.p;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public enum a implements Parcelable {
    FULLSCREEN,
    OVERLAY;


    @RecentlyNonNull
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator() { // from class: pi.e
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a.valueOf((String) p.q(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i15) {
            return new a[i15];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i15) {
        parcel.writeString(name());
    }
}
