package p02;

import eo0.OwTokens;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lp02/p0;", "", "Lp02/p0$a;", "Loq/i0;", "Lgo0/j0;", "sendEpuapMessageUC", "Ls02/b;", "getOwAccessTokenUseCase", "Lp02/f0;", "handleElectronicDeliveryErrorUC", "<init>", "(Lgo0/j0;Ls02/b;Lp02/f0;)V", "params", "Ldx/i;", "Ldx/b;", "e", "(Lp02/p0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgo0/j0;", "b", "Ls02/b;", "c", "Lp02/f0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p0 implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final go0.j0 sendEpuapMessageUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s02.b getOwAccessTokenUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f0 handleElectronicDeliveryErrorUC;

    /* JADX INFO: renamed from: p02.p0$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp02/p0$a;", "Lgz/b$a;", "Lo02/a$b;", "result", "<init>", "(Lo02/a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo02/a$b;", "()Lo02/a$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final o02.a.Epuap result;

        public Params(o02.a.Epuap epuap) {
            this.result = epuap;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final o02.a.Epuap getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.result, ((Params) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "Params(result=" + this.result + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151306d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f151307e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f151308f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f151309g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f151310h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f151311j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f151312k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f151313l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f151314m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f151315n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f151316p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f151318r;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151316p = obj;
            this.f151318r |= PKIFailureInfo.systemUnavail;
            return p0.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Leo0/i0$a;", "token", "Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "(Leo0/i0$a;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<OwTokens.Access, tq.e<? super dx.i<? extends dx.b, ? extends oq.i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151320f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ eo0.b0 f151322h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(eo0.b0 b0Var, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f151322h = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OwTokens.Access access = (OwTokens.Access) this.f151320f;
            Object objE = uq.b.e();
            int i15 = this.f151319e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            go0.j0 j0Var = p0.this.sendEpuapMessageUC;
            go0.j0.Params params = new go0.j0.Params(access, this.f151322h);
            this.f151320f = vq.j.a(access);
            this.f151319e = 1;
            Object objC = j0Var.c(params, this);
            return objC == objE ? objE : objC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            return ((c) v(access, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = p0.this.new c(this.f151322h, eVar);
            cVar.f151320f = obj;
            return cVar;
        }
    }

    public p0(go0.j0 j0Var, s02.b bVar, f0 f0Var) {
        this.sendEpuapMessageUC = j0Var;
        this.getOwAccessTokenUseCase = bVar;
        this.handleElectronicDeliveryErrorUC = f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0358  */
    /* JADX WARN: Code duplicated, block: B:130:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:132:0x03ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:133:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:72:0x01bc A[PHI: r5
      0x01bc: PHI (r5v10 java.lang.String) = (r5v9 java.lang.String), (r5v32 java.lang.String) binds: [B:56:0x018b, B:70:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03a1, code lost:
    
        if (r1 == r3) goto L127;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(p02.p0.Params r30, tq.e<? super dx.i<? extends dx.b, oq.i0>> r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p02.p0.e(p02.p0$a, tq.e):java.lang.Object");
    }
}
