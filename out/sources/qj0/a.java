package qj0;

import dx.i;
import er.p;
import fj0.g;
import ju.d2;
import ju.p0;
import ju.q0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.c;
import px.f;
import tq.e;
import vq.d;
import vq.k;
import xi0.ContactDetails;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lqj0/a;", "Lui0/a;", "Lfj0/g;", "getContactDetailsUseCase", "<init>", "(Lfj0/g;)V", "Ldx/i;", "Ldx/b;", "Lxi0/e;", "b", "(Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "a", "Lfj0/g;", "Lsu/a;", "Lsu/a;", "mutex", "", "c", "Z", "isDownloadingDisabled", "Lju/d2;", "d", "Lju/d2;", "downloadJob", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ui0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g getContactDetailsUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final su.a mutex = su.g.b(false, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isDownloadingDisabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private d2 downloadJob;

    /* JADX INFO: renamed from: qj0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4189a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f166720d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166721e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166722f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f166724h;

        C4189a(e<? super C4189a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f166722f = obj;
            this.f166724h |= PKIFailureInfo.systemUnavail;
            return a.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Lxi0/e;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<p0, e<? super i<? extends dx.b, ? extends ContactDetails>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f166725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f166726f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f166727g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f166728h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f166729j;

        /* JADX INFO: renamed from: qj0.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Lxi0/e;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class C4190a extends k implements p<p0, e<? super i<? extends dx.b, ? extends ContactDetails>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f166731e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f166732f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4190a(a aVar, e<? super C4190a> eVar) {
                super(2, eVar);
                this.f166732f = aVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f166731e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    return obj;
                }
                u.b(obj);
                g gVar = this.f166732f.getContactDetailsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f166731e = 1;
                Object objC = gVar.c(c1792a, this);
                return objC == objE ? objE : objC;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, e<? super i<? extends dx.b, ContactDetails>> eVar) {
                return ((C4190a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                return new C4190a(this.f166732f, eVar);
            }
        }

        b(e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(p0 p0Var, Throwable th4) {
            f.f163100a.b("Download job complete. Cause: " + th4, c.a(p0Var));
            return i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
        
            if (r9 == r0) goto L31;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qj0.a.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i<? extends dx.b, ContactDetails>> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            b bVar = a.this.new b(eVar);
            bVar.f166729j = obj;
            return bVar;
        }
    }

    public a(g gVar) {
        this.getContactDetailsUseCase = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ui0.a
    public Object a(e<? super i0> eVar) throws Throwable {
        C4189a c4189a;
        su.a aVar;
        if (eVar instanceof C4189a) {
            c4189a = (C4189a) eVar;
            int i15 = c4189a.f166724h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c4189a.f166724h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c4189a = new C4189a(eVar);
            }
        } else {
            c4189a = new C4189a(eVar);
        }
        Object obj = c4189a.f166722f;
        Object objE = uq.b.e();
        int i16 = c4189a.f166724h;
        if (i16 == 0) {
            u.b(obj);
            su.a aVar2 = this.mutex;
            c4189a.f166720d = aVar2;
            c4189a.f166721e = 0;
            c4189a.f166724h = 1;
            if (aVar2.h(null, c4189a) == objE) {
                return objE;
            }
            aVar = aVar2;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (su.a) c4189a.f166720d;
            u.b(obj);
        }
        try {
            this.isDownloadingDisabled = true;
            d2 d2Var = this.downloadJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
                i0 i0Var = i0.f148189a;
            }
            return i0.f148189a;
        } finally {
            aVar.r(null);
        }
    }

    @Override // ui0.a
    public Object b(e<? super i<? extends dx.b, ContactDetails>> eVar) {
        return q0.e(new b(null), eVar);
    }
}
