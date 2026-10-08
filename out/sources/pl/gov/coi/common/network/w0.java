package pl.gov.coi.common.network;

import java.net.URLDecoder;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lpl/gov/coi/common/network/w0;", "Lay/p;", "Lxw/d;", "dispatcherProvider", "<init>", "(Lxw/d;)V", "", "str", "encoding", "a", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lxw/d;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w0 implements ay.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final xw.d dispatcherProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158217d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158218e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f158219f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158221h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158219f = obj;
            this.f158221h |= PKIFailureInfo.systemUnavail;
            return w0.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super String>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f158223f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f158224g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f158223f = str;
            this.f158224g = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f158222e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return URLDecoder.decode(this.f158223f, this.f158224g);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super String> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f158223f, this.f158224g, eVar);
        }
    }

    public w0(xw.d dVar) {
        this.dispatcherProvider = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ay.p
    public Object a(String str, String str2, tq.e<? super String> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f158221h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f158221h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objA = aVar.f158219f;
        Object objE = uq.b.e();
        int i16 = aVar.f158221h;
        if (i16 == 0) {
            oq.u.b(objA);
            xw.d dVar = this.dispatcherProvider;
            b bVar = new b(str, str2, null);
            aVar.f158217d = vq.j.a(str);
            aVar.f158218e = vq.j.a(str2);
            aVar.f158221h = 1;
            objA = dVar.a(bVar, aVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objA);
        }
        return objA;
    }
}
