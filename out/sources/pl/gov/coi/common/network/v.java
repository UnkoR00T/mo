package pl.gov.coi.common.network;

import java.util.ArrayList;
import java.util.Map;
import ju.g1;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jf\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lpl/gov/coi/common/network/v;", "Lpl/gov/coi/common/network/HttpRequestExecutor;", "Lpl/gov/coi/common/network/s;", "httpClientFactory", "<init>", "(Lpl/gov/coi/common/network/s;)V", "", "url", "Lpl/gov/coi/common/network/HttpRequestExecutor$Method;", "method", "", "body", CMSAttributeTableGenerator.CONTENT_TYPE, "userAgent", "", "headers", "Lpl/gov/coi/common/network/t;", "profile", "Ldx/i;", "Ldx/b$e;", "Lpl/gov/coi/common/network/HttpRequestExecutor$a;", "b", "(Ljava/lang/String;Lpl/gov/coi/common/network/HttpRequestExecutor$Method;[BLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lpl/gov/coi/common/network/t;Ltq/e;)Ljava/lang/Object;", "a", "Lpl/gov/coi/common/network/s;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements HttpRequestExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s httpClientFactory;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b$e;", "Lpl/gov/coi/common/network/HttpRequestExecutor$a;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super dx.i<? extends dx.b.Generic, ? extends HttpRequestExecutor.a>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158204e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f158205f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ HttpRequestExecutor.Method f158206g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f158207h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ v f158208j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ t f158209k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f158210l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f158211m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ byte[] f158212n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f158213p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(HttpRequestExecutor.Method method, String str, v vVar, t tVar, String str2, Map<String, String> map, byte[] bArr, String str3, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f158206g = method;
            this.f158207h = str;
            this.f158208j = vVar;
            this.f158209k = tVar;
            this.f158210l = str2;
            this.f158211m = map;
            this.f158212n = bArr;
            this.f158213p = str3;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            ju.p0 p0Var = (ju.p0) this.f158205f;
            uq.b.e();
            if (this.f158204e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            HttpRequestExecutor.Method method = this.f158206g;
            String str = this.f158207h;
            v vVar = this.f158208j;
            t tVar = this.f158209k;
            String str2 = this.f158210l;
            Map<String, String> map = this.f158211m;
            byte[] bArr = this.f158212n;
            String str3 = this.f158213p;
            try {
                oq.t.Companion companion = oq.t.INSTANCE;
                px.f.f163100a.b("Executing HTTP request: " + method + ' ' + str, px.c.a(p0Var));
                fv.z zVarA = vVar.httpClientFactory.a(tVar);
                fv.b0.a aVarK = new fv.b0.a().k(str);
                if (str2 != null) {
                    aVarK.d("User-Agent", str2);
                }
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    aVarK.a(entry.getKey(), entry.getValue());
                }
                if (bArr != null) {
                    aVarK.f(method.name(), fv.c0.Companion.k(fv.c0.INSTANCE, bArr, str3 != null ? fv.x.INSTANCE.b(str3) : null, 0, 0, 6, null));
                } else {
                    aVarK.f(method.name(), null);
                }
                fv.d0 d0VarB = zVarA.b(aVarK.b()).B();
                try {
                    boolean zIsSuccessful = d0VarB.isSuccessful();
                    int code = d0VarB.getCode();
                    String message = d0VarB.getMessage();
                    fv.u headers = d0VarB.getHeaders();
                    ArrayList arrayList = new ArrayList(pq.v.y(headers, 10));
                    for (oq.r<? extends String, ? extends String> rVar : headers) {
                        arrayList.add(oq.y.a(rVar.a(), rVar.b()));
                    }
                    fv.e0 body = d0VarB.getBody();
                    dx.i.Right right = new dx.i.Right(new HttpRequestExecutor.a(zIsSuccessful, code, message, arrayList, body != null ? body.h() : null));
                    ar.b.a(d0VarB, null);
                    objB = oq.t.b(right);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        ar.b.a(d0VarB, th4);
                        throw th5;
                    }
                }
            } catch (Throwable th6) {
                oq.t.Companion companion2 = oq.t.INSTANCE;
                objB = oq.t.b(oq.u.a(th6));
            }
            Throwable thD = oq.t.d(objB);
            return thD == null ? objB : new dx.i.Left(new dx.b.Generic(thD));
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super dx.i<dx.b.Generic, HttpRequestExecutor.a>> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f158206g, this.f158207h, this.f158208j, this.f158209k, this.f158210l, this.f158211m, this.f158212n, this.f158213p, eVar);
            aVar.f158205f = obj;
            return aVar;
        }
    }

    public v(s sVar) {
        this.httpClientFactory = sVar;
    }

    @Override // pl.gov.coi.common.network.HttpRequestExecutor
    public Object b(String str, HttpRequestExecutor.Method method, byte[] bArr, String str2, String str3, Map<String, String> map, t tVar, tq.e<? super dx.i<dx.b.Generic, HttpRequestExecutor.a>> eVar) {
        return ju.i.g(g1.b(), new a(method, str, this, tVar, str3, map, bArr, str2, null), eVar);
    }
}
