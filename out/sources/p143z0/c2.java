package p143z0;

import c5.d;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import su.g;
import tq.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000bJ\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0013\u001a\u00020\u000f*\u00020\u0012H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u0015*\u00020\u0012H\u0097\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u000e*\u00020\u0015H\u0097\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u001c\u001a\u00020\u000e*\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u0014\u0010\u001d\u001a\u00020\u000e*\u00020\u0012H\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u0014J\u0014\u0010\u001e\u001a\u00020\u0012*\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010 \u001a\u00020\u0012*\u00020\u000eH\u0097\u0001¢\u0006\u0004\b \u0010\u001fJ\u0014\u0010#\u001a\u00020\"*\u00020!H\u0097\u0001¢\u0006\u0004\b#\u0010$J\u0014\u0010%\u001a\u00020!*\u00020\"H\u0097\u0001¢\u0006\u0004\b%\u0010$R\u0016\u0010'\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010 R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u000f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\u000f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b/\u0010.¨\u00061"}, d2 = {"Lz0/c2;", "Lz0/b2;", "Lc5/d;", "density", "<init>", "(Lc5/d;)V", "Loq/i0;", "c", "()V", "e", "h", "(Ltq/e;)Ljava/lang/Object;", "", "L1", "Lc5/h;", "", "l2", "(F)F", "Lc5/v;", "e1", "(J)F", "", "X0", "(F)I", "q2", "(J)I", "b2", "(I)F", "d2", "h0", "y0", "(F)J", "Z", "Lc5/k;", "Lm3/k;", "B2", "(J)J", "a0", "b", "isReleased", "isCanceled", "Lsu/a;", "d", "Lsu/a;", "mutex", "getDensity", "()F", "i2", "fontScale", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c2 implements b2, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d f231202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isReleased;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isCanceled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final su.a mutex = g.a(false);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f231206d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f231208f;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231206d = obj;
            this.f231208f |= PKIFailureInfo.systemUnavail;
            return c2.this.h(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f231209d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f231211f;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231209d = obj;
            this.f231211f |= PKIFailureInfo.systemUnavail;
            return c2.this.L1(this);
        }
    }

    public c2(d dVar) {
        this.f231202a = dVar;
    }

    @Override // c5.d
    public long B2(long j15) {
        return this.f231202a.B2(j15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p143z0.b2
    public Object L1(e<? super Boolean> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f231211f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f231211f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f231209d;
        Object objE = uq.b.e();
        int i16 = bVar.f231211f;
        if (i16 == 0) {
            u.b(obj);
            if (!this.isReleased && !this.isCanceled) {
                su.a aVar = this.mutex;
                bVar.f231211f = 1;
                if (su.a.C4762a.a(aVar, null, bVar, 1, null) == objE) {
                    return objE;
                }
            }
            return vq.b.a(this.isReleased);
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        u.b(obj);
        su.a.C4762a.c(this.mutex, null, 1, null);
        return vq.b.a(this.isReleased);
    }

    @Override // c5.d
    public int X0(float f15) {
        return this.f231202a.X0(f15);
    }

    @Override // c5.l
    public long Z(float f15) {
        return this.f231202a.Z(f15);
    }

    @Override // c5.d
    public long a0(long j15) {
        return this.f231202a.a0(j15);
    }

    @Override // c5.d
    public float b2(int i15) {
        return this.f231202a.b2(i15);
    }

    public final void c() {
        this.isCanceled = true;
        if (this.mutex.p()) {
            su.a.C4762a.c(this.mutex, null, 1, null);
        }
    }

    @Override // c5.d
    public float d2(float f15) {
        return this.f231202a.d2(f15);
    }

    public final void e() {
        this.isReleased = true;
        if (this.mutex.p()) {
            su.a.C4762a.c(this.mutex, null, 1, null);
        }
    }

    @Override // c5.d
    public float e1(long j15) {
        return this.f231202a.e1(j15);
    }

    @Override // c5.d
    /* JADX INFO: renamed from: getDensity */
    public float get_density() {
        return this.f231202a.get_density();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(e<? super i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f231208f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f231208f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f231206d;
        Object objE = uq.b.e();
        int i16 = aVar.f231208f;
        if (i16 == 0) {
            u.b(obj);
            su.a aVar2 = this.mutex;
            aVar.f231208f = 1;
            if (su.a.C4762a.a(aVar2, null, aVar, 1, null) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        this.isReleased = false;
        this.isCanceled = false;
        return i0.f148189a;
    }

    @Override // c5.l
    public float h0(long j15) {
        return this.f231202a.h0(j15);
    }

    @Override // c5.l
    /* JADX INFO: renamed from: i2 */
    public float get_fontScale() {
        return this.f231202a.get_fontScale();
    }

    @Override // c5.d
    public float l2(float f15) {
        return this.f231202a.l2(f15);
    }

    @Override // c5.d
    public int q2(long j15) {
        return this.f231202a.q2(j15);
    }

    @Override // c5.d
    public long y0(float f15) {
        return this.f231202a.y0(f15);
    }
}
