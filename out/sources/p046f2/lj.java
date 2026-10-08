package p046f2;

import d1.c4;
import d1.d3;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0007\u0018\u00002\u00020\u0001B\u0093\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b+\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b,\u0010$R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0006¢\u0006\f\n\u0004\b*\u00101\u001a\u0004\b\u001d\u00102R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b+\u00103\u001a\u0004\b)\u00104R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b#\u00105\u001a\u0004\b%\u00106R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b.\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b'\u0010:\u001a\u0004\b!\u0010;R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b8\u0010<\u001a\u0004\b0\u0010=¨\u0006>"}, d2 = {"Lf2/lj;", "", "Lf3/m;", "modifier", "Lkotlin/Function0;", "Loq/i0;", "title", "Lq4/b4;", "titleTextStyle", "subtitle", "subtitleTextStyle", "Lf3/c$b;", "titleHorizontalAlignment", "navigationIcon", "Lkotlin/Function1;", "Ld1/p3;", "actions", "Lc5/h;", "expandedHeight", "Ld1/d3;", "contentPadding", "Ld1/c4;", "windowInsets", "Lf2/nr;", "colors", "Lf2/ur;", "scrollBehavior", "<init>", "(Lf3/m;Ler/p;Lq4/b4;Ler/p;Lq4/b4;Lf3/c$b;Ler/p;Ler/q;FLd1/d3;Ld1/c4;Lf2/nr;Lf2/ur;Lfr/k;)V", "a", "Lf3/m;", "e", "()Lf3/m;", "b", "Ler/p;", "j", "()Ler/p;", "c", "Lq4/b4;", "l", "()Lq4/b4;", "d", "h", "i", "f", "Lf3/c$b;", "k", "()Lf3/c$b;", "g", "Ler/q;", "()Ler/q;", "F", "()F", "Ld1/d3;", "()Ld1/d3;", "Ld1/c4;", "m", "()Ld1/c4;", "Lf2/nr;", "()Lf2/nr;", "Lf2/ur;", "()Lf2/ur;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m modifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p<r, Integer, i0> title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextStyle titleTextStyle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p<r, Integer, i0> subtitle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final TextStyle subtitleTextStyle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c.b titleHorizontalAlignment;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p<r, Integer, i0> navigationIcon;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final q<p3, r, Integer, i0> actions;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float expandedHeight;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final d3 contentPadding;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final c4 windowInsets;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final nr colors;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ur scrollBehavior;

    public /* synthetic */ lj(m mVar, p pVar, TextStyle textStyle, p pVar2, TextStyle textStyle2, c.b bVar, p pVar3, q qVar, float f15, d3 d3Var, c4 c4Var, nr nrVar, ur urVar, k kVar) {
        this(mVar, pVar, textStyle, pVar2, textStyle2, bVar, pVar3, qVar, f15, d3Var, c4Var, nrVar, urVar);
    }

    public final q<p3, r, Integer, i0> a() {
        return this.actions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final nr getColors() {
        return this.colors;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d3 getContentPadding() {
        return this.contentPadding;
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
        return this.subtitle;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextStyle getSubtitleTextStyle() {
        return this.subtitleTextStyle;
    }

    public final p<r, Integer, i0> j() {
        return this.title;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final c.b getTitleHorizontalAlignment() {
        return this.titleHorizontalAlignment;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextStyle getTitleTextStyle() {
        return this.titleTextStyle;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final c4 getWindowInsets() {
        return this.windowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private lj(m mVar, p<? super r, ? super Integer, i0> pVar, TextStyle textStyle, p<? super r, ? super Integer, i0> pVar2, TextStyle textStyle2, c.b bVar, p<? super r, ? super Integer, i0> pVar3, q<? super p3, ? super r, ? super Integer, i0> qVar, float f15, d3 d3Var, c4 c4Var, nr nrVar, ur urVar) {
        this.modifier = mVar;
        this.title = pVar;
        this.titleTextStyle = textStyle;
        this.subtitle = pVar2;
        this.subtitleTextStyle = textStyle2;
        this.titleHorizontalAlignment = bVar;
        this.navigationIcon = pVar3;
        this.actions = qVar;
        this.expandedHeight = f15;
        this.contentPadding = d3Var;
        this.windowInsets = c4Var;
        this.colors = nrVar;
        this.scrollBehavior = urVar;
    }
}
