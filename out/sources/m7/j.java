package m7;

import fr.p0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.r0;
import p076m2.s0;
import p076m2.t;
import p076m2.x5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\u0010\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a3\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016²\u0006\u0012\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/lifecycle/j$a;", "event", "Landroidx/lifecycle/q;", "lifecycleOwner", "Lkotlin/Function0;", "Loq/i0;", "onEvent", "h", "(Landroidx/lifecycle/j$a;Landroidx/lifecycle/q;Ler/a;Lm2/r;II)V", "", "key1", "key2", "Lkotlin/Function1;", "Lm7/k;", "Lm7/l;", "effects", "m", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/q;Ler/l;Lm2/r;II)V", "scope", "o", "(Landroidx/lifecycle/q;Lm7/k;Ler/l;Lm2/r;I)V", "currentOnEvent", "lifecycle-runtime-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"m7/j$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.q f123999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.n f124000b;

        public a(androidx.p016lifecycle.q qVar, androidx.p016lifecycle.n nVar) {
            this.f123999a = qVar;
            this.f124000b = nVar;
        }

        @Override // p076m2.r0
        public void j() {
            this.f123999a.getLifecycleRegistry().d(this.f124000b);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"m7/j$b", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.q f124001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.n f124002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p0 f124003c;

        public b(androidx.p016lifecycle.q qVar, androidx.p016lifecycle.n nVar, p0 p0Var) {
            this.f124001a = qVar;
            this.f124002b = nVar;
            this.f124003c = p0Var;
        }

        @Override // p076m2.r0
        public void j() {
            this.f124001a.getLifecycleRegistry().d(this.f124002b);
            l lVar = (l) this.f124003c.f66410a;
            if (lVar != null) {
                lVar.a();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f124004a;

        static {
            int[] iArr = new int[androidx.lifecycle.j.a.values().length];
            try {
                iArr[androidx.lifecycle.j.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.j.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.lifecycle.j.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.lifecycle.j.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f124004a = iArr;
        }
    }

    public static final void h(final androidx.lifecycle.j.a aVar, final androidx.p016lifecycle.q qVar, final er.a<i0> aVar2, r rVar, final int i15, final int i16) {
        int i17;
        r rVarH = rVar.h(-709389590);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.c(aVar.ordinal()) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= ((i16 & 2) == 0 && rVarH.G(qVar)) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(aVar2) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0 && !rVarH.Q()) {
                rVarH.O();
                if ((i16 & 2) != 0) {
                    i17 &= -113;
                }
            } else if ((i16 & 2) != 0) {
                qVar = (androidx.p016lifecycle.q) rVarH.N(n.c());
                i17 &= -113;
            }
            rVarH.y();
            if (t.k()) {
                t.o(-709389590, i17, -1, "androidx.lifecycle.compose.LifecycleEventEffect (LifecycleEffect.kt:55)");
            }
            if (aVar == androidx.lifecycle.j.a.ON_DESTROY) {
                throw new IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
            }
            final f6 f6VarP = x5.p(aVar2, rVarH, (i17 >> 6) & 14);
            boolean zW = rVarH.W(f6VarP) | ((i17 & 14) == 4) | rVarH.G(qVar);
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: m7.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j.j(qVar, aVar, f6VarP, (s0) obj);
                    }
                };
                rVarH.v(objE);
            }
            Function0.a(qVar, (er.l) objE, rVarH, (i17 >> 3) & 14);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        final androidx.p016lifecycle.q qVar2 = qVar;
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m7.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.l(aVar, qVar2, aVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final er.a<i0> i(f6<? extends er.a<i0>> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 j(androidx.p016lifecycle.q qVar, final androidx.lifecycle.j.a aVar, final f6 f6Var, s0 s0Var) {
        androidx.p016lifecycle.n nVar = new androidx.p016lifecycle.n() { // from class: m7.e
            @Override // androidx.p016lifecycle.n
            public final void m(androidx.p016lifecycle.q qVar2, androidx.lifecycle.j.a aVar2) {
                j.k(aVar, f6Var, qVar2, aVar2);
            }
        };
        qVar.getLifecycleRegistry().a(nVar);
        return new a(qVar, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(androidx.lifecycle.j.a aVar, f6 f6Var, androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar2) {
        if (aVar2 == aVar) {
            i(f6Var).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(androidx.lifecycle.j.a aVar, androidx.p016lifecycle.q qVar, er.a aVar2, int i15, int i16, r rVar, int i17) {
        h(aVar, qVar, aVar2, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final void m(final Object obj, final Object obj2, androidx.p016lifecycle.q qVar, final er.l<? super k, ? extends l> lVar, r rVar, final int i15, final int i16) {
        int i17;
        r rVarH = rVar.h(696924721);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(obj) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(obj2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= ((i16 & 4) == 0 && rVarH.G(qVar)) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.G(lVar) ? 2048 : 1024;
        }
        if (rVarH.r((i17 & 1171) != 1170, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0 && !rVarH.Q()) {
                rVarH.O();
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                }
            } else if ((i16 & 4) != 0) {
                qVar = (androidx.p016lifecycle.q) rVarH.N(n.c());
                i17 &= -897;
            }
            rVarH.y();
            if (t.k()) {
                t.o(696924721, i17, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:187)");
            }
            boolean zW = rVarH.W(obj) | rVarH.W(obj2) | rVarH.W(qVar);
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new k(qVar.getLifecycleRegistry());
                rVarH.v(objE);
            }
            o(qVar, (k) objE, lVar, rVarH, ((i17 >> 6) & 14) | ((i17 >> 3) & 896));
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        final androidx.p016lifecycle.q qVar2 = qVar;
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m7.f
                @Override // er.p
                public final Object B(Object obj3, Object obj4) {
                    return j.n(obj, obj2, qVar2, lVar, i15, i16, (r) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(Object obj, Object obj2, androidx.p016lifecycle.q qVar, er.l lVar, int i15, int i16, r rVar, int i17) {
        m(obj, obj2, qVar, lVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void o(final androidx.p016lifecycle.q qVar, final k kVar, final er.l<? super k, ? extends l> lVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(228371534);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(qVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(kVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(lVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(228371534, i16, -1, "androidx.lifecycle.compose.LifecycleStartEffectImpl (LifecycleEffect.kt:340)");
            }
            boolean zG = rVarH.G(kVar) | ((i16 & 896) == 256) | rVarH.G(qVar);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: m7.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j.p(qVar, kVar, lVar, (s0) obj);
                    }
                };
                rVarH.v(objE);
            }
            Function0.b(qVar, kVar, (er.l) objE, rVarH, i16 & 126);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m7.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.r(qVar, kVar, lVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 p(androidx.p016lifecycle.q qVar, final k kVar, final er.l lVar, s0 s0Var) {
        final p0 p0Var = new p0();
        androidx.p016lifecycle.n nVar = new androidx.p016lifecycle.n() { // from class: m7.i
            @Override // androidx.p016lifecycle.n
            public final void m(androidx.p016lifecycle.q qVar2, androidx.lifecycle.j.a aVar) {
                j.q(kVar, p0Var, lVar, qVar2, aVar);
            }
        };
        qVar.getLifecycleRegistry().a(nVar);
        return new b(qVar, nVar, p0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static final void q(k kVar, p0 p0Var, er.l lVar, androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
        int i15 = c.f124004a[aVar.ordinal()];
        if (i15 == 1) {
            p0Var.f66410a = lVar.b(kVar);
        } else {
            if (i15 != 2) {
                return;
            }
            l lVar2 = (l) p0Var.f66410a;
            if (lVar2 != null) {
                lVar2.a();
            }
            p0Var.f66410a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(androidx.p016lifecycle.q qVar, k kVar, er.l lVar, int i15, r rVar, int i16) {
        o(qVar, kVar, lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
