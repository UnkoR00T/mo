package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseIntArray f13603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Parcel f13604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f13605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f13606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f13607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f13608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f13609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f13610k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new r0.a(), new r0.a(), new r0.a());
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f13604e.writeInt(-1);
        } else {
            this.f13604e.writeInt(bArr.length);
            this.f13604e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f13604e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i15) {
        this.f13604e.writeInt(i15);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f13604e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f13604e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i15 = this.f13608i;
        if (i15 >= 0) {
            int i16 = this.f13603d.get(i15);
            int iDataPosition = this.f13604e.dataPosition();
            this.f13604e.setDataPosition(i16);
            this.f13604e.writeInt(iDataPosition - i16);
            this.f13604e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f13604e;
        int iDataPosition = parcel.dataPosition();
        int i15 = this.f13609j;
        if (i15 == this.f13605f) {
            i15 = this.f13606g;
        }
        return new b(parcel, iDataPosition, i15, this.f13607h + "  ", this.f13600a, this.f13601b, this.f13602c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f13604e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int i15 = this.f13604e.readInt();
        if (i15 < 0) {
            return null;
        }
        byte[] bArr = new byte[i15];
        this.f13604e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f13604e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i15) {
        while (this.f13609j < this.f13606g) {
            int i16 = this.f13610k;
            if (i16 == i15) {
                return true;
            }
            if (String.valueOf(i16).compareTo(String.valueOf(i15)) > 0) {
                return false;
            }
            this.f13604e.setDataPosition(this.f13609j);
            int i17 = this.f13604e.readInt();
            this.f13610k = this.f13604e.readInt();
            this.f13609j += i17;
        }
        return this.f13610k == i15;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f13604e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T q() {
        return (T) this.f13604e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f13604e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i15) {
        a();
        this.f13608i = i15;
        this.f13603d.put(i15, this.f13604e.dataPosition());
        E(0);
        E(i15);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z15) {
        this.f13604e.writeInt(z15 ? 1 : 0);
    }

    private b(Parcel parcel, int i15, int i16, String str, r0.a<String, Method> aVar, r0.a<String, Method> aVar2, r0.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f13603d = new SparseIntArray();
        this.f13608i = -1;
        this.f13610k = -1;
        this.f13604e = parcel;
        this.f13605f = i15;
        this.f13606g = i16;
        this.f13609j = i15;
        this.f13607h = str;
    }
}
