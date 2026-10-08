package androidx.compose.foundation.text.modifiers;

import b5.v;
import fr.t;
import g4.l0;
import java.util.List;
import m3.g;
import n3.p1;
import oq.i0;
import p071kotlin.Metadata;
import p079n1.h4;
import q4.Placeholder;
import q4.TextLayoutResult;
import q4.TextStyle;
import q4.e;
import u4.l;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÓ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010)H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00108R\"\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010=R*\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00106R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010AR\"\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00106¨\u0006C"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Lg4/l0;", "Landroidx/compose/foundation/text/modifiers/b;", "Lq4/e;", "text", "Lq4/b4;", "style", "Lu4/l$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Lq4/t3;", "Loq/i0;", "onTextLayout", "Lb5/v;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Lq4/e$d;", "Lq4/g0;", "placeholders", "Lm3/g;", "onPlaceholderLayout", "Ly1/k;", "selectionController", "Ln3/p1;", "color", "Ln1/h4;", "autoSize", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "<init>", "(Lq4/e;Lq4/b4;Lu4/l$b;Ler/l;IZIILjava/util/List;Ler/l;Ly1/k;Ln3/p1;Ln1/h4;Ler/l;Lfr/k;)V", "a", "()Landroidx/compose/foundation/text/modifiers/b;", "node", "l", "(Landroidx/compose/foundation/text/modifiers/b;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "d", "Lq4/e;", "e", "Lq4/b4;", "f", "Lu4/l$b;", "g", "Ler/l;", "h", "I", "i", "Z", "j", "k", "Ljava/util/List;", "m", "n", "Ly1/k;", "Ln3/p1;", "o", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextAnnotatedStringElement extends l0<b> {
    private final p1 color;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e text;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final TextStyle style;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l.b fontFamilyResolver;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final er.l<TextLayoutResult, i0> onTextLayout;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int minLines;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List<e.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final er.l<List<g>, i0> onPlaceholderLayout;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k selectionController;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final er.l<b.TextSubstitutionValue, i0> onShowTranslation;

    public /* synthetic */ TextAnnotatedStringElement(e eVar, TextStyle textStyle, l.b bVar, er.l lVar, int i15, boolean z15, int i16, int i17, List list, er.l lVar2, k kVar, p1 p1Var, h4 h4Var, er.l lVar3, fr.k kVar2) {
        this(eVar, textStyle, bVar, lVar, i15, z15, i16, i17, list, lVar2, kVar, p1Var, h4Var, lVar3);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b create() {
        return new b(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, null, this.onShowTranslation, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) other;
        return t.c(this.color, textAnnotatedStringElement.color) && t.c(this.text, textAnnotatedStringElement.text) && t.c(this.style, textAnnotatedStringElement.style) && t.c(this.placeholders, textAnnotatedStringElement.placeholders) && t.c(this.fontFamilyResolver, textAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == textAnnotatedStringElement.onTextLayout && this.onShowTranslation == textAnnotatedStringElement.onShowTranslation && v.g(this.overflow, textAnnotatedStringElement.overflow) && this.softWrap == textAnnotatedStringElement.softWrap && this.maxLines == textAnnotatedStringElement.maxLines && this.minLines == textAnnotatedStringElement.minLines && this.onPlaceholderLayout == textAnnotatedStringElement.onPlaceholderLayout && t.c(this.selectionController, textAnnotatedStringElement.selectionController);
    }

    public int hashCode() {
        int iHashCode = ((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31;
        er.l<TextLayoutResult, i0> lVar = this.onTextLayout;
        int iHashCode2 = (((((((((iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + v.h(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        List<e.Range<Placeholder>> list = this.placeholders;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        er.l<List<g>, i0> lVar2 = this.onPlaceholderLayout;
        int iHashCode4 = (iHashCode3 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        k kVar = this.selectionController;
        int iHashCode5 = (iHashCode4 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        p1 p1Var = this.color;
        int iHashCode6 = (iHashCode5 + (p1Var != null ? p1Var.hashCode() : 0)) * 31;
        er.l<b.TextSubstitutionValue, i0> lVar3 = this.onShowTranslation;
        return iHashCode6 + (lVar3 != null ? lVar3.hashCode() : 0);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(b node) {
        node.x3(node.K3(this.color, this.style), node.M3(this.text), node.L3(this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, null), node.J3(this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.onShowTranslation));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextAnnotatedStringElement(e eVar, TextStyle textStyle, l.b bVar, er.l<? super TextLayoutResult, i0> lVar, int i15, boolean z15, int i16, int i17, List<e.Range<Placeholder>> list, er.l<? super List<g>, i0> lVar2, k kVar, p1 p1Var, h4 h4Var, er.l<? super b.TextSubstitutionValue, i0> lVar3) {
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
        this.color = p1Var;
        this.onShowTranslation = lVar3;
    }
}
