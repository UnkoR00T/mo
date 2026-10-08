package vc;

import android.content.Context;
import fr.p0;
import java.io.IOException;
import kc.h0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;
import qc.SourceFetchResult;
import zc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00011B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010\"\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020 H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u0004\u0018\u00010\u0016*\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010)\u001a\u00020(*\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010*J\u0014\u0010,\u001a\u00020(*\u00020+H\u0082@¢\u0006\u0004\b,\u0010-J\u0013\u0010/\u001a\u00020(*\u00020.H\u0002¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b1\u0010\u0015J#\u00103\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00109R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00109R\u0014\u0010@\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lvc/o;", "Lqc/j;", "", "url", "Lzc/n;", "options", "Loq/k;", "Lvc/j;", "networkClient", "Lpc/a;", "diskCache", "Lvc/b;", "cacheStrategy", "Lvc/e;", "connectivityChecker", "Lvc/c;", "concurrentRequestStrategy", "<init>", "(Ljava/lang/String;Lzc/n;Loq/k;Loq/k;Loq/k;Loq/k;Loq/k;)V", "Lqc/i;", "j", "(Ltq/e;)Ljava/lang/Object;", "Lvc/s;", "networkResponse", "Loq/i0;", "p", "(Lvc/s;)V", "Lpc/a$c;", "o", "()Lpc/a$c;", "snapshot", "cacheResponse", "Lvc/q;", "networkRequest", "u", "(Lpc/a$c;Lvc/s;Lvc/q;Lvc/s;Ltq/e;)Ljava/lang/Object;", "n", "()Lvc/q;", "t", "(Lpc/a$c;)Lvc/s;", "Loc/s;", "r", "(Lpc/a$c;)Loc/s;", "Lvc/t;", "q", "(Lvc/t;Ltq/e;)Ljava/lang/Object;", "Lvv/e;", "s", "(Lvv/e;)Loc/s;", "a", CMSAttributeTableGenerator.CONTENT_TYPE, "m", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/String;", "b", "Lzc/n;", "c", "Loq/k;", "d", "e", "f", "g", "k", "()Ljava/lang/String;", "diskCacheKey", "Lvv/k;", "l", "()Lvv/k;", "fileSystem", "coil-network-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o implements qc.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k<j> networkClient;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k<pc.a> diskCache;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k<vc.b> cacheStrategy;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oq.k<vc.e> connectivityChecker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final oq.k<vc.c> concurrentRequestStrategy;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f205988d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f205989e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205990f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f205992h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f205990f = obj;
            this.f205992h |= PKIFailureInfo.systemUnavail;
            return o.this.j(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvc/s;", "response", "Lqc/o;", "<anonymous>", "(Lvc/s;)Lqc/o;"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<NetworkResponse, tq.e<? super SourceFetchResult>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205993e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205994f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            NetworkResponse networkResponse;
            Object objE = uq.b.e();
            int i15 = this.f205993e;
            if (i15 == 0) {
                oq.u.b(obj);
                NetworkResponse networkResponse2 = (NetworkResponse) this.f205994f;
                o oVar = o.this;
                t tVarF = wc.e.f(networkResponse2);
                this.f205994f = networkResponse2;
                this.f205993e = 1;
                Object objQ = oVar.q(tVarF, this);
                if (objQ == objE) {
                    return objE;
                }
                networkResponse = networkResponse2;
                obj = objQ;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                networkResponse = (NetworkResponse) this.f205994f;
                oq.u.b(obj);
            }
            o oVar2 = o.this;
            return new SourceFetchResult((oc.s) obj, oVar2.m(oVar2.url, networkResponse.getHeaders().c("Content-Type")), oc.f.NETWORK);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(NetworkResponse networkResponse, tq.e<? super SourceFetchResult> eVar) {
            return ((c) v(networkResponse, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = o.this.new c(eVar);
            cVar.f205994f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvc/s;", "networkResponse", "Lqc/o;", "<anonymous>", "(Lvc/s;)Lqc/o;"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.p<NetworkResponse, tq.e<? super SourceFetchResult>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f205996e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f205997f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f205998g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p0<pc.a.c> f205999h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ o f206000j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ p0<NetworkResponse> f206001k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ NetworkRequest f206002l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p0<pc.a.c> p0Var, o oVar, p0<NetworkResponse> p0Var2, NetworkRequest networkRequest, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f205999h = p0Var;
            this.f206000j = oVar;
            this.f206001k = p0Var2;
            this.f206002l = networkRequest;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:31:0x00e0 A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v13, types: [T, vc.s] */
        @Override // vq.a
        public final Object J(Object obj) throws Exception {
            p0<pc.a.c> p0Var;
            d dVar;
            NetworkResponse networkResponse;
            T t15;
            NetworkResponse networkResponse2;
            NetworkHeaders headers;
            Object obj2;
            vv.e eVar;
            Object objE = uq.b.e();
            int i15 = this.f205997f;
            String strC = null;
            if (i15 == 0) {
                oq.u.b(obj);
                NetworkResponse networkResponse3 = (NetworkResponse) this.f205998g;
                p0Var = this.f205999h;
                o oVar = this.f206000j;
                pc.a.c cVar = p0Var.f66410a;
                NetworkResponse networkResponse4 = this.f206001k.f66410a;
                NetworkRequest networkRequest = this.f206002l;
                this.f205998g = networkResponse3;
                this.f205996e = p0Var;
                this.f205997f = 1;
                dVar = this;
                Object objU = oVar.u(cVar, networkResponse4, networkRequest, networkResponse3, dVar);
                if (objU != objE) {
                    networkResponse = networkResponse3;
                    t15 = objU;
                }
                return objE;
            }
            if (i15 == 1) {
                p0Var = (p0) this.f205996e;
                networkResponse = (NetworkResponse) this.f205998g;
                oq.u.b(obj);
                dVar = this;
                t15 = obj;
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                networkResponse2 = (NetworkResponse) this.f205998g;
                oq.u.b(obj);
                dVar = this;
                obj2 = obj;
            }
            eVar = (vv.e) obj2;
            if (eVar.getSize() > 0) {
                return null;
            }
            oc.s sVarS = dVar.f206000j.s(eVar);
            o oVar2 = dVar.f206000j;
            return new SourceFetchResult(sVarS, oVar2.m(oVar2.url, networkResponse2.getHeaders().c("Content-Type")), oc.f.NETWORK);
            p0Var.f66410a = t15;
            dVar.f206000j.p(networkResponse);
            pc.a.c cVar2 = dVar.f205999h.f66410a;
            if (cVar2 != null) {
                dVar.f206001k.f66410a = dVar.f206000j.t(cVar2);
                oc.s sVarR = dVar.f206000j.r(dVar.f205999h.f66410a);
                o oVar3 = dVar.f206000j;
                String str = oVar3.url;
                NetworkResponse networkResponse5 = dVar.f206001k.f66410a;
                if (networkResponse5 != null && (headers = networkResponse5.getHeaders()) != null) {
                    strC = headers.c("Content-Type");
                }
                return new SourceFetchResult(sVarR, oVar3.m(str, strC), oc.f.NETWORK);
            }
            t tVarF = wc.e.f(networkResponse);
            dVar.f205998g = networkResponse;
            dVar.f205996e = null;
            dVar.f205997f = 2;
            Object objE2 = wc.e.e(tVarF, this);
            if (objE2 != objE) {
                networkResponse2 = networkResponse;
                obj2 = objE2;
                eVar = (vv.e) obj2;
                if (eVar.getSize() > 0) {
                    return null;
                }
                oc.s sVarS2 = dVar.f206000j.s(eVar);
                o oVar4 = dVar.f206000j;
                return new SourceFetchResult(sVarS2, oVar4.m(oVar4.url, networkResponse2.getHeaders().c("Content-Type")), oc.f.NETWORK);
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(NetworkResponse networkResponse, tq.e<? super SourceFetchResult> eVar) {
            return ((d) v(networkResponse, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = new d(this.f205999h, this.f206000j, this.f206001k, this.f206002l, eVar);
            dVar.f205998g = obj;
            return dVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class e extends fr.q implements er.l<tq.e<? super qc.i>, Object> {
        e(Object obj) {
            super(1, obj, o.class, "doFetch", "doFetch(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super qc.i> eVar) {
            return ((o) this.f66391b).j(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f206003d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f206004e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f206006g;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f206004e = obj;
            this.f206006g |= PKIFailureInfo.systemUnavail;
            return o.this.q(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f206007d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f206008e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f206009f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f206010g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f206012j;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f206010g = obj;
            this.f206012j |= PKIFailureInfo.systemUnavail;
            return o.this.u(null, null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(String str, Options options, oq.k<? extends j> kVar, oq.k<? extends pc.a> kVar2, oq.k<? extends vc.b> kVar3, oq.k<? extends vc.e> kVar4, oq.k<? extends vc.c> kVar5) {
        this.url = str;
        this.options = options;
        this.networkClient = kVar;
        this.diskCache = kVar2;
        this.cacheStrategy = kVar3;
        this.connectivityChecker = kVar4;
        this.concurrentRequestStrategy = kVar5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:113:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0141 A[Catch: Exception -> 0x0192, TRY_ENTER, TryCatch #7 {Exception -> 0x0192, blocks: (B:57:0x0120, B:69:0x0146, B:68:0x0141), top: B:109:0x0120 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0162  */
    /* JADX WARN: Code duplicated, block: B:77:0x0167 A[Catch: Exception -> 0x018a, TRY_LEAVE, TryCatch #3 {Exception -> 0x018a, blocks: (B:75:0x0163, B:77:0x0167), top: B:102:0x0163 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0183  */
    /* JADX WARN: Code duplicated, block: B:87:0x018e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x019b  */
    /* JADX WARN: Code duplicated, block: B:96:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, pc.a$c] */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, vc.s] */
    public final Object j(tq.e<? super qc.i> eVar) throws Exception {
        b bVar;
        p0 p0Var;
        p0 p0Var2;
        p0 p0Var3;
        vc.b.ReadResult readResult;
        p0 p0Var4;
        Exception exc;
        NetworkRequest networkRequestN;
        o oVar;
        p0 p0Var5;
        o oVar2;
        SourceFetchResult sourceFetchResult;
        pc.a.c cVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f205992h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f205992h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objA = bVar.f205990f;
        Object objE = uq.b.e();
        int i16 = bVar.f205992h;
        if (i16 == 0) {
            oq.u.b(objA);
            p0 p0Var6 = new p0();
            p0Var6.f66410a = o();
            try {
                p0Var2 = new p0();
                try {
                    try {
                        if (p0Var6.f66410a != 0) {
                            Long size = l().J(((pc.a.c) p0Var6.f66410a).e()).getSize();
                            if (size != null && size.longValue() == 0) {
                                return new SourceFetchResult(r((pc.a.c) p0Var6.f66410a), m(this.url, null), oc.f.DISK);
                            }
                            ?? T = t((pc.a.c) p0Var6.f66410a);
                            p0Var2.f66410a = T;
                            if (T != 0) {
                                p(T);
                                vc.b value = this.cacheStrategy.getValue();
                                NetworkResponse networkResponse = (NetworkResponse) p0Var2.f66410a;
                                NetworkRequest networkRequestN2 = n();
                                Options options = this.options;
                                bVar.f205988d = p0Var6;
                                bVar.f205989e = p0Var2;
                                bVar.f205992h = 1;
                                Object objA2 = value.a(networkResponse, networkRequestN2, options, bVar);
                                if (objA2 != objE) {
                                    p0Var4 = p0Var6;
                                    objA = objA2;
                                }
                            }
                            return objE;
                        }
                        d dVar = new d(p0Var3, oVar, p0Var, networkRequest, null);
                        bVar.f205988d = p0Var3;
                        bVar.f205989e = null;
                        bVar.f205992h = 2;
                        objA = value.a(networkRequest, dVar, bVar);
                        if (objA != objE) {
                            p0Var5 = p0Var3;
                            oVar2 = oVar;
                            sourceFetchResult = (SourceFetchResult) objA;
                            if (sourceFetchResult != null) {
                                return sourceFetchResult;
                            }
                            j value2 = oVar2.networkClient.getValue();
                            NetworkRequest networkRequestN3 = n();
                            c cVar2 = new c(null);
                            bVar.f205988d = p0Var5;
                            bVar.f205992h = 3;
                            objA = value2.a(networkRequestN3, cVar2, bVar);
                            if (objA != objE) {
                                p0Var = p0Var5;
                                return (SourceFetchResult) objA;
                            }
                        }
                        return objE;
                    } catch (Exception e15) {
                        e = e15;
                        exc = e;
                        p0Var = p0Var3;
                        cVar = (pc.a.c) p0Var.f66410a;
                        if (cVar != null) {
                            throw exc;
                        }
                        wc.e.c(cVar);
                        throw exc;
                    }
                    if (this.options.getNetworkCachePolicy().getReadEnabled()) {
                        try {
                            wc.f.a();
                        } catch (Exception e16) {
                            exc = e16;
                            p0Var = p0Var3;
                            cVar = (pc.a.c) p0Var.f66410a;
                            if (cVar != null) {
                                throw exc;
                            }
                            wc.e.c(cVar);
                            throw exc;
                        }
                    }
                    if (readResult != null || (networkRequestN = readResult.getRequest()) == null) {
                        networkRequestN = n();
                    }
                    NetworkRequest networkRequest = networkRequestN;
                    j value3 = this.networkClient.getValue();
                    oVar = this;
                } catch (Exception e17) {
                    e = e17;
                }
                p0Var3 = p0Var6;
                readResult = null;
                p0 p0Var7 = p0Var2;
            } catch (Exception e18) {
                e = e18;
                p0Var = p0Var6;
                exc = e;
                cVar = (pc.a.c) p0Var.f66410a;
                if (cVar != null) {
                    throw exc;
                }
                wc.e.c(cVar);
                throw exc;
            }
        } else {
            if (i16 != 1) {
                if (i16 == 2) {
                    p0Var5 = (p0) bVar.f205988d;
                    try {
                        oq.u.b(objA);
                        oVar2 = this;
                        try {
                            sourceFetchResult = (SourceFetchResult) objA;
                            if (sourceFetchResult != null) {
                                return sourceFetchResult;
                            }
                            j value4 = oVar2.networkClient.getValue();
                            NetworkRequest networkRequestN4 = n();
                            c cVar3 = new c(null);
                            bVar.f205988d = p0Var5;
                            bVar.f205992h = 3;
                            objA = value4.a(networkRequestN4, cVar3, bVar);
                            if (objA != objE) {
                                p0Var = p0Var5;
                            }
                            return objE;
                        } catch (Exception e19) {
                            exc = e19;
                            p0Var = p0Var5;
                            cVar = (pc.a.c) p0Var.f66410a;
                            if (cVar != null) {
                                throw exc;
                            }
                            wc.e.c(cVar);
                            throw exc;
                        }
                    } catch (Exception e25) {
                        exc = e25;
                        p0Var = p0Var5;
                        cVar = (pc.a.c) p0Var.f66410a;
                        if (cVar != null) {
                            throw exc;
                        }
                        wc.e.c(cVar);
                        throw exc;
                    }
                }
                if (i16 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p0Var = (p0) bVar.f205988d;
                try {
                    oq.u.b(objA);
                } catch (Exception e26) {
                    exc = e26;
                    cVar = (pc.a.c) p0Var.f66410a;
                    if (cVar != null) {
                        throw exc;
                    }
                    wc.e.c(cVar);
                    throw exc;
                }
                try {
                    return (SourceFetchResult) objA;
                } catch (Exception e27) {
                    e = e27;
                    exc = e;
                    cVar = (pc.a.c) p0Var.f66410a;
                    if (cVar != null) {
                        throw exc;
                    }
                    wc.e.c(cVar);
                    throw exc;
                }
            }
            p0Var2 = (p0) bVar.f205989e;
            p0Var4 = (p0) bVar.f205988d;
            try {
                oq.u.b(objA);
            } catch (Exception e28) {
                exc = e28;
                p0Var = p0Var4;
                cVar = (pc.a.c) p0Var.f66410a;
                if (cVar != null) {
                    throw exc;
                }
                wc.e.c(cVar);
                throw exc;
            }
        }
        readResult = (vc.b.ReadResult) objA;
        if (readResult.getResponse() != null) {
            return new SourceFetchResult(r((pc.a.c) p0Var4.f66410a), m(this.url, readResult.getResponse().getHeaders().c("Content-Type")), oc.f.DISK);
        }
        p0Var3 = p0Var4;
        p0 p0Var8 = p0Var2;
        if (this.options.getNetworkCachePolicy().getReadEnabled()) {
            wc.f.a();
        }
        if (readResult != null) {
            networkRequestN = n();
        } else {
            networkRequestN = n();
        }
        NetworkRequest networkRequest2 = networkRequestN;
        j value5 = this.networkClient.getValue();
        oVar = this;
        d dVar2 = new d(p0Var3, oVar, p0Var8, networkRequest2, null);
        bVar.f205988d = p0Var3;
        bVar.f205989e = null;
        bVar.f205992h = 2;
        objA = value5.a(networkRequest2, dVar2, bVar);
        if (objA != objE) {
            p0Var5 = p0Var3;
            oVar2 = oVar;
            sourceFetchResult = (SourceFetchResult) objA;
            if (sourceFetchResult != null) {
                return sourceFetchResult;
            }
            j value6 = oVar2.networkClient.getValue();
            NetworkRequest networkRequestN5 = n();
            c cVar4 = new c(null);
            bVar.f205988d = p0Var5;
            bVar.f205992h = 3;
            objA = value6.a(networkRequestN5, cVar4, bVar);
            if (objA != objE) {
                p0Var = p0Var5;
                return (SourceFetchResult) objA;
            }
        }
        return objE;
    }

    private final String k() {
        String diskCacheKey = this.options.getDiskCacheKey();
        return diskCacheKey == null ? this.url : diskCacheKey;
    }

    private final vv.k l() {
        vv.k fileSystem;
        pc.a value = this.diskCache.getValue();
        return (value == null || (fileSystem = value.getFileSystem()) == null) ? this.options.getFileSystem() : fileSystem;
    }

    private final NetworkRequest n() {
        NetworkHeaders.a aVarD = i.b(this.options).d();
        boolean readEnabled = this.options.getDiskCachePolicy().getReadEnabled();
        boolean z15 = this.options.getNetworkCachePolicy().getReadEnabled() && this.connectivityChecker.getValue().c();
        if (!z15 && readEnabled) {
            aVarD.c("Cache-Control", "only-if-cached, max-stale=2147483647");
        } else if (!z15 || readEnabled) {
            if (!z15 && !readEnabled) {
                aVarD.c("Cache-Control", "no-cache, only-if-cached");
            }
        } else if (this.options.getDiskCachePolicy().getWriteEnabled()) {
            aVarD.c("Cache-Control", "no-cache");
        } else {
            aVarD.c("Cache-Control", "no-cache, no-store");
        }
        return new NetworkRequest(this.url, i.c(this.options), aVarD.b(), i.a(this.options), this.options.getExtras());
    }

    private final pc.a.c o() {
        pc.a value;
        if (!this.options.getDiskCachePolicy().getReadEnabled() || (value = this.diskCache.getValue()) == null) {
            return null;
        }
        return value.b(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(NetworkResponse networkResponse) {
        int code = networkResponse.getCode();
        if ((200 > code || code >= 300) && networkResponse.getCode() != 304) {
            throw new h(networkResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(t tVar, tq.e<? super oc.s> eVar) throws Throwable {
        f fVar;
        vv.e eVar2;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f206006g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f206006g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object obj = fVar.f206004e;
        Object objE = uq.b.e();
        int i16 = fVar.f206006g;
        if (i16 == 0) {
            oq.u.b(obj);
            vv.e eVar3 = new vv.e();
            fVar.f206003d = eVar3;
            fVar.f206006g = 1;
            if (tVar.U(eVar3, fVar) == objE) {
                return objE;
            }
            eVar2 = eVar3;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar2 = (vv.e) fVar.f206003d;
            oq.u.b(obj);
        }
        return s(eVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oc.s r(pc.a.c cVar) {
        return oc.t.d(cVar.getData(), l(), k(), cVar, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oc.s s(vv.e eVar) {
        return oc.t.c(eVar, l(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetworkResponse t(pc.a.c cVar) throws Throwable {
        Throwable th4;
        NetworkResponse networkResponseA;
        try {
            vv.g gVarC = vv.v.c(l().O(cVar.e()));
            try {
                networkResponseA = vc.a.f205955a.a(gVarC);
                if (gVarC != null) {
                    try {
                        gVarC.close();
                    } catch (Throwable th5) {
                        th4 = th5;
                    }
                }
                th4 = null;
            } catch (Throwable th6) {
                if (gVarC != null) {
                    try {
                        gVarC.close();
                    } catch (Throwable th7) {
                        oq.c.a(th6, th7);
                    }
                }
                th4 = th6;
                networkResponseA = null;
            }
            if (th4 == null) {
                return networkResponseA;
            }
            throw th4;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:69:0x0115  */
    /* JADX WARN: Code duplicated, block: B:72:0x011e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0100, code lost:
    
        if (r0.X2(r2, r3, r7) == r1) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(pc.a.c r12, vc.NetworkResponse r13, vc.NetworkRequest r14, vc.NetworkResponse r15, tq.e<? super pc.a.c> r16) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.o.u(pc.a$c, vc.s, vc.q, vc.s, tq.e):java.lang.Object");
    }

    @Override // qc.j
    public Object a(tq.e<? super qc.i> eVar) {
        return this.concurrentRequestStrategy.getValue().a(k(), new e(this), eVar);
    }

    public final String m(String url, String contentType) {
        String strB;
        if ((contentType == null || fu.r.V(contentType, "text/plain", false, 2, null)) && (strB = ed.v.f49487a.b(url)) != null) {
            return strB;
        }
        if (contentType != null) {
            return fu.r.n1(contentType, ';', null, 2, null);
        }
        return null;
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR$\u0010%\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001e¨\u0006("}, d2 = {"Lvc/o$a;", "Lqc/j$a;", "Lkc/h0;", "Lkotlin/Function0;", "Lvc/j;", "networkClient", "Lvc/b;", "cacheStrategy", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "Lvc/e;", "connectivityChecker", "Lvc/c;", "concurrentRequestStrategy", "<init>", "(Ler/a;Ler/a;Ler/l;Ler/a;)V", "data", "", "i", "(Lkc/h0;)Z", "Lzc/n;", "options", "Lkc/s;", "imageLoader", "Lqc/j;", "g", "(Lkc/h0;Lzc/n;Lkc/s;)Lqc/j;", "Loq/k;", "a", "Loq/k;", "networkClientLazy", "b", "cacheStrategyLazy", "Lwc/b;", "c", "Lwc/b;", "connectivityCheckerLazy", "d", "concurrentRequestStrategyLazy", "coil-network-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements qc.j.a<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final oq.k<j> networkClientLazy;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final oq.k<vc.b> cacheStrategyLazy;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final wc.b<Context, vc.e> connectivityCheckerLazy;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final oq.k<vc.c> concurrentRequestStrategyLazy;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: vc.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class C5379a extends fr.q implements er.l<Context, vc.e> {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final C5379a f205987j = new C5379a();

            C5379a() {
                super(1, vc.g.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
            }

            @Override // er.l
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            public final vc.e b(Context context) {
                return vc.g.a(context);
            }
        }

        public a(er.a<? extends j> aVar, er.a<? extends vc.b> aVar2, er.l<? super Context, ? extends vc.e> lVar, er.a<? extends vc.c> aVar3) {
            this.networkClientLazy = oq.l.a(aVar);
            this.cacheStrategyLazy = oq.l.a(aVar2);
            this.connectivityCheckerLazy = wc.c.a(lVar);
            this.concurrentRequestStrategyLazy = oq.l.a(aVar3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vc.b e() {
            return vc.b.f205957b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vc.c f() {
            return vc.c.f205965b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final pc.a h(kc.s sVar) {
            return sVar.a();
        }

        private final boolean i(h0 data) {
            return fr.t.c(data.getScheme(), "http") || fr.t.c(data.getScheme(), "https");
        }

        @Override // qc.j.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public qc.j a(h0 data, Options options, final kc.s imageLoader) {
            if (i(data)) {
                return new o(data.getData(), options, this.networkClientLazy, oq.l.a(new er.a() { // from class: vc.l
                    @Override // er.a
                    public final Object a() {
                        return o.a.h(imageLoader);
                    }
                }), this.cacheStrategyLazy, oq.l.c(this.connectivityCheckerLazy.a(options.getContext())), this.concurrentRequestStrategyLazy);
            }
            return null;
        }

        public /* synthetic */ a(er.a aVar, er.a aVar2, er.l lVar, er.a aVar3, int i15, fr.k kVar) {
            this(aVar, (i15 & 2) != 0 ? new er.a() { // from class: vc.m
                @Override // er.a
                public final Object a() {
                    return o.a.e();
                }
            } : aVar2, (i15 & 4) != 0 ? C5379a.f205987j : lVar, (i15 & 8) != 0 ? new er.a() { // from class: vc.n
                @Override // er.a
                public final Object a() {
                    return o.a.f();
                }
            } : aVar3);
        }
    }
}
