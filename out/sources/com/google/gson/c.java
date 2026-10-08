package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements com.google.gson.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f36635a = new a("IDENTITY", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f36636b = new c("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.c.b
        {
            a aVar = null;
        }

        @Override // com.google.gson.d
        public String b(Field field) {
            return c.k(field.getName());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f36637c = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.c.c
        {
            a aVar = null;
        }

        @Override // com.google.gson.d
        public String b(Field field) {
            return c.k(c.j(field.getName(), ' '));
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f36638d = new c("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.c.d
        {
            a aVar = null;
        }

        @Override // com.google.gson.d
        public String b(Field field) {
            return c.j(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f36639e = new c("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.google.gson.c.e
        {
            a aVar = null;
        }

        @Override // com.google.gson.d
        public String b(Field field) {
            return c.j(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f36640f = new c("LOWER_CASE_WITH_DASHES", 5) { // from class: com.google.gson.c.f
        {
            a aVar = null;
        }

        @Override // com.google.gson.d
        public String b(Field field) {
            return c.j(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f36641g = new c("LOWER_CASE_WITH_DOTS", 6) { // from class: com.google.gson.c.g
        {
            a aVar = null;
        }

        @Override // com.google.gson.d
        public String b(Field field) {
            return c.j(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ c[] f36642h = g();

    final enum a extends c {
        a(String str, int i15) {
            super(str, i15, null);
        }

        @Override // com.google.gson.d
        public String b(Field field) {
            return field.getName();
        }
    }

    private c(String str, int i15) {
        super(str, i15);
    }

    private static /* synthetic */ c[] g() {
        return new c[]{f36635a, f36636b, f36637c, f36638d, f36639e, f36640f, f36641g};
    }

    static String j(String str, char c15) {
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

    static String k(String str) {
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
        return (c[]) f36642h.clone();
    }

    /* synthetic */ c(String str, int i15, a aVar) {
        this(str, i15);
    }
}
