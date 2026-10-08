package w0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0006J'\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lw0/e1;", "Lg4/f1;", "Lf3/m$c;", "Lb1/l;", "interactionSource", "<init>", "(Lb1/l;)V", "Loq/i0;", "p3", "(Ltq/e;)Ljava/lang/Object;", "q3", "r3", "()V", "s3", "La4/o;", "pointerEvent", "La4/q;", "pass", "Lc5/r;", "bounds", "Y", "(La4/o;La4/q;J)V", "Z1", "X2", "r", "Lb1/l;", "Lb1/g;", "s", "Lb1/g;", "hoverInteraction", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e1 extends f3.m.c implements g4.f1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private b1.l interactionSource;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private b1.g hoverInteraction;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f208881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f208882e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f208884g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f208882e = obj;
            this.f208884g |= PKIFailureInfo.systemUnavail;
            return e1.this.p3(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f208885d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f208887f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f208885d = obj;
            this.f208887f |= PKIFailureInfo.systemUnavail;
            return e1.this.q3(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f208888e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f208888e;
            if (i15 == 0) {
                oq.u.b(obj);
                e1 e1Var = e1.this;
                this.f208888e = 1;
                if (e1Var.p3(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return e1.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f208890e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f208890e;
            if (i15 == 0) {
                oq.u.b(obj);
                e1 e1Var = e1.this;
                this.f208890e = 1;
                if (e1Var.q3(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((d) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return e1.this.new d(eVar);
        }
    }

    public e1(b1.l lVar) {
        this.interactionSource = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p3(tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar;
        b1.g gVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f208884g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f208884g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f208882e;
        Object objE = uq.b.e();
        int i16 = aVar.f208884g;
        if (i16 == 0) {
            oq.u.b(obj);
            if (this.hoverInteraction == null) {
                b1.g gVar2 = new b1.g();
                b1.l lVar = this.interactionSource;
                aVar.f208881d = gVar2;
                aVar.f208884g = 1;
                if (lVar.a(gVar2, aVar) == objE) {
                    return objE;
                }
                gVar = gVar2;
            }
            return oq.i0.f148189a;
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gVar = (b1.g) aVar.f208881d;
        oq.u.b(obj);
        this.hoverInteraction = gVar;
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q3(tq.e<? super oq.i0> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f208887f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f208887f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f208885d;
        Object objE = uq.b.e();
        int i16 = bVar.f208887f;
        if (i16 == 0) {
            oq.u.b(obj);
            b1.g gVar = this.hoverInteraction;
            if (gVar != null) {
                b1.h hVar = new b1.h(gVar);
                b1.l lVar = this.interactionSource;
                bVar.f208887f = 1;
                if (lVar.a(hVar, bVar) == objE) {
                    return objE;
                }
            }
            return oq.i0.f148189a;
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oq.u.b(obj);
        this.hoverInteraction = null;
        return oq.i0.f148189a;
    }

    private final void r3() {
        b1.g gVar = this.hoverInteraction;
        if (gVar != null) {
            this.interactionSource.b(new b1.h(gVar));
            this.hoverInteraction = null;
        }
    }

    @Override // f3.m.c
    public void X2() {
        r3();
    }

    @Override // g4.f1
    public void Y(a4.o pointerEvent, a4.q pass, long bounds) {
        if (pass == a4.q.Main) {
            int type = pointerEvent.getType();
            a4.s.Companion companion = a4.s.INSTANCE;
            if (a4.s.o(type, companion.a())) {
                ju.k.d(M2(), null, null, new c(null), 3, null);
            } else if (a4.s.o(type, companion.b())) {
                ju.k.d(M2(), null, null, new d(null), 3, null);
            }
        }
    }

    @Override // g4.f1
    public void Z1() {
        r3();
    }

    public final void s3(b1.l interactionSource) {
        if (fr.t.c(this.interactionSource, interactionSource)) {
            return;
        }
        r3();
        this.interactionSource = interactionSource;
    }
}
