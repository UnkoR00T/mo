package p079n1;

import er.l;
import er.p;
import ju.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import s1.r0;
import tq.e;
import tq.j;
import vq.d;
import vq.k;
import w0.g0;
import y0.ContextMenuState;
import y0.i;
import z1.c2;
import z1.p2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0080@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lz1/c2;", "manager", "Lkotlin/Function0;", "Loq/i0;", "content", "d", "(Lz1/c2;Ler/p;Lm2/r;I)V", "Ln1/b4;", "h", "(Lz1/c2;Ltq/e;)Ljava/lang/Object;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f130518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f130519f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a3<b4> f130520g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ c2 f130521h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a3<b4> a3Var, c2 c2Var, e<? super a> eVar) {
            super(2, eVar);
            this.f130520g = a3Var;
            this.f130521h = c2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a3 a3Var;
            Object objE = uq.b.e();
            int i15 = this.f130519f;
            if (i15 == 0) {
                u.b(obj);
                a3<b4> a3Var2 = this.f130520g;
                c2 c2Var = this.f130521h;
                this.f130518e = a3Var2;
                this.f130519f = 1;
                Object objH = x0.h(c2Var, this);
                if (objH == objE) {
                    return objE;
                }
                a3Var = a3Var2;
                obj = objH;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a3Var = (a3) this.f130518e;
                u.b(obj);
            }
            a3Var.setValue(obj);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(this.f130520g, this.f130521h, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f130522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f130523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f130524f;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f130523e = obj;
            this.f130524f |= PKIFailureInfo.systemUnavail;
            return x0.h(null, this);
        }
    }

    public static final void d(final c2 c2Var, p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        int i16;
        final p<? super r, ? super Integer, i0> pVar2;
        r rVarH = rVar.h(1533506138);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(c2Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1533506138, i16, -1, "androidx.compose.foundation.text.CommonContextMenuArea (CommonContextMenuArea.kt:46)");
            }
            if (g0.isNewContextMenuEnabled) {
                rVarH.X(-885604480);
                r0.m(c2Var.R(), pVar, rVarH, i16 & 112, 0);
                rVarH.R();
                pVar2 = pVar;
            } else {
                rVarH.X(-885475365);
                Object objE = rVarH.E();
                r.Companion companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new ContextMenuState(null, 1, null);
                    rVarH.v(objE);
                }
                final ContextMenuState contextMenuState = (ContextMenuState) objE;
                Object objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = Function0.i(j.f191408a, rVarH);
                    rVarH.v(objE2);
                }
                final p0 p0Var = (p0) objE2;
                Object objE3 = rVarH.E();
                if (objE3 == companion.a()) {
                    objE3 = c6.e(b4.b(b4.INSTANCE.a()), null, 2, null);
                    rVarH.v(objE3);
                }
                final a3 a3Var = (a3) objE3;
                Object objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = new er.a() { // from class: n1.u0
                        @Override // er.a
                        public final Object a() {
                            return x0.e(contextMenuState);
                        }
                    };
                    rVarH.v(objE4);
                }
                er.a aVar = (er.a) objE4;
                l<y0.r, i0> lVarK = p2.k(c2Var, contextMenuState, a3Var);
                boolean zY = c2Var.Y();
                boolean zG = rVarH.G(p0Var) | rVarH.G(c2Var);
                Object objE5 = rVarH.E();
                if (zG || objE5 == companion.a()) {
                    objE5 = new er.a() { // from class: n1.v0
                        @Override // er.a
                        public final Object a() {
                            return x0.f(p0Var, a3Var, c2Var);
                        }
                    };
                    rVarH.v(objE5);
                }
                pVar2 = pVar;
                i.i(contextMenuState, aVar, lVarK, null, zY, (er.a) objE5, pVar2, rVarH, ((i16 << 15) & 3670016) | 54, 8);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            pVar2 = pVar;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: n1.w0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x0.g(c2Var, pVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(ContextMenuState contextMenuState) {
        y0.u.a(contextMenuState);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(p0 p0Var, a3 a3Var, c2 c2Var) {
        ju.k.d(p0Var, null, ju.r0.UNDISPATCHED, new a(a3Var, c2Var, null), 1, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(c2 c2Var, p pVar, int i15, r rVar, int i16) {
        d(c2Var, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(c2 c2Var, e<? super b4> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f130524f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f130524f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f130523e;
        Object objE = uq.b.e();
        int i16 = bVar.f130524f;
        if (i16 == 0) {
            u.b(obj);
            bVar.f130522d = c2Var;
            bVar.f130524f = 1;
            if (c2Var.X0(bVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2Var = (c2) bVar.f130522d;
            u.b(obj);
        }
        return b4.b(b4.d(c2Var.x(), c2Var.z(), c2Var.y(), c2Var.A(), c2Var.w()));
    }
}
