package z9;

import androidx.compose.ui.platform.u1;
import c3.SnapshotStateList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r0;
import p076m2.s0;
import p076m2.x5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u0012²\u0006\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lz9/n;", "dialogNavigator", "Loq/i0;", "f", "(Lz9/n;Lm2/r;I)V", "", "Ly9/w;", "", "backStack", "k", "(Ljava/util/List;Ljava/util/Collection;Lm2/r;I)V", "Lc3/f0;", "p", "(Ljava/util/Collection;Lm2/r;I)Lc3/f0;", "", "dialogBackStack", "", "transitionInProgress", "navigation-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class m {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements er.p<p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p136y9.w f233541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f233542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b3.i f233543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<p136y9.w> f233544d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n.b f233545e;

        /* JADX INFO: renamed from: z9.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C6286a implements er.p<p076m2.r, Integer, oq.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n.b f233546a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p136y9.w f233547b;

            C6286a(n.b bVar, p136y9.w wVar) {
                this.f233546a = bVar;
                this.f233547b = wVar;
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ oq.i0 B(p076m2.r rVar, Integer num) {
                c(rVar, num.intValue());
                return oq.i0.f148189a;
            }

            public final void c(p076m2.r rVar, int i15) {
                if ((i15 & 3) == 2 && rVar.i()) {
                    rVar.O();
                    return;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-497631156, i15, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:66)");
                }
                this.f233546a.L().w(this.f233547b, rVar, 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"z9/m$a$b", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b implements r0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f233548a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p136y9.w f233549b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList f233550c;

            public b(n nVar, p136y9.w wVar, SnapshotStateList snapshotStateList) {
                this.f233548a = nVar;
                this.f233549b = wVar;
                this.f233550c = snapshotStateList;
            }

            @Override // p076m2.r0
            public void j() {
                this.f233548a.t(this.f233549b);
                this.f233550c.remove(this.f233549b);
            }
        }

        a(p136y9.w wVar, n nVar, b3.i iVar, SnapshotStateList<p136y9.w> snapshotStateList, n.b bVar) {
            this.f233541a = wVar;
            this.f233542b = nVar;
            this.f233543c = iVar;
            this.f233544d = snapshotStateList;
            this.f233545e = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r0 f(SnapshotStateList snapshotStateList, p136y9.w wVar, n nVar, s0 s0Var) {
            snapshotStateList.add(wVar);
            return new b(nVar, wVar, snapshotStateList);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ oq.i0 B(p076m2.r rVar, Integer num) {
            e(rVar, num.intValue());
            return oq.i0.f148189a;
        }

        public final void e(p076m2.r rVar, int i15) {
            if ((i15 & 3) == 2 && rVar.i()) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1129586364, i15, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)");
            }
            p136y9.w wVar = this.f233541a;
            boolean zG = rVar.G(wVar) | rVar.G(this.f233542b);
            final SnapshotStateList<p136y9.w> snapshotStateList = this.f233544d;
            final p136y9.w wVar2 = this.f233541a;
            final n nVar = this.f233542b;
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: z9.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m.a.f(snapshotStateList, wVar2, nVar, (s0) obj);
                    }
                };
                rVar.v(objE);
            }
            Function0.a(wVar, (er.l) objE, rVar, 0);
            p136y9.w wVar3 = this.f233541a;
            s.d(wVar3, this.f233543c, y2.m.d(-497631156, true, new C6286a(this.f233545e, wVar3), rVar, 54), rVar, MLKEMEngine.KyberPolyBytes);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233551e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f6<Set<p136y9.w>> f233552f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f233553g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<p136y9.w> f233554h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(f6<? extends Set<p136y9.w>> f6Var, n nVar, SnapshotStateList<p136y9.w> snapshotStateList, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f233552f = f6Var;
            this.f233553g = nVar;
            this.f233554h = snapshotStateList;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f233551e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Set<p136y9.w> setH = m.h(this.f233552f);
            n nVar = this.f233553g;
            SnapshotStateList<p136y9.w> snapshotStateList = this.f233554h;
            for (p136y9.w wVar : setH) {
                if (!nVar.r().getValue().contains(wVar) && !snapshotStateList.contains(wVar)) {
                    nVar.t(wVar);
                }
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f233552f, this.f233553g, this.f233554h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"z9/m$c", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p136y9.w f233555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.n f233556b;

        public c(p136y9.w wVar, androidx.p016lifecycle.n nVar) {
            this.f233555a = wVar;
            this.f233556b = nVar;
        }

        @Override // p076m2.r0
        public void j() {
            this.f233555a.getLifecycleRegistry().d(this.f233556b);
        }
    }

    public static final void f(final n nVar, p076m2.r rVar, final int i15) {
        final n nVar2;
        p076m2.r rVarH = rVar.h(294589392);
        int i16 = (i15 & 6) == 0 ? (rVarH.G(nVar) ? 4 : 2) | i15 : i15;
        if ((i16 & 3) == 2 && rVarH.i()) {
            rVarH.O();
            nVar2 = nVar;
        } else {
            if (p076m2.t.k()) {
                p076m2.t.o(294589392, i16, -1, "androidx.navigation.compose.DialogHost (DialogHost.kt:40)");
            }
            b3.i iVarB = b3.q.b(rVarH, 0);
            f6 f6VarB = x5.b(nVar.r(), null, rVarH, 0, 1);
            SnapshotStateList<p136y9.w> snapshotStateListP = p(g(f6VarB), rVarH, 0);
            k(snapshotStateListP, g(f6VarB), rVarH, 0);
            f6 f6VarB2 = x5.b(nVar.s(), null, rVarH, 0, 1);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = x5.f();
                rVarH.v(objE);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objE;
            rVarH.X(-367418626);
            for (final p136y9.w wVar : snapshotStateListP) {
                n.b bVar = (n.b) wVar.getDestination();
                boolean zG = rVarH.G(nVar) | rVarH.G(wVar);
                Object objE2 = rVarH.E();
                if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new er.a() { // from class: z9.g
                        @Override // er.a
                        public final Object a() {
                            return m.i(nVar, wVar);
                        }
                    };
                    rVarH.v(objE2);
                }
                n nVar3 = nVar;
                androidx.compose.ui.window.a.a((er.a) objE2, bVar.getDialogProperties(), y2.m.d(1129586364, true, new a(wVar, nVar3, iVarB, snapshotStateList, bVar), rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 0);
                nVar = nVar3;
            }
            nVar2 = nVar;
            rVarH.R();
            Set<p136y9.w> setH = h(f6VarB2);
            boolean zW = rVarH.W(f6VarB2) | rVarH.G(nVar2);
            Object objE3 = rVarH.E();
            if (zW || objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = new b(f6VarB2, nVar2, snapshotStateList, null);
                rVarH.v(objE3);
            }
            Function0.e(setH, snapshotStateList, (er.p) objE3, rVarH, 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: z9.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.j(nVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final List<p136y9.w> g(f6<? extends List<p136y9.w>> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<p136y9.w> h(f6<? extends Set<p136y9.w>> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(n nVar, p136y9.w wVar) {
        nVar.q(wVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(n nVar, int i15, p076m2.r rVar, int i16) {
        f(nVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void k(final List<p136y9.w> list, final Collection<p136y9.w> collection, p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(1537894851);
        int i16 = (i15 & 6) == 0 ? (rVarH.G(list) ? 4 : 2) | i15 : i15;
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(collection) ? 32 : 16;
        }
        if ((i16 & 19) == 18 && rVarH.i()) {
            rVarH.O();
        } else {
            if (p076m2.t.k()) {
                p076m2.t.o(1537894851, i16, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:88)");
            }
            final boolean zBooleanValue = ((Boolean) rVarH.N(u1.a())).booleanValue();
            for (final p136y9.w wVar : collection) {
                androidx.p016lifecycle.j lifecycleRegistry = wVar.getLifecycleRegistry();
                boolean zA = rVarH.a(zBooleanValue) | rVarH.G(list) | rVarH.G(wVar);
                Object objE = rVarH.E();
                if (zA || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: z9.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return m.l(wVar, zBooleanValue, list, (s0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                Function0.a(lifecycleRegistry, (er.l) objE, rVarH, 0);
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: z9.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.n(list, collection, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 l(final p136y9.w wVar, final boolean z15, final List list, s0 s0Var) {
        androidx.p016lifecycle.n nVar = new androidx.p016lifecycle.n() { // from class: z9.k
            @Override // androidx.p016lifecycle.n
            public final void m(androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
                m.m(z15, list, wVar, qVar, aVar);
            }
        };
        wVar.getLifecycleRegistry().a(nVar);
        return new c(wVar, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(boolean z15, List list, p136y9.w wVar, androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
        if (z15 && !list.contains(wVar)) {
            list.add(wVar);
        }
        if (aVar == androidx.lifecycle.j.a.ON_START && !list.contains(wVar)) {
            list.add(wVar);
        }
        if (aVar == androidx.lifecycle.j.a.ON_STOP) {
            list.remove(wVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(List list, Collection collection, int i15, p076m2.r rVar, int i16) {
        k(list, collection, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final SnapshotStateList<p136y9.w> p(Collection<p136y9.w> collection, p076m2.r rVar, int i15) {
        Object obj;
        if (p076m2.t.k()) {
            p076m2.t.o(467378629, i15, -1, "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:119)");
        }
        boolean zBooleanValue = ((Boolean) rVar.N(u1.a())).booleanValue();
        boolean zW = rVar.W(collection);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            obj = objE;
            SnapshotStateList snapshotStateListF = x5.f();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : collection) {
                if (zBooleanValue ? true : ((p136y9.w) obj2).getLifecycleRegistry().getState().e(androidx.lifecycle.j.b.STARTED)) {
                    arrayList.add(obj2);
                }
            }
            snapshotStateListF.addAll(arrayList);
            rVar.v(snapshotStateListF);
            obj = snapshotStateListF;
        }
        obj = objE;
        SnapshotStateList<p136y9.w> snapshotStateList = (SnapshotStateList) obj;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return snapshotStateList;
    }
}
