package m4;

import er.p;
import lr.m;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0017\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R0\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006 "}, d2 = {"Lm4/f;", "", "", "viewportSize", "Lkotlin/Function2;", "", "Ltq/e;", "scrollBy", "<init>", "(ILer/p;)V", "delta", "Loq/i0;", "e", "(FLtq/e;)Ljava/lang/Object;", "d", "()V", "min", "max", "f", "(IILtq/e;)Ljava/lang/Object;", "offset", "c", "(I)I", "g", "a", "I", "b", "Ler/p;", "value", "F", "()F", "scrollAmount", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int viewportSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p<Float, tq.e<? super Float>, Object> scrollBy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float scrollAmount;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f123707d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f123709f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f123707d = obj;
            this.f123709f |= PKIFailureInfo.systemUnavail;
            return f.this.e(0.0f, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(int i15, p<? super Float, ? super tq.e<? super Float>, ? extends Object> pVar) {
        this.viewportSize = i15;
        this.scrollBy = pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(float f15, tq.e<? super i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f123709f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f123709f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f123707d;
        Object objE = uq.b.e();
        int i16 = aVar.f123709f;
        if (i16 == 0) {
            u.b(objB);
            p<Float, tq.e<? super Float>, Object> pVar = this.scrollBy;
            Float fD = vq.b.d(f15);
            aVar.f123709f = 1;
            objB = pVar.B(fD, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        this.scrollAmount += ((Number) objB).floatValue();
        return i0.f148189a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getScrollAmount() {
        return this.scrollAmount;
    }

    public final int c(int offset) {
        return m.n(offset - hr.a.d(this.scrollAmount), 0, this.viewportSize);
    }

    public final void d() {
        this.scrollAmount = 0.0f;
    }

    public final Object f(int i15, int i16, tq.e<? super i0> eVar) {
        Object objG;
        if (i15 > i16) {
            throw new IllegalArgumentException(("Expected min=" + i15 + " ≤ max=" + i16).toString());
        }
        int i17 = i16 - i15;
        int i18 = this.viewportSize;
        if (i17 <= i18) {
            float f15 = i15;
            float f16 = this.scrollAmount;
            return ((f15 < f16 || ((float) i16) > f16 + ((float) i18)) && (objG = g((float) ((i15 + (i17 / 2)) - (i18 / 2)), eVar)) == uq.b.e()) ? objG : i0.f148189a;
        }
        throw new IllegalArgumentException(("Expected range (" + i17 + ") to be ≤ viewportSize=" + this.viewportSize).toString());
    }

    public final Object g(float f15, tq.e<? super i0> eVar) throws Throwable {
        Object objE = e(f15 - this.scrollAmount, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }
}
