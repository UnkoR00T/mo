package p046f2;

import b1.d;
import b1.g;
import b1.i;
import b1.j;
import b1.n;
import er.p;
import java.util.ArrayList;
import java.util.List;
import ju.p0;
import mu.h;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.f6;
import p076m2.r;
import p076m2.t;
import pq.v;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lf2/gc;", "", "Lc5/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "<init>", "(FFFFLfr/k;)V", "Lb1/j;", "interactionSource", "Lm2/f6;", "e", "(Lb1/j;Lm2/r;I)Lm2/f6;", "f", "g", "()F", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "b", "c", "d", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float pressedElevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float hoveredElevation;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f55941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ hc f55942f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ gc f55943g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(hc hcVar, gc gcVar, e<? super a> eVar) {
            super(2, eVar);
            this.f55942f = hcVar;
            this.f55943g = gcVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f55941e;
            if (i15 == 0) {
                u.b(obj);
                hc hcVar = this.f55942f;
                float f15 = this.f55943g.defaultElevation;
                float f16 = this.f55943g.pressedElevation;
                float f17 = this.f55943g.hoveredElevation;
                float f18 = this.f55943g.focusedElevation;
                this.f55941e = 1;
                if (hcVar.f(f15, f16, f17, f18, this) == objE) {
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
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(this.f55942f, this.f55943g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f55944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f55945f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j f55946g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ hc f55947h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<i> f55948a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p0 f55949b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ hc f55950c;

            /* JADX INFO: renamed from: f2.gc$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class C1303a extends k implements p<p0, e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f55951e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ hc f55952f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ i f55953g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1303a(hc hcVar, i iVar, e<? super C1303a> eVar) {
                    super(2, eVar);
                    this.f55952f = hcVar;
                    this.f55953g = iVar;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f55951e;
                    if (i15 == 0) {
                        u.b(obj);
                        hc hcVar = this.f55952f;
                        i iVar = this.f55953g;
                        this.f55951e = 1;
                        if (hcVar.b(iVar, this) == objE) {
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
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(p0 p0Var, e<? super i0> eVar) {
                    return ((C1303a) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final e<i0> v(Object obj, e<?> eVar) {
                    return new C1303a(this.f55952f, this.f55953g, eVar);
                }
            }

            a(List<i> list, p0 p0Var, hc hcVar) {
                this.f55948a = list;
                this.f55949b = p0Var;
                this.f55950c = hcVar;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(i iVar, e<? super i0> eVar) {
                if (iVar instanceof g) {
                    this.f55948a.add(iVar);
                } else if (iVar instanceof b1.h) {
                    this.f55948a.remove(((b1.h) iVar).getEnter());
                } else if (iVar instanceof d) {
                    this.f55948a.add(iVar);
                } else if (iVar instanceof b1.e) {
                    this.f55948a.remove(((b1.e) iVar).getFocus());
                } else if (iVar instanceof n.b) {
                    this.f55948a.add(iVar);
                } else if (iVar instanceof n.c) {
                    this.f55948a.remove(((n.c) iVar).getPress());
                } else if (iVar instanceof n.a) {
                    this.f55948a.remove(((n.a) iVar).getPress());
                }
                ju.k.d(this.f55949b, null, null, new C1303a(this.f55950c, (i) v.z0(this.f55948a), null), 3, null);
                return i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j jVar, hc hcVar, e<? super b> eVar) {
            super(2, eVar);
            this.f55946g = jVar;
            this.f55947h = hcVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f55944e;
            if (i15 == 0) {
                u.b(obj);
                p0 p0Var = (p0) this.f55945f;
                ArrayList arrayList = new ArrayList();
                mu.g<i> gVarC = this.f55946g.c();
                a aVar = new a(arrayList, p0Var, this.f55947h);
                this.f55944e = 1;
                if (gVarC.a(aVar, this) == objE) {
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
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            b bVar = new b(this.f55946g, this.f55947h, eVar);
            bVar.f55945f = obj;
            return bVar;
        }
    }

    public /* synthetic */ gc(float f15, float f16, float f17, float f18, fr.k kVar) {
        this(f15, f16, f17, f18);
    }

    private final f6<c5.h> e(j jVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1845106002, i15, -1, "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:1298)");
        }
        int i16 = i15 & 14;
        int i17 = i16 ^ 6;
        boolean z15 = (i17 > 4 && rVar.W(jVar)) || (i15 & 6) == 4;
        Object objE = rVar.E();
        if (z15 || objE == r.INSTANCE.a()) {
            Object hcVar = new hc(this.defaultElevation, this.pressedElevation, this.hoveredElevation, this.focusedElevation, null);
            rVar.v(hcVar);
            objE = hcVar;
        }
        hc hcVar2 = (hc) objE;
        boolean zG = rVar.G(hcVar2) | ((((i15 & 112) ^ 48) > 32 && rVar.W(this)) || (i15 & 48) == 32);
        Object objE2 = rVar.E();
        if (zG || objE2 == r.INSTANCE.a()) {
            objE2 = new a(hcVar2, this, null);
            rVar.v(objE2);
        }
        Function0.d(this, (p) objE2, rVar, (i15 >> 3) & 14);
        boolean zG2 = rVar.G(hcVar2) | ((i17 > 4 && rVar.W(jVar)) || (i15 & 6) == 4);
        Object objE3 = rVar.E();
        if (zG2 || objE3 == r.INSTANCE.a()) {
            objE3 = new b(jVar, hcVar2, null);
            rVar.v(objE3);
        }
        Function0.d(jVar, (p) objE3, rVar, i16);
        f6<c5.h> f6VarC = hcVar2.c();
        if (t.k()) {
            t.n();
        }
        return f6VarC;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) other;
        if (c5.h.p(this.defaultElevation, gcVar.defaultElevation) && c5.h.p(this.pressedElevation, gcVar.pressedElevation) && c5.h.p(this.focusedElevation, gcVar.focusedElevation)) {
            return c5.h.p(this.hoveredElevation, gcVar.hoveredElevation);
        }
        return false;
    }

    public final f6<c5.h> f(j jVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-424810125, i15, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:1289)");
        }
        f6<c5.h> f6VarE = e(jVar, rVar, i15 & 126);
        if (t.k()) {
            t.n();
        }
        return f6VarE;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getDefaultElevation() {
        return this.defaultElevation;
    }

    public int hashCode() {
        return (((((c5.h.q(this.defaultElevation) * 31) + c5.h.q(this.pressedElevation)) * 31) + c5.h.q(this.focusedElevation)) * 31) + c5.h.q(this.hoveredElevation);
    }

    private gc(float f15, float f16, float f17, float f18) {
        this.defaultElevation = f15;
        this.pressedElevation = f16;
        this.focusedElevation = f17;
        this.hoveredElevation = f18;
    }
}
