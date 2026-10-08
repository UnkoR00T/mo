package k10;

import java.util.ArrayList;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00028\u0001*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0017\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJG\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\n2$\u0010\u000f\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0004\b\u0010\u0010\u0011JI\u0010\u0014\u001a\u00020\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2$\u0010\u000f\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0004\b\u0014\u0010\u0011R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lk10/z;", "InputState", "", ip.a.f96137b, "A", "Lk10/k;", "Ll10/i$a;", "isInState", "<init>", "(Ll10/i$a;)V", "Lkotlin/Function1;", "", "condition", "Lk10/m;", "Loq/i0;", "block", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ler/l;Ler/l;)V", "identity", "Lk10/x;", "N", "b", "Ll10/i$a;", "u", "()Ll10/i$a;", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z<InputState extends S, S, A> extends k<InputState, S, A> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l10.i.a<S> isInState;

    public z(l10.i.a<S> aVar) {
        this.isInState = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean M(z zVar, er.l lVar, Object obj) {
        return zVar.u().a(obj) && ((Boolean) lVar.b(obj)).booleanValue();
    }

    public final void L(final er.l<? super InputState, Boolean> condition, er.l<? super m<InputState, S, A>, i0> block) {
        ArrayList<l10.i<InputState, S, A>> arrayListT = t();
        m mVar = new m(new l10.i.a() { // from class: k10.y
            @Override // l10.i.a
            public final boolean a(Object obj) {
                return z.M(this.f107414a, condition, obj);
            }
        });
        block.b(mVar);
        pq.v.D(arrayListT, mVar.t());
    }

    public final void N(er.l<? super InputState, ? extends Object> identity, er.l<? super x<InputState, S, A>, i0> block) {
        ArrayList<l10.i<InputState, S, A>> arrayListT = t();
        x xVar = new x(u(), identity);
        block.b(xVar);
        pq.v.D(arrayListT, xVar.t());
    }

    @Override // k10.k
    public l10.i.a<S> u() {
        return this.isInState;
    }
}
