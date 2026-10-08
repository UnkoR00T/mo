package y0;

import a4.k0;
import a4.w0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf3/m;", "Lkotlin/Function1;", "Lm3/e;", "Loq/i0;", "onOpenGesture", "a", "(Lf3/m;Ler/l;)Lf3/m;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l<m3.e, i0> f222566a;

        /* JADX WARN: Multi-variable type inference failed */
        a(er.l<? super m3.e, i0> lVar) {
            this.f222566a = lVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, tq.e<? super i0> eVar) {
            Object objC = r1.a.c(k0Var, this.f222566a, eVar);
            return objC == uq.b.e() ? objC : i0.f148189a;
        }
    }

    public static final f3.m a(f3.m mVar, er.l<? super m3.e, i0> lVar) {
        return w0.c(mVar, l.f222567a, new a(lVar));
    }
}
