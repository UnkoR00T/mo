package p143z0;

import er.p;
import fr.m0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import u0.l;
import u0.m;
import vq.k;
import w0.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lz0/v2;", "", "value", "Lu0/l;", "animationSpec", "a", "(Lz0/v2;FLu0/l;Ltq/e;)Ljava/lang/Object;", "c", "(Lz0/v2;FLtq/e;)Ljava/lang/Object;", "Lw0/z1;", "scrollPriority", "Loq/i0;", "d", "(Lz0/v2;Lw0/z1;Ltq/e;)Ljava/lang/Object;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e2 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231229d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f231230e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f231231f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231230e = obj;
            this.f231231f |= PKIFailureInfo.systemUnavail;
            return e2.a(null, 0.0f, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz0/h2;", "Loq/i0;", "<anonymous>", "(Lz0/h2;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements p<h2, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231232e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231233f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f231234g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ l<Float> f231235h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ m0 f231236j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f15, l<Float> lVar, m0 m0Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f231234g = f15;
            this.f231235h = lVar;
            this.f231236j = m0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(m0 m0Var, h2 h2Var, float f15, float f16) {
            float f17 = m0Var.f66406a;
            m0Var.f66406a = f17 + h2Var.d(f15 - f17);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231232e;
            if (i15 == 0) {
                u.b(obj);
                final h2 h2Var = (h2) this.f231233f;
                float f15 = this.f231234g;
                l<Float> lVar = this.f231235h;
                final m0 m0Var = this.f231236j;
                p pVar = new p() { // from class: z0.f2
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return e2.b.O(m0Var, h2Var, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                    }
                };
                this.f231232e = 1;
                if (u0.e2.m(0.0f, f15, 0.0f, lVar, pVar, this, 4, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(h2 h2Var, tq.e<? super i0> eVar) {
            return ((b) v(h2Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f231234g, this.f231235h, this.f231236j, eVar);
            bVar.f231233f = obj;
            return bVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f231238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f231239f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231238e = obj;
            this.f231239f |= PKIFailureInfo.systemUnavail;
            return e2.c(null, 0.0f, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz0/h2;", "Loq/i0;", "<anonymous>", "(Lz0/h2;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends k implements p<h2, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231241f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ m0 f231242g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f231243h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m0 m0Var, float f15, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f231242g = m0Var;
            this.f231243h = f15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f231240e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            h2 h2Var = (h2) this.f231241f;
            this.f231242g.f66406a = h2Var.d(this.f231243h);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(h2 h2Var, tq.e<? super i0> eVar) {
            return ((d) v(h2Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = new d(this.f231242g, this.f231243h, eVar);
            dVar.f231241f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz0/h2;", "Loq/i0;", "<anonymous>", "(Lz0/h2;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends k implements p<h2, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231244e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f231244e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(h2 h2Var, tq.e<? super i0> eVar) {
            return ((e) v(h2Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new e(eVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object a(v2 v2Var, float f15, l<Float> lVar, tq.e<? super Float> eVar) throws Throwable {
        a aVar;
        m0 m0Var;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f231231f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f231231f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f231230e;
        Object objE = uq.b.e();
        int i16 = aVar2.f231231f;
        if (i16 == 0) {
            u.b(obj);
            m0 m0Var2 = new m0();
            b bVar = new b(f15, lVar, m0Var2, null);
            aVar2.f231229d = m0Var2;
            aVar2.f231231f = 1;
            if (v2.a(v2Var, null, bVar, aVar2, 1, null) == objE) {
                return objE;
            }
            m0Var = m0Var2;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m0Var = (m0) aVar2.f231229d;
            u.b(obj);
        }
        return vq.b.d(m0Var.f66406a);
    }

    public static /* synthetic */ Object b(v2 v2Var, float f15, l lVar, tq.e eVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            lVar = m.j(0.0f, 0.0f, null, 7, null);
        }
        return a(v2Var, f15, lVar, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object c(v2 v2Var, float f15, tq.e<? super Float> eVar) throws Throwable {
        c cVar;
        m0 m0Var;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f231239f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f231239f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f231238e;
        Object objE = uq.b.e();
        int i16 = cVar2.f231239f;
        if (i16 == 0) {
            u.b(obj);
            m0 m0Var2 = new m0();
            d dVar = new d(m0Var2, f15, null);
            cVar2.f231237d = m0Var2;
            cVar2.f231239f = 1;
            if (v2.a(v2Var, null, dVar, cVar2, 1, null) == objE) {
                return objE;
            }
            m0Var = m0Var2;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m0Var = (m0) cVar2.f231237d;
            u.b(obj);
        }
        return vq.b.d(m0Var.f66406a);
    }

    public static final Object d(v2 v2Var, z1 z1Var, tq.e<? super i0> eVar) {
        Object objB = v2Var.b(z1Var, new e(null), eVar);
        return objB == uq.b.e() ? objB : i0.f148189a;
    }

    public static /* synthetic */ Object e(v2 v2Var, z1 z1Var, tq.e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z1Var = z1.Default;
        }
        return d(v2Var, z1Var, eVar);
    }
}
