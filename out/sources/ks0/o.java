package ks0;

import fv.e0;
import ge4.x;
import java.io.InputStream;
import java.util.List;
import js0.PaymentDetailsDto;
import js0.PaymentDto;
import js0.PaymentWidgetDataResponse;
import js0.h0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import yr0.BEPaymentDetails;
import yr0.BEPaymentInfo;
import yr0.BEPaymentWidgetDataResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0018\u0010\u000eJ$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00190\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u001a\u0010\u000eJ$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00190\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u001b\u0010\u000eJ$\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00190\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u001c\u0010\u000eJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001d0\nH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010)\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lks0/o;", "Lms0/e;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "", "paymentId", "Ldx/i;", "Ldx/b;", "Ljava/io/InputStream;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lyr0/g;", "paymentGroup", "", "pageNumber", "", "Lyr0/h;", "f", "(Lyr0/g;ILtq/e;)Ljava/lang/Object;", "Lyr0/e;", "e", "Loq/i0;", "c", "b", "g", "Lyr0/p;", "d", "(Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lhs0/i;", "Loq/k;", "o", "()Lhs0/i;", "paymentsClient", "Lhs0/f;", "n", "()Lhs0/f;", "instantPaymentsClient", "Lhs0/j;", "p", "()Lhs0/j;", "stampDutyClient", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements ms0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k paymentsClient;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k instantPaymentsClient;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k stampDutyClient;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112480e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112482g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112480e = obj;
            this.f112482g |= PKIFailureInfo.systemUnavail;
            return o.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112483e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112485g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f112485g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112483e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.f fVarN = o.this.n();
            String str = this.f112485g;
            this.f112483e = 1;
            Object objC = fVarN.c(str, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return o.this.new b(this.f112485g, eVar);
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
        Object f112486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112487e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112489g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112487e = obj;
            this.f112489g |= PKIFailureInfo.systemUnavail;
            return o.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfv/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<e0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112490e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112492g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f112492g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112490e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.i iVarO = o.this.o();
            String str = this.f112492g;
            this.f112490e = 1;
            Object objC = iVarO.c(str, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return o.this.new d(this.f112492g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<e0>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112494e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112496g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112494e = obj;
            this.f112496g |= PKIFailureInfo.systemUnavail;
            return o.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljs0/b0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<PaymentDetailsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112497e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112499g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f112499g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112497e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.i iVarO = o.this.o();
            String str = this.f112499g;
            this.f112497e = 1;
            Object objD = iVarO.d(str, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return o.this.new f(this.f112499g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<PaymentDetailsDto>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112500d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112501e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f112502f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f112504h;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112502f = obj;
            this.f112504h |= PKIFailureInfo.systemUnavail;
            return o.this.f(null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lge4/x;", "", "Ljs0/c0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super x<List<? extends PaymentDto>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112505e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ yr0.g f112507g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f112508h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(yr0.g gVar, int i15, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f112507g = gVar;
            this.f112508h = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112505e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.i iVarO = o.this.o();
            h0 h0VarC = is0.c.C(this.f112507g);
            Integer numE = vq.b.e(this.f112508h);
            this.f112505e = 1;
            Object objF = iVarO.f(h0VarC, numE, this);
            return objF == objE ? objE : objF;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return o.this.new h(this.f112507g, this.f112508h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<List<PaymentDto>>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f112509d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f112511f;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112509d = obj;
            this.f112511f |= PKIFailureInfo.systemUnavail;
            return o.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljs0/k0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super x<PaymentWidgetDataResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112512e;

        j(tq.e<? super j> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112512e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.i iVarO = o.this.o();
            this.f112512e = 1;
            Object objE2 = iVarO.e(this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return o.this.new j(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<PaymentWidgetDataResponse>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112514d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112515e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112517g;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112515e = obj;
            this.f112517g |= PKIFailureInfo.systemUnavail;
            return o.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112518e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112520g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, tq.e<? super l> eVar) {
            super(1, eVar);
            this.f112520g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112518e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.f fVarN = o.this.n();
            String str = this.f112520g;
            this.f112518e = 1;
            Object objB = fVarN.b(str, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return o.this.new l(this.f112520g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((l) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112521d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112522e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112524g;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112522e = obj;
            this.f112524g |= PKIFailureInfo.systemUnavail;
            return o.this.g(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112525e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112527g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, tq.e<? super n> eVar) {
            super(1, eVar);
            this.f112527g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112525e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.j jVarP = o.this.p();
            String str = this.f112527g;
            this.f112525e = 1;
            Object objA = jVarP.a(str, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return o.this.new n(this.f112527g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((n) M(eVar)).J(i0.f148189a);
        }
    }

    public o(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.paymentsClient = oq.l.a(new er.a() { // from class: ks0.l
            @Override // er.a
            public final Object a() {
                return o.r(wVar);
            }
        });
        this.instantPaymentsClient = oq.l.a(new er.a() { // from class: ks0.m
            @Override // er.a
            public final Object a() {
                return o.q(wVar);
            }
        });
        this.stampDutyClient = oq.l.a(new er.a() { // from class: ks0.n
            @Override // er.a
            public final Object a() {
                return o.s(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hs0.f n() {
        return (hs0.f) this.instantPaymentsClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hs0.i o() {
        return (hs0.i) this.paymentsClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hs0.j p() {
        return (hs0.j) this.stampDutyClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs0.f q(w wVar) {
        return (hs0.f) w.b(wVar, null, hs0.f.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs0.i r(w wVar) {
        return (hs0.i) w.b(wVar, null, hs0.i.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs0.j s(w wVar) {
        return (hs0.j) w.b(wVar, null, hs0.j.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.e
    public Object a(String str, tq.e<? super dx.i<? extends dx.b, ? extends InputStream>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f112489g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f112489g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f112487e;
        Object objE = uq.b.e();
        int i16 = cVar.f112489g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(str, null);
            cVar.f112486d = vq.j.a(str);
            cVar.f112489g = 1;
            objB = g0Var.b(dVar, cVar);
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
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(((e0) ((dx.i.Right) iVar).b()).b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.e
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f112517g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f112517g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objB = kVar.f112515e;
        Object objE = uq.b.e();
        int i16 = kVar.f112517g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            l lVar = new l(str, null);
            kVar.f112514d = vq.j.a(str);
            kVar.f112517g = 1;
            objB = g0Var.b(lVar, kVar);
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
            dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            return bVar instanceof dx.b.g.c ? new dx.i.Right(i0.f148189a) : new dx.i.Left(bVar);
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(i0.f148189a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.e
    public Object c(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f112482g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f112482g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f112480e;
        Object objE = uq.b.e();
        int i16 = aVar.f112482g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(str, null);
            aVar.f112479d = vq.j.a(str);
            aVar.f112482g = 1;
            objB = g0Var.b(bVar, aVar);
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
            dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
            return bVar2 instanceof dx.b.g.c ? new dx.i.Right(i0.f148189a) : new dx.i.Left(bVar2);
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(i0.f148189a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.e
    public Object d(tq.e<? super dx.i<? extends dx.b, BEPaymentWidgetDataResponse>> eVar) throws Throwable {
        i iVar;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f112511f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f112511f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object objB = iVar.f112509d;
        Object objE = uq.b.e();
        int i16 = iVar.f112511f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            j jVar = new j(null);
            iVar.f112511f = 1;
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
            return iVar2;
        }
        if (iVar2 instanceof dx.i.Right) {
            return new dx.i.Right(is0.c.z((PaymentWidgetDataResponse) ((dx.i.Right) iVar2).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.e
    public Object e(String str, tq.e<? super dx.i<? extends dx.b, BEPaymentDetails>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f112496g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f112496g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f112494e;
        Object objE = uq.b.e();
        int i16 = eVar2.f112496g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(str, null);
            eVar2.f112493d = vq.j.a(str);
            eVar2.f112496g = 1;
            objB = g0Var.b(fVar, eVar2);
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
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(is0.c.q((PaymentDetailsDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.e
    public Object f(yr0.g gVar, int i15, tq.e<? super dx.i<? extends dx.b, ? extends List<BEPaymentInfo>>> eVar) throws Throwable {
        g gVar2;
        if (eVar instanceof g) {
            gVar2 = (g) eVar;
            int i16 = gVar2.f112504h;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                gVar2.f112504h = i16 - PKIFailureInfo.systemUnavail;
            } else {
                gVar2 = new g(eVar);
            }
        } else {
            gVar2 = new g(eVar);
        }
        Object objB = gVar2.f112502f;
        Object objE = uq.b.e();
        int i17 = gVar2.f112504h;
        if (i17 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(gVar, i15, null);
            gVar2.f112500d = vq.j.a(gVar);
            gVar2.f112501e = i15;
            gVar2.f112504h = 1;
            objB = g0Var.b(hVar, gVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i17 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(is0.c.g((List) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.e
    public Object g(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        m mVar;
        if (eVar instanceof m) {
            mVar = (m) eVar;
            int i15 = mVar.f112524g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f112524g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(eVar);
            }
        } else {
            mVar = new m(eVar);
        }
        Object objB = mVar.f112522e;
        Object objE = uq.b.e();
        int i16 = mVar.f112524g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            n nVar = new n(str, null);
            mVar.f112521d = vq.j.a(str);
            mVar.f112524g = 1;
            objB = g0Var.b(nVar, mVar);
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
            dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            return bVar instanceof dx.b.g.c ? new dx.i.Right(i0.f148189a) : new dx.i.Left(bVar);
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(i0.f148189a);
    }
}
