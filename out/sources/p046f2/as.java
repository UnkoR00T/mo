package p046f2;

import d1.c4;
import d1.p3;
import er.p;
import er.q;
import f3.c;
import f3.m;
import fr.k;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import q4.TextStyle;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0007\u0018\u00002\u00020\u0001BÉ\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0014\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b1\u0010(R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010,R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b5\u0010(R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b6\u0010*\u001a\u0004\b7\u0010,R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b8\u0010&\u001a\u0004\b6\u0010(R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b8\u0010,R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b3\u00109\u001a\u0004\b:\u0010;R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b2\u0010(R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u00148\u0006¢\u0006\f\n\u0004\b7\u0010<\u001a\u0004\b!\u0010=R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b%\u00100R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b-\u00100R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b:\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b+\u0010A\u001a\u0004\b)\u0010BR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b?\u0010C\u001a\u0004\b4\u0010D¨\u0006E"}, d2 = {"Lf2/as;", "", "Lf3/m;", "modifier", "Lkotlin/Function0;", "Loq/i0;", "title", "Lq4/b4;", "titleTextStyle", "Lc5/h;", "titleBottomPadding", "smallTitle", "smallTitleTextStyle", "subtitle", "subtitleTextStyle", "smallSubtitle", "smallSubtitleTextStyle", "Lf3/c$b;", "titleHorizontalAlignment", "navigationIcon", "Lkotlin/Function1;", "Ld1/p3;", "actions", "collapsedHeight", "expandedHeight", "Ld1/c4;", "windowInsets", "Lf2/nr;", "colors", "Lf2/ur;", "scrollBehavior", "<init>", "(Lf3/m;Ler/p;Lq4/b4;FLer/p;Lq4/b4;Ler/p;Lq4/b4;Ler/p;Lq4/b4;Lf3/c$b;Ler/p;Ler/q;FFLd1/c4;Lf2/nr;Lf2/ur;Lfr/k;)V", "a", "Lf3/m;", "e", "()Lf3/m;", "b", "Ler/p;", "n", "()Ler/p;", "c", "Lq4/b4;", "q", "()Lq4/b4;", "d", "F", "o", "()F", "j", "f", "k", "g", "l", "h", "m", "i", "Lf3/c$b;", "p", "()Lf3/c$b;", "Ler/q;", "()Ler/q;", "Ld1/c4;", "r", "()Ld1/c4;", "Lf2/nr;", "()Lf2/nr;", "Lf2/ur;", "()Lf2/ur;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class as {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m modifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p<r, Integer, i0> title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextStyle titleTextStyle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float titleBottomPadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p<r, Integer, i0> smallTitle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final TextStyle smallTitleTextStyle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p<r, Integer, i0> subtitle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final TextStyle subtitleTextStyle;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final p<r, Integer, i0> smallSubtitle;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final TextStyle smallSubtitleTextStyle;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final c.b titleHorizontalAlignment;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p<r, Integer, i0> navigationIcon;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final q<p3, r, Integer, i0> actions;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float collapsedHeight;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final float expandedHeight;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final c4 windowInsets;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final nr colors;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final ur scrollBehavior;

    public /* synthetic */ as(m mVar, p pVar, TextStyle textStyle, float f15, p pVar2, TextStyle textStyle2, p pVar3, TextStyle textStyle3, p pVar4, TextStyle textStyle4, c.b bVar, p pVar5, q qVar, float f16, float f17, c4 c4Var, nr nrVar, ur urVar, k kVar) {
        this(mVar, pVar, textStyle, f15, pVar2, textStyle2, pVar3, textStyle3, pVar4, textStyle4, bVar, pVar5, qVar, f16, f17, c4Var, nrVar, urVar);
    }

    public final q<p3, r, Integer, i0> a() {
        return this.actions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getCollapsedHeight() {
        return this.collapsedHeight;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final nr getColors() {
        return this.colors;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getExpandedHeight() {
        return this.expandedHeight;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final m getModifier() {
        return this.modifier;
    }

    public final p<r, Integer, i0> f() {
        return this.navigationIcon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ur getScrollBehavior() {
        return this.scrollBehavior;
    }

    public final p<r, Integer, i0> h() {
        return this.smallSubtitle;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextStyle getSmallSubtitleTextStyle() {
        return this.smallSubtitleTextStyle;
    }

    public final p<r, Integer, i0> j() {
        return this.smallTitle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextStyle getSmallTitleTextStyle() {
        return this.smallTitleTextStyle;
    }

    public final p<r, Integer, i0> l() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextStyle getSubtitleTextStyle() {
        return this.subtitleTextStyle;
    }

    public final p<r, Integer, i0> n() {
        return this.title;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final float getTitleBottomPadding() {
        return this.titleBottomPadding;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final c.b getTitleHorizontalAlignment() {
        return this.titleHorizontalAlignment;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final TextStyle getTitleTextStyle() {
        return this.titleTextStyle;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final c4 getWindowInsets() {
        return this.windowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private as(m mVar, p<? super r, ? super Integer, i0> pVar, TextStyle textStyle, float f15, p<? super r, ? super Integer, i0> pVar2, TextStyle textStyle2, p<? super r, ? super Integer, i0> pVar3, TextStyle textStyle3, p<? super r, ? super Integer, i0> pVar4, TextStyle textStyle4, c.b bVar, p<? super r, ? super Integer, i0> pVar5, q<? super p3, ? super r, ? super Integer, i0> qVar, float f16, float f17, c4 c4Var, nr nrVar, ur urVar) {
        this.modifier = mVar;
        this.title = pVar;
        this.titleTextStyle = textStyle;
        this.titleBottomPadding = f15;
        this.smallTitle = pVar2;
        this.smallTitleTextStyle = textStyle2;
        this.subtitle = pVar3;
        this.subtitleTextStyle = textStyle3;
        this.smallSubtitle = pVar4;
        this.smallSubtitleTextStyle = textStyle4;
        this.titleHorizontalAlignment = bVar;
        this.navigationIcon = pVar5;
        this.actions = qVar;
        this.collapsedHeight = f16;
        this.expandedHeight = f17;
        this.windowInsets = c4Var;
        this.colors = nrVar;
        this.scrollBehavior = urVar;
    }
}
