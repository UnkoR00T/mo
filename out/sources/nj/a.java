package nj;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import r0.l1;

/* JADX INFO: loaded from: classes4.dex */
public class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new C3371a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1<String, Bundle> f136522c;

    /* JADX INFO: renamed from: nj.a$a, reason: collision with other inner class name */
    class C3371a implements Parcelable.ClassLoaderCreator<a> {
        C3371a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i15) {
            return new a[i15];
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C3371a c3371a) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f136522c + "}";
    }

    @Override // r6.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        super.writeToParcel(parcel, i15);
        int size = this.f136522c.getSize();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i16 = 0; i16 < size; i16++) {
            strArr[i16] = this.f136522c.f(i16);
            bundleArr[i16] = this.f136522c.k(i16);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f136522c = new l1<>();
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i15 = parcel.readInt();
        String[] strArr = new String[i15];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i15];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f136522c = new l1<>(i15);
        for (int i16 = 0; i16 < i15; i16++) {
            this.f136522c.put(strArr[i16], bundleArr[i16]);
        }
    }
}
