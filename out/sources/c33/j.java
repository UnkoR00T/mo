package c33;

import fr.q0;
import k10.c0;
import k10.z;
import k23.ReportLocationDescription;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import st3.AddressData;
import st3.AddressFormVMSSetupData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u00103\u001a\b\u0012\u0004\u0012\u00020\u00140.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lc33/j;", "Ll00/g;", "Lc33/c;", "Lc33/a;", "Lc33/d;", "", "Lst3/h;", "addressFormVMSFactory", "Lyy/a;", "stateMachineFactory", "Lc33/p;", "contract", "Ld33/a;", "mapper", "Lcb4/j;", "dialogVMSFactory", "Lp23/b;", "newReportExitDialogMapper", "<init>", "(Lst3/h;Lyy/a;Lc33/p;Ld33/a;Lcb4/j;Lp23/b;)V", "Lc33/d$a;", "q9", "(Lc33/c;)Lc33/d$a;", "b", "Ld33/a;", "c", "Lcb4/j;", "d", "Lp23/b;", "Lc33/c$b;", "e", "Lc33/c$b;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lc33/a$b;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<c33.c, c33.a> implements c33.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d33.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p23.b newReportExitDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c33.c.Screen initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<c33.c, c33.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<c33.a.b> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<c33.d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<c33.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f23029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f23030b;

        /* JADX INFO: renamed from: c33.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0613a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f23031a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f23032b;

            /* JADX INFO: renamed from: c33.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0614a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f23033d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f23034e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f23035f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f23037h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f23038j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f23039k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f23040l;

                public C0614a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f23033d = obj;
                    this.f23034e |= PKIFailureInfo.systemUnavail;
                    return C0613a.this.F(null, this);
                }
            }

            public C0613a(mu.h hVar, j jVar) {
                this.f23031a = hVar;
                this.f23032b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0614a c0614a;
                if (eVar instanceof C0614a) {
                    c0614a = (C0614a) eVar;
                    int i15 = c0614a.f23034e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0614a.f23034e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0614a = new C0614a(eVar);
                    }
                } else {
                    c0614a = new C0614a(eVar);
                }
                Object obj2 = c0614a.f23033d;
                Object objE = uq.b.e();
                int i16 = c0614a.f23034e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f23031a;
                    c33.d.Data dataQ9 = this.f23032b.q9((c33.c) obj);
                    c0614a.f23035f = vq.j.a(obj);
                    c0614a.f23037h = vq.j.a(c0614a);
                    c0614a.f23038j = vq.j.a(obj);
                    c0614a.f23039k = vq.j.a(hVar);
                    c0614a.f23040l = 0;
                    c0614a.f23034e = 1;
                    if (hVar.F(dataQ9, c0614a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, j jVar) {
            this.f23029a = gVar;
            this.f23030b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super c33.d.Data> hVar, tq.e eVar) {
            Object objA = this.f23029a.a(new C0613a(hVar, this.f23030b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lc33/a$b;", "action", "Lc33/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lc33/a$b;Lc33/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<c33.a.b, c33.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23041e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23042f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c33.a.b bVar = (c33.a.b) this.f23042f;
            Object objE = uq.b.e();
            int i15 = this.f23041e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<c33.a.b> bVarY1 = j.this.Y1();
                this.f23042f = vq.j.a(bVar);
                this.f23041e = 1;
                if (bVarY1.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(c33.a.b bVar, c33.c cVar, tq.e<? super i0> eVar) {
            b bVar2 = j.this.new b(eVar);
            bVar2.f23042f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lst3/g$b;", "event", "Lc33/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lst3/g$b;Lc33/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<st3.g.b, c33.c.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23045f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            st3.g.b bVar = (st3.g.b) this.f23045f;
            uq.b.e();
            if (this.f23044e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (fr.t.c(bVar, st3.g.b.a.f184307a)) {
                j.this.d9(c33.a.b.C0611a.f22997a);
            } else if (bVar instanceof st3.g.b.GoToError) {
                j.this.d9(new c33.a.b.ShowError(((st3.g.b.GoToError) bVar).getErrorData()));
            } else if (bVar instanceof st3.g.b.GoToSearch) {
                j.this.d9(new c33.a.b.ShowSearch(((st3.g.b.GoToSearch) bVar).getModel()));
            } else {
                if (!(bVar instanceof st3.g.b.Validated)) {
                    throw new oq.p();
                }
                j.this.d9(new c33.a.OnTerytValidated(((st3.g.b.Validated) bVar).getAddressResult()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(st3.g.b bVar, c33.c.Screen screen, tq.e<? super i0> eVar) {
            c cVar = j.this.new c(eVar);
            cVar.f23045f = bVar;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lc33/a$d;", "action", "Lc33/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lc33/a$d;Lc33/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<c33.a.OnTerytValidated, c33.c.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23047e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23048f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f23049g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p f23050h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ j f23051j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p pVar, j jVar, tq.e<? super d> eVar) {
            super(3, eVar);
            this.f23050h = pVar;
            this.f23051j = jVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c33.a.OnTerytValidated onTerytValidated = (c33.a.OnTerytValidated) this.f23048f;
            c33.c.Screen screen = (c33.c.Screen) this.f23049g;
            Object objE = uq.b.e();
            int i15 = this.f23047e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (onTerytValidated.getAddressResult() instanceof st3.k.ValidWithResult) {
                    this.f23050h.l4(((st3.k.ValidWithResult) onTerytValidated.getAddressResult()).getAddressData());
                    this.f23051j.d9(c33.a.b.c.f22999a);
                } else {
                    xw.b<st3.g.a> bVarE = screen.getForm().getAddressFormVMS().e();
                    st3.g.a.b bVar = st3.g.a.b.f184305a;
                    this.f23048f = vq.j.a(onTerytValidated);
                    this.f23049g = vq.j.a(screen);
                    this.f23047e = 1;
                    if (bVarE.F(bVar, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(c33.a.OnTerytValidated onTerytValidated, c33.c.Screen screen, tq.e<? super i0> eVar) {
            d dVar = new d(this.f23050h, this.f23051j, eVar);
            dVar.f23048f = onTerytValidated;
            dVar.f23049g = screen;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lc33/a$c;", "<unused var>", "Lc33/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lc33/a$c;Lc33/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<c33.a.c, c33.c.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23052e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23053f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c33.c.Screen screen = (c33.c.Screen) this.f23053f;
            Object objE = uq.b.e();
            int i15 = this.f23052e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<st3.g.a> bVarE = screen.getForm().getAddressFormVMS().e();
                st3.g.a.c cVar = st3.g.a.c.f184306a;
                this.f23053f = vq.j.a(screen);
                this.f23052e = 1;
                if (bVarE.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(c33.a.c cVar, c33.c.Screen screen, tq.e<? super i0> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f23053f = screen;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lc33/a$e;", "<unused var>", "Lk10/c0;", "Lc33/c$b;", "state", "Lk10/l;", "Lc33/c;", "<anonymous>", "(Lc33/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<c33.a.e, c0<c33.c.Screen>, tq.e<? super k10.l<? extends c33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23054e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23055f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c33.c.Dialog O(j jVar, c33.c.Screen screen) {
            return new c33.c.Dialog(screen.getForm(), jVar.dialogVMSFactory.a(jVar.newReportExitDialogMapper.b(new p23.b.Params(jVar.b9(c33.a.b.C0612b.f22998a), jVar.b9(c33.a.C0610a.f22996a)))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f23055f;
            uq.b.e();
            if (this.f23054e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final j jVar = j.this;
            return c0Var.d(new er.l() { // from class: c33.k
                @Override // er.l
                public final Object b(Object obj2) {
                    return j.f.O(jVar, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(c33.a.e eVar, c0<c33.c.Screen> c0Var, tq.e<? super k10.l<? extends c33.c>> eVar2) {
            f fVar = j.this.new f(eVar2);
            fVar.f23055f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lc33/a$a;", "<unused var>", "Lk10/c0;", "Lc33/c$a;", "state", "Lk10/l;", "Lc33/c;", "<anonymous>", "(Lc33/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<c33.a.C0610a, c0<c33.c.Dialog>, tq.e<? super k10.l<? extends c33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23057e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23058f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c33.c.Screen O(c33.c.Dialog dialog) {
            return new c33.c.Screen(dialog.getForm());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f23058f;
            uq.b.e();
            if (this.f23057e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: c33.l
                @Override // er.l
                public final Object b(Object obj2) {
                    return j.g.O((c.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(c33.a.C0610a c0610a, c0<c33.c.Dialog> c0Var, tq.e<? super k10.l<? extends c33.c>> eVar) {
            g gVar = new g(eVar);
            gVar.f23058f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public j(st3.h hVar, yy.a aVar, final p pVar, d33.a aVar2, cb4.j jVar, p23.b bVar) {
        k23.m type;
        this.mapper = aVar2;
        this.dialogVMSFactory = jVar;
        this.newReportExitDialogMapper = bVar;
        AddressFormVMSSetupData.b.c cVar = AddressFormVMSSetupData.b.c.f184326a;
        AddressData addressDataO = pVar.o();
        st3.g gVarA = hVar.a(new AddressFormVMSSetupData(cVar, true, addressDataO != null ? st3.j.a(addressDataO) : null));
        ReportLocationDescription reportLocationDescriptionI = pVar.I();
        c33.c.Screen screen = new c33.c.Screen(new Form(gVarA, (reportLocationDescriptionI == null || (type = reportLocationDescriptionI.getType()) == null) ? k23.m.PROPERTY : type));
        this.initialState = screen;
        this.stateMachine = aVar.a(screen, new er.l() { // from class: c33.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.s9(this.f23020a, pVar, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), q9(screen));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c33.d.Data q9(c33.c cVar) {
        return this.mapper.b(new d33.a.Params(cVar, b9(c33.a.c.f23002a), b9(c33.a.b.C0611a.f22997a), b9(c33.a.e.f23004a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final j jVar, final p pVar, k10.v vVar) {
        vVar.c(q0.c(c33.c.class), new er.l() { // from class: c33.e
            @Override // er.l
            public final Object b(Object obj) {
                return j.t9(this.f23017a, (z) obj);
            }
        });
        vVar.c(q0.c(c33.c.Screen.class), new er.l() { // from class: c33.f
            @Override // er.l
            public final Object b(Object obj) {
                return j.u9(this.f23018a, pVar, (z) obj);
            }
        });
        vVar.c(q0.c(c33.c.Dialog.class), new er.l() { // from class: c33.g
            @Override // er.l
            public final Object b(Object obj) {
                return j.w9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(j jVar, z zVar) {
        b bVar = jVar.new b(null);
        zVar.x(q0.c(c33.a.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(j jVar, p pVar, z zVar) {
        k10.k.r(zVar, new er.l() { // from class: c33.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.v9((c.Screen) obj);
            }
        }, null, jVar.new c(null), 2, null);
        d dVar = new d(pVar, jVar, null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(c33.a.OnTerytValidated.class), oVar, dVar);
        zVar.x(q0.c(c33.a.c.class), oVar, new e(null));
        zVar.v(q0.c(c33.a.e.class), oVar, jVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mu.g v9(c33.c.Screen screen) {
        return screen.getForm().getAddressFormVMS().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(z zVar) {
        g gVar = new g(null);
        zVar.v(q0.c(c33.a.C0610a.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<c33.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<c33.c, c33.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<c33.d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(p pVar) {
        super.P5(pVar);
    }
}
