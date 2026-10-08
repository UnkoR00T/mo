package ks0;

import ge4.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import js0.CardPaymentResponse;
import js0.CardRegistrationResponse;
import js0.StartCardPaymentRequest;
import js0.StartCardPaymentResponse;
import js0.StartCardRegistrationRequest;
import js0.StartCardRegistrationResponse;
import js0.UserCardDto;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pq.v;
import vr0.BECardPaymentResponse;
import vr0.BECardRegistrationResponse;
import vr0.BEStartCardPaymentRequest;
import vr0.BEStartCardPaymentResponseDomain;
import vr0.BEStartCardRegistrationRequest;
import vr0.BEStartCardRegistrationResponse;
import vr0.BEUserCard;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u0015\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0016\u0010\u0014J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\n2\u0006\u0010\u0015\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0018\u0010\u0014J$\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b \u0010!J,\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\"0\n2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b#\u0010!J$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020&0\n2\u0006\u0010%\u001a\u00020$H\u0096@¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010)R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\b,\u0010-R\u001b\u00102\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b0\u00101R\u001b\u00106\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lks0/f;", "Lms0/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "", "onlyActive", "Ldx/i;", "Ldx/b;", "", "Lvr0/p;", "h", "(ZLtq/e;)Ljava/lang/Object;", "", "cardTokenId", "Loq/i0;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "referenceId", "f", "Lvr0/g;", "b", "Lvr0/n;", "startCardRegistrationRequest", "Lvr0/o;", "d", "(Lvr0/n;Ltq/e;)Ljava/lang/Object;", "transactionId", "institutionId", "e", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lvr0/c;", "a", "Lvr0/l;", "startCardPaymentRequest", "Lvr0/m;", "g", "(Lvr0/l;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lhs0/d;", "Loq/k;", "r", "()Lhs0/d;", "cardManagementClient", "Lhs0/c;", "t", "()Lhs0/c;", "cardRegistrationClient", "Lhs0/b;", "s", "()Lhs0/b;", "cardPaymentsClient", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements ms0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k cardManagementClient;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k cardRegistrationClient;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k cardPaymentsClient;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112374d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f112375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f112376f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f112378h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112376f = obj;
            this.f112378h |= PKIFailureInfo.systemUnavail;
            return f.this.e(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112379e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112381g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f112381g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112379e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.b bVarS = f.this.s();
            String str = this.f112381g;
            this.f112379e = 1;
            Object objC = bVarS.c(str, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new b(this.f112381g, eVar);
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
        Object f112382d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112383e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112385g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112383e = obj;
            this.f112385g |= PKIFailureInfo.systemUnavail;
            return f.this.f(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112386e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112388g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f112388g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112386e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.c cVarT = f.this.t();
            String str = this.f112388g;
            this.f112386e = 1;
            Object objC = cVarT.c(str, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new d(this.f112388g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112389d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112390e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112392g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112390e = obj;
            this.f112392g |= PKIFailureInfo.systemUnavail;
            return f.this.c(null, this);
        }
    }

    /* JADX INFO: renamed from: ks0.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C2722f extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112393e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112395g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2722f(String str, tq.e<? super C2722f> eVar) {
            super(1, eVar);
            this.f112395g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112393e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.d dVarR = f.this.r();
            String str = this.f112395g;
            this.f112393e = 1;
            Object objC = dVarR.c(str, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new C2722f(this.f112395g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((C2722f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112396d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f112397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f112398f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f112400h;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112398f = obj;
            this.f112400h |= PKIFailureInfo.systemUnavail;
            return f.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljs0/i;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super x<CardPaymentResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112401e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112403g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f112404h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, String str2, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f112403g = str;
            this.f112404h = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112401e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.b bVarS = f.this.s();
            String str = this.f112403g;
            String str2 = this.f112404h;
            this.f112401e = 1;
            Object objA = bVarS.a(str, str2, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new h(this.f112403g, this.f112404h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<CardPaymentResponse>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112406e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112408g;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112406e = obj;
            this.f112408g |= PKIFailureInfo.systemUnavail;
            return f.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljs0/m;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super x<CardRegistrationResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112409e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112411g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, tq.e<? super j> eVar) {
            super(1, eVar);
            this.f112411g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112409e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.c cVarT = f.this.t();
            String str = this.f112411g;
            this.f112409e = 1;
            Object objB = cVarT.b(str, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new j(this.f112411g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<CardRegistrationResponse>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f112412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112413e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112415g;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112413e = obj;
            this.f112415g |= PKIFailureInfo.systemUnavail;
            return f.this.h(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lge4/x;", "", "Ljs0/f1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.l<tq.e<? super x<List<? extends UserCardDto>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112416e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f112418g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z15, tq.e<? super l> eVar) {
            super(1, eVar);
            this.f112418g = z15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112416e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.d dVarR = f.this.r();
            Boolean boolA = vq.b.a(this.f112418g);
            this.f112416e = 1;
            Object objD = dVarR.d(boolA, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new l(this.f112418g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<List<UserCardDto>>> eVar) {
            return ((l) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112420e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112422g;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112420e = obj;
            this.f112422g |= PKIFailureInfo.systemUnavail;
            return f.this.g(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljs0/u0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.l<tq.e<? super x<StartCardPaymentResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112423e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BEStartCardPaymentRequest f112425g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(BEStartCardPaymentRequest bEStartCardPaymentRequest, tq.e<? super n> eVar) {
            super(1, eVar);
            this.f112425g = bEStartCardPaymentRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112423e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.b bVarS = f.this.s();
            StartCardPaymentRequest startCardPaymentRequestP = is0.a.p(this.f112425g);
            this.f112423e = 1;
            Object objB = bVarS.b(startCardPaymentRequestP, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new n(this.f112425g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<StartCardPaymentResponse>> eVar) {
            return ((n) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class o extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112426d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112427e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112429g;

        o(tq.e<? super o> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112427e = obj;
            this.f112429g |= PKIFailureInfo.systemUnavail;
            return f.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljs0/w0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.l<tq.e<? super x<StartCardRegistrationResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112430e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BEStartCardRegistrationRequest f112432g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(BEStartCardRegistrationRequest bEStartCardRegistrationRequest, tq.e<? super p> eVar) {
            super(1, eVar);
            this.f112432g = bEStartCardRegistrationRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112430e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.c cVarT = f.this.t();
            StartCardRegistrationRequest startCardRegistrationRequestQ = is0.a.q(this.f112432g);
            this.f112430e = 1;
            Object objD = cVarT.d(startCardRegistrationRequestQ, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new p(this.f112432g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<StartCardRegistrationResponse>> eVar) {
            return ((p) M(eVar)).J(i0.f148189a);
        }
    }

    public f(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.cardManagementClient = oq.l.a(new er.a() { // from class: ks0.c
            @Override // er.a
            public final Object a() {
                return f.o(wVar);
            }
        });
        this.cardRegistrationClient = oq.l.a(new er.a() { // from class: ks0.d
            @Override // er.a
            public final Object a() {
                return f.q(wVar);
            }
        });
        this.cardPaymentsClient = oq.l.a(new er.a() { // from class: ks0.e
            @Override // er.a
            public final Object a() {
                return f.p(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs0.d o(w wVar) {
        return (hs0.d) w.b(wVar, null, hs0.d.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs0.b p(w wVar) {
        return (hs0.b) w.b(wVar, null, hs0.b.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs0.c q(w wVar) {
        return (hs0.c) w.b(wVar, null, hs0.c.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hs0.d r() {
        return (hs0.d) this.cardManagementClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hs0.b s() {
        return (hs0.b) this.cardPaymentsClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hs0.c t() {
        return (hs0.c) this.cardRegistrationClient.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.b
    public Object a(String str, String str2, tq.e<? super dx.i<? extends dx.b, BECardPaymentResponse>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f112400h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f112400h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f112398f;
        Object objE = uq.b.e();
        int i16 = gVar.f112400h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(str, str2, null);
            gVar.f112396d = vq.j.a(str);
            gVar.f112397e = vq.j.a(str2);
            gVar.f112400h = 1;
            objB = g0Var.b(hVar, gVar);
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
            return new dx.i.Right(is0.a.c((CardPaymentResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.b
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, BECardRegistrationResponse>> eVar) throws Throwable {
        i iVar;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f112408g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f112408g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object objB = iVar.f112406e;
        Object objE = uq.b.e();
        int i16 = iVar.f112408g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            j jVar = new j(str, null);
            iVar.f112405d = vq.j.a(str);
            iVar.f112408g = 1;
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
            return new dx.i.Right(is0.a.g((CardRegistrationResponse) ((dx.i.Right) iVar2).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.b
    public Object c(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f112392g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f112392g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f112390e;
        Object objE = uq.b.e();
        int i16 = eVar2.f112392g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C2722f c2722f = new C2722f(str, null);
            eVar2.f112389d = vq.j.a(str);
            eVar2.f112392g = 1;
            objB = g0Var.b(c2722f, eVar2);
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
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(i0.f148189a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.b
    public Object d(BEStartCardRegistrationRequest bEStartCardRegistrationRequest, tq.e<? super dx.i<? extends dx.b, BEStartCardRegistrationResponse>> eVar) throws Throwable {
        o oVar;
        if (eVar instanceof o) {
            oVar = (o) eVar;
            int i15 = oVar.f112429g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                oVar.f112429g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                oVar = new o(eVar);
            }
        } else {
            oVar = new o(eVar);
        }
        Object objB = oVar.f112427e;
        Object objE = uq.b.e();
        int i16 = oVar.f112429g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            p pVar = new p(bEStartCardRegistrationRequest, null);
            oVar.f112426d = vq.j.a(bEStartCardRegistrationRequest);
            oVar.f112429g = 1;
            objB = g0Var.b(pVar, oVar);
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
            return new dx.i.Right(is0.a.k((StartCardRegistrationResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.b
    public Object e(String str, String str2, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f112378h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f112378h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f112376f;
        Object objE = uq.b.e();
        int i16 = aVar.f112378h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(str, null);
            aVar.f112374d = vq.j.a(str);
            aVar.f112375e = vq.j.a(str2);
            aVar.f112378h = 1;
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
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(i0.f148189a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.b
    public Object f(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f112385g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f112385g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f112383e;
        Object objE = uq.b.e();
        int i16 = cVar.f112385g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(str, null);
            cVar.f112382d = vq.j.a(str);
            cVar.f112385g = 1;
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
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(i0.f148189a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.b
    public Object g(BEStartCardPaymentRequest bEStartCardPaymentRequest, tq.e<? super dx.i<? extends dx.b, BEStartCardPaymentResponseDomain>> eVar) throws Throwable {
        m mVar;
        if (eVar instanceof m) {
            mVar = (m) eVar;
            int i15 = mVar.f112422g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f112422g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(eVar);
            }
        } else {
            mVar = new m(eVar);
        }
        Object objB = mVar.f112420e;
        Object objE = uq.b.e();
        int i16 = mVar.f112422g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            n nVar = new n(bEStartCardPaymentRequest, null);
            mVar.f112419d = vq.j.a(bEStartCardPaymentRequest);
            mVar.f112422g = 1;
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
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(is0.a.j((StartCardPaymentResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.b
    public Object h(boolean z15, tq.e<? super dx.i<? extends dx.b, ? extends List<BEUserCard>>> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f112415g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f112415g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objB = kVar.f112413e;
        Object objE = uq.b.e();
        int i16 = kVar.f112415g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            l lVar = new l(z15, null);
            kVar.f112412d = z15;
            kVar.f112415g = 1;
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
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        List list = (List) ((dx.i.Right) iVar).b();
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(is0.a.l((UserCardDto) it.next()));
        }
        return new dx.i.Right(arrayList);
    }
}
