package cn;

/* JADX INFO: loaded from: classes4.dex */
final class d extends a.AbstractC0728a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte f28310e;

    d() {
    }

    @Override // cn.a.AbstractC0728a
    public final a a() {
        String str;
        String str2;
        String str3;
        if (this.f28310e == 1 && (str = this.f28306a) != null && (str2 = this.f28307b) != null && (str3 = this.f28308c) != null) {
            return new f(str, str2, str3, this.f28309d, null);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f28306a == null) {
            sb5.append(" configLabel");
        }
        if (this.f28307b == null) {
            sb5.append(" modelDir");
        }
        if (this.f28308c == null) {
            sb5.append(" languageHint");
        }
        if (this.f28310e == 0) {
            sb5.append(" enableLowLatencyInBackground");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    @Override // cn.a.AbstractC0728a
    public final a.AbstractC0728a b(boolean z15) {
        this.f28309d = z15;
        this.f28310e = (byte) 1;
        return this;
    }

    @Override // cn.a.AbstractC0728a
    public final a.AbstractC0728a c(String str) {
        if (str == null) {
            throw new NullPointerException("Null languageHint");
        }
        this.f28308c = str;
        return this;
    }

    @Override // cn.a.AbstractC0728a
    public final a.AbstractC0728a d(String str) {
        if (str == null) {
            throw new NullPointerException("Null modelDir");
        }
        this.f28307b = str;
        return this;
    }

    final a.AbstractC0728a e(String str) {
        if (str == null) {
            throw new NullPointerException("Null configLabel");
        }
        this.f28306a = str;
        return this;
    }
}
