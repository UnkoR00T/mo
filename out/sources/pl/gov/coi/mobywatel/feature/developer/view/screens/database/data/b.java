package pl.gov.coi.mobywatel.feature.developer.view.screens.database.data;

import dx.i;
import fr.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import mu.g;
import mu.h;
import n10.EncryptedDataField;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p10.f;
import pq.v;
import uo1.DeveloperSampleEntity;
import vq.j;
import wo1.DeveloperSampleContentA;
import wo1.DeveloperSampleContentB;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0011\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00170\bH\u0086@¢\u0006\u0004\b\u0018\u0010\u000fJ\u0019\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00170\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001e¨\u0006\u001f"}, d2 = {"Lpl/gov/coi/mobywatel/feature/developer/view/screens/database/data/b;", "", "Lp10/f;", "dbProvider", "Ln10/c;", "encryptedDataCoder", "<init>", "(Lp10/f;Ln10/c;)V", "Ldx/i;", "Ldx/b;", "Lpl/gov/coi/mobywatel/feature/developer/view/screens/database/data/DeveloperSecureDatabase;", "b", "()Ldx/i;", "Loq/i0;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lwo1/b;", "content", "d", "(Lwo1/b;Ltq/e;)Ljava/lang/Object;", "Lwo1/c;", "e", "(Lwo1/c;Ltq/e;)Ljava/lang/Object;", "", "c", "Lmu/g;", "", "f", "()Lmu/g;", "Lp10/f;", "Ln10/c;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f dbProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n10.c encryptedDataCoder;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f158655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f158657f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f158658g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158659h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f158660j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f158661k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f158662l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f158663m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f158665p;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158663m = obj;
            this.f158665p |= PKIFailureInfo.systemUnavail;
            return b.this.a(this);
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.feature.developer.view.screens.database.data.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3935b extends vq.d {
        Object A;
        Object B;
        Object C;
        /* synthetic */ Object D;
        int F;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f158666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f158668f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f158669g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158670h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f158671j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f158672k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f158673l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f158674m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f158675n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f158676p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f158677q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f158678r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f158679s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f158680t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f158681v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f158682w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f158683x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Object f158684y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        Object f158685z;

        C3935b(tq.e<? super C3935b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.D = obj;
            this.F |= PKIFailureInfo.systemUnavail;
            return b.this.c(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158686d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158687e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158688f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158689g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f158690h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f158691j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f158692k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f158693l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f158694m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f158695n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f158696p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f158697q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f158698r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f158699s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f158700t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f158701v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f158702w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f158704y;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158702w = obj;
            this.f158704y |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158705d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158706e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158707f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158708g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f158709h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f158710j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f158711k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f158712l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f158713m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f158714n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f158715p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f158716q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f158717r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f158718s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f158719t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f158720v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f158721w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f158723y;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158721w = obj;
            this.f158723y |= PKIFailureInfo.systemUnavail;
            return b.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements g<List<? extends String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f158724a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f158725a;

            /* JADX INFO: renamed from: pl.gov.coi.mobywatel.feature.developer.view.screens.database.data.b$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3936a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f158726d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f158727e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f158728f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f158730h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f158731j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f158732k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f158733l;

                public C3936a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f158726d = obj;
                    this.f158727e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(h hVar) {
                this.f158725a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3936a c3936a;
                if (eVar instanceof C3936a) {
                    c3936a = (C3936a) eVar;
                    int i15 = c3936a.f158727e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3936a.f158727e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3936a = new C3936a(eVar);
                    }
                } else {
                    c3936a = new C3936a(eVar);
                }
                Object obj2 = c3936a.f158726d;
                Object objE = uq.b.e();
                int i16 = c3936a.f158727e;
                if (i16 == 0) {
                    u.b(obj2);
                    h hVar = this.f158725a;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(v.y(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((DeveloperSampleEntity) it.next()).getInternalId());
                    }
                    c3936a.f158728f = j.a(obj);
                    c3936a.f158730h = j.a(c3936a);
                    c3936a.f158731j = j.a(obj);
                    c3936a.f158732k = j.a(hVar);
                    c3936a.f158733l = 0;
                    c3936a.f158727e = 1;
                    if (hVar.F(arrayList, c3936a) == objE) {
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

        public e(g gVar) {
            this.f158724a = gVar;
        }

        @Override // mu.g
        public Object a(h<? super List<? extends String>> hVar, tq.e eVar) {
            Object objA = this.f158724a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public b(f fVar, n10.c cVar) {
        this.dbProvider = fVar;
        this.encryptedDataCoder = cVar;
    }

    private final i<dx.b, DeveloperSecureDatabase> b() {
        return this.dbProvider.b(DeveloperSecureDatabase.class, v.n(), v.n(), DeveloperSecureDatabase.INSTANCE.a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [pl.gov.coi.mobywatel.feature.developer.view.screens.database.data.b$a, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [uo1.b] */
    public final Object a(tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        ?? aVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof a) {
            a aVar2 = (a) eVar;
            int i15 = aVar2.f158665p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.f158665p = i15 - PKIFailureInfo.systemUnavail;
                aVar = aVar2;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f158663m;
        Object objE = uq.b.e();
        int i16 = aVar.f158665p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar3 = new ex.a();
                        ?? A0 = ((DeveloperSecureDatabase) aVar3.a(b())).a0();
                        aVar.f158660j = jVarA;
                        aVar.f158661k = j.a(aVar3);
                        aVar.f158662l = j.a(aVar3);
                        aVar.f158655d = 0;
                        aVar.f158656e = 0;
                        aVar.f158657f = 0;
                        aVar.f158658g = 0;
                        aVar.f158659h = 0;
                        aVar.f158665p = 1;
                        if (A0.d(aVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        aVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(aVar));
                        i iVarA = aVar.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
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
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0130 A[Catch: Exception -> 0x01bc, c -> 0x01c1, CancellationException -> 0x01c5, TRY_LEAVE, TryCatch #6 {c -> 0x01c1, CancellationException -> 0x01c5, Exception -> 0x01bc, blocks: (B:34:0x012a, B:36:0x0130), top: B:79:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:41:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x01a3 -> B:42:0x01a8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(tq.e<? super dx.i<? extends dx.b, ? extends java.util.List<wo1.DeveloperSampleContentB>>> r23) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mobywatel.feature.developer.view.screens.database.data.b.c(tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0186  */
    /* JADX WARN: Code duplicated, block: B:59:0x0197  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public final Object d(DeveloperSampleContentA developerSampleContentA, tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        c cVar;
        String message;
        i iVarA;
        Object objB;
        ex.b aVar;
        uo1.b bVarA0;
        uo1.h hVar;
        int i15;
        dx.j<dx.b> jVar;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        ex.b bVar2;
        DeveloperSampleContentA developerSampleContentA2 = developerSampleContentA;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i25 = cVar.f158704y;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f158704y = i25 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f158702w;
        ?? E = uq.b.e();
        int i26 = cVar.f158704y;
        try {
            try {
                if (i26 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        aVar = new ex.a();
                        bVarA0 = ((DeveloperSecureDatabase) aVar.a(b())).a0();
                        hVar = uo1.h.TYPE_A;
                        n10.c cVar2 = this.encryptedDataCoder;
                        mr.p pVarN = q0.n(DeveloperSampleContentA.class);
                        cVar.f158686d = developerSampleContentA2;
                        cVar.f158687e = jVarA;
                        cVar.f158688f = j.a(aVar);
                        cVar.f158689g = j.a(aVar);
                        cVar.f158690h = hVar;
                        cVar.f158691j = j.a(cVar2);
                        cVar.f158692k = j.a(developerSampleContentA2);
                        cVar.f158693l = j.a(cVar);
                        cVar.f158694m = aVar;
                        cVar.f158695n = bVarA0;
                        i15 = 0;
                        cVar.f158696p = 0;
                        cVar.f158697q = 0;
                        cVar.f158698r = 0;
                        cVar.f158699s = 0;
                        cVar.f158700t = 0;
                        cVar.f158701v = 0;
                        cVar.f158704y = 1;
                        Object objA = cVar2.a(developerSampleContentA2, pVarN, cVar);
                        if (objA != E) {
                            jVar = jVarA;
                            obj = objA;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            bVar = aVar;
                            bVar2 = bVar;
                        }
                        return E;
                    } catch (ex.c e15) {
                        e = e15;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof i.Right) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                }
                if (i26 != 1) {
                    if (i26 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                        return new i.Right(i0.f148189a);
                    } catch (ex.c e18) {
                        e = e18;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                int i27 = cVar.f158700t;
                i16 = cVar.f158699s;
                i18 = cVar.f158698r;
                int i28 = cVar.f158697q;
                i19 = cVar.f158696p;
                bVarA0 = (uo1.b) cVar.f158695n;
                aVar = (ex.b) cVar.f158694m;
                hVar = (uo1.h) cVar.f158690h;
                bVar = (ex.b) cVar.f158689g;
                bVar2 = (ex.b) cVar.f158688f;
                jVar = (dx.j) cVar.f158687e;
                DeveloperSampleContentA developerSampleContentA3 = (DeveloperSampleContentA) cVar.f158686d;
                try {
                    u.b(obj);
                    i15 = i27;
                    developerSampleContentA2 = developerSampleContentA3;
                    i17 = i28;
                } catch (ex.c e25) {
                    e = e25;
                    return new i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e26) {
                    throw e26;
                } catch (Exception e27) {
                    e = e27;
                    E = jVar;
                    px.f fVar2 = px.f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar2.d(message, e, px.c.a(E));
                    iVarA = E.a(e);
                    if (iVarA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                    } else {
                        if (iVarA instanceof i.Right) {
                            throw new p();
                        }
                        objB = ((i.Right) iVarA).b();
                    }
                    return new i.Left(objB);
                }
                DeveloperSampleEntity developerSampleEntity = new DeveloperSampleEntity(0, developerSampleContentA2.getInternalId(), hVar, (EncryptedDataField) aVar.a((i) obj), 1, null);
                cVar.f158686d = j.a(developerSampleContentA2);
                cVar.f158687e = jVar;
                cVar.f158688f = j.a(bVar2);
                cVar.f158689g = j.a(bVar);
                cVar.f158690h = null;
                cVar.f158691j = null;
                cVar.f158692k = null;
                cVar.f158693l = null;
                cVar.f158694m = null;
                cVar.f158695n = null;
                cVar.f158696p = i19;
                cVar.f158697q = i17;
                cVar.f158698r = i18;
                cVar.f158699s = i16;
                cVar.f158700t = i15;
                cVar.f158704y = 2;
                if (bVarA0.a(developerSampleEntity, cVar) != E) {
                    return new i.Right(i0.f148189a);
                }
                return E;
            } catch (CancellationException e28) {
                throw e28;
            }
        } catch (Exception e29) {
            e = e29;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0186  */
    /* JADX WARN: Code duplicated, block: B:59:0x0197  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public final Object e(DeveloperSampleContentB developerSampleContentB, tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        d dVar;
        String message;
        i iVarA;
        Object objB;
        ex.b aVar;
        uo1.b bVarA0;
        uo1.h hVar;
        int i15;
        dx.j<dx.b> jVar;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        ex.b bVar2;
        DeveloperSampleContentB developerSampleContentB2 = developerSampleContentB;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i25 = dVar.f158723y;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f158723y = i25 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f158721w;
        ?? E = uq.b.e();
        int i26 = dVar.f158723y;
        try {
            try {
                if (i26 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        aVar = new ex.a();
                        bVarA0 = ((DeveloperSecureDatabase) aVar.a(b())).a0();
                        hVar = uo1.h.TYPE_B;
                        n10.c cVar = this.encryptedDataCoder;
                        mr.p pVarN = q0.n(DeveloperSampleContentB.class);
                        dVar.f158705d = developerSampleContentB2;
                        dVar.f158706e = jVarA;
                        dVar.f158707f = j.a(aVar);
                        dVar.f158708g = j.a(aVar);
                        dVar.f158709h = hVar;
                        dVar.f158710j = j.a(cVar);
                        dVar.f158711k = j.a(developerSampleContentB2);
                        dVar.f158712l = j.a(dVar);
                        dVar.f158713m = aVar;
                        dVar.f158714n = bVarA0;
                        i15 = 0;
                        dVar.f158715p = 0;
                        dVar.f158716q = 0;
                        dVar.f158717r = 0;
                        dVar.f158718s = 0;
                        dVar.f158719t = 0;
                        dVar.f158720v = 0;
                        dVar.f158723y = 1;
                        Object objA = cVar.a(developerSampleContentB2, pVarN, dVar);
                        if (objA != E) {
                            jVar = jVarA;
                            obj = objA;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            bVar = aVar;
                            bVar2 = bVar;
                        }
                        return E;
                    } catch (ex.c e15) {
                        e = e15;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof i.Right) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                }
                if (i26 != 1) {
                    if (i26 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                        return new i.Right(i0.f148189a);
                    } catch (ex.c e18) {
                        e = e18;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                int i27 = dVar.f158719t;
                i16 = dVar.f158718s;
                i18 = dVar.f158717r;
                int i28 = dVar.f158716q;
                i19 = dVar.f158715p;
                bVarA0 = (uo1.b) dVar.f158714n;
                aVar = (ex.b) dVar.f158713m;
                hVar = (uo1.h) dVar.f158709h;
                bVar = (ex.b) dVar.f158708g;
                bVar2 = (ex.b) dVar.f158707f;
                jVar = (dx.j) dVar.f158706e;
                DeveloperSampleContentB developerSampleContentB3 = (DeveloperSampleContentB) dVar.f158705d;
                try {
                    u.b(obj);
                    i15 = i27;
                    developerSampleContentB2 = developerSampleContentB3;
                    i17 = i28;
                } catch (ex.c e25) {
                    e = e25;
                    return new i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e26) {
                    throw e26;
                } catch (Exception e27) {
                    e = e27;
                    E = jVar;
                    px.f fVar2 = px.f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar2.d(message, e, px.c.a(E));
                    iVarA = E.a(e);
                    if (iVarA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                    } else {
                        if (iVarA instanceof i.Right) {
                            throw new p();
                        }
                        objB = ((i.Right) iVarA).b();
                    }
                    return new i.Left(objB);
                }
                DeveloperSampleEntity developerSampleEntity = new DeveloperSampleEntity(0, developerSampleContentB2.getInternalId(), hVar, (EncryptedDataField) aVar.a((i) obj), 1, null);
                dVar.f158705d = j.a(developerSampleContentB2);
                dVar.f158706e = jVar;
                dVar.f158707f = j.a(bVar2);
                dVar.f158708g = j.a(bVar);
                dVar.f158709h = null;
                dVar.f158710j = null;
                dVar.f158711k = null;
                dVar.f158712l = null;
                dVar.f158713m = null;
                dVar.f158714n = null;
                dVar.f158715p = i19;
                dVar.f158716q = i17;
                dVar.f158717r = i18;
                dVar.f158718s = i16;
                dVar.f158719t = i15;
                dVar.f158723y = 2;
                if (bVarA0.a(developerSampleEntity, dVar) != E) {
                    return new i.Right(i0.f148189a);
                }
                return E;
            } catch (CancellationException e28) {
                throw e28;
            }
        } catch (Exception e29) {
            e = e29;
        }
    }

    public final g<List<String>> f() {
        i<dx.b, DeveloperSecureDatabase> iVarB = b();
        if (iVarB instanceof i.Left) {
            return mu.i.v();
        }
        if (iVarB instanceof i.Right) {
            return new e(((DeveloperSecureDatabase) ((i.Right) iVarB).b()).a0().c());
        }
        throw new p();
    }
}
