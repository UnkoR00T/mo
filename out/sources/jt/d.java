package jt;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f105193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private zs.c f105194b;

    private d(String str) {
        if (str == null) {
            a(7);
        }
        this.f105193a = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    private static /* synthetic */ void a(int i15) {
        String str;
        int i16;
        if (i15 != 3 && i15 != 5) {
            switch (i15) {
                case 8:
                case 9:
                case 10:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i15 != 3 && i15 != 5) {
            switch (i15) {
                case 8:
                case 9:
                case 10:
                    i16 = 2;
                    break;
                default:
                    i16 = 3;
                    break;
            }
        } else {
            i16 = 2;
        }
        Object[] objArr = new Object[i16];
        switch (i15) {
            case 1:
            case 2:
                objArr[0] = "classId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 4:
            case 6:
                objArr[0] = "fqName";
                break;
            case 7:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i15 == 3) {
            objArr[1] = "internalNameByClassId";
        } else if (i15 != 5) {
            switch (i15) {
                case 8:
                    objArr[1] = "getFqNameForClassNameWithoutDollars";
                    break;
                case 9:
                    objArr[1] = "getPackageFqName";
                    break;
                case 10:
                    objArr[1] = "getInternalName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    break;
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i15) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
                objArr[2] = "internalNameByClassId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                break;
            case 4:
            case 6:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 != 3 && i15 != 5) {
            switch (i15) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static d b(zs.b bVar) {
        if (bVar == null) {
            a(1);
        }
        return new d(h(bVar));
    }

    public static d c(zs.c cVar) {
        if (cVar == null) {
            a(4);
        }
        d dVar = new d(cVar.a().replace('.', '/'));
        dVar.f105194b = cVar;
        return dVar;
    }

    public static d d(String str) {
        if (str == null) {
            a(0);
        }
        return new d(str);
    }

    public static String h(zs.b bVar) {
        if (bVar == null) {
            a(2);
        }
        zs.c cVarF = bVar.f();
        String strReplace = bVar.g().a().replace('.', '$');
        if (!cVarF.c()) {
            strReplace = cVarF.a().replace('.', '/') + "/" + strReplace;
        }
        if (strReplace == null) {
            a(3);
        }
        return strReplace;
    }

    public zs.c e() {
        return new zs.c(this.f105193a.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f105193a.equals(((d) obj).f105193a);
    }

    public String f() {
        String str = this.f105193a;
        if (str == null) {
            a(10);
        }
        return str;
    }

    public zs.c g() {
        int iLastIndexOf = this.f105193a.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return new zs.c(this.f105193a.substring(0, iLastIndexOf).replace('/', '.'));
        }
        zs.c cVar = zs.c.f236639d;
        if (cVar == null) {
            a(9);
        }
        return cVar;
    }

    public int hashCode() {
        return this.f105193a.hashCode();
    }

    public String toString() {
        return this.f105193a;
    }
}
