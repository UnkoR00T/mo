package t7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f188320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f188321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f188322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f188323d;

    class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i15) {
            return new l[i15];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f188324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f188325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f188326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f188327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f188328e;

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

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public b a(byte[] bArr) {
            return new b(this.f188325b, this.f188326c, this.f188327d, bArr);
        }

        public boolean b(UUID uuid) {
            return f.f188170b.equals(this.f188325b) || uuid.equals(this.f188325b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f188326c, bVar.f188326c) && Objects.equals(this.f188327d, bVar.f188327d) && Objects.equals(this.f188325b, bVar.f188325b) && Arrays.equals(this.f188328e, bVar.f188328e);
        }

        public int hashCode() {
            if (this.f188324a == 0) {
                int iHashCode = this.f188325b.hashCode() * 31;
                String str = this.f188326c;
                this.f188324a = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f188327d.hashCode()) * 31) + Arrays.hashCode(this.f188328e);
            }
            return this.f188324a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            parcel.writeLong(this.f188325b.getMostSignificantBits());
            parcel.writeLong(this.f188325b.getLeastSignificantBits());
            parcel.writeString(this.f188326c);
            parcel.writeString(this.f188327d);
            parcel.writeByteArray(this.f188328e);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f188325b = (UUID) zj.p.q(uuid);
            this.f188326c = str;
            this.f188327d = w.l((String) zj.p.q(str2));
            this.f188328e = bArr;
        }

        b(Parcel parcel) {
            this.f188325b = new UUID(parcel.readLong(), parcel.readLong());
            this.f188326c = parcel.readString();
            this.f188327d = (String) o0.h(parcel.readString());
            this.f188328e = parcel.createByteArray();
        }
    }

    public l(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = f.f188170b;
        if (uuid.equals(bVar.f188325b)) {
            return uuid.equals(bVar2.f188325b) ? 0 : 1;
        }
        return bVar.f188325b.compareTo(bVar2.f188325b);
    }

    public l b(String str) {
        return Objects.equals(this.f188322c, str) ? this : new l(str, false, this.f188320a);
    }

    public b c(int i15) {
        return this.f188320a[i15];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (Objects.equals(this.f188322c, lVar.f188322c) && Arrays.equals(this.f188320a, lVar.f188320a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f188321b == 0) {
            String str = this.f188322c;
            this.f188321b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f188320a);
        }
        return this.f188321b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        parcel.writeString(this.f188322c);
        parcel.writeTypedArray(this.f188320a, 0);
    }

    public l(b... bVarArr) {
        this(null, bVarArr);
    }

    public l(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    private l(String str, boolean z15, b... bVarArr) {
        this.f188322c = str;
        bVarArr = z15 ? (b[]) bVarArr.clone() : bVarArr;
        this.f188320a = bVarArr;
        this.f188323d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    l(Parcel parcel) {
        this.f188322c = parcel.readString();
        b[] bVarArr = (b[]) o0.h((b[]) parcel.createTypedArray(b.CREATOR));
        this.f188320a = bVarArr;
        this.f188323d = bVarArr.length;
    }
}
