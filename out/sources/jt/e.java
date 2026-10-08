package jt;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import sr.m;

/* JADX INFO: loaded from: classes4.dex */
public enum e {
    BOOLEAN(m.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(m.CHAR, "char", "C", "java.lang.Character"),
    BYTE(m.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(m.SHORT, "short", ip.a.f96137b, "java.lang.Short"),
    INT(m.INT, "int", "I", "java.lang.Integer"),
    FLOAT(m.FLOAT, "float", "F", "java.lang.Float"),
    LONG(m.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(m.DOUBLE, "double", ip.a.f96138c, "java.lang.Double");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map<String, e> f105203n = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Map<m, e> f105204p = new EnumMap(m.class);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Map<String, e> f105205q = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Set<String> f105206r = new HashSet();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Map<String, String> f105207s = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f105209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f105210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f105211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zs.c f105212d;

    static {
        for (e eVar : values()) {
            f105203n.put(eVar.k(), eVar);
            f105204p.put(eVar.n(), eVar);
            f105205q.put(eVar.j(), eVar);
            String strReplace = eVar.f105212d.a().replace('.', '/');
            f105206r.add(strReplace);
            f105207s.put(strReplace, "(" + eVar.f105211c + ")L" + strReplace + ";");
        }
    }

    e(m mVar, String str, String str2, String str3) {
        if (mVar == null) {
            b(8);
        }
        if (str == null) {
            b(9);
        }
        if (str2 == null) {
            b(10);
        }
        if (str3 == null) {
            b(11);
        }
        this.f105209a = mVar;
        this.f105210b = str;
        this.f105211c = str2;
        this.f105212d = new zs.c(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    private static /* synthetic */ void b(int i15) {
        String str;
        int i16;
        if (i15 != 4 && i15 != 6) {
            switch (i15) {
                case 12:
                case 13:
                case 14:
                case 15:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i15 != 4 && i15 != 6) {
            switch (i15) {
                case 12:
                case 13:
                case 14:
                case 15:
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
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "methodDescriptor";
                break;
            case 3:
            case 9:
                objArr[0] = "name";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 5:
                objArr[0] = "type";
                break;
            case 7:
            case 10:
                objArr[0] = "desc";
                break;
            case 8:
                objArr[0] = "primitiveType";
                break;
            case 11:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i15 != 4 && i15 != 6) {
            switch (i15) {
                case 12:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 13:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 14:
                    objArr[1] = "getDesc";
                    break;
                case 15:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i15) {
            case 1:
            case 2:
                objArr[2] = "isBoxingMethodDescriptor";
                break;
            case 3:
            case 5:
                objArr[2] = "get";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "getByDesc";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 != 4 && i15 != 6) {
            switch (i15) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static e e(String str) {
        if (str == null) {
            b(3);
        }
        e eVar = f105203n.get(str);
        if (eVar != null) {
            return eVar;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    public static e g(m mVar) {
        if (mVar == null) {
            b(5);
        }
        e eVar = f105204p.get(mVar);
        if (eVar == null) {
            b(6);
        }
        return eVar;
    }

    public String j() {
        String str = this.f105211c;
        if (str == null) {
            b(14);
        }
        return str;
    }

    public String k() {
        String str = this.f105210b;
        if (str == null) {
            b(13);
        }
        return str;
    }

    public m n() {
        m mVar = this.f105209a;
        if (mVar == null) {
            b(12);
        }
        return mVar;
    }

    public zs.c o() {
        zs.c cVar = this.f105212d;
        if (cVar == null) {
            b(15);
        }
        return cVar;
    }
}
