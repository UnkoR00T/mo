package p046f2;

import androidx.compose.material3.d;
import androidx.compose.ui.graphics.Color;
import c5.h;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import d1.a3;
import d1.d3;
import ip.a;
import l2.b0;
import l2.f1;
import l2.g;
import l2.j;
import l2.k;
import l2.l;
import l2.m0;
import l2.p;
import n3.y2;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import w0.BorderStroke;
import w0.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\bc\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0006J7\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\rJA\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010!\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0014\u0010#\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0017\u0010(\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001c\u0010'R\u0017\u0010+\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010'R\u0014\u0010-\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u0017\u00100\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010'R\u0014\u00101\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u0017\u00104\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u0010'R\u0017\u00106\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b)\u00105R\u0017\u00107\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b%\u00105R \u0010;\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010\u0019\u0012\u0004\b:\u0010\u0003\u001a\u0004\b9\u00105R \u0010?\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010\u0019\u0012\u0004\b>\u0010\u0003\u001a\u0004\b=\u00105R \u0010C\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010\u0019\u0012\u0004\bB\u0010\u0003\u001a\u0004\bA\u00105R \u0010G\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010\u0019\u0012\u0004\bF\u0010\u0003\u001a\u0004\bE\u00105R\u0017\u0010J\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bH\u0010\u0019\u001a\u0004\bI\u00105R \u0010N\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bK\u0010\u0019\u0012\u0004\bM\u0010\u0003\u001a\u0004\bL\u00105R \u0010R\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bO\u0010\u0019\u0012\u0004\bQ\u0010\u0003\u001a\u0004\bP\u00105R \u0010V\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bS\u0010\u0019\u0012\u0004\bU\u0010\u0003\u001a\u0004\bT\u00105R \u0010Z\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bW\u0010\u0019\u0012\u0004\bY\u0010\u0003\u001a\u0004\bX\u00105R \u0010^\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b[\u0010\u0019\u0012\u0004\b]\u0010\u0003\u001a\u0004\b\\\u00105R\u0017\u0010`\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b_\u0010\u0019\u001a\u0004\b\"\u00105R \u0010d\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\ba\u0010\u0019\u0012\u0004\bc\u0010\u0003\u001a\u0004\bb\u00105R \u0010h\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\be\u0010\u0019\u0012\u0004\bg\u0010\u0003\u001a\u0004\bf\u00105R \u0010l\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bi\u0010\u0019\u0012\u0004\bk\u0010\u0003\u001a\u0004\bj\u00105R \u0010p\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bm\u0010\u0019\u0012\u0004\bo\u0010\u0003\u001a\u0004\bn\u00105R\u0014\u0010r\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010\u0019R\u0014\u0010s\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0019R\u0014\u0010u\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010\u0019R\u0014\u0010w\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010\u0019R\u0014\u0010y\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010\u0019R\u0014\u0010{\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010\u0019R\u0014\u0010}\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010\u0019R\u0014\u0010\u007f\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u0019R\u0016\u0010\u0081\u0001\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0019R\u0016\u0010\u0083\u0001\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u0019R\u0016\u0010\u0085\u0001\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u0019R\u0016\u0010\u0087\u0001\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u0019R\u0014\u0010\u008a\u0001\u001a\u00030\u0088\u00018G¢\u0006\u0007\u001a\u0005\b.\u0010\u0089\u0001R\u0014\u0010\u008b\u0001\u001a\u00030\u0088\u00018G¢\u0006\u0007\u001a\u0005\b2\u0010\u0089\u0001R\u001b\u0010\u008e\u0001\u001a\u00020\u0004*\u00030\u008c\u00018@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u001e\u0010\u008d\u0001R\u001b\u0010\u008f\u0001\u001a\u00020\u0004*\u00030\u008c\u00018@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b \u0010\u008d\u0001R\u0014\u0010\u0092\u0001\u001a\u00030\u0090\u00018G¢\u0006\u0007\u001a\u0005\b,\u0010\u0091\u0001¨\u0006\u0093\u0001"}, d2 = {"Lf2/n1;", "", "<init>", "()V", "Lf2/m1;", "a", "(Lm2/r;I)Lf2/m1;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "b", "(JJJJLm2/r;II)Lf2/m1;", "n", "o", "Lc5/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "Lf2/o1;", "c", "(FFFFFLm2/r;II)Lf2/o1;", "F", "ButtonLeadingSpace", "ButtonTrailingSpace", "d", "ButtonWithIconStartpadding", "e", "SmallStartPadding", "f", "SmallEndPadding", "g", "ButtonVerticalPadding", "Ld1/d3;", "h", "Ld1/d3;", "()Ld1/d3;", "ContentPadding", "i", "getButtonWithIconContentPadding", "ButtonWithIconContentPadding", "j", "TextButtonHorizontalPadding", "k", "l", "TextButtonContentPadding", "TextButtonWithIconHorizontalEndPadding", "m", "getTextButtonWithIconContentPadding", "TextButtonWithIconContentPadding", "()F", "MinWidth", "MinHeight", "p", "getExtraSmallContainerHeight-D9Ej5fM", "getExtraSmallContainerHeight-D9Ej5fM$annotations", "ExtraSmallContainerHeight", "q", "getMediumContainerHeight-D9Ej5fM", "getMediumContainerHeight-D9Ej5fM$annotations", "MediumContainerHeight", "r", "getLargeContainerHeight-D9Ej5fM", "getLargeContainerHeight-D9Ej5fM$annotations", "LargeContainerHeight", "s", "getExtraLargeContainerHeight-D9Ej5fM", "getExtraLargeContainerHeight-D9Ej5fM$annotations", "ExtraLargeContainerHeight", "t", "getIconSize-D9Ej5fM", "IconSize", "u", "getExtraSmallIconSize-D9Ej5fM", "getExtraSmallIconSize-D9Ej5fM$annotations", "ExtraSmallIconSize", "v", "getSmallIconSize-D9Ej5fM", "getSmallIconSize-D9Ej5fM$annotations", "SmallIconSize", "w", "getMediumIconSize-D9Ej5fM", "getMediumIconSize-D9Ej5fM$annotations", "MediumIconSize", "x", "getLargeIconSize-D9Ej5fM", "getLargeIconSize-D9Ej5fM$annotations", "LargeIconSize", "y", "getExtraLargeIconSize-D9Ej5fM", "getExtraLargeIconSize-D9Ej5fM$annotations", "ExtraLargeIconSize", "z", "IconSpacing", "A", "getExtraSmallIconSpacing-D9Ej5fM", "getExtraSmallIconSpacing-D9Ej5fM$annotations", "ExtraSmallIconSpacing", "B", "getMediumIconSpacing-D9Ej5fM", "getMediumIconSpacing-D9Ej5fM$annotations", "MediumIconSpacing", "C", "getLargeIconSpacing-D9Ej5fM", "getLargeIconSpacing-D9Ej5fM$annotations", "LargeIconSpacing", a.f96138c, "getExtraLargeIconSpacing-D9Ej5fM", "getExtraLargeIconSpacing-D9Ej5fM$annotations", "ExtraLargeIconSpacing", "E", "SmallVerticalPadding", "IconSmallHorizontalPadding", "G", "MediumLeadingPadding", i.f37087n, "MediumTrailingPadding", "I", "MediumVerticalPadding", "J", "IconMediumLeadingPadding", "K", "IconMediumTrailingPadding", i.f37094u, "LargeVerticalPadding", "M", "LargeLeadingPadding", "N", "LargeTrailingPadding", "O", "IconLargeLeadingPadding", i.f37086m, "IconLargeTrailingPadding", "Ln3/y2;", "(Lm2/r;I)Ln3/y2;", "shape", "textShape", "Lf2/e2;", "(Lf2/e2;)Lf2/m1;", "defaultButtonColors", "defaultTextButtonColors", "Lw0/w;", "(Lm2/r;I)Lw0/w;", "outlinedButtonBorder", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final float ExtraSmallIconSpacing;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final float MediumIconSpacing;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final float LargeIconSpacing;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final float ExtraLargeIconSpacing;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final float SmallVerticalPadding;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final float IconSmallHorizontalPadding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final float MediumLeadingPadding;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final float MediumTrailingPadding;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final float MediumVerticalPadding;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final float IconMediumLeadingPadding;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final float IconMediumTrailingPadding;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private static final float LargeVerticalPadding;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private static final float LargeLeadingPadding;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private static final float LargeTrailingPadding;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private static final float IconLargeLeadingPadding;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private static final float IconLargeTrailingPadding;
    public static final int Q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1 f56965a = new n1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonLeadingSpace;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonTrailingSpace;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonWithIconStartpadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float SmallStartPadding;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float SmallEndPadding;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonVerticalPadding;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final d3 ContentPadding;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final d3 ButtonWithIconContentPadding;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final float TextButtonHorizontalPadding;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final d3 TextButtonContentPadding;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final float TextButtonWithIconHorizontalEndPadding;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final d3 TextButtonWithIconContentPadding;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final float MinHeight;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final float ExtraSmallContainerHeight;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final float MediumContainerHeight;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final float LargeContainerHeight;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final float ExtraLargeContainerHeight;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final float ExtraSmallIconSize;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final float SmallIconSize;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final float MediumIconSize;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final float LargeIconSize;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final float ExtraLargeIconSize;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final float IconSpacing;

    static {
        g gVar = g.f114521a;
        float fA = gVar.a();
        ButtonLeadingSpace = fA;
        float fB = gVar.b();
        ButtonTrailingSpace = fB;
        float f15 = 16;
        float fN = h.n(f15);
        ButtonWithIconStartpadding = fN;
        j jVar = j.f114795a;
        float fE = jVar.e();
        SmallStartPadding = fE;
        SmallEndPadding = jVar.g();
        float f16 = 8;
        float fN2 = h.n(f16);
        ButtonVerticalPadding = fN2;
        d3 d3VarH = a3.h(fA, fN2, fB, fN2);
        ContentPadding = d3VarH;
        ButtonWithIconContentPadding = a3.h(fN, fN2, fB, fN2);
        float f17 = 12;
        float fN3 = h.n(f17);
        TextButtonHorizontalPadding = fN3;
        TextButtonContentPadding = a3.h(fN3, d3VarH.getTop(), fN3, d3VarH.getBottom());
        float fN4 = h.n(f15);
        TextButtonWithIconHorizontalEndPadding = fN4;
        TextButtonWithIconContentPadding = a3.h(fN3, d3VarH.getTop(), fN4, d3VarH.getBottom());
        MinWidth = h.n(58);
        MinHeight = sg.a().getValue().booleanValue() ? h.n(36) : jVar.a();
        l lVar = l.f114865a;
        ExtraSmallContainerHeight = lVar.a();
        MediumContainerHeight = sg.a().getValue().booleanValue() ? h.n(46) : l2.i.f114690a.a();
        LargeContainerHeight = sg.a().getValue().booleanValue() ? h.n(54) : l2.h.f114642a.a();
        k kVar = k.f114822a;
        ExtraLargeContainerHeight = kVar.a();
        IconSize = h.n(18);
        ExtraSmallIconSize = lVar.b();
        SmallIconSize = jVar.d();
        l2.i iVar = l2.i.f114690a;
        MediumIconSize = iVar.c();
        LargeIconSize = sg.a().getValue().booleanValue() ? h.n(24) : l2.h.f114642a.c();
        ExtraLargeIconSize = kVar.c();
        IconSpacing = jVar.c();
        ExtraSmallIconSpacing = h.n(4);
        MediumIconSpacing = iVar.b();
        LargeIconSpacing = sg.a().getValue().booleanValue() ? h.n(f16) : l2.h.f114642a.b();
        ExtraLargeIconSpacing = kVar.b();
        SmallVerticalPadding = sg.a().getValue().booleanValue() ? h.n(f16) : h.n(10);
        if (sg.a().getValue().booleanValue()) {
            fE = h.n(f17);
        }
        IconSmallHorizontalPadding = fE;
        MediumLeadingPadding = iVar.d();
        MediumTrailingPadding = iVar.e();
        MediumVerticalPadding = sg.a().getValue().booleanValue() ? h.n(f17) : h.n(f15);
        IconMediumLeadingPadding = sg.a().getValue().booleanValue() ? h.n(20) : iVar.d();
        IconMediumTrailingPadding = sg.a().getValue().booleanValue() ? h.n(20) : iVar.e();
        LargeVerticalPadding = h.n(sg.a().getValue().booleanValue() ? 14 : 32);
        LargeLeadingPadding = sg.a().getValue().booleanValue() ? h.n(32) : l2.h.f114642a.d();
        LargeTrailingPadding = sg.a().getValue().booleanValue() ? h.n(32) : l2.h.f114642a.e();
        IconLargeLeadingPadding = sg.a().getValue().booleanValue() ? h.n(28) : l2.h.f114642a.d();
        IconLargeTrailingPadding = sg.a().getValue().booleanValue() ? h.n(28) : l2.h.f114642a.e();
    }

    private n1() {
    }

    public final m1 a(r rVar, int i15) {
        if (t.k()) {
            t.o(1449248637, i15, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:1249)");
        }
        m1 m1VarE = e(d.f9816a.a(rVar, 6));
        if (t.k()) {
            t.n();
        }
        return m1VarE;
    }

    public final m1 b(long j15, long j16, long j17, long j18, r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            j15 = Color.INSTANCE.h();
        }
        if ((i16 & 2) != 0) {
            j16 = Color.INSTANCE.h();
        }
        if ((i16 & 4) != 0) {
            j17 = Color.INSTANCE.h();
        }
        if ((i16 & 8) != 0) {
            j18 = Color.INSTANCE.h();
        }
        if (t.k()) {
            t.o(-339300779, i15, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:1267)");
        }
        long j19 = j15;
        m1 m1VarC = e(d.f9816a.a(rVar, 6)).c(j19, j16, j17, j18);
        if (t.k()) {
            t.n();
        }
        return m1VarC;
    }

    public final o1 c(float f15, float f16, float f17, float f18, float f19, r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            f15 = b0.f114293a.b();
        }
        if ((i16 & 2) != 0) {
            f16 = b0.f114293a.k();
        }
        if ((i16 & 4) != 0) {
            f17 = b0.f114293a.h();
        }
        if ((i16 & 8) != 0) {
            f18 = b0.f114293a.i();
        }
        float f25 = f18;
        if ((i16 & 16) != 0) {
            f19 = b0.f114293a.d();
        }
        if (t.k()) {
            t.o(1827791191, i15, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:1488)");
        }
        float f26 = f19;
        float f27 = f17;
        o1 o1Var = new o1(f15, f16, f27, f25, f26, null);
        if (t.k()) {
            t.n();
        }
        return o1Var;
    }

    public final d3 d() {
        return ContentPadding;
    }

    public final m1 e(ColorScheme colorScheme) {
        m1 defaultButtonColorsCached = colorScheme.getDefaultButtonColorsCached();
        if (defaultButtonColorsCached != null) {
            return defaultButtonColorsCached;
        }
        b0 b0Var = b0.f114293a;
        m1 m1Var = new m1(g2.h(colorScheme, b0Var.a()), g2.h(colorScheme, b0Var.j()), Color.m9copywmQWz5c$default(g2.h(colorScheme, b0Var.c()), b0Var.e(), 0.0f, 0.0f, 0.0f, 14, null), Color.m9copywmQWz5c$default(g2.h(colorScheme, b0Var.f()), b0Var.g(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.l0(m1Var);
        return m1Var;
    }

    public final m1 f(ColorScheme colorScheme) {
        m1 defaultTextButtonColorsCached = colorScheme.getDefaultTextButtonColorsCached();
        if (defaultTextButtonColorsCached != null) {
            return defaultTextButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jG = companion.g();
        long jH = g2.h(colorScheme, p.Primary);
        long jG2 = companion.g();
        f1 f1Var = f1.f114506a;
        m1 m1Var = new m1(jG, jH, jG2, Color.m9copywmQWz5c$default(g2.h(colorScheme, f1Var.a()), f1Var.b(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.u0(m1Var);
        return m1Var;
    }

    public final float g() {
        return IconSpacing;
    }

    public final float h() {
        return MinHeight;
    }

    public final float i() {
        return MinWidth;
    }

    @oq.a
    public final BorderStroke j(r rVar, int i15) {
        if (t.k()) {
            t.o(-563957672, i15, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:1563)");
        }
        BorderStroke borderStrokeA = x.a(j.f114795a.f(), g2.i(m0.f114922a.a(), rVar, 6));
        if (t.k()) {
            t.n();
        }
        return borderStrokeA;
    }

    public final y2 k(r rVar, int i15) {
        if (t.k()) {
            t.o(-1234923021, i15, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:1196)");
        }
        y2 y2VarH = ui.h(j.f114795a.b(), rVar, 6);
        if (t.k()) {
            t.n();
        }
        return y2VarH;
    }

    public final d3 l() {
        return TextButtonContentPadding;
    }

    public final y2 m(r rVar, int i15) {
        if (t.k()) {
            t.o(-349121587, i15, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:1212)");
        }
        y2 y2VarH = ui.h(j.f114795a.b(), rVar, 6);
        if (t.k()) {
            t.n();
        }
        return y2VarH;
    }

    public final m1 n(r rVar, int i15) {
        if (t.k()) {
            t.o(1880341584, i15, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:1429)");
        }
        m1 m1VarF = f(d.f9816a.a(rVar, 6));
        if (t.k()) {
            t.n();
        }
        return m1VarF;
    }

    public final m1 o(long j15, long j16, long j17, long j18, r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            j15 = Color.INSTANCE.h();
        }
        if ((i16 & 2) != 0) {
            j16 = Color.INSTANCE.h();
        }
        if ((i16 & 4) != 0) {
            j17 = Color.INSTANCE.h();
        }
        if ((i16 & 8) != 0) {
            j18 = Color.INSTANCE.h();
        }
        if (t.k()) {
            t.o(-1402274782, i15, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:1447)");
        }
        long j19 = j15;
        m1 m1VarC = f(d.f9816a.a(rVar, 6)).c(j19, j16, j17, j18);
        if (t.k()) {
            t.n();
        }
        return m1VarC;
    }
}
