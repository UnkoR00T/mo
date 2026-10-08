package ko0;

import eo0.CentralTokens;
import eo0.OwTokens;
import fr.q0;
import ge4.x;
import iy.b0;
import iy.c0;
import java.util.concurrent.CancellationException;
import jo0.CentralTokenDto;
import jo0.OwTokenDto;
import jo0.TokenPayloadDto;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import oy.ParsedJwt;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pl.gov.coi.common.network.y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ6\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J,\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 ¨\u0006!"}, d2 = {"Lko0/o;", "Lmo0/h;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Loy/a;", "jwtParser", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Loy/a;)V", "", "url", "code", "codeVerifier", "Ldx/i;", "Ldx/b;", "Leo0/i0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Leo0/x;", "edorAddress", "Leo0/i0$c;", "token", "c", "(Ljava/lang/String;Liy/b0;Leo0/i0$c;Ltq/e;)Ljava/lang/Object;", "Leo0/i0$a;", "subjectToken", "Leo0/k;", "b", "(Ljava/lang/String;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/w;", "Lpl/gov/coi/common/network/g0;", "Loy/a;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements mo0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w httpServiceFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oy.a jwtParser;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112003d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f112004e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f112005f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f112006g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f112007h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f112008j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f112009k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f112010l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f112011m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f112012n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f112013p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f112014q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f112015r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f112016s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f112017t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f112018v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f112019w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f112021y;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112019w = obj;
            this.f112021y |= PKIFailureInfo.systemUnavail;
            return o.this.b(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/t;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<CentralTokenDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112022e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ho0.h f112023f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f112024g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ho0.h hVar, OwTokens.Access access, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f112023f = hVar;
            this.f112024g = access;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112022e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.h hVar = this.f112023f;
            String value = this.f112024g.getValue();
            this.f112022e = 1;
            Object objD = ho0.h.d(hVar, null, value, null, null, null, this, 29, null);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return new b(this.f112023f, this.f112024g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<CentralTokenDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112025d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f112026e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f112027f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f112028g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f112029h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f112030j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f112031k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f112032l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f112033m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f112034n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f112036q;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112034n = obj;
            this.f112036q |= PKIFailureInfo.systemUnavail;
            return o.this.a(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/i1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<OwTokenDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112037e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ho0.h f112038f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112039g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f112040h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ho0.h hVar, String str, String str2, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f112038f = hVar;
            this.f112039g = str;
            this.f112040h = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112037e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.h hVar = this.f112038f;
            String str = this.f112039g;
            String str2 = this.f112040h;
            this.f112037e = 1;
            Object objE2 = ho0.h.e(hVar, null, str, null, null, str2, this, 13, null);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return new d(this.f112038f, this.f112039g, this.f112040h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<OwTokenDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112041d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f112042e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f112043f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f112044g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f112045h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f112046j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f112047k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f112048l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f112049m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f112050n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f112052q;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112050n = obj;
            this.f112052q |= PKIFailureInfo.systemUnavail;
            return o.this.c(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/i1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<OwTokenDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b0 f112054f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OwTokens.Refresh f112055g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ho0.h f112056h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(b0 b0Var, OwTokens.Refresh refresh, ho0.h hVar, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f112054f = b0Var;
            this.f112055g = refresh;
            this.f112056h = hVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112053e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            b0 b0Var = this.f112054f;
            String strE = b0Var != null ? c0.e(b0Var) : null;
            String value = this.f112055g.getValue();
            ho0.h hVar = this.f112056h;
            this.f112053e = 1;
            Object objB = ho0.h.b(hVar, null, null, value, strE, this, 3, null);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return new f(this.f112054f, this.f112055g, this.f112056h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<OwTokenDto>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    public o(w wVar, g0 g0Var, oy.a aVar) {
        this.httpServiceFactory = wVar;
        this.networkCallMediator = g0Var;
        this.jwtParser = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x012a A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:14:0x0049, B:48:0x017e, B:50:0x0184, B:52:0x0192, B:54:0x0196, B:55:0x01cf, B:56:0x01d4, B:21:0x0075, B:38:0x0124, B:40:0x012a, B:42:0x0138, B:44:0x013c, B:57:0x01d5, B:58:0x01da, B:34:0x00e6), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0138 A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:14:0x0049, B:48:0x017e, B:50:0x0184, B:52:0x0192, B:54:0x0196, B:55:0x01cf, B:56:0x01d4, B:21:0x0075, B:38:0x0124, B:40:0x012a, B:42:0x0138, B:44:0x013c, B:57:0x01d5, B:58:0x01da, B:34:0x00e6), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x013c A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:14:0x0049, B:48:0x017e, B:50:0x0184, B:52:0x0192, B:54:0x0196, B:55:0x01cf, B:56:0x01d4, B:21:0x0075, B:38:0x0124, B:40:0x012a, B:42:0x0138, B:44:0x013c, B:57:0x01d5, B:58:0x01da, B:34:0x00e6), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x017d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0184 A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:14:0x0049, B:48:0x017e, B:50:0x0184, B:52:0x0192, B:54:0x0196, B:55:0x01cf, B:56:0x01d4, B:21:0x0075, B:38:0x0124, B:40:0x012a, B:42:0x0138, B:44:0x013c, B:57:0x01d5, B:58:0x01da, B:34:0x00e6), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0192 A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:14:0x0049, B:48:0x017e, B:50:0x0184, B:52:0x0192, B:54:0x0196, B:55:0x01cf, B:56:0x01d4, B:21:0x0075, B:38:0x0124, B:40:0x012a, B:42:0x0138, B:44:0x013c, B:57:0x01d5, B:58:0x01da, B:34:0x00e6), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0196 A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:14:0x0049, B:48:0x017e, B:50:0x0184, B:52:0x0192, B:54:0x0196, B:55:0x01cf, B:56:0x01d4, B:21:0x0075, B:38:0x0124, B:40:0x012a, B:42:0x0138, B:44:0x013c, B:57:0x01d5, B:58:0x01da, B:34:0x00e6), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01cf A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:14:0x0049, B:48:0x017e, B:50:0x0184, B:52:0x0192, B:54:0x0196, B:55:0x01cf, B:56:0x01d4, B:21:0x0075, B:38:0x0124, B:40:0x012a, B:42:0x0138, B:44:0x013c, B:57:0x01d5, B:58:0x01da, B:34:0x00e6), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x01d5 A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:14:0x0049, B:48:0x017e, B:50:0x0184, B:52:0x0192, B:54:0x0196, B:55:0x01cf, B:56:0x01d4, B:21:0x0075, B:38:0x0124, B:40:0x012a, B:42:0x0138, B:44:0x013c, B:57:0x01d5, B:58:0x01da, B:34:0x00e6), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.h
    public Object a(String str, String str2, String str3, tq.e<? super dx.i<? extends dx.b, OwTokens>> eVar) throws Throwable {
        c cVar;
        ho0.h hVar;
        dx.i iVar;
        int i15;
        String str4;
        String str5;
        OwTokenDto owTokenDto;
        int i16;
        String str6;
        dx.i iVar2;
        ParsedJwt parsedJwt;
        ParsedJwt parsedJwt2;
        dx.i iVar3;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i17 = cVar.f112036q;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f112036q = i17 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objA = cVar.f112034n;
        Object objE = uq.b.e();
        int i18 = cVar.f112036q;
        try {
            if (i18 == 0) {
                oq.u.b(objA);
                ho0.h hVar2 = (ho0.h) this.httpServiceFactory.a(new y.c(str, null, 2, null), ho0.h.class);
                g0 g0Var = this.networkCallMediator;
                d dVar = new d(hVar2, str2, str3, null);
                cVar.f112025d = vq.j.a(str);
                cVar.f112026e = vq.j.a(str2);
                cVar.f112027f = vq.j.a(str3);
                cVar.f112028g = vq.j.a(hVar2);
                cVar.f112036q = 1;
                Object objB = g0Var.b(dVar, cVar);
                if (objB != objE) {
                    hVar = hVar2;
                    objA = objB;
                }
                return objE;
            }
            if (i18 == 1) {
                ho0.h hVar3 = (ho0.h) cVar.f112028g;
                str3 = (String) cVar.f112027f;
                str2 = (String) cVar.f112026e;
                String str7 = (String) cVar.f112025d;
                oq.u.b(objA);
                hVar = hVar3;
                str = str7;
            } else {
                if (i18 == 2) {
                    i16 = cVar.f112033m;
                    int i19 = cVar.f112032l;
                    OwTokenDto owTokenDto2 = (OwTokenDto) cVar.f112030j;
                    iVar = (dx.i) cVar.f112029h;
                    hVar = (ho0.h) cVar.f112028g;
                    str6 = (String) cVar.f112027f;
                    str5 = (String) cVar.f112026e;
                    str4 = (String) cVar.f112025d;
                    oq.u.b(objA);
                    i15 = i19;
                    owTokenDto = owTokenDto2;
                    iVar2 = (dx.i) objA;
                    if (iVar2 instanceof dx.i.Left) {
                        return new dx.i.Left((dx.b) ((dx.i.Left) iVar2).b());
                    }
                    if (iVar2 instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    parsedJwt = (ParsedJwt) ((dx.i.Right) iVar2).b();
                    oy.a aVar = this.jwtParser;
                    String refreshToken = owTokenDto.getRefreshToken();
                    mr.c cVarC = q0.c(TokenPayloadDto.class);
                    cVar.f112025d = vq.j.a(str4);
                    cVar.f112026e = vq.j.a(str5);
                    cVar.f112027f = vq.j.a(str6);
                    cVar.f112028g = vq.j.a(hVar);
                    cVar.f112029h = vq.j.a(iVar);
                    cVar.f112030j = owTokenDto;
                    cVar.f112031k = parsedJwt;
                    cVar.f112032l = i15;
                    cVar.f112033m = i16;
                    cVar.f112036q = 3;
                    objA = aVar.a(refreshToken, cVarC, cVar);
                    if (objA != objE) {
                        parsedJwt2 = parsedJwt;
                    }
                    return objE;
                }
                if (i18 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                parsedJwt2 = (ParsedJwt) cVar.f112031k;
                owTokenDto = (OwTokenDto) cVar.f112030j;
                oq.u.b(objA);
            }
            iVar3 = (dx.i) objA;
            if (iVar3 instanceof dx.i.Left) {
                return new dx.i.Left((dx.b) ((dx.i.Left) iVar3).b());
            }
            if (iVar3 instanceof dx.i.Right) {
                throw new oq.p();
            }
            return new dx.i.Right(new OwTokens(new OwTokens.Refresh(owTokenDto.getRefreshToken(), ((TokenPayloadDto) ((ParsedJwt) ((dx.i.Right) iVar3).b()).a()).getExp()), new OwTokens.Access(owTokenDto.getAccessToken(), ((TokenPayloadDto) parsedJwt2.a()).getExp())));
            iVar = (dx.i) objA;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            OwTokenDto owTokenDto3 = (OwTokenDto) ((dx.i.Right) iVar).b();
            oy.a aVar2 = this.jwtParser;
            String accessToken = owTokenDto3.getAccessToken();
            mr.c cVarC2 = q0.c(TokenPayloadDto.class);
            cVar.f112025d = vq.j.a(str);
            cVar.f112026e = vq.j.a(str2);
            cVar.f112027f = vq.j.a(str3);
            cVar.f112028g = vq.j.a(hVar);
            cVar.f112029h = vq.j.a(iVar);
            cVar.f112030j = owTokenDto3;
            i15 = 0;
            cVar.f112032l = 0;
            cVar.f112033m = 0;
            cVar.f112036q = 2;
            Object objA2 = aVar2.a(accessToken, cVarC2, cVar);
            if (objA2 != objE) {
                str4 = str;
                str5 = str2;
                owTokenDto = owTokenDto3;
                objA = objA2;
                i16 = 0;
                str6 = str3;
                iVar2 = (dx.i) objA;
                if (iVar2 instanceof dx.i.Left) {
                    return new dx.i.Left((dx.b) ((dx.i.Left) iVar2).b());
                }
                if (iVar2 instanceof dx.i.Right) {
                    throw new oq.p();
                }
                parsedJwt = (ParsedJwt) ((dx.i.Right) iVar2).b();
                oy.a aVar3 = this.jwtParser;
                String refreshToken2 = owTokenDto.getRefreshToken();
                mr.c cVarC3 = q0.c(TokenPayloadDto.class);
                cVar.f112025d = vq.j.a(str4);
                cVar.f112026e = vq.j.a(str5);
                cVar.f112027f = vq.j.a(str6);
                cVar.f112028g = vq.j.a(hVar);
                cVar.f112029h = vq.j.a(iVar);
                cVar.f112030j = owTokenDto;
                cVar.f112031k = parsedJwt;
                cVar.f112032l = i15;
                cVar.f112033m = i16;
                cVar.f112036q = 3;
                objA = aVar3.a(refreshToken2, cVarC3, cVar);
                if (objA != objE) {
                    parsedJwt2 = parsedJwt;
                    iVar3 = (dx.i) objA;
                    if (iVar3 instanceof dx.i.Left) {
                        return new dx.i.Left((dx.b) ((dx.i.Left) iVar3).b());
                    }
                    if (iVar3 instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    return new dx.i.Right(new OwTokens(new OwTokens.Refresh(owTokenDto.getRefreshToken(), ((TokenPayloadDto) ((ParsedJwt) ((dx.i.Right) iVar3).b()).a()).getExp()), new OwTokens.Access(owTokenDto.getAccessToken(), ((TokenPayloadDto) parsedJwt2.a()).getExp())));
                }
            }
            return objE;
        } catch (Exception e15) {
            return new dx.i.Left(new dx.b.Parsing(e15));
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x010f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0110 A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #8 {Exception -> 0x0055, blocks: (B:13:0x0050, B:46:0x0174, B:52:0x019b, B:56:0x01ba, B:49:0x017b, B:51:0x017f, B:58:0x01c5, B:59:0x01ca, B:68:0x01da, B:71:0x01e8, B:37:0x0109, B:40:0x0110, B:42:0x0114, B:60:0x01cb, B:61:0x01d0), top: B:88:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0114 A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #8 {Exception -> 0x0055, blocks: (B:13:0x0050, B:46:0x0174, B:52:0x019b, B:56:0x01ba, B:49:0x017b, B:51:0x017f, B:58:0x01c5, B:59:0x01ca, B:68:0x01da, B:71:0x01e8, B:37:0x0109, B:40:0x0110, B:42:0x0114, B:60:0x01cb, B:61:0x01d0), top: B:88:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0172  */
    /* JADX WARN: Code duplicated, block: B:48:0x017a  */
    /* JADX WARN: Code duplicated, block: B:49:0x017b A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #8 {Exception -> 0x0055, blocks: (B:13:0x0050, B:46:0x0174, B:52:0x019b, B:56:0x01ba, B:49:0x017b, B:51:0x017f, B:58:0x01c5, B:59:0x01ca, B:68:0x01da, B:71:0x01e8, B:37:0x0109, B:40:0x0110, B:42:0x0114, B:60:0x01cb, B:61:0x01d0), top: B:88:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x017f A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #8 {Exception -> 0x0055, blocks: (B:13:0x0050, B:46:0x0174, B:52:0x019b, B:56:0x01ba, B:49:0x017b, B:51:0x017f, B:58:0x01c5, B:59:0x01ca, B:68:0x01da, B:71:0x01e8, B:37:0x0109, B:40:0x0110, B:42:0x0114, B:60:0x01cb, B:61:0x01d0), top: B:88:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01c5 A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #8 {Exception -> 0x0055, blocks: (B:13:0x0050, B:46:0x0174, B:52:0x019b, B:56:0x01ba, B:49:0x017b, B:51:0x017f, B:58:0x01c5, B:59:0x01ca, B:68:0x01da, B:71:0x01e8, B:37:0x0109, B:40:0x0110, B:42:0x0114, B:60:0x01cb, B:61:0x01d0), top: B:88:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01cb A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #8 {Exception -> 0x0055, blocks: (B:13:0x0050, B:46:0x0174, B:52:0x019b, B:56:0x01ba, B:49:0x017b, B:51:0x017f, B:58:0x01c5, B:59:0x01ca, B:68:0x01da, B:71:0x01e8, B:37:0x0109, B:40:0x0110, B:42:0x0114, B:60:0x01cb, B:61:0x01d0), top: B:88:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:77:0x0202  */
    /* JADX WARN: Code duplicated, block: B:78:0x0210  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0214  */
    /* JADX WARN: Code duplicated, block: B:83:0x0221  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // mo0.h
    public Object b(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, CentralTokens>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        dx.j<dx.b> jVar;
        String str2;
        OwTokens.Access access2;
        ex.b bVar;
        ex.b bVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        ho0.h hVar;
        int i19;
        dx.i iVar;
        CentralTokenDto centralTokenDto;
        CentralTokenDto centralTokenDto2;
        ex.b bVar3;
        dx.i right;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f112021y;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f112021y = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB2 = aVar.f112019w;
        Object objE = uq.b.e();
        int i26 = aVar.f112021y;
        ?? r15 = 1;
        try {
            try {
                try {
                    if (i26 == 0) {
                        oq.u.b(objB2);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar2 = new ex.a();
                            ho0.h hVar2 = (ho0.h) this.httpServiceFactory.a(new y.c(str, null, 2, null), ho0.h.class);
                            g0 g0Var = this.networkCallMediator;
                            b bVar4 = new b(hVar2, access, null);
                            aVar.f112003d = vq.j.a(str);
                            aVar.f112004e = vq.j.a(access);
                            aVar.f112005f = jVarA;
                            aVar.f112006g = vq.j.a(aVar2);
                            aVar.f112007h = aVar2;
                            aVar.f112008j = vq.j.a(hVar2);
                            aVar.f112012n = 0;
                            aVar.f112013p = 0;
                            aVar.f112014q = 0;
                            aVar.f112015r = 0;
                            aVar.f112016s = 0;
                            aVar.f112021y = 1;
                            objB2 = g0Var.b(bVar4, aVar);
                            if (objB2 != objE) {
                                jVar = jVarA;
                                str2 = str;
                                access2 = access;
                                bVar = aVar2;
                                bVar2 = bVar;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                hVar = hVar2;
                                i19 = 0;
                                iVar = (dx.i) objB2;
                                if (iVar instanceof dx.i.Left) {
                                    return iVar;
                                }
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                centralTokenDto = (CentralTokenDto) ((dx.i.Right) iVar).b();
                                oy.a aVar3 = this.jwtParser;
                                String accessToken = centralTokenDto.getAccessToken();
                                String str3 = str2;
                                mr.c cVarC = q0.c(TokenPayloadDto.class);
                                aVar.f112003d = vq.j.a(str3);
                                aVar.f112004e = vq.j.a(access2);
                                aVar.f112005f = jVar;
                                aVar.f112006g = vq.j.a(bVar2);
                                aVar.f112007h = vq.j.a(bVar);
                                aVar.f112008j = vq.j.a(hVar);
                                aVar.f112009k = vq.j.a(iVar);
                                aVar.f112010l = centralTokenDto;
                                aVar.f112011m = bVar;
                                aVar.f112012n = i19;
                                aVar.f112013p = i18;
                                aVar.f112014q = i17;
                                aVar.f112015r = i16;
                                aVar.f112016s = i15;
                                aVar.f112017t = 0;
                                aVar.f112018v = 0;
                                aVar.f112021y = 2;
                                objB2 = aVar3.a(accessToken, cVarC, aVar);
                                if (objB2 != objE) {
                                    centralTokenDto2 = centralTokenDto;
                                    bVar3 = bVar;
                                    right = (dx.i) objB2;
                                    if (!(right instanceof dx.i.Left)) {
                                        if (right instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        right = new dx.i.Right(vq.b.f(((TokenPayloadDto) ((ParsedJwt) ((dx.i.Right) right).b()).a()).getExp()));
                                    }
                                    return new dx.i.Right(new CentralTokens(new CentralTokens.Access(centralTokenDto2.getAccessToken(), ((Number) bVar3.a(right)).longValue())));
                                }
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            iVarA = r15.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i26 == 1) {
                        i15 = aVar.f112016s;
                        int i27 = aVar.f112015r;
                        int i28 = aVar.f112014q;
                        int i29 = aVar.f112013p;
                        int i35 = aVar.f112012n;
                        ho0.h hVar3 = (ho0.h) aVar.f112008j;
                        bVar = (ex.b) aVar.f112007h;
                        ex.b bVar5 = (ex.b) aVar.f112006g;
                        dx.j<dx.b> jVar2 = (dx.j) aVar.f112005f;
                        access2 = (OwTokens.Access) aVar.f112004e;
                        str2 = (String) aVar.f112003d;
                        try {
                            oq.u.b(objB2);
                            i16 = i27;
                            jVar = jVar2;
                            bVar2 = bVar5;
                            hVar = hVar3;
                            i19 = i35;
                            i18 = i29;
                            i17 = i28;
                            iVar = (dx.i) objB2;
                            if (iVar instanceof dx.i.Left) {
                                return iVar;
                            }
                            if (iVar instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            centralTokenDto = (CentralTokenDto) ((dx.i.Right) iVar).b();
                            oy.a aVar4 = this.jwtParser;
                            String accessToken2 = centralTokenDto.getAccessToken();
                            String str4 = str2;
                            mr.c cVarC2 = q0.c(TokenPayloadDto.class);
                            aVar.f112003d = vq.j.a(str4);
                            aVar.f112004e = vq.j.a(access2);
                            aVar.f112005f = jVar;
                            aVar.f112006g = vq.j.a(bVar2);
                            aVar.f112007h = vq.j.a(bVar);
                            aVar.f112008j = vq.j.a(hVar);
                            aVar.f112009k = vq.j.a(iVar);
                            aVar.f112010l = centralTokenDto;
                            aVar.f112011m = bVar;
                            aVar.f112012n = i19;
                            aVar.f112013p = i18;
                            aVar.f112014q = i17;
                            aVar.f112015r = i16;
                            aVar.f112016s = i15;
                            aVar.f112017t = 0;
                            aVar.f112018v = 0;
                            aVar.f112021y = 2;
                            objB2 = aVar4.a(accessToken2, cVarC2, aVar);
                            if (objB2 != objE) {
                                centralTokenDto2 = centralTokenDto;
                                bVar3 = bVar;
                            }
                            return objE;
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            r15 = jVar2;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(r15));
                            iVarA = r15.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i26 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar3 = (ex.b) aVar.f112011m;
                    centralTokenDto2 = (CentralTokenDto) aVar.f112010l;
                    oq.u.b(objB2);
                    right = (dx.i) objB2;
                    if (!(right instanceof dx.i.Left)) {
                        if (right instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        right = new dx.i.Right(vq.b.f(((TokenPayloadDto) ((ParsedJwt) ((dx.i.Right) right).b()).a()).getExp()));
                    }
                    try {
                        return new dx.i.Right(new CentralTokens(new CentralTokens.Access(centralTokenDto2.getAccessToken(), ((Number) bVar3.a(right)).longValue())));
                    } catch (Exception e26) {
                        return new dx.i.Left(new dx.b.Parsing(e26));
                    }
                } catch (Exception e27) {
                    e = e27;
                }
            } catch (CancellationException e28) {
                throw e28;
            }
        } catch (ex.c e29) {
            e = e29;
        } catch (CancellationException e35) {
            throw e35;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x012a A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:14:0x0049, B:48:0x017e, B:50:0x0184, B:52:0x0192, B:54:0x0196, B:55:0x01cf, B:56:0x01d4, B:21:0x0075, B:38:0x0124, B:40:0x012a, B:42:0x0138, B:44:0x013c, B:57:0x01d5, B:58:0x01da, B:34:0x00e6), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0138 A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:14:0x0049, B:48:0x017e, B:50:0x0184, B:52:0x0192, B:54:0x0196, B:55:0x01cf, B:56:0x01d4, B:21:0x0075, B:38:0x0124, B:40:0x012a, B:42:0x0138, B:44:0x013c, B:57:0x01d5, B:58:0x01da, B:34:0x00e6), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x013c A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:14:0x0049, B:48:0x017e, B:50:0x0184, B:52:0x0192, B:54:0x0196, B:55:0x01cf, B:56:0x01d4, B:21:0x0075, B:38:0x0124, B:40:0x012a, B:42:0x0138, B:44:0x013c, B:57:0x01d5, B:58:0x01da, B:34:0x00e6), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x017d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0184 A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:14:0x0049, B:48:0x017e, B:50:0x0184, B:52:0x0192, B:54:0x0196, B:55:0x01cf, B:56:0x01d4, B:21:0x0075, B:38:0x0124, B:40:0x012a, B:42:0x0138, B:44:0x013c, B:57:0x01d5, B:58:0x01da, B:34:0x00e6), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0192 A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:14:0x0049, B:48:0x017e, B:50:0x0184, B:52:0x0192, B:54:0x0196, B:55:0x01cf, B:56:0x01d4, B:21:0x0075, B:38:0x0124, B:40:0x012a, B:42:0x0138, B:44:0x013c, B:57:0x01d5, B:58:0x01da, B:34:0x00e6), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0196 A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:14:0x0049, B:48:0x017e, B:50:0x0184, B:52:0x0192, B:54:0x0196, B:55:0x01cf, B:56:0x01d4, B:21:0x0075, B:38:0x0124, B:40:0x012a, B:42:0x0138, B:44:0x013c, B:57:0x01d5, B:58:0x01da, B:34:0x00e6), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01cf A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:14:0x0049, B:48:0x017e, B:50:0x0184, B:52:0x0192, B:54:0x0196, B:55:0x01cf, B:56:0x01d4, B:21:0x0075, B:38:0x0124, B:40:0x012a, B:42:0x0138, B:44:0x013c, B:57:0x01d5, B:58:0x01da, B:34:0x00e6), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x01d5 A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:14:0x0049, B:48:0x017e, B:50:0x0184, B:52:0x0192, B:54:0x0196, B:55:0x01cf, B:56:0x01d4, B:21:0x0075, B:38:0x0124, B:40:0x012a, B:42:0x0138, B:44:0x013c, B:57:0x01d5, B:58:0x01da, B:34:0x00e6), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.h
    public Object c(String str, b0 b0Var, OwTokens.Refresh refresh, tq.e<? super dx.i<? extends dx.b, OwTokens>> eVar) throws Throwable {
        e eVar2;
        ho0.h hVar;
        dx.i iVar;
        int i15;
        String str2;
        b0 b0Var2;
        OwTokenDto owTokenDto;
        int i16;
        OwTokens.Refresh refresh2;
        dx.i iVar2;
        ParsedJwt parsedJwt;
        ParsedJwt parsedJwt2;
        dx.i iVar3;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i17 = eVar2.f112052q;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f112052q = i17 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objA = eVar2.f112050n;
        Object objE = uq.b.e();
        int i18 = eVar2.f112052q;
        try {
            if (i18 == 0) {
                oq.u.b(objA);
                ho0.h hVar2 = (ho0.h) this.httpServiceFactory.a(new y.c(str, null, 2, null), ho0.h.class);
                g0 g0Var = this.networkCallMediator;
                f fVar = new f(b0Var, refresh, hVar2, null);
                eVar2.f112041d = vq.j.a(str);
                eVar2.f112042e = vq.j.a(b0Var);
                eVar2.f112043f = vq.j.a(refresh);
                eVar2.f112044g = vq.j.a(hVar2);
                eVar2.f112052q = 1;
                Object objB = g0Var.b(fVar, eVar2);
                if (objB != objE) {
                    hVar = hVar2;
                    objA = objB;
                }
                return objE;
            }
            if (i18 == 1) {
                ho0.h hVar3 = (ho0.h) eVar2.f112044g;
                refresh = (OwTokens.Refresh) eVar2.f112043f;
                b0Var = (b0) eVar2.f112042e;
                String str3 = (String) eVar2.f112041d;
                oq.u.b(objA);
                hVar = hVar3;
                str = str3;
            } else {
                if (i18 == 2) {
                    i16 = eVar2.f112049m;
                    int i19 = eVar2.f112048l;
                    OwTokenDto owTokenDto2 = (OwTokenDto) eVar2.f112046j;
                    iVar = (dx.i) eVar2.f112045h;
                    hVar = (ho0.h) eVar2.f112044g;
                    refresh2 = (OwTokens.Refresh) eVar2.f112043f;
                    b0Var2 = (b0) eVar2.f112042e;
                    str2 = (String) eVar2.f112041d;
                    oq.u.b(objA);
                    i15 = i19;
                    owTokenDto = owTokenDto2;
                    iVar2 = (dx.i) objA;
                    if (iVar2 instanceof dx.i.Left) {
                        return new dx.i.Left((dx.b) ((dx.i.Left) iVar2).b());
                    }
                    if (iVar2 instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    parsedJwt = (ParsedJwt) ((dx.i.Right) iVar2).b();
                    oy.a aVar = this.jwtParser;
                    String refreshToken = owTokenDto.getRefreshToken();
                    mr.c cVarC = q0.c(TokenPayloadDto.class);
                    eVar2.f112041d = vq.j.a(str2);
                    eVar2.f112042e = vq.j.a(b0Var2);
                    eVar2.f112043f = vq.j.a(refresh2);
                    eVar2.f112044g = vq.j.a(hVar);
                    eVar2.f112045h = vq.j.a(iVar);
                    eVar2.f112046j = owTokenDto;
                    eVar2.f112047k = parsedJwt;
                    eVar2.f112048l = i15;
                    eVar2.f112049m = i16;
                    eVar2.f112052q = 3;
                    objA = aVar.a(refreshToken, cVarC, eVar2);
                    if (objA != objE) {
                        parsedJwt2 = parsedJwt;
                    }
                    return objE;
                }
                if (i18 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                parsedJwt2 = (ParsedJwt) eVar2.f112047k;
                owTokenDto = (OwTokenDto) eVar2.f112046j;
                oq.u.b(objA);
            }
            iVar3 = (dx.i) objA;
            if (iVar3 instanceof dx.i.Left) {
                return new dx.i.Left((dx.b) ((dx.i.Left) iVar3).b());
            }
            if (iVar3 instanceof dx.i.Right) {
                throw new oq.p();
            }
            return new dx.i.Right(new OwTokens(new OwTokens.Refresh(owTokenDto.getRefreshToken(), ((TokenPayloadDto) ((ParsedJwt) ((dx.i.Right) iVar3).b()).a()).getExp()), new OwTokens.Access(owTokenDto.getAccessToken(), ((TokenPayloadDto) parsedJwt2.a()).getExp())));
            iVar = (dx.i) objA;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            OwTokenDto owTokenDto3 = (OwTokenDto) ((dx.i.Right) iVar).b();
            oy.a aVar2 = this.jwtParser;
            String accessToken = owTokenDto3.getAccessToken();
            mr.c cVarC2 = q0.c(TokenPayloadDto.class);
            eVar2.f112041d = vq.j.a(str);
            eVar2.f112042e = vq.j.a(b0Var);
            eVar2.f112043f = vq.j.a(refresh);
            eVar2.f112044g = vq.j.a(hVar);
            eVar2.f112045h = vq.j.a(iVar);
            eVar2.f112046j = owTokenDto3;
            i15 = 0;
            eVar2.f112048l = 0;
            eVar2.f112049m = 0;
            eVar2.f112052q = 2;
            Object objA2 = aVar2.a(accessToken, cVarC2, eVar2);
            if (objA2 != objE) {
                str2 = str;
                b0Var2 = b0Var;
                owTokenDto = owTokenDto3;
                objA = objA2;
                i16 = 0;
                refresh2 = refresh;
                iVar2 = (dx.i) objA;
                if (iVar2 instanceof dx.i.Left) {
                    return new dx.i.Left((dx.b) ((dx.i.Left) iVar2).b());
                }
                if (iVar2 instanceof dx.i.Right) {
                    throw new oq.p();
                }
                parsedJwt = (ParsedJwt) ((dx.i.Right) iVar2).b();
                oy.a aVar3 = this.jwtParser;
                String refreshToken2 = owTokenDto.getRefreshToken();
                mr.c cVarC3 = q0.c(TokenPayloadDto.class);
                eVar2.f112041d = vq.j.a(str2);
                eVar2.f112042e = vq.j.a(b0Var2);
                eVar2.f112043f = vq.j.a(refresh2);
                eVar2.f112044g = vq.j.a(hVar);
                eVar2.f112045h = vq.j.a(iVar);
                eVar2.f112046j = owTokenDto;
                eVar2.f112047k = parsedJwt;
                eVar2.f112048l = i15;
                eVar2.f112049m = i16;
                eVar2.f112052q = 3;
                objA = aVar3.a(refreshToken2, cVarC3, eVar2);
                if (objA != objE) {
                    parsedJwt2 = parsedJwt;
                    iVar3 = (dx.i) objA;
                    if (iVar3 instanceof dx.i.Left) {
                        return new dx.i.Left((dx.b) ((dx.i.Left) iVar3).b());
                    }
                    if (iVar3 instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    return new dx.i.Right(new OwTokens(new OwTokens.Refresh(owTokenDto.getRefreshToken(), ((TokenPayloadDto) ((ParsedJwt) ((dx.i.Right) iVar3).b()).a()).getExp()), new OwTokens.Access(owTokenDto.getAccessToken(), ((TokenPayloadDto) parsedJwt2.a()).getExp())));
                }
            }
            return objE;
        } catch (Exception e15) {
            return new dx.i.Left(new dx.b.Parsing(e15));
        }
    }
}
