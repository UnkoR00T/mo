package yn;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements yn.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f228004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f228005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f228006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f228007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f228008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f228009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f228010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ c[] f228011h;

    final enum a extends c {
        a(String str, int i15) {
            super(str, i15, null);
        }

        @Override // yn.d
        public String b(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f228004a = aVar;
        c cVar = new c("UPPER_CAMEL_CASE", 1) { // from class: yn.c.b
            {
                a aVar2 = null;
            }

            @Override // yn.d
            public String b(Field field) {
                return c.g(field.getName());
            }
        };
        f228005b = cVar;
        c cVar2 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: yn.c.c
            {
                a aVar2 = null;
            }

            @Override // yn.d
            public String b(Field field) {
                return c.g(c.e(field.getName(), ' '));
            }
        };
        f228006c = cVar2;
        c cVar3 = new c("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: yn.c.d
            {
                a aVar2 = null;
            }

            @Override // yn.d
            public String b(Field field) {
                return c.e(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        f228007d = cVar3;
        c cVar4 = new c("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: yn.c.e
            {
                a aVar2 = null;
            }

            @Override // yn.d
            public String b(Field field) {
                return c.e(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        f228008e = cVar4;
        c cVar5 = new c("LOWER_CASE_WITH_DASHES", 5) { // from class: yn.c.f
            {
                a aVar2 = null;
            }

            @Override // yn.d
            public String b(Field field) {
                return c.e(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        f228009f = cVar5;
        c cVar6 = new c("LOWER_CASE_WITH_DOTS", 6) { // from class: yn.c.g
            {
                a aVar2 = null;
            }

            @Override // yn.d
            public String b(Field field) {
                return c.e(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        f228010g = cVar6;
        f228011h = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
    }

    private c(String str, int i15) {
        super(str, i15);
    }

    static String e(String str, char c15) {
        StringBuilder sb5 = new StringBuilder();
        int length = str.length();
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            if (Character.isUpperCase(cCharAt) && sb5.length() != 0) {
                sb5.append(c15);
            }
            sb5.append(cCharAt);
        }
        return sb5.toString();
    }

    static String g(String str) {
        int length = str.length();
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i15 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i15) + upperCase + str.substring(i15 + 1);
            }
        }
        return str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f228011h.clone();
    }

    /* synthetic */ c(String str, int i15, a aVar) {
        this(str, i15);
    }
}
