package androidx.compose.ui.platform;

import androidx.compose.ui.node.Owner;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import x4.LocaleList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r\"\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"(\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0012\"&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0012\"\u001f\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0012\"&\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u0010\u0012\u0004\b%\u0010\u0018\u001a\u0004\b$\u0010\u0012\"\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u000e8\u0006¢\u0006\f\n\u0004\b(\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020*0\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010\u0010\u001a\u0004\b,\u0010\u0012\"\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u000e8\u0006¢\u0006\f\n\u0004\b/\u0010\u0010\u001a\u0004\b(\u0010\u0012\"\u001d\u00102\u001a\b\u0012\u0004\u0012\u0002010\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010\u0010\u001a\u0004\b+\u0010\u0012\"&\u00107\u001a\b\u0012\u0004\u0012\u0002030\u000e8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010\u0010\u0012\u0004\b6\u0010\u0018\u001a\u0004\b5\u0010\u0012\"\u001d\u0010:\u001a\b\u0012\u0004\u0012\u0002080\u000e8\u0006¢\u0006\f\n\u0004\b9\u0010\u0010\u001a\u0004\b/\u0010\u0012\"\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020;0\u000e8\u0006¢\u0006\f\n\u0004\b<\u0010\u0010\u001a\u0004\b4\u0010\u0012\"\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020>0\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010\u0010\u001a\u0004\b9\u0010\u0012\"\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020A0\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010\u0010\u001a\u0004\b<\u0010\u0012\"\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020D0\u000e8\u0007¢\u0006\f\n\u0004\bE\u0010\u0010\u001a\u0004\bF\u0010\u0012\"\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020I0H8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\b?\u0010L\"(\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010N0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bO\u0010\u0010\u0012\u0004\bQ\u0010\u0018\u001a\u0004\bP\u0010\u0012\"\u001f\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0\u000e8\u0006¢\u0006\f\n\u0004\bT\u0010\u0010\u001a\u0004\bT\u0010\u0012\"\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020V0\u000e8\u0006¢\u0006\f\n\u0004\bW\u0010\u0010\u001a\u0004\bW\u0010\u0012\"\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\bY\u0010\u0010\u001a\u0004\bY\u0010\u0012\"\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020[0\u000e8\u0006¢\u0006\f\n\u0004\b\\\u0010\u0010\u001a\u0004\b\\\u0010\u0012\"\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020^0\u000e8\u0006¢\u0006\f\n\u0004\b_\u0010\u0010\u001a\u0004\b_\u0010\u0012\"\"\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010a0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\bE\u0010\u0012\" \u0010e\u001a\b\u0012\u0004\u0012\u00020c0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010\u0010\u001a\u0004\bJ\u0010\u0012\"\u001d\u0010g\u001a\b\u0012\u0004\u0012\u00020c0\u000e8\u0006¢\u0006\f\n\u0004\bf\u0010\u0010\u001a\u0004\b#\u0010\u0012\"\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020D0H8F¢\u0006\u0006\u001a\u0004\bB\u0010L\"\u0017\u0010i\u001a\b\u0012\u0004\u0012\u00020c0H8F¢\u0006\u0006\u001a\u0004\bO\u0010L¨\u0006j"}, d2 = {"Landroidx/compose/ui/node/Owner;", "owner", "Landroidx/compose/ui/platform/y2;", "uriHandler", "Lkotlin/Function0;", "Loq/i0;", "content", "a", "(Landroidx/compose/ui/node/Owner;Landroidx/compose/ui/platform/y2;Ler/p;Lm2/r;I)V", "", "name", "", "w", "(Ljava/lang/String;)Ljava/lang/Void;", "Lm2/b4;", "Landroidx/compose/ui/platform/j;", "Lm2/b4;", "c", "()Lm2/b4;", "LocalAccessibilityManager", "Lh3/i;", "b", "getLocalAutofill", "getLocalAutofill$annotations", "()V", "LocalAutofill", "Lh3/p;", "getLocalAutofillTree", "getLocalAutofillTree$annotations", "LocalAutofillTree", "Lh3/n;", "d", "getLocalAutofillManager", "LocalAutofillManager", "Landroidx/compose/ui/platform/c1;", "e", "getLocalClipboardManager", "getLocalClipboardManager$annotations", "LocalClipboardManager", "Landroidx/compose/ui/platform/b1;", "f", "LocalClipboard", "Ln3/x1;", "g", "i", "LocalGraphicsContext", "Lc5/d;", "h", "LocalDensity", "Ll3/o;", "LocalFocusManager", "Lu4/k$b;", "j", "getLocalFontLoader", "getLocalFontLoader$annotations", "LocalFontLoader", "Lu4/l$b;", "k", "LocalFontFamilyResolver", "Lv3/a;", "l", "LocalHapticFeedback", "Lw3/c;", "m", "LocalInputModeManager", "Lc5/t;", "n", "LocalLayoutDirection", "Lx4/d;", "o", "getLocalProvidableLocaleList", "LocalProvidableLocaleList", "Lm2/z;", "Lx4/c;", "p", "Lm2/z;", "()Lm2/z;", "LocalLocale", "Lv4/v0;", "q", "getLocalTextInputService", "getLocalTextInputService$annotations", "LocalTextInputService", "Landroidx/compose/ui/platform/r2;", "r", "LocalSoftwareKeyboardController", "Landroidx/compose/ui/platform/v2;", "s", "LocalTextToolbar", "t", "LocalUriHandler", "Landroidx/compose/ui/platform/f3;", "u", "LocalViewConfiguration", "Landroidx/compose/ui/platform/n3;", "v", "LocalWindowInfo", "La4/y;", "LocalPointerIconService", "", "x", "LocalProvidableScrollCaptureInProgress", "y", "LocalCursorBlinkEnabled", "LocalLocaleList", "LocalScrollCaptureInProgress", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<androidx.compose.ui.platform.j> f10513a = p076m2.d0.j(a.f10538b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b4<h3.i> f10514b = p076m2.d0.j(b.f10539b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b4<h3.p> f10515c = p076m2.d0.j(d.f10541b);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b4<h3.n> f10516d = p076m2.d0.j(c.f10540b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b4<c1> f10517e = p076m2.d0.j(f.f10543b);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b4<b1> f10518f = p076m2.d0.j(e.f10542b);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b4<n3.x1> f10519g = p076m2.d0.j(l.f10549b);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b4<c5.d> f10520h = p076m2.d0.j(h.f10545b);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final b4<l3.o> f10521i = p076m2.d0.j(i.f10546b);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final b4<u4.k.b> f10522j = p076m2.d0.j(k.f10548b);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final b4<u4.l.b> f10523k = p076m2.d0.j(j.f10547b);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final b4<v3.a> f10524l = p076m2.d0.j(m.f10550b);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final b4<w3.c> f10525m = p076m2.d0.j(n.f10551b);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final b4<c5.t> f10526n = p076m2.d0.j(o.f10552b);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final b4<LocaleList> f10527o = p076m2.d0.j(r.f10555b);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final p076m2.z<x4.c> f10528p = p076m2.d0.i(p.f10553b);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final b4<v4.v0> f10529q = p076m2.d0.j(u.f10558b);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final b4<r2> f10530r = p076m2.d0.j(t.f10557b);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final b4<v2> f10531s = p076m2.d0.j(v.f10559b);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final b4<y2> f10532t = p076m2.d0.j(w.f10560b);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final b4<f3> f10533u = p076m2.d0.j(x.f10561b);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final b4<n3> f10534v = p076m2.d0.j(y.f10562b);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final b4<a4.y> f10535w = p076m2.d0.j(q.f10554b);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final b4<Boolean> f10536x = p076m2.d0.h(null, s.f10556b, 1, null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final b4<Boolean> f10537y = p076m2.d0.j(g.f10544b);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/j;", "c", "()Landroidx/compose/ui/platform/j;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.a<androidx.compose.ui.platform.j> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f10538b = new a();

        a() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.j a() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh3/i;", "c", "()Lh3/i;"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.a<h3.i> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f10539b = new b();

        b() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final h3.i a() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh3/n;", "c", "()Lh3/n;"}, k = 3, mv = {2, 1, 0})
    static final class c extends fr.w implements er.a<h3.n> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f10540b = new c();

        c() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final h3.n a() {
            g1.w("LocalAutofillManager");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh3/p;", "c", "()Lh3/p;"}, k = 3, mv = {2, 1, 0})
    static final class d extends fr.w implements er.a<h3.p> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f10541b = new d();

        d() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final h3.p a() {
            g1.w("LocalAutofillTree");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/b1;", "c", "()Landroidx/compose/ui/platform/b1;"}, k = 3, mv = {2, 1, 0})
    static final class e extends fr.w implements er.a<b1> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f10542b = new e();

        e() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final b1 a() {
            g1.w("LocalClipboard");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/c1;", "c", "()Landroidx/compose/ui/platform/c1;"}, k = 3, mv = {2, 1, 0})
    static final class f extends fr.w implements er.a<c1> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f10543b = new f();

        f() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final c1 a() {
            g1.w("LocalClipboardManager");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class g extends fr.w implements er.a<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f10544b = new g();

        g() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc5/d;", "c", "()Lc5/d;"}, k = 3, mv = {2, 1, 0})
    static final class h extends fr.w implements er.a<c5.d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f10545b = new h();

        h() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final c5.d a() {
            g1.w("LocalDensity");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll3/o;", "c", "()Ll3/o;"}, k = 3, mv = {2, 1, 0})
    static final class i extends fr.w implements er.a<l3.o> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f10546b = new i();

        i() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l3.o a() {
            g1.w("LocalFocusManager");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lu4/l$b;", "c", "()Lu4/l$b;"}, k = 3, mv = {2, 1, 0})
    static final class j extends fr.w implements er.a<u4.l.b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f10547b = new j();

        j() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u4.l.b a() {
            g1.w("LocalFontFamilyResolver");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lu4/k$b;", "c", "()Lu4/k$b;"}, k = 3, mv = {2, 1, 0})
    static final class k extends fr.w implements er.a<u4.k.b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f10548b = new k();

        k() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u4.k.b a() {
            g1.w("LocalFontLoader");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln3/x1;", "c", "()Ln3/x1;"}, k = 3, mv = {2, 1, 0})
    static final class l extends fr.w implements er.a<n3.x1> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f10549b = new l();

        l() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final n3.x1 a() {
            g1.w("LocalGraphicsContext");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lv3/a;", "c", "()Lv3/a;"}, k = 3, mv = {2, 1, 0})
    static final class m extends fr.w implements er.a<v3.a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f10550b = new m();

        m() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final v3.a a() {
            g1.w("LocalHapticFeedback");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw3/c;", "c", "()Lw3/c;"}, k = 3, mv = {2, 1, 0})
    static final class n extends fr.w implements er.a<w3.c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n f10551b = new n();

        n() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final w3.c a() {
            g1.w("LocalInputManager");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc5/t;", "c", "()Lc5/t;"}, k = 3, mv = {2, 1, 0})
    static final class o extends fr.w implements er.a<c5.t> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o f10552b = new o();

        o() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final c5.t a() {
            g1.w("LocalLayoutDirection");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm2/a0;", "Lx4/c;", "c", "(Lm2/a0;)Lx4/c;"}, k = 3, mv = {2, 1, 0})
    static final class p extends fr.w implements er.l<p076m2.a0, x4.c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final p f10553b = new p();

        p() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final x4.c b(p076m2.a0 a0Var) {
            return (x4.c) pq.v.k0((Iterable) a0Var.F(g1.n()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"La4/y;", "c", "()La4/y;"}, k = 3, mv = {2, 1, 0})
    static final class q extends fr.w implements er.a<a4.y> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q f10554b = new q();

        q() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final a4.y a() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx4/d;", "c", "()Lx4/d;"}, k = 3, mv = {2, 1, 0})
    static final class r extends fr.w implements er.a<LocaleList> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final r f10555b = new r();

        r() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final LocaleList a() {
            g1.w("LocalProvidableLocaleList");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class s extends fr.w implements er.a<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final s f10556b = new s();

        s() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/r2;", "c", "()Landroidx/compose/ui/platform/r2;"}, k = 3, mv = {2, 1, 0})
    static final class t extends fr.w implements er.a<r2> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final t f10557b = new t();

        t() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final r2 a() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lv4/v0;", "c", "()Lv4/v0;"}, k = 3, mv = {2, 1, 0})
    static final class u extends fr.w implements er.a<v4.v0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final u f10558b = new u();

        u() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final v4.v0 a() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/v2;", "c", "()Landroidx/compose/ui/platform/v2;"}, k = 3, mv = {2, 1, 0})
    static final class v extends fr.w implements er.a<v2> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final v f10559b = new v();

        v() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final v2 a() {
            g1.w("LocalTextToolbar");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/y2;", "c", "()Landroidx/compose/ui/platform/y2;"}, k = 3, mv = {2, 1, 0})
    static final class w extends fr.w implements er.a<y2> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final w f10560b = new w();

        w() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final y2 a() {
            g1.w("LocalUriHandler");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/f3;", "c", "()Landroidx/compose/ui/platform/f3;"}, k = 3, mv = {2, 1, 0})
    static final class x extends fr.w implements er.a<f3> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final x f10561b = new x();

        x() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final f3 a() {
            g1.w("LocalViewConfiguration");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/n3;", "c", "()Landroidx/compose/ui/platform/n3;"}, k = 3, mv = {2, 1, 0})
    static final class y extends fr.w implements er.a<n3> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final y f10562b = new y();

        y() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final n3 a() {
            g1.w("LocalWindowInfo");
            throw new oq.g();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class z extends fr.w implements er.p<p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Owner f10563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y2 f10564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.p<p076m2.r, Integer, oq.i0> f10565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10566e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        z(Owner owner, y2 y2Var, er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, int i15) {
            super(2);
            this.f10563b = owner;
            this.f10564c = y2Var;
            this.f10565d = pVar;
            this.f10566e = i15;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ oq.i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return oq.i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            g1.a(this.f10563b, this.f10564c, this.f10565d, rVar, g4.a(this.f10566e | 1));
        }
    }

    public static final void a(Owner owner, y2 y2Var, er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1925803616);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(owner) : rVarH.G(owner) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(y2Var) : rVarH.G(y2Var) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(pVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1925803616, i16, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:235)");
            }
            p076m2.d0.d(new c4[]{f10513a.d(owner.getAccessibilityManager()), f10514b.d(owner.getAutofill()), f10516d.d(owner.getAutofillManager()), f10515c.d(owner.getAutofillTree()), f10517e.d(owner.getClipboardManager()), f10518f.d(owner.getClipboard()), f10520h.d(owner.getDensity()), f10521i.d(owner.getFocusOwner()), f10522j.e(owner.getFontLoader()), f10523k.e(owner.getFontFamilyResolver()), f10524l.d(owner.getHapticFeedBack()), f10525m.d(owner.getInputModeManager()), f10526n.d(owner.getLayoutDirection()), f10529q.d(owner.getTextInputService()), f10530r.d(owner.getSoftwareKeyboardController()), f10531s.d(owner.getTextToolbar()), f10532t.d(y2Var), f10533u.d(owner.getViewConfiguration()), f10534v.d(owner.getWindowInfo()), f10535w.d(owner.getPointerIconService()), f10519g.d(owner.getGraphicsContext()), z2.c.c().d(owner.getRetainedValuesStore()), f10527o.d(owner.getLocaleList())}, pVar, rVarH, ((i16 >> 3) & 112) | c4.f122821i);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new z(owner, y2Var, pVar, i15));
        }
    }

    public static final b4<androidx.compose.ui.platform.j> c() {
        return f10513a;
    }

    public static final b4<b1> d() {
        return f10518f;
    }

    public static final b4<Boolean> e() {
        return f10537y;
    }

    public static final b4<c5.d> f() {
        return f10520h;
    }

    public static final b4<l3.o> g() {
        return f10521i;
    }

    public static final b4<u4.l.b> h() {
        return f10523k;
    }

    public static final b4<n3.x1> i() {
        return f10519g;
    }

    public static final b4<v3.a> j() {
        return f10524l;
    }

    public static final b4<w3.c> k() {
        return f10525m;
    }

    public static final b4<c5.t> l() {
        return f10526n;
    }

    public static final p076m2.z<x4.c> m() {
        return f10528p;
    }

    public static final p076m2.z<LocaleList> n() {
        return f10527o;
    }

    public static final b4<a4.y> o() {
        return f10535w;
    }

    public static final b4<Boolean> p() {
        return f10536x;
    }

    public static final p076m2.z<Boolean> q() {
        return f10536x;
    }

    public static final b4<r2> r() {
        return f10530r;
    }

    public static final b4<v2> s() {
        return f10531s;
    }

    public static final b4<y2> t() {
        return f10532t;
    }

    public static final b4<f3> u() {
        return f10533u;
    }

    public static final b4<n3> v() {
        return f10534v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void w(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
