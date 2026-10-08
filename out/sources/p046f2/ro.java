package p046f2;

import b1.i;
import b1.j;
import b1.n;
import er.l;
import f3.m;
import fr.n0;
import fr.t;
import g4.b0;
import g4.z;
import ju.p0;
import l2.e1;
import mu.g;
import mu.h;
import oq.i0;
import oq.u;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import tq.e;
import u0.d;
import u0.j0;
import u0.p;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ#\u0010\u0016\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010 R$\u00101\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u00103\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u00106\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u0014\u0010:\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\"¨\u0006;"}, d2 = {"Lf2/ro;", "Lf3/m$c;", "Lg4/z;", "Lb1/j;", "interactionSource", "", "checked", "Lu0/j0;", "", "animationSpec", "<init>", "(Lb1/j;ZLu0/j0;)V", "Loq/i0;", "W2", "()V", "Y2", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "z3", "r", "Lb1/j;", "u3", "()Lb1/j;", "y3", "(Lb1/j;)V", "s", "Z", "t3", "()Z", "x3", "(Z)V", "t", "Lu0/j0;", "s3", "()Lu0/j0;", "w3", "(Lu0/j0;)V", "v", "isPressed", "Lu0/c;", "Lu0/p;", "w", "Lu0/c;", "offsetAnim", "x", "sizeAnim", "y", "F", "initialOffset", "z", "initialSize", "R2", "shouldAutoInvalidate", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ro extends m.c implements z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private j interactionSource;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean checked;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private j0<Float> animationSpec;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean isPressed;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private u0.c<Float, p> offsetAnim;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private u0.c<Float, p> sizeAnim;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private float initialOffset = Float.NaN;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private float initialSize = Float.NaN;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements er.p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f57648e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f57650g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f15, e<? super a> eVar) {
            super(2, eVar);
            this.f57650g = f15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f57648e;
            if (i15 == 0) {
                u.b(obj);
                u0.c cVar = ro.this.sizeAnim;
                if (cVar != null) {
                    Float fD = vq.b.d(this.f57650g);
                    j0<Float> j0VarS3 = ro.this.isPressed ? hm.f56123f : ro.this.s3();
                    this.f57648e = 1;
                    obj = u0.c.f(cVar, fD, j0VarS3, null, null, this, 12, null);
                    if (obj == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return ro.this.new a(this.f57650g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements er.p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f57651e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f57653g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f15, e<? super b> eVar) {
            super(2, eVar);
            this.f57653g = f15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f57651e;
            if (i15 == 0) {
                u.b(obj);
                u0.c cVar = ro.this.offsetAnim;
                if (cVar != null) {
                    Float fD = vq.b.d(this.f57653g);
                    j0<Float> j0VarS3 = ro.this.isPressed ? hm.f56123f : ro.this.s3();
                    this.f57651e = 1;
                    obj = u0.c.f(cVar, fD, j0VarS3, null, null, this, 12, null);
                    if (obj == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return ro.this.new b(this.f57653g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends k implements er.p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f57654e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n0 f57656a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ro f57657b;

            a(n0 n0Var, ro roVar) {
                this.f57656a = n0Var;
                this.f57657b = roVar;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(i iVar, e<? super i0> eVar) {
                if (iVar instanceof n.b) {
                    this.f57656a.f66407a++;
                } else if (iVar instanceof n.c) {
                    this.f57656a.f66407a--;
                } else if (iVar instanceof n.a) {
                    this.f57656a.f66407a--;
                }
                boolean z15 = this.f57656a.f66407a > 0;
                if (this.f57657b.isPressed != z15) {
                    this.f57657b.isPressed = z15;
                    b0.b(this.f57657b);
                }
                return i0.f148189a;
            }
        }

        c(e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f57654e;
            if (i15 == 0) {
                u.b(obj);
                n0 n0Var = new n0();
                g<i> gVarC = ro.this.getInteractionSource().c();
                a aVar = new a(n0Var, ro.this);
                this.f57654e = 1;
                if (gVarC.a(aVar, this) == objE) {
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
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return ro.this.new c(eVar);
        }
    }

    public ro(j jVar, boolean z15, j0<Float> j0Var) {
        this.interactionSource = jVar;
        this.checked = z15;
        this.animationSpec = j0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v3(a2 a2Var, ro roVar, float f15, a2.a aVar) {
        u0.c<Float, p> cVar = roVar.offsetAnim;
        a2.a.I(aVar, a2Var, cVar != null ? (int) cVar.m().floatValue() : (int) f15, 0, 0.0f, 4, null);
        return i0.f148189a;
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // f3.m.c
    public void W2() {
        ju.k.d(M2(), null, null, new c(null), 3, null);
    }

    @Override // f3.m.c
    public void Y2() {
        super.Y2();
        this.offsetAnim = null;
        this.sizeAnim = null;
        this.initialSize = Float.NaN;
        this.initialOffset = Float.NaN;
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        float fK;
        boolean z15 = (v0Var.n(c5.b.l(j15)) == 0 || v0Var.m0(c5.b.k(j15)) == 0) ? false : true;
        if (this.isPressed) {
            fK = e1.f114447a.n();
        } else {
            fK = (z15 || this.checked) ? hm.k() : hm.l();
        }
        float fL2 = y0Var.l2(fK);
        u0.c<Float, p> cVar = this.sizeAnim;
        int iFloatValue = (int) (cVar != null ? cVar.m().floatValue() : fL2);
        final a2 a2VarO0 = v0Var.o0(c5.b.INSTANCE.c(iFloatValue, iFloatValue));
        final float fL3 = y0Var.l2(c5.h.n(c5.h.n(hm.f56121d - y0Var.d2(fL2)) / 2.0f));
        float fL4 = y0Var.l2(c5.h.n(c5.h.n(hm.f56120c - hm.k()) - hm.f56122e));
        boolean z16 = this.isPressed;
        if (z16 && this.checked) {
            fL3 = fL4 - y0Var.l2(e1.f114447a.u());
        } else if (z16 && !this.checked) {
            fL3 = y0Var.l2(e1.f114447a.u());
        } else if (this.checked) {
            fL3 = fL4;
        }
        u0.c<Float, p> cVar2 = this.sizeAnim;
        if (!t.b(cVar2 != null ? cVar2.k() : null, fL2)) {
            ju.k.d(M2(), null, null, new a(fL2, null), 3, null);
        }
        u0.c<Float, p> cVar3 = this.offsetAnim;
        if (!t.b(cVar3 != null ? cVar3.k() : null, fL3)) {
            ju.k.d(M2(), null, null, new b(fL3, null), 3, null);
        }
        if (Float.isNaN(this.initialSize) && Float.isNaN(this.initialOffset)) {
            this.initialSize = fL2;
            this.initialOffset = fL3;
        }
        return y0.j2(y0Var, iFloatValue, iFloatValue, null, new l() { // from class: f2.qo
            @Override // er.l
            public final Object b(Object obj) {
                return ro.v3(a2VarO0, this, fL3, (a2.a) obj);
            }
        }, 4, null);
    }

    public final j0<Float> s3() {
        return this.animationSpec;
    }

    /* JADX INFO: renamed from: t3, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    /* JADX INFO: renamed from: u3, reason: from getter */
    public final j getInteractionSource() {
        return this.interactionSource;
    }

    public final void w3(j0<Float> j0Var) {
        this.animationSpec = j0Var;
    }

    public final void x3(boolean z15) {
        this.checked = z15;
    }

    public final void y3(j jVar) {
        this.interactionSource = jVar;
    }

    public final void z3() {
        if (this.sizeAnim == null && !Float.isNaN(this.initialSize)) {
            this.sizeAnim = d.b(this.initialSize, 0.0f, 2, null);
        }
        if (this.offsetAnim != null || Float.isNaN(this.initialOffset)) {
            return;
        }
        this.offsetAnim = d.b(this.initialOffset, 0.0f, 2, null);
    }
}
