package p046f2;

import b1.g;
import b1.i;
import b1.n;
import c5.h;
import fr.k;
import h2.g1;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.f6;
import tq.e;
import u0.c;
import u0.p;
import u0.s3;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u0002*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006!"}, d2 = {"Lf2/hc;", "", "Lc5/h;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFLfr/k;)V", "Lb1/i;", "d", "(Lb1/i;)F", "Loq/i0;", "e", "(Ltq/e;)Ljava/lang/Object;", "f", "(FFFFLtq/e;)Ljava/lang/Object;", "to", "b", "(Lb1/i;Ltq/e;)Ljava/lang/Object;", "Lm2/f6;", "c", "()Lm2/f6;", "a", "F", "Lu0/c;", "Lu0/p;", "Lu0/c;", "animatable", "Lb1/i;", "lastTargetInteraction", "g", "targetInteraction", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float defaultElevation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float pressedElevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float hoveredElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float focusedElevation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c<h, p> animatable;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private i lastTargetInteraction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private i targetInteraction;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f56079d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f56080e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f56082g;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f56080e = obj;
            this.f56082g |= PKIFailureInfo.systemUnavail;
            return hc.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f56083d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f56085f;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f56083d = obj;
            this.f56085f |= PKIFailureInfo.systemUnavail;
            return hc.this.e(this);
        }
    }

    public /* synthetic */ hc(float f15, float f16, float f17, float f18, k kVar) {
        this(f15, f16, f17, f18);
    }

    private final float d(i iVar) {
        if (iVar instanceof n.b) {
            return this.pressedElevation;
        }
        if (iVar instanceof g) {
            return this.hoveredElevation;
        }
        return iVar instanceof b1.d ? this.focusedElevation : this.defaultElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(e<? super i0> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f56085f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f56085f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f56083d;
        Object objE = uq.b.e();
        int i16 = bVar.f56085f;
        try {
            if (i16 == 0) {
                u.b(obj);
                float fD = d(this.targetInteraction);
                if (!h.p(this.animatable.k().getValue(), fD)) {
                    c<h, p> cVar = this.animatable;
                    h hVarJ = h.j(fD);
                    bVar.f56085f = 1;
                    if (cVar.t(hVarJ, bVar) == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            this.lastTargetInteraction = this.targetInteraction;
            return i0.f148189a;
        } catch (Throwable th4) {
            this.lastTargetInteraction = this.targetInteraction;
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [b1.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [b1.i] */
    /* JADX WARN: Type inference failed for: r6v2, types: [b1.i] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, oq.i0] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Object b(i iVar, e<? super i0> eVar) throws Throwable {
        a aVar;
        ?? r15;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f56082g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f56082g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f56080e;
        Object objE = uq.b.e();
        int i16 = aVar.f56082g;
        try {
            if (i16 == 0) {
                u.b(obj);
                float fD = d(iVar);
                this.targetInteraction = iVar;
                r15 = iVar;
                if (!h.p(this.animatable.k().getValue(), fD)) {
                    c<h, p> cVar = this.animatable;
                    i iVar2 = this.lastTargetInteraction;
                    aVar.f56079d = iVar;
                    aVar.f56082g = 1;
                    if (g1.d(cVar, fD, iVar2, iVar, aVar) == objE) {
                        r15 = iVar;
                        return objE;
                    }
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i iVar3 = (i) aVar.f56079d;
                u.b(obj);
                r15 = iVar3;
            }
            r15 = iVar;
            this.lastTargetInteraction = r15;
            iVar = i0.f148189a;
            return iVar;
        } catch (Throwable th4) {
            this.lastTargetInteraction = iVar;
            throw th4;
        }
    }

    public final f6<h> c() {
        return this.animatable.g();
    }

    public final Object f(float f15, float f16, float f17, float f18, e<? super i0> eVar) throws Throwable {
        this.defaultElevation = f15;
        this.pressedElevation = f16;
        this.hoveredElevation = f17;
        this.focusedElevation = f18;
        Object objE = e(eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    private hc(float f15, float f16, float f17, float f18) {
        this.defaultElevation = f15;
        this.pressedElevation = f16;
        this.hoveredElevation = f17;
        this.focusedElevation = f18;
        this.animatable = new c<>(h.j(this.defaultElevation), s3.L(h.INSTANCE), null, null, 12, null);
    }
}
