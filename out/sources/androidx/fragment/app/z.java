package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
final class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f12691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f12692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f12693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f12694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f12695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f12696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f12697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f12698h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f12699j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f12700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f12701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f12702m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final String f12703n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final int f12704p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final boolean f12705q;

    class a implements Parcelable.Creator<z> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z createFromParcel(Parcel parcel) {
            return new z(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z[] newArray(int i15) {
            return new z[i15];
        }
    }

    z(o oVar) {
        this.f12691a = oVar.getClass().getName();
        this.f12692b = oVar.f12594f;
        this.f12693c = oVar.f12606r;
        this.f12694d = oVar.f12610t;
        this.f12695e = oVar.C;
        this.f12696f = oVar.D;
        this.f12697g = oVar.E;
        this.f12698h = oVar.H;
        this.f12699j = oVar.f12602n;
        this.f12700k = oVar.G;
        this.f12701l = oVar.F;
        this.f12702m = oVar.f12612u0.ordinal();
        this.f12703n = oVar.f12598j;
        this.f12704p = oVar.f12599k;
        this.f12705q = oVar.X;
    }

    o a(s sVar, ClassLoader classLoader) {
        o oVarA = sVar.a(classLoader, this.f12691a);
        oVarA.f12594f = this.f12692b;
        oVarA.f12606r = this.f12693c;
        oVarA.f12610t = this.f12694d;
        oVarA.f12613v = true;
        oVarA.C = this.f12695e;
        oVarA.D = this.f12696f;
        oVarA.E = this.f12697g;
        oVarA.H = this.f12698h;
        oVarA.f12602n = this.f12699j;
        oVarA.G = this.f12700k;
        oVarA.F = this.f12701l;
        oVarA.f12612u0 = androidx.lifecycle.j.b.values()[this.f12702m];
        oVarA.f12598j = this.f12703n;
        oVarA.f12599k = this.f12704p;
        oVarA.X = this.f12705q;
        return oVarA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder(128);
        sb5.append("FragmentState{");
        sb5.append(this.f12691a);
        sb5.append(" (");
        sb5.append(this.f12692b);
        sb5.append(")}:");
        if (this.f12693c) {
            sb5.append(" fromLayout");
        }
        if (this.f12694d) {
            sb5.append(" dynamicContainer");
        }
        if (this.f12696f != 0) {
            sb5.append(" id=0x");
            sb5.append(Integer.toHexString(this.f12696f));
        }
        String str = this.f12697g;
        if (str != null && !str.isEmpty()) {
            sb5.append(" tag=");
            sb5.append(this.f12697g);
        }
        if (this.f12698h) {
            sb5.append(" retainInstance");
        }
        if (this.f12699j) {
            sb5.append(" removing");
        }
        if (this.f12700k) {
            sb5.append(" detached");
        }
        if (this.f12701l) {
            sb5.append(" hidden");
        }
        if (this.f12703n != null) {
            sb5.append(" targetWho=");
            sb5.append(this.f12703n);
            sb5.append(" targetRequestCode=");
            sb5.append(this.f12704p);
        }
        if (this.f12705q) {
            sb5.append(" userVisibleHint");
        }
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        parcel.writeString(this.f12691a);
        parcel.writeString(this.f12692b);
        parcel.writeInt(this.f12693c ? 1 : 0);
        parcel.writeInt(this.f12694d ? 1 : 0);
        parcel.writeInt(this.f12695e);
        parcel.writeInt(this.f12696f);
        parcel.writeString(this.f12697g);
        parcel.writeInt(this.f12698h ? 1 : 0);
        parcel.writeInt(this.f12699j ? 1 : 0);
        parcel.writeInt(this.f12700k ? 1 : 0);
        parcel.writeInt(this.f12701l ? 1 : 0);
        parcel.writeInt(this.f12702m);
        parcel.writeString(this.f12703n);
        parcel.writeInt(this.f12704p);
        parcel.writeInt(this.f12705q ? 1 : 0);
    }

    z(Parcel parcel) {
        this.f12691a = parcel.readString();
        this.f12692b = parcel.readString();
        this.f12693c = parcel.readInt() != 0;
        this.f12694d = parcel.readInt() != 0;
        this.f12695e = parcel.readInt();
        this.f12696f = parcel.readInt();
        this.f12697g = parcel.readString();
        this.f12698h = parcel.readInt() != 0;
        this.f12699j = parcel.readInt() != 0;
        this.f12700k = parcel.readInt() != 0;
        this.f12701l = parcel.readInt() != 0;
        this.f12702m = parcel.readInt();
        this.f12703n = parcel.readString();
        this.f12704p = parcel.readInt();
        this.f12705q = parcel.readInt() != 0;
    }
}
