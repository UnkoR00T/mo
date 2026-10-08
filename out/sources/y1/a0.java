package y1;

import android.os.Trace;
import androidx.compose.ui.graphics.Color;
import g4.i1;
import g4.j1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n3.Shadow;
import n3.h1;
import n3.p1;
import n4.f0;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import q4.TextLayoutResult;
import q4.TextStyle;
import w0.g0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001oBS\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010%J\u001f\u0010(\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b*\u0010\"J=\u0010+\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b+\u0010,J%\u00100\u001a\u00020#2\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r¢\u0006\u0004\b0\u00101J\u0013\u00103\u001a\u00020#*\u000202H\u0016¢\u0006\u0004\b3\u00104J#\u0010;\u001a\u00020:*\u0002052\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b;\u0010<J#\u0010?\u001a\u00020\u000f*\u00020\u00162\u0006\u00107\u001a\u00020=2\u0006\u0010>\u001a\u00020\u000fH\u0016¢\u0006\u0004\b?\u0010@J#\u0010B\u001a\u00020\u000f*\u00020\u00162\u0006\u00107\u001a\u00020=2\u0006\u0010A\u001a\u00020\u000fH\u0016¢\u0006\u0004\bB\u0010@J#\u0010C\u001a\u00020\u000f*\u00020\u00162\u0006\u00107\u001a\u00020=2\u0006\u0010>\u001a\u00020\u000fH\u0016¢\u0006\u0004\bC\u0010@J#\u0010D\u001a\u00020\u000f*\u00020\u00162\u0006\u00107\u001a\u00020=2\u0006\u0010A\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u0010@J\u0013\u0010F\u001a\u00020#*\u00020EH\u0016¢\u0006\u0004\bF\u0010GR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010OR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010OR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR*\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\u000f\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bW\u0010X\u0012\u0004\bY\u0010%R\u0018\u0010]\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010KR*\u0010e\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020b0a\u0012\u0004\u0012\u00020\r\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010i\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010k\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010\u001fR\u0014\u0010n\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006p"}, d2 = {"Ly1/a0;", "Lf3/m$c;", "Lg4/z;", "Lg4/q;", "Lg4/i1;", "", "text", "Lq4/b4;", "style", "Lu4/l$b;", "fontFamilyResolver", "Lb5/v;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Ln3/p1;", "overrideColor", "<init>", "(Ljava/lang/String;Lq4/b4;Lu4/l$b;IZIILn3/p1;Lfr/k;)V", "Le4/w;", "Ly1/g;", "z3", "(Le4/w;)Ly1/g;", "Ly1/o;", "phase", "D3", "(I)Z", "A3", "()Ly1/g;", "updatedText", "E3", "(Ljava/lang/String;)Z", "Loq/i0;", "w3", "()V", "B3", "color", "F3", "(Ln3/p1;Lq4/b4;)Z", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37090q, "G3", "(Lq4/b4;IIZLu4/l$b;I)Z", "drawChanged", "textChanged", "layoutChanged", "x3", "(ZZZ)V", "Ln4/i0;", "E2", "(Ln4/i0;)V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "Le4/v;", "height", "K", "(Le4/w;Le4/v;I)I", "width", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "k", "O", "Lp3/c;", "y", "(Lp3/c;)V", "r", "Ljava/lang/String;", "s", "Lq4/b4;", "t", "Lu4/l$b;", "v", "I", "w", "Z", "x", "z", "Ln3/p1;", "", "Le4/a;", "A", "Ljava/util/Map;", "getBaselineCache$annotations", "baselineCache", "B", "Ly1/g;", "_layoutCache", "C", "resolvedInheritedStyle", "Lkotlin/Function1;", "", "Lq4/t3;", ip.a.f96138c, "Ler/l;", "semanticsTextLayoutResult", "Ly1/a0$a;", "E", "Ly1/a0$a;", "textSubstitution", "y3", "layoutCache", "R2", "()Z", "shouldAutoInvalidate", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 extends f3.m.c implements g4.z, g4.q, i1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private Map<p036e4.a, Integer> baselineCache;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private g _layoutCache;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private TextStyle resolvedInheritedStyle;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private er.l<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private TextSubstitution textSubstitution;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private String text;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private TextStyle style;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private u4.l.b fontFamilyResolver;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean softWrap;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private int minLines;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private p1 overrideColor;

    public /* synthetic */ a0(String str, TextStyle textStyle, u4.l.b bVar, int i15, boolean z15, int i16, int i17, p1 p1Var, fr.k kVar) {
        this(str, textStyle, bVar, i15, z15, i16, i17, p1Var);
    }

    private final g A3() {
        g layoutCache;
        TextSubstitution textSubstitution = this.textSubstitution;
        if (textSubstitution != null) {
            if (!textSubstitution.getIsShowingSubstitution()) {
                textSubstitution = null;
            }
            if (textSubstitution != null && (layoutCache = textSubstitution.getLayoutCache()) != null) {
                return layoutCache;
            }
        }
        return y3();
    }

    private final void B3() {
        j1.d(this);
        g4.b0.b(this);
        g4.r.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C3(a2 a2Var, a2.a aVar) {
        a2.a.E(aVar, a2Var, 0, 0, 0.0f, 4, null);
        return i0.f148189a;
    }

    private final boolean D3(int phase) {
        TextStyle textStyle = this.resolvedInheritedStyle;
        TextStyle textStyleB = c0.b(this, phase, this.style);
        this.resolvedInheritedStyle = textStyleB;
        if (textStyle == null) {
            return false;
        }
        return !fr.t.c(textStyle, textStyleB);
    }

    private final boolean E3(String updatedText) {
        TextSubstitution textSubstitution = this.textSubstitution;
        if (textSubstitution != null) {
            if (fr.t.c(updatedText, textSubstitution.getSubstitution())) {
                return false;
            }
            textSubstitution.f(updatedText);
            g layoutCache = textSubstitution.getLayoutCache();
            if (layoutCache == null) {
                return false;
            }
            layoutCache.q(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
            return true;
        }
        TextSubstitution textSubstitution2 = new TextSubstitution(this.text, updatedText, false, null, 12, null);
        g gVar = new g(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        gVar.n(y3().getDensity());
        textSubstitution2.d(gVar);
        this.textSubstitution = textSubstitution2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s3(a0 a0Var, List list) {
        g gVarY3 = a0Var.y3();
        TextStyle textStyle = a0Var.style;
        p1 p1Var = a0Var.overrideColor;
        TextLayoutResult textLayoutResultP = gVarY3.p(textStyle.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : p1Var != null ? p1Var.a() : Color.INSTANCE.h(), (16777214 & 2) != 0 ? c5.v.INSTANCE.a() : 0L, (16777214 & 4) != 0 ? null : null, (16777214 & 8) != 0 ? null : null, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : null, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? c5.v.INSTANCE.a() : 0L, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : null, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? b5.j.INSTANCE.g() : 0, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? c5.v.INSTANCE.a() : 0L, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? b5.f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? b5.e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null));
        if (textLayoutResultP != null) {
            list.add(textLayoutResultP);
        } else {
            textLayoutResultP = null;
        }
        return textLayoutResultP != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t3(a0 a0Var, q4.e eVar) {
        a0Var.E3(eVar.getText());
        a0Var.B3();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u3(a0 a0Var, boolean z15) {
        TextSubstitution textSubstitution = a0Var.textSubstitution;
        if (textSubstitution == null) {
            return false;
        }
        if (textSubstitution != null) {
            textSubstitution.e(z15);
        }
        a0Var.B3();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v3(a0 a0Var) {
        a0Var.w3();
        a0Var.B3();
        return true;
    }

    private final void w3() {
        this.textSubstitution = null;
    }

    private final g y3() {
        TextStyle textStyle;
        if (!g0.isInheritedTextStyleEnabled || (textStyle = this.resolvedInheritedStyle) == null) {
            textStyle = this.style;
        }
        TextStyle textStyle2 = textStyle;
        if (this._layoutCache == null) {
            this._layoutCache = new g(this.text, textStyle2, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        }
        return this._layoutCache;
    }

    private final g z3(p036e4.w wVar) {
        if (g0.isInheritedTextStyleEnabled && D3(o.INSTANCE.b())) {
            TextStyle textStyle = this.resolvedInheritedStyle;
            if (textStyle == null) {
                textStyle = this.style;
            }
            y3().q(this.text, textStyle, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
        }
        g gVarA3 = A3();
        gVarA3.n(wVar);
        return gVarA3;
    }

    @Override // g4.i1
    public void E2(n4.i0 i0Var) {
        er.l<? super List<TextLayoutResult>, Boolean> lVar = this.semanticsTextLayoutResult;
        if (lVar == null) {
            lVar = new er.l() { // from class: y1.v
                @Override // er.l
                public final Object b(Object obj) {
                    return Boolean.valueOf(a0.s3(this.f223136a, (List) obj));
                }
            };
            this.semanticsTextLayoutResult = lVar;
        }
        f0.A0(i0Var, new q4.e(this.text, null, 2, null));
        TextSubstitution textSubstitution = this.textSubstitution;
        if (textSubstitution != null) {
            f0.w0(i0Var, textSubstitution.getIsShowingSubstitution());
            f0.E0(i0Var, new q4.e(textSubstitution.getSubstitution(), null, 2, null));
        }
        f0.F0(i0Var, null, new er.l() { // from class: y1.w
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(a0.t3(this.f223137a, (q4.e) obj));
            }
        }, 1, null);
        f0.L0(i0Var, null, new er.l() { // from class: y1.x
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(a0.u3(this.f223138a, ((Boolean) obj).booleanValue()));
            }
        }, 1, null);
        f0.b(i0Var, null, new er.a() { // from class: y1.y
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(a0.v3(this.f223139a));
            }
        }, 1, null);
        f0.s(i0Var, null, lVar, 1, null);
    }

    public final boolean F3(p1 color, TextStyle style) {
        boolean zC = fr.t.c(color, this.overrideColor);
        this.overrideColor = color;
        return (zC && style.H(this.style)) ? false : true;
    }

    public final boolean G3(TextStyle style, int minLines, int maxLines, boolean softWrap, u4.l.b fontFamilyResolver, int overflow) {
        boolean z15 = !this.style.I(style);
        this.style = style;
        if (this.minLines != minLines) {
            this.minLines = minLines;
            z15 = true;
        }
        if (this.maxLines != maxLines) {
            this.maxLines = maxLines;
            z15 = true;
        }
        if (this.softWrap != softWrap) {
            this.softWrap = softWrap;
            z15 = true;
        }
        if (!fr.t.c(this.fontFamilyResolver, fontFamilyResolver)) {
            this.fontFamilyResolver = fontFamilyResolver;
            z15 = true;
        }
        if (b5.v.g(this.overflow, overflow)) {
            return z15;
        }
        this.overflow = overflow;
        return true;
    }

    @Override // g4.z
    public int H(p036e4.w wVar, p036e4.v vVar, int i15) {
        return z3(wVar).f(i15, wVar.getLayoutDirection());
    }

    public final boolean H3(String text) {
        if (fr.t.c(this.text, text)) {
            return false;
        }
        this.text = text;
        w3();
        return true;
    }

    @Override // g4.z
    public int K(p036e4.w wVar, p036e4.v vVar, int i15) {
        return z3(wVar).k(wVar.getLayoutDirection());
    }

    @Override // g4.z
    public int O(p036e4.w wVar, p036e4.v vVar, int i15) {
        return z3(wVar).f(i15, wVar.getLayoutDirection());
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            g gVarZ3 = z3(y0Var);
            boolean zH = gVarZ3.h(j15, y0Var.getLayoutDirection());
            gVarZ3.d();
            q4.y paragraph = gVarZ3.getParagraph();
            long layoutSize = gVarZ3.getLayoutSize();
            if (zH) {
                g4.b0.a(this);
                Map map = this.baselineCache;
                if (map == null) {
                    map = new HashMap(2);
                    this.baselineCache = map;
                }
                map.put(p036e4.b.a(), Integer.valueOf(Math.round(paragraph.j())));
                map.put(p036e4.b.b(), Integer.valueOf(Math.round(paragraph.y())));
            }
            c5.b.Companion companion = c5.b.INSTANCE;
            int i15 = (int) (layoutSize >> 32);
            int i16 = (int) (layoutSize & BodyPartID.bodyIdMax);
            final a2 a2VarO0 = v0Var.o0(companion.b(i15, i15, i16, i16));
            return y0Var.x1(i15, i16, this.baselineCache, new er.l() { // from class: y1.z
                @Override // er.l
                public final Object b(Object obj) {
                    return a0.C3(a2VarO0, (a2.a) obj);
                }
            });
        } finally {
            Trace.endSection();
        }
    }

    @Override // g4.z
    public int k(p036e4.w wVar, p036e4.v vVar, int i15) {
        return z3(wVar).j(wVar.getLayoutDirection());
    }

    public final void x3(boolean drawChanged, boolean textChanged, boolean layoutChanged) {
        if (drawChanged || textChanged || layoutChanged) {
            this.resolvedInheritedStyle = null;
        }
        if (textChanged || layoutChanged) {
            y3().q(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
        }
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.semanticsTextLayoutResult != null)) {
                j1.d(this);
            }
            if (textChanged || layoutChanged) {
                g4.b0.b(this);
                g4.r.a(this);
            }
            if (drawChanged) {
                g4.r.a(this);
            }
        }
    }

    @Override // g4.q
    public void y(p3.c cVar) {
        TextStyle textStyle;
        if (getIsAttached()) {
            g gVarA3 = A3();
            q4.y paragraph = gVarA3.getParagraph();
            if (paragraph == null) {
                c1.e.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this._layoutCache + ", textSubstitution=" + this.textSubstitution + ')');
                throw new oq.g();
            }
            h1 h1VarF = cVar.getDrawContext().f();
            boolean didOverflow = gVarA3.getDidOverflow();
            if (didOverflow) {
                float layoutSize = (int) (gVarA3.getLayoutSize() >> 32);
                float layoutSize2 = (int) (gVarA3.getLayoutSize() & BodyPartID.bodyIdMax);
                h1VarF.q();
                h1.p(h1VarF, 0.0f, 0.0f, layoutSize, layoutSize2, 0, 16, null);
            }
            try {
                if (g0.isInheritedTextStyleEnabled) {
                    D3(o.INSTANCE.a());
                    textStyle = this.resolvedInheritedStyle;
                    if (textStyle == null) {
                        textStyle = this.style;
                    }
                } else {
                    textStyle = this.style;
                }
                b5.k kVarC = textStyle.C();
                if (kVarC == null) {
                    kVarC = b5.k.INSTANCE.c();
                }
                b5.k kVar = kVarC;
                Shadow shadowZ = textStyle.z();
                if (shadowZ == null) {
                    shadowZ = Shadow.INSTANCE.a();
                }
                Shadow shadow = shadowZ;
                p3.g gVarK = textStyle.k();
                if (gVarK == null) {
                    gVarK = p3.j.f152592b;
                }
                p3.g gVar = gVarK;
                androidx.compose.ui.graphics.c cVarI = textStyle.i();
                if (cVarI != null) {
                    q4.y.E(paragraph, h1VarF, cVarI, textStyle.f(), shadow, kVar, gVar, 0, 64, null);
                } else {
                    p1 p1Var = this.overrideColor;
                    long jA = p1Var != null ? p1Var.a() : Color.INSTANCE.h();
                    if (jA == 16) {
                        jA = textStyle.j() != 16 ? textStyle.j() : Color.INSTANCE.a();
                    }
                    q4.y.F(paragraph, h1VarF, jA, shadow, kVar, gVar, 0, 32, null);
                }
            } finally {
                if (didOverflow) {
                    h1VarF.j();
                }
            }
        }
    }

    private a0(String str, TextStyle textStyle, u4.l.b bVar, int i15, boolean z15, int i16, int i17, p1 p1Var) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.overflow = i15;
        this.softWrap = z15;
        this.maxLines = i16;
        this.minLines = i17;
        this.overrideColor = p1Var;
    }

    /* JADX INFO: renamed from: y1.a0$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0013\u0010 \"\u0004\b\u001e\u0010!¨\u0006\""}, d2 = {"Ly1/a0$a;", "", "", "original", "substitution", "", "isShowingSubstitution", "Ly1/g;", "layoutCache", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLy1/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOriginal", "b", "f", "(Ljava/lang/String;)V", "c", "Z", "()Z", "e", "(Z)V", "d", "Ly1/g;", "()Ly1/g;", "(Ly1/g;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TextSubstitution {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String original;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String substitution;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean isShowingSubstitution;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private g layoutCache;

        public TextSubstitution(String str, String str2, boolean z15, g gVar) {
            this.original = str;
            this.substitution = str2;
            this.isShowingSubstitution = z15;
            this.layoutCache = gVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final g getLayoutCache() {
            return this.layoutCache;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSubstitution() {
            return this.substitution;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void d(g gVar) {
            this.layoutCache = gVar;
        }

        public final void e(boolean z15) {
            this.isShowingSubstitution = z15;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextSubstitution)) {
                return false;
            }
            TextSubstitution textSubstitution = (TextSubstitution) other;
            return fr.t.c(this.original, textSubstitution.original) && fr.t.c(this.substitution, textSubstitution.substitution) && this.isShowingSubstitution == textSubstitution.isShowingSubstitution && fr.t.c(this.layoutCache, textSubstitution.layoutCache);
        }

        public final void f(String str) {
            this.substitution = str;
        }

        public int hashCode() {
            int iHashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            g gVar = this.layoutCache;
            return iHashCode + (gVar == null ? 0 : gVar.hashCode());
        }

        public String toString() {
            return "TextSubstitution(layoutCache=" + this.layoutCache + ", isShowingSubstitution=" + this.isShowingSubstitution + ')';
        }

        public /* synthetic */ TextSubstitution(String str, String str2, boolean z15, g gVar, int i15, fr.k kVar) {
            this(str, str2, (i15 & 4) != 0 ? false : z15, (i15 & 8) != 0 ? null : gVar);
        }
    }
}
