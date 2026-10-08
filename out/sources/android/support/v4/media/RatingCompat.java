package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f8046b;

    class a implements Parcelable.Creator<RatingCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i15) {
            return new RatingCompat[i15];
        }
    }

    RatingCompat(int i15, float f15) {
        this.f8045a = i15;
        this.f8046b = f15;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f8045a;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Rating:style=");
        sb5.append(this.f8045a);
        sb5.append(" rating=");
        float f15 = this.f8046b;
        sb5.append(f15 < 0.0f ? "unrated" : String.valueOf(f15));
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        parcel.writeInt(this.f8045a);
        parcel.writeFloat(this.f8046b);
    }
}
