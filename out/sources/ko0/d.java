package ko0;

import ay.ContentDisposition;
import ay.ResponseWithHeaders;
import eo0.CentralTokens;
import eo0.DeliveryMessageDetails;
import eo0.DirectoryResponse;
import eo0.FileDto;
import eo0.OwTokens;
import eo0.OwnerAddress;
import fv.e0;
import ge4.x;
import java.io.InputStream;
import java.util.List;
import jo0.DeliveryMessageDetailsDtoDto;
import jo0.DirectoriesResponseDto;
import jo0.MessagesResponseDto;
import jo0.OwnerAddressResponseDto;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import wx.DomainFile;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J<\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\f2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020 0\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b!\u0010\u001dJ,\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$0\f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b%\u0010&J,\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$0\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b'\u0010&J,\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$0\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b(\u0010&J,\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$0\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b)\u0010&J<\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,0\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b-\u0010.J,\u00100\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020/0\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b0\u0010&J,\u00101\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020/0\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b1\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00103R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u00105\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lko0/d;", "Lmo0/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lay/e;", "contentDispositionParser", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lay/e;)V", "Leo0/k$a;", "centralAccessToken", "Ldx/i;", "Ldx/b;", "Leo0/j0;", "d", "(Leo0/k$a;Ltq/e;)Ljava/lang/Object;", "Leo0/i0$a;", "owAccessToken", "Leo0/s;", "g", "(Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "Leo0/r;", "directoryId", "", "pageId", "", "Lfo0/c;", "k", "(Ljava/lang/String;Ljava/lang/String;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "Leo0/g0;", "messageId", "Leo0/m;", "h", "Leo0/c0;", "evidenceId", "Lwx/a;", "c", "(Ljava/lang/String;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "i", "a", "f", "Leo0/y;", "attachmentId", "Ljava/io/InputStream;", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "e", "b", "Lpl/gov/coi/common/network/g0;", "Lay/e;", "Lho0/a;", "Loq/k;", "o", "()Lho0/a;", "client", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements mo0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ay.e contentDispositionParser;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111735d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111736e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f111737f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f111739h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111737f = obj;
            this.f111739h |= PKIFailureInfo.systemUnavail;
            return d.this.e(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111740e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f111742g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f111743h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(OwTokens.Access access, String str, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f111742g = access;
            this.f111743h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111740e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.a aVarO = d.this.o();
            String strB = this.f111742g.b();
            String str = this.f111743h;
            this.f111740e = 1;
            Object objB = aVarO.b(str, strB, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new b(this.f111742g, this.f111743h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f111745e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f111747g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111745e = obj;
            this.f111747g |= PKIFailureInfo.systemUnavail;
            return d.this.g(null, this);
        }
    }

    /* JADX INFO: renamed from: ko0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/f0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C2704d extends vq.k implements er.l<tq.e<? super x<DirectoriesResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111748e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f111750g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2704d(OwTokens.Access access, tq.e<? super C2704d> eVar) {
            super(1, eVar);
            this.f111750g = access;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111748e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.a aVarO = d.this.o();
            String strB = this.f111750g.b();
            this.f111748e = 1;
            Object objE2 = aVarO.e(strB, this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new C2704d(this.f111750g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<DirectoriesResponseDto>> eVar) {
            return ((C2704d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111751d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111752e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f111753f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f111754g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f111755h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f111756j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f111757k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f111759m;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111757k = obj;
            this.f111759m |= PKIFailureInfo.systemUnavail;
            return d.this.f(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfv/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<e0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111760e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f111762g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f111763h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, OwTokens.Access access, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f111762g = str;
            this.f111763h = access;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111760e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.a aVarO = d.this.o();
            String str = this.f111762g;
            String strB = this.f111763h.b();
            this.f111760e = 1;
            Object objJ = aVarO.j(str, strB, this);
            return objJ == objE ? objE : objJ;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new f(this.f111762g, this.f111763h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<e0>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111764d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f111766f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f111767g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f111768h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f111769j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f111770k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f111772m;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111770k = obj;
            this.f111772m |= PKIFailureInfo.systemUnavail;
            return d.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfv/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super x<e0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111773e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f111775g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f111776h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, OwTokens.Access access, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f111775g = str;
            this.f111776h = access;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111773e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.a aVarO = d.this.o();
            String str = this.f111775g;
            String strB = this.f111776h.b();
            this.f111773e = 1;
            Object objA = aVarO.a(str, strB, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new h(this.f111775g, this.f111776h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<e0>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111777d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111778e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f111779f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f111780g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f111781h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f111782j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f111783k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f111785m;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111783k = obj;
            this.f111785m |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfv/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super x<e0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111786e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f111788g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f111789h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, OwTokens.Access access, tq.e<? super j> eVar) {
            super(1, eVar);
            this.f111788g = str;
            this.f111789h = access;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111786e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.a aVarO = d.this.o();
            String str = this.f111788g;
            String strB = this.f111789h.b();
            this.f111786e = 1;
            Object objF = aVarO.f(str, strB, this);
            return objF == objE ? objE : objF;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new j(this.f111788g, this.f111789h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<e0>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111791e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f111792f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f111793g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f111794h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f111796k;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111794h = obj;
            this.f111796k |= PKIFailureInfo.systemUnavail;
            return d.this.j(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfv/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.l<tq.e<? super x<e0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111797e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f111799g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f111800h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f111801j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f111802k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, String str2, String str3, OwTokens.Access access, tq.e<? super l> eVar) {
            super(1, eVar);
            this.f111799g = str;
            this.f111800h = str2;
            this.f111801j = str3;
            this.f111802k = access;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111797e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.a aVarO = d.this.o();
            String str = this.f111799g;
            String str2 = this.f111800h;
            String str3 = this.f111801j;
            String strB = this.f111802k.b();
            this.f111797e = 1;
            Object objD = aVarO.d(str2, str, str3, strB, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new l(this.f111799g, this.f111800h, this.f111801j, this.f111802k, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<e0>> eVar) {
            return ((l) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111803d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111804e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f111805f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f111806g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f111807h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f111808j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f111809k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f111811m;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111809k = obj;
            this.f111811m |= PKIFailureInfo.systemUnavail;
            return d.this.i(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfv/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.l<tq.e<? super x<e0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111812e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f111814g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f111815h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, OwTokens.Access access, tq.e<? super n> eVar) {
            super(1, eVar);
            this.f111814g = str;
            this.f111815h = access;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111812e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.a aVarO = d.this.o();
            String str = this.f111814g;
            String strB = this.f111815h.b();
            this.f111812e = 1;
            Object objI = aVarO.i(str, strB, this);
            return objI == objE ? objE : objI;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new n(this.f111814g, this.f111815h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<e0>> eVar) {
            return ((n) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class o extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111817e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f111818f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f111819g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f111821j;

        o(tq.e<? super o> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111819g = obj;
            this.f111821j |= PKIFailureInfo.systemUnavail;
            return d.this.k(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/b1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.l<tq.e<? super x<MessagesResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111822e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f111824g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f111825h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f111826j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, OwTokens.Access access, String str2, tq.e<? super p> eVar) {
            super(1, eVar);
            this.f111824g = str;
            this.f111825h = access;
            this.f111826j = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111822e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.a aVarO = d.this.o();
            String str = this.f111824g;
            String strB = this.f111825h.b();
            String str2 = this.f111826j;
            this.f111822e = 1;
            Object objH = aVarO.h(str, strB, str2, this);
            return objH == objE ? objE : objH;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new p(this.f111824g, this.f111825h, this.f111826j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<MessagesResponseDto>> eVar) {
            return ((p) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class q extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f111829f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f111830g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f111832j;

        q(tq.e<? super q> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111830g = obj;
            this.f111832j |= PKIFailureInfo.systemUnavail;
            return d.this.h(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/b0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.l<tq.e<? super x<DeliveryMessageDetailsDtoDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111833e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f111835g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f111836h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f111837j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, String str2, OwTokens.Access access, tq.e<? super r> eVar) {
            super(1, eVar);
            this.f111835g = str;
            this.f111836h = str2;
            this.f111837j = access;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111833e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.a aVarO = d.this.o();
            String str = this.f111835g;
            String str2 = this.f111836h;
            String strB = this.f111837j.b();
            this.f111833e = 1;
            Object objK = aVarO.k(str, str2, strB, this);
            return objK == objE ? objE : objK;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new r(this.f111835g, this.f111836h, this.f111837j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<DeliveryMessageDetailsDtoDto>> eVar) {
            return ((r) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class s extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111838d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f111839e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f111841g;

        s(tq.e<? super s> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111839e = obj;
            this.f111841g |= PKIFailureInfo.systemUnavail;
            return d.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/j1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.l<tq.e<? super x<OwnerAddressResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111842e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ CentralTokens.Access f111844g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(CentralTokens.Access access, tq.e<? super t> eVar) {
            super(1, eVar);
            this.f111844g = access;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111842e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.a aVarO = d.this.o();
            String strA = this.f111844g.a();
            this.f111842e = 1;
            Object objG = aVarO.g(strA, this);
            return objG == objE ? objE : objG;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new t(this.f111844g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<OwnerAddressResponseDto>> eVar) {
            return ((t) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class u extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111845d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f111847f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f111849h;

        u(tq.e<? super u> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111847f = obj;
            this.f111849h |= PKIFailureInfo.systemUnavail;
            return d.this.b(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111850e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f111852g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f111853h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(OwTokens.Access access, String str, tq.e<? super v> eVar) {
            super(1, eVar);
            this.f111852g = access;
            this.f111853h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111850e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.a aVarO = d.this.o();
            String strB = this.f111852g.b();
            String str = this.f111853h;
            this.f111850e = 1;
            Object objC = aVarO.c(str, strB, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new v(this.f111852g, this.f111853h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((v) M(eVar)).J(i0.f148189a);
        }
    }

    public d(final w wVar, g0 g0Var, ay.e eVar) {
        this.networkCallMediator = g0Var;
        this.contentDispositionParser = eVar;
        this.client = oq.l.a(new er.a() { // from class: ko0.c
            @Override // er.a
            public final Object a() {
                return d.n(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ho0.a n(w wVar) {
        return (ho0.a) w.b(wVar, null, ho0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ho0.a o() {
        return (ho0.a) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:13:0x0039, B:35:0x00ad, B:37:0x00b7, B:44:0x00c9, B:40:0x00bf, B:20:0x0051, B:26:0x0074, B:29:0x007b, B:31:0x007f, B:46:0x00e2, B:47:0x00e7, B:23:0x0058), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.b
    public Object a(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, DomainFile>> eVar) throws Throwable {
        g gVar;
        ResponseWithHeaders responseWithHeaders;
        ContentDisposition contentDisposition;
        String asciiFilename;
        String decodedFilename;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f111772m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f111772m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objA = gVar.f111770k;
        Object objE = uq.b.e();
        int i16 = gVar.f111772m;
        try {
            if (i16 == 0) {
                oq.u.b(objA);
                g0 g0Var = this.networkCallMediator;
                h hVar = new h(str, access, null);
                gVar.f111764d = vq.j.a(str);
                gVar.f111765e = vq.j.a(access);
                gVar.f111772m = 1;
                objA = g0Var.a(hVar, gVar);
                if (objA == objE) {
                }
                return objE;
            }
            if (i16 == 1) {
                access = (OwTokens.Access) gVar.f111765e;
                str = (String) gVar.f111764d;
                oq.u.b(objA);
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                responseWithHeaders = (ResponseWithHeaders) gVar.f111767g;
                oq.u.b(objA);
            }
            contentDisposition = (ContentDisposition) ((dx.i) objA).a();
            if (contentDisposition != null || (decodedFilename = contentDisposition.getDecodedFilename()) == null) {
                asciiFilename = contentDisposition != null ? contentDisposition.getAsciiFilename() : null;
                if (asciiFilename == null) {
                    decodedFilename = "mobywatel_attachment.zip";
                } else {
                    decodedFilename = asciiFilename;
                }
            }
            return new dx.i.Right(io0.a.S(new FileDto(((e0) responseWithHeaders.a()).b(), decodedFilename)));
            dx.i iVar = (dx.i) objA;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            ResponseWithHeaders responseWithHeaders2 = (ResponseWithHeaders) ((dx.i.Right) iVar).b();
            ay.e eVar2 = this.contentDispositionParser;
            gVar.f111764d = vq.j.a(str);
            gVar.f111765e = vq.j.a(access);
            gVar.f111766f = vq.j.a(iVar);
            gVar.f111767g = responseWithHeaders2;
            gVar.f111768h = 0;
            gVar.f111769j = 0;
            gVar.f111772m = 2;
            objA = eVar2.a(responseWithHeaders2, gVar);
            if (objA != objE) {
                responseWithHeaders = responseWithHeaders2;
                contentDisposition = (ContentDisposition) ((dx.i) objA).a();
                if (contentDisposition != null) {
                    if (contentDisposition != null) {
                    }
                    if (asciiFilename == null) {
                        decodedFilename = "mobywatel_attachment.zip";
                    } else {
                        decodedFilename = asciiFilename;
                    }
                } else {
                    if (contentDisposition != null) {
                    }
                    if (asciiFilename == null) {
                        decodedFilename = "mobywatel_attachment.zip";
                    } else {
                        decodedFilename = asciiFilename;
                    }
                }
                return new dx.i.Right(io0.a.S(new FileDto(((e0) responseWithHeaders.a()).b(), decodedFilename)));
            }
            return objE;
        } catch (Exception e15) {
            return new dx.i.Left(new dx.b.Generic(e15));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.b
    public Object b(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        u uVar;
        if (eVar instanceof u) {
            uVar = (u) eVar;
            int i15 = uVar.f111849h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                uVar.f111849h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                uVar = new u(eVar);
            }
        } else {
            uVar = new u(eVar);
        }
        Object objB = uVar.f111847f;
        Object objE = uq.b.e();
        int i16 = uVar.f111849h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            v vVar = new v(access, str, null);
            uVar.f111845d = vq.j.a(str);
            uVar.f111846e = vq.j.a(access);
            uVar.f111849h = 1;
            objB = g0Var.b(vVar, uVar);
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
            dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            return bVar instanceof dx.b.g.c ? new dx.i.Right(i0.f148189a) : new dx.i.Left(bVar);
        }
        if (iVar instanceof dx.i.Right) {
            return iVar;
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:13:0x0039, B:35:0x00ad, B:37:0x00b7, B:44:0x00c9, B:40:0x00bf, B:20:0x0051, B:26:0x0074, B:29:0x007b, B:31:0x007f, B:46:0x00e2, B:47:0x00e7, B:23:0x0058), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.b
    public Object c(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, DomainFile>> eVar) throws Throwable {
        i iVar;
        ResponseWithHeaders responseWithHeaders;
        ContentDisposition contentDisposition;
        String asciiFilename;
        String decodedFilename;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f111785m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f111785m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object objA = iVar.f111783k;
        Object objE = uq.b.e();
        int i16 = iVar.f111785m;
        try {
            if (i16 == 0) {
                oq.u.b(objA);
                g0 g0Var = this.networkCallMediator;
                j jVar = new j(str, access, null);
                iVar.f111777d = vq.j.a(str);
                iVar.f111778e = vq.j.a(access);
                iVar.f111785m = 1;
                objA = g0Var.a(jVar, iVar);
                if (objA == objE) {
                }
                return objE;
            }
            if (i16 == 1) {
                access = (OwTokens.Access) iVar.f111778e;
                str = (String) iVar.f111777d;
                oq.u.b(objA);
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                responseWithHeaders = (ResponseWithHeaders) iVar.f111780g;
                oq.u.b(objA);
            }
            contentDisposition = (ContentDisposition) ((dx.i) objA).a();
            if (contentDisposition != null || (decodedFilename = contentDisposition.getDecodedFilename()) == null) {
                asciiFilename = contentDisposition != null ? contentDisposition.getAsciiFilename() : null;
                if (asciiFilename == null) {
                    decodedFilename = "mobywatel_attachment.pdf";
                } else {
                    decodedFilename = asciiFilename;
                }
            }
            return new dx.i.Right(io0.a.S(new FileDto(((e0) responseWithHeaders.a()).b(), decodedFilename)));
            dx.i iVar2 = (dx.i) objA;
            if (iVar2 instanceof dx.i.Left) {
                return iVar2;
            }
            if (!(iVar2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            ResponseWithHeaders responseWithHeaders2 = (ResponseWithHeaders) ((dx.i.Right) iVar2).b();
            ay.e eVar2 = this.contentDispositionParser;
            iVar.f111777d = vq.j.a(str);
            iVar.f111778e = vq.j.a(access);
            iVar.f111779f = vq.j.a(iVar2);
            iVar.f111780g = responseWithHeaders2;
            iVar.f111781h = 0;
            iVar.f111782j = 0;
            iVar.f111785m = 2;
            objA = eVar2.a(responseWithHeaders2, iVar);
            if (objA != objE) {
                responseWithHeaders = responseWithHeaders2;
                contentDisposition = (ContentDisposition) ((dx.i) objA).a();
                if (contentDisposition != null) {
                    if (contentDisposition != null) {
                    }
                    if (asciiFilename == null) {
                        decodedFilename = "mobywatel_attachment.pdf";
                    } else {
                        decodedFilename = asciiFilename;
                    }
                } else {
                    if (contentDisposition != null) {
                    }
                    if (asciiFilename == null) {
                        decodedFilename = "mobywatel_attachment.pdf";
                    } else {
                        decodedFilename = asciiFilename;
                    }
                }
                return new dx.i.Right(io0.a.S(new FileDto(((e0) responseWithHeaders.a()).b(), decodedFilename)));
            }
            return objE;
        } catch (Exception e15) {
            return new dx.i.Left(new dx.b.Generic(e15));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.b
    public Object d(CentralTokens.Access access, tq.e<? super dx.i<? extends dx.b, OwnerAddress>> eVar) throws Throwable {
        s sVar;
        if (eVar instanceof s) {
            sVar = (s) eVar;
            int i15 = sVar.f111841g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                sVar.f111841g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                sVar = new s(eVar);
            }
        } else {
            sVar = new s(eVar);
        }
        Object objB = sVar.f111839e;
        Object objE = uq.b.e();
        int i16 = sVar.f111841g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            t tVar = new t(access, null);
            sVar.f111838d = vq.j.a(access);
            sVar.f111841g = 1;
            objB = g0Var.b(tVar, sVar);
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
        try {
            return new dx.i.Right(io0.a.t((OwnerAddressResponseDto) ((dx.i.Right) iVar).b()));
        } catch (Exception e15) {
            return new dx.i.Left(new dx.b.Parsing(e15));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.b
    public Object e(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f111739h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f111739h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f111737f;
        Object objE = uq.b.e();
        int i16 = aVar.f111739h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(access, str, null);
            aVar.f111735d = vq.j.a(str);
            aVar.f111736e = vq.j.a(access);
            aVar.f111739h = 1;
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
            dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
            return bVar2 instanceof dx.b.g.c ? new dx.i.Right(i0.f148189a) : new dx.i.Left(bVar2);
        }
        if (iVar instanceof dx.i.Right) {
            return iVar;
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:13:0x0039, B:35:0x00ad, B:37:0x00b7, B:44:0x00c9, B:40:0x00bf, B:20:0x0051, B:26:0x0074, B:29:0x007b, B:31:0x007f, B:46:0x00e2, B:47:0x00e7, B:23:0x0058), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.b
    public Object f(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, DomainFile>> eVar) throws Throwable {
        e eVar2;
        ResponseWithHeaders responseWithHeaders;
        ContentDisposition contentDisposition;
        String asciiFilename;
        String decodedFilename;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f111759m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f111759m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objA = eVar2.f111757k;
        Object objE = uq.b.e();
        int i16 = eVar2.f111759m;
        try {
            if (i16 == 0) {
                oq.u.b(objA);
                g0 g0Var = this.networkCallMediator;
                f fVar = new f(str, access, null);
                eVar2.f111751d = vq.j.a(str);
                eVar2.f111752e = vq.j.a(access);
                eVar2.f111759m = 1;
                objA = g0Var.a(fVar, eVar2);
                if (objA == objE) {
                }
                return objE;
            }
            if (i16 == 1) {
                access = (OwTokens.Access) eVar2.f111752e;
                str = (String) eVar2.f111751d;
                oq.u.b(objA);
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                responseWithHeaders = (ResponseWithHeaders) eVar2.f111754g;
                oq.u.b(objA);
            }
            contentDisposition = (ContentDisposition) ((dx.i) objA).a();
            if (contentDisposition != null || (decodedFilename = contentDisposition.getDecodedFilename()) == null) {
                asciiFilename = contentDisposition != null ? contentDisposition.getAsciiFilename() : null;
                if (asciiFilename == null) {
                    decodedFilename = "mobywatel_attachment.html";
                } else {
                    decodedFilename = asciiFilename;
                }
            }
            return new dx.i.Right(io0.a.S(new FileDto(((e0) responseWithHeaders.a()).b(), decodedFilename)));
            dx.i iVar = (dx.i) objA;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            ResponseWithHeaders responseWithHeaders2 = (ResponseWithHeaders) ((dx.i.Right) iVar).b();
            ay.e eVar3 = this.contentDispositionParser;
            eVar2.f111751d = vq.j.a(str);
            eVar2.f111752e = vq.j.a(access);
            eVar2.f111753f = vq.j.a(iVar);
            eVar2.f111754g = responseWithHeaders2;
            eVar2.f111755h = 0;
            eVar2.f111756j = 0;
            eVar2.f111759m = 2;
            objA = eVar3.a(responseWithHeaders2, eVar2);
            if (objA != objE) {
                responseWithHeaders = responseWithHeaders2;
                contentDisposition = (ContentDisposition) ((dx.i) objA).a();
                if (contentDisposition != null) {
                    if (contentDisposition != null) {
                    }
                    if (asciiFilename == null) {
                        decodedFilename = "mobywatel_attachment.html";
                    } else {
                        decodedFilename = asciiFilename;
                    }
                } else {
                    if (contentDisposition != null) {
                    }
                    if (asciiFilename == null) {
                        decodedFilename = "mobywatel_attachment.html";
                    } else {
                        decodedFilename = asciiFilename;
                    }
                }
                return new dx.i.Right(io0.a.S(new FileDto(((e0) responseWithHeaders.a()).b(), decodedFilename)));
            }
            return objE;
        } catch (Exception e15) {
            return new dx.i.Left(new dx.b.Generic(e15));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.b
    public Object g(OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, DirectoryResponse>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f111747g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f111747g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f111745e;
        Object objE = uq.b.e();
        int i16 = cVar.f111747g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C2704d c2704d = new C2704d(access, null);
            cVar.f111744d = vq.j.a(access);
            cVar.f111747g = 1;
            objB = g0Var.b(c2704d, cVar);
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
            return new dx.i.Right(io0.a.n((DirectoriesResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.b
    public Object h(String str, String str2, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, DeliveryMessageDetails>> eVar) throws Throwable {
        q qVar;
        if (eVar instanceof q) {
            qVar = (q) eVar;
            int i15 = qVar.f111832j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                qVar.f111832j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                qVar = new q(eVar);
            }
        } else {
            qVar = new q(eVar);
        }
        Object objB = qVar.f111830g;
        Object objE = uq.b.e();
        int i16 = qVar.f111832j;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            r rVar = new r(str, str2, access, null);
            qVar.f111827d = vq.j.a(str);
            qVar.f111828e = vq.j.a(str2);
            qVar.f111829f = vq.j.a(access);
            qVar.f111832j = 1;
            objB = g0Var.b(rVar, qVar);
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
            return new dx.i.Right(io0.a.i((DeliveryMessageDetailsDtoDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:13:0x0039, B:35:0x00ad, B:37:0x00b7, B:44:0x00c9, B:40:0x00bf, B:20:0x0051, B:26:0x0074, B:29:0x007b, B:31:0x007f, B:46:0x00e2, B:47:0x00e7, B:23:0x0058), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.b
    public Object i(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, DomainFile>> eVar) throws Throwable {
        m mVar;
        ResponseWithHeaders responseWithHeaders;
        ContentDisposition contentDisposition;
        String asciiFilename;
        String decodedFilename;
        if (eVar instanceof m) {
            mVar = (m) eVar;
            int i15 = mVar.f111811m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f111811m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(eVar);
            }
        } else {
            mVar = new m(eVar);
        }
        Object objA = mVar.f111809k;
        Object objE = uq.b.e();
        int i16 = mVar.f111811m;
        try {
            if (i16 == 0) {
                oq.u.b(objA);
                g0 g0Var = this.networkCallMediator;
                n nVar = new n(str, access, null);
                mVar.f111803d = vq.j.a(str);
                mVar.f111804e = vq.j.a(access);
                mVar.f111811m = 1;
                objA = g0Var.a(nVar, mVar);
                if (objA == objE) {
                }
                return objE;
            }
            if (i16 == 1) {
                access = (OwTokens.Access) mVar.f111804e;
                str = (String) mVar.f111803d;
                oq.u.b(objA);
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                responseWithHeaders = (ResponseWithHeaders) mVar.f111806g;
                oq.u.b(objA);
            }
            contentDisposition = (ContentDisposition) ((dx.i) objA).a();
            if (contentDisposition != null || (decodedFilename = contentDisposition.getDecodedFilename()) == null) {
                asciiFilename = contentDisposition != null ? contentDisposition.getAsciiFilename() : null;
                if (asciiFilename == null) {
                    decodedFilename = "mobywatel_attachment.zip";
                } else {
                    decodedFilename = asciiFilename;
                }
            }
            return new dx.i.Right(io0.a.S(new FileDto(((e0) responseWithHeaders.a()).b(), decodedFilename)));
            dx.i iVar = (dx.i) objA;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            ResponseWithHeaders responseWithHeaders2 = (ResponseWithHeaders) ((dx.i.Right) iVar).b();
            ay.e eVar2 = this.contentDispositionParser;
            mVar.f111803d = vq.j.a(str);
            mVar.f111804e = vq.j.a(access);
            mVar.f111805f = vq.j.a(iVar);
            mVar.f111806g = responseWithHeaders2;
            mVar.f111807h = 0;
            mVar.f111808j = 0;
            mVar.f111811m = 2;
            objA = eVar2.a(responseWithHeaders2, mVar);
            if (objA != objE) {
                responseWithHeaders = responseWithHeaders2;
                contentDisposition = (ContentDisposition) ((dx.i) objA).a();
                if (contentDisposition != null) {
                    if (contentDisposition != null) {
                    }
                    if (asciiFilename == null) {
                        decodedFilename = "mobywatel_attachment.zip";
                    } else {
                        decodedFilename = asciiFilename;
                    }
                } else {
                    if (contentDisposition != null) {
                    }
                    if (asciiFilename == null) {
                        decodedFilename = "mobywatel_attachment.zip";
                    } else {
                        decodedFilename = asciiFilename;
                    }
                }
                return new dx.i.Right(io0.a.S(new FileDto(((e0) responseWithHeaders.a()).b(), decodedFilename)));
            }
            return objE;
        } catch (Exception e15) {
            return new dx.i.Left(new dx.b.Generic(e15));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // mo0.b
    public Object j(String str, String str2, String str3, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, ? extends InputStream>> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f111796k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f111796k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        k kVar2 = kVar;
        Object objB = kVar2.f111794h;
        Object objE = uq.b.e();
        int i16 = kVar2.f111796k;
        try {
            if (i16 == 0) {
                oq.u.b(objB);
                g0 g0Var = this.networkCallMediator;
                l lVar = new l(str, str2, str3, access, null);
                kVar2.f111790d = vq.j.a(str);
                kVar2.f111791e = vq.j.a(str2);
                kVar2.f111792f = vq.j.a(str3);
                kVar2.f111793g = vq.j.a(access);
                kVar2.f111796k = 1;
                objB = g0Var.b(lVar, kVar2);
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
                return new dx.i.Right(((e0) ((dx.i.Right) iVar).b()).b());
            }
            throw new oq.p();
        } catch (Exception e15) {
            return new dx.i.Left(new dx.b.Generic(e15));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.b
    public Object k(String str, String str2, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, ? extends List<fo0.c>>> eVar) throws Throwable {
        o oVar;
        if (eVar instanceof o) {
            oVar = (o) eVar;
            int i15 = oVar.f111821j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                oVar.f111821j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                oVar = new o(eVar);
            }
        } else {
            oVar = new o(eVar);
        }
        Object objB = oVar.f111819g;
        Object objE = uq.b.e();
        int i16 = oVar.f111821j;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            p pVar = new p(str, access, str2, null);
            oVar.f111816d = vq.j.a(str);
            oVar.f111817e = vq.j.a(str2);
            oVar.f111818f = vq.j.a(access);
            oVar.f111821j = 1;
            objB = g0Var.b(pVar, oVar);
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
            return new dx.i.Right(io0.a.R((MessagesResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}
