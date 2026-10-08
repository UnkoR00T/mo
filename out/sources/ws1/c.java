package ws1;

import iy.b0;
import iy.c0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\u0015R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b \u0010\u0018¨\u0006+"}, d2 = {"Lws1/c;", "", "Liy/b0;", "birthDate", "birthPlace", "birthCountry", "sex", "nationality", "", "expiryDate", "refugeeStatus", "picture", "firstName", "secondName", "surname", "id", "familyName", "pesel", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Ljava/lang/String;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Ljava/lang/String;Liy/b0;Liy/b0;)V", "a", "()Ljava/lang/String;", "Liy/b0;", "c", "()Liy/b0;", "b", "d", "getSex", "e", "f", "Ljava/lang/String;", "getExpiryDate", "g", "getRefugeeStatus", "h", "i", "j", "k", "l", "getId", "m", "getFamilyName", "n", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f214791o = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 birthDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b0 birthPlace;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b0 birthCountry;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b0 sex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b0 nationality;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String expiryDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b0 refugeeStatus;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final b0 picture;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final b0 firstName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final b0 secondName;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final b0 surname;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final b0 familyName;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final b0 pesel;

    public c(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, b0 b0Var5, String str, b0 b0Var6, b0 b0Var7, b0 b0Var8, b0 b0Var9, b0 b0Var10, String str2, b0 b0Var11, b0 b0Var12) {
        this.birthDate = b0Var;
        this.birthPlace = b0Var2;
        this.birthCountry = b0Var3;
        this.sex = b0Var4;
        this.nationality = b0Var5;
        this.expiryDate = str;
        this.refugeeStatus = b0Var6;
        this.picture = b0Var7;
        this.firstName = b0Var8;
        this.secondName = b0Var9;
        this.surname = b0Var10;
        this.id = str2;
        this.familyName = b0Var11;
        this.pesel = b0Var12;
    }

    public final String a() {
        StringBuilder sb5 = new StringBuilder();
        b0 b0Var = this.firstName;
        sb5.append(b0Var != null ? c0.e(b0Var) : null);
        sb5.append(" ");
        b0 b0Var2 = this.secondName;
        if (b0Var2 != null) {
            sb5.append(c0.e(b0Var2));
            sb5.append(" ");
        }
        b0 b0Var3 = this.surname;
        sb5.append(b0Var3 != null ? c0.e(b0Var3) : null);
        return sb5.toString();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getBirthCountry() {
        return this.birthCountry;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getBirthDate() {
        return this.birthDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getBirthPlace() {
        return this.birthPlace;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b0 getNationality() {
        return this.nationality;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b0 getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b0 getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final b0 getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final b0 getSurname() {
        return this.surname;
    }
}
