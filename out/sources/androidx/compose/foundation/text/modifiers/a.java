package androidx.compose.foundation.text.modifiers;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import g4.j;
import g4.q;
import g4.s;
import g4.z;
import java.util.List;
import m3.g;
import n3.p1;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.b0;
import p036e4.v;
import p036e4.v0;
import p036e4.w;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p079n1.h4;
import p3.c;
import q4.Placeholder;
import q4.TextLayoutResult;
import q4.TextStyle;
import q4.e;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BÓ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020\r*\u00020*H\u0016¢\u0006\u0004\b+\u0010,J#\u00103\u001a\u000202*\u00020-2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b3\u00104J#\u00108\u001a\u00020\u0013*\u0002052\u0006\u0010/\u001a\u0002062\u0006\u00107\u001a\u00020\u0013H\u0016¢\u0006\u0004\b8\u00109J#\u0010;\u001a\u00020\u0013*\u0002052\u0006\u0010/\u001a\u0002062\u0006\u0010:\u001a\u00020\u0013H\u0016¢\u0006\u0004\b;\u00109J#\u0010<\u001a\u00020\u0013*\u0002052\u0006\u0010/\u001a\u0002062\u0006\u00107\u001a\u00020\u0013H\u0016¢\u0006\u0004\b<\u00109J#\u0010=\u001a\u00020\u0013*\u0002052\u0006\u0010/\u001a\u0002062\u0006\u0010:\u001a\u00020\u0013H\u0016¢\u0006\u0004\b=\u00109J\u00ad\u0001\u0010?\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010>\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b?\u0010@R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006L"}, d2 = {"Landroidx/compose/foundation/text/modifiers/a;", "Lg4/j;", "Lg4/z;", "Lg4/q;", "Lg4/s;", "Lq4/e;", "text", "Lq4/b4;", "style", "Lu4/l$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Lq4/t3;", "Loq/i0;", "onTextLayout", "Lb5/v;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Lq4/e$d;", "Lq4/g0;", "placeholders", "Lm3/g;", "onPlaceholderLayout", "Ly1/k;", "selectionController", "Ln3/p1;", "overrideColor", "Ln1/h4;", "autoSize", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "<init>", "(Lq4/e;Lq4/b4;Lu4/l$b;Ler/l;IZIILjava/util/List;Ler/l;Ly1/k;Ln3/p1;Ln1/h4;Ler/l;Lfr/k;)V", "Le4/b0;", "coordinates", "h", "(Le4/b0;)V", "Lp3/c;", "y", "(Lp3/c;)V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "Le4/w;", "Le4/v;", "height", "K", "(Le4/w;Le4/v;I)I", "width", i.f37087n, "k", "O", "color", "t3", "(Lq4/e;Lq4/b4;Ljava/util/List;IIZLu4/l$b;ILer/l;Ler/l;Ly1/k;Ln3/p1;Ln1/h4;)V", "v", "Ly1/k;", "w", "Ler/l;", "Landroidx/compose/foundation/text/modifiers/b;", "x", "Landroidx/compose/foundation/text/modifiers/b;", "textAnnotatedStringNode", "R2", "()Z", "shouldAutoInvalidate", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends j implements z, q, s {

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private k selectionController;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private l<? super b.TextSubstitutionValue, i0> onShowTranslation;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final b textAnnotatedStringNode;

    public /* synthetic */ a(e eVar, TextStyle textStyle, u4.l.b bVar, l lVar, int i15, boolean z15, int i16, int i17, List list, l lVar2, k kVar, p1 p1Var, h4 h4Var, l lVar3, fr.k kVar2) {
        this(eVar, textStyle, bVar, lVar, i15, z15, i16, i17, list, lVar2, kVar, p1Var, h4Var, lVar3);
    }

    @Override // g4.z
    public int H(w wVar, v vVar, int i15) {
        return this.textAnnotatedStringNode.G3(wVar, vVar, i15);
    }

    @Override // g4.z
    public int K(w wVar, v vVar, int i15) {
        return this.textAnnotatedStringNode.H3(wVar, vVar, i15);
    }

    @Override // g4.z
    public int O(w wVar, v vVar, int i15) {
        return this.textAnnotatedStringNode.C3(wVar, vVar, i15);
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        return this.textAnnotatedStringNode.E3(y0Var, v0Var, j15);
    }

    @Override // g4.s
    public void h(b0 coordinates) {
        k kVar = this.selectionController;
        if (kVar != null) {
            kVar.l(coordinates);
        }
    }

    @Override // g4.z
    public int k(w wVar, v vVar, int i15) {
        return this.textAnnotatedStringNode.D3(wVar, vVar, i15);
    }

    public final void t3(e text, TextStyle style, List<e.Range<Placeholder>> placeholders, int minLines, int maxLines, boolean softWrap, u4.l.b fontFamilyResolver, int overflow, l<? super TextLayoutResult, i0> onTextLayout, l<? super List<g>, i0> onPlaceholderLayout, k selectionController, p1 color, h4 autoSize) {
        b bVar = this.textAnnotatedStringNode;
        bVar.x3(bVar.K3(color, style), this.textAnnotatedStringNode.M3(text), this.textAnnotatedStringNode.L3(style, placeholders, minLines, maxLines, softWrap, fontFamilyResolver, overflow, autoSize), this.textAnnotatedStringNode.J3(onTextLayout, onPlaceholderLayout, selectionController, this.onShowTranslation));
        this.selectionController = selectionController;
        g4.b0.b(this);
    }

    @Override // g4.q
    public void y(c cVar) {
        this.textAnnotatedStringNode.y3(cVar);
    }

    private a(e eVar, TextStyle textStyle, u4.l.b bVar, l<? super TextLayoutResult, i0> lVar, int i15, boolean z15, int i16, int i17, List<e.Range<Placeholder>> list, l<? super List<g>, i0> lVar2, k kVar, p1 p1Var, h4 h4Var, l<? super b.TextSubstitutionValue, i0> lVar3) {
        this.selectionController = kVar;
        this.onShowTranslation = lVar3;
        this.textAnnotatedStringNode = (b) n3(new b(eVar, textStyle, bVar, lVar, i15, z15, i16, i17, list, lVar2, this.selectionController, p1Var, h4Var, this.onShowTranslation, null));
        if (this.selectionController != null) {
            return;
        }
        c1.e.b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new oq.g();
    }

    public /* synthetic */ a(e eVar, TextStyle textStyle, u4.l.b bVar, l lVar, int i15, boolean z15, int i16, int i17, List list, l lVar2, k kVar, p1 p1Var, h4 h4Var, l lVar3, int i18, fr.k kVar2) {
        this(eVar, textStyle, bVar, (i18 & 8) != 0 ? null : lVar, (i18 & 16) != 0 ? b5.v.INSTANCE.a() : i15, (i18 & 32) != 0 ? true : z15, (i18 & 64) != 0 ? Integer.MAX_VALUE : i16, (i18 & 128) != 0 ? 1 : i17, (i18 & 256) != 0 ? null : list, (i18 & 512) != 0 ? null : lVar2, (i18 & 1024) != 0 ? null : kVar, (i18 & 2048) != 0 ? null : p1Var, (i18 & PKIFailureInfo.certConfirmed) != 0 ? null : h4Var, (i18 & PKIFailureInfo.certRevoked) != 0 ? null : lVar3, null);
    }
}
