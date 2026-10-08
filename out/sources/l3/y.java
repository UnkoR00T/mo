package l3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf3/m;", "Lkotlin/Function1;", "Ll3/v;", "Loq/i0;", "scope", "a", "(Lf3/m;Ler/l;)Lf3/m;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class y {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements c0, fr.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ er.l f115666a;

        a(er.l lVar) {
            this.f115666a = lVar;
        }

        @Override // l3.c0
        public final /* synthetic */ void a(v vVar) {
            this.f115666a.b(vVar);
        }

        @Override // fr.n
        public final oq.e<?> b() {
            return this.f115666a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof c0) && (obj instanceof fr.n)) {
                return fr.t.c(b(), ((fr.n) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public static final f3.m a(f3.m mVar, er.l<? super v, oq.i0> lVar) {
        return mVar.u(new FocusPropertiesElement(new a(lVar)));
    }
}
