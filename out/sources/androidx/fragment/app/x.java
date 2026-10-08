package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<String> f12675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList<String> f12676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b[] f12677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f12678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f12679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<String> f12680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList<c> f12681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList<FragmentManager.l> f12682h;

    class a implements Parcelable.Creator<x> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public x createFromParcel(Parcel parcel) {
            return new x(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x[] newArray(int i15) {
            return new x[i15];
        }
    }

    public x() {
        this.f12679e = null;
        this.f12680f = new ArrayList<>();
        this.f12681g = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        parcel.writeStringList(this.f12675a);
        parcel.writeStringList(this.f12676b);
        parcel.writeTypedArray(this.f12677c, i15);
        parcel.writeInt(this.f12678d);
        parcel.writeString(this.f12679e);
        parcel.writeStringList(this.f12680f);
        parcel.writeTypedList(this.f12681g);
        parcel.writeTypedList(this.f12682h);
    }

    public x(Parcel parcel) {
        this.f12679e = null;
        this.f12680f = new ArrayList<>();
        this.f12681g = new ArrayList<>();
        this.f12675a = parcel.createStringArrayList();
        this.f12676b = parcel.createStringArrayList();
        this.f12677c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f12678d = parcel.readInt();
        this.f12679e = parcel.readString();
        this.f12680f = parcel.createStringArrayList();
        this.f12681g = parcel.createTypedArrayList(c.CREATOR);
        this.f12682h = parcel.createTypedArrayList(FragmentManager.l.CREATOR);
    }
}
