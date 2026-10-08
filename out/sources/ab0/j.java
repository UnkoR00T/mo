package ab0;

import cb4.DialogData;
import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030%8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lab0/j;", "Ll00/g;", "Lab0/b;", "Lab0/a;", "Lab0/c;", "", "Lyy/a;", "stateMachineFactory", "Lqg0/d;", "deactivateAppUC", "Lqg0/h;", "logoutFromAppUC", "Lbb0/b;", "mapper", "Lsa0/g;", "dialogMapper", "<init>", "(Lyy/a;Lqg0/d;Lqg0/h;Lbb0/b;Lsa0/g;)V", "state", "Lab0/c$a;", "o9", "(Lab0/b;)Lab0/c$a;", "b", "Lqg0/d;", "c", "Lqg0/h;", "d", "Lbb0/b;", "e", "Lsa0/g;", "Lxw/b;", "Lab0/a$c;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<ab0.b, ab0.a> implements ab0.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qg0.d deactivateAppUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qg0.h logoutFromAppUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bb0.b mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final sa0.g dialogMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ab0.a.c> navAction = new xw.b<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<ab0.b, ab0.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<ab0.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ab0.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f5261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f5262b;

        /* JADX INFO: renamed from: ab0.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0102a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f5263a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f5264b;

            /* JADX INFO: renamed from: ab0.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0103a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f5265d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f5266e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f5267f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f5269h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f5270j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f5271k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f5272l;

                public C0103a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f5265d = obj;
                    this.f5266e |= PKIFailureInfo.systemUnavail;
                    return C0102a.this.F(null, this);
                }
            }

            public C0102a(mu.h hVar, j jVar) {
                this.f5263a = hVar;
                this.f5264b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0103a c0103a;
                if (eVar instanceof C0103a) {
                    c0103a = (C0103a) eVar;
                    int i15 = c0103a.f5266e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0103a.f5266e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0103a = new C0103a(eVar);
                    }
                } else {
                    c0103a = new C0103a(eVar);
                }
                Object obj2 = c0103a.f5265d;
                Object objE = uq.b.e();
                int i16 = c0103a.f5266e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f5263a;
                    ab0.c.a aVarO9 = this.f5264b.o9((ab0.b) obj);
                    c0103a.f5267f = vq.j.a(obj);
                    c0103a.f5269h = vq.j.a(c0103a);
                    c0103a.f5270j = vq.j.a(obj);
                    c0103a.f5271k = vq.j.a(hVar);
                    c0103a.f5272l = 0;
                    c0103a.f5266e = 1;
                    if (hVar.F(aVarO9, c0103a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, j jVar) {
            this.f5261a = gVar;
            this.f5262b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ab0.c.a> hVar, tq.e eVar) {
            Object objA = this.f5261a.a(new C0102a(hVar, this.f5262b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lab0/a$c;", "action", "Lab0/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lab0/a$c;Lab0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<ab0.a.c, ab0.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f5273e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f5274f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ab0.a.c cVar = (ab0.a.c) this.f5274f;
            Object objE = uq.b.e();
            int i15 = this.f5273e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ab0.a.c> bVarY1 = j.this.Y1();
                this.f5274f = vq.j.a(cVar);
                this.f5273e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ab0.a.c cVar, ab0.b bVar, tq.e<? super i0> eVar) {
            b bVar2 = j.this.new b(eVar);
            bVar2.f5274f = cVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lab0/a$d;", "action", "Lab0/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lab0/a$d;Lab0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<ab0.a.ShowDialog, ab0.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f5276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f5277f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5279a;

            static {
                int[] iArr = new int[ab0.a.ShowDialog.EnumC0100a.values().length];
                try {
                    iArr[ab0.a.ShowDialog.EnumC0100a.LOGOUT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ab0.a.ShowDialog.EnumC0100a.DEACTIVATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f5279a = iArr;
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V() {
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X() {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            DialogData dialogDataB;
            ab0.a.ShowDialog showDialog = (ab0.a.ShowDialog) this.f5277f;
            Object objE = uq.b.e();
            int i15 = this.f5276e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ab0.a.c> bVarY1 = j.this.Y1();
                int i16 = a.f5279a[showDialog.getActionType().ordinal()];
                if (i16 == 1) {
                    dialogDataB = j.this.dialogMapper.b(new sa0.g.Params(sa0.a.c.f179568a, j.this.b9(ab0.a.b.f5229a), new er.a() { // from class: ab0.k
                        @Override // er.a
                        public final Object a() {
                            return j.c.V();
                        }
                    }));
                } else {
                    if (i16 != 2) {
                        throw new p();
                    }
                    dialogDataB = j.this.mapper.h(j.this.b9(ab0.a.C0097a.f5228a), new er.a() { // from class: ab0.l
                        @Override // er.a
                        public final Object a() {
                            return j.c.X();
                        }
                    });
                }
                ab0.a.c.ShowDialog showDialog2 = new ab0.a.c.ShowDialog(dialogDataB);
                this.f5277f = vq.j.a(showDialog);
                this.f5276e = 1;
                if (bVarY1.F(showDialog2, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ab0.a.ShowDialog showDialog, ab0.b bVar, tq.e<? super i0> eVar) {
            c cVar = j.this.new c(eVar);
            cVar.f5277f = showDialog;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lab0/a$b;", "<unused var>", "Lab0/b;", "Loq/i0;", "<anonymous>", "(Lab0/a$b;Lab0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<ab0.a.b, ab0.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f5280e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.F(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f5280e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                ab0.j r5 = ab0.j.this
                qg0.h r5 = ab0.j.l9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f5280e = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                ab0.j r5 = ab0.j.this
                xw.b r5 = r5.Y1()
                ab0.a$c$c r1 = ab0.a.c.C0099c.f5232a
                r4.f5280e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ab0.j.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ab0.a.b bVar, ab0.b bVar2, tq.e<? super i0> eVar) {
            return j.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lab0/a$a;", "<unused var>", "Lab0/b;", "Loq/i0;", "<anonymous>", "(Lab0/a$a;Lab0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<ab0.a.C0097a, ab0.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f5282e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.F(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f5282e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                ab0.j r5 = ab0.j.this
                qg0.d r5 = ab0.j.j9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f5282e = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                ab0.j r5 = ab0.j.this
                xw.b r5 = r5.Y1()
                ab0.a$c$b r1 = ab0.a.c.b.f5231a
                r4.f5282e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ab0.j.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ab0.a.C0097a c0097a, ab0.b bVar, tq.e<? super i0> eVar) {
            return j.this.new e(eVar).J(i0.f148189a);
        }
    }

    public j(yy.a aVar, qg0.d dVar, qg0.h hVar, bb0.b bVar, sa0.g gVar) {
        this.deactivateAppUC = dVar;
        this.logoutFromAppUC = hVar;
        this.mapper = bVar;
        this.dialogMapper = gVar;
        ab0.b bVar2 = ab0.b.f5243a;
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: ab0.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.q9(this.f5252a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), o9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ab0.c.a o9(ab0.b state) {
        return this.mapper.b(new bb0.b.Params(state, b9(new ab0.a.ShowDialog(ab0.a.ShowDialog.EnumC0100a.LOGOUT)), b9(new ab0.a.ShowDialog(ab0.a.ShowDialog.EnumC0100a.DEACTIVATE)), b9(ab0.a.c.C0098a.f5230a), b9(ab0.a.c.f.f5235a), b9(ab0.a.c.d.f5233a), b9(ab0.a.c.h.f5237a), b9(ab0.a.c.g.f5236a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final j jVar, v vVar) {
        vVar.c(q0.c(ab0.b.class), new er.l() { // from class: ab0.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.r9(this.f5253a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(j jVar, z zVar) {
        b bVar = jVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ab0.a.c.class), oVar, bVar);
        zVar.x(q0.c(ab0.a.ShowDialog.class), oVar, jVar.new c(null));
        zVar.x(q0.c(ab0.a.b.class), oVar, jVar.new d(null));
        zVar.x(q0.c(ab0.a.C0097a.class), oVar, jVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ab0.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<ab0.b, ab0.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ab0.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
