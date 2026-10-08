package p114t0;

import c5.n;
import c5.r;
import er.a;
import fr.t;
import g4.l0;
import p071kotlin.Metadata;
import u0.k2;
import u0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b+\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R:\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R:\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010*\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\b\u0013\u0010C\"\u0004\bD\u0010ER\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lt0/y;", "Lg4/l0;", "Lt0/b0;", "Lu0/k2;", "Lt0/x;", "transition", "Lu0/k2$a;", "Lc5/r;", "Lu0/q;", "sizeAnimation", "Lc5/n;", "offsetAnimation", "slideAnimation", "Lt0/c0;", "enter", "Lt0/e0;", "exit", "Lkotlin/Function0;", "", "isEnabled", "Lt0/j0;", "graphicsLayerBlock", "<init>", "(Lu0/k2;Lu0/k2$a;Lu0/k2$a;Lu0/k2$a;Lt0/c0;Lt0/e0;Ler/a;Lt0/j0;)V", "a", "()Lt0/b0;", "node", "Loq/i0;", "l", "(Lt0/b0;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Lu0/k2;", "getTransition", "()Lu0/k2;", "e", "Lu0/k2$a;", "getSizeAnimation", "()Lu0/k2$a;", "setSizeAnimation", "(Lu0/k2$a;)V", "f", "getOffsetAnimation", "setOffsetAnimation", "g", "getSlideAnimation", "setSlideAnimation", "h", "Lt0/c0;", "getEnter", "()Lt0/c0;", "setEnter", "(Lt0/c0;)V", "i", "Lt0/e0;", "getExit", "()Lt0/e0;", "setExit", "(Lt0/e0;)V", "j", "Ler/a;", "()Ler/a;", "setEnabled", "(Ler/a;)V", "k", "Lt0/j0;", "getGraphicsLayerBlock", "()Lt0/j0;", "setGraphicsLayerBlock", "(Lt0/j0;)V", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class y extends l0<b0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k2<x> transition;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private k2<x>.a<r, q> sizeAnimation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private k2<x>.a<n, q> offsetAnimation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private k2<x>.a<n, q> slideAnimation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private c0 enter;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private e0 exit;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private a<Boolean> isEnabled;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private j0 graphicsLayerBlock;

    public y(k2<x> k2Var, k2<x>.a<r, q> aVar, k2<x>.a<n, q> aVar2, k2<x>.a<n, q> aVar3, c0 c0Var, e0 e0Var, a<Boolean> aVar4, j0 j0Var) {
        this.transition = k2Var;
        this.sizeAnimation = aVar;
        this.offsetAnimation = aVar2;
        this.slideAnimation = aVar3;
        this.enter = c0Var;
        this.exit = e0Var;
        this.isEnabled = aVar4;
        this.graphicsLayerBlock = j0Var;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b0 create() {
        return new b0(this.transition, this.sizeAnimation, this.offsetAnimation, this.slideAnimation, this.enter, this.exit, this.isEnabled, this.graphicsLayerBlock);
    }

    public boolean equals(Object other) {
        if (!(other instanceof y)) {
            return false;
        }
        y yVar = (y) other;
        return t.c(yVar.transition, this.transition) && t.c(yVar.sizeAnimation, this.sizeAnimation) && t.c(yVar.offsetAnimation, this.offsetAnimation) && t.c(yVar.slideAnimation, this.slideAnimation) && t.c(yVar.enter, this.enter) && t.c(yVar.exit, this.exit) && yVar.isEnabled == this.isEnabled && t.c(yVar.graphicsLayerBlock, this.graphicsLayerBlock);
    }

    public int hashCode() {
        int iHashCode = this.transition.hashCode() * 31;
        k2<x>.a<r, q> aVar = this.sizeAnimation;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        k2<x>.a<n, q> aVar2 = this.offsetAnimation;
        int iHashCode3 = (iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        k2<x>.a<n, q> aVar3 = this.slideAnimation;
        return ((((((((iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode()) * 31) + this.isEnabled.hashCode()) * 31) + this.graphicsLayerBlock.hashCode();
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(b0 node) {
        node.y3(this.transition);
        node.w3(this.sizeAnimation);
        node.v3(this.offsetAnimation);
        node.x3(this.slideAnimation);
        node.r3(this.enter);
        node.s3(this.exit);
        node.q3(this.isEnabled);
        node.t3(this.graphicsLayerBlock);
    }
}
