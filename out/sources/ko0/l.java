package ko0;

import eo0.EdeliveryDraftMessageResponse;
import eo0.FileHandler;
import eo0.OwTokens;
import eo0.SendEdeliveryDraftMessageResponse;
import eo0.v;
import fv.y;
import ge4.x;
import java.util.List;
import jo0.DeleteEdeliveryMessagesRequestDto;
import jo0.EdeliveryDraftMessageRequestDto;
import jo0.EdeliveryDraftMessageResponseDto;
import jo0.SaveEdeliveryDraftMessageAttachmentResponseDto;
import jo0.SendEdeliveryDraftMessageResponseDto;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.e0;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J4\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001e0\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001f\u0010 J4\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b!\u0010\"J,\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020#0\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b$\u0010%J2\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00190\u00132\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0&2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010,R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lko0/l;", "Lmo0/f;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lpl/gov/coi/common/network/e0;", "multipartManager", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lpl/gov/coi/common/network/e0;)V", "Leo0/e0;", "Lfv/y$c;", "l", "(Leo0/e0;)Lfv/y$c;", "Leo0/g0;", "messageId", "Leo0/i0$a;", "owAccessToken", "file", "Ldx/i;", "Ldx/b;", "Leo0/y;", "a", "(Ljava/lang/String;Leo0/i0$a;Leo0/e0;Ltq/e;)Ljava/lang/Object;", "attachmentId", "Loq/i0;", "c", "(Ljava/lang/String;Ljava/lang/String;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "Leo0/v;", "draft", "Leo0/w;", "f", "(Leo0/i0$a;Leo0/v;Ltq/e;)Ljava/lang/Object;", "d", "(Ljava/lang/String;Leo0/i0$a;Leo0/v;Ltq/e;)Ljava/lang/Object;", "Leo0/x0;", "b", "(Ljava/lang/String;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "", "messageIds", "e", "(Ljava/util/List;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/w;", "Lpl/gov/coi/common/network/g0;", "Lpl/gov/coi/common/network/e0;", "Lho0/f;", "Loq/k;", "k", "()Lho0/f;", "client", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements mo0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w httpServiceFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e0 multipartManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k client = oq.l.a(new er.a() { // from class: ko0.k
        @Override // er.a
        public final Object a() {
            return l.j(this.f111931a);
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f111938f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f111939g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f111941j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111939g = obj;
            this.f111941j |= PKIFailureInfo.systemUnavail;
            return l.this.a(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/p1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<SaveEdeliveryDraftMessageAttachmentResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111942e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f111944g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ FileHandler f111945h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f111946j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(OwTokens.Access access, FileHandler fileHandler, String str, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f111944g = access;
            this.f111945h = fileHandler;
            this.f111946j = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111942e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.f fVarK = l.this.k();
            String strB = this.f111944g.b();
            y.c cVarL = l.this.l(this.f111945h);
            String str = this.f111946j;
            this.f111942e = 1;
            Object objB = fVarK.b(str, strB, cVarL, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return l.this.new b(this.f111944g, this.f111945h, this.f111946j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<SaveEdeliveryDraftMessageAttachmentResponseDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111948e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f111949f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f111951h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111949f = obj;
            this.f111951h |= PKIFailureInfo.systemUnavail;
            return l.this.f(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/m0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<EdeliveryDraftMessageResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111952e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f111954g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ v f111955h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(OwTokens.Access access, v vVar, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f111954g = access;
            this.f111955h = vVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111952e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.f fVarK = l.this.k();
            String strB = this.f111954g.b();
            EdeliveryDraftMessageRequestDto edeliveryDraftMessageRequestDtoV = io0.a.V(this.f111955h);
            this.f111952e = 1;
            Object objD = fVarK.d(strB, edeliveryDraftMessageRequestDtoV, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return l.this.new d(this.f111954g, this.f111955h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<EdeliveryDraftMessageResponseDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111956d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111957e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f111958f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f111959g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f111961j;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111959g = obj;
            this.f111961j |= PKIFailureInfo.systemUnavail;
            return l.this.c(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111962e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f111964g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f111965h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f111966j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(OwTokens.Access access, String str, String str2, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f111964g = access;
            this.f111965h = str;
            this.f111966j = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111962e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.f fVarK = l.this.k();
            String strB = this.f111964g.b();
            String str = this.f111965h;
            String str2 = this.f111966j;
            this.f111962e = 1;
            Object objC = fVarK.c(str, str2, strB, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return l.this.new f(this.f111964g, this.f111965h, this.f111966j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111967e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f111969g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<eo0.g0> f111970h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(OwTokens.Access access, List<eo0.g0> list, tq.e<? super g> eVar) {
            super(1, eVar);
            this.f111969g = access;
            this.f111970h = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111967e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.f fVarK = l.this.k();
            String strB = this.f111969g.b();
            DeleteEdeliveryMessagesRequestDto deleteEdeliveryMessagesRequestDtoA = io0.a.a(this.f111970h);
            this.f111967e = 1;
            Object objF = fVarK.f(strB, deleteEdeliveryMessagesRequestDtoA, this);
            return objF == objE ? objE : objF;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return l.this.new g(this.f111969g, this.f111970h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((g) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f111973f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f111974g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f111976j;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111974g = obj;
            this.f111976j |= PKIFailureInfo.systemUnavail;
            return l.this.d(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/m0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.l<tq.e<? super x<EdeliveryDraftMessageResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111977e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f111979g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f111980h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ v f111981j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(OwTokens.Access access, String str, v vVar, tq.e<? super i> eVar) {
            super(1, eVar);
            this.f111979g = access;
            this.f111980h = str;
            this.f111981j = vVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111977e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.f fVarK = l.this.k();
            String strB = this.f111979g.b();
            String str = this.f111980h;
            EdeliveryDraftMessageRequestDto edeliveryDraftMessageRequestDtoV = io0.a.V(this.f111981j);
            this.f111977e = 1;
            Object objE2 = fVarK.e(str, strB, edeliveryDraftMessageRequestDtoV, this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return l.this.new i(this.f111979g, this.f111980h, this.f111981j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<EdeliveryDraftMessageResponseDto>> eVar) {
            return ((i) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111982d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111983e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f111984f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f111986h;

        j(tq.e<? super j> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111984f = obj;
            this.f111986h |= PKIFailureInfo.systemUnavail;
            return l.this.b(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/s1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.l<tq.e<? super x<SendEdeliveryDraftMessageResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111987e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f111989g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f111990h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, OwTokens.Access access, tq.e<? super k> eVar) {
            super(1, eVar);
            this.f111989g = str;
            this.f111990h = access;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111987e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.f fVarK = l.this.k();
            String str = this.f111989g;
            String strB = this.f111990h.b();
            this.f111987e = 1;
            Object objA = fVarK.a(str, strB, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return l.this.new k(this.f111989g, this.f111990h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<SendEdeliveryDraftMessageResponseDto>> eVar) {
            return ((k) M(eVar)).J(i0.f148189a);
        }
    }

    public l(w wVar, g0 g0Var, e0 e0Var) {
        this.httpServiceFactory = wVar;
        this.networkCallMediator = g0Var;
        this.multipartManager = e0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ho0.f j(l lVar) {
        return (ho0.f) w.b(lVar.httpServiceFactory, null, ho0.f.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ho0.f k() {
        return (ho0.f) this.client.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y.c l(FileHandler fileHandler) {
        return e0.a(this.multipartManager, fileHandler.getFile(), fileHandler.getMetadata().getName(), fileHandler.getMetadata().getExtension(), fileHandler.getMimeType(), null, 16, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.f
    public Object a(String str, OwTokens.Access access, FileHandler fileHandler, tq.e<? super dx.i<? extends dx.b, eo0.y>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f111941j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f111941j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f111939g;
        Object objE = uq.b.e();
        int i16 = aVar.f111941j;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(access, fileHandler, str, null);
            aVar.f111936d = vq.j.a(str);
            aVar.f111937e = vq.j.a(access);
            aVar.f111938f = vq.j.a(fileHandler);
            aVar.f111941j = 1;
            objB = g0Var.b(bVar, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(eo0.y.a(eo0.y.b(((SaveEdeliveryDraftMessageAttachmentResponseDto) ((dx.i.Right) iVar).b()).getAttachmentId())));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.f
    public Object b(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, SendEdeliveryDraftMessageResponse>> eVar) throws Throwable {
        j jVar;
        if (eVar instanceof j) {
            jVar = (j) eVar;
            int i15 = jVar.f111986h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f111986h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(eVar);
            }
        } else {
            jVar = new j(eVar);
        }
        Object objB = jVar.f111984f;
        Object objE = uq.b.e();
        int i16 = jVar.f111986h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            k kVar = new k(str, access, null);
            jVar.f111982d = vq.j.a(str);
            jVar.f111983e = vq.j.a(access);
            jVar.f111986h = 1;
            objB = g0Var.b(kVar, jVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        Object right = (dx.i) objB;
        if (!(right instanceof dx.i.Left)) {
            if (!(right instanceof dx.i.Right)) {
                throw new oq.p();
            }
            right = new dx.i.Right(io0.a.C((SendEdeliveryDraftMessageResponseDto) ((dx.i.Right) right).b()));
        }
        if (right instanceof dx.i.Left) {
            dx.b bVar = (dx.b) ((dx.i.Left) right).b();
            return bVar instanceof dx.b.g.c ? new dx.i.Right(new SendEdeliveryDraftMessageResponse(null)) : new dx.i.Left(bVar);
        }
        if (right instanceof dx.i.Right) {
            return right;
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.f
    public Object c(String str, String str2, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f111961j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f111961j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f111959g;
        Object objE = uq.b.e();
        int i16 = eVar2.f111961j;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(access, str, str2, null);
            eVar2.f111956d = vq.j.a(str);
            eVar2.f111957e = vq.j.a(str2);
            eVar2.f111958f = vq.j.a(access);
            eVar2.f111961j = 1;
            objB = g0Var.b(fVar, eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(i0.f148189a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.f
    public Object d(String str, OwTokens.Access access, v vVar, tq.e<? super dx.i<? extends dx.b, eo0.g0>> eVar) throws Throwable {
        h hVar;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i15 = hVar.f111976j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f111976j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object objB = hVar.f111974g;
        Object objE = uq.b.e();
        int i16 = hVar.f111976j;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            i iVar = new i(access, str, vVar, null);
            hVar.f111971d = vq.j.a(str);
            hVar.f111972e = vq.j.a(access);
            hVar.f111973f = vq.j.a(vVar);
            hVar.f111976j = 1;
            objB = g0Var.b(iVar, hVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar2 = (dx.i) objB;
        if (iVar2 instanceof dx.i.Left) {
            return iVar2;
        }
        if (iVar2 instanceof dx.i.Right) {
            return new dx.i.Right(eo0.g0.a(eo0.g0.b(((EdeliveryDraftMessageResponseDto) ((dx.i.Right) iVar2).b()).getMessageId())));
        }
        throw new oq.p();
    }

    @Override // mo0.f
    public Object e(List<eo0.g0> list, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new g(access, list, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.f
    public Object f(OwTokens.Access access, v vVar, tq.e<? super dx.i<? extends dx.b, EdeliveryDraftMessageResponse>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f111951h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f111951h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f111949f;
        Object objE = uq.b.e();
        int i16 = cVar.f111951h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(access, vVar, null);
            cVar.f111947d = vq.j.a(access);
            cVar.f111948e = vq.j.a(vVar);
            cVar.f111951h = 1;
            objB = g0Var.b(dVar, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(io0.a.p((EdeliveryDraftMessageResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}
