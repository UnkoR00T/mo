package p114t0;

import c5.r;
import er.p;
import f3.c;
import fr.t;
import g4.l0;
import oq.i0;
import p071kotlin.Metadata;
import u0.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lt0/w0;", "Lg4/l0;", "Lt0/x0;", "Lu0/j0;", "Lc5/r;", "animationSpec", "Lf3/c;", "alignment", "Lkotlin/Function2;", "Loq/i0;", "finishedListener", "<init>", "(Lu0/j0;Lf3/c;Ler/p;)V", "a", "()Lt0/x0;", "node", "l", "(Lt0/x0;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lu0/j0;", "getAnimationSpec", "()Lu0/j0;", "e", "Lf3/c;", "getAlignment", "()Lf3/c;", "f", "Ler/p;", "getFinishedListener", "()Ler/p;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class w0 extends l0<x0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j0<r> animationSpec;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c alignment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p<r, r, i0> finishedListener;

    /* JADX WARN: Multi-variable type inference failed */
    public w0(j0<r> j0Var, c cVar, p<? super r, ? super r, i0> pVar) {
        this.animationSpec = j0Var;
        this.alignment = cVar;
        this.finishedListener = pVar;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x0 create() {
        return new x0(this.animationSpec, this.alignment, this.finishedListener);
    }

    public boolean equals(Object other) {
        if (!(other instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) other;
        return t.c(w0Var.animationSpec, this.animationSpec) && w0Var.finishedListener == this.finishedListener && t.c(w0Var.alignment, this.alignment);
    }

    public int hashCode() {
        int iHashCode = ((this.animationSpec.hashCode() * 31) + this.alignment.hashCode()) * 31;
        p<r, r, i0> pVar = this.finishedListener;
        return iHashCode + (pVar != null ? pVar.hashCode() : 0);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(x0 node) {
        node.u3(this.animationSpec);
        node.v3(this.finishedListener);
        node.s3(this.alignment);
    }
}
