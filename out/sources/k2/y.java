package k2;

import b3.a0;
import b3.b0;
import oq.i0;
import p071kotlin.Metadata;
import u0.s3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u0010B\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lk2/y;", "Lk2/v;", "Lu0/c;", "", "Lu0/p;", "anim", "<init>", "(Lu0/c;)V", "()V", "Loq/i0;", "b", "(Ltq/e;)Ljava/lang/Object;", "d", "targetValue", "c", "(FLtq/e;)Ljava/lang/Object;", "a", "Lu0/c;", "()F", "distanceFraction", "", "e", "()Z", "isAnimating", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b3.x<y, Float> f107569c = a0.e(new er.p() { // from class: k2.w
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return y.h((b0) obj, (y) obj2);
        }
    }, new er.l() { // from class: k2.x
        @Override // er.l
        public final Object b(Object obj) {
            return y.i(((Float) obj).floatValue());
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u0.c<Float, u0.p> anim;

    /* JADX INFO: renamed from: k2.y$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lk2/y$a;", "", "<init>", "()V", "Lb3/x;", "Lk2/y;", "", "Saver", "Lb3/x;", "a", "()Lb3/x;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final b3.x<y, Float> a() {
            return y.f107569c;
        }

        private Companion() {
        }
    }

    private y(u0.c<Float, u0.p> cVar) {
        this.anim = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float h(b0 b0Var, y yVar) {
        return yVar.anim.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y i(float f15) {
        return new y(new u0.c(Float.valueOf(f15), s3.P(fr.m.f66405a), null, null, 12, null));
    }

    @Override // k2.v
    public float a() {
        return this.anim.m().floatValue();
    }

    @Override // k2.v
    public Object b(tq.e<? super i0> eVar) {
        Object objF = u0.c.f(this.anim, vq.b.d(1.0f), null, null, null, eVar, 14, null);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    @Override // k2.v
    public Object c(float f15, tq.e<? super i0> eVar) {
        Object objT = this.anim.t(vq.b.d(f15), eVar);
        return objT == uq.b.e() ? objT : i0.f148189a;
    }

    @Override // k2.v
    public Object d(tq.e<? super i0> eVar) {
        Object objF = u0.c.f(this.anim, vq.b.d(0.0f), null, null, null, eVar, 14, null);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    @Override // k2.v
    public boolean e() {
        return this.anim.p();
    }

    public y() {
        this(new u0.c(Float.valueOf(0.0f), s3.P(fr.m.f66405a), null, null, 12, null));
    }
}
