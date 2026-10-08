package t70;

import a4.k0;
import a4.w0;
import android.content.Context;
import android.content.res.Configuration;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import ju.p0;
import ju.z0;
import mx.Label;
import n4.CollectionInfo;
import n4.CustomAccessibilityAction;
import n4.c0;
import n4.f0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.u1;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.f6;
import p079n1.k3;
import p079n1.l3;
import p143z0.b3;
import p143z0.e2;
import p143z0.g1;
import p143z0.v2;
import w0.f3;
import w0.q0;
import w0.u2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a1\u0010\f\u001a\u00020\u0005*\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0005*\u00020\u0005H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a/\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\u001e*\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\bH\u0007¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010&\u001a\u00020\u0005*\u00020\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b&\u0010'\u001aM\u0010.\u001a\u00020\u0005*\u00020\u00052\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u00062\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020$0,H\u0007¢\u0006\u0004\b.\u0010/\u001a\u001b\u00102\u001a\u00020\u0005*\u00020\u00052\u0006\u00101\u001a\u000200H\u0007¢\u0006\u0004\b2\u00103\u001a)\u00109\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020$\u0018\u000107*\u0002042\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b9\u0010:\u001a%\u0010=\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0017\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020\bH\u0007¢\u0006\u0004\b=\u0010>\u001a\u0011\u0010@\u001a\u00020\b*\u00020?¢\u0006\u0004\b@\u0010A\u001a\u0011\u0010C\u001a\u00020$*\u00020B¢\u0006\u0004\bC\u0010D\u001a\u001b\u0010G\u001a\u00020\u0005*\u00020\u00052\u0006\u0010F\u001a\u00020EH\u0007¢\u0006\u0004\bG\u0010H\u001a\u001b\u0010I\u001a\u00020\u0005*\u00020\u00052\u0006\u0010F\u001a\u00020EH\u0007¢\u0006\u0004\bI\u0010H\u001a!\u0010K\u001a\u00020\u0005*\u00020\u00052\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\b0#H\u0007¢\u0006\u0004\bK\u0010L\u001a\u001d\u0010N\u001a\u00020\u0005*\u00020\u00052\b\u0010M\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bN\u0010O¨\u0006U²\u0006\u000e\u0010P\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010Q\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010R\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010T\u001a\u0004\u0018\u00010S8\nX\u008a\u0084\u0002"}, d2 = {"Landroid/content/Context;", "context", "Lyw/b;", "u", "(Landroid/content/Context;)Lyw/b;", "Lf3/m;", "", "description", "", "canAddFocusable", "Lb1/l;", "interactionSource", "O", "(Lf3/m;Ljava/lang/String;ZLb1/l;Lm2/r;II)Lf3/m;", "isToggledOn", "additionalStateDescription", "Q", "(Lf3/m;ZLjava/lang/String;Lm2/r;I)Lf3/m;", "", "elementsCount", "r", "(Lf3/m;I)Lf3/m;", "Lw0/f3;", "state", ip.a.f96137b, "(Lf3/m;Lw0/f3;Lm2/r;II)Lf3/m;", "q", "(Lf3/m;Lm2/r;I)Lf3/m;", "Lg30/v;", "shouldFocusIfExpanded", "Loq/x;", "Landroid/view/accessibility/AccessibilityManager;", "Ld60/c;", "v", "(Lg30/v;ZLm2/r;II)Loq/x;", "Lkotlin/Function0;", "Loq/i0;", "onTouch", "t", "(Lf3/m;Ler/a;)Lf3/m;", "index", "listSize", "isDragging", "title", "Lkotlin/Function2;", "onMove", "m", "(Lf3/m;IIZLjava/lang/String;Ler/p;Lm2/r;I)Lf3/m;", "Lv50/c;", "data", "z", "(Lf3/m;Lv50/c;Lm2/r;I)Lf3/m;", "Ln1/l3;", "Lv4/t;", "imeAction", "Lkotlin/Function1;", "Ln1/k3;", "y", "(Ln1/l3;I)Ler/l;", "Lz0/v2;", "reverseLayout", "C", "(Lf3/m;Lz0/v2;ZLm2/r;II)Lf3/m;", "Ly3/b;", "B", "(Landroid/view/KeyEvent;)Z", "Ln4/i0;", "A", "(Ln4/i0;)V", "Ll3/g;", "direction", "F", "(Lf3/m;ILm2/r;I)Lf3/m;", "E", "action", ip.a.f96138c, "(Lf3/m;Ler/a;Lm2/r;I)Lf3/m;", "semanticError", "G", "(Lf3/m;Ljava/lang/String;Lm2/r;I)Lf3/m;", "bottomSheetVisible", "visible", "readyToRead", "", "scrollEvent", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f188684a;

        /* JADX INFO: renamed from: t70.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Loq/i0;", "<anonymous>", "(La4/c;)V"}, k = 3, mv = {2, 2, 0})
        static final class C4894a extends vq.i implements er.p<a4.c, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f188685c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f188686d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ er.a<i0> f188687e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4894a(er.a<i0> aVar, tq.e<? super C4894a> eVar) {
                super(2, eVar);
                this.f188687e = aVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                a4.c cVar = (a4.c) this.f188686d;
                Object objE = uq.b.e();
                int i15 = this.f188685c;
                if (i15 == 0) {
                    oq.u.b(obj);
                    a4.q qVar = a4.q.Initial;
                    this.f188686d = vq.j.a(cVar);
                    this.f188685c = 1;
                    if (b3.c(cVar, false, qVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                this.f188687e.a();
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final Object B(a4.c cVar, tq.e<? super i0> eVar) {
                return ((C4894a) v(cVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C4894a c4894a = new C4894a(this.f188687e, eVar);
                c4894a.f188686d = obj;
                return c4894a;
            }
        }

        a(er.a<i0> aVar) {
            this.f188684a = aVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, tq.e<? super i0> eVar) {
            Object objD = g1.d(k0Var, new C4894a(this.f188684a, null), eVar);
            return objD == uq.b.e() ? objD : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f188688e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g30.v f188689f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f188690g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ d60.c f188691h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ a3<Boolean> f188692j;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f188693a;

            static {
                int[] iArr = new int[g30.v.values().length];
                try {
                    iArr[g30.v.EXPANDED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g30.v.HALF_EXPANDED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[g30.v.HIDDEN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f188693a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g30.v vVar, boolean z15, d60.c cVar, a3<Boolean> a3Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f188689f = vVar;
            this.f188690g = z15;
            this.f188691h = cVar;
            this.f188692j = a3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f188688e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            int i15 = a.f188693a[this.f188689f.ordinal()];
            if (i15 == 1 || i15 == 2) {
                if (this.f188690g) {
                    i.x(this.f188692j, true);
                    this.f188691h.l();
                }
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                i.x(this.f188692j, false);
                this.f188691h.g();
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f188689f, this.f188690g, this.f188691h, this.f188692j, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.l<y3.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l<k3, i0> f188694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f188695b;

        /* JADX WARN: Multi-variable type inference failed */
        c(er.l<? super k3, i0> lVar, d dVar) {
            this.f188694a = lVar;
            this.f188695b = dVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(y3.b bVar) {
            return c(bVar.getNativeKeyEvent());
        }

        public final Boolean c(KeyEvent keyEvent) {
            if (y3.a.R(y3.d.a(keyEvent), y3.a.INSTANCE.n()) && this.f188694a != null) {
                int iB = y3.d.b(keyEvent);
                y3.c.Companion companion = y3.c.INSTANCE;
                boolean z15 = true;
                if (!y3.c.e(iB, companion.a())) {
                    if (y3.c.e(iB, companion.b())) {
                        this.f188694a.b(this.f188695b);
                    } else {
                        z15 = false;
                    }
                }
                return Boolean.valueOf(z15);
            }
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"t70/i$d", "Ln1/k3;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements k3 {
        d() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements er.l<y3.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f188696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f188697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f188698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v2 f188699d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f188700e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ v2 f188701f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v2 v2Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f188701f = v2Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f188700e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    v2 v2Var = this.f188701f;
                    this.f188700e = 1;
                    if (e2.b(v2Var, 100.0f, null, this, 2, null) == objE) {
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

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f188701f, eVar);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f188702e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ v2 f188703f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(v2 v2Var, tq.e<? super b> eVar) {
                super(2, eVar);
                this.f188703f = v2Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f188702e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    v2 v2Var = this.f188703f;
                    this.f188702e = 1;
                    if (e2.b(v2Var, -100.0f, null, this, 2, null) == objE) {
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

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((b) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new b(this.f188703f, eVar);
            }
        }

        e(long j15, p0 p0Var, long j16, v2 v2Var) {
            this.f188696a = j15;
            this.f188697b = p0Var;
            this.f188698c = j16;
            this.f188699d = v2Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(y3.b bVar) {
            return c(bVar.getNativeKeyEvent());
        }

        public final Boolean c(KeyEvent keyEvent) {
            boolean z15 = false;
            if (y3.c.e(y3.d.b(keyEvent), y3.c.INSTANCE.a())) {
                long jA = y3.d.a(keyEvent);
                if (y3.a.R(jA, this.f188696a)) {
                    ju.k.d(this.f188697b, null, null, new a(this.f188699d, null), 3, null);
                } else if (y3.a.R(jA, this.f188698c)) {
                    ju.k.d(this.f188697b, null, null, new b(this.f188699d, null), 3, null);
                }
                z15 = true;
            }
            return Boolean.valueOf(z15);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f implements er.l<y3.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3.o f188704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f188705b;

        f(l3.o oVar, int i15) {
            this.f188704a = oVar;
            this.f188705b = i15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(y3.b bVar) {
            return c(bVar.getNativeKeyEvent());
        }

        public final Boolean c(KeyEvent keyEvent) {
            boolean z15;
            if (y3.a.R(y3.d.a(keyEvent), y3.a.INSTANCE.J()) && keyEvent.getAction() == 0) {
                this.f188704a.h(this.f188705b);
                z15 = true;
            } else {
                z15 = false;
            }
            return Boolean.valueOf(z15);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g implements er.l<y3.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.a<Boolean> f188706a;

        g(er.a<Boolean> aVar) {
            this.f188706a = aVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(y3.b bVar) {
            return c(bVar.getNativeKeyEvent());
        }

        public final Boolean c(KeyEvent keyEvent) {
            return Boolean.valueOf((y3.a.R(y3.d.a(keyEvent), y3.a.INSTANCE.J()) && keyEvent.getAction() == 0) ? this.f188706a.a().booleanValue() : false);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h implements er.l<y3.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3.o f188707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f188708b;

        h(l3.o oVar, int i15) {
            this.f188707a = oVar;
            this.f188708b = i15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(y3.b bVar) {
            return c(bVar.getNativeKeyEvent());
        }

        public final Boolean c(KeyEvent keyEvent) {
            boolean z15;
            if (y3.a.R(y3.d.a(keyEvent), y3.a.INSTANCE.J()) && keyEvent.isShiftPressed() && keyEvent.getAction() == 0) {
                this.f188707a.h(this.f188708b);
                z15 = true;
            } else {
                z15 = false;
            }
            return Boolean.valueOf(z15);
        }
    }

    /* JADX INFO: renamed from: t70.i$i, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class C4895i extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f188709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a3<Boolean> f188710f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a3<Boolean> f188711g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4895i(a3<Boolean> a3Var, a3<Boolean> a3Var2, tq.e<? super C4895i> eVar) {
            super(2, eVar);
            this.f188710f = a3Var;
            this.f188711g = a3Var2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f188709e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (i.H(this.f188710f)) {
                    gu.b.Companion companion = gu.b.INSTANCE;
                    long jR = gu.d.r(50L, gu.e.MILLISECONDS);
                    this.f188709e = 1;
                    if (z0.c(jR, this) == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            i.M(this.f188711g, true);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((C4895i) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new C4895i(this.f188710f, this.f188711g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f188712e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f6<Long> f188713f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a3<Boolean> f188714g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a3<Boolean> f188715h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(f6<Long> f6Var, a3<Boolean> a3Var, a3<Boolean> a3Var2, tq.e<? super j> eVar) {
            super(2, eVar);
            this.f188713f = f6Var;
            this.f188714g = a3Var;
            this.f188715h = a3Var2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f188712e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (i.N(this.f188713f) != null && i.H(this.f188714g)) {
                    i.M(this.f188715h, false);
                    gu.b.Companion companion = gu.b.INSTANCE;
                    long jR = gu.d.r(50L, gu.e.MILLISECONDS);
                    this.f188712e = 1;
                    if (z0.c(jR, this) == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            i.M(this.f188715h, true);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((j) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new j(this.f188713f, this.f188714g, this.f188715h, eVar);
        }
    }

    public static final void A(n4.i0 i0Var) {
        if (c70.a.f23835a.c()) {
            return;
        }
        i0Var.e(c0.f131174a.l(), i0.f148189a);
    }

    public static final boolean B(KeyEvent keyEvent) {
        InputDevice device = keyEvent.getDevice();
        if (device == null) {
            return false;
        }
        return !device.isVirtual();
    }

    public static final f3.m C(f3.m mVar, v2 v2Var, boolean z15, p076m2.r rVar, int i15, int i16) {
        long j15;
        long jM;
        if ((i16 & 2) != 0) {
            z15 = false;
        }
        if (p076m2.t.k()) {
            p076m2.t.o(387644269, i15, -1, "pl.gov.coi.common.ui.utils.keyboardScrollAccessibility (AccessibilityExtensions.kt:405)");
        }
        Object objE = rVar.E();
        p076m2.r.Companion companion = p076m2.r.INSTANCE;
        if (objE == companion.a()) {
            objE = Function0.i(tq.j.f191408a, rVar);
            rVar.v(objE);
        }
        p0 p0Var = (p0) objE;
        Configuration configuration = (Configuration) rVar.N(AndroidCompositionLocals_androidKt.b());
        int i17 = configuration.orientation;
        if (i17 == 2 && z15) {
            j15 = y3.a.INSTANCE.l();
        } else if (i17 == 2) {
            j15 = y3.a.INSTANCE.k();
        } else {
            j15 = z15 ? y3.a.INSTANCE.j() : y3.a.INSTANCE.m();
        }
        long j16 = j15;
        int i18 = configuration.orientation;
        if (i18 == 2 && z15) {
            jM = y3.a.INSTANCE.k();
        } else if (i18 == 2) {
            jM = y3.a.INSTANCE.l();
        } else {
            jM = z15 ? y3.a.INSTANCE.m() : y3.a.INSTANCE.j();
        }
        long j17 = jM;
        boolean zD = rVar.d(j17) | rVar.G(p0Var) | rVar.G(v2Var) | rVar.d(j16);
        Object objE2 = rVar.E();
        if (zD || objE2 == companion.a()) {
            Object eVar = new e(j17, p0Var, j16, v2Var);
            rVar.v(eVar);
            objE2 = eVar;
        }
        f3.m mVarA = y3.f.a(mVar, (er.l) objE2);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarA;
    }

    public static final f3.m D(f3.m mVar, er.a<Boolean> aVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1763230557, i15, -1, "pl.gov.coi.common.ui.utils.onTabPressed (AccessibilityExtensions.kt:549)");
        }
        boolean z15 = (((i15 & 112) ^ 48) > 32 && rVar.W(aVar)) || (i15 & 48) == 32;
        Object objE = rVar.E();
        if (z15 || objE == p076m2.r.INSTANCE.a()) {
            objE = new g(aVar);
            rVar.v(objE);
        }
        f3.m mVarB = y3.f.b(mVar, (er.l) objE);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarB;
    }

    public static final f3.m E(f3.m mVar, int i15, p076m2.r rVar, int i16) {
        if (p076m2.t.k()) {
            p076m2.t.o(23610712, i16, -1, "pl.gov.coi.common.ui.utils.onTabPressed (AccessibilityExtensions.kt:507)");
        }
        l3.o oVar = (l3.o) rVar.N(androidx.compose.ui.platform.g1.g());
        boolean zG = ((((i16 & 112) ^ 48) > 32 && rVar.c(i15)) || (i16 & 48) == 32) | rVar.G(oVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new f(oVar, i15);
            rVar.v(objE);
        }
        f3.m mVarB = y3.f.b(mVar, (er.l) objE);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarB;
    }

    public static final f3.m F(f3.m mVar, int i15, p076m2.r rVar, int i16) {
        if (p076m2.t.k()) {
            p076m2.t.o(749861056, i16, -1, "pl.gov.coi.common.ui.utils.onTabShiftPressed (AccessibilityExtensions.kt:485)");
        }
        l3.o oVar = (l3.o) rVar.N(androidx.compose.ui.platform.g1.g());
        boolean zG = ((((i16 & 112) ^ 48) > 32 && rVar.c(i15)) || (i16 & 48) == 32) | rVar.G(oVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new h(oVar, i15);
            rVar.v(objE);
        }
        f3.m mVarB = y3.f.b(mVar, (er.l) objE);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarB;
    }

    public static final f3.m G(f3.m mVar, final String str, p076m2.r rVar, int i15) {
        f6 f6VarC;
        if (p076m2.t.k()) {
            p076m2.t.o(1811441171, i15, -1, "pl.gov.coi.common.ui.utils.readErrorOnVisibleAccessibility (AccessibilityExtensions.kt:573)");
        }
        Object objE = rVar.E();
        p076m2.r.Companion companion = p076m2.r.INSTANCE;
        if (objE == companion.a()) {
            objE = c6.e(Boolean.FALSE, null, 2, null);
            rVar.v(objE);
        }
        final a3 a3Var = (a3) objE;
        Object objE2 = rVar.E();
        if (objE2 == companion.a()) {
            objE2 = c6.e(Boolean.FALSE, null, 2, null);
            rVar.v(objE2);
        }
        final a3 a3Var2 = (a3) objE2;
        d60.f fVar = (d60.f) rVar.N(d60.i.c());
        mu.p0<Long> p0VarA = fVar != null ? fVar.a() : null;
        if (p0VarA == null) {
            rVar.X(-1619662991);
            rVar.R();
            f6VarC = null;
        } else {
            rVar.X(1333226128);
            f6VarC = m7.b.c(p0VarA, null, null, null, rVar, 0, 7);
            rVar.R();
        }
        if (f6VarC == null) {
            rVar.X(-1619626162);
            Object objE3 = rVar.E();
            if (objE3 == companion.a()) {
                objE3 = c6.e(null, null, 2, null);
                rVar.v(objE3);
            }
            f6VarC = (a3) objE3;
            rVar.R();
        } else {
            rVar.X(1333225208);
            rVar.R();
        }
        Boolean boolValueOf = Boolean.valueOf(H(a3Var));
        Object objE4 = rVar.E();
        if (objE4 == companion.a()) {
            objE4 = new C4895i(a3Var, a3Var2, null);
            rVar.v(objE4);
        }
        Function0.d(boolValueOf, (er.p) objE4, rVar, 0);
        Long lN = N(f6VarC);
        boolean zW = rVar.W(f6VarC);
        Object objE5 = rVar.E();
        if (zW || objE5 == companion.a()) {
            objE5 = new j(f6VarC, a3Var, a3Var2, null);
            rVar.v(objE5);
        }
        Function0.d(lN, (er.p) objE5, rVar, 0);
        Object objE6 = rVar.E();
        if (objE6 == companion.a()) {
            objE6 = new er.l() { // from class: t70.e
                @Override // er.l
                public final Object b(Object obj) {
                    return i.I(a3Var, a3Var2, ((Boolean) obj).booleanValue());
                }
            };
            rVar.v(objE6);
        }
        f3.m mVarB = u1.b(mVar, 0L, 0.0f, null, (er.l) objE6, 7, null);
        boolean z15 = (((i15 & 112) ^ 48) > 32 && rVar.W(str)) || (i15 & 48) == 32;
        Object objE7 = rVar.E();
        if (z15 || objE7 == companion.a()) {
            objE7 = new er.l() { // from class: t70.f
                @Override // er.l
                public final Object b(Object obj) {
                    return i.J(str, a3Var2, (n4.i0) obj);
                }
            };
            rVar.v(objE7);
        }
        f3.m mVarD = n4.v.d(mVarB, false, (er.l) objE7, 1, null);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H(a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(a3 a3Var, a3 a3Var2, boolean z15) {
        K(a3Var, z15);
        if (!z15) {
            M(a3Var2, false);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(String str, a3 a3Var, n4.i0 i0Var) {
        if (L(a3Var) && str != null && str.length() != 0) {
            px.f.f163100a.b("Read live region error: " + str, pq.v.e(z.f188762a.a()));
            f0.l0(i0Var, n4.i.INSTANCE.b());
            f0.m(i0Var, str);
            f0.x0(i0Var, Label.INSTANCE.d().getText());
        }
        return i0.f148189a;
    }

    private static final void K(a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    private static final boolean L(a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long N(f6<Long> f6Var) {
        return f6Var.getValue();
    }

    public static final f3.m O(f3.m mVar, final String str, boolean z15, b1.l lVar, p076m2.r rVar, int i15, int i16) {
        f3.m mVarB;
        if ((i16 & 2) != 0) {
            z15 = false;
        }
        if ((i16 & 4) != 0) {
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = b1.k.a();
                rVar.v(objE);
            }
            lVar = (b1.l) objE;
        }
        if (p076m2.t.k()) {
            p076m2.t.o(-1236335709, i15, -1, "pl.gov.coi.common.ui.utils.semanticsContentDescription (AccessibilityExtensions.kt:98)");
        }
        if (str == null || fu.r.t0(str)) {
            rVar.X(1962828353);
            rVar.R();
            mVarB = q0.b(mVar, false, lVar);
        } else {
            rVar.X(1962674376);
            boolean z16 = (((i15 & 112) ^ 48) > 32 && rVar.W(str)) || (i15 & 48) == 32;
            Object objE2 = rVar.E();
            if (z16 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: t70.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.P(str, (n4.i0) obj);
                    }
                };
                rVar.v(objE2);
            }
            mVarB = q0.b(n4.v.d(mVar, false, (er.l) objE2, 1, null), z15, lVar);
            rVar.R();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(String str, n4.i0 i0Var) {
        f0.c0(i0Var, str);
        return i0.f148189a;
    }

    public static final f3.m Q(f3.m mVar, final boolean z15, String str, p076m2.r rVar, int i15) {
        Label labelB;
        if (p076m2.t.k()) {
            p076m2.t.o(-1048275970, i15, -1, "pl.gov.coi.common.ui.utils.semanticsToggleableStateDescription (AccessibilityExtensions.kt:123)");
        }
        if (z15) {
            labelB = c70.a.f23835a.a().M0();
        } else {
            if (z15) {
                throw new oq.p();
            }
            labelB = c70.a.f23835a.a().b();
        }
        final String str2 = s.O(labelB) + s.N(str);
        boolean zW = ((((i15 & 112) ^ 48) > 32 && rVar.a(z15)) || (i15 & 48) == 32) | rVar.W(str2);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: t70.h
                @Override // er.l
                public final Object b(Object obj) {
                    return i.R(str2, z15, (n4.i0) obj);
                }
            };
            rVar.v(objE);
        }
        f3.m mVarD = n4.v.d(mVar, false, (er.l) objE, 1, null);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(String str, boolean z15, n4.i0 i0Var) {
        f0.x0(i0Var, str);
        f0.G0(i0Var, p4.b.a(z15));
        return i0.f148189a;
    }

    public static final f3.m S(f3.m mVar, f3 f3Var, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            f3Var = u2.b(0, rVar, 0, 1);
        }
        f3 f3Var2 = f3Var;
        if (p076m2.t.k()) {
            p076m2.t.o(556544700, i15, -1, "pl.gov.coi.common.ui.utils.verticalScrollAccessibility (AccessibilityExtensions.kt:166)");
        }
        f3.m mVarG = u2.g(C(mVar, f3Var2, false, rVar, i15 & 126, 2), f3Var2, false, null, false, 14, null);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarG;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c A[PHI: r5
      0x003c: PHI (r5v6 java.lang.String) = (r5v4 java.lang.String), (r5v7 java.lang.String) binds: [B:12:0x003a, B:8:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[PHI: r6
      0x0057: PHI (r6v8 int) = (r6v6 int), (r6v9 int) binds: [B:22:0x0055, B:18:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072 A[PHI: r7
      0x0072: PHI (r7v9 int) = (r7v7 int), (r7v10 int) binds: [B:32:0x0070, B:28:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d A[PHI: r8
      0x008d: PHI (r8v9 boolean) = (r8v7 boolean), (r8v10 boolean) binds: [B:42:0x008b, B:38:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x009b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9 A[PHI: r9
      0x00a9: PHI (r9v10 er.p<? super java.lang.Integer, ? super java.lang.Integer, oq.i0>) = 
      (r9v8 er.p<? super java.lang.Integer, ? super java.lang.Integer, oq.i0>)
      (r9v11 er.p<? super java.lang.Integer, ? super java.lang.Integer, oq.i0>)
     binds: [B:52:0x00a7, B:48:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7  */
    public static final f3.m m(f3.m mVar, int i15, int i16, boolean z15, String str, er.p<? super Integer, ? super Integer, i0> pVar, p076m2.r rVar, int i17) {
        final String str2;
        boolean z16;
        final int i18;
        boolean z17;
        final int i19;
        boolean z18;
        final boolean z19;
        boolean z25;
        final er.p<? super Integer, ? super Integer, i0> pVar2;
        boolean z26;
        boolean z27;
        Object objE;
        if (p076m2.t.k()) {
            p076m2.t.o(-1643968898, i17, -1, "pl.gov.coi.common.ui.utils.addAccessibilityDragging (AccessibilityExtensions.kt:288)");
        }
        rVar.X(693860296);
        final c70.a aVar = c70.a.f23835a;
        f3.m.Companion companion = f3.m.INSTANCE;
        boolean zG = rVar.G(aVar);
        if (((57344 & i17) ^ 24576) > 16384) {
            str2 = str;
            if (rVar.W(str2)) {
                z16 = true;
            }
            boolean z28 = zG | z16;
            if (((i17 & 112) ^ 48) > 32) {
                i18 = i15;
                if (!rVar.c(i18)) {
                    z17 = true;
                }
                boolean z29 = z28 | z17;
                if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                    i19 = i16;
                    if (!rVar.c(i19)) {
                        z18 = true;
                    }
                    boolean z35 = z29 | z18;
                    if (((i17 & 7168) ^ 3072) > 2048) {
                        z19 = z15;
                        if (!rVar.a(z19)) {
                            z25 = true;
                        }
                        boolean z36 = z35 | z25;
                        if (((458752 & i17) ^ 196608) > 131072) {
                            pVar2 = pVar;
                            if (!rVar.W(pVar2)) {
                                z26 = true;
                            }
                            z27 = z26 | z36;
                            objE = rVar.E();
                            if (z27 || objE == p076m2.r.INSTANCE.a()) {
                                objE = new er.l() { // from class: t70.a
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                                    }
                                };
                                rVar.v(objE);
                            }
                            f3.m mVarU = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                            rVar.R();
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            return mVarU;
                        }
                        pVar2 = pVar;
                        if ((i17 & 196608) == 131072) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z26 | z36;
                        objE = rVar.E();
                        if (z27) {
                            objE = new er.l() { // from class: t70.a
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                                }
                            };
                            rVar.v(objE);
                        } else {
                            objE = new er.l() { // from class: t70.a
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                                }
                            };
                            rVar.v(objE);
                        }
                        f3.m mVarU2 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                        rVar.R();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return mVarU2;
                    }
                    z19 = z15;
                    if ((i17 & 3072) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z37 = z35 | z25;
                    if (((458752 & i17) ^ 196608) > 131072) {
                        pVar2 = pVar;
                        if (!rVar.W(pVar2)) {
                            z26 = true;
                        }
                        z27 = z26 | z37;
                        objE = rVar.E();
                        if (z27) {
                            objE = new er.l() { // from class: t70.a
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                                }
                            };
                            rVar.v(objE);
                        } else {
                            objE = new er.l() { // from class: t70.a
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                                }
                            };
                            rVar.v(objE);
                        }
                        f3.m mVarU3 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                        rVar.R();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return mVarU3;
                    }
                    pVar2 = pVar;
                    if ((i17 & 196608) == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | z37;
                    objE = rVar.E();
                    if (z27) {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    } else {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    }
                    f3.m mVarU4 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                    rVar.R();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return mVarU4;
                }
                i19 = i16;
                if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z38 = z29 | z18;
                if (((i17 & 7168) ^ 3072) > 2048) {
                    z19 = z15;
                    if (!rVar.a(z19)) {
                        z25 = true;
                    }
                    boolean z39 = z38 | z25;
                    if (((458752 & i17) ^ 196608) > 131072) {
                        pVar2 = pVar;
                        if (!rVar.W(pVar2)) {
                            z26 = true;
                        }
                        z27 = z26 | z39;
                        objE = rVar.E();
                        if (z27) {
                            objE = new er.l() { // from class: t70.a
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                                }
                            };
                            rVar.v(objE);
                        } else {
                            objE = new er.l() { // from class: t70.a
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                                }
                            };
                            rVar.v(objE);
                        }
                        f3.m mVarU5 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                        rVar.R();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return mVarU5;
                    }
                    pVar2 = pVar;
                    if ((i17 & 196608) == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | z39;
                    objE = rVar.E();
                    if (z27) {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    } else {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    }
                    f3.m mVarU6 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                    rVar.R();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return mVarU6;
                }
                z19 = z15;
                if ((i17 & 3072) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z310 = z38 | z25;
                if (((458752 & i17) ^ 196608) > 131072) {
                    pVar2 = pVar;
                    if (!rVar.W(pVar2)) {
                        z26 = true;
                    }
                    z27 = z26 | z310;
                    objE = rVar.E();
                    if (z27) {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    } else {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    }
                    f3.m mVarU7 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                    rVar.R();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return mVarU7;
                }
                pVar2 = pVar;
                if ((i17 & 196608) == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z26 | z310;
                objE = rVar.E();
                if (z27) {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                } else {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                }
                f3.m mVarU8 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                rVar.R();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return mVarU8;
            }
            i18 = i15;
            if ((i17 & 48) == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z210 = z28 | z17;
            if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                i19 = i16;
                if (!rVar.c(i19)) {
                    z18 = true;
                }
                boolean z311 = z210 | z18;
                if (((i17 & 7168) ^ 3072) > 2048) {
                    z19 = z15;
                    if (!rVar.a(z19)) {
                        z25 = true;
                    }
                    boolean z312 = z311 | z25;
                    if (((458752 & i17) ^ 196608) > 131072) {
                        pVar2 = pVar;
                        if (!rVar.W(pVar2)) {
                            z26 = true;
                        }
                        z27 = z26 | z312;
                        objE = rVar.E();
                        if (z27) {
                            objE = new er.l() { // from class: t70.a
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                                }
                            };
                            rVar.v(objE);
                        } else {
                            objE = new er.l() { // from class: t70.a
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                                }
                            };
                            rVar.v(objE);
                        }
                        f3.m mVarU9 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                        rVar.R();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return mVarU9;
                    }
                    pVar2 = pVar;
                    if ((i17 & 196608) == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | z312;
                    objE = rVar.E();
                    if (z27) {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    } else {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    }
                    f3.m mVarU10 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                    rVar.R();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return mVarU10;
                }
                z19 = z15;
                if ((i17 & 3072) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z313 = z311 | z25;
                if (((458752 & i17) ^ 196608) > 131072) {
                    pVar2 = pVar;
                    if (!rVar.W(pVar2)) {
                        z26 = true;
                    }
                    z27 = z26 | z313;
                    objE = rVar.E();
                    if (z27) {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    } else {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    }
                    f3.m mVarU11 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                    rVar.R();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return mVarU11;
                }
                pVar2 = pVar;
                if ((i17 & 196608) == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z26 | z313;
                objE = rVar.E();
                if (z27) {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                } else {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                }
                f3.m mVarU12 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                rVar.R();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return mVarU12;
            }
            i19 = i16;
            if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z314 = z210 | z18;
            if (((i17 & 7168) ^ 3072) > 2048) {
                z19 = z15;
                if (!rVar.a(z19)) {
                    z25 = true;
                }
                boolean z315 = z314 | z25;
                if (((458752 & i17) ^ 196608) > 131072) {
                    pVar2 = pVar;
                    if (!rVar.W(pVar2)) {
                        z26 = true;
                    }
                    z27 = z26 | z315;
                    objE = rVar.E();
                    if (z27) {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    } else {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    }
                    f3.m mVarU13 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                    rVar.R();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return mVarU13;
                }
                pVar2 = pVar;
                if ((i17 & 196608) == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z26 | z315;
                objE = rVar.E();
                if (z27) {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                } else {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                }
                f3.m mVarU14 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                rVar.R();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return mVarU14;
            }
            z19 = z15;
            if ((i17 & 3072) == 2048) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z316 = z314 | z25;
            if (((458752 & i17) ^ 196608) > 131072) {
                pVar2 = pVar;
                if (!rVar.W(pVar2)) {
                    z26 = true;
                }
                z27 = z26 | z316;
                objE = rVar.E();
                if (z27) {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                } else {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                }
                f3.m mVarU15 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                rVar.R();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return mVarU15;
            }
            pVar2 = pVar;
            if ((i17 & 196608) == 131072) {
                z26 = true;
            } else {
                z26 = false;
            }
            z27 = z26 | z316;
            objE = rVar.E();
            if (z27) {
                objE = new er.l() { // from class: t70.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            } else {
                objE = new er.l() { // from class: t70.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarU16 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            return mVarU16;
        }
        str2 = str;
        if ((i17 & 24576) == 16384) {
            z16 = true;
        } else {
            z16 = false;
        }
        boolean z211 = zG | z16;
        if (((i17 & 112) ^ 48) > 32) {
            i18 = i15;
            if (!rVar.c(i18)) {
                z17 = true;
            }
            boolean z212 = z211 | z17;
            if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                i19 = i16;
                if (!rVar.c(i19)) {
                    z18 = true;
                }
                boolean z317 = z212 | z18;
                if (((i17 & 7168) ^ 3072) > 2048) {
                    z19 = z15;
                    if (!rVar.a(z19)) {
                        z25 = true;
                    }
                    boolean z318 = z317 | z25;
                    if (((458752 & i17) ^ 196608) > 131072) {
                        pVar2 = pVar;
                        if (!rVar.W(pVar2)) {
                            z26 = true;
                        }
                        z27 = z26 | z318;
                        objE = rVar.E();
                        if (z27) {
                            objE = new er.l() { // from class: t70.a
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                                }
                            };
                            rVar.v(objE);
                        } else {
                            objE = new er.l() { // from class: t70.a
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                                }
                            };
                            rVar.v(objE);
                        }
                        f3.m mVarU17 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                        rVar.R();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return mVarU17;
                    }
                    pVar2 = pVar;
                    if ((i17 & 196608) == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | z318;
                    objE = rVar.E();
                    if (z27) {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    } else {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    }
                    f3.m mVarU18 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                    rVar.R();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return mVarU18;
                }
                z19 = z15;
                if ((i17 & 3072) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z319 = z317 | z25;
                if (((458752 & i17) ^ 196608) > 131072) {
                    pVar2 = pVar;
                    if (!rVar.W(pVar2)) {
                        z26 = true;
                    }
                    z27 = z26 | z319;
                    objE = rVar.E();
                    if (z27) {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    } else {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    }
                    f3.m mVarU19 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                    rVar.R();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return mVarU19;
                }
                pVar2 = pVar;
                if ((i17 & 196608) == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z26 | z319;
                objE = rVar.E();
                if (z27) {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                } else {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                }
                f3.m mVarU110 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                rVar.R();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return mVarU110;
            }
            i19 = i16;
            if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z3110 = z212 | z18;
            if (((i17 & 7168) ^ 3072) > 2048) {
                z19 = z15;
                if (!rVar.a(z19)) {
                    z25 = true;
                }
                boolean z3111 = z3110 | z25;
                if (((458752 & i17) ^ 196608) > 131072) {
                    pVar2 = pVar;
                    if (!rVar.W(pVar2)) {
                        z26 = true;
                    }
                    z27 = z26 | z3111;
                    objE = rVar.E();
                    if (z27) {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    } else {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    }
                    f3.m mVarU111 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                    rVar.R();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return mVarU111;
                }
                pVar2 = pVar;
                if ((i17 & 196608) == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z26 | z3111;
                objE = rVar.E();
                if (z27) {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                } else {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                }
                f3.m mVarU112 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                rVar.R();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return mVarU112;
            }
            z19 = z15;
            if ((i17 & 3072) == 2048) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z3112 = z3110 | z25;
            if (((458752 & i17) ^ 196608) > 131072) {
                pVar2 = pVar;
                if (!rVar.W(pVar2)) {
                    z26 = true;
                }
                z27 = z26 | z3112;
                objE = rVar.E();
                if (z27) {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                } else {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                }
                f3.m mVarU113 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                rVar.R();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return mVarU113;
            }
            pVar2 = pVar;
            if ((i17 & 196608) == 131072) {
                z26 = true;
            } else {
                z26 = false;
            }
            z27 = z26 | z3112;
            objE = rVar.E();
            if (z27) {
                objE = new er.l() { // from class: t70.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            } else {
                objE = new er.l() { // from class: t70.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarU114 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            return mVarU114;
        }
        i18 = i15;
        if ((i17 & 48) == 32) {
            z17 = true;
        } else {
            z17 = false;
        }
        boolean z213 = z211 | z17;
        if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
            i19 = i16;
            if (!rVar.c(i19)) {
                z18 = true;
            }
            boolean z3113 = z213 | z18;
            if (((i17 & 7168) ^ 3072) > 2048) {
                z19 = z15;
                if (!rVar.a(z19)) {
                    z25 = true;
                }
                boolean z3114 = z3113 | z25;
                if (((458752 & i17) ^ 196608) > 131072) {
                    pVar2 = pVar;
                    if (!rVar.W(pVar2)) {
                        z26 = true;
                    }
                    z27 = z26 | z3114;
                    objE = rVar.E();
                    if (z27) {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    } else {
                        objE = new er.l() { // from class: t70.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    }
                    f3.m mVarU115 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                    rVar.R();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return mVarU115;
                }
                pVar2 = pVar;
                if ((i17 & 196608) == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z26 | z3114;
                objE = rVar.E();
                if (z27) {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                } else {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                }
                f3.m mVarU116 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                rVar.R();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return mVarU116;
            }
            z19 = z15;
            if ((i17 & 3072) == 2048) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z3115 = z3113 | z25;
            if (((458752 & i17) ^ 196608) > 131072) {
                pVar2 = pVar;
                if (!rVar.W(pVar2)) {
                    z26 = true;
                }
                z27 = z26 | z3115;
                objE = rVar.E();
                if (z27) {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                } else {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                }
                f3.m mVarU117 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                rVar.R();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return mVarU117;
            }
            pVar2 = pVar;
            if ((i17 & 196608) == 131072) {
                z26 = true;
            } else {
                z26 = false;
            }
            z27 = z26 | z3115;
            objE = rVar.E();
            if (z27) {
                objE = new er.l() { // from class: t70.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            } else {
                objE = new er.l() { // from class: t70.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarU118 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            return mVarU118;
        }
        i19 = i16;
        if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
            z18 = true;
        } else {
            z18 = false;
        }
        boolean z3116 = z213 | z18;
        if (((i17 & 7168) ^ 3072) > 2048) {
            z19 = z15;
            if (!rVar.a(z19)) {
                z25 = true;
            }
            boolean z3117 = z3116 | z25;
            if (((458752 & i17) ^ 196608) > 131072) {
                pVar2 = pVar;
                if (!rVar.W(pVar2)) {
                    z26 = true;
                }
                z27 = z26 | z3117;
                objE = rVar.E();
                if (z27) {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                } else {
                    objE = new er.l() { // from class: t70.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                }
                f3.m mVarU119 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
                rVar.R();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return mVarU119;
            }
            pVar2 = pVar;
            if ((i17 & 196608) == 131072) {
                z26 = true;
            } else {
                z26 = false;
            }
            z27 = z26 | z3117;
            objE = rVar.E();
            if (z27) {
                objE = new er.l() { // from class: t70.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            } else {
                objE = new er.l() { // from class: t70.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarU1110 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            return mVarU1110;
        }
        z19 = z15;
        if ((i17 & 3072) == 2048) {
            z25 = true;
        } else {
            z25 = false;
        }
        boolean z3118 = z3116 | z25;
        if (((458752 & i17) ^ 196608) > 131072) {
            pVar2 = pVar;
            if (!rVar.W(pVar2)) {
                z26 = true;
            }
            z27 = z26 | z3118;
            objE = rVar.E();
            if (z27) {
                objE = new er.l() { // from class: t70.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            } else {
                objE = new er.l() { // from class: t70.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarU1111 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            return mVarU1111;
        }
        pVar2 = pVar;
        if ((i17 & 196608) == 131072) {
            z26 = true;
        } else {
            z26 = false;
        }
        z27 = z26 | z3118;
        objE = rVar.E();
        if (z27) {
            objE = new er.l() { // from class: t70.a
                @Override // er.l
                public final Object b(Object obj) {
                    return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                }
            };
            rVar.v(objE);
        } else {
            objE = new er.l() { // from class: t70.a
                @Override // er.l
                public final Object b(Object obj) {
                    return i.n(aVar, str2, i18, i19, z19, pVar2, (n4.i0) obj);
                }
            };
            rVar.v(objE);
        }
        f3.m mVarU1112 = mVar.u(n4.v.d(companion, false, (er.l) objE, 1, null));
        rVar.R();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarU1112;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(c70.a aVar, String str, final int i15, int i16, boolean z15, final er.p pVar, n4.i0 i0Var) {
        f0.c0(i0Var, aVar.a().V(str, i15 + 1, i16).getText());
        f0.x0(i0Var, z15 ? aVar.a().h().getText() : aVar.a().p0().getText());
        List listC = pq.v.c();
        if (i15 > 0) {
            listC.add(new CustomAccessibilityAction(aVar.a().I().getText(), new er.a() { // from class: t70.b
                @Override // er.a
                public final Object a() {
                    return Boolean.valueOf(i.o(pVar, i15));
                }
            }));
        }
        if (i15 < i16 - 1) {
            listC.add(new CustomAccessibilityAction(aVar.a().U().getText(), new er.a() { // from class: t70.c
                @Override // er.a
                public final Object a() {
                    return Boolean.valueOf(i.p(pVar, i15));
                }
            }));
        }
        f0.e0(i0Var, pq.v.a(listC));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(er.p pVar, int i15) {
        pVar.B(Integer.valueOf(i15), Integer.valueOf(i15 - 1));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(er.p pVar, int i15) {
        pVar.B(Integer.valueOf(i15), Integer.valueOf(i15 + 1));
        return true;
    }

    public static final f3.m q(f3.m mVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(155457412, i15, -1, "pl.gov.coi.common.ui.utils.addScrollableWithFab (AccessibilityExtensions.kt:182)");
        }
        float fN = c5.h.n(56);
        f3.m mVarS = S(f3.m.INSTANCE, null, rVar, 6, 1);
        k70.a aVar = k70.a.f108864a;
        int i16 = k70.a.f108865b;
        f3.m mVarU = mVar.u(d1.a3.q(mVarS, aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing100(), aVar.b(rVar, i16).getSpacing200(), c5.h.n(c5.h.n(aVar.b(rVar, i16).getSpacing300() + fN) + aVar.b(rVar, i16).getSpacing300())));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarU;
    }

    public static final f3.m r(f3.m mVar, final int i15) {
        return n4.v.d(mVar, false, new er.l() { // from class: t70.g
            @Override // er.l
            public final Object b(Object obj) {
                return i.s(i15, (n4.i0) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(int i15, n4.i0 i0Var) {
        f0.Z(i0Var, new CollectionInfo(i15, 1));
        return i0.f148189a;
    }

    public static final f3.m t(f3.m mVar, er.a<i0> aVar) {
        return mVar.u(w0.c(f3.m.INSTANCE, i0.f148189a, new a(aVar)));
    }

    public static final yw.b u(Context context) {
        return new pw.b(context);
    }

    public static final oq.x<AccessibilityManager, d60.c, Boolean> v(g30.v vVar, boolean z15, p076m2.r rVar, int i15, int i16) {
        g30.v vVar2;
        boolean z16 = true;
        boolean z17 = (i16 & 1) != 0 ? true : z15;
        if (p076m2.t.k()) {
            p076m2.t.o(1404853015, i15, -1, "pl.gov.coi.common.ui.utils.getBottomSheetFocusManagement (AccessibilityExtensions.kt:214)");
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) ((Context) rVar.N(AndroidCompositionLocals_androidKt.c())).getSystemService("accessibility");
        d60.c cVarB = d60.e.b(false, null, rVar, 6, 2);
        Object objE = rVar.E();
        p076m2.r.Companion companion = p076m2.r.INSTANCE;
        if (objE == companion.a()) {
            objE = c6.e(Boolean.FALSE, null, 2, null);
            rVar.v(objE);
        }
        a3 a3Var = (a3) objE;
        if (accessibilityManager.isEnabled()) {
            rVar.X(1806610987);
        } else {
            rVar.X(1815255895);
            Boolean boolValueOf = Boolean.valueOf(z17);
            boolean z18 = (((i15 & 14) ^ 6) > 4 && rVar.c(vVar.ordinal())) || (i15 & 6) == 4;
            if ((((i15 & 112) ^ 48) <= 32 || !rVar.a(z17)) && (i15 & 48) != 32) {
                z16 = false;
            }
            boolean zW = z18 | z16 | rVar.W(cVarB);
            Object objE2 = rVar.E();
            if (zW || objE2 == companion.a()) {
                vVar2 = vVar;
                Object bVar = new b(vVar2, z17, cVarB, a3Var, null);
                rVar.v(bVar);
                objE2 = bVar;
            } else {
                vVar2 = vVar;
            }
            Function0.e(vVar2, boolValueOf, (er.p) objE2, rVar, i15 & 126);
        }
        rVar.R();
        oq.x<AccessibilityManager, d60.c, Boolean> xVar = new oq.x<>(accessibilityManager, cVarB, Boolean.valueOf(w(a3Var)));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return xVar;
    }

    private static final boolean w(a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    private static final er.l<k3, i0> y(l3 l3Var, int i15) {
        v4.t.Companion companion = v4.t.INSTANCE;
        if (v4.t.m(i15, companion.b())) {
            return l3Var.b();
        }
        if (v4.t.m(i15, companion.d())) {
            return l3Var.d();
        }
        if (v4.t.m(i15, companion.c())) {
            return l3Var.c();
        }
        if (v4.t.m(i15, companion.h())) {
            return l3Var.g();
        }
        if (v4.t.m(i15, companion.g())) {
            return l3Var.f();
        }
        if (v4.t.m(i15, companion.f())) {
            return l3Var.e();
        }
        return null;
    }

    public static final f3.m z(f3.m mVar, v50.c cVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-137051264, i15, -1, "pl.gov.coi.common.ui.utils.handleImeActionOnPhysicalKeyboard (AccessibilityExtensions.kt:346)");
        }
        d dVar = new d();
        er.l<k3, i0> lVarY = y(cVar.i().b((l3.o) rVar.N(androidx.compose.ui.platform.g1.g())), cVar.getImeAction());
        boolean zW = rVar.W(lVarY) | rVar.W(dVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new c(lVarY, dVar);
            rVar.v(objE);
        }
        f3.m mVarB = y3.f.b(mVar, (er.l) objE);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarB;
    }
}
