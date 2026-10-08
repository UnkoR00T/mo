package mb;

import fu.r;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lmb/l;", "", "", "major", "minor", "patch", "", "description", "<init>", "(IIILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "other", "j", "(Lmb/l;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "getMajor", "b", "getMinor", "c", "getPatch", "d", "Ljava/lang/String;", "getDescription", "Ljava/math/BigInteger;", "e", "Loq/k;", "k", "()Ljava/math/BigInteger;", "bigInteger", "f", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l implements Comparable<l> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final l f125223g = new l(0, 0, 0, "");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final l f125224h = new l(0, 1, 0, "");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final l f125225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final l f125226k;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int major;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int minor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int patch;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k bigInteger;

    /* JADX INFO: renamed from: mb.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmb/l$a;", "", "<init>", "()V", "", "versionString", "Lmb/l;", "b", "(Ljava/lang/String;)Lmb/l;", "VERSION_0_1", "Lmb/l;", "a", "()Lmb/l;", "VERSION_PATTERN_STRING", "Ljava/lang/String;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final l a() {
            return l.f125224h;
        }

        public final l b(String versionString) {
            String strGroup;
            if (versionString != null && !r.t0(versionString)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(versionString);
                if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
                    int i15 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    if (strGroup2 != null) {
                        int i16 = Integer.parseInt(strGroup2);
                        String strGroup3 = matcher.group(3);
                        if (strGroup3 != null) {
                            return new l(i15, i16, Integer.parseInt(strGroup3), matcher.group(4) != null ? matcher.group(4) : "", null);
                        }
                    }
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    static {
        l lVar = new l(1, 0, 0, "");
        f125225j = lVar;
        f125226k = lVar;
    }

    public /* synthetic */ l(int i15, int i16, int i17, String str, fr.k kVar) {
        this(i15, i16, i17, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigInteger g(l lVar) {
        return BigInteger.valueOf(lVar.major).shiftLeft(32).or(BigInteger.valueOf(lVar.minor)).shiftLeft(32).or(BigInteger.valueOf(lVar.patch));
    }

    private final BigInteger k() {
        return (BigInteger) this.bigInteger.getValue();
    }

    public boolean equals(Object other) {
        if (!(other instanceof l)) {
            return false;
        }
        l lVar = (l) other;
        return this.major == lVar.major && this.minor == lVar.minor && this.patch == lVar.patch;
    }

    public int hashCode() {
        return ((((527 + this.major) * 31) + this.minor) * 31) + this.patch;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(l other) {
        return k().compareTo(other.k());
    }

    public String toString() {
        String str;
        if (r.t0(this.description)) {
            str = "";
        } else {
            str = '-' + this.description;
        }
        return this.major + '.' + this.minor + '.' + this.patch + str;
    }

    private l(int i15, int i16, int i17, String str) {
        this.major = i15;
        this.minor = i16;
        this.patch = i17;
        this.description = str;
        this.bigInteger = oq.l.a(new er.a() { // from class: mb.k
            @Override // er.a
            public final Object a() {
                return l.g(this.f125221a);
            }
        });
    }
}
