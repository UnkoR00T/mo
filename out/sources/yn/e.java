package yn;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f228012d = new e("", "", false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f228013e = new e("\n", "  ", true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f228014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f228015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f228016c;

    private e(String str, String str2, boolean z15) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f228014a = str;
        this.f228015b = str2;
        this.f228016c = z15;
    }

    public String a() {
        return this.f228015b;
    }

    public String b() {
        return this.f228014a;
    }

    public boolean c() {
        return this.f228016c;
    }
}
