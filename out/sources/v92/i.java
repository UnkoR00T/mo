package v92;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B1\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R&\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u0013028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u000208078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lv92/i;", "Ll00/g;", "Lv92/b;", "Lv92/a;", "Lv92/c;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "La14/w;", "openUrlIntentUseCase", "Lw92/b;", "mapper", "Lmx/c;", "labelProvider", "snackBarManagerStateHolder", "<init>", "(Lyy/a;La14/w;Lw92/b;Lmx/c;Li70/n;)V", "state", "Lv92/c$a;", "p9", "(Lv92/b;)Lv92/c$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "La14/w;", "c", "Lw92/b;", "d", "Lmx/c;", "e", "Li70/n;", "Lxw/b;", "Lv92/a$d;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "j", "()Lmu/g;", "snackBarVisibilityState", "heatingsupplement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i extends l00.g<v92.b, v92.a> implements v92.c, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w92.b mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<v92.a.d> navAction = new xw.b<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<v92.b, v92.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<v92.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<v92.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f205517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f205518b;

        /* JADX INFO: renamed from: v92.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5362a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f205519a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f205520b;

            /* JADX INFO: renamed from: v92.i$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5363a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f205521d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f205522e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f205523f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f205525h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f205526j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f205527k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f205528l;

                public C5363a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f205521d = obj;
                    this.f205522e |= PKIFailureInfo.systemUnavail;
                    return C5362a.this.F(null, this);
                }
            }

            public C5362a(mu.h hVar, i iVar) {
                this.f205519a = hVar;
                this.f205520b = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5363a c5363a;
                if (eVar instanceof C5363a) {
                    c5363a = (C5363a) eVar;
                    int i15 = c5363a.f205522e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5363a.f205522e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5363a = new C5363a(eVar);
                    }
                } else {
                    c5363a = new C5363a(eVar);
                }
                Object obj2 = c5363a.f205521d;
                Object objE = uq.b.e();
                int i16 = c5363a.f205522e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f205519a;
                    v92.c.a aVarP9 = this.f205520b.p9((v92.b) obj);
                    c5363a.f205523f = vq.j.a(obj);
                    c5363a.f205525h = vq.j.a(c5363a);
                    c5363a.f205526j = vq.j.a(obj);
                    c5363a.f205527k = vq.j.a(hVar);
                    c5363a.f205528l = 0;
                    c5363a.f205522e = 1;
                    if (hVar.F(aVarP9, c5363a) == objE) {
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

        public a(mu.g gVar, i iVar) {
            this.f205517a = gVar;
            this.f205518b = iVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super v92.c.a> hVar, tq.e eVar) {
            Object objA = this.f205517a.a(new C5362a(hVar, this.f205518b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv92/a$a;", "<unused var>", "Lv92/b$b;", "Loq/i0;", "<anonymous>", "(Lv92/a$a;Lv92/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<v92.a.C5358a, v92.b.C5360b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205529e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f205529e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<v92.a.d> bVarY1 = i.this.Y1();
                v92.a.d.C5359a c5359a = v92.a.d.C5359a.f205485a;
                this.f205529e = 1;
                if (bVarY1.F(c5359a, this) == objE) {
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
        public final Object w(v92.a.C5358a c5358a, v92.b.C5360b c5360b, tq.e<? super i0> eVar) {
            return i.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv92/a$e;", "action", "Lv92/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lv92/a$e;Lv92/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<v92.a.OpenUrl, v92.b.C5360b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205531e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205532f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            v92.a.OpenUrl openUrl = (v92.a.OpenUrl) this.f205532f;
            Object objE = uq.b.e();
            int i15 = this.f205531e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = i.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f205532f = vq.j.a(openUrl);
                this.f205531e = 1;
                obj = wVar.c(params, this);
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
            i iVar2 = i.this;
            if (iVar instanceof dx.i.Left) {
                iVar2.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(v92.a.OpenUrl openUrl, v92.b.C5360b c5360b, tq.e<? super i0> eVar) {
            c cVar = i.this.new c(eVar);
            cVar.f205532f = openUrl;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv92/a$b;", "action", "Lv92/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lv92/a$b;Lv92/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<v92.a.GoToApplication, v92.b.C5360b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205535f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O() {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            v92.a.GoToApplication goToApplication = (v92.a.GoToApplication) this.f205535f;
            Object objE = uq.b.e();
            int i15 = this.f205534e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<v92.a.d> bVarY1 = i.this.Y1();
                v92.a.d.ShowDialog showDialog = new v92.a.d.ShowDialog(new DialogData(cb4.h.b.f24985a, i.this.labelProvider.c(s92.a.f179471f), i.this.labelProvider.c(s92.a.f179470e), new DialogButtonTextData(i.this.labelProvider.c(s92.a.f179466a), cb4.a.c.f24969a, i.this.b9(new v92.a.OpenUrl(goToApplication.getUrl()))), new DialogButtonTextData(i.this.labelProvider.c(s92.a.f179468c), null, new er.a() { // from class: v92.j
                    @Override // er.a
                    public final Object a() {
                        return i.d.O();
                    }
                }, 2, null), null, null, 96, null));
                this.f205535f = vq.j.a(goToApplication);
                this.f205534e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v92.a.GoToApplication goToApplication, v92.b.C5360b c5360b, tq.e<? super i0> eVar) {
            d dVar = i.this.new d(eVar);
            dVar.f205535f = goToApplication;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv92/a$c;", "<unused var>", "Lk10/c0;", "Lv92/b$b;", "state", "Lk10/l;", "Lv92/b;", "<anonymous>", "(Lv92/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<v92.a.c, c0<v92.b.C5360b>, tq.e<? super k10.l<? extends v92.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205538f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v92.b.a O(v92.b.C5360b c5360b) {
            return v92.b.a.f205488a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f205538f;
            uq.b.e();
            if (this.f205537e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: v92.k
                @Override // er.l
                public final Object b(Object obj2) {
                    return i.e.O((b.C5360b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v92.a.c cVar, c0<v92.b.C5360b> c0Var, tq.e<? super k10.l<? extends v92.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f205538f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv92/a$a;", "<unused var>", "Lk10/c0;", "Lv92/b$a;", "state", "Lk10/l;", "Lv92/b;", "<anonymous>", "(Lv92/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<v92.a.C5358a, c0<v92.b.a>, tq.e<? super k10.l<? extends v92.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205539e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205540f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v92.b.C5360b O(v92.b.a aVar) {
            return v92.b.C5360b.f205489a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f205540f;
            uq.b.e();
            if (this.f205539e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: v92.l
                @Override // er.l
                public final Object b(Object obj2) {
                    return i.f.O((b.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v92.a.C5358a c5358a, c0<v92.b.a> c0Var, tq.e<? super k10.l<? extends v92.b>> eVar) {
            f fVar = new f(eVar);
            fVar.f205540f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public i(yy.a aVar, a14.w wVar, w92.b bVar, mx.c cVar, i70.n nVar) {
        this.openUrlIntentUseCase = wVar;
        this.mapper = bVar;
        this.labelProvider = cVar;
        this.snackBarManagerStateHolder = nVar;
        v92.b.C5360b c5360b = v92.b.C5360b.f205489a;
        this.stateMachine = aVar.a(c5360b, new er.l() { // from class: v92.d
            @Override // er.l
            public final Object b(Object obj) {
                return i.t9(this.f205506a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), p9(c5360b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v92.c.a p9(v92.b state) {
        return this.mapper.b(new w92.b.Params(state, b9(v92.a.C5358a.f205482a), new er.l() { // from class: v92.e
            @Override // er.l
            public final Object b(Object obj) {
                return i.q9(this.f205507a, (String) obj);
            }
        }, new er.l() { // from class: v92.f
            @Override // er.l
            public final Object b(Object obj) {
                return i.r9(this.f205508a, (String) obj);
            }
        }, b9(v92.a.c.f205484a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(i iVar, String str) {
        iVar.d9(new v92.a.GoToApplication(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(i iVar, String str) {
        iVar.d9(new v92.a.OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final i iVar, k10.v vVar) {
        vVar.c(q0.c(v92.b.C5360b.class), new er.l() { // from class: v92.g
            @Override // er.l
            public final Object b(Object obj) {
                return i.u9(this.f205509a, (z) obj);
            }
        });
        vVar.c(q0.c(v92.b.a.class), new er.l() { // from class: v92.h
            @Override // er.l
            public final Object b(Object obj) {
                return i.v9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(i iVar, z zVar) {
        b bVar = iVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(v92.a.C5358a.class), oVar, bVar);
        zVar.x(q0.c(v92.a.OpenUrl.class), oVar, iVar.new c(null));
        zVar.x(q0.c(v92.a.GoToApplication.class), oVar, iVar.new d(null));
        zVar.v(q0.c(v92.a.c.class), oVar, new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(z zVar) {
        f fVar = new f(null);
        zVar.v(q0.c(v92.a.C5358a.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<v92.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<v92.b, v92.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<v92.c.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(v92.c.a aVar) {
        super.P5(aVar);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
