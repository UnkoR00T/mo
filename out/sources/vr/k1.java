package vr;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public interface k1 {

    public static final class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f208057a = new a();

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vr.k1
        public Collection<st.t0> a(st.x1 x1Var, Collection<? extends st.t0> collection, er.l<? super st.x1, ? extends Iterable<? extends st.t0>> lVar, er.l<? super st.t0, oq.i0> lVar2) {
            return collection;
        }
    }

    Collection<st.t0> a(st.x1 x1Var, Collection<? extends st.t0> collection, er.l<? super st.x1, ? extends Iterable<? extends st.t0>> lVar, er.l<? super st.t0, oq.i0> lVar2);
}
