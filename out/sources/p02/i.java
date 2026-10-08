package p02;

import eo0.DeliveryMessageDetails;
import eo0.OwTokens;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import z02.MessageDetailsPayload;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001f!B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u00192\u0006\u0010\u001c\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lp02/i;", "", "Lp02/i$b;", "Leo0/m;", "Ls02/b;", "getOwAccessTokenUseCase", "Lp02/f0;", "handleElectronicDeliveryErrorUC", "Lmx/c;", "labelProvider", "Lgo0/v;", "getMessageDetailsUC", "<init>", "(Ls02/b;Lp02/f0;Lmx/c;Lgo0/v;)V", "", "message", "Ldx/b$c;", "g", "(Ljava/lang/String;)Ldx/b$c;", "Ldx/b;", "error", "Leo0/g0;", "messageId", "Leo0/r;", "directoryId", "Ldx/i;", "e", "(Ldx/b;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "params", "f", "(Lp02/i$b;Ltq/e;)Ljava/lang/Object;", "a", "Ls02/b;", "b", "Lp02/f0;", "c", "Lmx/c;", "d", "Lgo0/v;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements gz.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f151067f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s02.b getOwAccessTokenUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f0 handleElectronicDeliveryErrorUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final go0.v getMessageDetailsUC;

    /* JADX INFO: renamed from: p02.i$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp02/i$b;", "Lgz/b$a;", "Lz02/b;", "messageDetailsPayload", "<init>", "(Lz02/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz02/b;", "()Lz02/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final MessageDetailsPayload messageDetailsPayload;

        public Params(MessageDetailsPayload messageDetailsPayload) {
            this.messageDetailsPayload = messageDetailsPayload;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final MessageDetailsPayload getMessageDetailsPayload() {
            return this.messageDetailsPayload;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.messageDetailsPayload, ((Params) other).messageDetailsPayload);
        }

        public int hashCode() {
            return this.messageDetailsPayload.hashCode();
        }

        public String toString() {
            return "Params(messageDetailsPayload=" + this.messageDetailsPayload + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Leo0/i0$a;", "token", "Ldx/i;", "Ldx/b;", "Leo0/m;", "<anonymous>", "(Leo0/i0$a;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<OwTokens.Access, tq.e<? super dx.i<? extends dx.b, ? extends DeliveryMessageDetails>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151073e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151074f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f151076h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f151077j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f151076h = str;
            this.f151077j = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OwTokens.Access access = (OwTokens.Access) this.f151074f;
            Object objE = uq.b.e();
            int i15 = this.f151073e;
            if (i15 == 0) {
                oq.u.b(obj);
                go0.v vVar = i.this.getMessageDetailsUC;
                go0.v.Params params = new go0.v.Params(this.f151076h, this.f151077j, access, null);
                this.f151074f = vq.j.a(access);
                this.f151073e = 1;
                obj = vVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
            }
            if (iVar instanceof dx.i.Right) {
                return new dx.i.Right((DeliveryMessageDetails) ((dx.i.Right) iVar).b());
            }
            throw new oq.p();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, DeliveryMessageDetails>> eVar) {
            return ((c) v(access, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = i.this.new c(this.f151076h, this.f151077j, eVar);
            cVar.f151074f = obj;
            return cVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f151079e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f151080f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f151081g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f151082h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f151083j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f151084k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f151085l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f151086m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f151087n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f151088p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f151089q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f151091s;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151089q = obj;
            this.f151091s |= PKIFailureInfo.systemUnavail;
            return i.this.f(null, this);
        }
    }

    public i(s02.b bVar, f0 f0Var, mx.c cVar, go0.v vVar) {
        this.getOwAccessTokenUseCase = bVar;
        this.handleElectronicDeliveryErrorUC = f0Var;
        this.labelProvider = cVar;
        this.getMessageDetailsUC = vVar;
    }

    private final Object e(dx.b bVar, String str, String str2, tq.e<? super dx.i<? extends dx.b, DeliveryMessageDetails>> eVar) {
        return this.handleElectronicDeliveryErrorUC.b(new f0.Params(new c(str, str2, null), bVar), eVar);
    }

    private final dx.b.Business g(String message) {
        Label labelC;
        n02.a aVar = n02.a.GET_EDELIVERY_MESSAGE_NOT_READY_ERROR;
        if (message == null || (labelC = mx.b.b(message, "errorTitle")) == null) {
            labelC = this.labelProvider.c(e02.a.f46611t0);
        }
        return new dx.b.Business(aVar, null, labelC, null, null, this.labelProvider.c(e02.a.f46550j), null, 90, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:42:0x0101  */
    /* JADX WARN: Code duplicated, block: B:43:0x0104  */
    /* JADX WARN: Code duplicated, block: B:45:0x0107  */
    /* JADX WARN: Code duplicated, block: B:46:0x010c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0113  */
    /* JADX WARN: Code duplicated, block: B:51:0x0118  */
    /* JADX WARN: Code duplicated, block: B:54:0x0121  */
    /* JADX WARN: Code duplicated, block: B:61:0x0181  */
    /* JADX WARN: Code duplicated, block: B:63:0x0185  */
    /* JADX WARN: Code duplicated, block: B:65:0x0193  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017b, code lost:
    
        if (r1 == r3) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(p02.i.Params r17, tq.e<? super dx.i<? extends dx.b, eo0.DeliveryMessageDetails>> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p02.i.f(p02.i$b, tq.e):java.lang.Object");
    }
}
