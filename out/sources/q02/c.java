package q02;

import dx.i;
import eo0.OwTokens;
import eo0.g0;
import er.p;
import fr.k;
import go0.f;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p02.f0;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lq02/c;", "", "Lq02/c$a;", "Loq/i0;", "Lgo0/f;", "deleteEpuapMessageUC", "Ls02/b;", "getOwAccessTokenUseCase", "Lp02/f0;", "handleElectronicDeliveryErrorUC", "<init>", "(Lgo0/f;Ls02/b;Lp02/f0;)V", "params", "Ldx/i;", "Ldx/b;", "e", "(Lq02/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgo0/f;", "b", "Ls02/b;", "c", "Lp02/f0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f deleteEpuapMessageUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s02.b getOwAccessTokenUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f0 handleElectronicDeliveryErrorUC;

    /* JADX INFO: renamed from: q02.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lq02/c$a;", "Lgz/b$a;", "Leo0/g0;", "messageId", "<init>", "(Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageId;

        public /* synthetic */ Params(String str, k kVar) {
            this(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && g0.d(this.messageId, ((Params) other).messageId);
        }

        public int hashCode() {
            return g0.e(this.messageId);
        }

        public String toString() {
            return "Params(messageId=" + ((Object) g0.f(this.messageId)) + ')';
        }

        private Params(String str) {
            this.messageId = str;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f163485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f163486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f163487f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f163488g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f163489h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f163490j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f163491k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f163492l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f163493m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f163494n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f163496q;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f163494n = obj;
            this.f163496q |= PKIFailureInfo.systemUnavail;
            return c.this.e(null, this);
        }
    }

    /* JADX INFO: renamed from: q02.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Leo0/i0$a;", "token", "Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "(Leo0/i0$a;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class C4057c extends vq.k implements p<OwTokens.Access, tq.e<? super i<? extends dx.b, ? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163497e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f163498f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f163500h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4057c(Params params, tq.e<? super C4057c> eVar) {
            super(2, eVar);
            this.f163500h = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OwTokens.Access access = (OwTokens.Access) this.f163498f;
            Object objE = uq.b.e();
            int i15 = this.f163497e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            f fVar = c.this.deleteEpuapMessageUC;
            f.Params params = new f.Params(access, this.f163500h.getMessageId(), null);
            this.f163498f = j.a(access);
            this.f163497e = 1;
            Object objC = fVar.c(params, this);
            return objC == objE ? objE : objC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(OwTokens.Access access, tq.e<? super i<? extends dx.b, i0>> eVar) {
            return ((C4057c) v(access, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            C4057c c4057c = c.this.new C4057c(this.f163500h, eVar);
            c4057c.f163498f = obj;
            return c4057c;
        }
    }

    public c(f fVar, s02.b bVar, f0 f0Var) {
        this.deleteEpuapMessageUC = fVar;
        this.getOwAccessTokenUseCase = bVar;
        this.handleElectronicDeliveryErrorUC = f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:37:0x010a  */
    /* JADX WARN: Code duplicated, block: B:39:0x010e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x010f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0104, code lost:
    
        if (r15 == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(q02.c.Params r14, tq.e<? super dx.i<? extends dx.b, oq.i0>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q02.c.e(q02.c$a, tq.e):java.lang.Object");
    }
}
