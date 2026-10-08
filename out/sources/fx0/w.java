package fx0;

import fr.q0;
import fr0.DocumentMaintenanceBreak;
import hx0.AddingDocument;
import hx0.AvailableCertifiedDocumentCardData;
import hx0.AvailableDocumentCardData;
import hx0.AvailableDocuments;
import i34.DocumentMaintenanceBreakError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import r30.CheckBoxRowData;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BQ\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0019H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J+\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020,2\u0006\u0010%\u001a\u00020)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020!0*H\u0002¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\u00020/*\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00105\u001a\u0002042\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010P\u001a\b\u0012\u0004\u0012\u00020K0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR,\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030Q8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\bR\u0010S\u0012\u0004\bV\u0010W\u001a\u0004\bT\u0010UR&\u0010+\u001a\b\u0012\u0004\u0012\u00020/0Y8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bZ\u0010[\u0012\u0004\b^\u0010W\u001a\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Lfx0/w;", "Ll00/g;", "Lfx0/b;", "Lfx0/a;", "Lfx0/c;", "", "Lgx0/b;", "asyncDocumentsScreenMapper", "Ldx0/j;", "getDocumentToAddAsyncUseCase", "Lib4/c;", "errorMapper", "Lmz3/j;", "generateDocumentsAsyncUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lcx/a;", "navEventThrottler", "addDocumentThrottler", "Lj34/a;", "maintenanceBreakMapper", "Lyy/a;", "stateMachineFactory", "<init>", "(Lgx0/b;Ldx0/j;Lib4/c;Lmz3/j;Lac4/a;Lcx/a;Lcx/a;Lj34/a;Lyy/a;)V", "", "Lhx0/c;", "", "Lrq0/b;", "I9", "(Ljava/util/List;)Ljava/util/Set;", "Lhx0/a;", "documentsWithConfigs", "Lfx0/b$a$b$b;", "G9", "(Ljava/util/List;)Lfx0/b$a$b$b;", "Lfx0/a$a;", "action", "Loq/i0;", "E9", "(Lfx0/a$a;)V", "Lfx0/a$c;", "Lk10/c0;", "state", "Lk10/l;", "U9", "(Lfx0/a$c;Lk10/c0;)Lk10/l;", "Lfx0/c$a;", "L9", "(Lfx0/b;)Lfx0/c$a;", "Ldx/b;", "domainError", "Ljb4/b;", "J9", "(Ldx/b;)Ljb4/b;", "b", "Lgx0/b;", "c", "Ldx0/j;", "d", "Lib4/c;", "e", "Lmz3/j;", "f", "Lac4/a;", "g", "Lcx/a;", "h", "j", "Lj34/a;", "Lfx0/b$b$b;", "k", "Lfx0/b$b$b;", "initialState", "Lxw/b;", "Lfx0/a$d;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w extends l00.g<fx0.b, fx0.a> implements fx0.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gx0.b asyncDocumentsScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dx0.j getDocumentToAddAsyncUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mz3.j generateDocumentsAsyncUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final cx.a navEventThrottler;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final cx.a addDocumentThrottler;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final j34.a maintenanceBreakMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final fx0.b.InterfaceC1528b.C1529b initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<fx0.a.d> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<fx0.b, fx0.a> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<fx0.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<fx0.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f68533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f68534b;

        /* JADX INFO: renamed from: fx0.w$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1532a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f68535a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f68536b;

            /* JADX INFO: renamed from: fx0.w$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1533a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f68537d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f68538e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f68539f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f68541h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f68542j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f68543k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f68544l;

                public C1533a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f68537d = obj;
                    this.f68538e |= PKIFailureInfo.systemUnavail;
                    return C1532a.this.F(null, this);
                }
            }

            public C1532a(mu.h hVar, w wVar) {
                this.f68535a = hVar;
                this.f68536b = wVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1533a c1533a;
                if (eVar instanceof C1533a) {
                    c1533a = (C1533a) eVar;
                    int i15 = c1533a.f68538e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1533a.f68538e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1533a = new C1533a(eVar);
                    }
                } else {
                    c1533a = new C1533a(eVar);
                }
                Object obj2 = c1533a.f68537d;
                Object objE = uq.b.e();
                int i16 = c1533a.f68538e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f68535a;
                    fx0.c.a aVarL9 = this.f68536b.L9((fx0.b) obj);
                    c1533a.f68539f = vq.j.a(obj);
                    c1533a.f68541h = vq.j.a(c1533a);
                    c1533a.f68542j = vq.j.a(obj);
                    c1533a.f68543k = vq.j.a(hVar);
                    c1533a.f68544l = 0;
                    c1533a.f68538e = 1;
                    if (hVar.F(aVarL9, c1533a) == objE) {
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

        public a(mu.g gVar, w wVar) {
            this.f68533a = gVar;
            this.f68534b = wVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super fx0.c.a> hVar, tq.e eVar) {
            Object objA = this.f68533a.a(new C1532a(hVar, this.f68534b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lfx0/b$b$b;", "state", "Lk10/l;", "Lfx0/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<k10.c0<fx0.b.InterfaceC1528b.C1529b>, tq.e<? super k10.l<? extends fx0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68546f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lfx0/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends fx0.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f68548e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ w f68549f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<fx0.b.InterfaceC1528b.C1529b> f68550g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, k10.c0<fx0.b.InterfaceC1528b.C1529b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f68549f = wVar;
                this.f68550g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fx0.b.InterfaceC1528b.Error X(dx.b bVar, fx0.b.InterfaceC1528b.C1529b c1529b) {
                return new fx0.b.InterfaceC1528b.Error(bVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fx0.b.a.AbstractC1525b.ChoosingDocument Y(w wVar, List list, fx0.b.InterfaceC1528b.C1529b c1529b) {
                return wVar.G9(list);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f68548e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    dx0.j jVar = this.f68549f.getDocumentToAddAsyncUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f68548e = 1;
                    obj = jVar.a(c1792a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                k10.c0<fx0.b.InterfaceC1528b.C1529b> c0Var = this.f68550g;
                final w wVar = this.f68549f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: fx0.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return w.b.a.X(bVar, (b.InterfaceC1528b.C1529b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: fx0.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return w.b.a.Y(wVar, list, (b.InterfaceC1528b.C1529b) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f68549f, this.f68550g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends fx0.b>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f68546f;
            Object objE = uq.b.e();
            int i15 = this.f68545e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = w.this.callActionWithLoaderUseCase;
            a aVar2 = new a(w.this, c0Var, null);
            this.f68546f = vq.j.a(c0Var);
            this.f68545e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<fx0.b.InterfaceC1528b.C1529b> c0Var, tq.e<? super k10.l<? extends fx0.b>> eVar) {
            return ((b) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = w.this.new b(eVar);
            bVar.f68546f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfx0/a$d;", "action", "Lfx0/b$b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfx0/a$d;Lfx0/b$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<fx0.a.d, fx0.b.InterfaceC1528b.Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68551e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68552f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fx0.a.d dVar = (fx0.a.d) this.f68552f;
            Object objE = uq.b.e();
            int i15 = this.f68551e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fx0.a.d> bVarY1 = w.this.Y1();
                this.f68552f = vq.j.a(dVar);
                this.f68551e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(fx0.a.d dVar, fx0.b.InterfaceC1528b.Error error, tq.e<? super i0> eVar) {
            c cVar = w.this.new c(eVar);
            cVar.f68552f = dVar;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfx0/b$b$a;", "state", "Loq/i0;", "<anonymous>", "(Lfx0/b$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<fx0.b.InterfaceC1528b.Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68555f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fx0.b.InterfaceC1528b.Error error = (fx0.b.InterfaceC1528b.Error) this.f68555f;
            uq.b.e();
            if (this.f68554e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            w.this.d9(new fx0.a.d.Error(w.this.J9(error.getDomainError())));
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(fx0.b.InterfaceC1528b.Error error, tq.e<? super i0> eVar) {
            return ((d) v(error, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = w.this.new d(eVar);
            dVar.f68555f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfx0/a$e;", "<unused var>", "Lk10/c0;", "Lfx0/b$b$a;", "state", "Lk10/l;", "Lfx0/b;", "<anonymous>", "(Lfx0/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<fx0.a.e, k10.c0<fx0.b.InterfaceC1528b.Error>, tq.e<? super k10.l<? extends fx0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68558f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fx0.b.InterfaceC1528b.C1529b O(fx0.b.InterfaceC1528b.Error error) {
            return fx0.b.InterfaceC1528b.C1529b.f68479a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f68558f;
            uq.b.e();
            if (this.f68557e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: fx0.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.e.O((b.InterfaceC1528b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fx0.a.e eVar, k10.c0<fx0.b.InterfaceC1528b.Error> c0Var, tq.e<? super k10.l<? extends fx0.b>> eVar2) {
            e eVar3 = new e(eVar2);
            eVar3.f68558f = c0Var;
            return eVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfx0/a$d;", "action", "Lfx0/b$a$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfx0/a$d;Lfx0/b$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<fx0.a.d, fx0.b.a.AbstractC1525b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68559e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68560f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f68562e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ w f68563f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ fx0.a.d f68564g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, fx0.a.d dVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f68563f = wVar;
                this.f68564g = dVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f68562e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    xw.b<fx0.a.d> bVarY1 = this.f68563f.Y1();
                    fx0.a.d dVar = this.f68564g;
                    this.f68562e = 1;
                    if (bVarY1.F(dVar, this) == objE) {
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

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f68563f, this.f68564g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fx0.a.d dVar = (fx0.a.d) this.f68560f;
            Object objE = uq.b.e();
            int i15 = this.f68559e;
            if (i15 == 0) {
                oq.u.b(obj);
                cx.a aVar = w.this.navEventThrottler;
                a aVar2 = new a(w.this, dVar, null);
                this.f68560f = vq.j.a(dVar);
                this.f68559e = 1;
                if (cx.a.d(aVar, 0L, aVar2, this, 1, null) == objE) {
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
        public final Object w(fx0.a.d dVar, fx0.b.a.AbstractC1525b abstractC1525b, tq.e<? super i0> eVar) {
            f fVar = w.this.new f(eVar);
            fVar.f68560f = dVar;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfx0/a$c;", "action", "Lk10/c0;", "Lfx0/b$a$b$b;", "state", "Lk10/l;", "Lfx0/b;", "<anonymous>", "(Lfx0/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<fx0.a.CheckboxChange, k10.c0<fx0.b.a.AbstractC1525b.ChoosingDocument>, tq.e<? super k10.l<? extends fx0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68566f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f68567g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fx0.a.CheckboxChange checkboxChange = (fx0.a.CheckboxChange) this.f68566f;
            k10.c0 c0Var = (k10.c0) this.f68567g;
            uq.b.e();
            if (this.f68565e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return w.this.U9(checkboxChange, c0Var);
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fx0.a.CheckboxChange checkboxChange, k10.c0<fx0.b.a.AbstractC1525b.ChoosingDocument> c0Var, tq.e<? super k10.l<? extends fx0.b>> eVar) {
            g gVar = w.this.new g(eVar);
            gVar.f68566f = checkboxChange;
            gVar.f68567g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfx0/a$a;", "action", "Lfx0/b$a$b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfx0/a$a;Lfx0/b$a$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<fx0.a.AddDocumentWithAdditionalVerification, fx0.b.a.AbstractC1525b.ChoosingDocument, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68570f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f68572e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ w f68573f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ fx0.a.AddDocumentWithAdditionalVerification f68574g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, fx0.a.AddDocumentWithAdditionalVerification addDocumentWithAdditionalVerification, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f68573f = wVar;
                this.f68574g = addDocumentWithAdditionalVerification;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f68572e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                this.f68573f.E9(this.f68574g);
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f68573f, this.f68574g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fx0.a.AddDocumentWithAdditionalVerification addDocumentWithAdditionalVerification = (fx0.a.AddDocumentWithAdditionalVerification) this.f68570f;
            Object objE = uq.b.e();
            int i15 = this.f68569e;
            if (i15 == 0) {
                oq.u.b(obj);
                cx.a aVar = w.this.addDocumentThrottler;
                a aVar2 = new a(w.this, addDocumentWithAdditionalVerification, null);
                this.f68570f = vq.j.a(addDocumentWithAdditionalVerification);
                this.f68569e = 1;
                if (cx.a.d(aVar, 0L, aVar2, this, 1, null) == objE) {
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
        public final Object w(fx0.a.AddDocumentWithAdditionalVerification addDocumentWithAdditionalVerification, fx0.b.a.AbstractC1525b.ChoosingDocument choosingDocument, tq.e<? super i0> eVar) {
            h hVar = w.this.new h(eVar);
            hVar.f68570f = addDocumentWithAdditionalVerification;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfx0/a$b;", "<unused var>", "Lk10/c0;", "Lfx0/b$a$b$b;", "state", "Lk10/l;", "Lfx0/b;", "<anonymous>", "(Lfx0/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<fx0.a.b, k10.c0<fx0.b.a.AbstractC1525b.ChoosingDocument>, tq.e<? super k10.l<? extends fx0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68576f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lfx0/b$a$b$a;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends fx0.b.a.AbstractC1525b.AddingRegularDocuments>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f68578e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ k10.c0<fx0.b.a.AbstractC1525b.ChoosingDocument> f68579f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k10.c0<fx0.b.a.AbstractC1525b.ChoosingDocument> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f68579f = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fx0.b.a.AbstractC1525b.AddingRegularDocuments V(fx0.b.a.AbstractC1525b.ChoosingDocument choosingDocument) {
                return new fx0.b.a.AbstractC1525b.AddingRegularDocuments(choosingDocument.getAvailableDocuments());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f68578e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return this.f68579f.d(new er.l() { // from class: fx0.a0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return w.i.a.V((b.a.AbstractC1525b.ChoosingDocument) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f68579f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<fx0.b.a.AbstractC1525b.AddingRegularDocuments>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f68576f;
            Object objE = uq.b.e();
            int i15 = this.f68575e;
            if (i15 == 0) {
                oq.u.b(obj);
                cx.a aVar = w.this.addDocumentThrottler;
                a aVar2 = new a(c0Var, null);
                this.f68576f = c0Var;
                this.f68575e = 1;
                obj = cx.a.d(aVar, 0L, aVar2, this, 1, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                return c0Var.c();
            }
            if (iVar instanceof dx.i.Right) {
                return ((dx.i.Right) iVar).b();
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fx0.a.b bVar, k10.c0<fx0.b.a.AbstractC1525b.ChoosingDocument> c0Var, tq.e<? super k10.l<? extends fx0.b>> eVar) {
            i iVar = w.this.new i(eVar);
            iVar.f68576f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lfx0/b$a$b$a;", "state", "Lk10/l;", "Lfx0/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<k10.c0<fx0.b.a.AbstractC1525b.AddingRegularDocuments>, tq.e<? super k10.l<? extends fx0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68581f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lfx0/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends fx0.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f68583e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ w f68584f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<fx0.b.a.AbstractC1525b.AddingRegularDocuments> f68585g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, k10.c0<fx0.b.a.AbstractC1525b.AddingRegularDocuments> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f68584f = wVar;
                this.f68585g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fx0.b.a.Error V(dx.b bVar, fx0.b.a.AbstractC1525b.AddingRegularDocuments addingRegularDocuments) {
                return new fx0.b.a.Error(addingRegularDocuments.getAvailableDocuments(), bVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f68583e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    mz3.j jVar = this.f68584f.generateDocumentsAsyncUseCase;
                    mz3.j.a.DownloadDocuments downloadDocuments = new mz3.j.a.DownloadDocuments(lz3.d.FIRST_DOWNLOAD, pq.v.f1(this.f68584f.I9(this.f68585g.a().getAvailableDocuments().d())));
                    this.f68583e = 1;
                    obj = jVar.c(downloadDocuments, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                k10.c0<fx0.b.a.AbstractC1525b.AddingRegularDocuments> c0Var = this.f68585g;
                w wVar = this.f68584f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: fx0.b0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return w.j.a.V(bVar, (b.a.AbstractC1525b.AddingRegularDocuments) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                wVar.d9(fx0.a.d.C1523d.f68469a);
                return c0Var.c();
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f68584f, this.f68585g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends fx0.b>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f68581f;
            Object objE = uq.b.e();
            int i15 = this.f68580e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = w.this.callActionWithLoaderUseCase;
            a aVar2 = new a(w.this, c0Var, null);
            this.f68581f = vq.j.a(c0Var);
            this.f68580e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<fx0.b.a.AbstractC1525b.AddingRegularDocuments> c0Var, tq.e<? super k10.l<? extends fx0.b>> eVar) {
            return ((j) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            j jVar = w.this.new j(eVar);
            jVar.f68581f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfx0/a$d;", "action", "Lfx0/b$a$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfx0/a$d;Lfx0/b$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<fx0.a.d, fx0.b.a.Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68586e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68587f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fx0.a.d dVar = (fx0.a.d) this.f68587f;
            Object objE = uq.b.e();
            int i15 = this.f68586e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fx0.a.d> bVarY1 = w.this.Y1();
                this.f68587f = vq.j.a(dVar);
                this.f68586e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(fx0.a.d dVar, fx0.b.a.Error error, tq.e<? super i0> eVar) {
            k kVar = w.this.new k(eVar);
            kVar.f68587f = dVar;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lfx0/b$a$a;", "state", "Lk10/l;", "Lfx0/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<k10.c0<fx0.b.a.Error>, tq.e<? super k10.l<? extends fx0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68590f;

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fx0.b.a.AbstractC1525b.ChoosingDocument O(k10.c0 c0Var, fx0.b.a.Error error) {
            return new fx0.b.a.AbstractC1525b.ChoosingDocument(((fx0.b.a.Error) c0Var.a()).getAvailableDocuments());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f68590f;
            uq.b.e();
            if (this.f68589e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.b domainError = ((fx0.b.a.Error) c0Var.a()).getDomainError();
            dx.b.Business business = domainError instanceof dx.b.Business ? (dx.b.Business) domainError : null;
            dx.b.Business.a type = business != null ? business.getType() : null;
            if (type instanceof DocumentMaintenanceBreakError) {
                w.this.d9(new fx0.a.d.ShowDialog(((DocumentMaintenanceBreakError) type).getDialogData()));
                return c0Var.d(new er.l() { // from class: fx0.c0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return w.l.O(c0Var, (b.a.Error) obj2);
                    }
                });
            }
            w.this.d9(new fx0.a.d.Error(w.this.J9(((fx0.b.a.Error) c0Var.a()).getDomainError())));
            return c0Var.c();
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<fx0.b.a.Error> c0Var, tq.e<? super k10.l<? extends fx0.b>> eVar) {
            return ((l) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            l lVar = w.this.new l(eVar);
            lVar.f68590f = obj;
            return lVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfx0/a$e;", "<unused var>", "Lk10/c0;", "Lfx0/b$a$a;", "state", "Lk10/l;", "Lfx0/b;", "<anonymous>", "(Lfx0/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<fx0.a.e, k10.c0<fx0.b.a.Error>, tq.e<? super k10.l<? extends fx0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68593f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fx0.b.a.AbstractC1525b.AddingRegularDocuments O(k10.c0 c0Var, fx0.b.a.Error error) {
            return new fx0.b.a.AbstractC1525b.AddingRegularDocuments(((fx0.b.a.Error) c0Var.a()).getAvailableDocuments());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f68593f;
            uq.b.e();
            if (this.f68592e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: fx0.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.m.O(c0Var, (b.a.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fx0.a.e eVar, k10.c0<fx0.b.a.Error> c0Var, tq.e<? super k10.l<? extends fx0.b>> eVar2) {
            m mVar = new m(eVar2);
            mVar.f68593f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    public w(gx0.b bVar, dx0.j jVar, ib4.c cVar, mz3.j jVar2, ac4.a aVar, cx.a aVar2, cx.a aVar3, j34.a aVar4, yy.a aVar5) {
        this.asyncDocumentsScreenMapper = bVar;
        this.getDocumentToAddAsyncUseCase = jVar;
        this.errorMapper = cVar;
        this.generateDocumentsAsyncUseCase = jVar2;
        this.callActionWithLoaderUseCase = aVar;
        this.navEventThrottler = aVar2;
        this.addDocumentThrottler = aVar3;
        this.maintenanceBreakMapper = aVar4;
        fx0.b.InterfaceC1528b.C1529b c1529b = fx0.b.InterfaceC1528b.C1529b.f68479a;
        this.initialState = c1529b;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar5.a(c1529b, new er.l() { // from class: fx0.k
            @Override // er.l
            public final Object b(Object obj) {
                return w.N9(this.f68509a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), fx0.c.a.b.f68492a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E9(fx0.a.AddDocumentWithAdditionalVerification action) {
        DocumentMaintenanceBreak maintenanceBreak = action.getDocumentConfig().getMaintenanceBreak();
        if (maintenanceBreak != null) {
            d9(new fx0.a.d.ShowDialog(this.maintenanceBreakMapper.b(new j34.a.Params(maintenanceBreak, new er.a() { // from class: fx0.t
                @Override // er.a
                public final Object a() {
                    return w.F9();
                }
            }))));
        } else {
            d9(new fx0.a.d.GoToAddDocumentWithAdditionalVerification(action.getDocumentConfig().getType()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fx0.b.a.AbstractC1525b.ChoosingDocument G9(List<AddingDocument> documentsWithConfigs) {
        List<AddingDocument> list = documentsWithConfigs;
        ArrayList<AddingDocument> arrayList = new ArrayList();
        for (Object obj : list) {
            if (fr.t.c(((AddingDocument) obj).getConfig().getAdditionalVerificationRequired(), Boolean.FALSE)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(pq.v.y(arrayList, 10));
        for (final AddingDocument addingDocument : arrayList) {
            arrayList2.add(new AvailableDocumentCardData(addingDocument, new CheckBoxSingleData(new CheckBoxRowData(null, false, new er.l() { // from class: fx0.m
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.H9(this.f68511a, addingDocument, ((Boolean) obj2).booleanValue());
                }
            }, null, null, null, null, null, 249, null), null, null, false, null, 30, null)));
        }
        ArrayList<AddingDocument> arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (fr.t.c(((AddingDocument) obj2).getConfig().getAdditionalVerificationRequired(), Boolean.TRUE)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(pq.v.y(arrayList3, 10));
        for (AddingDocument addingDocument2 : arrayList3) {
            arrayList4.add(new AvailableCertifiedDocumentCardData(addingDocument2, b9(new fx0.a.AddDocumentWithAdditionalVerification(addingDocument2.getConfig()))));
        }
        return new fx0.b.a.AbstractC1525b.ChoosingDocument(new AvailableDocuments(arrayList2, arrayList4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(w wVar, AddingDocument addingDocument, boolean z15) {
        wVar.d9(new fx0.a.CheckboxChange(addingDocument));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<rq0.b> I9(List<AvailableDocumentCardData> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AvailableDocumentCardData) obj).getCheckboxData().getCheckbox().getIsChecked()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(pq.v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AvailableDocumentCardData) it.next()).getAddingDocument().getConfig().getType());
        }
        return pq.v.k1(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b J9(dx.b domainError) {
        return this.errorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: fx0.l
            @Override // er.l
            public final Object b(Object obj) {
                return w.K9(this.f68510a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(w wVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            wVar.d9(fx0.a.d.C1522a.f68466a);
        } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            wVar.d9(fx0.a.e.f68471a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fx0.c.a L9(fx0.b bVar) {
        return this.asyncDocumentsScreenMapper.b(new gx0.b.Params(bVar, b9(fx0.a.d.C1522a.f68466a), b9(fx0.a.b.f68464a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N9(final w wVar, k10.v vVar) {
        vVar.c(q0.c(fx0.b.InterfaceC1528b.C1529b.class), new er.l() { // from class: fx0.n
            @Override // er.l
            public final Object b(Object obj) {
                return w.O9(this.f68513a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(fx0.b.InterfaceC1528b.Error.class), new er.l() { // from class: fx0.o
            @Override // er.l
            public final Object b(Object obj) {
                return w.P9(this.f68514a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(fx0.b.a.AbstractC1525b.class), new er.l() { // from class: fx0.p
            @Override // er.l
            public final Object b(Object obj) {
                return w.Q9(this.f68515a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(fx0.b.a.AbstractC1525b.ChoosingDocument.class), new er.l() { // from class: fx0.q
            @Override // er.l
            public final Object b(Object obj) {
                return w.R9(this.f68516a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(fx0.b.a.AbstractC1525b.AddingRegularDocuments.class), new er.l() { // from class: fx0.r
            @Override // er.l
            public final Object b(Object obj) {
                return w.S9(this.f68517a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(fx0.b.a.Error.class), new er.l() { // from class: fx0.s
            @Override // er.l
            public final Object b(Object obj) {
                return w.T9(this.f68518a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O9(w wVar, k10.z zVar) {
        zVar.A(wVar.new b(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P9(w wVar, k10.z zVar) {
        c cVar = wVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(fx0.a.d.class), oVar, cVar);
        zVar.C(wVar.new d(null));
        zVar.v(q0.c(fx0.a.e.class), oVar, new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q9(w wVar, k10.z zVar) {
        f fVar = wVar.new f(null);
        zVar.x(q0.c(fx0.a.d.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R9(w wVar, k10.z zVar) {
        g gVar = wVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(fx0.a.CheckboxChange.class), oVar, gVar);
        zVar.x(q0.c(fx0.a.AddDocumentWithAdditionalVerification.class), oVar, wVar.new h(null));
        zVar.v(q0.c(fx0.a.b.class), oVar, wVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S9(w wVar, k10.z zVar) {
        zVar.A(wVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T9(w wVar, k10.z zVar) {
        k kVar = wVar.new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(fx0.a.d.class), oVar, kVar);
        zVar.A(wVar.new l(null));
        zVar.v(q0.c(fx0.a.e.class), oVar, new m(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<fx0.b> U9(fx0.a.CheckboxChange action, k10.c0<fx0.b.a.AbstractC1525b.ChoosingDocument> state) {
        DocumentMaintenanceBreak maintenanceBreak = action.getAddingDocument().getConfig().getMaintenanceBreak();
        if (maintenanceBreak != null) {
            d9(new fx0.a.d.ShowDialog(this.maintenanceBreakMapper.b(new j34.a.Params(maintenanceBreak, new er.a() { // from class: fx0.u
                @Override // er.a
                public final Object a() {
                    return w.V9();
                }
            }))));
            return state.c();
        }
        final rq0.b type = action.getAddingDocument().getConfig().getType();
        for (AvailableDocumentCardData availableDocumentCardData : state.a().getAvailableDocuments().d()) {
            if (fr.t.c(availableDocumentCardData.getAddingDocument().getConfig().getType(), type)) {
                final boolean isChecked = availableDocumentCardData.getCheckboxData().getCheckbox().getIsChecked();
                return state.b(new er.l() { // from class: fx0.v
                    @Override // er.l
                    public final Object b(Object obj) {
                        return w.W9(type, isChecked, (b.a.AbstractC1525b.ChoosingDocument) obj);
                    }
                });
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fx0.b.a.AbstractC1525b.ChoosingDocument W9(rq0.b bVar, boolean z15, fx0.b.a.AbstractC1525b.ChoosingDocument choosingDocument) {
        AvailableDocuments availableDocuments = choosingDocument.getAvailableDocuments();
        List<AvailableDocumentCardData> listD = choosingDocument.getAvailableDocuments().d();
        ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
        for (AvailableDocumentCardData availableDocumentCardData : listD) {
            arrayList.add(AvailableDocumentCardData.b(availableDocumentCardData, null, CheckBoxSingleData.b(availableDocumentCardData.getCheckboxData(), CheckBoxRowData.b(availableDocumentCardData.getCheckboxData().getCheckbox(), null, fr.t.c(availableDocumentCardData.getAddingDocument().getConfig().getType(), bVar) ? !z15 : availableDocumentCardData.getCheckboxData().getCheckbox().getIsChecked(), null, null, null, null, null, null, 253, null), null, null, false, null, 30, null), 1, null));
        }
        return choosingDocument.b(AvailableDocuments.b(availableDocuments, arrayList, null, 2, null));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: M9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<fx0.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<fx0.b, fx0.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<fx0.c.a> getState() {
        return this.state;
    }
}
