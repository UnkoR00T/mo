package vh2;

import android.os.Parcel;
import android.os.Parcelable;
import fr.k;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0017\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lvh2/a;", "Landroid/os/Parcelable;", "", "cardRelation", "holderType", "batch", "number", "firstName", "secondName", "lastName", "", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Loq/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getCardRelation", "()Ljava/lang/String;", "b", "getHolderType", "c", "getBatch", "d", "getNumber", "e", "getFirstName", "f", "getSecondName", "g", "getLastName", "h", "I", "getId", "setId", "(I)V", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C5413a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final transient String cardRelation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final transient String holderType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final transient String batch;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final transient String number;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final transient String firstName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final transient String secondName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final transient String lastName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private transient int id;

    /* JADX INFO: renamed from: vh2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C5413a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i15) {
            return new a[i15];
        }
    }

    public a() {
        this(null, null, null, null, null, null, null, 0, GF2Field.MASK, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.cardRelation);
        dest.writeString(this.holderType);
        dest.writeString(this.batch);
        dest.writeString(this.number);
        dest.writeString(this.firstName);
        dest.writeString(this.secondName);
        dest.writeString(this.lastName);
        dest.writeInt(this.id);
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i15) {
        this.cardRelation = str;
        this.holderType = str2;
        this.batch = str3;
        this.number = str4;
        this.firstName = str5;
        this.secondName = str6;
        this.lastName = str7;
        this.id = i15;
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i15, int i16, k kVar) {
        this((i16 & 1) != 0 ? new String() : str, (i16 & 2) != 0 ? new String() : str2, (i16 & 4) != 0 ? new String() : str3, (i16 & 8) != 0 ? new String() : str4, (i16 & 16) != 0 ? new String() : str5, (i16 & 32) != 0 ? new String() : str6, (i16 & 64) != 0 ? new String() : str7, (i16 & 128) != 0 ? 0 : i15);
    }
}
