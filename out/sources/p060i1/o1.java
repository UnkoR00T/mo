package p060i1;

import er.l;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p143z0.d3;
import p143z0.e1;
import p143z0.h2;
import tq.e;
import uq.b;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u00020\t*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Li1/o1;", "Lz0/e1;", "Lz0/d3;", "originalFlingBehavior", "Li1/i1;", "pagerState", "<init>", "(Lz0/d3;Li1/i1;)V", "Lz0/h2;", "", "initialVelocity", "a", "(Lz0/h2;FLtq/e;)Ljava/lang/Object;", "Lz0/d3;", "getOriginalFlingBehavior", "()Lz0/d3;", "b", "Li1/i1;", "getPagerState", "()Li1/i1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class o1 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d3 originalFlingBehavior;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i1 pagerState;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f88006d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f88008f;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f88006d = obj;
            this.f88008f |= PKIFailureInfo.systemUnavail;
            return o1.this.a(null, 0.0f, this);
        }
    }

    public o1(d3 d3Var, i1 i1Var) {
        this.originalFlingBehavior = d3Var;
        this.pagerState = i1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(o1 o1Var, h2 h2Var, float f15) {
        o1Var.pagerState.z0(h2Var, hr.a.d(o1Var.pagerState.P() != 0 ? f15 / o1Var.pagerState.P() : 0.0f) + o1Var.pagerState.A());
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p143z0.e1
    public Object a(final h2 h2Var, float f15, e<? super Float> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f88008f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f88008f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f88006d;
        Object objE = b.e();
        int i16 = aVar.f88008f;
        if (i16 == 0) {
            u.b(objB);
            d3 d3Var = this.originalFlingBehavior;
            l<? super Float, i0> lVar = new l() { // from class: i1.n1
                @Override // er.l
                public final Object b(Object obj) {
                    return o1.f(this.f87992a, h2Var, ((Float) obj).floatValue());
                }
            };
            aVar.f88008f = 1;
            objB = d3Var.b(h2Var, f15, lVar, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        float fFloatValue = ((Number) objB).floatValue();
        if (this.pagerState.B() != 0.0f && Math.abs(this.pagerState.B()) < 0.001d) {
            i1 i1Var = this.pagerState;
            i1.i0(i1Var, i1Var.A(), 0.0f, 2, null);
        } else {
            vq.b.d(this.pagerState.B());
        }
        return vq.b.d(fFloatValue);
    }
}
