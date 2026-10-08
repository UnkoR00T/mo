package p018ar1;

import p071kotlin.Metadata;
import p076m2.a3;
import v50.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u001b\u0010\u000bR*\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0007\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u001f\u0010\u000bR*\u0010%\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0007\u001a\u0004\b#\u0010\t\"\u0004\b$\u0010\u000bR*\u0010)\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0007\u001a\u0004\b\u001a\u0010\t\"\u0004\b(\u0010\u000bR*\u0010+\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0007\u001a\u0004\b\"\u0010\t\"\u0004\b*\u0010\u000bR*\u0010-\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u001e\u0010\t\"\u0004\b,\u0010\u000bR*\u00100\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0015\u0010\t\"\u0004\b/\u0010\u000bR*\u00103\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b'\u0010\t\"\u0004\b2\u0010\u000bR*\u00105\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u0006\u0010\t\"\u0004\b4\u0010\u000b¨\u00066"}, d2 = {"Lar1/u;", "", "<init>", "()V", "Lm2/a3;", "Lv50/c$g;", "a", "Lm2/a3;", "j", "()Lm2/a3;", "w", "(Lm2/a3;)V", "textInputText", "b", "m", "z", "textInputTextWithOptionals", "c", "l", "y", "textInputTextError", "d", "k", "x", "textInputTextDisabled", "Lv50/c$b;", "e", "o", "textInputNumber", "Lv50/c$c;", "f", "p", "textInputPassword", "Lv50/c$f;", "g", "i", "v", "textInputSearch", "Lv50/c$e;", "h", "r", "textInputPin", "t", "textInputPinError", "s", "textInputPinDisabled", "Lv50/c$d;", "q", "textInputPhoneNumber", "Lv50/c$a;", "u", "textInputPostalCode", "n", "textInputBlikCode", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private a3<c.Text> textInputText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a3<c.Text> textInputTextWithOptionals;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private a3<c.Text> textInputTextError;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private a3<c.Text> textInputTextDisabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private a3<c.Number> textInputNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private a3<c.Password> textInputPassword;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private a3<c.Search> textInputSearch;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private a3<c.Pin> textInputPin;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private a3<c.Pin> textInputPinError;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private a3<c.Pin> textInputPinDisabled;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private a3<c.PhoneNumber> textInputPhoneNumber;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private a3<c.Masked> textInputPostalCode;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private a3<c.Masked> textInputBlikCode;

    public final a3<c.Masked> a() {
        return this.textInputBlikCode;
    }

    public final a3<c.Number> b() {
        return this.textInputNumber;
    }

    public final a3<c.Password> c() {
        return this.textInputPassword;
    }

    public final a3<c.PhoneNumber> d() {
        return this.textInputPhoneNumber;
    }

    public final a3<c.Pin> e() {
        return this.textInputPin;
    }

    public final a3<c.Pin> f() {
        return this.textInputPinDisabled;
    }

    public final a3<c.Pin> g() {
        return this.textInputPinError;
    }

    public final a3<c.Masked> h() {
        return this.textInputPostalCode;
    }

    public final a3<c.Search> i() {
        return this.textInputSearch;
    }

    public final a3<c.Text> j() {
        return this.textInputText;
    }

    public final a3<c.Text> k() {
        return this.textInputTextDisabled;
    }

    public final a3<c.Text> l() {
        return this.textInputTextError;
    }

    public final a3<c.Text> m() {
        return this.textInputTextWithOptionals;
    }

    public final void n(a3<c.Masked> a3Var) {
        this.textInputBlikCode = a3Var;
    }

    public final void o(a3<c.Number> a3Var) {
        this.textInputNumber = a3Var;
    }

    public final void p(a3<c.Password> a3Var) {
        this.textInputPassword = a3Var;
    }

    public final void q(a3<c.PhoneNumber> a3Var) {
        this.textInputPhoneNumber = a3Var;
    }

    public final void r(a3<c.Pin> a3Var) {
        this.textInputPin = a3Var;
    }

    public final void s(a3<c.Pin> a3Var) {
        this.textInputPinDisabled = a3Var;
    }

    public final void t(a3<c.Pin> a3Var) {
        this.textInputPinError = a3Var;
    }

    public final void u(a3<c.Masked> a3Var) {
        this.textInputPostalCode = a3Var;
    }

    public final void v(a3<c.Search> a3Var) {
        this.textInputSearch = a3Var;
    }

    public final void w(a3<c.Text> a3Var) {
        this.textInputText = a3Var;
    }

    public final void x(a3<c.Text> a3Var) {
        this.textInputTextDisabled = a3Var;
    }

    public final void y(a3<c.Text> a3Var) {
        this.textInputTextError = a3Var;
    }

    public final void z(a3<c.Text> a3Var) {
        this.textInputTextWithOptionals = a3Var;
    }
}
