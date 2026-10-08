package r6;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Parcelable f171968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f171967b = new C4376a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: r6.a$a, reason: collision with other inner class name */
    class C4376a extends a {
        C4376a() {
            super((C4376a) null);
        }
    }

    class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f171967b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i15) {
            return new a[i15];
        }
    }

    /* synthetic */ a(C4376a c4376a) {
        this();
    }

    public final Parcelable a() {
        return this.f171968a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(this.f171968a, i15);
    }

    private a() {
        this.f171968a = null;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f171968a = parcelable == f171967b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f171968a = parcelable == null ? f171967b : parcelable;
    }
}
