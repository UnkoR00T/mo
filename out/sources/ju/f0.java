package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lju/f0;", ip.a.f96137b, "Lju/a3;", "b0", "()Lju/f0;", "Ltq/i$b;", "overwritingElement", "Ltq/i;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ltq/i$b;)Ltq/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface f0<S> extends a3<S> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static <S, R> R a(f0<S> f0Var, R r15, er.p<? super R, ? super tq.i.b, ? extends R> pVar) {
            return (R) a3.a.a(f0Var, r15, pVar);
        }

        public static <S, E extends tq.i.b> E b(f0<S> f0Var, tq.i.c<E> cVar) {
            return (E) a3.a.b(f0Var, cVar);
        }

        public static <S> tq.i c(f0<S> f0Var, tq.i.c<?> cVar) {
            return a3.a.c(f0Var, cVar);
        }

        public static <S> tq.i d(f0<S> f0Var, tq.i iVar) {
            return a3.a.d(f0Var, iVar);
        }
    }

    tq.i L(tq.i.b overwritingElement);

    f0<S> b0();
}
