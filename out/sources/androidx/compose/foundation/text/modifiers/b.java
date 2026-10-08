package androidx.compose.foundation.text.modifiers;

import android.os.Trace;
import androidx.compose.ui.graphics.Color;
import b5.j;
import c5.d;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import f3.m;
import fr.t;
import g4.b0;
import g4.i1;
import g4.j1;
import g4.q;
import g4.r;
import g4.z;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m3.g;
import m3.h;
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
import p036e4.w;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p079n1.h4;
import p3.c;
import pq.v;
import q4.Placeholder;
import q4.TextLayoutInput;
import q4.TextLayoutResult;
import q4.TextStyle;
import q4.e;
import y1.f;
import y1.k;
import y1.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u008b\u0001BÓ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0005H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b3\u0010-J]\u00104\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b4\u00105Ja\u00106\u001a\u00020\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b6\u00107J-\u0010<\u001a\u00020\r2\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u0011¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\rH\u0000¢\u0006\u0004\b>\u0010/J\u0013\u0010@\u001a\u00020\r*\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ%\u0010I\u001a\u00020H2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bI\u0010JJ#\u0010K\u001a\u00020H*\u00020B2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bK\u0010JJ%\u0010P\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0013¢\u0006\u0004\bP\u0010QJ#\u0010R\u001a\u00020\u0013*\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0013H\u0016¢\u0006\u0004\bR\u0010QJ%\u0010T\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0013¢\u0006\u0004\bT\u0010QJ#\u0010U\u001a\u00020\u0013*\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0013H\u0016¢\u0006\u0004\bU\u0010QJ%\u0010V\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0013¢\u0006\u0004\bV\u0010QJ#\u0010W\u001a\u00020\u0013*\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0013H\u0016¢\u0006\u0004\bW\u0010QJ%\u0010X\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0013¢\u0006\u0004\bX\u0010QJ#\u0010Y\u001a\u00020\u0013*\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0013H\u0016¢\u0006\u0004\bY\u0010QJ\u0015\u0010\\\u001a\u00020\r2\u0006\u0010[\u001a\u00020Z¢\u0006\u0004\b\\\u0010]J\u0013\u0010^\u001a\u00020\r*\u00020ZH\u0016¢\u0006\u0004\b^\u0010]R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010hR\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010hR$\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR,\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010fR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010fR*\u0010y\u001a\u0010\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020\u0013\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bv\u0010w\u0012\u0004\bx\u0010/R\u0018\u0010|\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R*\u0010~\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0}\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010fR)\u0010\u0084\u0001\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\bh\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0017\u0010\u0087\u0001\u001a\u00020(8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0017\u0010\u008a\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008c\u0001"}, d2 = {"Landroidx/compose/foundation/text/modifiers/b;", "Lf3/m$c;", "Lg4/z;", "Lg4/q;", "Lg4/i1;", "Lq4/e;", "text", "Lq4/b4;", "style", "Lu4/l$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Lq4/t3;", "Loq/i0;", "onTextLayout", "Lb5/v;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Lq4/e$d;", "Lq4/g0;", "placeholders", "Lm3/g;", "onPlaceholderLayout", "Ly1/k;", "selectionController", "Ln3/p1;", "overrideColor", "Ln1/h4;", "autoSize", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "<init>", "(Lq4/e;Lq4/b4;Lu4/l$b;Ler/l;IZIILjava/util/List;Ler/l;Ly1/k;Ln3/p1;Ln1/h4;Ler/l;Lfr/k;)V", "Lc5/d;", "density", "Ly1/f;", "A3", "(Lc5/d;)Ly1/f;", "updatedText", "I3", "(Lq4/e;)Z", "B3", "()V", "color", "K3", "(Ln3/p1;Lq4/b4;)Z", "M3", "L3", "(Lq4/b4;Ljava/util/List;IIZLu4/l$b;ILn1/h4;)Z", "J3", "(Ler/l;Ler/l;Ly1/k;Ler/l;)Z", "drawChanged", "textChanged", "layoutChanged", "callbacksChanged", "x3", "(ZZZZ)V", "w3", "Ln4/i0;", "E2", "(Ln4/i0;)V", "Le4/y0;", "measureScope", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "E3", "(Le4/y0;Le4/v0;J)Le4/x0;", "c", "Le4/w;", "intrinsicMeasureScope", "Le4/v;", "height", i.f37090q, "(Le4/w;Le4/v;I)I", "K", "width", "G3", i.f37087n, "D3", "k", "C3", "O", "Lp3/c;", "contentDrawScope", "y3", "(Lp3/c;)V", "y", "r", "Lq4/e;", "s", "Lq4/b4;", "t", "Lu4/l$b;", "v", "Ler/l;", "w", "I", "x", "Z", "z", "A", "Ljava/util/List;", "B", "C", "Ly1/k;", ip.a.f96138c, "Ln3/p1;", "E", "", "Le4/a;", "F", "Ljava/util/Map;", "getBaselineCache$annotations", "baselineCache", "G", "Ly1/f;", "_layoutCache", "", "semanticsTextLayoutResult", "Landroidx/compose/foundation/text/modifiers/b$a;", "getTextSubstitution$foundation", "()Landroidx/compose/foundation/text/modifiers/b$a;", "setTextSubstitution$foundation", "(Landroidx/compose/foundation/text/modifiers/b$a;)V", "textSubstitution", "z3", "()Ly1/f;", "layoutCache", "R2", "()Z", "shouldAutoInvalidate", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends m.c implements z, q, i1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private List<e.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private l<? super List<g>, i0> onPlaceholderLayout;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private k selectionController;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private p1 overrideColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private l<? super TextSubstitutionValue, i0> onShowTranslation;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private Map<p036e4.a, Integer> baselineCache;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private f _layoutCache;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private l<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private TextSubstitutionValue textSubstitution;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private e text;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private TextStyle style;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private u4.l.b fontFamilyResolver;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private l<? super TextLayoutResult, i0> onTextLayout;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean softWrap;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private int minLines;

    public /* synthetic */ b(e eVar, TextStyle textStyle, u4.l.b bVar, l lVar, int i15, boolean z15, int i16, int i17, List list, l lVar2, k kVar, p1 p1Var, h4 h4Var, l lVar3, fr.k kVar2) {
        this(eVar, textStyle, bVar, lVar, i15, z15, i16, i17, list, lVar2, kVar, p1Var, h4Var, lVar3);
    }

    private final f A3(d density) {
        f layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null && textSubstitutionValue.getIsShowingSubstitution() && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
            layoutCache.m(density);
            return layoutCache;
        }
        f fVarZ3 = z3();
        fVarZ3.m(density);
        return fVarZ3;
    }

    private final void B3() {
        j1.d(this);
        b0.b(this);
        r.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F3(a2 a2Var, a2.a aVar) {
        a2.a.E(aVar, a2Var, 0, 0, 0.0f, 4, null);
        return i0.f148189a;
    }

    private final boolean I3(e updatedText) {
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            if (t.c(updatedText, textSubstitutionValue.getSubstitution())) {
                return false;
            }
            textSubstitutionValue.g(updatedText);
            f layoutCache = textSubstitutionValue.getLayoutCache();
            if (layoutCache == null) {
                return false;
            }
            layoutCache.q(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, v.n(), null);
            return true;
        }
        TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, updatedText, false, null, 12, null);
        f fVar = new f(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, v.n(), null, null);
        fVar.m(z3().getDensity());
        textSubstitutionValue2.e(fVar);
        this.textSubstitution = textSubstitutionValue2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x00af  */
    public static final boolean s3(b bVar, List list) {
        TextLayoutResult textLayoutResultB;
        TextLayoutResult textLayoutResultB2 = bVar.z3().getLayoutCache();
        if (textLayoutResultB2 != null) {
            e text = textLayoutResultB2.getLayoutInput().getText();
            TextStyle textStyle = bVar.style;
            p1 p1Var = bVar.overrideColor;
            textLayoutResultB = TextLayoutResult.b(textLayoutResultB2, new TextLayoutInput(text, textStyle.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : p1Var != null ? p1Var.a() : Color.INSTANCE.h(), (16777214 & 2) != 0 ? c5.v.INSTANCE.a() : 0L, (16777214 & 4) != 0 ? null : null, (16777214 & 8) != 0 ? null : null, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : null, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? c5.v.INSTANCE.a() : 0L, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : null, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : 0, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? c5.v.INSTANCE.a() : 0L, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? b5.f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? b5.e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null), textLayoutResultB2.getLayoutInput().g(), textLayoutResultB2.getLayoutInput().getMaxLines(), textLayoutResultB2.getLayoutInput().getSoftWrap(), textLayoutResultB2.getLayoutInput().getOverflow(), textLayoutResultB2.getLayoutInput().getDensity(), textLayoutResultB2.getLayoutInput().getLayoutDirection(), textLayoutResultB2.getLayoutInput().getFontFamilyResolver(), textLayoutResultB2.getLayoutInput().getConstraints(), (fr.k) null), 0L, 2, null);
            if (textLayoutResultB != null) {
                list.add(textLayoutResultB);
            } else {
                textLayoutResultB = null;
            }
        } else {
            textLayoutResultB = null;
        }
        return textLayoutResultB != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t3(b bVar, e eVar) {
        bVar.I3(eVar);
        bVar.B3();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u3(b bVar, boolean z15) {
        TextSubstitutionValue textSubstitutionValue = bVar.textSubstitution;
        if (textSubstitutionValue == null) {
            return false;
        }
        l<? super TextSubstitutionValue, i0> lVar = bVar.onShowTranslation;
        if (lVar != null) {
            lVar.b(textSubstitutionValue);
        }
        TextSubstitutionValue textSubstitutionValue2 = bVar.textSubstitution;
        if (textSubstitutionValue2 != null) {
            textSubstitutionValue2.f(z15);
        }
        bVar.B3();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v3(b bVar) {
        bVar.w3();
        bVar.B3();
        return true;
    }

    private final f z3() {
        if (this._layoutCache == null) {
            this._layoutCache = new f(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null, null);
        }
        return this._layoutCache;
    }

    public final int C3(w intrinsicMeasureScope, p036e4.v measurable, int width) {
        return O(intrinsicMeasureScope, measurable, width);
    }

    public final int D3(w intrinsicMeasureScope, p036e4.v measurable, int height) {
        return k(intrinsicMeasureScope, measurable, height);
    }

    @Override // g4.i1
    public void E2(n4.i0 i0Var) {
        l<? super List<TextLayoutResult>, Boolean> lVar = this.semanticsTextLayoutResult;
        if (lVar == null) {
            lVar = new l() { // from class: y1.q
                @Override // er.l
                public final Object b(Object obj) {
                    return Boolean.valueOf(androidx.compose.foundation.text.modifiers.b.s3(this.f223132a, (List) obj));
                }
            };
            this.semanticsTextLayoutResult = lVar;
        }
        f0.A0(i0Var, this.text);
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            f0.E0(i0Var, textSubstitutionValue.getSubstitution());
            f0.w0(i0Var, textSubstitutionValue.getIsShowingSubstitution());
        }
        f0.F0(i0Var, null, new l() { // from class: y1.r
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(androidx.compose.foundation.text.modifiers.b.t3(this.f223133a, (q4.e) obj));
            }
        }, 1, null);
        f0.L0(i0Var, null, new l() { // from class: y1.s
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(androidx.compose.foundation.text.modifiers.b.u3(this.f223134a, ((Boolean) obj).booleanValue()));
            }
        }, 1, null);
        f0.b(i0Var, null, new er.a() { // from class: y1.t
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(androidx.compose.foundation.text.modifiers.b.v3(this.f223135a));
            }
        }, 1, null);
        f0.s(i0Var, null, lVar, 1, null);
    }

    public final x0 E3(y0 measureScope, v0 measurable, long constraints) {
        return c(measureScope, measurable, constraints);
    }

    public final int G3(w intrinsicMeasureScope, p036e4.v measurable, int width) {
        return H(intrinsicMeasureScope, measurable, width);
    }

    @Override // g4.z
    public int H(w wVar, p036e4.v vVar, int i15) {
        return A3(wVar).d(i15, wVar.getLayoutDirection());
    }

    public final int H3(w intrinsicMeasureScope, p036e4.v measurable, int height) {
        return K(intrinsicMeasureScope, measurable, height);
    }

    public final boolean J3(l<? super TextLayoutResult, i0> onTextLayout, l<? super List<g>, i0> onPlaceholderLayout, k selectionController, l<? super TextSubstitutionValue, i0> onShowTranslation) {
        boolean z15;
        if (this.onTextLayout != onTextLayout) {
            this.onTextLayout = onTextLayout;
            z15 = true;
        } else {
            z15 = false;
        }
        if (this.onPlaceholderLayout != onPlaceholderLayout) {
            this.onPlaceholderLayout = onPlaceholderLayout;
            z15 = true;
        }
        if (!t.c(this.selectionController, selectionController)) {
            this.selectionController = selectionController;
            z15 = true;
        }
        if (this.onShowTranslation == onShowTranslation) {
            return z15;
        }
        this.onShowTranslation = onShowTranslation;
        return true;
    }

    @Override // g4.z
    public int K(w wVar, p036e4.v vVar, int i15) {
        return A3(wVar).j(wVar.getLayoutDirection());
    }

    public final boolean K3(p1 color, TextStyle style) {
        boolean zC = t.c(color, this.overrideColor);
        this.overrideColor = color;
        return (zC && style.H(this.style)) ? false : true;
    }

    public final boolean L3(TextStyle style, List<e.Range<Placeholder>> placeholders, int minLines, int maxLines, boolean softWrap, u4.l.b fontFamilyResolver, int overflow, h4 autoSize) {
        boolean z15 = !this.style.I(style);
        this.style = style;
        if (!t.c(this.placeholders, placeholders)) {
            this.placeholders = placeholders;
            z15 = true;
        }
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
        if (!t.c(this.fontFamilyResolver, fontFamilyResolver)) {
            this.fontFamilyResolver = fontFamilyResolver;
            z15 = true;
        }
        if (!b5.v.g(this.overflow, overflow)) {
            this.overflow = overflow;
            z15 = true;
        }
        if (t.c(null, autoSize)) {
            return z15;
        }
        return true;
    }

    public final boolean M3(e text) {
        boolean zC = t.c(this.text.getText(), text.getText());
        boolean z15 = (zC && this.text.n(text)) ? false : true;
        if (z15) {
            this.text = text;
        }
        if (!zC) {
            w3();
        }
        return z15;
    }

    @Override // g4.z
    public int O(w wVar, p036e4.v vVar, int i15) {
        return A3(wVar).d(i15, wVar.getLayoutDirection());
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            f fVarA3 = A3(y0Var);
            boolean zF = fVarA3.f(j15, y0Var.getLayoutDirection());
            TextLayoutResult textLayoutResultC = fVarA3.c();
            textLayoutResultC.getMultiParagraph().getIntrinsics().a();
            if (zF) {
                b0.a(this);
                l<? super TextLayoutResult, i0> lVar = this.onTextLayout;
                if (lVar != null) {
                    lVar.b(textLayoutResultC);
                }
                k kVar = this.selectionController;
                if (kVar != null) {
                    kVar.m(textLayoutResultC);
                }
                Map<p036e4.a, Integer> linkedHashMap = this.baselineCache;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>(2);
                }
                linkedHashMap.put(p036e4.b.a(), Integer.valueOf(Math.round(textLayoutResultC.getFirstBaseline())));
                linkedHashMap.put(p036e4.b.b(), Integer.valueOf(Math.round(textLayoutResultC.getLastBaseline())));
                this.baselineCache = linkedHashMap;
            }
            l<? super List<g>, i0> lVar2 = this.onPlaceholderLayout;
            if (lVar2 != null) {
                lVar2.b(textLayoutResultC.A());
            }
            final a2 a2VarO0 = v0Var.o0(c5.b.INSTANCE.b((int) (textLayoutResultC.getSize() >> 32), (int) (textLayoutResultC.getSize() >> 32), (int) (textLayoutResultC.getSize() & BodyPartID.bodyIdMax), (int) (textLayoutResultC.getSize() & BodyPartID.bodyIdMax)));
            return y0Var.x1((int) (textLayoutResultC.getSize() >> 32), (int) (textLayoutResultC.getSize() & BodyPartID.bodyIdMax), this.baselineCache, new l() { // from class: y1.p
                @Override // er.l
                public final Object b(Object obj) {
                    return androidx.compose.foundation.text.modifiers.b.F3(a2VarO0, (a2.a) obj);
                }
            });
        } finally {
            Trace.endSection();
        }
    }

    @Override // g4.z
    public int k(w wVar, p036e4.v vVar, int i15) {
        return A3(wVar).i(wVar.getLayoutDirection());
    }

    public final void w3() {
        this.textSubstitution = null;
    }

    public final void x3(boolean drawChanged, boolean textChanged, boolean layoutChanged, boolean callbacksChanged) {
        if (textChanged || layoutChanged || callbacksChanged) {
            z3().q(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
        }
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.semanticsTextLayoutResult != null)) {
                j1.d(this);
            }
            if (textChanged || layoutChanged || callbacksChanged) {
                b0.b(this);
                r.a(this);
            }
            if (drawChanged) {
                r.a(this);
            }
        }
    }

    @Override // g4.q
    public void y(c cVar) {
        if (getIsAttached()) {
            k kVar = this.selectionController;
            if (kVar != null) {
                kVar.g(cVar);
            }
            h1 h1VarF = cVar.getDrawContext().f();
            TextLayoutResult textLayoutResultC = A3(cVar).c();
            q4.q multiParagraph = textLayoutResultC.getMultiParagraph();
            boolean z15 = true;
            boolean z16 = textLayoutResultC.i() && !b5.v.g(this.overflow, b5.v.INSTANCE.e());
            if (z16) {
                g gVarC = h.c(m3.e.INSTANCE.c(), m3.k.d((((long) Float.floatToRawIntBits((int) (textLayoutResultC.getSize() >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (textLayoutResultC.getSize() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax)));
                h1VarF.q();
                h1.w(h1VarF, gVarC, 0, 2, null);
            }
            try {
                b5.k kVarC = this.style.C();
                if (kVarC == null) {
                    kVarC = b5.k.INSTANCE.c();
                }
                b5.k kVar2 = kVarC;
                Shadow shadowZ = this.style.z();
                if (shadowZ == null) {
                    shadowZ = Shadow.INSTANCE.a();
                }
                Shadow shadow = shadowZ;
                p3.g gVarK = this.style.k();
                if (gVarK == null) {
                    gVarK = p3.j.f152592b;
                }
                p3.g gVar = gVarK;
                androidx.compose.ui.graphics.c cVarI = this.style.i();
                if (cVarI != null) {
                    q4.q.N(multiParagraph, h1VarF, cVarI, this.style.f(), shadow, kVar2, gVar, 0, 64, null);
                } else {
                    p1 p1Var = this.overrideColor;
                    long jA = p1Var != null ? p1Var.a() : Color.INSTANCE.h();
                    if (jA == 16) {
                        jA = this.style.j() != 16 ? this.style.j() : Color.INSTANCE.a();
                    }
                    multiParagraph.K(h1VarF, (32 & 2) != 0 ? Color.INSTANCE.h() : jA, (32 & 4) != 0 ? null : shadow, (32 & 8) != 0 ? null : kVar2, (32 & 16) == 0 ? gVar : null, (32 & 32) != 0 ? p3.f.INSTANCE.a() : 0);
                }
                if (z16) {
                    h1VarF.j();
                }
                TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
                if (!((textSubstitutionValue == null || !textSubstitutionValue.getIsShowingSubstitution()) ? u.a(this.text) : false)) {
                    List<e.Range<Placeholder>> list = this.placeholders;
                    if (list != null && !list.isEmpty()) {
                        z15 = false;
                    }
                    if (z15) {
                        return;
                    }
                }
                cVar.H2();
            } catch (Throwable th4) {
                if (z16) {
                    h1VarF.j();
                }
                throw th4;
            }
        }
    }

    public final void y3(c contentDrawScope) {
        y(contentDrawScope);
    }

    private b(e eVar, TextStyle textStyle, u4.l.b bVar, l<? super TextLayoutResult, i0> lVar, int i15, boolean z15, int i16, int i17, List<e.Range<Placeholder>> list, l<? super List<g>, i0> lVar2, k kVar, p1 p1Var, h4 h4Var, l<? super TextSubstitutionValue, i0> lVar3) {
        this.text = eVar;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.onTextLayout = lVar;
        this.overflow = i15;
        this.softWrap = z15;
        this.maxLines = i16;
        this.minLines = i17;
        this.placeholders = list;
        this.onPlaceholderLayout = lVar2;
        this.selectionController = kVar;
        this.overrideColor = p1Var;
        this.onShowTranslation = lVar3;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.modifiers.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010 \u001a\u0004\b\u0014\u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text/modifiers/b$a;", "", "Lq4/e;", "original", "substitution", "", "isShowingSubstitution", "Ly1/f;", "layoutCache", "<init>", "(Lq4/e;Lq4/e;ZLy1/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lq4/e;", "b", "()Lq4/e;", "c", "g", "(Lq4/e;)V", "Z", "d", "()Z", "f", "(Z)V", "Ly1/f;", "()Ly1/f;", "e", "(Ly1/f;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TextSubstitutionValue {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e original;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private e substitution;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean isShowingSubstitution;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private f layoutCache;

        public TextSubstitutionValue(e eVar, e eVar2, boolean z15, f fVar) {
            this.original = eVar;
            this.substitution = eVar2;
            this.isShowingSubstitution = z15;
            this.layoutCache = fVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final f getLayoutCache() {
            return this.layoutCache;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final e getOriginal() {
            return this.original;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final e getSubstitution() {
            return this.substitution;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void e(f fVar) {
            this.layoutCache = fVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) other;
            return t.c(this.original, textSubstitutionValue.original) && t.c(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && t.c(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        public final void f(boolean z15) {
            this.isShowingSubstitution = z15;
        }

        public final void g(e eVar) {
            this.substitution = eVar;
        }

        public int hashCode() {
            int iHashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            f fVar = this.layoutCache;
            return iHashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.original) + ", substitution=" + ((Object) this.substitution) + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        public /* synthetic */ TextSubstitutionValue(e eVar, e eVar2, boolean z15, f fVar, int i15, fr.k kVar) {
            this(eVar, eVar2, (i15 & 4) != 0 ? false : z15, (i15 & 8) != 0 ? null : fVar);
        }
    }
}
