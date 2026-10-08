package im0;

import al0.BEFileInfo;
import al0.BEGenerateXmlResponse;
import ge4.x;
import gm0.FileV4Dto;
import gm0.GeneratePhysicalIdCardXmlIdentityTheftV4Request;
import gm0.PhysicalIdCardIdentityTheftXmlV4Response;
import gm0.PhysicalIdCardInvalidationInitResponse;
import gm0.PhysicalIdCardInvalidationV3Request;
import gm0.SubmitPhysicalIdCardIdentityTheftV4Request;
import hl0.IdCardInvalidationInitData;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.p0;
import ju.q0;
import oq.i0;
import oq.k;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pq.v;
import vq.j;
import wl0.m;
import wl0.p;
import wl0.q;
import wx.i;
import xl0.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001c0\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJB\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\nH\u0096@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b)\u0010*R\u001b\u0010/\u001a\u00020,8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lim0/d;", "Lqm0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lxl0/l;", "pickedFileToFileV4DtoMapper", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lxl0/l;)V", "", "Lwx/i;", "Lgm0/f2;", "r", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Ldx/i;", "Ldx/b;", "Lhl0/b;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lal0/a;", "accessToken", "Lhl0/a$c;", "data", "Loq/i0;", "b", "(Liy/b0;Lhl0/a$c;Ltq/e;)Ljava/lang/Object;", "Lhl0/a$d;", "Lal0/m;", "c", "(Liy/b0;Lhl0/a$d;Ltq/e;)Ljava/lang/Object;", "Lry/a;", "signedBase64Xml", "Lal0/l;", "files", "d", "(Liy/b0;Lhl0/a$d;Liy/b0;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lxl0/l;", "Lwl0/p;", "Loq/k;", "n", "()Lwl0/p;", "client", "Lwl0/q;", "o", "()Lwl0/q;", "clientV3", "Lwl0/m;", "e", "p", "()Lwl0/m;", "theftClient", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements qm0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l pickedFileToFileV4DtoMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k client;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k clientV3;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k theftClient;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f93297d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f93298e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f93299f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f93301h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f93299f = obj;
            this.f93301h |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/z5;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<PhysicalIdCardIdentityTheftXmlV4Response>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f93302e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f93303f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f93304g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f93305h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ b0 f93307k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ hl0.a.Theft f93308l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b0 b0Var, hl0.a.Theft theft, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f93307k = b0Var;
            this.f93308l = theft;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m mVarP;
            hl0.a.Theft theft;
            String str;
            Object objE = uq.b.e();
            int i15 = this.f93305h;
            if (i15 == 0) {
                u.b(obj);
                mVarP = d.this.p();
                String strE = c0.e(this.f93307k);
                theft = this.f93308l;
                d dVar = d.this;
                List<i> listB = theft.getDescriptionData().b();
                this.f93302e = mVarP;
                this.f93303f = strE;
                this.f93304g = theft;
                this.f93305h = 1;
                Object objR = dVar.r(listB, this);
                if (objR != objE) {
                    str = strE;
                    obj = objR;
                }
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            theft = (hl0.a.Theft) this.f93304g;
            str = (String) this.f93303f;
            mVarP = (m) this.f93302e;
            u.b(obj);
            GeneratePhysicalIdCardXmlIdentityTheftV4Request generatePhysicalIdCardXmlIdentityTheftV4RequestG = cm0.a.g(theft, (List) obj);
            this.f93302e = null;
            this.f93303f = null;
            this.f93304g = null;
            this.f93305h = 2;
            Object objA = mVarP.a(str, generatePhysicalIdCardXmlIdentityTheftV4RequestG, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new b(this.f93307k, this.f93308l, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<PhysicalIdCardIdentityTheftXmlV4Response>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f93309d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f93311f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f93309d = obj;
            this.f93311f |= PKIFailureInfo.systemUnavail;
            return d.this.a(this);
        }
    }

    /* JADX INFO: renamed from: im0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/h6;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C2202d extends vq.k implements er.l<tq.e<? super x<PhysicalIdCardInvalidationInitResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93312e;

        C2202d(tq.e<? super C2202d> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f93312e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            p pVarN = d.this.n();
            this.f93312e = 1;
            Object objA = pVarN.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new C2202d(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<PhysicalIdCardInvalidationInitResponse>> eVar) {
            return ((C2202d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93314e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f93316g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ hl0.a.c f93317h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b0 b0Var, hl0.a.c cVar, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f93316g = b0Var;
            this.f93317h = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f93314e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            q qVarO = d.this.o();
            String strE = c0.e(this.f93316g);
            PhysicalIdCardInvalidationV3Request physicalIdCardInvalidationV3RequestJ = cm0.a.j(this.f93317h);
            this.f93314e = 1;
            Object objA = qVarO.a(strE, physicalIdCardInvalidationV3RequestJ, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new e(this.f93316g, this.f93317h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93318e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f93320g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ hl0.a.Theft f93321h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ b0 f93322j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ List<BEFileInfo> f93323k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(b0 b0Var, hl0.a.Theft theft, b0 b0Var2, List<BEFileInfo> list, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f93320g = b0Var;
            this.f93321h = theft;
            this.f93322j = b0Var2;
            this.f93323k = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f93318e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            m mVarP = d.this.p();
            String strE = c0.e(this.f93320g);
            SubmitPhysicalIdCardIdentityTheftV4Request submitPhysicalIdCardIdentityTheftV4RequestK = cm0.a.k(this.f93321h, this.f93322j, this.f93323k);
            this.f93318e = 1;
            Object objB = mVarP.b(strE, submitPhysicalIdCardIdentityTheftV4RequestK, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new f(this.f93320g, this.f93321h, this.f93322j, this.f93323k, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "Lgm0/f2;", "<anonymous>", "(Lju/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<p0, tq.e<? super List<? extends FileV4Dto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f93325f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<i> f93326g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ d f93327h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lgm0/f2;", "<anonymous>", "(Lju/p0;)Lgm0/f2;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<p0, tq.e<? super FileV4Dto>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f93328e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d f93329f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ i f93330g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, i iVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f93329f = dVar;
                this.f93330g = iVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f93328e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return this.f93329f.pickedFileToFileV4DtoMapper.b(new l.Params(this.f93330g, BEFileInfo.a.Attachment));
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super FileV4Dto> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f93329f, this.f93330g, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(List<? extends i> list, d dVar, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f93326g = list;
            this.f93327h = dVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p0 p0Var = (p0) this.f93325f;
            Object objE = uq.b.e();
            int i15 = this.f93324e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            List<i> list = this.f93326g;
            d dVar = this.f93327h;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ju.k.b(p0Var, null, null, new a(dVar, (i) it.next(), null), 3, null));
            }
            this.f93325f = j.a(p0Var);
            this.f93324e = 1;
            Object objA = ju.f.a(arrayList, this);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super List<FileV4Dto>> eVar) {
            return ((g) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            g gVar = new g(this.f93326g, this.f93327h, eVar);
            gVar.f93325f = obj;
            return gVar;
        }
    }

    public d(final w wVar, g0 g0Var, l lVar) {
        this.networkCallMediator = g0Var;
        this.pickedFileToFileV4DtoMapper = lVar;
        this.client = oq.l.a(new er.a() { // from class: im0.a
            @Override // er.a
            public final Object a() {
                return d.m(wVar);
            }
        });
        this.clientV3 = oq.l.a(new er.a() { // from class: im0.b
            @Override // er.a
            public final Object a() {
                return d.l(wVar);
            }
        });
        this.theftClient = oq.l.a(new er.a() { // from class: im0.c
            @Override // er.a
            public final Object a() {
                return d.q(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q l(w wVar) {
        return (q) w.b(wVar, null, q.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p m(w wVar) {
        return (p) w.b(wVar, null, p.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p n() {
        return (p) this.client.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m p() {
        return (m) this.theftClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m q(w wVar) {
        return (m) w.b(wVar, null, m.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(List<? extends i> list, tq.e<? super List<FileV4Dto>> eVar) {
        return q0.e(new g(list, this, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qm0.a
    public Object a(tq.e<? super dx.i<? extends dx.b, IdCardInvalidationInitData>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f93311f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f93311f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f93309d;
        Object objE = uq.b.e();
        int i16 = cVar.f93311f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C2202d c2202d = new C2202d(null);
            cVar.f93311f = 1;
            objB = g0Var.b(c2202d, cVar);
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
            return new dx.i.Right(cm0.a.f((PhysicalIdCardInvalidationInitResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    @Override // qm0.a
    public Object b(b0 b0Var, hl0.a.c cVar, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new e(b0Var, cVar, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qm0.a
    public Object c(b0 b0Var, hl0.a.Theft theft, tq.e<? super dx.i<? extends dx.b, BEGenerateXmlResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f93301h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f93301h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f93299f;
        Object objE = uq.b.e();
        int i16 = aVar.f93301h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(b0Var, theft, null);
            aVar.f93297d = j.a(b0Var);
            aVar.f93298e = j.a(theft);
            aVar.f93301h = 1;
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
        if (iVar instanceof dx.i.Right) {
            return cm0.a.a((PhysicalIdCardIdentityTheftXmlV4Response) ((dx.i.Right) iVar).b());
        }
        throw new oq.p();
    }

    @Override // qm0.a
    public Object d(b0 b0Var, hl0.a.Theft theft, b0 b0Var2, List<BEFileInfo> list, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new f(b0Var, theft, b0Var2, list, null), eVar);
    }

    public final q o() {
        return (q) this.clientV3.getValue();
    }
}
