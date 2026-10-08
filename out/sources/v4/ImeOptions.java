package v4;

import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;
import x4.LocaleList;

/* JADX INFO: renamed from: v4.u, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001\u001aBO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b!\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lv4/u;", "", "", "singleLine", "Lv4/z;", "capitalization", "autoCorrect", "Lv4/a0;", "keyboardType", "Lv4/t;", "imeAction", "Lv4/l0;", "platformImeOptions", "Lx4/d;", "hintLocales", "<init>", "(ZIZIILv4/l0;Lx4/d;Lfr/k;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Z", "h", "()Z", "b", "I", "c", "d", "f", "e", "Lx4/d;", "()Lx4/d;", "Lv4/l0;", "g", "()Lv4/l0;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImeOptions {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ImeOptions f203718h = new ImeOptions(false, 0, false, 0, 0, null, null, CertificateBody.profileType, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean singleLine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int capitalization;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean autoCorrect;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int keyboardType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int imeAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocaleList hintLocales;

    /* JADX INFO: renamed from: v4.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv4/u$a;", "", "<init>", "()V", "Lv4/u;", "Default", "Lv4/u;", "a", "()Lv4/u;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final ImeOptions a() {
            return ImeOptions.f203718h;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImeOptions(boolean z15, int i15, boolean z16, int i16, int i17, l0 l0Var, LocaleList localeList, fr.k kVar) {
        this(z15, i15, z16, i16, i17, l0Var, localeList);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCapitalization() {
        return this.capitalization;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getImeAction() {
        return this.imeAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) other;
        return this.singleLine == imeOptions.singleLine && z.i(this.capitalization, imeOptions.capitalization) && this.autoCorrect == imeOptions.autoCorrect && a0.n(this.keyboardType, imeOptions.keyboardType) && t.m(this.imeAction, imeOptions.imeAction) && fr.t.c(null, null) && fr.t.c(this.hintLocales, imeOptions.hintLocales);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getKeyboardType() {
        return this.keyboardType;
    }

    public final l0 g() {
        return null;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.singleLine) * 31) + z.j(this.capitalization)) * 31) + Boolean.hashCode(this.autoCorrect)) * 31) + a0.o(this.keyboardType)) * 31) + t.n(this.imeAction)) * 961) + this.hintLocales.hashCode();
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + ((Object) z.k(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) a0.p(this.keyboardType)) + ", imeAction=" + ((Object) t.o(this.imeAction)) + ", platformImeOptions=" + ((Object) null) + ", hintLocales=" + this.hintLocales + ')';
    }

    private ImeOptions(boolean z15, int i15, boolean z16, int i16, int i17, l0 l0Var, LocaleList localeList) {
        this.singleLine = z15;
        this.capitalization = i15;
        this.autoCorrect = z16;
        this.keyboardType = i16;
        this.imeAction = i17;
        this.hintLocales = localeList;
    }

    public /* synthetic */ ImeOptions(boolean z15, int i15, boolean z16, int i16, int i17, l0 l0Var, LocaleList localeList, int i18, fr.k kVar) {
        this((i18 & 1) != 0 ? false : z15, (i18 & 2) != 0 ? z.INSTANCE.b() : i15, (i18 & 4) != 0 ? true : z16, (i18 & 8) != 0 ? a0.INSTANCE.h() : i16, (i18 & 16) != 0 ? t.INSTANCE.a() : i17, (i18 & 32) != 0 ? null : l0Var, (i18 & 64) != 0 ? LocaleList.INSTANCE.b() : localeList, null);
    }
}
