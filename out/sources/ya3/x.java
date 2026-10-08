package ya3;

import ab3.PanBounds;
import ab3.Transformation;
import android.graphics.Bitmap;
import fr.q0;
import fx.Rectangle;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0018\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010!J#\u0010$\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0016H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00106\u001a\b\u0012\u0004\u0012\u000201008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R&\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003078\u0014X\u0094\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010&\u001a\b\u0012\u0004\u0012\u00020'0=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lya3/x;", "Ll00/g;", "Lya3/e$b;", "", "Lya3/e$c;", "Lyy/a;", "stateMachineFactory", "Lza3/a;", "mapper", "Lya3/f;", "data", "<init>", "(Lyy/a;Lza3/a;Lya3/f;)V", "Lk10/c0;", "Lfx/e;", "container", "r9", "(Lk10/c0;Lfx/e;)Lfx/e;", "Lya3/e$b$a;", "Lm3/e;", "centroid", "panChange", "", "newScale", "s9", "(Lya3/e$b$a;JJF)J", "imageContainer", "scale", "Lab3/a;", "t9", "(Lfx/e;Lfx/e;F)Lab3/a;", "maxDiff", "u9", "(FF)F", "oldBounds", "newBounds", "z9", "(FFF)F", "state", "Lya3/e$c$a;", "w9", "(Lya3/e$b;)Lya3/e$c$a;", "b", "Lza3/a;", "Lya3/e$b$b;", "c", "Lya3/e$b$b;", "initialState", "Lxw/b;", "Lya3/a;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<ya3.e.b, Object> implements ya3.e.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final za3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ya3.e.b.Measuring initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ya3.a> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ya3.e.b, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<ya3.e.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ya3.e.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f225859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f225860b;

        /* JADX INFO: renamed from: ya3.x$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6048a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f225861a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f225862b;

            /* JADX INFO: renamed from: ya3.x$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6049a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f225863d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f225864e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f225865f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f225867h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f225868j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f225869k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f225870l;

                public C6049a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f225863d = obj;
                    this.f225864e |= PKIFailureInfo.systemUnavail;
                    return C6048a.this.F(null, this);
                }
            }

            public C6048a(mu.h hVar, x xVar) {
                this.f225861a = hVar;
                this.f225862b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6049a c6049a;
                if (eVar instanceof C6049a) {
                    c6049a = (C6049a) eVar;
                    int i15 = c6049a.f225864e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6049a.f225864e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6049a = new C6049a(eVar);
                    }
                } else {
                    c6049a = new C6049a(eVar);
                }
                Object obj2 = c6049a.f225863d;
                Object objE = uq.b.e();
                int i16 = c6049a.f225864e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f225861a;
                    ya3.e.c.Data dataW9 = this.f225862b.w9((ya3.e.b) obj);
                    c6049a.f225865f = vq.j.a(obj);
                    c6049a.f225867h = vq.j.a(c6049a);
                    c6049a.f225868j = vq.j.a(obj);
                    c6049a.f225869k = vq.j.a(hVar);
                    c6049a.f225870l = 0;
                    c6049a.f225864e = 1;
                    if (hVar.F(dataW9, c6049a) == objE) {
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

        public a(mu.g gVar, x xVar) {
            this.f225859a = gVar;
            this.f225860b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ya3.e.c.Data> hVar, tq.e eVar) {
            Object objA = this.f225859a.a(new C6048a(hVar, this.f225860b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lya3/b;", "<unused var>", "Lya3/e$b;", "Loq/i0;", "<anonymous>", "(Lya3/b;Lya3/e$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ya3.b, ya3.e.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225871e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f225871e;
            if (i15 == 0) {
                oq.u.b(obj);
                x xVar = x.this;
                ya3.a.C6045a c6045a = ya3.a.C6045a.f225802a;
                this.f225871e = 1;
                if (xVar.F(c6045a, this) == objE) {
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
        public final Object w(ya3.b bVar, ya3.e.b bVar2, tq.e<? super i0> eVar) {
            return x.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lya3/c;", "action", "Lk10/c0;", "Lya3/e$b$b;", "state", "Lk10/l;", "Lya3/e$b;", "<anonymous>", "(Lya3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OnContainerChanged, k10.c0<ya3.e.b.Measuring>, tq.e<? super k10.l<? extends ya3.e.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225873e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f225874f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f225875g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ya3.e.b.Initialized O(x xVar, k10.c0 c0Var, OnContainerChanged onContainerChanged, ya3.e.b.Measuring measuring) {
            return new ya3.e.b.Initialized(measuring.getImage(), 0.0f, 0L, xVar.r9(c0Var, onContainerChanged.getContainer()), onContainerChanged.getContainer(), 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnContainerChanged onContainerChanged = (OnContainerChanged) this.f225874f;
            final k10.c0 c0Var = (k10.c0) this.f225875g;
            uq.b.e();
            if (this.f225873e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final x xVar = x.this;
            return c0Var.d(new er.l() { // from class: ya3.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.c.O(xVar, c0Var, onContainerChanged, (e.b.Measuring) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnContainerChanged onContainerChanged, k10.c0<ya3.e.b.Measuring> c0Var, tq.e<? super k10.l<? extends ya3.e.b>> eVar) {
            c cVar = x.this.new c(eVar);
            cVar.f225874f = onContainerChanged;
            cVar.f225875g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lya3/c;", "action", "Lk10/c0;", "Lya3/e$b$a;", "state", "Lk10/l;", "Lya3/e$b;", "<anonymous>", "(Lya3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<OnContainerChanged, k10.c0<ya3.e.b.Initialized>, tq.e<? super k10.l<? extends ya3.e.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225877e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f225878f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f225879g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ya3.e.b.Initialized O(OnContainerChanged onContainerChanged, long j15, Rectangle rectangle, ya3.e.b.Initialized initialized) {
            return ya3.e.b.Initialized.f(initialized, null, 0.0f, j15, rectangle, onContainerChanged.getContainer(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnContainerChanged onContainerChanged = (OnContainerChanged) this.f225878f;
            k10.c0 c0Var = (k10.c0) this.f225879g;
            uq.b.e();
            if (this.f225877e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (fr.t.c(onContainerChanged.getContainer(), ((ya3.e.b.Initialized) c0Var.a()).getContainer())) {
                return c0Var.c();
            }
            Object objA = c0Var.a();
            x xVar = x.this;
            ya3.e.b.Initialized initialized = (ya3.e.b.Initialized) objA;
            final Rectangle rectangleR9 = xVar.r9(c0Var, onContainerChanged.getContainer());
            PanBounds panBoundsT9 = xVar.t9(initialized.getImageContainer(), initialized.getContainer(), initialized.getScale());
            PanBounds panBoundsT10 = xVar.t9(rectangleR9, onContainerChanged.getContainer(), initialized.getScale());
            float fZ9 = xVar.z9(Float.intBitsToFloat((int) (initialized.getOffset() >> 32)), panBoundsT9.getX(), panBoundsT10.getX());
            float fZ10 = xVar.z9(Float.intBitsToFloat((int) (initialized.getOffset() & BodyPartID.bodyIdMax)), panBoundsT9.getY(), panBoundsT10.getY());
            final long jE = m3.e.e((((long) Float.floatToRawIntBits(fZ9)) << 32) | (((long) Float.floatToRawIntBits(fZ10)) & BodyPartID.bodyIdMax));
            return c0Var.b(new er.l() { // from class: ya3.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.d.O(onContainerChanged, jE, rectangleR9, (e.b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnContainerChanged onContainerChanged, k10.c0<ya3.e.b.Initialized> c0Var, tq.e<? super k10.l<? extends ya3.e.b>> eVar) {
            d dVar = x.this.new d(eVar);
            dVar.f225878f = onContainerChanged;
            dVar.f225879g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lya3/d;", "action", "Lk10/c0;", "Lya3/e$b$a;", "state", "Lk10/l;", "Lya3/e$b;", "<anonymous>", "(Lya3/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<OnTransform, k10.c0<ya3.e.b.Initialized>, tq.e<? super k10.l<? extends ya3.e.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225881e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f225882f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f225883g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ya3.e.b.Initialized O(float f15, long j15, ya3.e.b.Initialized initialized) {
            return ya3.e.b.Initialized.f(initialized, null, f15, j15, null, null, 25, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnTransform onTransform = (OnTransform) this.f225882f;
            k10.c0 c0Var = (k10.c0) this.f225883g;
            uq.b.e();
            if (this.f225881e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Transformation transformation = onTransform.getTransformation();
            x xVar = x.this;
            final float fM = lr.m.m(((ya3.e.b.Initialized) c0Var.a()).getScale() * transformation.getZoomChange(), 1.0f, 5.0f);
            final long jS9 = xVar.s9((ya3.e.b.Initialized) c0Var.a(), transformation.getCentroid(), transformation.getPanChange(), fM);
            return c0Var.b(new er.l() { // from class: ya3.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.e.O(fM, jS9, (e.b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnTransform onTransform, k10.c0<ya3.e.b.Initialized> c0Var, tq.e<? super k10.l<? extends ya3.e.b>> eVar) {
            e eVar2 = x.this.new e(eVar);
            eVar2.f225882f = onTransform;
            eVar2.f225883g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public x(yy.a aVar, za3.a aVar2, SetupData setupData) {
        this.mapper = aVar2;
        ya3.e.b.Measuring measuring = new ya3.e.b.Measuring(setupData.getImage());
        this.initialState = measuring;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(measuring, new er.l() { // from class: ya3.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.B9(this.f225853a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), w9(measuring));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final x xVar, k10.v vVar) {
        vVar.c(q0.c(ya3.e.b.class), new er.l() { // from class: ya3.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.C9(this.f225850a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ya3.e.b.Measuring.class), new er.l() { // from class: ya3.u
            @Override // er.l
            public final Object b(Object obj) {
                return x.D9(this.f225851a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ya3.e.b.Initialized.class), new er.l() { // from class: ya3.v
            @Override // er.l
            public final Object b(Object obj) {
                return x.E9(this.f225852a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(x xVar, k10.z zVar) {
        b bVar = xVar.new b(null);
        zVar.x(q0.c(ya3.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(x xVar, k10.z zVar) {
        c cVar = xVar.new c(null);
        zVar.v(q0.c(OnContainerChanged.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(x xVar, k10.z zVar) {
        d dVar = xVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(OnContainerChanged.class), oVar, dVar);
        zVar.v(q0.c(OnTransform.class), oVar, xVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rectangle r9(k10.c0<? extends ya3.e.b> c0Var, Rectangle rectangle) {
        Bitmap image = c0Var.a().getImage();
        oq.r rVarA = oq.y.a(Integer.valueOf(image.getWidth()), Integer.valueOf(image.getHeight()));
        float fIntValue = ((Number) rVarA.a()).intValue();
        float fIntValue2 = ((Number) rVarA.b()).intValue();
        float fMax = Math.max(rectangle.getWidth() / fIntValue, rectangle.getHeight() / fIntValue2);
        return new Rectangle(fIntValue * fMax, fIntValue2 * fMax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long s9(ya3.e.b.Initialized initialized, long j15, long j16, float f15) {
        float scale = f15 / initialized.getScale();
        long jP = m3.e.p(j15, initialized.h());
        long jQ = m3.e.q(m3.e.q(jP, m3.e.r(m3.e.p(initialized.getOffset(), jP), scale)), j16);
        PanBounds panBoundsT9 = t9(initialized.getImageContainer(), initialized.getContainer(), f15);
        float fU9 = u9(Float.intBitsToFloat((int) (jQ >> 32)), panBoundsT9.getX());
        float fU10 = u9(Float.intBitsToFloat((int) (jQ & BodyPartID.bodyIdMax)), panBoundsT9.getY());
        return m3.e.e((((long) Float.floatToRawIntBits(fU9)) << 32) | (((long) Float.floatToRawIntBits(fU10)) & BodyPartID.bodyIdMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PanBounds t9(Rectangle imageContainer, Rectangle container, float scale) {
        return new PanBounds(lr.m.d(((imageContainer.getWidth() * scale) - container.getWidth()) / 2.0f, 0.0f), lr.m.d(((imageContainer.getHeight() * scale) - container.getHeight()) / 2.0f, 0.0f));
    }

    private final float u9(float f15, float f16) {
        return lr.m.m(f15, -f16, f16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ya3.e.c.Data w9(ya3.e.b state) {
        return this.mapper.b(new za3.a.Params(state, new er.l() { // from class: ya3.r
            @Override // er.l
            public final Object b(Object obj) {
                return x.x9(this.f225848a, (Rectangle) obj);
            }
        }, new er.l() { // from class: ya3.s
            @Override // er.l
            public final Object b(Object obj) {
                return x.y9(this.f225849a, (Transformation) obj);
            }
        }, b9(ya3.b.f225805a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(x xVar, Rectangle rectangle) {
        xVar.d9(new OnContainerChanged(rectangle));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(x xVar, Transformation transformation) {
        xVar.d9(new OnTransform(transformation));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float z9(float f15, float f16, float f17) {
        float f18 = 0.0f;
        if (f17 != 0.0f && f16 != 0.0f) {
            f18 = f15 / (f16 / f17);
        }
        return u9(f18, f17);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<ya3.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ya3.e.b, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ya3.e.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ya3.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }
}
