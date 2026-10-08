package dd4;

import fr.t;
import jb4.ErrorActionData;
import jb4.PayloadErrorData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import pl.gov.mc.fringers.mobywatel.f0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Ldd4/q;", "Lib4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Ldx/b;", "Ljb4/f;", "h", "(Ldx/b;)Ljb4/f;", "Lib4/d$a;", "params", "Ldx/i;", "Loq/i0;", "Ljb4/b;", "i", "(Lib4/d$a;)Ldx/i;", "a", "Lmx/c;", "b", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements ib4.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f41088b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41089c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldd4/q$a;", "", "<init>", "()V", "", "INFO_WITHOUT_RETRY", "Ljava/lang/String;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public q(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final PayloadErrorData h(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(ib4.d.Params aVar) {
        aVar.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(ib4.d.Params aVar) {
        aVar.c().b(ib4.c.b.AbstractC2161b.C2162b.f90860a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(ib4.d.Params aVar) {
        aVar.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public dx.i<i0, jb4.b> b(final ib4.d.Params params) {
        ErrorActionData errorActionData;
        PayloadErrorData payloadErrorDataH = h(params.a());
        boolean z15 = !t.c(payloadErrorDataH != null ? payloadErrorDataH.getAction() : null, "INFO_WITHOUT_RETRY") && params.getGenericRetryAllowed();
        ErrorActionData errorActionData2 = new ErrorActionData(this.labelProvider.c(f0.f160716j), new er.a() { // from class: dd4.n
            @Override // er.a
            public final Object a() {
                return q.l(params);
            }
        });
        String title = payloadErrorDataH != null ? payloadErrorDataH.getTitle() : null;
        Label labelC = (title == null || t.c(title, "")) ? this.labelProvider.c(f0.f160718k) : mx.b.b(title, "title");
        String message = payloadErrorDataH != null ? payloadErrorDataH.getMessage() : null;
        Label labelC2 = (message == null || t.c(message, "")) ? this.labelProvider.c(f0.f160720l) : mx.b.b(message, "message");
        if (z15) {
            errorActionData = new ErrorActionData(this.labelProvider.c(f0.f160724n), new er.a() { // from class: dd4.o
                @Override // er.a
                public final Object a() {
                    return q.m(params);
                }
            });
        } else {
            if (z15) {
                throw new oq.p();
            }
            errorActionData = errorActionData2;
        }
        return new dx.i.Right(new jb4.b.Failure(labelC, labelC2, null, errorActionData, z15 ? errorActionData2 : null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: dd4.p
            @Override // er.a
            public final Object a() {
                return q.q(params);
            }
        }), 36, null));
    }
}
