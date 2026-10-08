package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f12397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<String> f12398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[] f12399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int[] f12400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f12401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f12402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f12403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f12404h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final CharSequence f12405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f12406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final CharSequence f12407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ArrayList<String> f12408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final ArrayList<String> f12409n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final boolean f12410p;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i15) {
            return new b[i15];
        }
    }

    b(androidx.fragment.app.a aVar) {
        int size = aVar.f12419c.size();
        this.f12397a = new int[size * 6];
        if (!aVar.f12425i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f12398b = new ArrayList<>(size);
        this.f12399c = new int[size];
        this.f12400d = new int[size];
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            c0.a aVar2 = aVar.f12419c.get(i16);
            int i17 = i15 + 1;
            this.f12397a[i15] = aVar2.f12436a;
            ArrayList<String> arrayList = this.f12398b;
            o oVar = aVar2.f12437b;
            arrayList.add(oVar != null ? oVar.f12594f : null);
            int[] iArr = this.f12397a;
            iArr[i17] = aVar2.f12438c ? 1 : 0;
            iArr[i15 + 2] = aVar2.f12439d;
            iArr[i15 + 3] = aVar2.f12440e;
            int i18 = i15 + 5;
            iArr[i15 + 4] = aVar2.f12441f;
            i15 += 6;
            iArr[i18] = aVar2.f12442g;
            this.f12399c[i16] = aVar2.f12443h.ordinal();
            this.f12400d[i16] = aVar2.f12444i.ordinal();
        }
        this.f12401e = aVar.f12424h;
        this.f12402f = aVar.f12427k;
        this.f12403g = aVar.f12387v;
        this.f12404h = aVar.f12428l;
        this.f12405j = aVar.f12429m;
        this.f12406k = aVar.f12430n;
        this.f12407l = aVar.f12431o;
        this.f12408m = aVar.f12432p;
        this.f12409n = aVar.f12433q;
        this.f12410p = aVar.f12434r;
    }

    private void a(androidx.fragment.app.a aVar) {
        int i15 = 0;
        int i16 = 0;
        while (true) {
            boolean z15 = true;
            if (i15 >= this.f12397a.length) {
                aVar.f12424h = this.f12401e;
                aVar.f12427k = this.f12402f;
                aVar.f12425i = true;
                aVar.f12428l = this.f12404h;
                aVar.f12429m = this.f12405j;
                aVar.f12430n = this.f12406k;
                aVar.f12431o = this.f12407l;
                aVar.f12432p = this.f12408m;
                aVar.f12433q = this.f12409n;
                aVar.f12434r = this.f12410p;
                return;
            }
            c0.a aVar2 = new c0.a();
            int i17 = i15 + 1;
            aVar2.f12436a = this.f12397a[i15];
            if (FragmentManager.L0(2)) {
                Objects.toString(aVar);
                int i18 = this.f12397a[i17];
            }
            aVar2.f12443h = androidx.lifecycle.j.b.values()[this.f12399c[i16]];
            aVar2.f12444i = androidx.lifecycle.j.b.values()[this.f12400d[i16]];
            int[] iArr = this.f12397a;
            int i19 = i15 + 2;
            if (iArr[i17] == 0) {
                z15 = false;
            }
            aVar2.f12438c = z15;
            int i25 = iArr[i19];
            aVar2.f12439d = i25;
            int i26 = iArr[i15 + 3];
            aVar2.f12440e = i26;
            int i27 = i15 + 5;
            int i28 = iArr[i15 + 4];
            aVar2.f12441f = i28;
            i15 += 6;
            int i29 = iArr[i27];
            aVar2.f12442g = i29;
            aVar.f12420d = i25;
            aVar.f12421e = i26;
            aVar.f12422f = i28;
            aVar.f12423g = i29;
            aVar.f(aVar2);
            i16++;
        }
    }

    public androidx.fragment.app.a b(FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        aVar.f12387v = this.f12403g;
        for (int i15 = 0; i15 < this.f12398b.size(); i15++) {
            String str = this.f12398b.get(i15);
            if (str != null) {
                aVar.f12419c.get(i15).f12437b = fragmentManager.g0(str);
            }
        }
        aVar.w(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        parcel.writeIntArray(this.f12397a);
        parcel.writeStringList(this.f12398b);
        parcel.writeIntArray(this.f12399c);
        parcel.writeIntArray(this.f12400d);
        parcel.writeInt(this.f12401e);
        parcel.writeString(this.f12402f);
        parcel.writeInt(this.f12403g);
        parcel.writeInt(this.f12404h);
        TextUtils.writeToParcel(this.f12405j, parcel, 0);
        parcel.writeInt(this.f12406k);
        TextUtils.writeToParcel(this.f12407l, parcel, 0);
        parcel.writeStringList(this.f12408m);
        parcel.writeStringList(this.f12409n);
        parcel.writeInt(this.f12410p ? 1 : 0);
    }

    b(Parcel parcel) {
        this.f12397a = parcel.createIntArray();
        this.f12398b = parcel.createStringArrayList();
        this.f12399c = parcel.createIntArray();
        this.f12400d = parcel.createIntArray();
        this.f12401e = parcel.readInt();
        this.f12402f = parcel.readString();
        this.f12403g = parcel.readInt();
        this.f12404h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f12405j = (CharSequence) creator.createFromParcel(parcel);
        this.f12406k = parcel.readInt();
        this.f12407l = (CharSequence) creator.createFromParcel(parcel);
        this.f12408m = parcel.createStringArrayList();
        this.f12409n = parcel.createStringArrayList();
        this.f12410p = parcel.readInt() != 0;
    }
}
