package dq1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import fr.q0;
import java.util.List;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wx.FileContent;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R#\u0010\u001e\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010#\u001a\n \u0019*\u0004\u0018\u00010\u001f0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R \u0010*\u001a\b\u0012\u0004\u0012\u00020%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R&\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030/8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010=\u001a\u00020:8\u0002X\u0082D¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Ldq1/n;", "Ll00/g;", "Ldq1/z;", "", "Ldq1/a0;", "Lyy/a;", "stateMachineFactory", "Ldq1/d;", "mapper", "Lyw/b;", "accessibilityTalkBackManager", "<init>", "(Lyy/a;Ldq1/d;Lyw/b;)V", "state", "Ldq1/a0$a;", "u9", "(Ldq1/z;)Ldq1/a0$a;", "b", "Ldq1/d;", "c", "Lyw/b;", "d", "Ldq1/z;", "initialState", "", "kotlin.jvm.PlatformType", "e", "Loq/k;", "t9", "()[B", "userMockedPhotoBytes", "Landroid/graphics/Bitmap;", "f", "s9", "()Landroid/graphics/Bitmap;", "userMockedPhoto", "Lxw/b;", "Ldq1/w;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "", "h", "I", "index", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "", "l", "Ljava/lang/String;", "mockedPhoto", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, Object> implements a0, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dq1.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k userMockedPhotoBytes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oq.k userMockedPhoto;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<w> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<a0.Data> state;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String mockedPhoto;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<a0.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f44011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f44012b;

        /* JADX INFO: renamed from: dq1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0987a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f44013a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f44014b;

            /* JADX INFO: renamed from: dq1.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0988a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f44015d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f44016e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f44017f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f44019h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f44020j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f44021k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f44022l;

                public C0988a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f44015d = obj;
                    this.f44016e |= PKIFailureInfo.systemUnavail;
                    return C0987a.this.F(null, this);
                }
            }

            public C0987a(mu.h hVar, n nVar) {
                this.f44013a = hVar;
                this.f44014b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0988a c0988a;
                if (eVar instanceof C0988a) {
                    c0988a = (C0988a) eVar;
                    int i15 = c0988a.f44016e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0988a.f44016e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0988a = new C0988a(eVar);
                    }
                } else {
                    c0988a = new C0988a(eVar);
                }
                Object obj2 = c0988a.f44015d;
                Object objE = uq.b.e();
                int i16 = c0988a.f44016e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f44013a;
                    a0.Data dataU9 = this.f44014b.u9((State) obj);
                    c0988a.f44017f = vq.j.a(obj);
                    c0988a.f44019h = vq.j.a(c0988a);
                    c0988a.f44020j = vq.j.a(obj);
                    c0988a.f44021k = vq.j.a(hVar);
                    c0988a.f44022l = 0;
                    c0988a.f44016e = 1;
                    if (hVar.F(dataU9, c0988a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f44011a = gVar;
            this.f44012b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super a0.Data> hVar, tq.e eVar) {
            Object objA = this.f44011a.a(new C0987a(hVar, this.f44012b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldq1/u;", "<unused var>", "Lk10/c0;", "Ldq1/z;", "state", "Lk10/l;", "<anonymous>", "(Ldq1/u;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<u, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44023e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44024f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(int i15, n nVar, State state) {
            List<b0> listC = state.c();
            if (i15 % 2 == 0) {
                listC.add(new b0.Image(nVar.s9(), "Image file " + i15, ((double) nVar.index) * jr.c.INSTANCE.d(1.0d, 3.26d)));
            } else {
                listC.add(new b0.Regular("Regular file " + i15, ((double) i15) * jr.c.INSTANCE.d(1.0d, 3.26d)));
            }
            return state.a(listC, false);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f44024f;
            uq.b.e();
            if (this.f44023e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            n.this.accessibilityTalkBackManager.a(c70.a.f23835a.a().q0().getText());
            final int i15 = n.this.index;
            n.this.index = i15 + 1;
            final n nVar = n.this;
            return c0Var.b(new er.l() { // from class: dq1.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.b.O(i15, nVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(u uVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = n.this.new b(eVar);
            bVar.f44024f = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldq1/v;", "action", "Lk10/c0;", "Ldq1/z;", "state", "Lk10/l;", "<anonymous>", "(Ldq1/v;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<DeleteFile, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44026e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44027f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f44028g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(DeleteFile deleteFile, State state) {
            List<b0> listC = state.c();
            listC.remove(deleteFile.getFile());
            return State.b(state, listC, false, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final DeleteFile deleteFile = (DeleteFile) this.f44027f;
            c0 c0Var = (c0) this.f44028g;
            uq.b.e();
            if (this.f44026e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: dq1.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.c.O(deleteFile, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(DeleteFile deleteFile, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f44027f = deleteFile;
            cVar.f44028g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldq1/x;", "<unused var>", "Lk10/c0;", "Ldq1/z;", "state", "Lk10/l;", "<anonymous>", "(Ldq1/x;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<x, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44030f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, State state) {
            return State.b(state, null, ((State) c0Var.a()).c().isEmpty(), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f44030f;
            uq.b.e();
            if (this.f44029e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (((State) c0Var.a()).c().isEmpty()) {
                n.this.accessibilityTalkBackManager.a("Dodanie pliku jest wymagane");
            }
            return c0Var.b(new er.l() { // from class: dq1.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.d.O(c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(x xVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = n.this.new d(eVar);
            dVar.f44030f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldq1/y;", "<unused var>", "Ldq1/z;", "Loq/i0;", "<anonymous>", "(Ldq1/y;Ldq1/z;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<PreviewFile, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44032e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f44032e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<w> bVarY1 = n.this.Y1();
                w.GoToImagePreview goToImagePreview = new w.GoToImagePreview(new dx3.a.Content(mx.b.b("Podgląd pliku", ""), new FileContent(n.this.t9())));
                this.f44032e = 1;
                if (bVarY1.F(goToImagePreview, this) == objE) {
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
        public final Object w(PreviewFile previewFile, State state, tq.e<? super i0> eVar) {
            return n.this.new e(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, dq1.d dVar, yw.b bVar) {
        this.mapper = dVar;
        this.accessibilityTalkBackManager = bVar;
        State state = new State(null, false, 3, null);
        this.initialState = state;
        this.userMockedPhotoBytes = oq.l.a(new er.a() { // from class: dq1.h
            @Override // er.a
            public final Object a() {
                return n.z9(this.f43995a);
            }
        });
        this.userMockedPhoto = oq.l.a(new er.a() { // from class: dq1.i
            @Override // er.a
            public final Object a() {
                return n.A9(this.f43996a);
            }
        });
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: dq1.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.x9(this.f43997a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), u9(state));
        this.mockedPhoto = "iVBORw0KGgoAAAANSUhEUgAAALQAAADGCAYAAAB7J6r4AAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAA7DSURBVHhe7Z37VxRHFoCLGYYZnoO8VFQQBUQUENS4GpMYY3Sj++cmumtcY9zdYzQKiA9UZMUHisjwfjMMO3dsTrLKdPdM36quun2/czzp8ReVfF1zq+6tews6uro3BMMQIWT9l2FIwEIzpGChGVKw0AwpWGiGFCw0QwoWmiEFC82QgoVmSMFCM6RgoRlSsNAMKVhohhQsNEMKFpohBQvNkIKFZkjBQjOkYKEZUvCdQovqXVHR2FUmCkIF1u98zttnC2JsaFlsbPCPTFcCL3RDR5mobYxZn9yxsrguHl6fsj4xOhHokKPnUk3OMgPRkrA4+rcaEQpnX80Zfwik0KF0WAFCFnj0sfuHalFRG7E+MToQSKG7L1ZbT95pOREXsbKw9Ynxm8AJDasqNofObLOeGL8JlNCR4pC0uLftdKX1xPhJoITuOCtvJS2tLLSeGD8JjNChdJhb4HUX6EDrybj1xPhFYIRu7KqwnuRRXs0nHn4TGKGr6ousJ7lw6OEvgRC6vErdynngSw47/CQQQu//Qn64sQnE6Xb1IIxcAiF0uFCtYHuPlFlPjGrIC936F/UhQFV91HpiVENe6PIaf04eVMbtzB+QFrq4wr8aC5VxO/MHpIVu/9q/GgvVcTvzEbJCS04KuqL9Gy5aUg1ZoRu6/D9pKC7nslLVkBW6ZnfuN1FkUFGtJkPJfISk0Dqln1tO8uZQJSSFbjmhl0Qhst+D+kHyRx2O6PXP2neMV2lVkBO6+Xi59aQP8TqOo1VBTuj4dj3TzhV1nDlUASmhoxrfvt5/lMMOFZASuv0rfS+qclMaNZASWndp2s/wzXDZkBF6d3up9aQvxWV8PUs2ZITevq/YetKbCj7xkAoJoU1qxdXCZaVSISF02ymzYtMQl5ZKg4TQ4SKzBNEtNU8J44Xe16NfZtCJsm2cZJGF8UJvM/RCatUePcpbqWG00NFScwvo93bof8xoIkYLfegbcxMV3IxGDkYLbboUHeeqrCcGC2OFrm8tsZ7MpShm/BZGO4z9ie4kIDQQ38GZQ0yMFLqwiM7K1sy3WVAx0ox2gzeDWxGO+LMXgE6pRcUhESsrFCUVhZkSgkKf/i5YGDlJFmYMUmJhOime/Hva+oQPvDA1e2KirimWFjj3o87Z8VUxNrwk5ibXhNDcFuOE3tNRJurymP6qO/d+nLCecIAz+rbT8fSKi/8lPD6yLEYfL4hUSj91jBOa2uq8yejgQmYV9ArcMN+maKO5kRJi8OaUWJpft37Hf4yKoU3ODDqxq81b5rD1VEXmZVclM1CQtqf9zDbRc6laVG7X47TGKKEPUW5+mN6L5ZMo2nO4LCNyeZV/QsHmcv/xjy9Uic9dq4wSGlYEynR+5/6FhdMIEKhur177iYOnK0XXef8yoMYosqOFRiLFjsKou/8dDemNcdcF/JnlWECeAF62SEx9iGiM0LsO0Bf6+Z056yk7sPrVGnLK03lum/IBSkYIHYSeFv/tmxMz4yvWp8+B0c6w6pmWJa3eHVMaghjx0/FztIQKHt6YElOjNjIXFojuH8w9rtwMQVRghNDRUrNWpVzo/3tCrNic48IJQvdf9Y2Xc6HnknyptTdlR7MZ/Tbyof9qQqwn7fNacMZLBZh7c+SC3PBDe6G9Jhx0Zei3GbG+ai+zqq9plUDvbpkxtdZCR0tohhofXi2L2Yk169PWUJR5E4ip97TLObXS2hiKY9E2NjbEq4F569PWBKFvR92+EikLltbFSRRXqd6fJtJSWx+2oLgsnKmPkMXok0Uxkf6GSK6mrN/JTk1DTDR2yj1Hxq4y1Fbo+gMlYiex7OBI/5xIvMl+PAfIeImTKylx/9qkp1pm+NaoqMWvF5lLrIlnt2asT97RNuSgJjOsyk4yywix+q4kxP2fvckMDN2ezaymqXXc9a+8OpJeVq0PCNDcdWnI/asJ6yk7mJNn15bXpQgIL8jIfecUfS5gnrNrKfThs7T6VcBZ8/qavVgdOVTaOQFx8sC1KesTPonXK2IAVn0koLQBK6WvpdDUjusG/2V/XxASDvnc9duKkYF5MfZ80fokj7V0XI65oev8HueF1s4cih3uVxbsryjtO4bTQTXxZlkkXi1bn9Tw5D84l3shxY/RCUs7oal1uH/1wP7MGahEmK0IYc1Iv/Ofhc3CVFKMDeN8IzQhtEbWSugilwXuJvHhpf2KmdnlIwBFTn4xOogjNMZ9SK0MOvBl3HqiAWQFndiLsCq9R7gt7pXen3BeKK+bQ71W6BJat7pfDixYT9nB+FZ6M+j858gGXt6kQ+WgGxq7vBWjaSM0ZAapkXhtH27A6YZX3j6Vf6LhlkfXvR8VVtZ5209oIzS1zKAbmrq9hxvvhvQR2k19iCMeX3IthMZYqXTDqXAfMHU+jB0z46vWkwc8+KCF0Ie+pVcmujyftJ7kMfnOvjbEDzDamXmZCqyF0FFim0FgegxhpXIAGibqxnzC/uKCG6BTar74LnRck55o2DgJjdGaYW0ZIWbVEOhZnS++C918nObtjNUle9kwjutcHHMbiZeX3VehKc+8dirbDEfp/tu94uVF9VXoA6doZQZzwbQOSCrxcurl608V5noElSC0N/MD34Sua6LbQMYNGDdJ+KX4HN+E3nOI9qxrp/0BRlatkOjgTuNiaIqZwU+JOsiWdOia5IYWpIsBmBTHvYeRXvTwRehD39K6M7gV8Z32aW2MM+RYuX57kO1N3ntXewnHfBGaaouvP+M0RAfrNjZcXdIJ6AftlYWZ/MsGlJslo1mJjkAHJBXsltQjLh9CCHcCAS8XFpQLHYS+bYCqpJFOp0Ud53CKzLxU7CkVOkw4M5gPM+9xCphUzzHJhg7JIqV/g/3HgrE6b+JUBjl8F6cDEUbc6hWsnnzrSW+bZaVCl9fg3HA2hV0H7c/a3VyidYuKcQ/ZwOz1POFwS94JZUJX7aZ3O8OJzAGEQ5SFcm0pDfxZB7+qtD6po7wqkun1jMWbJ96ulCkTurFDvySACpxmCr68j9ccpiReqDQDC3uiVuwCM49fWsqEhjl7QaThsP2GbRppY7gJnHo0K9irRKIhcQR5OtfoU+83cJQIffgsvTuDuRAttX+b5ydx7x/GdxRJHZ1ctSsqOr/Hz/aODXm/j6hEaIp3BnOh/Wv72PbZb3gd7DfZHG4PYQgmneeqUdovfMrqkn1DS7dIFxqrd5vJQJlnsU3t90Zqw1Xbg3yAjWLPxWoR85C5hPQ6JMTgBYnE5OQSHv+K1MVU9owVioN/8gFO6GBgUDYK0ktLz0X5P6v3L5YyX+1Opyuh9N8Hip9UnJzAy4zVbFKq0JkZ1UTG+mIw0jcrEqPZN4EgNIitEpgskLLchj87nP4iUV3wBI0esc7kpf749iF01qTE3m7704fey7gjztwQTsfakejHXxB3q5Z5cSaJmmCSKnScYDd+rzQ7NHSfxWilZRBO4zpyRZrQVBvIeAVecrtFcOjOrPVEH4y2YZ8iTej9R4NViJQLRxzOiN2MsaDAqIS+1tKEVr25MQnYLJdUZj/GcxpjQYFHN3FDjU2kaHfwdHAbyLjl4Gn74zDMOYC6Acd0y7NyurNKEbqkkpMpbmg+kf3FhzmAWJV4uiFzwBG60KXIqVbKxGsjtrd47l+lt0pPvpUbTqEL3eZDTa7JdJ23L/KhtkF80Sv334MqNKRLmdyA6alQvZYN2CBCrQcFHt+UN398E1QFm/ioLi+cqtf6rvg3VBOLjfR2YGkWp6LODlShnZqrMNk5bDNnBjLD0+/1m6eSC71X1KT10YSmOHReJXAJoLAo+wZx+HecG+J+8PphOm5WFDWhCc2FSN7pOm+fQRz42bzQA1qejY+oSxShCc1NZHBo6Mx+B3FtZUOsLMiPQzFRPVQfRWid+quZTm1DzLZs4OEv8k8KsICVGbEy1BUoQtc2BrsbPzZOlyJG+s2IpzOxs2JQhObRCLjA2fTO1uzfeok3+p94qA41NkGLoRlc6tNC290euWdzP9FvluaT0i79OsFCa0z3RZvQI+3L2LC3tlmyeHxDTmmoG1hojYEFuqIue+Xi6OCi8k2XE1jtCPIFRWgqtQY60vKFfW15nw8Xa7MBqe2lOTl1zm5BEXrKYVA7442O7+zT4qNP9Qg9VBQfOYEi9Itec9OyJlBUHLYdtDQ25L/QD6/rUbuNFkNjTXVitubwWfu66T6fjsmA1eWUWFnU43YNmtAP/mlOBstUOm2G8qSSG75V5D24ps/NGjSh4f7bDMfSUonEwplf2fCjIm/otl59RNCEBp7fnRUpPvGQit0qDfT/Q13oAWHm7Ae9FjFUoYG+ywmxPG9WRZhpNNmU6kLzxclRNaGHjjdp0IUGHt2YEs8D1NJKNVX19gOYXvTJDz0GNIqb/4wUoQGYBnrvxwkji9JNwGkkhMxTDxi8jzF8XwbSG57rSteFKlEY8f4+D96cFouSugBlAya2RotDjkPeD5yMizIJExRgodIVaSs0Iw84UXKSGXh6awa91kP3UJKFJg7mGXHmaFbz/tUsNHGgR940Un7AhNZkLHQAGL7rPUww5S4jCx0QvJwZryykjLltzkIHBMjqzYznl3B5+Iv+ocYmLHSAeH5nTuQ6cerpLX9voOQKCx0w+q+4X21nP6yJ+YS/N1ByhYUOGFA85mbcxfT7VTF0G38GuWxY6AACR3mQ7Zt69/lxHqS0ey8nxPDvZtbicOrbI36kvpns8ArNkIKFZkjBQjOkYKEZUrDQDCkCK/TaEs7hTnItkIdE2hJYoafHcC6Sri7xhWCdCKzQuraiZbwRWKFTCAurialh6gR6Uwg9RPLlY5OVNesTowuBFhoKdR79mt9NDArjiikSaKGB5bn1nJum6DzfJOgEtjhpK+rbSsTO5q2nT0Fd/PCdWTGjWS835v9hoRlSBD7kYGjBQjOkYKEZUrDQDClYaIYULDRDChaaIQULzZCChWZIwUIzpGChGVKw0AwpWGiGFCw0QwoWmiEFC82QgoVmSMFCM6RgoRlSsNAMKVhohhQsNEMKFpohBQvNEEKI/wHB37T6AQz2eAAAAABJRU5ErkJggg==\n";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap A9(n nVar) {
        return BitmapFactory.decodeByteArray(nVar.t9(), 0, nVar.t9().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap s9() {
        return (Bitmap) this.userMockedPhoto.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] t9() {
        return (byte[]) this.userMockedPhotoBytes.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a0.Data u9(State state) {
        return this.mapper.b(new dq1.d.Params(state, new er.l() { // from class: dq1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.v9(this.f43999a, (b0) obj);
            }
        }, new er.l() { // from class: dq1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.w9(this.f44000a, (b0) obj);
            }
        }, b9(x.f44043a), b9(u.f44040a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(n nVar, b0 b0Var) {
        nVar.d9(new DeleteFile(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(n nVar, b0 b0Var) {
        nVar.d9(new PreviewFile(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(final n nVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: dq1.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.y9(this.f43998a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(n nVar, k10.z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(u.class), oVar, bVar);
        zVar.v(q0.c(DeleteFile.class), oVar, new c(null));
        zVar.v(q0.c(x.class), oVar, nVar.new d(null));
        zVar.x(q0.c(PreviewFile.class), oVar, nVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] z9(n nVar) {
        return Base64.decode(nVar.mockedPhoto, 2);
    }

    @Override // zx.b
    public /* bridge */ void P5(Object obj) {
        super.P5(obj);
    }

    @Override // zx.b
    public xw.b<w> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<a0.Data> getState() {
        return this.state;
    }
}
