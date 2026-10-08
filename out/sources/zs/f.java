package zs;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Comparable<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f236650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f236651b;

    private f(String str, boolean z15) {
        if (str == null) {
            b(0);
        }
        this.f236650a = str;
        this.f236651b = z15;
    }

    private static /* synthetic */ void b(int i15) {
        String str = (i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4) ? 2 : 3];
        if (i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i15 == 1) {
            objArr[1] = "asString";
        } else if (i15 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i15 == 3 || i15 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i15) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 != 1 && i15 != 2 && i15 != 3 && i15 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static f k(String str) {
        if (str == null) {
            b(9);
        }
        return str.startsWith("<") ? p(str) : l(str);
    }

    public static f l(String str) {
        if (str == null) {
            b(5);
        }
        return new f(str, false);
    }

    public static boolean o(String str) {
        if (str == null) {
            b(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i15 = 0; i15 < str.length(); i15++) {
            char cCharAt = str.charAt(i15);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static f p(String str) {
        if (str == null) {
            b(8);
        }
        if (str.startsWith("<")) {
            return new f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    public String e() {
        String str = this.f236650a;
        if (str == null) {
            b(1);
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f236651b == fVar.f236651b && this.f236650a.equals(fVar.f236650a);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        return this.f236650a.compareTo(fVar.f236650a);
    }

    public int hashCode() {
        return (this.f236650a.hashCode() * 31) + (this.f236651b ? 1 : 0);
    }

    public String j() {
        if (this.f236651b) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strE = e();
        if (strE == null) {
            b(2);
        }
        return strE;
    }

    public boolean n() {
        return this.f236651b;
    }

    public String toString() {
        return this.f236650a;
    }
}
