package kn;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f111464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f111465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private en.b f111466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private en.b f111467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final StringBuilder f111468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f111469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f111470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f111471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f111472i;

    h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb5 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i15 = 0; i15 < length; i15++) {
            char c15 = (char) (bytes[i15] & 255);
            if (c15 == '?' && str.charAt(i15) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb5.append(c15);
        }
        this.f111464a = sb5.toString();
        this.f111465b = m.FORCE_NONE;
        this.f111468e = new StringBuilder(str.length());
        this.f111470g = -1;
    }

    private int h() {
        return this.f111464a.length() - this.f111472i;
    }

    public int a() {
        return this.f111468e.length();
    }

    public StringBuilder b() {
        return this.f111468e;
    }

    public char c() {
        return this.f111464a.charAt(this.f111469f);
    }

    public String d() {
        return this.f111464a;
    }

    public int e() {
        return this.f111470g;
    }

    public int f() {
        return h() - this.f111469f;
    }

    public l g() {
        return this.f111471h;
    }

    public boolean i() {
        return this.f111469f < h();
    }

    public void j() {
        this.f111470g = -1;
    }

    public void k() {
        this.f111471h = null;
    }

    public void l(en.b bVar, en.b bVar2) {
        this.f111466c = bVar;
        this.f111467d = bVar2;
    }

    public void m(int i15) {
        this.f111472i = i15;
    }

    public void n(m mVar) {
        this.f111465b = mVar;
    }

    public void o(int i15) {
        this.f111470g = i15;
    }

    public void p() {
        q(a());
    }

    public void q(int i15) {
        l lVar = this.f111471h;
        if (lVar == null || i15 > lVar.a()) {
            this.f111471h = l.l(i15, this.f111465b, this.f111466c, this.f111467d, true);
        }
    }

    public void r(char c15) {
        this.f111468e.append(c15);
    }

    public void s(String str) {
        this.f111468e.append(str);
    }
}
