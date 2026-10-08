package k3;

import n3.x1;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010(\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0011\u0010+\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b\f\u0010*R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00102¨\u00066"}, d2 = {"Lk3/e;", "Lc5/d;", "<init>", "()V", "Lkotlin/Function1;", "Lp3/c;", "Loq/i0;", "block", "Lk3/l;", "e", "(Ler/l;)Lk3/l;", "Lk3/b;", "a", "Lk3/b;", "getCacheParams$ui", "()Lk3/b;", "h", "(Lk3/b;)V", "cacheParams", "b", "Lk3/l;", "c", "()Lk3/l;", "k", "(Lk3/l;)V", "drawResult", "Lp3/c;", "getContentDrawScope$ui", "()Lp3/c;", "i", "(Lp3/c;)V", "contentDrawScope", "Lkotlin/Function0;", "Ln3/x1;", "d", "Ler/a;", "getGraphicsContextProvider$ui", "()Ler/a;", "n", "(Ler/a;)V", "graphicsContextProvider", "Lm3/k;", "()J", "size", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "layoutDirection", "", "getDensity", "()F", "density", "i2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements c5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private b cacheParams = p.f107752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private l drawResult;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private p3.c contentDrawScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private er.a<? extends x1> graphicsContextProvider;

    public final long a() {
        return this.cacheParams.a();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final l getDrawResult() {
        return this.drawResult;
    }

    public final l e(er.l<? super p3.c, i0> block) {
        l lVar = new l(block);
        this.drawResult = lVar;
        return lVar;
    }

    @Override // c5.d
    /* JADX INFO: renamed from: getDensity */
    public float get_density() {
        return this.cacheParams.getDensity().get_density();
    }

    public final c5.t getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    public final void h(b bVar) {
        this.cacheParams = bVar;
    }

    public final void i(p3.c cVar) {
        this.contentDrawScope = cVar;
    }

    @Override // c5.l
    /* JADX INFO: renamed from: i2 */
    public float get_fontScale() {
        return this.cacheParams.getDensity().get_fontScale();
    }

    public final void k(l lVar) {
        this.drawResult = lVar;
    }

    public final void n(er.a<? extends x1> aVar) {
        this.graphicsContextProvider = aVar;
    }
}
