package ef0;

import ay.n;
import cf0.AsyncErrorResponse;
import fr.q0;
import ge4.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kf0.AsyncDocumentGenerationResult;
import kf0.DocumentGenerationResponse;
import kf0.DocumentToDownload;
import kf0.DocumentUpdateResponse;
import oq.i0;
import oq.k;
import oq.l;
import oq.p;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pq.v;
import pq.v0;
import pt3.AsyncDocumentGenerationRequest;
import pt3.AsyncDocumentGenerationResponse;
import pt3.AsyncDocumentGenerationResultDto;
import pt3.AsyncErrorResponseDto;
import pt3.AsyncUpdateDocumentRequest;
import pt3.AsyncUpdateDocumentResponse;
import pt3.DocumentSchemaDto;
import pt3.DocumentToDownloadDto;
import pt3.DocumentTypeWithSubtypeDto;
import pt3.MultiDocumentSchemaDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 I2\u00020\u0001:\u0001%B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u0010&J,\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b(\u0010)J*\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020-0\u00122\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0096@¢\u0006\u0004\b.\u0010/J$\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002010\u00122\u0006\u00100\u001a\u00020+H\u0096@¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00108R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00109R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010;\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lef0/d;", "Ljf0/a;", "Lay/n;", "sseManager", "Lay/j;", "jsonSerializer", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lz70/h;", "mJuniorAsyncEndpoints", "Ljx/d;", "deviceInfo", "<init>", "(Lay/n;Lay/j;Lpl/gov/coi/common/network/g0;Lpl/gov/coi/common/network/w;Lz70/h;Ljx/d;)V", "Ldx/b;", "error", "Ldx/i;", "Lkf0/a;", "t", "(Ldx/b;)Ldx/i;", "", "taskId", "Liy/b0;", "authToken", "f", "(Ljava/lang/String;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "", "Lkf0/b;", "c", "()Lmu/g;", "task", "Loq/i0;", "d", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "a", "(Ljava/lang/String;)V", "documentId", "b", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "Lcf0/c;", "documentsToDownload", "Lkf0/d;", "g", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "documentsToUpdate", "Lkf0/h;", "e", "(Lcf0/c;Ltq/e;)Ljava/lang/Object;", "Lay/n;", "Lay/j;", "Lpl/gov/coi/common/network/g0;", "Lpl/gov/coi/common/network/w;", "Lz70/h;", "Ljx/d;", "Lot3/a;", "Loq/k;", "q", "()Lot3/a;", "client", "Lot3/b;", "h", "r", "()Lot3/b;", "generationClient", "Lot3/c;", "i", "s", "()Lot3/c;", "updateClient", "j", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements jf0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n sseManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ay.j jsonSerializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w httpServiceFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final z70.h mJuniorAsyncEndpoints;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final jx.d deviceInfo;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k client = l.a(new er.a() { // from class: ef0.a
        @Override // er.a
        public final Object a() {
            return d.o(this.f49765a);
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k generationClient = l.a(new er.a() { // from class: ef0.b
        @Override // er.a
        public final Object a() {
            return d.p(this.f49766a);
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final k updateClient = l.a(new er.a() { // from class: ef0.c
        @Override // er.a
        public final Object a() {
            return d.u(this.f49767a);
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49778a;

        static {
            int[] iArr = new int[dx.b.g.Http.a.values().length];
            try {
                iArr[dx.b.g.Http.a.GATEWAY_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dx.b.g.Http.a.REQUEST_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f49778a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f49779d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f49780e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f49782g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f49780e = obj;
            this.f49782g |= PKIFailureInfo.systemUnavail;
            return d.this.g(null, this);
        }
    }

    /* JADX INFO: renamed from: ef0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lpt3/b;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C1190d extends vq.k implements er.l<tq.e<? super x<AsyncDocumentGenerationResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49783e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<cf0.c> f49785g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1190d(List<? extends cf0.c> list, tq.e<? super C1190d> eVar) {
            super(1, eVar);
            this.f49785g = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f49783e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ot3.b bVarR = d.this.r();
            List<cf0.c> list = this.f49785g;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new DocumentTypeWithSubtypeDto(null, ef0.e.k((cf0.c) it.next()), 1, null));
            }
            AsyncDocumentGenerationRequest asyncDocumentGenerationRequest = new AsyncDocumentGenerationRequest(null, v.k1(arrayList), 1, null);
            this.f49783e = 1;
            Object objA = bVarR.a(asyncDocumentGenerationRequest, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new C1190d(this.f49785g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AsyncDocumentGenerationResponse>> eVar) {
            return ((C1190d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f49786d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f49787e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f49788f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f49789g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f49790h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f49792k;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f49790h = obj;
            this.f49792k |= PKIFailureInfo.systemUnavail;
            return d.this.f(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements mu.g<Map<String, ? extends AsyncDocumentGenerationResult>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f49793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f49794b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f49795a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f49796b;

            /* JADX INFO: renamed from: ef0.d$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1191a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f49797d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f49798e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f49799f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f49801h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f49802j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f49803k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f49804l;

                public C1191a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f49797d = obj;
                    this.f49798e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, d dVar) {
                this.f49795a = hVar;
                this.f49796b = dVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1191a c1191a;
                if (eVar instanceof C1191a) {
                    c1191a = (C1191a) eVar;
                    int i15 = c1191a.f49798e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1191a.f49798e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1191a = new C1191a(eVar);
                    }
                } else {
                    c1191a = new C1191a(eVar);
                }
                Object obj2 = c1191a.f49797d;
                Object objE = uq.b.e();
                int i16 = c1191a.f49798e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f49795a;
                    Map map = (Map) obj;
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        AsyncDocumentGenerationResultDto asyncDocumentGenerationResultDto = (AsyncDocumentGenerationResultDto) this.f49796b.jsonSerializer.a((String) entry.getValue(), q0.n(AsyncDocumentGenerationResultDto.class));
                        Object key = entry.getKey();
                        AsyncDocumentGenerationResult.a aVarC = ef0.e.c(asyncDocumentGenerationResultDto.getStatus());
                        DocumentToDownloadDto documentToDownload = asyncDocumentGenerationResultDto.getDocumentToDownload();
                        String strB = null;
                        DocumentToDownload documentToDownloadG = documentToDownload != null ? ef0.e.g(documentToDownload) : null;
                        AsyncErrorResponseDto downloadingErrorMessage = asyncDocumentGenerationResultDto.getDownloadingErrorMessage();
                        AsyncErrorResponse asyncErrorResponseB = downloadingErrorMessage != null ? ef0.e.b(downloadingErrorMessage) : null;
                        String strB2 = asyncDocumentGenerationResultDto.getDocumentSchema() != null ? this.f49796b.jsonSerializer.b(asyncDocumentGenerationResultDto.getDocumentSchema(), q0.n(DocumentSchemaDto.class)) : null;
                        if (asyncDocumentGenerationResultDto.getMultiDocumentSchema() != null) {
                            strB = this.f49796b.jsonSerializer.b(asyncDocumentGenerationResultDto.getMultiDocumentSchema(), q0.n(MultiDocumentSchemaDto.class));
                        }
                        arrayList.add(y.a(key, new AsyncDocumentGenerationResult(aVarC, documentToDownloadG, asyncErrorResponseB, strB2, strB)));
                    }
                    Map mapS = v0.s(arrayList);
                    c1191a.f49799f = vq.j.a(obj);
                    c1191a.f49801h = vq.j.a(c1191a);
                    c1191a.f49802j = vq.j.a(obj);
                    c1191a.f49803k = vq.j.a(hVar);
                    c1191a.f49804l = 0;
                    c1191a.f49798e = 1;
                    if (hVar.F(mapS, c1191a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public f(mu.g gVar, d dVar) {
            this.f49793a = gVar;
            this.f49794b = dVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super Map<String, ? extends AsyncDocumentGenerationResult>> hVar, tq.e eVar) {
            Object objA = this.f49793a.a(new a(hVar, this.f49794b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49805e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f49807g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, tq.e<? super g> eVar) {
            super(1, eVar);
            this.f49807g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f49805e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ot3.a aVarQ = d.this.q();
            String str = this.f49807g;
            this.f49805e = 1;
            Object objB = aVarQ.b(str, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new g(this.f49807g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((g) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49808e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f49810g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f49811h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, String str2, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f49810g = str;
            this.f49811h = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f49808e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ot3.a aVarQ = d.this.q();
            String str = this.f49810g;
            String str2 = this.f49811h;
            this.f49808e = 1;
            Object objA = aVarQ.a(str, str2, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new h(this.f49810g, this.f49811h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f49812d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f49813e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f49815g;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f49813e = obj;
            this.f49815g |= PKIFailureInfo.systemUnavail;
            return d.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lpt3/f;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super x<AsyncUpdateDocumentResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49816e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ cf0.c f49818g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(cf0.c cVar, tq.e<? super j> eVar) {
            super(1, eVar);
            this.f49818g = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f49816e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ot3.c cVarS = d.this.s();
            AsyncUpdateDocumentRequest asyncUpdateDocumentRequest = new AsyncUpdateDocumentRequest(ef0.e.k(this.f49818g), null, null, 6, null);
            this.f49816e = 1;
            Object objA = cVarS.a(asyncUpdateDocumentRequest, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new j(this.f49818g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AsyncUpdateDocumentResponse>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    public d(n nVar, ay.j jVar, g0 g0Var, w wVar, z70.h hVar, jx.d dVar) {
        this.sseManager = nVar;
        this.jsonSerializer = jVar;
        this.networkCallMediator = g0Var;
        this.httpServiceFactory = wVar;
        this.mJuniorAsyncEndpoints = hVar;
        this.deviceInfo = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ot3.a o(d dVar) {
        return (ot3.a) w.b(dVar.httpServiceFactory, null, ot3.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ot3.b p(d dVar) {
        return (ot3.b) w.b(dVar.httpServiceFactory, null, ot3.b.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ot3.a q() {
        return (ot3.a) this.client.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ot3.b r() {
        return (ot3.b) this.generationClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ot3.c s() {
        return (ot3.c) this.updateClient.getValue();
    }

    private final dx.i<dx.b, kf0.a> t(dx.b error) {
        if (error instanceof dx.b.g.h) {
            return new dx.i.Right(kf0.a.C2646a.f110423a);
        }
        if (!(error instanceof dx.b.g.Http)) {
            return new dx.i.Left(error);
        }
        int i15 = b.f49778a[((dx.b.g.Http) error).getCode().ordinal()];
        if (i15 != 1 && i15 != 2) {
            return new dx.i.Left(error);
        }
        return new dx.i.Right(kf0.a.C2646a.f110423a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ot3.c u(d dVar) {
        return (ot3.c) w.b(dVar.httpServiceFactory, null, ot3.c.class, 1, null);
    }

    @Override // jf0.a
    public void a(String taskId) {
        this.sseManager.a(taskId);
    }

    @Override // jf0.a
    public Object b(String str, String str2, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new h(str, str2, null), eVar);
    }

    @Override // jf0.a
    public mu.g<Map<String, AsyncDocumentGenerationResult>> c() {
        return new f(this.sseManager.b(), this);
    }

    @Override // jf0.a
    public Object d(String str, tq.e<? super i0> eVar) {
        Object objB = this.networkCallMediator.b(new g(str, null), eVar);
        return objB == uq.b.e() ? objB : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jf0.a
    public Object e(cf0.c cVar, tq.e<? super dx.i<? extends dx.b, DocumentUpdateResponse>> eVar) throws Throwable {
        i iVar;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f49815g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f49815g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object objB = iVar.f49813e;
        Object objE = uq.b.e();
        int i16 = iVar.f49815g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            j jVar = new j(cVar, null);
            iVar.f49812d = vq.j.a(cVar);
            iVar.f49815g = 1;
            objB = g0Var.b(jVar, iVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar2 = (dx.i) objB;
        if (iVar2 instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar2).b());
        }
        if (iVar2 instanceof dx.i.Right) {
            return new dx.i.Right(ef0.e.j((AsyncUpdateDocumentResponse) ((dx.i.Right) iVar2).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0107, code lost:
    
        if (r10 == r1) goto L33;
     */
    @Override // jf0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(java.lang.String r8, iy.b0 r9, tq.e<? super dx.i<? extends dx.b, ? extends kf0.a>> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ef0.d.f(java.lang.String, iy.b0, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jf0.a
    public Object g(List<? extends cf0.c> list, tq.e<? super dx.i<? extends dx.b, DocumentGenerationResponse>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f49782g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f49782g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f49780e;
        Object objE = uq.b.e();
        int i16 = cVar.f49782g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C1190d c1190d = new C1190d(list, null);
            cVar.f49779d = vq.j.a(list);
            cVar.f49782g = 1;
            objB = g0Var.b(c1190d, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(ef0.e.f((AsyncDocumentGenerationResponse) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }
}
