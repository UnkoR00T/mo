package y4;

import android.graphics.Typeface;
import p071kotlin.Metadata;
import p076m2.f6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0017\u0010\u000f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0014¨\u0006\u0016"}, d2 = {"Ly4/u;", "", "Lm2/f6;", "resolveResult", "next", "<init>", "(Lm2/f6;Ly4/u;)V", "a", "Lm2/f6;", "b", "Ly4/u;", "c", "Ljava/lang/Object;", "getInitial", "()Ljava/lang/Object;", "initial", "Landroid/graphics/Typeface;", "()Landroid/graphics/Typeface;", "typeface", "", "()Z", "isStaleResolvedFont", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f6<Object> resolveResult;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u next;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object initial;

    public u(f6<? extends Object> f6Var, u uVar) {
        this.resolveResult = f6Var;
        this.next = uVar;
        this.initial = f6Var.getValue();
    }

    public final Typeface a() {
        return (Typeface) this.initial;
    }

    public final boolean b() {
        if (this.resolveResult.getValue() != this.initial) {
            return true;
        }
        u uVar = this.next;
        return uVar != null && uVar.b();
    }
}
