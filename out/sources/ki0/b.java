package ki0;

import dx.i;
import er.p;
import fr.p0;
import fr.t;
import fv.b0;
import fv.c0;
import fv.d0;
import fv.x;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;
import lu.w;
import lu.z;
import m00.c;
import mu.g;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.l;
import pl.gov.coi.common.network.s;
import tq.e;
import uv.d;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0014\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\u0014*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u00120\u001f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lki0/b;", "Lqi0/a;", "Lay/a;", "baseUrlProvider", "Lpl/gov/coi/common/network/s;", "httpClientFactory", "Lpl/gov/coi/common/network/l;", "errorPayloadHandler", "<init>", "(Lay/a;Lpl/gov/coi/common/network/s;Lpl/gov/coi/common/network/l;)V", "", "endpoint", "Lqi0/a$b;", "connectionType", "Lfv/b0;", "j", "(Ljava/lang/String;Lqi0/a$b;)Lfv/b0;", "Llu/w;", "Ldx/i;", "Ldx/b;", "ki0/b$b", "i", "(Llu/w;)Lki0/b$b;", "Lfv/d0;", "response", "", "throwable", "h", "(Lfv/d0;Ljava/lang/Throwable;)Ldx/b;", "Lgu/b;", "timeout", "Lmu/g;", "a", "(Ljava/lang/String;Lqi0/a$b;J)Lmu/g;", "b", "Lay/a;", "c", "Lpl/gov/coi/common/network/s;", "d", "Lpl/gov/coi/common/network/l;", "k", "()Ljava/lang/String;", "baseUrl", "Lfv/z;", "l", "()Lfv/z;", "sseClient", "chatservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements qi0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ay.a baseUrlProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s httpClientFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l errorPayloadHandler;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llu/w;", "Ldx/i;", "Ldx/b;", "", "Loq/i0;", "<anonymous>", "(Llu/w;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<w<? super i<? extends dx.b, ? extends String>>, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111076e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f111077f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f111078g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f111080j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f111081k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ qi0.a.b f111082l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j15, String str, qi0.a.b bVar, e<? super a> eVar) {
            super(2, eVar);
            this.f111080j = j15;
            this.f111081k = str;
            this.f111082l = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(p0 p0Var) {
            uv.a aVar = (uv.a) p0Var.f66410a;
            if (aVar != null) {
                aVar.cancel();
            }
            return i0.f148189a;
        }

        /* JADX WARN: Type inference failed for: r2v8, types: [T, uv.a] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            w wVar = (w) this.f111078g;
            Object objE = uq.b.e();
            int i15 = this.f111077f;
            if (i15 == 0) {
                u.b(obj);
                final p0 p0Var = new p0();
                try {
                    p0Var.f66410a = d.b(b.this.httpClientFactory.c(b.this.l(), gu.b.o(this.f111080j))).a(b.this.j(this.f111081k, this.f111082l), b.this.i(wVar));
                } catch (CancellationException e15) {
                    throw e15;
                } catch (Exception e16) {
                    wVar.d(new i.Left(new dx.b.Generic(e16)));
                    z.a.a(wVar, null, 1, null);
                }
                er.a aVar = new er.a() { // from class: ki0.a
                    @Override // er.a
                    public final Object a() {
                        return b.a.O(p0Var);
                    }
                };
                this.f111078g = j.a(wVar);
                this.f111076e = j.a(p0Var);
                this.f111077f = 1;
                if (lu.u.b(wVar, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(w<? super i<? extends dx.b, String>> wVar, e<? super i0> eVar) {
            return ((a) v(wVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            a aVar = b.this.new a(this.f111080j, this.f111081k, this.f111082l, eVar);
            aVar.f111078g = obj;
            return aVar;
        }
    }

    /* JADX INFO: renamed from: ki0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"ki0/b$b", "Luv/b;", "Luv/a;", "eventSource", "", "id", "type", "data", "Loq/i0;", "b", "(Luv/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "t", "Lfv/d0;", "response", "c", "(Luv/a;Ljava/lang/Throwable;Lfv/d0;)V", "a", "(Luv/a;)V", "chatservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2671b extends uv.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w<i<? extends dx.b, String>> f111083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f111084b;

        /* JADX WARN: Multi-variable type inference failed */
        C2671b(w<? super i<? extends dx.b, String>> wVar, b bVar) {
            this.f111083a = wVar;
            this.f111084b = bVar;
        }

        @Override // uv.b
        public void a(uv.a eventSource) {
            super.a(eventSource);
            z.a.a(this.f111083a, null, 1, null);
        }

        @Override // uv.b
        public void b(uv.a eventSource, String id5, String type, String data) {
            super.b(eventSource, id5, type, data);
            this.f111083a.d(new i.Right(data));
        }

        @Override // uv.b
        public void c(uv.a eventSource, Throwable t15, d0 response) {
            super.c(eventSource, t15, response);
            this.f111083a.d(new i.Left(this.f111084b.h(response, t15)));
            z.a.a(this.f111083a, null, 1, null);
        }
    }

    public b(ay.a aVar, s sVar, l lVar) {
        this.baseUrlProvider = aVar;
        this.httpClientFactory = sVar;
        this.errorPayloadHandler = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b h(d0 response, Throwable throwable) {
        if (throwable instanceof SocketTimeoutException) {
            return dx.b.g.f.f45079a;
        }
        if ((throwable instanceof InterruptedIOException) || (throwable instanceof EOFException)) {
            return dx.b.g.h.f45081a;
        }
        return (response == null || response.isSuccessful()) ? new dx.b.Generic(new Exception("SSEManager connection failure")) : this.errorPayloadHandler.b(m00.b.a(response)).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2671b i(w<? super i<? extends dx.b, String>> wVar) {
        return new C2671b(wVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b0 j(String endpoint, qi0.a.b connectionType) {
        b0.a aVarK = new b0.a().k(k() + endpoint);
        if (t.c(connectionType, qi0.a.b.C4186a.f166698a)) {
            aVarK.c();
        } else {
            if (!(connectionType instanceof qi0.a.b.Post)) {
                throw new oq.p();
            }
            aVarK.g(c0.INSTANCE.f(((qi0.a.b.Post) connectionType).getJson(), x.INSTANCE.b(c.JSON.getHeaderValue())));
        }
        return aVarK.b();
    }

    private final String k() {
        return this.baseUrlProvider.getBaseUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fv.z l() {
        return this.httpClientFactory.a(new pl.gov.coi.common.network.t.SSE(null, 1, null));
    }

    @Override // qi0.a
    public g<i<dx.b, String>> a(String endpoint, qi0.a.b connectionType, long timeout) {
        return mu.i.e(new a(timeout, endpoint, connectionType, null));
    }
}
