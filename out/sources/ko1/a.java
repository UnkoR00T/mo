package ko1;

import dx.i;
import java.util.Iterator;
import oq.p;
import oq.r;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.HttpRequestExecutor;
import pl.gov.coi.common.network.t;
import tq.e;
import uq.b;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lko1/a;", "Lmo1/a;", "Lpl/gov/coi/common/network/HttpRequestExecutor;", "executor", "<init>", "(Lpl/gov/coi/common/network/HttpRequestExecutor;)V", "Lpl/gov/coi/common/network/HttpRequestExecutor$a;", "result", "", "b", "(Lpl/gov/coi/common/network/HttpRequestExecutor$a;)Ljava/lang/String;", "url", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/HttpRequestExecutor;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements mo1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final HttpRequestExecutor executor;

    /* JADX INFO: renamed from: ko1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2705a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112132e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112134g;

        C2705a(e<? super C2705a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112132e = obj;
            this.f112134g |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    public a(HttpRequestExecutor httpRequestExecutor) {
        this.executor = httpRequestExecutor;
    }

    private final String b(HttpRequestExecutor.a result) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("HTTP ");
        sb5.append(result.getCode());
        sb5.append(' ');
        sb5.append(result.getMessage());
        sb5.append('\n');
        Iterator<T> it = result.c().iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            String str = (String) rVar.a();
            String str2 = (String) rVar.b();
            sb5.append(str);
            sb5.append(": ");
            sb5.append(str2);
            sb5.append('\n');
        }
        sb5.append('\n');
        byte[] body = result.getBody();
        sb5.append(body != null ? new String(body, fu.d.UTF_8) : "");
        return sb5.toString();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo1.a
    public Object a(String str, e<? super String> eVar) throws Throwable {
        C2705a c2705a;
        if (eVar instanceof C2705a) {
            c2705a = (C2705a) eVar;
            int i15 = c2705a.f112134g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c2705a.f112134g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c2705a = new C2705a(eVar);
            }
        } else {
            c2705a = new C2705a(eVar);
        }
        C2705a c2705a2 = c2705a;
        Object objA = c2705a2.f112132e;
        Object objE = b.e();
        int i16 = c2705a2.f112134g;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i17 = 1;
        if (i16 == 0) {
            u.b(objA);
            HttpRequestExecutor httpRequestExecutor = this.executor;
            t.Public cVar = new t.Public(objArr2 == true ? 1 : 0, i17, objArr == true ? 1 : 0);
            c2705a2.f112131d = j.a(str);
            c2705a2.f112134g = 1;
            objA = HttpRequestExecutor.a(httpRequestExecutor, str, null, null, null, null, null, cVar, c2705a2, 62, null);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objA);
        }
        i iVar = (i) objA;
        if (!(iVar instanceof i.Left)) {
            if (iVar instanceof i.Right) {
                return b((HttpRequestExecutor.a) ((i.Right) iVar).b());
            }
            throw new p();
        }
        dx.b.Generic generic = (dx.b.Generic) ((i.Left) iVar).b();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Error: ");
        sb5.append(generic.getE());
        sb5.append(": ");
        Throwable e15 = generic.getE();
        sb5.append(e15 != null ? e15.getMessage() : null);
        return sb5.toString();
    }
}
