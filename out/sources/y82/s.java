package y82;

import jb4.PayloadErrorData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ly82/s;", "Ly82/b;", "Lmx/c;", "labelProvider", "Lib4/c;", "genericDomainErrorMapper", "<init>", "(Lmx/c;Lib4/c;)V", "", "requestId", "Lmx/a;", "G", "(Ljava/lang/String;)Lmx/a;", "Ldx/b;", "Ljb4/f;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Ldx/b;)Ljb4/f;", "Ly82/b$a;", "params", "Ljb4/b;", "I", "(Ly82/b$a;)Ljb4/b;", "a", "Lmx/c;", "b", "Lib4/c;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    public s(mx.c cVar, ib4.c cVar2) {
        this.labelProvider = cVar;
        this.genericDomainErrorMapper = cVar2;
    }

    private final Label G(String requestId) {
        mx.c cVar = this.labelProvider;
        int i15 = v72.b.f204286q;
        Object objC = requestId;
        if (requestId == null) {
            objC = cVar.c(v72.b.f204310y);
        }
        return cVar.e(i15, objC);
    }

    private final PayloadErrorData H(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(b.Params params) {
        params.d().b(new ib4.c.b.a.Primary(a.TRY_AGAIN));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(b.Params params) {
        params.d().b(new ib4.c.b.a.Secondary(a.RETURN_TO_SUCCESS_SCREEN));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(b.Params params) {
        params.d().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(b.Params params) {
        params.d().b(new ib4.c.b.a.Primary(a.RETURN_TO_SUCCESS_SCREEN));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(b.Params params) {
        params.d().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(b.Params params) {
        params.d().b(new ib4.c.b.a.Primary(a.TRY_AGAIN));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(b.Params params) {
        params.d().b(new ib4.c.b.a.Secondary(a.RETURN_TO_SUCCESS_SCREEN));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(b.Params params) {
        params.d().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(b.Params params) {
        params.d().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(b.Params params) {
        params.d().b(new ib4.c.b.a.Primary(a.RETURN_TO_SUCCESS_SCREEN));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(b.Params params) {
        params.d().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(b.Params params) {
        params.d().b(new ib4.c.b.a.Primary(a.RETURN_TO_SUCCESS_SCREEN));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(b.Params params) {
        params.d().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W(b.Params params) {
        params.d().b(new ib4.c.b.a.Primary(a.RETURN_TO_SUCCESS_SCREEN));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(b.Params params) {
        params.d().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(b.Params params) {
        params.d().b(new ib4.c.b.a.Primary(a.RETURN_TO_SUCCESS_SCREEN));
        return i0.f148189a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (r0.equals("8003") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        if (r0.equals("8002") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        if (r0.equals("5021") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        if (r0.equals("5018") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        if (r0.equals("5015") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (r0.equals("5013") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (r0.equals("5009") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
    
        if (r0.equals("5007") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0106, code lost:
    
        return new jb4.b.Failure(r12.labelProvider.c(v72.b.f204298u), r12.labelProvider.c(v72.b.f204307x), G(r13.getRequestId()), new jb4.ErrorActionData(r12.labelProvider.c(v72.b.f204241b), new y82.r(r13)), null, null, new jb4.ErrorActionData(mx.Label.INSTANCE.c(), new y82.d(r13)), 48, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ab, code lost:
    
        if (r0.equals("5003") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b5, code lost:
    
        if (r0.equals("5002") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01fd, code lost:
    
        return new jb4.b.Failure(r12.labelProvider.c(v72.b.f204298u), r12.labelProvider.c(v72.b.f204313z), G(r13.getRequestId()), new jb4.ErrorActionData(r12.labelProvider.c(v72.b.f204241b), new y82.i(r13)), null, null, new jb4.ErrorActionData(mx.Label.INSTANCE.c(), new y82.j(r13)), 48, null);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // er.l
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jb4.b b(final y82.b.Params r13) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y82.s.b(y82.b$a):jb4.b");
    }
}
