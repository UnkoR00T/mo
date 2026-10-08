package vi2;

import dx.i;
import er.p;
import fr.k;
import iy.a0;
import iy.b0;
import iy.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import ju.f;
import ju.p0;
import ju.q0;
import k34.DocumentCertsSet;
import oq.g;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.legacy.storage.ContainerManagerNew;
import ry.CertKeyPair;
import vq.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001&B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\fJ#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\b2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00170\bH\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\fJ)\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020!0\b2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0017¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R0\u0010,\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0(j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lvi2/a;", "", "Liy/v;", "pkcs12Manager", "<init>", "(Liy/v;)V", "", "bundleId", "Ldx/i;", "Ldx/b;", "Lk34/h;", "g", "(I)Ldx/i;", "i", "Lcj2/b;", "j", "()Ldx/i;", "containerUserBundleId", "Lbj2/c;", "l", "containerPassBundleId", "Lbj2/b;", "k", "Loq/i0;", "o", "(Ltq/e;)Ljava/lang/Object;", "", "pkcs12Alias", "userContainer", "passContainer", "h", "(Ljava/lang/String;Lbj2/c;Lbj2/b;)Ldx/i;", "m", "Liy/b0;", "n", "(Lbj2/c;Lbj2/b;)Ldx/i;", "f", "()V", "a", "Liy/v;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "b", "Ljava/util/HashMap;", "certificates", "c", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@oq.a
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f206953d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile a f206954e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v pkcs12Manager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final HashMap<Integer, DocumentCertsSet> certificates;

    /* JADX INFO: renamed from: vi2.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lvi2/a$a;", "", "<init>", "()V", "Liy/v;", "pkcs12Manager", "Lvi2/a;", "a", "(Liy/v;)Lvi2/a;", "INSTANCE", "Lvi2/a;", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final a a(v pkcs12Manager) {
            a aVar;
            a aVar2 = a.f206954e;
            if (aVar2 != null) {
                return aVar2;
            }
            synchronized (this) {
                aVar = new a(pkcs12Manager, null);
                a.f206954e = aVar;
            }
            return aVar;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f206957a;

        static {
            int[] iArr = new int[aj2.a.values().length];
            try {
                iArr[aj2.a.STUDENT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[aj2.a.TOZSAMOSC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[aj2.a.REFUGEE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f206957a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lry/c;", "<anonymous>", "(Lju/p0;)Lry/c;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements p<p0, tq.e<? super CertKeyPair>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f206958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f206959f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ex.b<dx.b> f206960g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a f206961h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f206962j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ a0 f206963k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ b0 f206964l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ex.b<? super dx.b> bVar, a aVar, String str, a0 a0Var, b0 b0Var, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f206960g = bVar;
            this.f206961h = aVar;
            this.f206962j = str;
            this.f206963k = a0Var;
            this.f206964l = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ex.b<dx.b> bVar;
            Object objE = uq.b.e();
            int i15 = this.f206959f;
            if (i15 == 0) {
                u.b(obj);
                ex.b<dx.b> bVar2 = this.f206960g;
                v vVar = this.f206961h.pkcs12Manager;
                String str = this.f206962j;
                a0 a0Var = this.f206963k;
                b0 b0Var = this.f206964l;
                this.f206958e = bVar2;
                this.f206959f = 1;
                Object objA = vVar.a(str, a0Var, b0Var, this);
                if (objA == objE) {
                    return objE;
                }
                bVar = bVar2;
                obj = objA;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (ex.b) this.f206958e;
                u.b(obj);
            }
            return bVar.a((i) obj);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super CertKeyPair> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f206960g, this.f206961h, this.f206962j, this.f206963k, this.f206964l, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f206965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f206967f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f206968g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f206969h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f206970j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f206971k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f206972l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f206973m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f206974n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f206976q;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f206974n = obj;
            this.f206976q |= PKIFailureInfo.systemUnavail;
            return a.this.o(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f206977e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f206978f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f206979g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ cj2.b f206980h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ a f206981j;

        /* JADX INFO: renamed from: vi2.a$e$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lk34/h;", "<anonymous>", "(Lju/p0;)Lk34/h;"}, k = 3, mv = {2, 2, 0})
        static final class C5416a extends vq.k implements p<p0, tq.e<? super DocumentCertsSet>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f206982e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f206983f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Integer f206984g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5416a(a aVar, Integer num, tq.e<? super C5416a> eVar) {
                super(2, eVar);
                this.f206983f = aVar;
                this.f206984g = num;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f206982e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                DocumentCertsSet documentCertsSet = (DocumentCertsSet) this.f206983f.g(this.f206984g.intValue()).a();
                if (documentCertsSet == null) {
                    return null;
                }
                a aVar = this.f206983f;
                aVar.certificates.put(this.f206984g, documentCertsSet);
                return documentCertsSet;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super DocumentCertsSet> eVar) {
                return ((C5416a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C5416a(this.f206983f, this.f206984g, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(cj2.b bVar, a aVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f206980h = bVar;
            this.f206981j = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p0 p0Var = (p0) this.f206979g;
            Object objE = uq.b.e();
            int i15 = this.f206978f;
            if (i15 == 0) {
                u.b(obj);
                ArrayList arrayList = new ArrayList();
                ArrayList<Integer> arrayListJ = this.f206980h.j();
                if (arrayListJ != null) {
                    a aVar = this.f206981j;
                    Iterator<T> it = arrayListJ.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ju.k.b(p0Var, null, null, new C5416a(aVar, (Integer) it.next(), null), 3, null));
                    }
                }
                this.f206979g = j.a(p0Var);
                this.f206977e = j.a(arrayList);
                this.f206978f = 1;
                if (f.a(arrayList, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = new e(this.f206980h, this.f206981j, eVar);
            eVar2.f206979g = obj;
            return eVar2;
        }
    }

    public /* synthetic */ a(v vVar, k kVar) {
        this(vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i<dx.b, DocumentCertsSet> g(int bundleId) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    cj2.b bVar = (cj2.b) aVar.a(j());
                    bj2.c cVar = (bj2.c) aVar.a(l(bundleId));
                    bj2.b bVar2 = (bj2.b) aVar.a(k(bundleId));
                    aj2.a aVarI = bVar.k(bundleId).i();
                    return new i.Right((DocumentCertsSet) aVar.a(h((aVarI == null ? -1 : b.f206957a[aVarI.ordinal()]) == 1 ? "mlWork" : "mtWork", cVar, bVar2)));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new oq.p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    private final i<dx.b, Integer> i(int bundleId) {
        Object objB;
        cj2.a aVarQ;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    cj2.b bVar = (cj2.b) new ex.a().a(j());
                    cj2.a aVarK = bVar.k(bundleId);
                    aj2.a aVarI = aVarK.i();
                    int i15 = aVarI == null ? -1 : b.f206957a[aVarI.ordinal()];
                    if (i15 != -1 && i15 != 1 && i15 != 2 && i15 != 3 && (aVarQ = bVar.q(aVarK.i())) != null) {
                        bundleId = aVarQ.b();
                    }
                    return new i.Right(Integer.valueOf(bundleId));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new oq.p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    private final i<dx.b, cj2.b> j() {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    cj2.b bVarR = ContainerManagerNew.u().r();
                    if (bVarR != null) {
                        return new i.Right(bVarR);
                    }
                    aVar.b(new dx.b.Generic(new NullPointerException("CertManager, commonContainer is null")));
                    throw new g();
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final i<dx.b, bj2.b> k(int containerPassBundleId) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    bj2.b bVar = (bj2.b) ContainerManagerNew.u().z(bj2.b.class, containerPassBundleId, pl.gov.coi.mobywatel.feature.legacy.storage.d.PASS);
                    if (bVar != null) {
                        return new i.Right(bVar);
                    }
                    aVar.b(new dx.b.Generic(new NullPointerException("CertManager, containerPass with id:" + containerPassBundleId + " is null")));
                    throw new g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new oq.p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    private final i<dx.b, bj2.c> l(int containerUserBundleId) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    bj2.c cVar = (bj2.c) ContainerManagerNew.u().z(bj2.c.class, containerUserBundleId, pl.gov.coi.mobywatel.feature.legacy.storage.d.USER);
                    if (cVar != null) {
                        return new i.Right(cVar);
                    }
                    aVar.b(new dx.b.Generic(new NullPointerException("CertManager, containerUser with id:" + containerUserBundleId + " is null")));
                    throw new g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new oq.p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public final void f() {
        this.certificates.clear();
    }

    public final i<dx.b, DocumentCertsSet> h(String pkcs12Alias, bj2.c userContainer, bj2.b passContainer) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    byte[] bArr = userContainer.t().get(userContainer.u());
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    CertKeyPair certKeyPair = (CertKeyPair) ju.j.b(null, new c(aVar, this, pkcs12Alias, new a0(bArr), (b0) aVar.a(n(userContainer, passContainer)), null), 1, null);
                    return new i.Right(new DocumentCertsSet(certKeyPair.getCertificate(), certKeyPair.getPrivateKey()));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new oq.p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public i<dx.b, DocumentCertsSet> m(int bundleId) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int iIntValue = ((Number) aVar.a(i(bundleId))).intValue();
                    DocumentCertsSet documentCertsSet = this.certificates.get(Integer.valueOf(iIntValue));
                    if (documentCertsSet == null) {
                        Object objA = aVar.a(g(iIntValue));
                        this.certificates.put(Integer.valueOf(iIntValue), (DocumentCertsSet) objA);
                        documentCertsSet = (DocumentCertsSet) objA;
                    }
                    return new i.Right(documentCertsSet);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA2 = jVarA.a(e15);
                    if (objA2 instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA2).b());
                    } else {
                        if (!(objA2 instanceof i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((i.Right) objA2).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public final i<dx.b, b0> n(bj2.c userContainer, bj2.b passContainer) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String strU = userContainer.u();
                    return new i.Right(new b0((char[]) aVar.a(sh2.a.c().c(sh2.a.d().a(passContainer.f().get(strU)), iy.b.a.f97723a))));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new oq.p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [tq.e, vi2.a$d] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    public final Object o(tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        ?? dVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof d) {
            d dVar2 = (d) eVar;
            int i15 = dVar2.f206976q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar2.f206976q = i15 - PKIFailureInfo.systemUnavail;
                dVar = dVar2;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f206974n;
        Object objE = uq.b.e();
        int i16 = dVar.f206976q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        cj2.b bVar = (cj2.b) aVar.a(j());
                        e eVar2 = new e(bVar, this, null);
                        dVar.f206970j = jVarA;
                        dVar.f206971k = j.a(aVar);
                        dVar.f206972l = j.a(aVar);
                        dVar.f206973m = j.a(bVar);
                        dVar.f206965d = 0;
                        dVar.f206966e = 0;
                        dVar.f206967f = 0;
                        dVar.f206968g = 0;
                        dVar.f206969h = 0;
                        dVar.f206976q = 1;
                        if (q0.e(eVar2, dVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        dVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(dVar));
                        i iVarA = dVar.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new i.Right(i0.f148189a);
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }

    private a(v vVar) {
        this.pkcs12Manager = vVar;
        this.certificates = new HashMap<>();
    }
}
