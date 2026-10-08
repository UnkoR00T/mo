package qn;

import org.bouncycastle.asn1.x509.DisplayText;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private pn.b f167455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private pn.a f167456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private pn.c f167457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f167458d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f167459e;

    public static boolean b(int i15) {
        return i15 >= 0 && i15 < 8;
    }

    public b a() {
        return this.f167459e;
    }

    public void c(pn.a aVar) {
        this.f167456b = aVar;
    }

    public void d(int i15) {
        this.f167458d = i15;
    }

    public void e(b bVar) {
        this.f167459e = bVar;
    }

    public void f(pn.b bVar) {
        this.f167455a = bVar;
    }

    public void g(pn.c cVar) {
        this.f167457c = cVar;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
        sb5.append("<<\n");
        sb5.append(" mode: ");
        sb5.append(this.f167455a);
        sb5.append("\n ecLevel: ");
        sb5.append(this.f167456b);
        sb5.append("\n version: ");
        sb5.append(this.f167457c);
        sb5.append("\n maskPattern: ");
        sb5.append(this.f167458d);
        if (this.f167459e == null) {
            sb5.append("\n matrix: null\n");
        } else {
            sb5.append("\n matrix:\n");
            sb5.append(this.f167459e);
        }
        sb5.append(">>\n");
        return sb5.toString();
    }
}
