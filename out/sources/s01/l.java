package s01;

import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oo0.Category;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00118\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Ls01/l;", "Ll00/g;", "Ls01/d;", "", "Ls01/e;", "Lyy/a;", "stateMachineFactory", "Lt01/d;", "screenMapper", "<init>", "(Lyy/a;Lt01/d;)V", "state", "Ls01/e$a;", "k9", "(Ls01/d;)Ls01/e$a;", "b", "Lt01/d;", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "d", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Ls01/c;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<d, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t01.d screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<s01.c> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f177033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f177034b;

        /* JADX INFO: renamed from: s01.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4525a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f177035a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f177036b;

            /* JADX INFO: renamed from: s01.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4526a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f177037d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f177038e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f177039f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f177041h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f177042j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f177043k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f177044l;

                public C4526a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f177037d = obj;
                    this.f177038e |= PKIFailureInfo.systemUnavail;
                    return C4525a.this.F(null, this);
                }
            }

            public C4525a(mu.h hVar, l lVar) {
                this.f177035a = hVar;
                this.f177036b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4526a c4526a;
                if (eVar instanceof C4526a) {
                    c4526a = (C4526a) eVar;
                    int i15 = c4526a.f177038e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4526a.f177038e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4526a = new C4526a(eVar);
                    }
                } else {
                    c4526a = new C4526a(eVar);
                }
                Object obj2 = c4526a.f177037d;
                Object objE = uq.b.e();
                int i16 = c4526a.f177038e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f177035a;
                    e.Data dataK9 = this.f177036b.k9((d) obj);
                    c4526a.f177039f = vq.j.a(obj);
                    c4526a.f177041h = vq.j.a(c4526a);
                    c4526a.f177042j = vq.j.a(obj);
                    c4526a.f177043k = vq.j.a(hVar);
                    c4526a.f177044l = 0;
                    c4526a.f177038e = 1;
                    if (hVar.F(dataK9, c4526a) == objE) {
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

        public a(mu.g gVar, l lVar) {
            this.f177033a = gVar;
            this.f177034b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f177033a.a(new C4525a(hVar, this.f177034b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls01/a;", "<unused var>", "Ls01/d;", "Loq/i0;", "<anonymous>", "(Ls01/a;Ls01/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<s01.a, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f177045e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f177045e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<s01.c> bVarY1 = l.this.Y1();
                s01.c.a aVar = s01.c.a.f177016a;
                this.f177045e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(s01.a aVar, d dVar, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls01/b;", "action", "Ls01/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ls01/b;Ls01/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<GoToSuggestion, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f177047e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f177048f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f177050a;

            static {
                int[] iArr = new int[Category.a.values().length];
                try {
                    iArr[Category.a.DOCUMENTS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Category.a.SERVICES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Category.a.OTHER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f177050a = iArr;
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r9.F(r2, r8) == r1) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
        
            if (r9.F(r2, r8) == r1) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f177048f
                s01.b r0 = (s01.GoToSuggestion) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r8.f177047e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1e
                if (r2 == r4) goto L12
                if (r2 != r3) goto L16
            L12:
                oq.u.b(r9)
                goto L7b
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                oq.u.b(r9)
                oo0.c$a r9 = r0.getCategory()
                int[] r2 = s01.l.c.a.f177050a
                int r9 = r9.ordinal()
                r9 = r2[r9]
                if (r9 == r4) goto L5d
                if (r9 == r3) goto L5d
                r2 = 3
                if (r9 == r2) goto L35
                goto L7b
            L35:
                s01.l r9 = s01.l.this
                xw.b r9 = r9.Y1()
                s01.c$c r2 = new s01.c$c
                p01.a$b r4 = new p01.a$b
                oo0.u$b r5 = oo0.Topic.b.OTHER
                oo0.u r6 = new oo0.u
                java.lang.String r7 = ""
                r6.<init>(r7, r5, r7)
                r4.<init>(r6)
                r2.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r8.f177048f = r0
                r8.f177047e = r3
                java.lang.Object r9 = r9.F(r2, r8)
                if (r9 != r1) goto L7b
                goto L7a
            L5d:
                s01.l r9 = s01.l.this
                xw.b r9 = r9.Y1()
                s01.c$b r2 = new s01.c$b
                oo0.c$a r3 = r0.getCategory()
                r2.<init>(r3)
                java.lang.Object r0 = vq.j.a(r0)
                r8.f177048f = r0
                r8.f177047e = r4
                java.lang.Object r9 = r9.F(r2, r8)
                if (r9 != r1) goto L7b
            L7a:
                return r1
            L7b:
                oq.i0 r9 = oq.i0.f148189a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: s01.l.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(GoToSuggestion goToSuggestion, d dVar, tq.e<? super i0> eVar) {
            c cVar = l.this.new c(eVar);
            cVar.f177048f = goToSuggestion;
            return cVar.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, t01.d dVar) {
        this.screenMapper = dVar;
        d dVar2 = d.f177019a;
        this.stateMachine = aVar.a(dVar2, new er.l() { // from class: s01.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.n9(this.f177026a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9(dVar2));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data k9(d state) {
        return this.screenMapper.b(new t01.d.Params(state, b9(s01.a.f177014a), new er.l() { // from class: s01.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.l9(this.f177027a, (Category.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(l lVar, Category.a aVar) {
        lVar.d9(new GoToSuggestion(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final l lVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: s01.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.o9(this.f177028a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(s01.a.class), oVar, bVar);
        zVar.x(q0.c(GoToSuggestion.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<s01.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<d, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
