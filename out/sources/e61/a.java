package e61;

import ju.g1;
import ju.q0;
import mu.b0;
import mu.g;
import mu.h;
import mu.p0;
import mu.r0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Le61/a;", "Lk61/a;", "<init>", "()V", "Li61/a;", "state", "Loq/i0;", "a", "(Li61/a;)V", "Lmu/b0;", "Lc61/a;", "Lmu/b0;", "_faceDetectionInstallationState", "Lmu/p0;", "b", "Lmu/p0;", "d", "()Lmu/p0;", "faceDetectionInstallationState", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements k61.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0<c61.a> _faceDetectionInstallationState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p0<i61.a> faceDetectionInstallationState;

    /* JADX INFO: renamed from: e61.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1096a implements g<i61.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f47669a;

        /* JADX INFO: renamed from: e61.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1097a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f47670a;

            /* JADX INFO: renamed from: e61.a$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1098a extends d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f47671d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f47672e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f47673f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f47675h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f47676j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f47677k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f47678l;

                public C1098a(e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f47671d = obj;
                    this.f47672e |= PKIFailureInfo.systemUnavail;
                    return C1097a.this.F(null, this);
                }
            }

            public C1097a(h hVar) {
                this.f47670a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, e eVar) throws Throwable {
                C1098a c1098a;
                if (eVar instanceof C1098a) {
                    c1098a = (C1098a) eVar;
                    int i15 = c1098a.f47672e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1098a.f47672e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1098a = new C1098a(eVar);
                    }
                } else {
                    c1098a = new C1098a(eVar);
                }
                Object obj2 = c1098a.f47671d;
                Object objE = uq.b.e();
                int i16 = c1098a.f47672e;
                if (i16 == 0) {
                    u.b(obj2);
                    h hVar = this.f47670a;
                    i61.a aVarL = b61.a.l((c61.a) obj);
                    c1098a.f47673f = j.a(obj);
                    c1098a.f47675h = j.a(c1098a);
                    c1098a.f47676j = j.a(obj);
                    c1098a.f47677k = j.a(hVar);
                    c1098a.f47678l = 0;
                    c1098a.f47672e = 1;
                    if (hVar.F(aVarL, c1098a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public C1096a(g gVar) {
            this.f47669a = gVar;
        }

        @Override // mu.g
        public Object a(h<? super i61.a> hVar, e eVar) {
            Object objA = this.f47669a.a(new C1097a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public a() {
        b0<c61.a> b0VarA = r0.a(c61.a.NOT_STARTED);
        this._faceDetectionInstallationState = b0VarA;
        this.faceDetectionInstallationState = g00.b.a(new C1096a(b0VarA), i61.a.NOT_STARTED, q0.a(g1.a()));
    }

    @Override // k61.a
    public void a(i61.a state) {
        b0<c61.a> b0Var = this._faceDetectionInstallationState;
        while (!b0Var.s(b0Var.getValue(), b61.a.L(state))) {
        }
    }

    @Override // k61.a
    public p0<i61.a> d() {
        return this.faceDetectionInstallationState;
    }
}
