package gz3;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import mu.p0;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wx.DomainFile;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BK\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0018\u0010,\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R&\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030?8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010P\u001a\b\u0012\u0004\u0012\u00020K0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010S¨\u0006U"}, d2 = {"Lgz3/a0;", "Ll00/g;", "Lgz3/i;", "", "Li70/n;", "Lgz3/j;", "Lez3/c;", "Lyy/a;", "stateMachineFactory", "snackBarManagerStateHolder", "Lhz3/a;", "webPreviewScreenMapper", "La14/z;", "saveDownloadedFileUseCase", "Lmx/c;", "labelProvider", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lcb4/j;", "dialogVMSFactory", "Lez3/a;", "webPreviewData", "<init>", "(Lyy/a;Li70/n;Lhz3/a;La14/z;Lmx/c;La14/m;Lcb4/j;Lez3/a;)V", "state", "Lgz3/j$a;", "t9", "(Lgz3/i;)Lgz3/j$a;", "Lgz3/i$a;", "Loq/i0;", "v9", "(Lgz3/i$a;Ltq/e;)Ljava/lang/Object;", "Lu04/b;", "downloadStatus", "s9", "(Lu04/b;)V", "x9", "r9", "(Ltq/e;)Ljava/lang/Object;", "Lcb4/d;", "q9", "()Lcb4/d;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "c", "Lhz3/a;", "d", "La14/z;", "e", "Lmx/c;", "f", "La14/m;", "g", "Lcb4/j;", "h", "Lez3/a;", "j", "Lgz3/i;", "initializedState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lez3/c$a;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "webpreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 extends l00.g<gz3.i, Object> implements i70.n, gz3.j, ez3.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ i70.n f78684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hz3.a webPreviewScreenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a14.z saveDownloadedFileUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ez3.a webPreviewData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final gz3.i initializedState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<gz3.i, Object> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<gz3.j.Data> state;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ez3.c.a> navAction;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78695a;

        static {
            int[] iArr = new int[u04.b.values().length];
            try {
                iArr[u04.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u04.b.NOT_PERMISSION_GRANTED_GO_TO_SETTINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f78695a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f78696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f78697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78698f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f78700h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f78698f = obj;
            this.f78700h |= PKIFailureInfo.systemUnavail;
            return a0.this.v9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lwx/a;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends DomainFile>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78701e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ DomainFile f78702f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(DomainFile domainFile, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f78702f = domainFile;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f78701e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return new dx.i.Right(this.f78702f);
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new c(this.f78702f, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, DomainFile>> eVar) {
            return ((c) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<gz3.j.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f78703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f78704b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f78705a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f78706b;

            /* JADX INFO: renamed from: gz3.a0$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1798a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f78707d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f78708e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f78709f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f78711h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f78712j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f78713k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f78714l;

                public C1798a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f78707d = obj;
                    this.f78708e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, a0 a0Var) {
                this.f78705a = hVar;
                this.f78706b = a0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1798a c1798a;
                if (eVar instanceof C1798a) {
                    c1798a = (C1798a) eVar;
                    int i15 = c1798a.f78708e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1798a.f78708e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1798a = new C1798a(eVar);
                    }
                } else {
                    c1798a = new C1798a(eVar);
                }
                Object obj2 = c1798a.f78707d;
                Object objE = uq.b.e();
                int i16 = c1798a.f78708e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f78705a;
                    gz3.j.Data dataT9 = this.f78706b.t9((gz3.i) obj);
                    c1798a.f78709f = vq.j.a(obj);
                    c1798a.f78711h = vq.j.a(c1798a);
                    c1798a.f78712j = vq.j.a(obj);
                    c1798a.f78713k = vq.j.a(hVar);
                    c1798a.f78714l = 0;
                    c1798a.f78708e = 1;
                    if (hVar.F(dataT9, c1798a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public d(mu.g gVar, a0 a0Var) {
            this.f78703a = gVar;
            this.f78704b = a0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super gz3.j.Data> hVar, tq.e eVar) {
            Object objA = this.f78703a.a(new a(hVar, this.f78704b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgz3/a;", "<unused var>", "Lgz3/i;", "Loq/i0;", "<anonymous>", "(Lgz3/a;Lgz3/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<gz3.a, gz3.i, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78715e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f78715e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ez3.c.a> bVarY1 = a0.this.Y1();
                ez3.c.a.C1284a c1284a = ez3.c.a.C1284a.f54455a;
                this.f78715e = 1;
                if (bVarY1.F(c1284a, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gz3.a aVar, gz3.i iVar, tq.e<? super oq.i0> eVar) {
            return a0.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgz3/h;", "action", "Lk10/c0;", "Lgz3/i$a$b;", "state", "Lk10/l;", "Lgz3/i;", "<anonymous>", "(Lgz3/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ShowDialog, k10.c0<gz3.i.a.Initialized>, tq.e<? super k10.l<? extends gz3.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78717e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78718f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f78719g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gz3.i.a.Dialog O(k10.c0 c0Var, a0 a0Var, ShowDialog showDialog, gz3.i.a.Initialized initialized) {
            return new gz3.i.a.Dialog(((gz3.i.a.Initialized) c0Var.a()).getFileName(), ((gz3.i.a.Initialized) c0Var.a()).getByteArrayOutputStream(), a0Var.dialogVMSFactory.a(showDialog.getDialogData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowDialog showDialog = (ShowDialog) this.f78718f;
            final k10.c0 c0Var = (k10.c0) this.f78719g;
            uq.b.e();
            if (this.f78717e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final a0 a0Var = a0.this;
            return c0Var.d(new er.l() { // from class: gz3.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.f.O(c0Var, a0Var, showDialog, (i.a.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowDialog showDialog, k10.c0<gz3.i.a.Initialized> c0Var, tq.e<? super k10.l<? extends gz3.i>> eVar) {
            f fVar = a0.this.new f(eVar);
            fVar.f78718f = showDialog;
            fVar.f78719g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgz3/g;", "<unused var>", "Lgz3/i$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lgz3/g;Lgz3/i$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<gz3.g, gz3.i.a.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78721e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78722f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gz3.i.a.Initialized initialized = (gz3.i.a.Initialized) this.f78722f;
            Object objE = uq.b.e();
            int i15 = this.f78721e;
            if (i15 == 0) {
                oq.u.b(obj);
                a0 a0Var = a0.this;
                this.f78722f = vq.j.a(initialized);
                this.f78721e = 1;
                if (a0Var.v9(initialized, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gz3.g gVar, gz3.i.a.Initialized initialized, tq.e<? super oq.i0> eVar) {
            g gVar2 = a0.this.new g(eVar);
            gVar2.f78722f = initialized;
            return gVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgz3/b;", "<unused var>", "Lk10/c0;", "Lgz3/i$a$a;", "state", "Lk10/l;", "Lgz3/i;", "<anonymous>", "(Lgz3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<gz3.b, k10.c0<gz3.i.a.Dialog>, tq.e<? super k10.l<? extends gz3.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78725f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gz3.i.a.Initialized O(k10.c0 c0Var, gz3.i.a.Dialog dialog) {
            return new gz3.i.a.Initialized(((gz3.i.a.Dialog) c0Var.a()).getFileName(), ((gz3.i.a.Dialog) c0Var.a()).getByteArrayOutputStream());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f78725f;
            uq.b.e();
            if (this.f78724e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: gz3.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.h.O(c0Var, (i.a.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gz3.b bVar, k10.c0<gz3.i.a.Dialog> c0Var, tq.e<? super k10.l<? extends gz3.i>> eVar) {
            h hVar = new h(eVar);
            hVar.f78725f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgz3/d;", "<unused var>", "Lgz3/i$a$a;", "Loq/i0;", "<anonymous>", "(Lgz3/d;Lgz3/i$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<gz3.d, gz3.i.a.Dialog, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78726e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f78726e;
            if (i15 == 0) {
                oq.u.b(obj);
                a0 a0Var = a0.this;
                this.f78726e = 1;
                if (a0Var.r9(this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gz3.d dVar, gz3.i.a.Dialog dialog, tq.e<? super oq.i0> eVar) {
            return a0.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgz3/e;", "action", "Lk10/c0;", "Lgz3/i$b;", "state", "Lk10/l;", "Lgz3/i;", "<anonymous>", "(Lgz3/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<PageLoaded, k10.c0<gz3.i.PDF>, tq.e<? super k10.l<? extends gz3.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78729f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f78730g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gz3.i.PDF V(gz3.i.PDF pdf) {
            return gz3.i.PDF.b(pdf, null, null, null, null, null, false, null, 95, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gz3.i.PDF X(gz3.i.PDF pdf) {
            return gz3.i.PDF.b(pdf, null, null, null, null, null, true, null, 95, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            PageLoaded pageLoaded = (PageLoaded) this.f78729f;
            k10.c0 c0Var = (k10.c0) this.f78730g;
            uq.b.e();
            if (this.f78728e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (pageLoaded.getIsLoaded() && ((gz3.i.PDF) c0Var.a()).getFailedLoading()) {
                return c0Var.b(new er.l() { // from class: gz3.d0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return a0.j.V((i.PDF) obj2);
                    }
                });
            }
            return (pageLoaded.getIsLoaded() || ((gz3.i.PDF) c0Var.a()).getFailedLoading()) ? c0Var.c() : c0Var.b(new er.l() { // from class: gz3.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.j.X((i.PDF) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(PageLoaded pageLoaded, k10.c0<gz3.i.PDF> c0Var, tq.e<? super k10.l<? extends gz3.i>> eVar) {
            j jVar = new j(eVar);
            jVar.f78729f = pageLoaded;
            jVar.f78730g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgz3/f;", "<unused var>", "Lk10/c0;", "Lgz3/i$b;", "state", "Lk10/l;", "Lgz3/i;", "<anonymous>", "(Lgz3/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<gz3.f, k10.c0<gz3.i.PDF>, tq.e<? super k10.l<? extends gz3.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78732f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gz3.i.PDF O(k10.c0 c0Var, gz3.i.PDF pdf) {
            return gz3.i.PDF.b(pdf, null, ((gz3.i.PDF) c0Var.a()).getUrl(), null, null, null, false, null, 125, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f78732f;
            uq.b.e();
            if (this.f78731e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: gz3.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.k.O(c0Var, (i.PDF) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gz3.f fVar, k10.c0<gz3.i.PDF> c0Var, tq.e<? super k10.l<? extends gz3.i>> eVar) {
            k kVar = new k(eVar);
            kVar.f78732f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgz3/c;", "<unused var>", "Lgz3/i$b;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Lgz3/c;Lgz3/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<gz3.c, gz3.i.PDF, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78734f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gz3.i.PDF pdf = (gz3.i.PDF) this.f78734f;
            uq.b.e();
            if (this.f78733e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            pdf.c().a();
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gz3.c cVar, gz3.i.PDF pdf, tq.e<? super oq.i0> eVar) {
            l lVar = new l(eVar);
            lVar.f78734f = pdf;
            return lVar.J(oq.i0.f148189a);
        }
    }

    public a0(yy.a aVar, i70.n nVar, hz3.a aVar2, a14.z zVar, mx.c cVar, a14.m mVar, cb4.j jVar, ez3.a aVar3) {
        gz3.i pdf;
        this.f78684b = nVar;
        this.webPreviewScreenMapper = aVar2;
        this.saveDownloadedFileUseCase = zVar;
        this.labelProvider = cVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.dialogVMSFactory = jVar;
        this.webPreviewData = aVar3;
        if (aVar3 instanceof ez3.a.File) {
            String fileName = ((ez3.a.File) aVar3).getDomainFile().getFileName();
            InputStream inputStream = ((ez3.a.File) aVar3).getDomainFile().getInputStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ar.a.b(inputStream, byteArrayOutputStream, 0, 2, null);
                ar.b.a(inputStream, null);
                pdf = new gz3.i.a.Initialized(fileName, byteArrayOutputStream);
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ar.b.a(inputStream, th4);
                    throw th5;
                }
            }
        } else if (aVar3 instanceof ez3.a.Text) {
            pdf = new gz3.i.Text(((ez3.a.Text) aVar3).getText());
        } else {
            if (!(aVar3 instanceof ez3.a.PDF)) {
                throw new oq.p();
            }
            pdf = new gz3.i.PDF(((ez3.a.PDF) aVar3).getScreenTitle(), ((ez3.a.PDF) aVar3).getPdfUrl(), ((ez3.a.PDF) aVar3).getErrorTitle(), ((ez3.a.PDF) aVar3).getErrorDescription(), ((ez3.a.PDF) aVar3).getErrorButtonLabel(), false, ((ez3.a.PDF) aVar3).a(), 32, null);
        }
        this.initializedState = pdf;
        this.stateMachine = aVar.a(pdf, new er.l() { // from class: gz3.z
            @Override // er.l
            public final Object b(Object obj) {
                return a0.y9(this.f78794a, (k10.v) obj);
            }
        });
        this.state = a9(new d(e9().getState(), this), t9(pdf));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(a0 a0Var, k10.z zVar) {
        f fVar = a0Var.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(ShowDialog.class), oVar, fVar);
        zVar.x(q0.c(gz3.g.class), oVar, a0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(a0 a0Var, k10.z zVar) {
        h hVar = new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(gz3.b.class), oVar, hVar);
        zVar.x(q0.c(gz3.d.class), oVar, a0Var.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(k10.z zVar) {
        j jVar = new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(PageLoaded.class), oVar, jVar);
        zVar.v(q0.c(gz3.f.class), oVar, new k(null));
        zVar.x(q0.c(gz3.c.class), oVar, new l(null));
        return oq.i0.f148189a;
    }

    private final DialogData q9() {
        cb4.h.b bVar = cb4.h.b.f24985a;
        Label labelC = this.labelProvider.c(dz3.a.f45701j);
        Label labelC2 = this.labelProvider.c(dz3.a.f45699h);
        DialogButtonTextData dialogButtonTextData = new DialogButtonTextData(this.labelProvider.c(dz3.a.f45697f), null, b9(gz3.d.f78741a), 2, null);
        Label labelC3 = this.labelProvider.c(dz3.a.f45698g);
        cb4.a.C0668a c0668a = cb4.a.C0668a.f24967a;
        gz3.b bVar2 = gz3.b.f78735a;
        return new DialogData(bVar, labelC, labelC2, dialogButtonTextData, new DialogButtonTextData(labelC3, c0668a, b9(bVar2)), null, b9(bVar2), 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r9(tq.e<? super oq.i0> eVar) {
        dx.i<? extends dx.b.Business, ? extends oq.i0> iVarA = this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
        if (iVarA instanceof dx.i.Left) {
            x9(u04.b.NOT_PERMISSION_GRANTED_GO_TO_SETTINGS);
        }
        return oq.i0.f148189a;
    }

    private final void s9(u04.b downloadStatus) {
        x9(downloadStatus);
        if (downloadStatus == u04.b.NOT_PERMISSION_GRANTED_GO_TO_SETTINGS) {
            d9(new ShowDialog(q9()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gz3.j.Data t9(gz3.i state) {
        return this.webPreviewScreenMapper.b(new hz3.a.Params(state, b9(gz3.a.f78683a), b9(gz3.g.f78745a), new er.l() { // from class: gz3.u
            @Override // er.l
            public final Object b(Object obj) {
                return a0.u9(this.f78790a, ((Boolean) obj).booleanValue());
            }
        }, b9(gz3.f.f78743a), b9(gz3.c.f78739a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u9(a0 a0Var, boolean z15) {
        a0Var.d9(new PageLoaded(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v9(gz3.i.a aVar, tq.e<? super oq.i0> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f78700h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f78700h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f78698f;
        Object objE = uq.b.e();
        int i16 = bVar.f78700h;
        if (i16 == 0) {
            oq.u.b(objC);
            DomainFile domainFile = new DomainFile(new ByteArrayInputStream(aVar.getByteArrayOutputStream().toByteArray()), aVar.getFileName());
            a14.z zVar = this.saveDownloadedFileUseCase;
            a14.z.Params aVar2 = new a14.z.Params(new c(domainFile, null));
            bVar.f78696d = vq.j.a(aVar);
            bVar.f78697e = vq.j.a(domainFile);
            bVar.f78700h = 1;
            objC = zVar.c(aVar2, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            s9(u04.b.FILE_NOT_SAVED);
        } else {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            s9((u04.b) ((dx.i.Right) iVar).b());
        }
        return oq.i0.f148189a;
    }

    private final void x9(u04.b downloadStatus) {
        int i15;
        int i16 = a.f78695a[downloadStatus.ordinal()];
        if (i16 != 1) {
            i15 = i16 != 2 ? dz3.a.f45693b : dz3.a.f45700i;
        } else {
            i15 = dz3.a.f45694c;
        }
        y(new p50.a.DefaultWithIcon(this.labelProvider.c(i15), false, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y9(final a0 a0Var, k10.v vVar) {
        vVar.c(q0.c(gz3.i.class), new er.l() { // from class: gz3.v
            @Override // er.l
            public final Object b(Object obj) {
                return a0.z9(this.f78791a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(gz3.i.a.Initialized.class), new er.l() { // from class: gz3.w
            @Override // er.l
            public final Object b(Object obj) {
                return a0.A9(this.f78792a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(gz3.i.a.Dialog.class), new er.l() { // from class: gz3.x
            @Override // er.l
            public final Object b(Object obj) {
                return a0.B9(this.f78793a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(gz3.i.PDF.class), new er.l() { // from class: gz3.y
            @Override // er.l
            public final Object b(Object obj) {
                return a0.C9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z9(a0 a0Var, k10.z zVar) {
        e eVar = a0Var.new e(null);
        zVar.x(q0.c(gz3.a.class), k10.o.CANCEL_PREVIOUS, eVar);
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.f78684b.B0();
    }

    @Override // zx.b
    public xw.b<ez3.c.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<gz3.i, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<gz3.j.Data> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.f78684b.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ez3.a aVar) {
        super.P5(aVar);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.f78684b.y(snackBarData);
    }
}
