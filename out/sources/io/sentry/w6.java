package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f95926a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f95927b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f95928c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f95929d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f95930e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f95931f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f95932g = "Report a Bug";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CharSequence f95933h = "Send Bug Report";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f95934i = "Cancel";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f95935j = "Name";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f95936k = "Your Name";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CharSequence f95937l = "Email";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CharSequence f95938m = "your.email@example.org";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f95939n = " (Required)";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f95940o = "Description";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f95941p = "What's the bug? What did you expect?";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f95942q = "Thank you for your report!";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f95943r;

    public interface a {
    }

    public interface b {
    }

    public w6(a aVar) {
        this.f95943r = aVar;
    }

    public boolean a() {
        return this.f95928c;
    }

    public boolean b() {
        return this.f95926a;
    }

    public boolean c() {
        return this.f95931f;
    }

    public boolean d() {
        return this.f95929d;
    }

    public boolean e() {
        return this.f95927b;
    }

    public boolean f() {
        return this.f95930e;
    }

    public void g(a aVar) {
        this.f95943r = aVar;
    }

    public void h(boolean z15) {
        this.f95928c = z15;
    }

    public void i(boolean z15) {
        this.f95926a = z15;
    }

    public void j(boolean z15) {
        this.f95931f = z15;
    }

    public void k(boolean z15) {
        this.f95929d = z15;
    }

    public void l(boolean z15) {
        this.f95927b = z15;
    }

    public void m(boolean z15) {
        this.f95930e = z15;
    }

    public String toString() {
        return "SentryFeedbackOptions{isNameRequired=" + this.f95926a + ", showName=" + this.f95927b + ", isEmailRequired=" + this.f95928c + ", showEmail=" + this.f95929d + ", useSentryUser=" + this.f95930e + ", showBranding=" + this.f95931f + ", formTitle='" + ((Object) this.f95932g) + "', submitButtonLabel='" + ((Object) this.f95933h) + "', cancelButtonLabel='" + ((Object) this.f95934i) + "', nameLabel='" + ((Object) this.f95935j) + "', namePlaceholder='" + ((Object) this.f95936k) + "', emailLabel='" + ((Object) this.f95937l) + "', emailPlaceholder='" + ((Object) this.f95938m) + "', isRequiredLabel='" + ((Object) this.f95939n) + "', messageLabel='" + ((Object) this.f95940o) + "', messagePlaceholder='" + ((Object) this.f95941p) + "'}";
    }
}
