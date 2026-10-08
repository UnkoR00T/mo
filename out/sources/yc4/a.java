package yc4;

import dx.i;
import eo0.CentralTokens;
import eo0.UrlData;
import eo0.p;
import go0.c0;
import go0.j;
import go0.k;
import go0.y;
import iy.b0;
import java.time.Instant;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ov3.AddressData;
import ov3.EmptyState;
import ov3.JWSSigningParams;
import ov3.OwTokens;
import ov3.OwnerAddress;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u0016*\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010&\u001a\u00020%*\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010*\u001a\u00020)*\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0013\u0010.\u001a\u00020-*\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0013\u00102\u001a\u000201*\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0013\u00106\u001a\u000205*\u000204H\u0002¢\u0006\u0004\b6\u00107J\u001c\u0010:\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u000f08H\u0096@¢\u0006\u0004\b:\u0010;J$\u0010>\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u0013082\u0006\u0010=\u001a\u00020<H\u0096@¢\u0006\u0004\b>\u0010?J.\u0010C\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u001d082\b\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010B\u001a\u00020\u0017H\u0096@¢\u0006\u0004\bC\u0010DJ.\u0010G\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u001d082\b\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010F\u001a\u00020EH\u0096@¢\u0006\u0004\bG\u0010HJ$\u0010I\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020!082\u0006\u0010B\u001a\u00020\u0017H\u0096@¢\u0006\u0004\bI\u0010JR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010KR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010LR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010MR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010NR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010O¨\u0006P"}, d2 = {"Lyc4/a;", "Lnv3/a;", "Lrp0/a;", "getJWSSigningParamsUC", "Lgo0/j;", "beFetchNativeCentralTokenUC", "Lgo0/k;", "beFetchNativeOwTokenUC", "Lgo0/c0;", "beRefreshNativeOwTokenUC", "Lgo0/y;", "beGetOwnerAddressUC", "<init>", "(Lrp0/a;Lgo0/j;Lgo0/k;Lgo0/c0;Lgo0/y;)V", "Lqp0/a;", "Lov3/f;", "m", "(Lqp0/a;)Lov3/f;", "Leo0/k;", "Lov3/c;", "j", "(Leo0/k;)Lov3/c;", "Leo0/k$a;", "Lov3/c$a;", "i", "(Leo0/k$a;)Lov3/c$a;", "f", "(Lov3/c$a;)Leo0/k$a;", "Leo0/i0;", "Lov3/g;", "n", "(Leo0/i0;)Lov3/g;", "Leo0/j0;", "Lov3/h;", "o", "(Leo0/j0;)Lov3/h;", "Leo0/b;", "Lov3/a;", "g", "(Leo0/b;)Lov3/a;", "Leo0/z;", "Lov3/e;", "l", "(Leo0/z;)Lov3/e;", "Leo0/a1;", "Lov3/i;", "p", "(Leo0/a1;)Lov3/i;", "Leo0/p;", "Lov3/d;", "k", "(Leo0/p;)Lov3/d;", "Leo0/c;", "Lov3/b;", "h", "(Leo0/c;)Lov3/b;", "Ldx/i;", "Ldx/b;", "e", "(Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "mobileIdentityToken", "d", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "", "edorAddress", "centralAccessToken", "a", "(Ljava/lang/String;Lov3/c$a;Ltq/e;)Ljava/lang/Object;", "Lov3/g$c;", "owRefreshToken", "c", "(Ljava/lang/String;Lov3/g$c;Ltq/e;)Ljava/lang/Object;", "b", "(Lov3/c$a;Ltq/e;)Ljava/lang/Object;", "Lrp0/a;", "Lgo0/j;", "Lgo0/k;", "Lgo0/c0;", "Lgo0/y;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements nv3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final rp0.a getJWSSigningParamsUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j beFetchNativeCentralTokenUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k beFetchNativeOwTokenUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c0 beRefreshNativeOwTokenUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final y beGetOwnerAddressUC;

    /* JADX INFO: renamed from: yc4.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C6068a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f226384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f226385b;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.RESERVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.CLOSED_RECOVERABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.CLOSED_UNRECOVERABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.STRUCK_OFF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f226384a = iArr;
            int[] iArr2 = new int[eo0.c.values().length];
            try {
                iArr2[eo0.c.E_PUAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[eo0.c.E_PUAP_AND_E_DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[eo0.c.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f226385b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f226386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f226387e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f226389g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f226387e = obj;
            this.f226389g |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f226390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f226391e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f226392f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f226394h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f226392f = obj;
            this.f226394h |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f226395d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f226397f;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f226395d = obj;
            this.f226397f |= PKIFailureInfo.systemUnavail;
            return a.this.e(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f226398d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f226399e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f226401g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f226399e = obj;
            this.f226401g |= PKIFailureInfo.systemUnavail;
            return a.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f226402d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f226403e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f226404f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f226406h;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f226404f = obj;
            this.f226406h |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, null, this);
        }
    }

    public a(rp0.a aVar, j jVar, k kVar, c0 c0Var, y yVar) {
        this.getJWSSigningParamsUC = aVar;
        this.beFetchNativeCentralTokenUC = jVar;
        this.beFetchNativeOwTokenUC = kVar;
        this.beRefreshNativeOwTokenUC = c0Var;
        this.beGetOwnerAddressUC = yVar;
    }

    private final CentralTokens.Access f(ov3.CentralTokens.Access access) {
        return new CentralTokens.Access(access.getValue(), access.getExpiration().toEpochMilli());
    }

    private final AddressData g(eo0.AddressData addressData) {
        return new AddressData(addressData.getEdorAddress(), addressData.getEpuapId(), k(addressData.getStatus()), h(addressData.getAddressType()));
    }

    private final ov3.b h(eo0.c cVar) {
        int i15 = C6068a.f226385b[cVar.ordinal()];
        if (i15 == 1) {
            return ov3.b.E_PUAP;
        }
        if (i15 == 2) {
            return ov3.b.E_PUAP_AND_E_DELIVERY;
        }
        if (i15 == 3) {
            return ov3.b.UNKNOWN;
        }
        throw new oq.p();
    }

    private final ov3.CentralTokens.Access i(CentralTokens.Access access) {
        return new ov3.CentralTokens.Access(access.getValue(), Instant.ofEpochSecond(access.getExpirationTimeInSeconds()));
    }

    private final ov3.CentralTokens j(CentralTokens centralTokens) {
        return new ov3.CentralTokens(i(centralTokens.getAccess()));
    }

    private final ov3.d k(p pVar) {
        switch (C6068a.f226384a[pVar.ordinal()]) {
            case 1:
                return ov3.d.ACTIVE;
            case 2:
                return ov3.d.RESERVED;
            case 3:
                return ov3.d.UNKNOWN;
            case 4:
                return ov3.d.CLOSED_RECOVERABLE;
            case 5:
                return ov3.d.CLOSED_UNRECOVERABLE;
            case 6:
                return ov3.d.STRUCK_OFF;
            default:
                throw new oq.p();
        }
    }

    private final EmptyState l(eo0.EmptyState emptyState) {
        String title = emptyState.getTitle();
        String body = emptyState.getBody();
        UrlData urlData = emptyState.getUrlData();
        return new EmptyState(title, body, urlData != null ? p(urlData) : null);
    }

    private final JWSSigningParams m(qp0.JWSSigningParams jWSSigningParams) {
        return new JWSSigningParams(jWSSigningParams.getChallenge(), jWSSigningParams.d(), jWSSigningParams.getTokenTtl(), jWSSigningParams.getEncryptionKey(), jWSSigningParams.getEncryptionKeyId(), null);
    }

    private final OwTokens n(eo0.OwTokens owTokens) {
        return new OwTokens(new OwTokens.Refresh(owTokens.getRefresh().getValue(), Instant.ofEpochSecond(owTokens.getRefresh().getExpirationTime())), new OwTokens.Access(owTokens.getAccess().getValue(), Instant.ofEpochSecond(owTokens.getAccess().getExpirationTime())));
    }

    private final OwnerAddress o(eo0.OwnerAddress ownerAddress) {
        eo0.AddressData addressData = ownerAddress.getAddressData();
        AddressData addressDataG = addressData != null ? g(addressData) : null;
        eo0.EmptyState emptyState = ownerAddress.getEmptyState();
        return new OwnerAddress(addressDataG, emptyState != null ? l(emptyState) : null);
    }

    private final ov3.UrlData p(UrlData urlData) {
        return new ov3.UrlData(urlData.getTitle(), urlData.getValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nv3.a
    public Object a(String str, ov3.CentralTokens.Access access, tq.e<? super i<? extends dx.b, OwTokens>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f226394h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f226394h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f226392f;
        Object objE = uq.b.e();
        int i16 = cVar.f226394h;
        if (i16 == 0) {
            u.b(objC);
            k kVar = this.beFetchNativeOwTokenUC;
            k.Params params = new k.Params(str, f(access));
            cVar.f226390d = vq.j.a(str);
            cVar.f226391e = vq.j.a(access);
            cVar.f226394h = 1;
            objC = kVar.c(params, cVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(n((eo0.OwTokens) ((i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nv3.a
    public Object b(ov3.CentralTokens.Access access, tq.e<? super i<? extends dx.b, OwnerAddress>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f226401g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f226401g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objC = eVar2.f226399e;
        Object objE = uq.b.e();
        int i16 = eVar2.f226401g;
        if (i16 == 0) {
            u.b(objC);
            y yVar = this.beGetOwnerAddressUC;
            y.Params params = new y.Params(f(access));
            eVar2.f226398d = vq.j.a(access);
            eVar2.f226401g = 1;
            objC = yVar.c(params, eVar2);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(o((eo0.OwnerAddress) ((i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nv3.a
    public Object c(String str, OwTokens.Refresh refresh, tq.e<? super i<? extends dx.b, OwTokens>> eVar) throws Throwable {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f226406h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f226406h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objC = fVar.f226404f;
        Object objE = uq.b.e();
        int i16 = fVar.f226406h;
        if (i16 == 0) {
            u.b(objC);
            c0 c0Var = this.beRefreshNativeOwTokenUC;
            c0.Params params = new c0.Params(str, new eo0.OwTokens.Refresh(refresh.getValue(), refresh.getExpiration().toEpochMilli()));
            fVar.f226402d = vq.j.a(str);
            fVar.f226403e = vq.j.a(refresh);
            fVar.f226406h = 1;
            objC = c0Var.c(params, fVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(n((eo0.OwTokens) ((i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nv3.a
    public Object d(b0 b0Var, tq.e<? super i<? extends dx.b, ov3.CentralTokens>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f226389g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f226389g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f226387e;
        Object objE = uq.b.e();
        int i16 = bVar.f226389g;
        if (i16 == 0) {
            u.b(objC);
            j jVar = this.beFetchNativeCentralTokenUC;
            j.Params params = new j.Params(b0Var);
            bVar.f226386d = vq.j.a(b0Var);
            bVar.f226389g = 1;
            objC = jVar.c(params, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(j((CentralTokens) ((i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nv3.a
    public Object e(tq.e<? super i<? extends dx.b, JWSSigningParams>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f226397f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f226397f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objC = dVar.f226395d;
        Object objE = uq.b.e();
        int i16 = dVar.f226397f;
        if (i16 == 0) {
            u.b(objC);
            rp0.a aVar = this.getJWSSigningParamsUC;
            rp0.a.Params params = new rp0.a.Params(qp0.b.ELECTRONIC_DELIVERY);
            dVar.f226397f = 1;
            objC = aVar.c(params, dVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(m((qp0.JWSSigningParams) ((i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}
