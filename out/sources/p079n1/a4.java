package p079n1;

import a4.PointerInputChange;
import a4.c;
import a4.k0;
import er.l;
import er.p;
import ju.d2;
import ju.p0;
import ju.q0;
import ju.r0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import p143z0.g1;
import tq.e;
import vq.i;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"La4/k0;", "Ln1/l4;", "observer", "Loq/i0;", "g", "(La4/k0;Ln1/l4;Ltq/e;)Ljava/lang/Object;", "m", "h", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a4 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lju/d2;", "<anonymous>", "(Lju/p0;)Lju/d2;"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, e<? super d2>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f129887f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k0 f129888g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ l4 f129889h;

        /* JADX INFO: renamed from: n1.a4$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class C3235a extends k implements p<p0, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f129890e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ k0 f129891f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ l4 f129892g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C3235a(k0 k0Var, l4 l4Var, e<? super C3235a> eVar) {
                super(2, eVar);
                this.f129891f = k0Var;
                this.f129892g = l4Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f129890e;
                if (i15 == 0) {
                    u.b(obj);
                    k0 k0Var = this.f129891f;
                    l4 l4Var = this.f129892g;
                    this.f129890e = 1;
                    if (a4.m(k0Var, l4Var, this) == objE) {
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
                return ((C3235a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                return new C3235a(this.f129891f, this.f129892g, eVar);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class b extends k implements p<p0, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f129893e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ k0 f129894f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ l4 f129895g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(k0 k0Var, l4 l4Var, e<? super b> eVar) {
                super(2, eVar);
                this.f129894f = k0Var;
                this.f129895g = l4Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f129893e;
                if (i15 == 0) {
                    u.b(obj);
                    k0 k0Var = this.f129894f;
                    l4 l4Var = this.f129895g;
                    this.f129893e = 1;
                    if (a4.h(k0Var, l4Var, this) == objE) {
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
                return new b(this.f129894f, this.f129895g, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k0 k0Var, l4 l4Var, e<? super a> eVar) {
            super(2, eVar);
            this.f129888g = k0Var;
            this.f129889h = l4Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f129886e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            p0 p0Var = (p0) this.f129887f;
            r0 r0Var = r0.UNDISPATCHED;
            ju.k.d(p0Var, null, r0Var, new C3235a(this.f129888g, this.f129889h, null), 1, null);
            return ju.k.d(p0Var, null, r0Var, new b(this.f129888g, this.f129889h, null), 1, null);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super d2> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            a aVar = new a(this.f129888g, this.f129889h, eVar);
            aVar.f129887f = obj;
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Loq/i0;", "<anonymous>", "(La4/c;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends i implements p<c, e<? super i0>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f129896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f129897d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f129898e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ l4 f129899f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l4 l4Var, e<? super b> eVar) {
            super(2, eVar);
            this.f129899f = l4Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            if (r14 == r0) goto L17;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005d -> B:18:0x0060). Please report as a decompilation issue!!! */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r13.f129897d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r13.f129896c
                a4.b0 r1 = (a4.PointerInputChange) r1
                java.lang.Object r4 = r13.f129898e
                a4.c r4 = (a4.c) r4
                oq.u.b(r14)
                r7 = r13
                goto L60
            L1b:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L23:
                java.lang.Object r1 = r13.f129898e
                a4.c r1 = (a4.c) r1
                oq.u.b(r14)
                r7 = r13
                goto L45
            L2c:
                oq.u.b(r14)
                java.lang.Object r14 = r13.f129898e
                r4 = r14
                a4.c r4 = (a4.c) r4
                r13.f129898e = r4
                r13.f129897d = r3
                r5 = 0
                r6 = 0
                r8 = 2
                r9 = 0
                r7 = r13
                java.lang.Object r14 = p143z0.b3.d(r4, r5, r6, r7, r8, r9)
                if (r14 != r0) goto L44
                goto L5f
            L44:
                r1 = r4
            L45:
                a4.b0 r14 = (a4.PointerInputChange) r14
                n1.l4 r4 = r7.f129899f
                long r5 = r14.getPosition()
                r4.a(r5)
                r4 = r1
                r1 = r14
            L52:
                r7.f129898e = r4
                r7.f129896c = r1
                r7.f129897d = r2
                r14 = 0
                java.lang.Object r14 = a4.c.Q0(r4, r14, r13, r3, r14)
                if (r14 != r0) goto L60
            L5f:
                return r0
            L60:
                a4.o r14 = (a4.o) r14
                java.util.List r14 = r14.c()
                r5 = r14
                java.util.Collection r5 = (java.util.Collection) r5
                int r5 = r5.size()
                r6 = 0
            L6e:
                if (r6 >= r5) goto L8e
                java.lang.Object r8 = r14.get(r6)
                a4.b0 r8 = (a4.PointerInputChange) r8
                long r9 = r8.getId()
                long r11 = r1.getId()
                boolean r9 = a4.a0.b(r9, r11)
                if (r9 == 0) goto L8b
                boolean r8 = r8.getPressed()
                if (r8 == 0) goto L8b
                goto L52
            L8b:
                int r6 = r6 + 1
                goto L6e
            L8e:
                n1.l4 r14 = r7.f129899f
                r14.c()
                oq.i0 r14 = oq.i0.f148189a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.a4.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object B(c cVar, e<? super i0> eVar) {
            return ((b) v(cVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            b bVar = new b(this.f129899f, eVar);
            bVar.f129898e = obj;
            return bVar;
        }
    }

    public static final Object g(k0 k0Var, l4 l4Var, e<? super i0> eVar) {
        Object objE = q0.e(new a(k0Var, l4Var, null), eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h(k0 k0Var, final l4 l4Var, e<? super i0> eVar) {
        Object objH = p143z0.q0.h(k0Var, new l() { // from class: n1.w3
            @Override // er.l
            public final Object b(Object obj) {
                return a4.i(l4Var, (m3.e) obj);
            }
        }, new er.a() { // from class: n1.x3
            @Override // er.a
            public final Object a() {
                return a4.j(l4Var);
            }
        }, new er.a() { // from class: n1.y3
            @Override // er.a
            public final Object a() {
                return a4.k(l4Var);
            }
        }, new p() { // from class: n1.z3
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return a4.l(l4Var, (PointerInputChange) obj, (m3.e) obj2);
            }
        }, eVar);
        return objH == uq.b.e() ? objH : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(l4 l4Var, m3.e eVar) {
        l4Var.b(eVar.getPackedValue(), z1.p0.INSTANCE.l());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(l4 l4Var) {
        l4Var.e();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(l4 l4Var) {
        l4Var.onCancel();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(l4 l4Var, PointerInputChange pointerInputChange, m3.e eVar) {
        l4Var.d(eVar.getPackedValue());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object m(k0 k0Var, l4 l4Var, e<? super i0> eVar) {
        Object objD = g1.d(k0Var, new b(l4Var, null), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }
}
